package BT4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {12, 45, 23, 67, 89, 34, 56, 78, 90, 54};

        System.out.print("Nhập số cần tìm: ");
        int target = scanner.nextInt();

        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("Số " + target + " được tìm thấy tại vị trí " + i);
                found = true;
            }
        }

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Số lớn nhất trong mảng là: " + max);

        if (!found) {
            System.out.println("Không tìm thấy số " + target + " trong mảng.");
        }
    }
}
