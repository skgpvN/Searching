package Searching;

import java.util.Scanner;

public class BuildingRoof {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();

        }
        int count=1;
        int max=arr[0];
        for (int i = 0; i <n; i++) {
            if(max<arr[i]){
                count++;
                max=arr[i];
            }


        }
        System.out.println(count);


    }
}
