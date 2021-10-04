import java.util.Scanner;

public class DemSinhVien {
    public static void main(String[] args) {
        int [] arr;
        int size;
        Scanner scanner =new Scanner(System.in);
        do {
            System.out.println("nhập vào số lượng sinh viên");
                size = scanner.nextInt();
               if (size>10){
                System.out.println("không được vượt quá 10 người");
            }
        }while (size>10);
        System.out.println("nhập vào điểm của sinh viên");
        arr = new int[size];
        int count = 0;
        for (int i=0;i<size;i++){
            arr[i]=scanner.nextInt();
            if (arr[i]>=5&&arr[i]<=10){
                count++;
            }
        }
        System.out.println("số sinh viên thi đỗ là:"+count);
    }
}
