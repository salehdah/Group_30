import java.util.*;

class Main {
  public static void main(String[] args) {
    //WRITE YOUR CODE BELOW:
    System.out.println("Enter seconds:");
    Scanner input=new Scanner(System.in); 
    int inputSeconds=input.nextInt();
    int hours=inputSeconds/3600;
    int minutes=(inputSeconds%3600)/60;
    int seconds=(inputSeconds%3600)%60;
    System.out.println(hours+" hours, "+minutes+" minutes, and "+seconds+" seconds");
    

  }
}
