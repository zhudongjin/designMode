package com.designmode.factory;

import java.util.HashMap;
import java.util.Map;

public class MessageFactoryImpl implements MessageFactory {

    @Override
    public IMyMessage createMessage(String messageType) {
        IMyMessage message;
        Map<String, Object> messageParam = new HashMap<String, Object>();
        // 根据某些条件去选择究竟创建哪一个具体的实现对象，条件可以传入的，也可以从其它途径获取。
        // sms
        if ("SMS".equals(messageType)) {
            message = new MyMessageSms();
            messageParam.put("PHONENUM", "123456789");
            message.setMessageParam(messageParam);
        } else
            // OA待办
            if ("OA".equals(messageType)) {
                message = new MyMessageOaTodo();
                messageParam.put("OAUSERNAME", "testUser");
                message.setMessageParam(messageParam);
            } else {
                // email
                if ("EMAIL".equals(messageType)) {
                    message = new MyMessageEmail();
                    messageParam.put("EMAIL", "test@test.com");
                    message.setMessageParam(messageParam);
                } else
                // 默认生产email这个产品
                {
                    message = new MyMessageEmail();
                    messageParam.put("EMAIL", "test@test.com");
                    message.setMessageParam(messageParam);
                }
            }
        return message;
    }
}
