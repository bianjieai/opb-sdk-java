package irita.sdk.module.community_gov;

import io.grpc.StatusRuntimeException;
import irita.sdk.constant.ContractAddress;
import irita.sdk.constant.ContractArg;
import irita.sdk.constant.ContractMethod;
import irita.sdk.constant.enums.DocType;
import irita.sdk.constant.enums.Role;
import irita.sdk.exception.ContractException;
import irita.sdk.exception.IritaSDKException;
import irita.sdk.model.BaseTx;
import irita.sdk.model.ResultTx;
import irita.sdk.module.wasm.ContractABI;
import irita.sdk.module.wasm.WasmClient;
import org.apache.commons.lang3.StringUtils;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class CommunityGovClient {
    private final WasmClient wasmClient;

    public CommunityGovClient(WasmClient wasmClient) {
        this.wasmClient = wasmClient;
    }

    /**
     * 添加一个部门
     *
     * @param departmentName 部门名称
     * @param publicKey      证书所对应的公钥（当前版本在链上存储时是直接存储，认为公钥就是地址）
     */
    public void addDepartment(String departmentName, String publicKey, BaseTx baseTx) throws ContractException {
        if (StringUtils.isEmpty(departmentName) || StringUtils.isEmpty(publicKey)) {
            throw new NullPointerException("departmentName or publicKey is null");
        }

        Map<String, Object> args = new HashMap<>();
        args.put(ContractArg.DEPARTMENT_NAME, departmentName);
        args.put(ContractArg.PUBLIC_KEY, publicKey);

        ContractABI abi = new ContractABI();
        abi.setMethod(ContractMethod.ADD_DEPARTMENT);
        abi.setArgs(args);

        try {
            wasmClient.execute(ContractAddress.DEFAULT, abi, null, baseTx);
        } catch (IritaSDKException | IOException e) {
            throw new ContractException(e.getMessage());
        }
    }

    /**
     * 更新部门的身份信息（相当于群主转让）
     *
     * @param publicKey 对方的公钥（当前版本和地址一样）
     */
    public void updateDepartment(String publicKey, BaseTx baseTx) throws ContractException {
        if (StringUtils.isEmpty(publicKey)) {
            throw new NullPointerException("publicKey is null");
        }

        Map<String, Object> args = new HashMap<>();
        args.put(ContractArg.PUBLIC_KEY, publicKey);

        ContractABI abi = new ContractABI();
        abi.setMethod(ContractMethod.UPDATE_DEPARTMENT);
        abi.setArgs(args);

        try {
            wasmClient.execute(ContractAddress.DEFAULT, abi, null, baseTx);
        } catch (IritaSDKException | IOException e) {
            throw new ContractException(e.getMessage());
        }
    }

    /**
     * 向部门添加一个 成员
     *
     * @param address 成员管理员的地址
     * @param role    成员的角色
     */
    public void addMember(String address, Role role, BaseTx baseTx) throws ContractException {
        if (StringUtils.isEmpty(address) || role == null) {
            throw new NullPointerException("address or role is null");
        }

        Map<String, Object> args = new HashMap<>();
        args.put(ContractArg.ADDRESS, address);
        args.put(ContractArg.ROLE, role.getValue());

        ContractABI abi = new ContractABI();
        abi.setMethod(ContractMethod.ADD_MEMBER);
        abi.setArgs(args);

        try {
            wasmClient.execute(ContractAddress.DEFAULT, abi, null, baseTx);
        } catch (IritaSDKException | IOException e) {
            throw new ContractException(e.getMessage());
        }
    }

    /**
     * 删除一个成员
     *
     * @param address 要删除的地址
     */
    public void removeMember(String address, BaseTx baseTx) throws ContractException {
        if (StringUtils.isEmpty(address)) {
            throw new NullPointerException("address is null");
        }

        Map<String, Object> args = new HashMap<>();
        args.put(ContractArg.ADDRESS, address);

        ContractABI abi = new ContractABI();
        abi.setMethod(ContractMethod.REMOVE_MEMBER);
        abi.setArgs(args);

        try {
            wasmClient.execute(ContractAddress.DEFAULT, abi, null, baseTx);
        } catch (IritaSDKException | IOException e) {
            throw new ContractException(e.getMessage());
        }
    }

    /**
     * Hash创建（根据证照类型及唯一性ID, 判断本地是否已存在相应的票面信息Hash及证照文件Hash, 如存在，则将链上所有此证照的历史Hash变为删除态）
     *
     * @param docType  证照类型, 必填
     * @param docId    证照唯一性Id, 必填
     * @param strHash  文件hash, 当file_hash为空时必填
     * @param fileHash 字符hash, 当str_hash为空时必填
     */
    public ResultTx addHash(DocType docType, String docId, String strHash, String fileHash, BaseTx baseTx) throws IOException {
        if (!addHashParamExist(docId, strHash, fileHash)) {
            throw new NullPointerException("param is not correct");
        }

        Map<String, Object> args = new HashMap<>();
        args.put(ContractArg.DOC_TYPE, docType.getCode());
        args.put(ContractArg.DOC_ID, docId);
        args.put(ContractArg.STR_HASH, strHash);
        args.put(ContractArg.FILE_HASH, fileHash);

        ContractABI abi = new ContractABI();
        abi.setMethod(ContractMethod.ADD_HASH);
        abi.setArgs(args);

        return wasmClient.execute(ContractAddress.DEFAULT, abi, null, baseTx);
    }

    private boolean addHashParamExist(String docId, String strHash, String fileHash) {
        return StringUtils.isNotEmpty(docId) && StringUtils.isNotEmpty(strHash) && StringUtils.isNotEmpty(fileHash);
    }

    /**
     * 根据strHash或者fileHash查找 hash是否存在
     *
     * @param hash 文件hash/字符hash
     */
    public boolean getHash(String hash) throws ContractException {
        if (StringUtils.isEmpty(hash)) {
            throw new RuntimeException("hash is null");
        }

        ContractABI abi = new ContractABI();
        abi.setMethod(ContractMethod.GET_HASH);
        Map<String, Object> args = new HashMap<>();
        args.put(ContractArg.HASH, hash);
        abi.setArgs(args);

        try {
            byte[] bytes = wasmClient.queryContract(ContractAddress.DEFAULT, abi);
            if (bytes.length > 0) {
                return true;
            }
        } catch (StatusRuntimeException e) {
            if (e.getMessage().contains("not found")) {
                return false;
            }

            throw new ContractException(e.getMessage());
        }
        return false;
    }
}
