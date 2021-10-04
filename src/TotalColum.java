import java.util.Scanner;

public class TotalColum {
    public static void main(String[] args) {
        int [] [] array ={
                {1,2,3,4},
                {5,6,7,8,},
                {9,10,11,12}
        };
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số cột muốn tính tổng");
        int index = scanner.nextInt();
        int total =0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length ; j++) {
                    if (index == j){
                        total+=array[i][j];
                    }
            }
        }
        System.out.println("tổng ở cột"+index+"là:"+total);
    }
}
