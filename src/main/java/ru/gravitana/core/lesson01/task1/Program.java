package ru.gravitana.core.lesson01.task1;

import ru.gravitana.core.lesson01.services.Calculator;
import ru.gravitana.core.lesson01.utils.Decorator;

/*
 * javac -sourcepath ./java -d out java/ru/gravitana/core/lesson01/task1/Program.java
 * java -classpath ./out ru.gravitana.core.lesson01.task1.Program
 * javadoc -encoding utf8 -d docs -sourcepath ./java -cp ./out -subpackages ru
 */

/**
 * Основной класс приложения. Здесь мы можем описать
 * его основное назначение и способы взаимодействия с ним.
 */
public class Program {
    public static void main(String[] args) {

        int result = Calculator.add(2, 2);
        System.out.println(Decorator.decorate(result));

        result = Calculator.sub(2, 2);
        System.out.println(Decorator.decorate(result));

        result = Calculator.mul(2, 2);
        System.out.println(Decorator.decorate(result));

        result = Calculator.div(2, 2);
        System.out.println(Decorator.decorate(result));
    }
}
