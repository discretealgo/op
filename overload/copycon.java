class Complex {

	private double re, im;

	
	public Complex(double re, double im)
	{

		// this keyword refers to current instance itself
		this.re = re;
		this.im = im;
	}

	
	Complex(Complex c)
	{

		System.out.println("Copy constructor called");

		re = c.re;
		im = c.im;
	}

	
	@Override public String toString()
	{

		return "(" + re + " + " + im + "i)";
	}
}

// Class 2
// Main class
public class copycon {

	// Main driver method
	public static void main(String[] args)
	{

		// Creating object of above class
		Complex c1 = new Complex(10, 15);

		// Following involves a copy constructor call
		Complex c2 = new Complex(c1);

		// Note: Following doesn't involve a copy
		// constructor call
		// as non-primitive variables are just references.
		Complex c3 = c2;

		// toString() of c2 is called here
		System.out.println(c2);
	}
}

