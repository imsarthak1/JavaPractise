import java.util.Scanner;
public class DivisibleOrNot {
    public static void main(String []args){
        int num;
        Scanner N = new Scanner(System.in);
        num = N.nextInt();
        System.out.println("You have Entered "+num);
        DivisibleOrNot B = new DivisibleOrNot();
        B.check(num);
        }
    void check(int A){
        if ((A%5==0)&&(A%11==0))  {
            System.out.println("Given number "+A+" is divisible by 5 and 11. ");
        }else{
            System.out.println("Given number "+A+" is not divisible bye 5 and 11.");
        }
    }

}
