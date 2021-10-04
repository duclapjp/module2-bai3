import java.util.Scanner;

public class MinArray {
    public static void main(String[] args) {
        int [] arr = new int[5];
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập giá trị các phần tử trong mảng");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=scanner.nextInt();
            System.out.println("phần tử"+(i+1)+"là:"+arr[i]);
        }
        int min =arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println("phần tử nhỏ nhất mảng là"+min);
    }
}
