package entrypoint;
import java.util.Scanner;

public class Calculator {
    private int num1;
    private int num2;
    private String operator;

    
    public Calculator() {
       
        Scanner scanCalc = new Scanner(System.in);
        System.out.println("Input the first number:");
        num1 = scanCalc.nextInt();
        scanCalc.nextLine();
        System.out.println("Input the operator:");
        operator = scanCalc.nextLine();
        System.out.println("Input the second number:");
        num2 = scanCalc.nextInt();
        
        switch (operator){
            
            case "+":
                System.out.println(add(num1, num2));
                break;
            case "":
                System.out.println(substract(num1, num2));
                break;    
            case "*":
                System.out.println(multiply(num1, num2));
                break;
            case "/":
                System.out.println(divide(num1, num2));
                break;
            default:
                System.out.println("Invalid Operator");
                break;
        }
    }
    public String add(int a, int b) 
       {
        int sum = a + b;
        return a + " + " + b + " = " + sum;
    }
    

    public String substract(int a, int b) 
  {             int neg = a - b;
        return a + " - " + b + " = " + neg;
    }

    public String multiply(int a, int b) 
        {
        int mul = a * b;
        return a + " * " + b + " = " + mul;
    }

    public String divide(int a, int b) {
            {
        if (b!=0)
        {
            int div = a / b;
            return a + " / " + b + " = " + div;
        }
        else
        {
            return ("Division by Zero");
        }
    }
    }
}


