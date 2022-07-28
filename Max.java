import java.util.Scanner;

public class Max {
    public static void main(String[] args){
        int n1,n2,n3;
        Scanner S1= new Scanner(System.in);
        n1 = S1.nextInt();
        n2 = S1.nextInt();
        n3 = S1.nextInt();
        System.out.println("The Numbers are : "+n1+" "+n2+ " "+n3);
        Max M = new Max();
        M.MaxNum(n1, n2, n3);
    }
    void MaxNum(int a,int b,int c){
        if (a>b) {
            if(a>c){
                System.out.println("the maximum no is : "+a);
            }else {
                System.out.println("The maximum no is : "+c);
            }
        }else if(b>c){
            System.out.println("The maximum no is : "+b);
        }else{
            System.out.println("The maximum no is : "+c);
        }
    }
}
