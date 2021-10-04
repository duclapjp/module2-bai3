import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        int [] arr1 = new int[2];
        int [] arr2 = new int[2];
        int [] arr3 = new int[arr1.length+ arr2.length];

        Scanner scanner =new Scanner(System.in);
        System.out.println("nhap gia tri cua mang 1");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i]=scanner.nextInt();
            System.out.println("phan tu"+(i+1)+"la:"+arr1[i]);
        }
        System.out.println("nhap gia tri cua mang 2");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i]=scanner.nextInt();
            System.out.println("phan tu"+(i+1)+"la:"+arr2[i]);
        }
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        for (int i = arr1.length; i <arr3.length; i++) {
            arr3[i] = arr2[i- arr1.length];
    }
        for (int number: arr3) {
            System.out.println(number);
        }

    }
}
