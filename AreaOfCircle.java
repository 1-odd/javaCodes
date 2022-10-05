import java.util.*;

public class AreaOfCircle {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
       
        System.out.println("ENter the radius : ");
        float r = sc.nextFloat();

        float area = 3.14f * r * r;
        // we use f beacuse java consider 3.14 value as double value so we used f and tell the java compiler that it is a float value.

        System.out.println(" The area of circle is : " +area);




           







    }
    
}
