package dayThree;

import java.util.LinkedList;
import java.util.List;

public class partOne {
    int[][] wirePanel = new int[1000][1000];
    String[] cable1 = {"R75", "D30", "R83", "U83", "L12", "D49", "R71", "U7", "L72", "U62", "R66", "U55", "R34", "D71", "R55", "D58", "R83"};
    String[] cable2 = {"R98", "U47", "R26", "D63", "R33", "U87", "L62", "D20", "R33", "U53", "R51", "U98", "R91", "D20", "R16", "D67", "R40", "U7", "R15", "U6", "R7"};
    public static String[] testCable1 = {"R8", "U5", "L5", "D3"};
    public static String[] testCable2 = {"U7", "R6", "D4", "L4"};

    public static LinkedList<String> wiredTest = new LinkedList<>();

    public static void coords(String[] cable) {
        int x = 0;
        int y = 0;
        int tempX = 0;
        int tempY = 0;
        for (int i = 0; i < cable.length; i++) {
            String direction = "" + cable[i].charAt(0);
            if (direction.equals("R")) {
                tempX += x;
                x += Integer.parseInt(cable[i].substring(1, cable[i].length()));
                for (; tempX <= x; tempX++) {
                    wiredTest.add(tempX + "," + tempY);
                }
            }
            if (direction.equals("L")) {
                tempX += x;
                x -= Integer.parseInt(cable[i].substring(1, cable[i].length()));
                for (; tempX >= x; tempX--) {
                    wiredTest.add(tempX + "," + tempY);
                }
                if (direction.equals("U")) {
                    tempY += y;
                    y += Integer.parseInt(cable[i].substring(1, cable[i].length()));
                    for (; tempY >= y; tempY--) {
                        wiredTest.add(tempX + "," + tempY);
                    }
                }
                if (direction.equals("D")) {
                    tempY += y;
                    y -= Integer.parseInt(cable[i].substring(1, cable[i].length()));
                    for (; tempY >= y; tempY--) {
                        wiredTest.add(tempX + "," + tempY);
                    }
                }
                //  if (i == (cable.length - 1))
                //   System.out.println("1: X: " + x + " Y: " + y);
            }
        }
    }
    public static void main(String[] args) {
        coords(testCable2);
        System.out.println(wiredTest);
        int x = 0;
        int y = 0;

        for (int i = 0; i < testCable1.length; i++) {
            String test = "" + testCable1[i].charAt(0);
            if (test.equals("R")) {
                x += Integer.parseInt(testCable1[i].substring(1, testCable1[i].length()));
            }
            if (test.equals("L"))
                x -= Integer.parseInt(testCable1[i].substring(1, testCable1[i].length()));
            if (test.equals("U"))
                y += Integer.parseInt(testCable1[i].substring(1, testCable1[i].length()));
            if (test.equals("D"))
                y -= Integer.parseInt(testCable1[i].substring(1, testCable1[i].length()));
            if (i == (testCable1.length - 1))
                System.out.println("2: X: " + x + " Y: " + y);
        }
    }
}

