import java.util.Scanner;

public class Rational extends Number {
    public static Scanner input = new Scanner(System.in);
    MainLogger ml = new MainLogger();

    private double number;

    public Rational() {
        setNumber(); 
    }


    public void setNumber() {
        System.out.println("Введите число (разделитель - запятая!)");
        this.number = input.nextDouble();
    }


    public double getNumber() {
        return number;
    }


    @Override
    public String toString() {
        return String.format("%.4f",number) ; 
    }


    @Override
    public void summa(Number x1, Number x2) {
        Double newR = ((Rational) x1).getNumber() + ((Rational) x2).getNumber();
        System.out.println((char) 27 + "[31mРезультат: " + x1.toString()+" + "+x2.toString() + " = " + String.format("%.4f",newR) + (char)27 + "[0m");
        ml.doLog(new Logger(String.format("%s + %s = %.4f", x1.toString(), x2.toString(), newR)));
        
    }


    @Override
    public void minus(Number x1, Number x2) {
        Double newR = ((Rational) x1).getNumber() - ((Rational) x2).getNumber();
        System.out.println((char) 27 + "[31mРезультат: " + x1.toString() + " - " + x2.toString() + " = " + String.format("%.4f",newR) + (char)27 + "[0m");
        ml.doLog(new Logger(String.format("%s - %s = %.4f", x1.toString(), x2.toString(), newR)));
        
    }


    @Override
    public void mult(Number x1, Number x2) {
        Double newR = ((Rational) x1).getNumber() * ((Rational) x2).getNumber();
        System.out.println((char) 27 + "[31mРезультат: " + x1.toString() + " * "+ x2.toString() + " = " + String.format("%.4f",newR) + (char)27 + "[0m");
        ml.doLog(new Logger(String.format("%s * %s = %.4f", x1.toString(), x2.toString(), newR)));
        
    }


    @Override
    public void div(Number x1, Number x2) {
        Double newR = ((Rational) x1).getNumber() / ((Rational) x2).getNumber();
        System.out.println((char) 27 + "[31mРезультат: " + x1.toString() + " / "+ x2.toString() + " = " + String.format("%.4f",newR) + (char)27 + "[0m");
        ml.doLog(new Logger(String.format("%s / %s = %.4f", x1.toString(), x2.toString(), newR)));        
    }
}