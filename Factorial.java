import java.util.Scanner;

 class Factorial {
    public static void main(String []args){
    int  fac =1;
    Scanner S1 = new Scanner(System.in);
    int num = S1.nextInt();
    for (int i = num; i>=1; i--){
        fac = fac * i;
    }
    System.out.println(fac);
    }
}
