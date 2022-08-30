package src.replits;

public class Object_Item {
// TODO: write your code here
public String name;
  public double price;
  public void Item(String name, double price){
    this.name=name;
    this.price=price;
      }
 public String toString() {
        return "" +
                "" + name + 
                " - $" + price +
                "";
    }


  
}
