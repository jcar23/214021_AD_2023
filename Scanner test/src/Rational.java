import java.util.Objects;

public class Rational implements Comparable<Rational>{
    private int numerator;
    private int denominator;
    private Object o;

    public Rational(){
        this.numerator = 0;
        this.denominator = 0;
    }

    @Override
    public String toString() {
        return "Rational{" +
                "numerator=" + numerator +
                ", denominator=" + denominator +
                '}';
    }

    public Rational(int numerator, int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }


    @Override
    public boolean equals(Object o){
        this.o = o;
        Rational other = (Rational)o;
        return this.numerator == other.numerator && this.denominator == other.denominator;
    }
    /*
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rational rational)) return false;
        return numerator == rational.numerator && denominator == rational.denominator;
    }
*/

    @Override
    public int hashCode() {
        return Objects.hash(numerator, denominator, o);
    }

    @Override
    public int compareTo(Rational o) {

        /*
        double result = this.numerator / this.denominator;
        double result2 = o.numerator / o.denominator;
        return (int) (result - result2);
         */

        int numDiff = this.numerator - o.numerator;
        int denoDiff = this.denominator - o.denominator;
        return numDiff + denoDiff;
    }


}
