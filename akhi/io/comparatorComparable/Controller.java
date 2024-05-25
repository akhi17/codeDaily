package akhi.io.comparatorComparable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Controller {
    public static void main(String[] args) {
        ArrayList<Movie> list = new ArrayList<Movie>();
        list.add(new Movie(8.3, "Force", 2015));
        list.add(new Movie(8.7, "Star", 1977));
        list.add(new Movie(8.8, "Empire", 1980));
        list.add(new Movie(8.4, "Return", 1983));
        list.add(new Movie(5.4, "fast", 2003));
        list.add(new Movie(3.4, "Son",1890));

        Collections.sort(list);
        System.out.println("Movies after sorting using comparable compareTo method: ");
         list.forEach(temp -> {System.out.println(temp);});

        RatingCompare ratingCompare = new RatingCompare();
        System.out.println("Movies after sorting by Rating using comparator: ");
        Collections.sort(list, ratingCompare);
        list.forEach(temp -> {System.out.println(temp);});

        ReleaseYearCompare releaseYearCompare = new ReleaseYearCompare();
        System.out.println("Movies after sorting by year using comparator: ");
        Collections.sort(list,releaseYearCompare);
        list.forEach(temp -> {
            System.out.println(temp);
        });

    }
}
