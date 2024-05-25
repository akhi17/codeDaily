package akhi.io.misc;

public class Child extends Parent {

    public void eat(){
        System.out.println("Boy is eating");
    }
    public void sleep(){
        System.out.println("Boy is sleeping");
    }

    public void breathe(){
        System.out.println("Boy is breathing");
    }

    public void walk(){
        System.out.println("boy is walking");
    }
    public static void main(String[] args) {

        Parent a = new Child();
        a.eat();
        a.sleep();
        a.breathe();

    }
}
