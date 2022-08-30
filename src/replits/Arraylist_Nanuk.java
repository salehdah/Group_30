import java.util.*;

class Main {

  public static boolean hunt(ArrayList<String> result,int wayStones,int boast) {
    int countNanuk=0;
    int sum=0;
    for(String each: result){
      if (each.equalsIgnoreCase("nanuk")) {
        countNanuk++;
}else{
        sum+=Integer.parseInt(each);
}
    
    }
if(countNanuk>wayStones || sum<boast ){
return false;
}
return true;




  }
  
  // Do not touch below

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int size = in.nextInt();
    int stones = in.nextInt();
    int boast = in.nextInt();
    ArrayList<String> list = new ArrayList<>();
    for(int i=0; i < size; i++) {
      list.add(in.next());
    }

    System.out.println(hunt(list, stones, boast));

  } 

}
