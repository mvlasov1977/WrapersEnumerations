package org.example;
import org.example.Color;
public class Main {
    public static void main(String[] args) {
        /*
        Класи обгортки:
          Створіть об'єкти класу Double за допомогою методів valueOf().
          Перетворити значення типу String на тип double. Використовуємо метод Double.parseDouble().
          Перетворити об'єкт класу Double на всі примітивні типи.
          Вивести значення об'єкта Double на консоль.
          Перетворити літерал типу double до рядка: String d = Double.toString(3.14);
         */

        // Створюю об'єкт типу Double різними способами

        Double myFirstDouble = new Double(129.05); // з double

        Double mySecondDouble = new Double("11.05"); // з string

        Double myThirdDouble = Double.valueOf("12.05"); // за допомогою valueOf

        // перетворюю string до типу double
        double myValue = Double.parseDouble("13.05");

        // перетворюю Double до прімітивних типів
        byte myByteValue = myFirstDouble.byteValue();
        int myIntValue = myFirstDouble.intValue();
        float myFloatValue = myFirstDouble.floatValue();
        short myShortValue = myFirstDouble.shortValue();
        long myLongValue = myFirstDouble.longValue();
        double myDoubleValue = myFirstDouble.doubleValue();

        System.out.println("тип byte: " + myByteValue);
        System.out.println("тип int: " + myIntValue);
        System.out.println("тип float: " + myFloatValue);
        System.out.println("тип short: " + myShortValue);
        System.out.println("тип long: " + myLongValue);
        System.out.println("тип double: " + myDoubleValue);

        // перетворюю літерал типу double до рядка

        String myStringValue = Double.toString(129.05);
        System.out.println("тип String: " + myStringValue);

        System.out.println();
        /*
        Enum: Створити Enum Color, який буде зберегіати в собі перечислення кольорів.
              перевизначити для констант toString()
              та додати метод який повертає код кольору в форматі HEX(RGB)
              Переробити клас Shape з дз 7, щоб він містив колір в форматы нашого нового Enum Color
         */

        for (Color myColor: Color.values()) {
            System.out.println(myColor + " - " + myColor.getHexRGB() + " - " + myColor.name());
        }
    }
}