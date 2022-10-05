import java.util.*;      // it is a package of java that is used to take inputs from the  the user

public class InputsInJava {
    public static void main(String args[]){

        //  here we teach how to take inputs in diffrent situations and for diff. data types

        Scanner sc = new Scanner(System.in);  // method of Scanner class

        //   1.    -----------------> Input for Int values <-------------------


        System.out.println("enter the value");
        int input = sc.nextInt(); // here input is a var. that take input from sc.next  classs
        // next() class grab the input from the user and put into assigned variable



        //  2.  ------------------> Input for string <----------------------


        // there is two things that you have to understand 
          // (A) ---> When you want to take single word as input
          // (B) ----> when you have to take whole line include space as input


          System.out.println("enter the name ");
          String name  = sc.next(); // for one word without any space 
          System.out.println(name);

         // String name = sc.nextLine(); // whole line include all space





         // 3. ------------> Input for Float <------------------

         System.out.println("enter the values");
         float a = sc.nextFloat();
         System.out.println(a);




// =============> we can take input from the user using the datatype name and * package and scaner class of java






    }
    
}
