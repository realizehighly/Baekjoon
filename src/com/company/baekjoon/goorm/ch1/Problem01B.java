package com.company.baekjoon.goorm.ch1;
import java.io.*;
import java.lang.*;
import java.util.*;
//원소의 합
public class Problem01B {
    public static final Scanner scanner = new Scanner(System.in);

    /**
     * 정수 배열의 모든 원소의 합을 계산하는 함수
     *
     * @param data
     * @param n
     * @return data[0] ~ data[n-1]의 합
     */
    public static int getSum(int[] data, int n) {
        int answer = 0;
        for(int i=0; i<n; i++){
            answer += data[i];
        }

        return answer;
    }

    public static void main(String[] args) throws Exception {
        int n = scanner.nextInt();
        int[] data = new int[n];
        for (int i = 0; i < n; i++) {
            data[i] = scanner.nextInt();
        }
        int answer = getSum(data, n);
        System.out.println(answer);
    }
}
