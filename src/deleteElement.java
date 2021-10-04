import java.util.Scanner;

public class deleteElement {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5};
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao so muon xoa");
        int num = scanner.nextInt();
        int [] result = DeleE(array,num);
        for (int number: result
             ) {
            System.out.println(number);
        }
    }
    public static int [] DeleE(int [] a,int number){
        int index=-1;
        for (int i = 0; i < a.length; i++) {
            if (a[i]==number){
                index=i;
            }
        }
        if (index!=-1){
            int [] newA = new int [a.length-1];
            for (int i = 0; i < index; i++) {
                newA[i] = a[i];
            }
            for (int i = index+1; i < a.length ; i++) {
                newA[i-1]=a[i];
            }
            return newA;
        }else {
            return a;
        }
    }
}
