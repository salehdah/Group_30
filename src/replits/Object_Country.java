public class Country {
  // TODO: write your code here
String name;
  String continent;
  long population;
  boolean nearWater;
  public Country(String name, String continent){
    this.name=name;
    this.continent=continent;
  }
  public Country(String name, String continent, long population){
    this.name=name;
    this.continent=continent;
    this.population=population;
  }
  public Country(String name, String continent, long population, boolean nearWater){
    this.name=name;
    this.continent=continent;
    this.population=population;
    this.nearWater=nearWater;
  }

  
  
}
