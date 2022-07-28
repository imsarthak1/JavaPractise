import java.util.Scanner;

class CheckNumber{
    public static void main(String[] args){
        int num;
        Scanner Sc = new Scanner(System.in);
        num = Sc.nextInt();
        if(num==0){
            System.out.print("Number is Zero");
        }else if(num>0){
            System.out.print("Number is positive");
        }else{
            System.out.print("Number is negative");
        }
    }
}
