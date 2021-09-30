package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,20};
        int []arr2={11,12,15,20,30};
        System.out.println(  BinarySearch(arr2,12));
    }
    public static int BinarySearch(int[] arr , int n ) {
        int min=0;
        int mid;
        int max=arr.length-1;
        while (min<=max){
            mid=(max+min)/2;
            if(n== arr[mid]){
                return mid;
            }else if(n<arr[mid]){
                max=mid-1;
            }else{
                min=mid+1;
            }
        }
        return -1;
    }

    }


