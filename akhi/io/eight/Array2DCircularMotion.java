package akhi.io.eight;

public class Array2DCircularMotion {
    static class petrolPump {
        int petrol;
        int distance;

        public petrolPump(int petrol, int distance) {
            this.petrol = petrol;
            this.distance = distance;
        }
    }

    public static void main(String[] args) {
        petrolPump[] arr = {
                new petrolPump(6, 4),
                new petrolPump(3, 6),
                new petrolPump(7, 3)};
        int start = printTour(arr, arr.length);
        System.out.println(start);
    }

    private static int printTour(petrolPump[] arr, int n) {
        int start = 0;
        int end = 1;
        int curr_petrol = arr[start].petrol - arr[start].distance;
        while(end != start || curr_petrol < 0){
            while(curr_petrol < 0 && start != end){
                curr_petrol -= arr[start].petrol - arr[start].distance;
                start = (start + 1) % n;
                if(start == 0)
                    return -1;
            }
            curr_petrol += arr[end].petrol - arr[end].distance;

            end = (end + 1)%n;
        }
        return start;
    }
}
