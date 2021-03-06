package com.company.baekjoon.queue;
//카드2

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class No2164 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();
        for(int i=1; i<n+1; i++){
            queue.add(i);
        }
        while(queue.size()>1){
            queue.remove();
            queue.add(queue.remove());
        }
        System.out.println(queue.peek());
    }
}
