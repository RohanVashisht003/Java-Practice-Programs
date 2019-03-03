import java.util.Scanner;
public class Pattern4 {
	public static void printTriagle(int n) 
    { 
        // number of spaces 
        int k = n-1; 
   
        // outer loop to handle number of rows 
        //  n in this case 
        for (int i=1; i<=n; i++) 
        { 
  
            // inner loop to handle number spaces 
            // values changing acc. to requirement 
            for (int j=1; j<=k; j++) 
            { 
                // printing spaces 
                System.out.print(" "); 
            } 
   
            // decrementing k after each loop 
            k = k - 1; 
   
            //  inner loop to handle number of columns 
            //  values changing acc. to outer loop 
            for (int j=1; j<=i; j++ ) 
            { 
                // printing stars 
                System.out.print("*"); 
            } 
   
            // ending line after each row 
            System.out.println(); 
        } 
    } 
      
    // Driver Function 
    public static void main(String args[]) 
    { 
        int n ; 
        System.out.println("Enter limit");
        Scanner scan= new Scanner(System.in);
        n=scan.nextInt();
      
  printTriagle(n); 
    } 
} 


