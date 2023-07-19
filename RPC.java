import java.util.*;
public class RPC {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int n=r.nextInt(2);
        String c_choice;
        if(n==0){
            c_choice="Rock";
        }
        else if(n==1){
            c_choice="Paper";
        }
        else {
            c_choice="Ceasors";
        }
        System.out.println("Enter your choice: \nRock\nPaper\nCeasors");
        String u_choice=sc.next();

        if(c_choice.equals(u_choice)){
              System.out.println("Game Tied");
        }
        else if(c_choice.equals("Rock") && u_choice.equals("Paper")){
          System.out.println("You Won!");  
        }
        else if(c_choice.equals("Rock") && u_choice.equals("Ceasors")){
          System.out.println("Computer Won!");  
        }
        else if(c_choice.equals("Paper") && u_choice.equals("Rock")){
          System.out.println("Computer Won!");  
        }
        else if(c_choice.equals("Paper") && u_choice.equals("Ceasors")){
          System.out.println("You Won!");  
        }
        else if(c_choice.equals("Ceasors") && u_choice.equals("Rock")){
          System.out.println("You Won!");  
        }
         else if(c_choice.equals("Ceasors") && u_choice.equals("Paper")){
          System.out.println("Computer Won!");  
        }else{
         System.out.println("Thanks for plaing!");
        }

       System.out.println("Computer choice was: "+c_choice);
    }
}
