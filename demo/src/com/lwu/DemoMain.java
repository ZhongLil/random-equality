package com.lwu;

import java.util.Arrays;

/**
 * @Author LiZ
 * @Date 2023/5/31
 * @Description: TODO
 */
public class DemoMain {
    public static void main(String[] args) {
        Double[][] points = {{1.32121, 3.5831}, {5.222325, 3.8897553}, {3.1113, 5.222345}, {3.1123223, 7.111277}, {5.55523, 9.11159}};
        Double[][] rounds = {{1.58271, 2.2217767, 3.0}, {2.21237, 2.28577, 2.0}, {4.421123, 3.32123, 2.0}, {4.445123, 3.321322, 2.0}};
        RoundSelectPoint roundSelectPoint = new RoundSelectPoint();
        Double[][] results = roundSelectPoint.countPoints(points, rounds);

        System.out.println(Arrays.deepToString(results));
    }
}
