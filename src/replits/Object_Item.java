public class Item {
// TODO: write your code here
public String name;
  public double price;
  public Item(String name, double price){
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
