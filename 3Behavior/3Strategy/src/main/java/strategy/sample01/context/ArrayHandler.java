package strategy.sample01.context;

import strategy.sample01.strategy.Sort;

public class ArrayHandler {
    private Sort sortObj;

    public int[] sort(int arr[]) {
        sortObj.sort(arr);
        return arr;
    }

    public void setSortObj(Sort sortObj) {
        this.sortObj = sortObj;
    }
}
