import java.util.Scanner;
// sum of two more than two numbers

public class sum{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);


        float a,b,sum;
        System.out.println("enter the value of a : ");
        a =  sc.nextFloat();
        System.out.println("enter the value of b : ");
        b = sc.nextFloat();

        sum = a+b;
        System.out.println("The sum of enter numbers is : " +sum);



        

    }

}