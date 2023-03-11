import java.util.Scanner;

public class Main {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        
        MainLogger ml = new MainLogger();
        
        boolean flag = true;
        boolean flag1 = true;
        boolean flag2 = true;
        String menu1 = "";
        String menu2 = "";
        int numberType = 0;

        System.out.println((char) 27 + "[34m Калькулятор выполняет 4 арифметических действия с \n"+
                                            "       рациональными и комплексными числами \n" + 
                                            "(с округлением результата до 4 знака после запятой)" + (char)27 + "[0m");

        
        while (flag2) {

              
            while (flag){
                System.out.println(menu());
                int whatDo = input.nextInt();
                switch(whatDo) {
                    case 1: 
                        numberType = 1;
                        flag = false;
                        flag1 = true;
                        menu1 = "рациональных";
                        break;                        
                    case 2:
                        numberType = 2;
                        flag = false;
                        flag1 = true;
                        menu1 = "комплексных";
                        break;                        
                    case 3:         
                        flag = false;
                        flag1 = false;
                        flag2 = false; 
                        menu1 = "Завершаем работу!";
                        ml.doLog(new Logger(menu1));
                        break;                        
                    default:
                        System.out.println((char) 27 + "[31mНет такого пункта меню!"+ (char)27 + "[0m");
                        ml.doLog(new Logger("Введён не правильный номер пункта меню выбора типа чисел- " + whatDo));
                }
            }        

            
            while (flag1){
                System.out.println(menuOperation());
                int whatDoOperation = input.nextInt();
                switch(whatDoOperation) {
                    case 1: 
                        menu2 = "сложение";
                        ml.doLog(new Logger(String.format("Выбрано %s двух %s чисел", menu2, menu1)));
                        if (numberType == 1) {
                            Rational rat = new Rational();
                            rat.summa(rat, new Rational()); }
                        if (numberType == 2) {
                            Complex compl = new Complex(1);
                            compl.summa(compl, new Complex(1));
                        }
                        flag = true;    
                        flag1 = false;
                        
                        break;
                    case 2:
                        menu2 = "вычитание";
                        ml.doLog(new Logger(String.format("Выбрано %s двух %s чисел", menu2, menu1)));
                        if (numberType == 1) {
                            Rational rat = new Rational();
                            rat.minus(rat, new Rational()); }
                        if (numberType == 2) {
                            Complex compl = new Complex(1);
                            compl.minus(compl, new Complex(1));}
                        flag = true;    
                        flag1 = false;
                        
                        break;
                    case 3: 
                        menu2 = "умножение";
                        ml.doLog(new Logger(String.format("Выбрано %s двух %s чисел", menu2, menu1)));
                        if (numberType == 1) {
                            Rational rat = new Rational();
                            rat.mult(rat, new Rational()); }
                        if (numberType == 2) {
                            Complex compl = new Complex(1);
                            compl.mult(compl, new Complex(1));
                        }
                        flag = true;    
                        flag1 = false;                        
                        break;
                    case 4:
                        menu2 = "деление";    
                        ml.doLog(new Logger(String.format("Выбрано %s двух %s чисел", menu2, menu1)));
                        if (numberType == 1) {
                            Rational rat = new Rational();
                            rat.div(rat, new Rational()); }
                        if (numberType == 2) {
                            Complex compl = new Complex(1);
                            compl.div(compl, new Complex(1));}
                        flag = true;    
                        flag1 = false;                        
                        break;
                    case 5: 
                        flag = true;    
                        flag1 = false;
                        ml.doLog(new Logger("Выходим из меню выбора действий над числами"));                        
                        break;                        
                    default:
                        System.out.println((char) 27 + "[31mНет такого пункта меню!"+ (char)27 + "[0m");
                        ml.doLog(new Logger("Введён не правильный номер пункта меню выбора действия - " + whatDoOperation));
                }
            }
            
        }   
    }                  

          
    private static String menu() {
        String menuStr = new StringBuilder()
        .append((char) 27 + "[34m\nВведите с какими числами работаем: \n"+ (char)27 + "[0m")
        .append("1 - рациональные \n")
        .append("2 - комплексные \n")
        .append("3 - Выход ")
        .toString();

        return menuStr;
    }

    
    private static String menuOperation() {
        String menuStr = new StringBuilder()
        .append((char) 27 + "[34m\nВыберите действие: \n"+ (char)27 + "[0m")
        .append("1 - сложение \n")
        .append("2 - вычитание \n")
        .append("3 - умножение \n")
        .append("4 - деление \n")
        .append("5 - Выход ")
        .toString();

        return menuStr;
    }
}
