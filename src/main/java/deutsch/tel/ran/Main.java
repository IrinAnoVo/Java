package deutsch.tel.ran;

public class Main {
    public static void main(String[] args) {
        String string = new String("I study Basic Java!");
        processString(string);
    }

    public static void processString(String str) {
        char lastChar = str.charAt(str.length() - 1);
        System.out.println("Последний символ строки: " + lastChar);
        boolean containsJava = str.contains("Java");
        System.out.println("Строка содержит подстроку 'Java': " + containsJava);
        String replacedStr = str.replace('a', 'o');
        System.out.println("Строка после замены 'a' на 'o': " + replacedStr);
        String upperStr = str.toUpperCase();
        System.out.println("Строка в верхнем регистре: " + upperStr);
        String lowerStr = str.toLowerCase();
        System.out.println("Строка в нижнем регистре: " + lowerStr);
        String substring = str.substring(str.indexOf("Java"), str.indexOf("Java") + 4);
        System.out.println("Вырезанная подстрока 'Java': " + substring);

        double num1 = 4;
        double num2 = 11;
        double sum = add(num1, num2);
        System.out.println("Сумма: " + sum);
        double difference = subtract(num1, num2);
        System.out.println("Разница: " + difference);
        double product = multiply(num1, num2);
        System.out.println("Произведение: " + product);
        double quotient = divide(num1, num2);
        System.out.println("Частное: " + quotient);
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Ошибка: Деление на ноль");
            return Double.NaN; // Возвращаем "не число" в случае деления на ноль
        }
        return a / b;
    }
}

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//public class Main {
//    public static void main(String[] args) {
//        Calculator calculator = new Calculator();
//        int a = 10;
//        int b = 20;
//        calculator.printAllCalculate(a, b);
//        String name = "Иван";
//        hello(name);
//        a = 20;
//        b = 40;
//        calculator.printAllCalculate(a, b);
//        name = "Евгений";
//        hello(name);
////        Math.
//    }
//    private static void hello(String name) {
//        System.out.println(" Привет " + name);
//    }
//}

//    public static void main(String[] args) {
//        System.out.println("Hello world!");
//        Cat vasya = new Cat();
//        Cat murzik = new Cat("Мурзик", 20);
//    }
//public class Main {

//    public static void main(String[] args) {
//        Cat cat1 = new Cat();
//        cat1.name = "барсик";
//        Cat cat2 = new Cat();
//        cat2.name = "мурзик";
//        cat1.meow();
//        cat2.meow();
//        Cat cat3 = new Cat();
//        cat3.name = "тиша";
//        cat1.meow();
//        cat2.meow();
//        cat3.meow();
//        System.out.println("Cat.counter = " + Cat.counter);
//    }
//}