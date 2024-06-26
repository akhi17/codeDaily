package akhi.io.comparatorComparable;

public class Movie implements Comparable<Movie> {

    private double rating;
    private String name;
    private int year;

    public Movie(double rating, String name, int year) {
        this.rating = rating;
        this.name = name;
        this.year = year;
    }


    public double getRating() {
        return rating;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Movie{" + "rating=" + rating + ", name='" + name + '\'' + ", year=" + year + '}';
    }

    public int compareTo(Movie m) {
        return this.year - m.year;
    }
}
