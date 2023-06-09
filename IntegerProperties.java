/** 
 * Laboratory Session 2.
 * Solution to the exercise. Class IntegerProperties.
 * 
 * @author Programming Lecturers
 * @version 1.0
 * 
 */
public class IntegerProperties {
  private int num;

  /** Default constructor
   * 
   */
  public IntegerProperties() {
      num=0;
  }
  
  /** Constructor with the value as a param
   * 
   * @param num the integer value of the object
   */
  public IntegerProperties(int num) {
      this.num=num;
  }
 
  /** 
   * getter
   * @return return integer value
   */
  public int getNum() {
      return(num);
  }

  /** setter
   * 
   * @param x the new value for the object
   */
  public void setNum(int x) {
      num = x;
  }
  
  /** 
   * 
   * @return true if the integer value is an even number
   */
  public boolean isEven(){
      return (num%2==0);
  }
  
  /**
   * 
   * @return true if the integer value is a prime number
   */
  public boolean isPrime() {
	boolean isTrue=true;
	int i=2;

	while ((isTrue) && (i<num))
		if (num%i==0) isTrue=false;
		else i++;
	return(isTrue);
  }
  
  /**
   * 
   * @param other is a reference to another object of type IntegerProperties
   * @return true if this value integer is equal than the one stored in the received object
   */
  public boolean equals(IntegerProperties other) {
	  return(this.num==other.num);
  }
  
  
  /**
   * 
   * 
   * @return an object reference of type IntegerProperties 
   *         The new object contains the same information than the current one
   */
  public IntegerProperties copy() {
	  IntegerProperties clon= new IntegerProperties(num);
	  return(clon);
  }
  
  
  
  
  /*
   * We will add a method to check if
   * a number is an Amicable number of another one.
   * Two numbers are Amicable numbers if
   * The sum of the proper divisors of each is equal 
   * to the other number.  
   * 
   * For example: 220 i 284 are Amicable numbers
   * 
   * The proper divisors of a number are all
   * values between 1 and the previous value which
   * can divide the number with modulus 0. 

   */
  
  /** 
   * method to check if a number is an amicable number of another one received as a param.
   * @param p the instance to check its integer value with this instance
   * @return true if the numbers are amicable
   */
  public boolean areAmicable(IntegerProperties p) {
		return((this.getProperDivisors()==p.num) &&(num==p.getProperDivisors()));	
  }
  
  // Private method that helps us in the method areAmicable
  
  private int getProperDivisors() {
	int sum=0;
	for (int i=1; i<num; i++)
		if (num%i==0) sum+=i;
	return(sum);
  }

  /**
   * method toString
   * @return The integer value as a String message for the user
   */
   public String toString() {
	   return ("The integer value is "+num);
   }
}


