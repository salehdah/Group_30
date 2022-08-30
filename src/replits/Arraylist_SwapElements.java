import java.util.*;

class Main {
  
  public static ArrayList<String> swap(ArrayList<String> list,int pos1,int pos2) {
    String firstSwap=list.get(pos1);
    String secondSwap=list.get(pos2);
  list.remove(pos1);
    list.remove(pos2-1);
    list.add(pos1, secondSwap);
    list.add(pos2, firstSwap);
    return list;
    
  






  }
  
  
  // Do not touch below


  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int size = in.nextInt();
    int pos1 = in.nextInt();
    int pos2 = in.nextInt();
    ArrayList<String> list = new ArrayList<>();
    for(int i=0; i < size; i++) {
      list.add(in.next());
    }

    System.out.println(swap(list, pos1, pos2));

  } 

}
