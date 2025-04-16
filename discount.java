//this line create a class nemaed discount
class discount{
  //this line create a variable and affect the discount to it
  float bonus = .1F;
  //this line create a method that apply the discount to the subtotal if it over than $50 but affect 0 to the subtotal if it not over than 50, and return the new value
  float applydiscount(float a){
    if (a > 50){// this line check the subtotal before apply the discount 
      a = a - (a * bonus);//this line calculate the new subtotal aplly with the discount
    }else{
      a = 0;//this line affect 0 to the subtotal if it not over than 50
    }
    return a; //this line return the new value
  }
}