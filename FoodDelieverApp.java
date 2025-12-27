//Comparable vs Comparator
//Comparable
Class Restaurant implements Comparable<Restaurant>{
  String name;
  double rating;
  int deliveryTime;
  
  //constructor
  public Restaurant(String name,double rating,int deliveryTime){
    this.name=name;
    this.rating=rating;
    this.deliveryTime=deliveryTime;
  }

  
  @Override
public int compareTo(Restaurant r){
  return Double.compare(r.rating,this.rating);
}

@Override
public String toString(){
  return name+"|Rating"+rating +"|Delivery"+deliveryTime +"mins";
}

}

//Comparator
class FastDeliveryComparator implements Comparator<Restaurant>{
  @Override
  public int compare(Restaurant r1,Restaurant r2){
    return r1.deliveryTime-r2.deliveryTime;
  }
}

//Main class
public class FoodDelieverApp{
  public static void main(String args[]){
    List<Restaurant>restaurants=new ArrayList<>();
    restaurants.add(new Restaurant("Burger Hub",4.5,30));
    restaurants.add(new Restaurant("Pizza Palace",4.8,45));
    restaurants.add(new Restaurant("Healthy Bowl",4.2,20));
    restaurants.add(new Restaurant("Spicy Biryani",4.8,25));
    //Comparable->default sorting
    Collections.sort(restaurants);
    
    restaurants.forEach(System.out::println());
    System.out.println("\n===Custom Sorting Fastest Delievery First");
    //Comparator->custom sorting
    Collections.sort(restaurants,new FastDeliveryComparator());
    restaurants.forEach(System.out::println);
  }
}

