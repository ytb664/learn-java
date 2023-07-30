public class ComplexNumber {
    // write your code here
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {

        this.real = real;
        this.imaginary = imaginary;
    }

    public void add(double real, double imaginary) {

        this.real += real;
        this.imaginary += imaginary;
    }

    public void add(ComplexNumber complexnumber) {

        add(complexnumber.getReal(), complexnumber.getImaginary());
    }

    public void subtract(double real, double imaginary) {

        this.real -= real;
        this.imaginary -= imaginary;
    }

    public void subtract(ComplexNumber other) {

        subtract(other.getReal(), other.getImaginary());
    }

    public double getReal() {

        return real;
    }

    public double getImaginary() {

        return imaginary;
    }
}