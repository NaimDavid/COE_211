package entrypoint;
import java.util.Scanner;

public class MyClass 
{
    public static void main(String args[]) 
    {
        String answer = "Y";
      do
 {
    
System.out.println("Which service would you like to use?");
System.out.println("[1]: Basic week visualizer");
System.out.println("[2]: Advanced week visualizer");
System.out.println("[3]: Basic calculator");
System.out.println("[4]: Employee repertoire");
Scanner sc = new Scanner(System.in);
String x = sc.nextLine();
int y = Integer.parseInt(x);
switch (y)
{
case 1:
BasicWeek base = new BasicWeek();
base.printDays();
break; 
case 2:
AdvancedWeek advance = new AdvancedWeek();
advance.printDays();
break;
case 3:
Calculator calc = new Calculator();
break;
case 4:
Employee emp = new Employee();
System.out.println(emp.toString());
break;

default:
            System.out.println("Please make sure you pick a number between 1 and 4");
              break;
      }
 
      System.out.println("Would you like to perform another operation? (y/n)");
      String iter = sc.nextLine();
      answer = iter;
      }
      while (answer.equalsIgnoreCase("Y"));
    }
}




  

   









