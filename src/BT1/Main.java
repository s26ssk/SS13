package BT1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = getArr();

        System.out.print("Mảng số nguyên ngẫu nhiên: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // In ra số lớn nhất
        System.out.println("Số lớn nhất trong mảng: " + max);

    }
    private static int[] getArr(){
        int arr[] = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;

    }
}
