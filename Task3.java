//TASK 3

import java.util.*;
class atm
{
    int balance;
    public atm()
    {
        System.out.println("Enter the balance of the account : ");
        Scanner scanner=new Scanner(System.in);
        balance=scanner.nextInt();
        scanner.close();
    }
    void withdraw(int amount)
    {
        if(balance>=amount)
        {
            balance=balance-amount;
            System.out.println("Withdraw Successfull.");
        }
        else
        {
            System.out.println("You can't withdraw money.");
        }
    }
    void deposit(int amount)
    {
        balance=balance+amount;
        System.out.println("Deposit Successfull.");
    }
    void checkbalance()
    {
        System.out.println("Total Balance : "+ balance);
    }
}
class account extends atm
{
    public account()
    {
        super();
        System.out.println("user's Account Balance : "+ balance);
    }
}
class Task3
{
    public static void main(String args[])
    {
        account acc=new account();
        acc.withdraw(2000);
        acc.deposit(3000);
        acc.checkbalance();
    }
}
