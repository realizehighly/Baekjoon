package com.company.baekjoon.stepbystep.step1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No10998 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        System.out.println(Integer.parseInt(input[0])*Integer.parseInt(input[1]));
    }
}
