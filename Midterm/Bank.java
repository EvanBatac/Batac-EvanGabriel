import java.util.Scanner;
public class Bank{
   public static void main(String[] args){
      Scanner scan = new Scanner(System.in);
      
      BankAccount bank = new BankAccount();
      System.out.println("----------BANK ACCOUNT----------");
      System.out.println("Account Number: " + bank.getAccountNumber());
      System.out.println("Account Name: " + bank.getAccountName());
      
      int ch;
      do{
         System.out.println("1. Deposit");
         System.out.println("2. Withdraw");
         System.out.println("3. Display Balance");
         System.out.println("4. Exit");
      
         System.out.print("Enter your Choice: ");
         ch = scan.nextInt();
      
         switch(ch){
            case 1: 
               bank.deposit();
               break;
         
            case 2: 
               bank.withdraw();
               break;
            
            case 3: 
               bank.displayBalance();
               break;
            
            case 4:
               System.out.println("Thank you! Transaction Finished!");
               break;
         }
         
       }
       while(ch != 4);  

      
   }
}
class BankAccount{
   Scanner scan = new Scanner(System.in);

   private int accountNumber;
   private String accountName;
   private double balance;
   
   BankAccount(){
      accountNumber = 22640387;
      accountName = "Evan Batac";
      balance = 0.0;
   }
   public int getAccountNumber(){
      return accountNumber;
   }
   public String getAccountName(){
      return accountName;
   }
   public double getBalance(){
      return balance;
   }
   public void setAccountNumber(int accountNumber){
      this.accountNumber = accountNumber;
   }
   public void setAccountName(String accountName){
      this.accountName = accountName;
   }
   public void setBalance(double balance){
      this.balance = balance;
   }
   public void deposit(){
      System.out.print("Enter amount to deposit: ");
      double deposit = scan.nextDouble();
      balance += deposit;
   }
   public void withdraw(){
      System.out.print("Enter amount to withdraw: ");
      double withdraw = scan.nextDouble();
      
      if(withdraw > balance){
         System.out.println("You don't have Enough Balance in your Account.");
      }
      else{
         balance -= withdraw;
      }
   }
   public void displayBalance(){
      System.out.println("Your balance is ₱ " + balance);
   }
}