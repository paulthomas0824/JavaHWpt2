
/**
 * JavaCH7HWpt2
 */
import java.util.Scanner;



public class JavaHWCH7pt2 {

    public static boolean isNumeric(String string) {
        int intValue;
        Scanner sc = new Scanner(System.in);
        string = sc.nextLine();    
        System.out.println(String.format("Parsing string: \"%s\"", string));
            
        if(string == null || string.equals("")) {
            System.out.println("String cannot be parsed, it is null or empty.");
            return false;
            
        }
        
        try {
            intValue = Integer.parseInt(string);
            return true;
        } catch (NumberFormatException e) {
            System.out.println("Input String cannot be parsed to Integer.");
            
            
        }
        return false;
        
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            
        
                 
      
            int firstNum, lastNum, mainChoice;

            System.out.println("\tTHIS PROGRAM WILL DISPLAY ALL NUMBERS DISPLAYED WITHIN ITS RANGE>\n\tALL YOU NEED TO DO IS TYPE A BEGINNING NUMBER AND END NUMBER AND IT WILL DISPLAY ALL NUMBERS WITHIN THAT RANGE.");
            System.out.println("PLEASE SELECT AN OPTION BELOW BY TYPING IN A NUMBER SUCH AS [1] AND HITTING [ENTER]");
            System.out.println("1. INT NUMBER \t2. TRUE OR FALSE\t3. EXIT");
            mainChoice = sc.nextInt();
            do {
                if (mainChoice ==1) {
                    do {
                        System.out.println("PLEASE SELECT YOUR FIRST NUMBER(BEGINNING NUMBER) PLEASE KEEP NUMBERS LESS THAN 100.");
                        firstNum = sc.nextInt();
                        System.out.println("PLEASE SELECT YOUR LAST NUMBER(ENDING NUMBER) PLEASE KEEP NUMBERS LESS THAN 100.");
                        lastNum = sc.nextInt();
                        do {
                            System.out.println(firstNum);
                            firstNum++;
                        } while (firstNum<=lastNum);
                    } while(firstNum <= lastNum);
                }

                
                
                if (mainChoice == 2) {
                    System.out.print("PLEASE ENTER A NUMBER AND THIS WILL TELL YOU IF IT IS A INTEGER OR NOT: ");
                    
                    String string;
                    string = sc.nextLine();
                    if(isNumeric(string)) { 
                        System.out.println("String is numeric!");
    
                    } else {
                        System.out.println("String is not numeric.");
                        
                    }
                }
                System.out.println("PLEASE SELECT AN OPTION BELOW BY TYPING IN A NUMBER SUCH AS [1] AND HITTING [ENTER]");
                System.out.println("1. INT NUMBER \t2. TRUE OR FALSE\t3. EXIT");
                mainChoice = sc.nextInt();

            } while (mainChoice != 3);
            

            
         

        sc.close();
    }
}