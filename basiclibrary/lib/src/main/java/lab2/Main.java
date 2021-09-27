package lab2;

public class Main {

    public static void main(String[] args) {
        System.out.println("hello world");
        int [] arr=new int[]{1,1,2,4,5,6};
        int[][] arr2 = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57},
        };
        Library lab2 = new Library();
        lab2.roll(10);
        System.out.println(lab2.containsDuplicates(arr));
        System.out.println (lab2.Average(arr));

        System.out.println(lab2.arrayOfArrays(arr2));

    }





    }

