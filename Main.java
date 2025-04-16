/*Eugene Junior
INT2200-LD01
Project 1: Receipt
Procedure:
  This code will output the same result as the receipt projet on project 3, that means it will take your order and print the receipt. However, they do have a difference a discout have been added to the receipt. A new class have been add to the file. This class create a discount variable named as bonus and use it to process to the discount in the mettod applydiscount. this method returns the new value that will be use in the main class through the state object.
*/

import java.util.Scanner; //this line import the Scanner module 

class Main extends discount{ //this line extends the content of the discount class 
  //this bloc create a funtion that will skip a line
  static void nextline(){
    System.out.println("\n");
  }
  // this bloc create a method to print the header of the receipt
  static void receiptheader(){
    System.out.println("\t\t\t\t Welcome to Simply Pizza!");
    System.out.println("\t\t\t\t\t 3705 Englewood");
    System.out.println("\t\t\t\t Central City, MI 12345");
    System.out.println("\t\t\t\t\t\t8568448392");
    System.out.println("\n");
  }
  //this bloc create a method to print the footer of the receipt
  static void receiptfooter(){
     System.out.println("\n");
    System.out.println("Don't forget to do the survey about the service on the website www.SimplePizza.com");
  }
  //this bloc create a method to print the result of calculations on the receipt
  static void receiptbody(float subtotal, float discount, float tax, float tender, float change, float total){
     System.out.println("Amount due for pizza and drinks is : $" + subtotal);
    System.out.println("The discounted subtotal for this oreder is: $"+ discount);
    System.out.println("Sales tax amount is: $" + tax);
    System.out.println("Total amount due, including tax is: $" + total);
    System.out.println("Amount tendered: $" +  tender);
    System.out.println("Change: $" + change);

  }
  //this line create the method that display the announce of the discount 
  static void discountannounce(){
    System.out.println("Simply Pizza offers a discout of 10% on every order over than $50");
  }
  public static void main(String[] args){
  //this line initialize the accumulator of the grant total to 0
    float grant_total_owed = 0;
  //this line initialize the counter of the customer to 0
    int customer_served = 0;
  //this line create the variable that will serve as condition for the loop
    int answer;   
    

    Main state = new Main();
    //this bloc initialize the constants
    final float PRICESMALLPIZZA = 8.99F;
    final float PRICESMALLTOPPINGPIZZA = 1.5F;
    final float PRICELARGEPIZZA = 12.99F;
    final float PRICELARGETOPPINGPIZZA = 2.5F;
    final float SOFTDRINKS = 1.5F;
    final float SALETAX = .06F;

    //this line permit to create more variables through the input of the user
    Scanner value = new Scanner(System.in);

    //this line print the question that ask the user to enter the condition 
    System.out.println("Do you want to take  an order  today?  (type 1 for yes or 0 for no)");
    answer = value.nextInt();//this line receive the input of the user and affect that to the condition variable
    nextline();
//this loop check if the customer want to take the order or not if yes it will run normally but if not it will print the number of customer served and the grand total owned 
    while(answer == 1){
    //this block take the order through the input of the user and affect those inputs in variables
    System.out.println("Enter the number of small pizza that you want:");
    int nbrSmallPizza = value.nextInt();
    System.out.println("Enter the number of small topping on your pizza:");
    int nbrSmallTopping = value.nextInt();
    System.out.println("Enter the number of large pizza that you want:");
    int nbrLargePizza = value.nextInt();
    System.out.println("Enter the number of large topping on your pizza:");
    int nbrLargeTopping = value.nextInt();
    System.out.println("Enter the number of soft drinks that you want:");
    int nbrSoftDrinks = value.nextInt();

    //this bloc calculates the amount of food orders by the user and affects the result into variables 
    float orderedSmallPizza = PRICESMALLPIZZA * nbrSmallPizza;
    float orderedSmallTopping = PRICESMALLTOPPINGPIZZA * nbrSmallTopping;
    float orderedLargePizza = PRICELARGEPIZZA * nbrLargePizza;
    float orderedLargeTopping = PRICELARGETOPPINGPIZZA *
    nbrLargeTopping;
    float orderedDrinks = SOFTDRINKS * nbrSoftDrinks;

    float subtotal = orderedSmallPizza + orderedSmallTopping + orderedLargePizza + orderedLargeTopping + orderedDrinks;//this line proceed to the total of purchase without tax 
    System.out.println("the subtotal is: "+ subtotal);//this line print the subtotal

    state.applydiscount(subtotal);//this line call the method create in the discount class and process by using the subtotal as parameter 
    float discount = state.applydiscount(subtotal);//this line affect the result of the method to a new variable
    System.out.println("Your new subtotal with discount(10%) applied is: $" + discount);// this line print the new subtotal with the discount applied
    
    if (subtotal > 50){
      float tax = discount * SALETAX;//this line calculate the tax of all the purchase 
    float total = discount + tax;//this line calculate the total of the bill with tax included
    
     System.out.println("You have to pay: $" + total + ".");// this line print the total to the user 
    System.out.println("Enter the amount tendered:");////this line ask to the user the amount of money that s/he will tend at the cashier
    int tender = value.nextInt();// this line get the amount of the tender and put that into a new variables named tender
    float change = tender - total;//this line calculate the change that the cashier shoul give back to the user
    //this bloc create that will ask to the user to enter more money as long the tender will be less than the total
    if (tender < total){
      do{
        System.out.println("Money is not enough add more:");
        int tender_n = value.nextInt();
        tender = tender + tender_n;
      }while(tender <= total);
      change = tender- total;
      System.out.println("Change: $"+ change);
    }else{ 
      System.out.println("Change: $"+ change);
    }
    nextline();//this line call or invoke the method nextline that wwill skip a line 
    receiptheader();// this line call or invoke the method that will print the receipt header
    discountannounce();//this line call the method that display the announce of the discount 
    //this bloc create a multidimensional array based on the constants initialize at the beginning and the price of each food ordered.
    float[][] detailprice = { { PRICESMALLPIZZA, orderedSmallPizza }, { PRICESMALLTOPPINGPIZZA, orderedSmallTopping }, {PRICELARGEPIZZA ,orderedLargePizza},{PRICELARGETOPPINGPIZZA,orderedLargeTopping},{SOFTDRINKS,orderedDrinks}};

  //this bloc will print the menu of food ordered with the price of one single article and the price of food ordered and the amount oredered too, that for each article

    //the first article small pizza
    for (int i=0; i< 1; i++)
      {
        System.out.print(nbrSmallPizza);
        System.out.print(" Small pizza ");
        for(int j=0; j< 2;j++ )
        System.out.print("$" + detailprice[i][j]+ "  ");

        System.out.println();
      }
    //the second article small pizza topping
    for (int i = 1; i < 2; i++)
      {
        System.out.print(nbrSmallTopping);
        System.out.print(" Small Topping pizza ");
        for(int j=0; j< 2;j++ )
        System.out.print("$" + detailprice[i][j]+ "  ");

        System.out.println();
      }
    //the third article large pizza
    for (int i = 2; i < 3; i++)
      {
        System.out.print(nbrLargePizza);
        System.out.print(" Large pizza ");
        for(int j=0; j< 2;j++ )
        System.out.print("$" + detailprice[i][j]+ "  ");

        System.out.println();
      }
    //the fourth article large pizza topping
    for (int i = 3; i < 4; i++)
      {
        System.out.print(nbrLargeTopping);
        System.out.print(" Large topping pizza ");
        for(int j=0; j< 2;j++ )
        System.out.print("$" + detailprice[i][j]+ "  ");

        System.out.println();
      }
    //he fifth article soft drink
    for (int i = 4; i < 5; i++)
      {
        System.out.print(nbrSoftDrinks);
        System.out.print(" Soft drinks ");
        for(int j=0; j< 2;j++ )
        System.out.print("$" + detailprice[i][j]+ "  ");

        System.out.println();
      }
    nextline();//this line call or invoke the method nextline that wwill skip a line
    receiptbody(subtotal, discount, tax, tender, change, total);//this line call or invoke the calculation part of the receipt by taking the paramaters already created 
    receiptfooter();//this line call or invoke the method that will print the footer of receipt 
    grant_total_owed = grant_total_owed + total;//this line accumulate the big total of every order
    customer_served++;//this line increment by one the number of customer served
    nextline();
      //this line check the if the user want to take another order by enter the condition trigger
    System.out.println("Do you want to take another other today?  (type 1 for yes or 0 for no)");
    answer = value.nextInt();// this line receive the new codition that will check by the loop at the end
    nextline();
    }else{
      
    float tax = subtotal * SALETAX;//this line calculate the tax of all the purchase 
    float total = subtotal + tax;//this line calculate the total of the bill with tax included
    
     System.out.println("You have to pay: $" + total + ".");// this line print the total to the user 
    System.out.println("Enter the amount tendered:");////this line ask to the user the amount of money that s/he will tend at the cashier
    int tender = value.nextInt();// this line get the amount of the tender and put that into a new variables named tender
    float change = tender - total;//this line calculate the change that the cashier shoul give back to the user
    //this bloc create that will ask to the user to enter more money as long the tender will be less than the total
    if (tender < total){
      do{
        System.out.println("Money is not enough add more:");
        int tender_n = value.nextInt();
        tender = tender + tender_n;
      }while(tender <= total);
      change = tender- total;
      System.out.println("Change: $"+ change);
    }else{ 
      System.out.println("Change: $"+ change);
    }
    nextline();//this line call or invoke the method nextline that wwill skip a line 
    receiptheader();// this line call or invoke the method that will print the receipt header
      
    discountannounce();//this line call the method that display the announce of the discount 
      
    //this bloc create a multidimensional array based on the constants initialize at the beginning and the price of each food ordered.
    float[][] detailprice = { { PRICESMALLPIZZA, orderedSmallPizza }, { PRICESMALLTOPPINGPIZZA, orderedSmallTopping }, {PRICELARGEPIZZA ,orderedLargePizza},{PRICELARGETOPPINGPIZZA,orderedLargeTopping},{SOFTDRINKS,orderedDrinks}};

  //this bloc will print the menu of food ordered with the price of one single article and the price of food ordered and the amount oredered too, that for each article

    //the first article small pizza
    for (int i=0; i< 1; i++)
      {
        System.out.print(nbrSmallPizza);
        System.out.print(" Small pizza ");
        for(int j=0; j< 2;j++ )
        System.out.print("$" + detailprice[i][j]+ "  ");

        System.out.println();
      }
    //the second article small pizza topping
    for (int i = 1; i < 2; i++)
      {
        System.out.print(nbrSmallTopping);
        System.out.print(" Small Topping pizza ");
        for(int j=0; j< 2;j++ )
        System.out.print("$" + detailprice[i][j]+ "  ");

        System.out.println();
      }
    //the third article large pizza
    for (int i = 2; i < 3; i++)
      {
        System.out.print(nbrLargePizza);
        System.out.print(" Large pizza ");
        for(int j=0; j< 2;j++ )
        System.out.print("$" + detailprice[i][j]+ "  ");

        System.out.println();
      }
    //the fourth article large pizza topping
    for (int i = 3; i < 4; i++)
      {
        System.out.print(nbrLargeTopping);
        System.out.print(" Large topping pizza ");
        for(int j=0; j< 2;j++ )
        System.out.print("$" + detailprice[i][j]+ "  ");

        System.out.println();
      }
    //he fifth article soft drink
    for (int i = 4; i < 5; i++)
      {
        System.out.print(nbrSoftDrinks);
        System.out.print(" Soft drinks ");
        for(int j=0; j< 2;j++ )
        System.out.print("$" + detailprice[i][j]+ "  ");

        System.out.println();
      }
    nextline();//this line call or invoke the method nextline that wwill skip a line
    receiptbody(subtotal, discount, tax, tender, change, total);//this line call or invoke the calculation part of the receipt by taking the paramaters already created 
    receiptfooter();//this line call or invoke the method that will print the footer of receipt 
    receiptfooter();//this line call or invoke the method that will print the footer of receipt 
    grant_total_owed = grant_total_owed + total;//this line accumulate the big total of every order
    customer_served++;//this line increment by one the number of customer served
    nextline();
      //this line check the if the user want to take another order by enter the condition trigger
    System.out.println("Do you want to take another other today?  (type 1 for yes or 0 for no)");
    answer = value.nextInt();// this line receive the new codition that will check by the loop at the end
    nextline();
    }
    
  }
  System.out.println("The number of customer served is: " + customer_served + " Customers");
  System.out.println("the total money owed is: $" + grant_total_owed);
  }
}
  