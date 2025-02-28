/*
Project Euler #5

2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
*/

class Main {

    public static void main(String[] args) {
        System.out.println("Project Euler #5");

        int start = 1;
        int end = 20;

        int lcm = findLCM(start, end);
        System.out.println("Smallest multiple from " + start + " to " + end + ": " + lcm);
    }

    public static int findLCM(int start, int end) {
        int lcm = 1;

        for (int i = start; i <= end; i++) {
            lcm = lcm(lcm, i);
        }

        return lcm;
    }

    public static int lcm(int a, int b) {
        return a * (b / gcd(a, b));
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}