import java.util.*;
 class ATMmachine 
{
    private UserAccount account;
    ATMmachine (UserAccount account)
    {
        this.account=account;
    }
    public void withdraw(double amount)
    {
        if(account.withdraw(amount))
        {
            System.out.println("Withdrawal successful. Please collect your cash.");
        }
        else
        {
            System.out.println("Insufficient funds.");
        }
    }
    public void deposit(double amount) {
        if (account.deposit(amount)) {
          System.out.println("Deposit successful.");
        } else {
          System.out.println("Deposit failed.");
        }
      }
    public void checkBalance() {
        double balance = account.balance();
        System.out.println("Your current balance is: $" + balance);
      }
    }
 class UserAccount
{
   double balance;
   UserAccount(double balance)
   {
    this.balance=balance;
   }
   public boolean withdraw(double amount)
   {
     if(balance>=amount)
     {
        balance-=amount;
        return true;
     }
     else
        return false;
   }
   public boolean deposit(double amount)
   {
    if(amount>0)
    {
        balance+=amount;
        return true;
    }
    else
    {
        return false;
    }
   }
   public double balance()
   {
    return balance;
   }
}
 class ATMmain{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to ATM!!");
        System.out.println("Enter your initial balance:");
        double initialbalance=sc.nextDouble();
        UserAccount account = new UserAccount(initialbalance);
        ATMmachine atm = new ATMmachine(account);
        while (true) {
            System.out.println("\nATM Menu:");
            System.out.println("1. Withdraw Cash");
            System.out.println("2. Deposit Cash");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
      
            switch (choice) {
              case 1:
               System.out.println("Enter amount to withdraw : $");
                double withdrawAmount = sc.nextDouble();
                atm.withdraw(withdrawAmount);
                break;
              case 2:
                System.out.print("Enter amount to deposit: $");
                double depositAmount = sc.nextDouble();
                atm.deposit(depositAmount);
                break;
              case 3:
                atm.checkBalance();
                break;
              case 4:
                System.out.println("Thank you for using the ATM. Goodbye!");
                sc.close();
                return;
              default:
                System.out.println("Invalid choice. Please try again.");
            }
    }
}
}