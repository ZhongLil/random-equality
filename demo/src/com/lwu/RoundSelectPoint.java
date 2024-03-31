package com.lwu;

/**
 * @Author LiZ
 * @Date 2023/5/31
 * @Description: TODO
 */
public class RoundSelectPoint {
    public Double[][] countPoints(Double[][] points, Double[][] rounds) {
        int m = points.length;
        int n = rounds.length;
        int num = 0;
        Double[][] result = new Double[m][2];
        for (int i = 0; i < n; ++i) {
            Double cx = rounds[i][0];
            Double cy = rounds[i][1];
            Double cr = rounds[i][2];
            for (int j = 0; j < m; ++j) {
                Double px = points[j][0], py = points[j][1];
                if ((cx - px) * (cx - px) + (cy - py) * (cy - py) <= cr * cr) {
                    result[num][0] = points[j][0];
                    result[num][1] = points[j][1];
                    num++;

                }
            }
        }
        return result;

    }
}
