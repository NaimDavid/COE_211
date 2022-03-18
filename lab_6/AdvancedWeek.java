package entrypoint; 

public class AdvancedWeek {
    private String d1 = "Monday";
    private String d2 = "Tuesday";
    private String d3 = "Wednesday";
    private String d4 = "Thursday";
    private String d5 = "Friday";
    private String d6 = "Saturday";
    private String d7 = "Sunday"; 
  
    private int i = 1;
    
     
   
    public void printDays() 
    {
        System.out.println("The advanced days of the week are:" + "\n" + i++ + ": " + d1 + "," + "\n" + i++ + ": " + d2 + "," + "\n" + i++ + ": " + d3 + ","
        + "\n" + i++ + ": " + d4 + "," + "\n" + i++ + ": " + d5 + ","+ "\n" + i++ + ": " + d6 + "," + "\n" + i++ + ": " + d7 + ".");
    }
}
