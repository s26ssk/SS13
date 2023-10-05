package BT2;

public class Main {
    public static void main(String[] args) {
        int[] arr = getArr();

        System.out.print("Mảng số nguyên ngẫu nhiên: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Số nhỏ nhất trong mảng: " + min);

    }
    private static int[] getArr(){
        int arr[] = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;

    }
}
