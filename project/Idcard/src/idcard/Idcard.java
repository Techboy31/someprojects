
package idcard;
import java.util.Scanner;
public class Idcard {

   String name;
   int age;
   String bloodgroup;
   
    public static void main(String[] args)
    {
    Scanner obj=new Scanner(System.in);
    System.out.println("enter your name");
    String name=obj.nextLine(); 
    System.out.println("enter your age");
    int age=obj.nextInt();
    System.out.println("enter your Blood group");
    String bloodgroup=obj.next();
    System.out.println("\n");
     
    System.out.println("Name: "+name );
    System.out.println("age: " +age );
 
    System.out.println("Bloodgroup: " + bloodgroup );
   System.out.println("=======================================");
    if(age>=20)
    {
 System.out.println("your group is  RED " ); 
    }
    else if(age>=15 && age<20)
            {        
      System.out.println("your age group is BLUE ")   ;        
              }
    
    else if(age>=10&&age<15)
    {
      System.out.println("your age group is YELLOW ")   ;     
    }
    
    
    System.out.println("======================================="); 
}}
