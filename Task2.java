//TASK 2

import java.util.*;
public class Task2
{
    public static void main(String args[])
    {
        int sub,sum=0,avg;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number of subjects : ");
        sub=scanner.nextInt();
        int[] arr=new int[sub];
        System.out.println("Enter marks of students : ");
        for(int i=0;i<sub;i++)
        {
            arr[i]=scanner.nextInt();
        }
        for(int i=0;i<sub;i++)
        {
            sum=sum+arr[i];
        }
        avg=(sum/sub);
        System.out.print("Student's total marks : ");
        System.out.println(sum);
        System.out.print("Student's average percentage : ");
        System.out.println(avg);
        if(avg>85 && avg<100)
            System.out.println("Student has grade 'A'");
        else if(avg>70 && avg<90)
            System.out.println("Student has grade 'B'");
        else
            System.out.println("Student has grade 'C'");  
         
    }
}