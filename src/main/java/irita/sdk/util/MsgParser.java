package irita.sdk.util;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageV3;
import irita.sdk.constant.enums.MsgEnum;
import irita.sdk.exception.IritaSDKException;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MsgParser {
    public static GeneratedMessageV3 unpackMsg(String typeUrl, ByteString value) {
        try {
            if (StringUtils.isEmpty(typeUrl) || value.isEmpty()) {
                throw new IritaSDKException("message can not be empty");
            }
            typeUrl = typeUrl.replace("/", "");
            Class<?> clazz = MsgEnum.getClassName(typeUrl);
            Method method = clazz.getMethod("parseFrom", ByteString.class);
            return (GeneratedMessageV3) method.invoke(clazz, value);
        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
            throw new IritaSDKException(e.getMessage());
        }
    }
}
