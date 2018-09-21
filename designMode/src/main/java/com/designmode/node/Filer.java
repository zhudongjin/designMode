package com.designmode.node;
/**
 * 实现文件节点
 */
public class Filer extends Node {
    //通过构造器为文件节点命名
    public Filer(String name){
        super(name);
    }
    //显示文件节点
    @Override
    void display() {
        System.out.println(name);
    }
}
