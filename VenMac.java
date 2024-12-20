//UNCOMMENT EVERYTHING BELOW WHEN 
//YOU HAVE COMPLETED THE PREVIOUS 3 PARTS.


//PART 4
import java.util.Scanner;
import java.util.ArrayList;
public class VenMac{
    private ArrayList<Drink> stock; //Instance variable set to null;

    private String[] drinkNames = {"Coke","Diet Coke","Water","Mountain Dew","Iced Tea"}; //Possible drink names?

    //The constructor for a venMach is  below. This code is ran everytime a venMachine is created.
    public VenMac(){ //What happens whenever a vending machine object is created.
        stock = new ArrayList<Drink>();// creates an empty arrayList
    
        for(int i=0;i<(int)(Math.random()*4+1);i++){//[0-1)(4)+1 ->[0-4)+1 -> [1-5) -> [1-4]
            double randPrice = (Math.random()*4+1); //[1-4] double 
            double roundedPrice = (double)((int)(randPrice*100))/100; //Way to round my double to 2 decimal places
            int randIndex  = (int)(Math.random()*drinkNames.length); // random index within my array getting a random drink name
            int ranQuant =(int)(Math.random()*3+1); //Random number of drinks to add
            for(int j=0;j<ranQuant;j++){
                stock.add(new Drink(drinkNames[randIndex],roundedPrice,true,false)); //add random number of a random drink name with a random price to the stock
            }
        }
        
        listContents(); //What does this method do?
    }


    public void listContents(){
        for(int i=0;i<stock.size();i++){
            System.out.println("|Item #: "+ i +"| Item name: "+ stock.get(i).getName()+ "| Price: "+stock.get(i).getPrice());
        }
    }

    //Part 4
    //this method should return a random drink from the arrayList for the user. and remove it from the vending machine. 
    //Challenge, prompt the user to input a price and  give them change  if they have enough, and reject them if theydont.
    public Drink getDrink(){
        int randNum = (int)(Math.random()*stock.size());
        Drink ret = stock.remove(randNum);
        return ret;
    }

    //twoFor1
        // generate a random index within the arrayList of drinks. then return a String that contains the name of a random drink and the one to the right of it in the array.
        // Make sure your method does not go out of bounds. It shouldd return a string for example: "You got Coke and Mountain Dew!"

        public String twoFor1(){
            if(stock.size()==0){ //checks if no more drinks
                return "Sorry no more drinks";
            }
            else if(stock.size()==1){ //checks ifonly one drink
                return "Only one drink here, received: " + stock.remove(0).getName();
            }
            int randNum = (int)(Math.random()*stock.size()-1);//-1 so we dont go to the end.
            String result ="You got "; // Creates new string
            result += stock.remove(randNum).getName() +  " and " + stock.remove(randNum).getName(); //removes and adds to String. 
            return result;//Change this when you write your method.
        }

}