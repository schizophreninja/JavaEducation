package lr7.Task5;

public class Main {
    public static void main(String[] args) {
        SuperClass superClass = new SuperClass("Super");
        SubClass subClass = new SubClass("Sub", 5);
        SecondSubClass secondSubClass = new SecondSubClass("SecondSub", 'e');

        superClass.display();
        subClass.display();
        secondSubClass.display();

        SuperClass superSubClass = new SubClass("SuperSubClass", 8);
        superSubClass.display();
    }
}
