package src.replits;

import java.util.Scanner;

public class sandwich {
  public static void main(String[] args) {
    //DO NOT TOUCH FOLLOWING LINE/LINES
    Scanner scan = new Scanner(System.in);
    String str = scan.next();
    
    //WRITE YOUR CODE BELOW
   
    int firstIndex = str.indexOf("bread");
    int lastIndex = str.lastIndexOf("bread");
    if (str.length()>firstIndex+5) {
      if(firstIndex !=-1&&lastIndex!=firstIndex && lastIndex!=-1){
      System.out.println(str.substring(firstIndex+5, lastIndex));
      }else if (lastIndex ==-1){
        System.out.println("nothing");
      } else {
      System.out.println("nothing");
}
}else {
      System.out.println("nothing");
}
  }
}
