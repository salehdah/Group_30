package src.replits;

public class Object_Country {
  // TODO: write your code here
String name;
  String continent;
  long population;
  boolean nearWater;
  public void Country(String name, String continent){
    this.name=name;
    this.continent=continent;
  }
  public void Country(String name, String continent, long population){
    this.name=name;
    this.continent=continent;
    this.population=population;
  }
  public void Country(String name, String continent, long population, boolean nearWater){
    this.name=name;
    this.continent=continent;
    this.population=population;
    this.nearWater=nearWater;
  }

  
  
}
