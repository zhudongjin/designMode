package com.designmode.strategy;

public class MainStrategy {
    // 持有一个具体的策略对象
    private MemberStrategy memberStrategy;

    /**
     * 构造函数，传入一个具体的策略对象
     * @param memberStrategy    具体的策略对象
     */
    public MainStrategy(MemberStrategy memberStrategy){
        this.memberStrategy=memberStrategy;
    }

    public static void main(String[] args) {
        //找个
        MemberStrategy strategy=new AdvancedMemberStrategy();
        MainStrategy main=new MainStrategy(strategy);
        System.out.println(main.memberStrategy.calcPrice(100));
    }
}
