package lr7.Task2;


public class Main {
    public static void main(String[] args) {
        SuperClass first = new SuperClass("Hello, world!");
        System.out.println("Class = "+ first.getClass().getSimpleName() + " length = " + first.getTextLength());

        SubClass second = new SubClass("Hello, world!", 5);
        System.out.println("Class = "+ second.getClass().getSimpleName() + " length = " + second.getTextLength());
    }
}
