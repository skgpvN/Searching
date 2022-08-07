package Searching;

import java.util.Scanner;

public class SearchingThreeConsecutaveNUmberInARR {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int arr[] = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//
//        }
        int arr[] = {1, 2, 3, 4, 5, 3, 2, 3, 4, 2, 0, 2, 24, 4, 45, 5, 5, 2, 2, 1, 4, 5, 6};
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] == arr[i - 1] && arr[i] == arr[i + 1]) {
                System.out.println("Yes");
                return;
            }


        }
        System.out.println("No");


    }
}

