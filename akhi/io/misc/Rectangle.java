package akhi.io.misc;

public class Rectangle {
    int length = 5;
    int breadth = 3;

    public static void main(String[] args) {
        Rectangle obj1 = new Rectangle();

        Rectangle obj2 = obj1;
        System.out.println(" Before Changing the value of object 1, the object2 will be - ");
        System.out.println(" Object2 Length = "+obj2.length+", Object2 Breadth = "+obj2.breadth);

        obj1.length = 10;
        obj1.breadth = 20;

        System.out.println("\n After Changing the value of object 1, the object2 will be - ");
        System.out.println(" Object2 Length = "+obj2.length+", Object2 Breadth = "+obj2.breadth);
    }
}
