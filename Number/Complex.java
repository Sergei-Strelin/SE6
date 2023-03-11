import java.util.Scanner;

public class Complex extends Number {
    public static Scanner input = new Scanner(System.in);
    MainLogger ml = new MainLogger();
    double realPart;
    double imaginaryPart;

    public void setRealPart(double realPart) {
        this.realPart = realPart;
    }

    public void setImaginaryPart(double imaginaryPart) {
        this.imaginaryPart = imaginaryPart;
    }
    public Complex(int a){
        setRealPart();
        setImaginaryPart();
    }
    public Complex(){

    }

    public double getRealPart() {
        return realPart;
    }

    public void setRealPart() {
        System.out.println("Введите действительную часть числа");
        double real = input.nextDouble();
        this.realPart = real;
    }

    public double getImaginaryPart() {
        return imaginaryPart;
    }

    public void setImaginaryPart() {
        System.out.println("Введите мнимую часть числа");
        double imag = input.nextDouble();
        this.imaginaryPart = imag;
    }

    @Override
    public String toString() {
        if (realPart == 0) return String.format("%.4f i", imaginaryPart);
        if (imaginaryPart == 0) return String.format("%.4f", realPart);
        if (imaginaryPart > 0)
            return String.format("%.4f + %.4fi", realPart, imaginaryPart); // + " + " + String.format("%.4f",imaginaryPart) +"i";
        else return String.format("%.4f - %.4fi", realPart, imaginaryPart); //,realPart) + " - " + String.format("%.4f",imaginaryPart) +"i";
    }

    @Override
    public void summa(Number x1, Number x2) {
        Complex newC = new Complex();
        newC.setRealPart(((Complex) x1).getRealPart() + ((Complex) x2).getRealPart());
        newC.setImaginaryPart(((Complex) x1).getImaginaryPart() + ((Complex) x2).getImaginaryPart());
        System.out.println((char) 27 + "[31mРезультат: (" + x1.toString() + ") + (" + x2.toString() + ") = " + newC.toString() + (char)27 + "[0m");
        ml.doLog(new Logger(String.format("(%s) + (%s) = %s", x1.toString(), x2.toString(), newC.toString())));        
    }

    @Override
    public void minus(Number x1, Number x2) {
        Complex newC = new Complex();
        newC.setRealPart(((Complex) x1).getRealPart() - ((Complex) x2).getRealPart());
        newC.setImaginaryPart(((Complex) x1).getImaginaryPart() - ((Complex) x2).getImaginaryPart());
        System.out.println((char) 27 + "[31mРезультат: (" + x1.toString() + ") - (" + x2.toString() + ") = " + newC.toString() + (char)27 + "[0m");
        ml.doLog(new Logger(String.format("(%s) - (%s) = %s", x1.toString(), x2.toString(), newC.toString())));
    }

    @Override
    public void mult(Number x1, Number x2) {
        Complex newC = new Complex();
        newC.setRealPart(((Complex) x1).getRealPart() * ((Complex) x2).getRealPart() -
                         ((Complex) x1).getImaginaryPart() * ((Complex) x2).getImaginaryPart());
        newC.setImaginaryPart(((Complex) x1).getRealPart() * ((Complex) x2).getImaginaryPart() +
                              ((Complex) x1).getImaginaryPart() * ((Complex) x2).getRealPart());
        System.out.println((char) 27 + "[31mРезультат: (" + x1.toString() + ") * (" + x2.toString() + ") = " + newC.toString() + (char)27 + "[0m");
        ml.doLog(new Logger(String.format("(%s) * (%s) = %s", x1.toString(), x2.toString(), newC.toString())));        
    }

    @Override
    public void div(Number x1, Number x2) {
        Complex newC = new Complex();
        newC.setRealPart((((Complex) x1).getRealPart() * ((Complex) x2).getRealPart() +
                          ((Complex) x1).getImaginaryPart() * ((Complex) x2).getImaginaryPart()) /
                (Math.pow(((Complex) x2).getRealPart(), 2) + Math.pow(((Complex) x2).getImaginaryPart(),2)));
        newC.setImaginaryPart((((Complex) x1).getImaginaryPart() * ((Complex) x2).getRealPart() -
                          ((Complex) x1).getRealPart() * ((Complex) x2).getImaginaryPart()) / 
                (Math.pow(((Complex) x2).getRealPart(), 2) + Math.pow(((Complex) x2).getImaginaryPart(),2)));
        System.out.println((char) 27 + "[31mРезультат: (" + x1.toString() + ") / (" + x2.toString() + ") = " + newC.toString() + (char)27 + "[0m");
        ml.doLog(new Logger(String.format("(%s) / (%s) = %s", x1.toString(), x2.toString(), newC.toString())));        
    }
}