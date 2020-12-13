import java.util.Scanner;

public class checkNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so muon kiem tra: ");
        int number = sc.nextInt();
        if ( number <2)
            System.out.println(number + " khong phai la so nguyen to");
        else {
            int i =2;
            boolean check = true;
            while (i < Math.sqrt(number)){
                if (number % i == 0){
                    check = false;
                    break;
                }
                i++;
            }
            if (check)
                System.out.println(number + " La so nguyen to");
            else
                System.out.println(number + " Khong phai la so nguyen to");


        }
    }
}
