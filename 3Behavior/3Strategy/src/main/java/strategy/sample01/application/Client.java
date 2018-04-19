package strategy.sample01.application;

import strategy.sample01.context.ArrayHandler;
import strategy.sample01.strategy.Sort;
import strategy.sample01.util.XMLUtil;

public class Client {
    public static void main(String args[]) {
        ArrayHandler ah = new ArrayHandler();
        ah.setSortObj((Sort) XMLUtil.getBean()); // 设置具体策略
        int arr[] = {1, 4, 6, 2, 5, 3, 7, 10, 9};
        
        int result[] = ah.sort(arr);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + ",");
        }
    }
}
