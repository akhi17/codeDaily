package akhi.io.hundred;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class CustomArrayList extends ArrayList {

   @Override
    public boolean add(Object o){
        if (this.contains(o)){
            return true;
        }else {
            return super.add(o);
        }
    }

    public static void main(String[] args) {
        CustomArrayList cas = new CustomArrayList();
        cas.add(1);
        cas.add(1);
        cas.add(1);
        cas.add(1);
        cas.add(1);
        cas.add(3);
        cas.add(5);
        System.out.println(cas);

        Set<Student> set = new HashSet<>();
        Student s1 = new Student("akhilesh", 12, "A");
        Student s2 = new Student("akhilesh", 12, "A");
        Student s3 = new Student("bikash", 15, "B");
        set.add(s1);
        set.add(s2);
        set.add(s3);
        System.out.println(set);
    }

}
