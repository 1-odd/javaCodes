public class TypeConversion {
    public static void main(String args[]){

 /*
  it  covert the one datatype to another datatype. it is also known as widening or implicit type conversion. 

  it happens when : 
  1. Datatypes are compitable 

       EXAMPLE : 
         int ----> float   ( right )
         int -----> Boolean ( wrong )

   2. destination datatype size > source datatype size
       
        EXAMPLE : 
          float > int   ( right )
          size of float and int datatypes is same but float consider as bigger then int .
          
NOTE  : It will show a error sometimes it is known as LOSSY CONVERSION 
    It happens when : 
         destination datatype size < source size 
          EXAMPLE : 
            long a = 10;
            int b = a;

            Here, you can see long datatype is source datatype and int is destination datatype
            and size of int is 4 bit and size of long is 8 bit.


  */
          
//    EXAMPLE 1 : Valid coverson

           int a = 10;
           long b = a;
           System.out.println(b);


// EXAMPLE 2 : NON valid conversion 

          float d = 17;
          int e = d;
          System.out.println(e);

       //   it is example of LOSSY conversion


/* 
 ALL possible conversion is given below

byte ---> short ----> int -----> float ------> long -----> double









*/




         






 



    }
    
}
