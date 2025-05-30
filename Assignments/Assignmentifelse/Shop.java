/*3. A shop will give discount of 10% if the cost of purchased quantity is more than 1000.
   Ask user for quantity
   Suppose,one unit will cost 100.
   judge and print total cost for user.*/
   
class Shop
{
	public static void main(String... s)
	{
		System.out.println("1 unit will cost Rs 100");
		System.out.println("Enter Your Quantity");
		int qty=new java.util.Scanner(System.in).nextInt();
		int price=qty*100;
		float discount=price/10;
		float discountedprice=price-discount;
		
		if(price>1000){
			System.out.println("Actual Price is = "+price);
			System.out.println("Discounted Price = "+discountedprice);
		}
		else{
			System.out.println("price is = "+price);
		}
	}
}