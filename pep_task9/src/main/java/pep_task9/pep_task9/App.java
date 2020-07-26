package pep_task9.pep_task9;

import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Choose any one option \n1.Average of list \n2.String palindrome\n3.String prefix\n" );
        Scanner sc=new Scanner(System.in);
        int op=sc.nextInt();
        switch(op)
        {
        case 1 : AverageOfList obj1=new AverageOfList();
        			obj1.main1();
        			break;
        case 2 : Palindrome obj2=new Palindrome();
        			obj2.main1();
        			break;
        case 3 : StringFilterPrefix obj3=new StringFilterPrefix();
        			obj3.main1();
        default : System.out.println("Invalid option");
        }
        System.out.println("\n\n***end of program***");
    }
}
