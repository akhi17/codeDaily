//package akhi.io.eight;
//
//public class Coforge {
//
//
//    public static void main(String[] args) {
//        String test ="coforgetest";
//        System.out.println(longestSubstring(test));
//    }
//    //Op: forget
//
//    static String longestSubstring(String str){
//        int n = str.length();
//        String res = "";
//        for (int i = 0; i < n; i++) {
//            for (int j = i; j < n; j++) {
//                if (isDistinct(str,i,j)){
//                     res = String.valueOf(((res), j-i+1));
//                }
//            }
//        }
//        return res;
//    }
//
//    private static boolean isDistinct(String str, int i, int j) {
//        boolean[] test = new boolean[256];
//        for (int k = i; k <= j ; k++) {
//            if (test[str.charAt(k)] == true){
//                return  false;
//            }
//            test[str.charAt(k)] = true;
//        }
//        return true;
//    }
//}
