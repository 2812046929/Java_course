package exercise08;

import java.math.BigInteger;

public class Rational extends Number implements Comparable<Rational> {
  // Data fields for numerator and denominator
  private BigInteger numerator = new BigInteger("0");//·Ö×Ó
  private BigInteger denominator = new BigInteger("1");//·ÖÄ¸
  private static BigInteger zero=new BigInteger("0");
  private static BigInteger one=new BigInteger("1");
  /** Construct a rational with default properties */
  public Rational() {
    this(zero,one);
  }

  /** Construct a rational with specified numerator and denominator */
  public Rational(String num, String den) {
	numerator=new BigInteger(num);
	denominator=new BigInteger(den);	
    BigInteger gcd = gcd(numerator, denominator);

    this.numerator = ((denominator.compareTo(zero)==1) ? one : one.negate()).multiply(numerator).divide(gcd) ;
    this.denominator = denominator.abs().divide(gcd);
  }
  public Rational(BigInteger numerator, BigInteger denominator) {
    BigInteger gcd = gcd(numerator, denominator);
    this.numerator = ((denominator.compareTo(zero)==1) ? one : one.negate()).multiply(numerator).divide(gcd) ;
    this.denominator = denominator.abs().divide(gcd);
  }

  /** Find GCD of two numbers */
  private static BigInteger gcd(BigInteger n, BigInteger d) {
    BigInteger n1 =n.abs();
    BigInteger n2 = d.abs();
    BigInteger gcd=new BigInteger("2");
    BigInteger k=one;
   while(k.compareTo(n1)==-1  && k.compareTo(n2)==-1) {
    	if(n1.mod(k).compareTo(zero)==0 && n2.mod(k).compareTo(zero)==0) {
    		gcd=k;
    	}
    	k=k.add(one);
//    	System.out.println(k);
    }
    
    return gcd;
  }

  /** Return numerator */
  public BigInteger getNumerator() {
    return numerator;
  }

  /** Return denominator */
  public BigInteger getDenominator() {
    return denominator;
  }

  /** Add a rational number to this rational */
  public Rational add(Rational secondRational) {
    BigInteger n = numerator.multiply(secondRational.getDenominator()).add(
      denominator.multiply(secondRational.getNumerator()));
    BigInteger d = denominator.multiply(secondRational.getDenominator());
    return new Rational(n, d);
  }

  /** Subtract a rational number from this rational */
  public Rational subtract(Rational secondRational) {
    BigInteger n = numerator.multiply(secondRational.getDenominator()).subtract(
      denominator.multiply(secondRational.getNumerator()));
    BigInteger d = denominator.multiply(secondRational.getDenominator());
    return new Rational(n, d);
  }

  /** Multiply a rational number to this rational */
  public Rational multiply(Rational secondRational) {
    BigInteger n = numerator.multiply(secondRational.getNumerator());
    BigInteger d = denominator.multiply(secondRational.getDenominator());
    return new Rational(n, d);
  }

  /** Divide a rational number from this rational */
  public Rational divide(Rational secondRational) {
    BigInteger n = numerator.multiply(secondRational.getDenominator());
    BigInteger d = denominator.multiply(secondRational.getNumerator());
    return new Rational(n, d);
  }

  @Override  
  public String toString() {
    if (denominator.compareTo(one)==0)
      return numerator + "";
    else
      return numerator + "/" + denominator;
  }

  @Override // Override the equals method in the Object class 
  public boolean equals(Object other) {
    if ((this.subtract((Rational)(other))).getNumerator().compareTo(zero)==0)
      return true;
    else
      return false;
  }

  @Override
  public int hashCode(){
    return (int)(this.numerator.multiply(new BigInteger("127")).add(this.denominator.multiply(new BigInteger("7")))).longValue();
  }
  @Override // Implement the abstract intValue method in Number 
  public int intValue() {
    return (int)doubleValue();
  }

  @Override // Implement the abstract floatValue method in Number 
  public float floatValue() {
    return (float)doubleValue();
  }

  @Override // Implement the doubleValue method in Number 
  public double doubleValue() {
    return numerator.doubleValue()/denominator.doubleValue();
  }

  @Override // Implement the abstract longValue method in Number
  public long longValue() {
    return (long)doubleValue();
  }

  @Override // Implement the compareTo method in Comparable
  public int compareTo(Rational o) {
    if (this.subtract(o).getNumerator().compareTo(zero)==1)
      return 1;
    else if (this.subtract(o).getNumerator().compareTo(zero)==-1)
      return -1;
    else
      return 0;
  }
}