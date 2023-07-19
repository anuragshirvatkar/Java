import java.util.Scanner;
public class Switch {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Addition\n2.Substraction\n3.Multiplication\n4.Divivsion");
        int choice = sc.nextInt();
        switch(choice){
          case 1:
           System.out.println("You are performing addition.");
          break;
          case 2:
          System.out.println("You are performing substraction.");
          break;
          case 3:
          System.out.println("You are performing multiplication.");
          break;
          case 4:
          System.out.println("You are performing division.");
          break;
          default:
          System.out.println("You have entered wrong choice.");
        }
    }
}
