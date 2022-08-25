import java.util.*;

class Main {

  public static String search(ArrayList<String> strs, String find) {
      // complete the method
for(int i=0; i<strs.size(); i++){
  if(strs.get(i).contains(find)){
    return strs.get(i);
  }
}
return "search failed";

   
   
  }


  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int size = in.nextInt();
    String find = in.next();
    in.nextLine();
    ArrayList<String> list = new ArrayList<>();
    for(int i=0; i < size; i++) {
      list.add(in.nextLine());
    }
    System.out.println(search(list, find));
  } 

}
