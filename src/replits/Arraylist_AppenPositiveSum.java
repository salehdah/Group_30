import java.util.ArrayList;
import java.util.*;
class Main{
  //create your method below

  public static ArrayList<Integer> appendPosSum(ArrayList<Integer> list){
    int sum=0;
    ArrayList<Integer> newList=new ArrayList<>();
    for(int i=0; i<list.size(); i++){
      if(list.get(i)>0){
        sum+=list.get(i);
        newList.add(list.get(i));
      }
    }
    newList.add(sum);
    return newList;








    
  }


  // Do not touch below

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int size = in.nextInt();
    ArrayList<Integer> list = new ArrayList<>();
    for(int i=0; i < size; i++) {
      list.add(in.nextInt());
    }

    System.out.println(appendPosSum(list));

  } 
	
}
