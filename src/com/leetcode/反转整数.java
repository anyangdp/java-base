package com.leetcode;

/**
 * @Author anyang
 * @CreateTime 2018/6/7
 * @Des
 */
public class 反转整数 {

    public static Integer ms65(int x) {
        StringBuffer sb = new StringBuffer();
        if (x < 0) {
            x = x * -1;
            sb.append("-");
        }
        int count = 1;
        while (x != 0) {
            int _temp = x % 10;
            if (count == 1 && _temp == 0) {
                x = x / 10;
                continue;
            }
            sb.append(String.valueOf(_temp));
            x = x / 10;
            count++;
        }
        try {
            return  Integer.parseInt(sb.toString());
        } catch (Exception e) {
            return 0;
        }
    }

    public static Integer ms27(int x) {
        boolean negative = x < 0;
        long r = 0;
        if (negative) {
            x = -x;
        }
        while(x > 0) {
            r = r * 10 + x % 10;
            x /= 10;
        }
        if (negative) {
            r = -r;
        }
        if (r > Integer.MAX_VALUE || r < Integer.MIN_VALUE) {
            return 0;
        }
        return Integer.parseInt(Long.toString(r));
    }


    public static void main(String[] args) {
        System.out.println(ms65(123));
        System.out.println(ms27(123));

    }
}
