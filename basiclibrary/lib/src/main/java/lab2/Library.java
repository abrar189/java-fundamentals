/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package lab2;

import java.util.ArrayList;

public class Library {

    public static void roll(int n) {
        int[] rolls = new int[n];
        ArrayList<Integer> number = new ArrayList<>();
        for (int i = 0; i < rolls.length; i++) {
            int random = (int) Math.ceil(Math.random() * 6);
            number.add(random);
        }
        System.out.println(number);
    }

    public static boolean containsDuplicates(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return true;
                }
            }
        }
        return false;

    }

    public static double Average(int[] array) {
        double sum = 0;
        for (int value : array) {
            sum += value;
        }
        return (sum / array.length);
    }

    public static double arrayOfArrays(int [][] arr){

        double [] avarges =new double[arr.length];
        double Avg =0;
        for (int i=0;i<arr.length;i++){
            double sum = 0;
            double arrLength=0;
            for (int j =0;j<arr[i].length;j++){
                sum += arr[i][j];
            }
            avarges[i]=sum/arr[i].length;
        }
        Avg=avarges[0];
        for (int i = 1; i < avarges.length; i++) {
            if (avarges[i] < Avg) {
                Avg = avarges[i];
            }
        }
        return Avg;
    }
    public boolean someLibraryMethod() {
        return true;

    }
}