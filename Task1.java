//TASK 1

import java.util.*;
class Task1
{
    public static void main(String args[])
    {
        int num=45;
        int usernum,cnt=0;
        Scanner scanner=new Scanner(System.in);
        do
        {
            System.out.println("Enter a number for guess : (Attempt " + (cnt + 1) + "/3): ");
            usernum=scanner.nextInt();
            cnt++;
            if(usernum==num)
            {     
                System.out.println("Your guess is correct.");
                break;
            }
            else if(usernum>100)
            {
                System.out.println("Entered number is too High.");
            }
            else if(usernum<0)
            {
                System.out.println("Entered number is too Low.");
            }
            else
            {
                System.out.println("Entered number is in Range.");            
            }
            if(cnt==3)
            {
                System.out.println("You've used all attempts! The correct number was "+ num);
                break;
            }
        }while(usernum!=num);
    }
}

    
