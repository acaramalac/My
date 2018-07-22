package HeadFirstJava;

import jdk.nashorn.internal.ir.annotations.Ignore;

@Ignore
public class Duck {

    int size;

    public Duck (int duckSize) {
        System.out.println("Quack");
        size = duckSize;
        System.out.println("Your Duck's size is " + duckSize);
    }
}
