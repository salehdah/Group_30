package src.replits;

import java.util.ArrayList;
import java.util.*;
class main {
  public static ArrayList<String> combine(String[] r1, String[] r2){

    // your code here
    ArrayList<String> list= new ArrayList<>();
  for(int i=0; i<r1.length; i++ ){
    list.add(r1[i]);
    
  }
for(int i=0; i<r2.length; i++){
  list.add(r2[i]);
}
return list;

  
  
   
  }

  public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      String [] strs = new String[in.nextInt()];
      String [] strs2 = new String[in.nextInt()];
      for(int i=0; i < strs.length; i++) {
        strs[i] = in.next();
      }
      for(int i=0; i < strs2.length; i++) {
        strs2[i] = in.next();
      }

    System.out.println(combine(strs,strs2));

  } 

}
