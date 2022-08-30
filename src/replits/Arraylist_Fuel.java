import java.util.*;

class Main {
  public static int refuels(ArrayList<Integer> deliveries,int gasTank) {
    int sum=0;
    for(int i=0; i<deliveries.size(); i++){
      if(deliveries.get(i)>=gasTank){
      sum+=deliveries.get(i)/gasTank;
      }else{
        sum+=deliveries.get(i)%gasTank;
      }
    }
return sum;

    
  }



  // Do not touch below

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int size = in.nextInt();
    int fuel = in.nextInt();
    ArrayList<Integer> list = new ArrayList<>();
    for(int i=0; i < size; i++) {
      list.add(in.nextInt());
    }

    System.out.println(refuels(list, fuel));

  } 
  
}
