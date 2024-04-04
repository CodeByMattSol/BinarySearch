package org.main;

public class Main {
    public static void main(String[] args) {
        double[] numbersSorted = new double[]{3.0, 3.8, 4.5, 8.9, 11.3, 14.7};

        double findNumber = 11.3;

        int l, r, index;
        l = 0; r = numbersSorted.length; index = -1;

        while (l <= r) {
            int mid = (l + r) / 2;

            if (findNumber == numbersSorted[mid]) {
                index = mid;
                break;
            }

            if (findNumber > numbersSorted[mid]) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }

        System.out.println(index);
    }
}