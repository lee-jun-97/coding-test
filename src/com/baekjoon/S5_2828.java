package com.baekjoon;

import java.util.Scanner;

public class S5_2828 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        int n = scan.nextInt();

        int[] arr = new int[n];

        int result = 0;

        for( int i=0; i<n ; i++ ) {
            arr[i] = scan.nextInt();
        }

        scan.close();

        String[] inputArr = input.split(" ");

        int length = Integer.parseInt(inputArr[1]);

        
        if( Integer.parseInt(inputArr[1]) == 1 ) {
            int [] bucket = {1};
            for(int i=0; i<arr.length; i++) {
                int temp = Math.max(bucket[0], arr[i]) - Math.min(bucket[0], arr[i]);
                bucket[0] = arr[i];
                result += temp;
            }
        } else {
            int[] bucket = new int[length];
            for(int i=0; i < length; i++) {
                bucket[i] = i+1;
            }
            for(int i=0; i<arr.length; i++) {
                for(int j=0; j < bucket.length; j++) {
                    if(bucket[j] != arr[i]) {
                        if(bucket[bucket.length-1] < arr[i]) {
                            int temp = arr[i] - bucket[bucket.length-1] ;

                            for(int z=0; z < bucket.length; z++) {
                                bucket[z] = bucket[z] + temp ;
                            }

                            result += temp ;
                        }
                        
                        if(bucket[0] > arr[i]) {
                            int temp = bucket[0] - arr[i] ;

                            for(int z=0; z < bucket.length; z++) {
                                bucket[z] = bucket[z] - temp ;
                            }

                            result += temp;
                        }

                    }
                }
            }
        }
        

        System.out.println(result);

    }
    
}
