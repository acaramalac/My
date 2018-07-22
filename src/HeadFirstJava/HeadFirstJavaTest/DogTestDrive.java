
package HeadFirstJava.HeadFirstJavaTest;

import jdk.nashorn.internal.ir.annotations.Ignore;

@Ignore
public class DogTestDrive {
    public static void main (String[] args) {
        Dog d = new Dog();
        d.size = 40;
        d.bark();
    }
}
