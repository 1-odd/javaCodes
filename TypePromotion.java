public class TypePromotion {
    public static void main(String args[]){


        /*
        1. it convert short,byte and char values in integer values in a expression. if a int value exist in that expression.

        2. it convert double,float,long in double if single value of double is exist in expression.
         */



         // CONDITION : 1

       //  EXAMPLE 1 :

        //  short a = 10;
        //  char ch = 'a';
        //  byte b = 6;
        //  byte d;
        //  d = a+b*ch; // it is wrong because the expression output is a int value and we can"t store it in byte 
        //  d= (byte)(a+b*ch); // it is a right statement 
        //  System.out.println(d);


        // EXAMPLE 2 :

        // char ch1  = 'b';
        // char ch2 = 'c';
        // char ch3 ;
        // ch3 = ch2-ch1;   //it  is wrong because here ch1 and ch2 are interger and ch3 is char variable and we can't store int value in char variable
        // // System.out.println((int)ch1);
        // // System.out.println((int)ch2);
        // System.out.println((ch2-ch1));

// CONDITION 2 :


        // int a = 10;
        // float b = 14.5f;
        // long c = 23;
        // double d = 4.4;
        // double ans = a+b*c-d;     // right statement
        // System.out.println(ans);
        // // int ans = a+b*c-d;  // it is wrong beacuse answer is in double and we can't assigned in int var or any other datatype





        /*
          question for you which statement is correct 


          STATEMENT 1 :
         
     
       byte b = 5;
       b = b * 2;
       System.out.println(b);



        STATEMENT 2 :


        byte b = 5;
        b = (byte)(b * 2);
        System.out.println(b);




    ANSWER IS : STATEMENT 2    

         */



    } 
    
}
