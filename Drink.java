public class Drink{
  //PART 1
    //Create attributes for the drink class here.
      
    /* Give it attirbutes:
    name
    price with decimals
    if it's cold or not (isCold)
    if it's empty (isEmpty)
    */
    private String name;
    private double price;
    private boolean isCold;
    private boolean isEmpty;
    
    
    //Write the constructor for the Drink class. (THIS IS WHAT CREATES an object when its run in the main) 
    //the order for the parameters must be (String, double, boolean, boolean)
    //After creating a constructor test your code in the main to see if you can create some drink.
    public Drink(String n, Double p, boolean isC, boolean isE){
      name = n;
      price = p;
      isCold = isC;
      isEmpty = isE;
    }


    public String getName() {
      return name;
    }


    public double getPrice() {
      return price;
    }


    public boolean getIsCold() {
      return isCold;
    }


    public boolean getIsEmpty() {
      return isEmpty;
    }


    public void setName(String name) {
      this.name = name;
    }


    public void setPrice(double price) {
      this.price = price;
    }


    public void setCold(boolean isCold) {
      this.isCold = isCold;
    }


    public void setEmpty(boolean isEmpty) {
      this.isEmpty = isEmpty;
    }
    
    
    
    
      //Write getters/setters for the methods
    

    // Write the method emptyDrink which prints out the message: NameOfDrink "has been drank" and then changes the attribute to be empty
    public void emptyDrink(){
      if(!isEmpty){
        System.out.println(name + " has been drank");
        isEmpty = true;
      }
      
      else{
        System.out.println(name + " is already empty");
      }

    }
      
    }