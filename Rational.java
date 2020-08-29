
public class Rational {
    private int numerator;
    private int denominator;

    public Rational(){
        numerator = 1;
        denominator = 1;
    }

    public Rational(int numerator, int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator(){
        return numerator;
    }

    public int getDenominator(){
        return denominator;
    }

    public void setNumerator(int numerator){
        this.numerator = numerator;
    }

    public void setDenominator(int denominator){
        this.denominator = denominator;
    }

    public Rational add(Rational secondNumber){
        int tempNumerator = this.numerator * secondNumber.getDenominator() + secondNumber.getNumerator() * this.denominator;
        int tempDenominator = this.denominator * secondNumber.getDenominator();
        return new Rational(tempNumerator, tempDenominator);
    }

    public Rational subtract(Rational secondNumber){
        int tempNumerator = this.numerator * secondNumber.getDenominator() - secondNumber.getNumerator() * this.denominator;
        int tempDenominator = this.denominator * secondNumber.getDenominator();
        return new Rational(tempNumerator, tempDenominator);
    }

    public Rational multiply(Rational secondNumber){
        int tempNumerator = this.numerator * secondNumber.getNumerator();
        int tempDenominator = this.denominator * secondNumber.getDenominator();
        return new Rational(tempNumerator, tempDenominator);
    }

    public Rational divide(Rational secondNumber){
        int tempNumerator = this.numerator * secondNumber.getDenominator();
        int tempDenominator = this.denominator * secondNumber.getNumerator();
        return new Rational(tempNumerator, tempDenominator);
    }

    public String toString(){
        return this.getNumerator() + "/" + this.getDenominator();
    }
}