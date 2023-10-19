import java.util.Scanner;
public class OrderApp1{
   public static void main(String[] args){
      Scanner scan = new Scanner(System.in);
      
      System.out.println("Menu: ");
      System.out.println("1. C1 - Php 100");
      System.out.println("2. C2 - Php 150");
      System.out.println("3. C3 - Php 200");

      System.out.println("Add Ons: ");
      System.out.println("4. R1 - Php 35");
      System.out.println("5. R2 - Php 50");
      
      double total1 = 0;
      double total2 = 0;
      double total3 = 0;
      double total4 = 0;
      double total5 = 0;
      double Total = 0;
      int qty;

      while(true){
         System.out.print("Enter your selection (e.g., '1' for 'C1' or '4' for 'R1') or '0' to finish: ");
         int choice = scan.nextInt();
         
         if(choice == 0){
            break;
         }
         switch(choice){
            case 1: 
               System.out.print("Enter Quantity: ");
               qty = scan.nextInt();
               total1 += qty * 100;
               break;
               
            case 2:
               System.out.println("Enter Quantity: ");
               qty = scan.nextInt();
               total2 += qty * 150;
               break;
               
            case 3: 
               System.out.println("Enter Quantity: ");
               qty = scan.nextInt();
               total3 += qty * 200;
               break;
            
            case 4:
               System.out.println("Enter Quantity: ");
               qty = scan.nextInt();
               total4 += qty * 35;
               break;
            
            case 5: 
               System.out.println("Enter Quantity: ");
               qty = scan.nextInt();
               total5 += qty * 50;
               break;

         }
         
      }
      Total = total1 + total2 + total3 + total4 + total5;
      System.out.println("Total Price in Peso: " + Total);
      System.out.printf("Total Price in Dollar: %.2f%n ", Total / 56.79);
   }
}