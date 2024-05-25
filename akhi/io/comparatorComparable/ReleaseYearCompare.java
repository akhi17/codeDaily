package akhi.io.comparatorComparable;

import java.util.Comparator;

public class ReleaseYearCompare implements Comparator<Movie> {
    @Override
    public int compare(Movie m1, Movie m2) {
        if (m1.getYear() < m2.getYear()) {
            return -1;
        } else if (m1.getYear() < m2.getYear()) {
            return 1;
        } else return 0;
    }

}
