# integer-number-properties
5️⃣Check for an integer number with its properties such as evenness, primality, and the ability to check if it is an amicable number with another integer.


## IntegerProperties.java

This file contains the `IntegerProperties` class which represents an integer number with its properties such as evenness, primality, and the ability to check if it is an amicable number with another integer.

### Constructors

-   `IntegerProperties()`: Default constructor that initializes the number to 0.
-   `IntegerProperties(int num)`: Constructor that takes an integer parameter `num` and sets the number to its value.

### Methods

-   `int getNum()`: Getter method that returns the integer value of the object.
-   `void setNum(int x)`: Setter method that sets the value of the object to `x`.
-   `boolean isEven()`: Method that returns `true` if the integer value is even.
-   `boolean isPrime()`: Method that returns `true` if the integer value is prime.
-   `boolean equals(IntegerProperties other)`: Method that takes a reference to another object of type `IntegerProperties` and returns `true` if the value of the current object is equal to the one stored in the received object.
-   `IntegerProperties copy()`: Method that returns a new `IntegerProperties` object that contains the same information as the current one.
-   `boolean isAmicable(IntegerProperties other)`: Method that takes a reference to another object of type `IntegerProperties` and returns `true` if the current object and the received object are amicable numbers. Two numbers are amicable if the sum of the proper divisors of each is equal to the other number.

## Main.java

This file contains the main program that demonstrates the use of the `IntegerProperties` class.

### Methods

-   `public static void main(String[] args)`: The main method that creates instances of `IntegerProperties` class and tests its methods.

## Usage

To run the program, compile both `IntegerProperties.java` and `Main.java` using the following command:

    javac IntegerProperties.java Main.java 

Then, run the compiled program using the following command:

    java Main 


