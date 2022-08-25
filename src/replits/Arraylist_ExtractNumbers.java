import java.util.Scanner;

class Main {
  public static String extractNum(String s) {
    String newWord="";
    for(int i=0; i<s.length();i++){
      if(Character.isDigit(s.charAt(i))){
        newWord+= s.charAt(i);
      }
    }
   return newWord;
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
		System.out.println(extractNum(in.next()));
  }

}
