
package ass1;
  import java.util.Scanner;

public class Ass1 {

  
    public static void main(String[] args) {
       Scanner j= new Scanner(System.in);
        int score;
        System.out.print("enter a number: ");
        score = j.nextInt();
        
        
    
                for (int i=2; i <= score/2; i++)
                {
                    if (score % i == 0){
                        System.out.print(score);
                   System.out.println("THIS NUMBER IS A PRIME NUMBER");}
                    else{
                        System.out.print(i );
                        System.out.println("this is not a prime number");}
                    
                    }
  
                } 
}

    

    
    
                     