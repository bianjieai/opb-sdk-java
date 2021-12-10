package irita.sdk.module.wasm;


import proto.cosmwasm.wasm.v1.QueryOuterClass;
import proto.cosmwasm.wasm.v1.Types;

public class Convert {
    public static ContractInfo toContractInfo(QueryOuterClass.QueryContractInfoResponse resp) {
        ContractInfo contractInfo = new ContractInfo();
        contractInfo.setCodeId(resp.getContractInfo().getCodeId());
        contractInfo.setCreator(resp.getContractInfo().getCreator());
        contractInfo.setAdmin(resp.getContractInfo().getAdmin());
        contractInfo.setLabel(resp.getContractInfo().getLabel());

        Types.AbsoluteTxPosition absoluteTxPosition = resp.getContractInfo().getCreated();
        ContractInfo.AbsoluteTxPosition created = new ContractInfo.AbsoluteTxPosition();

        created.BlockHeight = absoluteTxPosition.getBlockHeight();
        created.TxIndex = absoluteTxPosition.getTxIndex();
        contractInfo.setCreated(created);
        return contractInfo;
    }
}
