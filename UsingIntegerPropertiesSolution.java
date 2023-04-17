/** 
 * 
 * Solution to the exercise. Main class.
 * 
 * @author Programming Lecturers
 * @version 1.0
 * 
 */


public class UsingIntegerPropertiesSolution {

  public static void main(String[] args) {
    
	    IntegerProperties v1 = new IntegerProperties(2);
	    IntegerProperties v2 = new IntegerProperties(4);

	    System.out.println("The value of v1 is "+v1.getNum());
	    System.out.println("The value of v2 is "+v2.getNum());

	    v1.setNum(4);
	    System.out.println("The new value of v1 is "+v1.getNum());

	    if (v1.getNum()==v2.getNum())
		System.out.println("The value of v1 and v2 are equal");
	    else
		System.out.println("The value of v1 and v2 are NOT equal");


	    if (v1==v2)
		System.out.println("The references of v1 and v2 are equal");
	    else
		System.out.println("The references of v1 and v2 are NOT equal");
	    
	    
	/* Now we can add the new methods we implemented, so we can see if they work correctly.*/

	v1.setNum(7);

	if (v1.isPrime()) System.out.println("The number "+v1.getNum()+" is prime");
	  else System.out.println("The number "+v1.getNum()+" is NOT prime");

	if (v1.isEven()) System.out.println("The number "+v1.getNum()+" is even");
	  else System.out.println("The number "+v1.getNum()+" is NOT even");

	v1.setNum(8);
	
	if (v1.isPrime()) System.out.println("The number "+v1.getNum()+" is prime");
	  else System.out.println("The number "+v1.getNum()+" is NOT prime");

	if (v1.isEven()) System.out.println("The number "+v1.getNum()+" is even");
	  else System.out.println("The number "+v1.getNum()+" is NOT even");

	v2.setNum(8);

	if (v1.equals(v2)) System.out.println("The number in object v1 "+v1.getNum()+" is equal to the value in object v2 "+v2.getNum());
	else System.out.println("The number in v1 "+v1.getNum()+" is different to the value in v2 "+v2.getNum());

	v2.setNum(88);

	if (v1.equals(v2)) System.out.println("The number in object v1 "+v1.getNum()+" is equal to the value in object v2 "+v2.getNum());
	else System.out.println("The number in v1 "+v1.getNum()+" is different to the value in v2 "+v2.getNum());


	if (v1.areAmicable(v2)) System.out.println("The numbers "+v1.getNum()+" and "+v2.getNum()+" are Amicable");
	else System.out.println("The numbers "+v1.getNum()+" and "+v2.getNum()+" are NOT Amicable");
	
	v1.setNum(220);
	v2.setNum(284);

	if (v1.areAmicable(v2)) System.out.println("The numbers "+v1.getNum()+" and "+v2.getNum()+" are Amicable");
	else System.out.println("The numbers "+v1.getNum()+" and "+v2.getNum()+" are NOT Amicable");
	
	// Using toString
	
	System.out.println("toString of v1: "+v1.toString());
	System.out.println("What prints v1: "+v1); //It prints the same because Java uses automatically the toString method.
	

  }
}
