package com.designmode.factory;

public class MainFactory {
    public static void main(String[] args) {
        MessageFactory myMessageFactory = new MessageFactoryImpl();
        IMyMessage myMessage;
        // 对于这个消费者来说，不用知道如何生产message这个产品，耦合度降低
        try {
            // 先来一个短信通知
            myMessage = myMessageFactory.createMessage("SMS");
            myMessage.sendMesage();

            // 来一个oa待办
            myMessage = myMessageFactory.createMessage("OA");
            myMessage.sendMesage();

            // 来一个邮件通知
            myMessage = myMessageFactory.createMessage("EMAIL");
            myMessage.sendMesage();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
