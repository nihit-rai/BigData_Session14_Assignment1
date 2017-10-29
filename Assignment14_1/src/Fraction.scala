/**
 * Author Nihit Rai
 * This class is used to store a rational number
 * Also supports storing integer by using its auxiliary constructor
 * 
 * Provides methods to add, subtract, multiply 
 * and divide rational numbers and integers 
 *
 */
class Fraction(n: Int, d: Int) {
	// It makes no sense to have the denominator 0
	require(d != 0)
 
	private val g = gcd(n, d);
	val numerator : Int = n / g;
	val denominator : Int = d / g;
 
	// Determines the greatest common divisor of two numbers
	private def gcd(a: Int, b: Int) : Int ={
		if (b == 0) 
		  a; 
		else 
		  gcd(b, a % b);
	}
	
	//Print only numerator if number is integer i.e. denominator == 1
	override def toString ={
	  if(denominator==1)
	  {
		numerator+"";
	  }
	  else
	    {
	    numerator + "/" + denominator;
	    }
	    }
	
	//Auxiliary constructor to store an integer
	def this(num : Int){
	  this(num, 1);
	}
	
	
	 //Rational number addition
  def sum(a: Fraction, b: Fraction) : Fraction ={
	 var n1: Int = a.numerator * b.denominator;
	 var n2: Int = b.numerator * a.denominator;
	 var d: Int = a.denominator * b.denominator;
	 var n: Int = n1+n2;
	 var retFraction: Fraction = new Fraction(n,d);
	 return retFraction;
	}
  
  //Integer addition
  def sum(a: Int, b: Int) : Int ={
    var n1: Fraction = new Fraction(a);
    var n2: Fraction = new Fraction(b);
    var retInt = n1.numerator + n2.numerator;
    return retInt;	
	}
  
  
  //Rational number difference
  def subtract(a: Fraction, b: Fraction) : Fraction ={
	 var n1: Int = a.numerator * b.denominator;
	 var n2: Int = b.numerator * a.denominator;
	 var d: Int = a.denominator * b.denominator;
	 var n: Int = n1-n2;
	 var retFraction: Fraction = new Fraction(n,d);
	 return retFraction;
	}
  
  //Integer difference
  def subtract(a: Int, b: Int) : Int ={
    var n1: Fraction = new Fraction(a);
    var n2: Fraction = new Fraction(b);
    var retInt = n1.numerator - n2.numerator;
    return retInt;	
	}
  
  //Rational number multiplication
  def multiply(a: Fraction, b: Fraction) : Fraction ={
	 var n: Int = a.numerator * b.numerator;
	 var d: Int = a.denominator * b.denominator;
	 var retFraction: Fraction = new Fraction(n,d);
	 return retFraction;
	}
  
  //Integer multiplication
  def multiply(a: Int, b: Int) : Int ={
    var n1: Fraction = new Fraction(a);
    var n2: Fraction = new Fraction(b);
    var retInt = n1.numerator * n2.numerator;
    return retInt;	
	}
  
  //Rational number division
  def divide(a: Fraction, b: Fraction) : Fraction ={
	 var n: Int = a.numerator * b.denominator;
	 var d: Int = a.denominator * b.numerator;
	 var retFraction: Fraction = new Fraction(n,d);
	 return retFraction;
	}
  
  //Integer division
  def divide(a: Int, b: Int) : Double ={
    var n1: Fraction = new Fraction(a);
    var n2: Fraction = new Fraction(b);
    var retDbl: Double = n1.numerator / n2.numerator;
    return retDbl;	
	}
}



//Main object
object mainObj
{
    def main(args: Array[String]) {
        var f1: Fraction = new Fraction(4,10);
        var f2: Fraction = new Fraction(9,27);
        
        var n1: Int = 36;
        var n2: Int = 9;
        
        println("Sum of rational numbers is : "+ f1.sum(f1, f2));
        println("Sum of integers is : "+ f1.sum(n1, n2));
        
        println("Difference of rational numbers is : "+ f1.subtract(f1, f2));
        println("Difference of integers is : "+ f1.subtract(n1, n2));
        
        println("Product of rational numbers is : "+ f1.multiply(f1, f2));
        println("Product of integers is : "+ f1.multiply(n1, n2));
        
        println("Division result of rational numbers is : "+ f1.divide(f1, f2));
        println("Division result of integers is : "+ f1.divide(n1, n2));
    }
}

