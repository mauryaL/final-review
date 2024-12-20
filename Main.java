public class Main {
    public static void main(String[] args) {
  //Practicing with Arrays Section//
  //PART 2
  //Create 3 drink objects that cost less than $5
  Drink coke = new Drink("Coke",3.50,true,false);
  Drink pepsi = new Drink("Pepsi",3.00,true, false);
  Drink water = new Drink("Water",3.25, true, false);

  //***TEST YOUR CODE BY PRINTING THE NAME OF YOUR DRINK TO MAKE SURE IT WORKS***//
  //System.out.println(water.getName());
  //Create 2 drink objects that cost more than $5
  Drink gatorade = new Drink("Gatorade", 6.50, true, false);
  Drink smoothie1 = new Drink("Strawberry Smoothie", 8.3, true, false);
  
  //create an array of drinks  with size 8.
  //put all your drinks in that array.
  Drink[] myDrinks = new Drink[8];
  myDrinks[0] = coke;
  myDrinks[1] = pepsi;
  myDrinks[2] = water;
  myDrinks[3] = gatorade;
  myDrinks[4] = smoothie1;

  for(Drink x: myDrinks){
    if(x!=null){
      System.out.println(x.getName());
    }
    
  }
  
  
//PART 3
  //You will need to write 2 method below
  //Test your method calls here.
  //System.out.println(cheapItems(myDrinks));
  //test your cheapItems method
  
  
  //test your longNameSale method
  //Try to print the price before you use the method and after to see if it worked.
  //longNameSale(myDrinks);


  //test your drinkAll Method here
  //drinkAll(myDrinks);

  //----------------------------------------------------------
    //PART 4 // UNCOMMENT THIS ONCE YOU FINISH THE OTHER PARTS.
    VenMac test = new VenMac();

    System.out.println(test.getDrink().getName()); //testing
    System.out.println(test.twoFor1()); //testing


    }
    

    
    //Part 3
  //Write a method cheapItems that will return go through an array of drinks and return a String that lists the number of items that cost less than $3
  // For example " The cheap drinks are: Fountain drinks, Snapple, green Tea "
  public static  String cheapItems(Drink[] arr){
    //WRITE THE METHOD HERE. MAKE SURE YOU CHECK FOR Nulls 
    String result = "The cheap drinks are: ";
    for(int i=0; i<arr.length;i++){
      if(arr[i]!= null && arr[i].getPrice()<3.00){
        result += arr[i].getName() + ", ";
      }
    }
    return result.substring(0,result.length()-2); //replace this return statement when you write the code
  }
  
  
  //There is a sale on drinks with long names. Write a method that will change the price of all items with a name longer than 7 characters to half off of their original price; You will need to use a setter.
  public static void longNameSale(Drink[] arr){
    for(Drink x: arr){
      if(x!=null && x.getName().length()>7){
        System.out.println("Old Price: "+ x.getPrice());
        double newPrice = x.getPrice()/2;
        x.setPrice(newPrice);
        System.out.println("New Price: " + x.getPrice());
      }
    }
  
  }
    
  //Write a method called drinkAll() that will go through an array and drink all of the drinks we have in it.
  public static void drinkAll(Drink[] arr){
    for(Drink x: arr){
      if(x!=null && !x.getIsEmpty()){
        System.out.println("Glug glug, I just drank " + x.getName() );
        x.setEmpty(true);
      }
    }
  }
  }