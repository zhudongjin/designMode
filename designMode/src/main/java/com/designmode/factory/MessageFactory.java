package com.designmode.factory;

/**
 * 工厂方法模式_工厂接口
 *
 * @author gold
 *
 */
public interface MessageFactory {
    public IMyMessage createMessage(String messageType);
}
