package lr7.Task1;

public class Main {
    public static void main(String[] args) {
        SuperClass first = new SuperClass("SuperClass");
        System.out.println(first.toString());
        SubClass second = new SubClass("SubClass");
        System.out.println(second.toString());
        SubClass third = new SubClass("SubClass", "Hello, world!");
        System.out.println(third.toString());
    }
}
