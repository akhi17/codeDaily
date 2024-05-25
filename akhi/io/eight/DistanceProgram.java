package akhi.io.eight;

public class DistanceProgram {
    public static void main(String[] args) {
        int distance = 5;
        //op = 7
      int x =   countWays(distance);
        System.out.println(x);
    }

    private static int countWays(int distance) {
        if (distance == 0){
            return 1;
        }
        if (distance < 0){
            return 0;
        }
       return countWays(distance -1) + countWays(distance -2)+
                countWays(distance -3);
    }
}
