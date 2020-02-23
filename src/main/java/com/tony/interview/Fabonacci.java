package com.tony.interview;

public class Fabonacci {

    /**
     * 方法一:迭代
     */
    public void Print_Fab_n1(int n) {
        int f1, f2, f3;
        f1 = f2 = f3 = 1;
        if (n <= 2)
            System.out.println("第" + n + "个斐波那契数是" + 1);
        int i = 3;
        while (i++ <= n) {
            f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
        }
        System.out.println("第" + n + "个斐波那契数是" + f3);
    }

    /**
     * 方法二:递归
     */
    public int Print_Fab_n2(int m) {
        if (m <= 2)
            return 1;
        return Print_Fab_n2(m - 1) + Print_Fab_n2(m - 2);
    }

}
