package BT3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean found = searchNumber();

        if (found) {
            System.out.println("Số đã được tìm thấy tại các vị trí như trên.");
        } else {
            System.out.println("Số không được tìm thấy trong mảng.");
        }
    }

    private static boolean searchNumber() {
        int[][] arr = getArr();
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Dòng " + (i + 1) + ": ");
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        List<Integer> rowIndices = new ArrayList<>();
        List<Integer> colIndices = new ArrayList<>();
        boolean found = false;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhấp số cần tìm:");
        int target = scanner.nextInt();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    rowIndices.add(i);
                    colIndices.add(j);
                    found = true;
                }
            }
        }

        if (found) {
            System.out.println("Số " + target + " được tìm thấy tại các vị trí sau:");
            for (int k = 0; k < rowIndices.size(); k++) {
                System.out.println("Dòng " + (rowIndices.get(k) + 1) + ", Cột " + (colIndices.get(k) + 1));
            }
        }

        return found;
    }
    private static int[][] getArr() {
        int[][] arr = new int[20][20];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 100);
            }
        }
        return arr;
    }
}
