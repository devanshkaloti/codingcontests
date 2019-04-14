//import java.util.*;
//import java.io.*;
//
//public class Solution {
//    static int pos = 0;
//
//    public static void main(String[] args) {
//        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
//        int numTries = in.nextInt();
//
//
//
//        for (int i=1;numTries >= i; i++) {
//            int num = in.nextInt();
//
//            String[] numChars = split(num);
//            int pos = pos(numChars);
//
//            if (pos == -1) {
//                // No fours!
//
//            } else {
//                // Four found, been replaced
//                int numA = 0;
//                int numB = 0;
//
//                while (true) {
//                    numChars[pos] = String.valueOf((Integer.parseInt(numChars[pos])-1));
//
//                    numA = Integer.parseInt(String.join(",", numChars));
//                    numB = num - numA;
//
//                    if (checkDigitsForFour(numA) && checkDigitsForFour(numB)) {
//                        break;
//                    }
//                }
//                System.out.println(String.format("Case #%s: %s %s", i, numA, numB));
//            }
//        } // end for
//    }
//
//
//    public static int pos(String[] a) {
//        return Arrays.asList(a).indexOf("4");
//    }
//
//    public static String[] split(int a) {
//        return String.valueOf(a).split("");
//    }
//
//    public static boolean checkDigitsForFour(String[] array) {
//        for (String aa: array) {
//            if (aa.equals("4")) {
//                return false;
//            }
//            pos += 1;
//        }
//        return true;
//    }
//
//
//    public static boolean checkDigitsForFour(int num) {
//        for (int aa: Arrays.asList(num)) {
//            if (aa == 4) {
//                return false;
//            }
//            pos += 1;
//        }
//        return true;
//    }
//}
