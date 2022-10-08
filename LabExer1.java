
package labexer1;
import java.util.*;

public class LabExer1 {
    // variables
    
     private String ItemName;
     private double ItemPrice;
     private int ItemQuantity;
     private double AmountDue;
     
     //-------------------------------------------
     // setters
  
    public void setItemName(String NewItemName )
    {
        ItemName = NewItemName;
    }
    
    public void setTotalCost(double NewAmountDue )
    {
        AmountDue = NewAmountDue;
    }
     public void setItemQuantity(int quantity )
    {
        ItemQuantity = quantity;
    }
     public void setItemPrice(double price )
    {
        ItemPrice = price;
    }
     
     //------------------------------------------------\
     //getters

    public String getItemName()
    {
        return ItemName;
    }
     public double getTotalCost()
    {
        return AmountDue = ItemPrice * ItemQuantity;
    }
      public int getItemQuantity()
    {
        return ItemQuantity;
    }
      public double getItemPrice()
    {
        return ItemPrice;
    }
      
     //------------------------------------------------
     //I/O
      
     public void readInput()
     {
         Scanner scn = new Scanner(System.in);
         System.out.println("Enter The name of the item you purchasing: ");
         String ItemN = scn.nextLine();
         
         System.out.println("Enter the quantity of the item: ");
         int ItemQ = scn.nextInt();
         
         System.out.println("Enter the price of the item: ");
         double ItemP = scn.nextDouble();
         
         setItemName(ItemN);
         setItemQuantity(ItemQ);
         setItemPrice(ItemP);
     }
     
     public void writeInput()
     {
         
          System.out.println("----------------------------------------- ");
          System.out.println("You are purchasing " + getItemQuantity()+ " " + getItemName() + "(s)" + " at " + getItemPrice() + " pesos each ");
          System.out.println("Amount Due: " + getTotalCost() + " Pesos");
     }
     
     //----------------------------------------------
     //calling method

    public static void main(String[] args) {
        LabExer1 LE1 = new LabExer1();
        
        LE1.readInput();
        LE1.writeInput();
    }
    
}
