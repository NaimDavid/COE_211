import java.io.*;  
import java.io.IOException;
import java.util.Scanner;

public class ExpensesTracker
{
    public static void main(String[] args) throws IOException
    {
        FileWriter fw = new FileWriter(new File("expenses.txt"));
        Scanner myScanner = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(fw);
        String ans;
    do
       
    {
        System.out.println("Input your name:");
        String name = myScanner.nextLine();
          
        System.out.println("What did you purchase?");
        String purchase = myScanner.nextLine();
          
        System.out.println("How much did you pay? (in USD)");
        double pay = myScanner.nextDouble();
        
        myScanner.nextLine();
        
        pw.print(name + " purchased " + purchase + " for " + pay + " US Dollars.\n");
        pw.flush();
          
        System.out.println("Would you like to log another purchase? (y/n)");
        ans = myScanner.nextLine();
    }
    while(ans.equalsIgnoreCase("y"));
    
    System.out.println("Get off of ZoodMall!");
    
    System.out.println("Would you like to read a summary of your purchases? (y/n)");
    String readsum = myScanner.nextLine();
    
    pw.close();
    myScanner.close();
    
    if (readsum.equalsIgnoreCase("y"))
    {
        Scanner scanFromFile = new Scanner(new File("expenses.txt"));
        while(scanFromFile.hasNext())
        {
            System.out.println(scanFromFile.nextLine());            
        }
        scanFromFile.close();
    }
    }
}