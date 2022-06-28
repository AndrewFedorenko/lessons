package ua.levelup;

public class Lesson3 {
    public static void main(String[] args) {
        System.out.println("part 1:");
        part1();
        System.out.println("part 2:");
        part2();

    }

    static void part1(){
        int[] arr =  new int[100];

        System.out.println("From 0 to 99");
        for (int i = 0; i < 100; i++) {
            arr[i] = i;
            System.out.println(arr[i]);
        }
        System.out.println("From 100 to 1");
        for (int i = 99; i >=0; i--) {
            arr[i] = i+1;
            System.out.println(arr[i]);
        }

    }

    static void part2() {
        int[][] arr = new int[5][];

        int count = 1;

        for (int i = 0; i < 5; i++) {
            arr[i] = new int[i + 1];
            System.out.println("line " + i);

            for (int j = 0; j <= i; j++) {
                System.out.println("index " + j + " value " + count);
                arr[i][j] = count;
                count++;
            }

        }
    }
}
