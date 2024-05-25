//package akhi.io.eight.multi;
//
//import java.util.Scanner;
//
//public interface Building {
//    void floorCompleted(int floorNumber);
//    void printStatus(int floorNumber);
//    void printNumberOfFloors();
//
//    public class School implements Building{
//
//        School(int n)
//        {
//            floors=new int[n];
//            for(int i=0;i<n;i++)
//            {
//                floors[i]=0;
//            }
//            System.out.println("A school is being constructed");
//        }
//        void floorCompleted(int floorNum){
//            if(floorNum<=n){
//                floors[floorNum-1]=1;
//                System.out.println("Construction for floor number "+floorNum+" completed in school");
//            }
//            else{
//                System.out.println("Floor number "+floorNum+" does not exist in school");
//            }
//        }
//        void printStatus(int floorNum){
//            if(floorNum>floors.length){
//                System.out.println("Floor number "+floorNum+" does not exist in school");
//            }
//            else if(floors[floorNum-1]==1){
//                System.out.println("Construction for floor number "+floorNum+" completed in school");
//            }
//            else{
//                if(floors[floorNum-1]==0){
//                    System.out.println("Construction for floor number "+floorNum+" not completed in school");
//                }
//            }
//        }
//        void printNumberOfFloors(){
//            System.out.println(floors.length);
//        }
//
//    }
//    public class Hospital implements Building{
//        hospital(int n)
//        {
//            floors=new int[n];
//            for(int i=0;i<n;i++)
//            {
//                floors[i]=0;
//            }
//            System.out.println("A hospital is being constructed");
//        }
//        void floorCompleted(int floorNum){
//            if(floorNum<=n){
//                floors[floorNum-1]=1;
//                System.out.println("Construction for floor number "+floorNum+" completed in hospital");
//            }
//            else{
//                System.out.println("Floor number "+floorNum+" does not exist in hospital");
//            }
//        }
//        void printStatus(int floorNum){
//            if(floorNum>floors.length){
//                System.out.println("Floor number "+floorNum+" does not exist in hospital");
//            }
//            else if(floors[floorNum-1]==1){
//                System.out.println("Construction for floor number "+floorNum+" completed in hospital");
//            }
//            else{
//                if(floors[floorNum-1]==0){
//                    System.out.println("Construction for floor number "+floorNum+" not completed in hospital");
//                }
//            }
//        }
//        void printNumberOfFloors(){
//            System.out.println(floors.length);
//        }
//    }
//    public class Solution {
//        public static void main(String[] args) throws Exception {
//            Scanner sc = new Scanner(System.in);
//            String[] floors = sc.nextLine().split(" ");
//            School s = new School(Integer.parseInt(floors[0]));
//            Hospital h = new Hospital(Integer.parseInt(floors[1]));
//            s.printNumberOfFloors();
//            h.printNumberOfFloors();
//
//            String[] floorNumber = sc.nextLine().split(" ");
//            for (int i =0; i< floorNumber.length;i++){
//                s.floorCompleted(Integer.parseInt(floorNumbers[i]));
//
//            }
//            floorNumbers=sc.nextLine().split(" ");
//            for (int i =0;i<floorNumbers.length;i++){
//                s.printStatus(Integer.parseInt(floorNumbers[i]));
//            }
//            floorNumbers = sc.nextLine().split(" ");
//            for (int i =0; i < floorNumbers.length; i++){
//                h.floorCompleted(Integer.parseInt(floorNumbers[i]));
//            }
//
//        }
//}
