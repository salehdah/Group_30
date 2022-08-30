package src.replits;

import java.util.ArrayList;
import java.util.*;
class Arraylist_TimesTwo{

  public static ArrayList<Integer> timesTwo(ArrayList<Integer> nums){
ArrayList<Integer> newNums= new ArrayList<>();
    for(int i=0; i<nums.size(); i++){
      newNums.add(nums.get(i)*2);
    }
return newNums;






    
  }






  // Do not touch below

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int size = in.nextInt();
    ArrayList<Integer> list = new ArrayList<>();
    for(int i=0; i < size; i++) {
      list.add(in.nextInt());
    }

    System.out.println(timesTwo(list));

  } 

}
