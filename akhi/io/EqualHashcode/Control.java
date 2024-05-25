package akhi.io.EqualHashcode;

public class Control {

    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.setId(1);
        e1.setName("Akhi");

        Employee e2 = new Employee();
        e2.setId(1);
        e2.setName("Akhi");

//        System.out.println(e1.hashCode());
//        System.out.println(e2.hashCode());
//
//        System.out.println(e1.equals(e2));

        String s1 = "akhilesh";
        String s2 = "akhilesh";
        System.out.println(s1.equals(s2));

    }
}
