package com.example.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class HelloApplication {

    public static void main(String[] args) {
        Integer[] arr1 = {1, 2, 3, 5, 0, 0, 0};
        Integer m = 4;
        Integer[] arr2 = {2, 4, 8};
        Integer n = 3;
        concatinateArrays(arr1, m, arr2, n);
        System.out.println(Arrays.asList(arr1));
    }

    public static void concatinateArrays(Integer[] arr1, Integer m, Integer[] arr2, Integer n) {

		for (int i = m ; i < arr1.length; i++) {
			arr1[i] = arr2[--n];// 0(n)
		}

		Arrays.sort(arr1); //O(log n)

    }

    /*public static void main(String[] args) {
        SpringApplication.run(HelloApplication.class, args);
    }*/

}
