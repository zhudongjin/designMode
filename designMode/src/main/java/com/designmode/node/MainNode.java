package com.designmode.node;

import java.io.File;

public class MainNode {
    public static void createTree(Node node) throws Exception {
        File file = new File(node.name);
        File [] f = file.listFiles();
        for (File fi:f){
            if(fi.isFile()){
                Filer filer = new Filer(fi.getAbsolutePath());
                node.addNode(filer);
            }
            if(fi.isDirectory()){
                Noder noder = new Noder(fi.getAbsolutePath());
                node.addNode(noder);
                createTree(node);
            }
        }
    }

    public static void main(String[] args) {
        Node noder = new Noder("D://a");
        try{
            createTree(noder);
        }catch (Exception e){
            e.printStackTrace();
        }
        noder.display();
    }
}
