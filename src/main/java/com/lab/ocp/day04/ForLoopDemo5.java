package com.lab.ocp.day04;

import java.util.Arrays;
import java.util.IntSummaryStatistics;

public class ForLoopDemo5 {
    public static void main(String[] args) {
        // 一年甲班學生國文與數學的成績
        int[][] exams = {{100, 90}, {70, 80}, {40, 100}, {100, 100}, {80, 50}};
        IntSummaryStatistics stat = Arrays.stream(exams)
                        .mapToInt(exam -> exam[0])
                        .summaryStatistics();
        System.out.printf("國文平均: %.1f\n", stat.getAverage());
    }
}
