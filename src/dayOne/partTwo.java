package dayOne;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class partTwo {
    /*
    For each module mass, calculate its fuel and add it to the total.
    Then, treat the fuel amount you just calculated as the input mass and repeat the process,
    continuing until a fuel requirement is zero or negative. For example:
    The fuel required by a module of mass 100756 and its fuel is:
    33583 + 11192 + 3728 + 1240 + 411 + 135 + 43 + 12 + 2 = 50346.
     */
    public static int[] masses = {
            93326, 54591, 106194, 129163, 110634, 81294, 59548, 77988, 66354, 108990,
            91097, 102076, 67526, 135820, 109167, 94391, 78323, 75009, 61836, 55751,
            54229, 145159, 103821, 136601, 119830, 57607, 69157, 115099, 53756, 136063,
            62243, 111594, 57598, 83789, 130669, 67435, 112187, 141492, 109872, 84640,
            119694, 119030, 75716, 119017, 106547, 101674, 120137, 93759, 115976, 119378,
            86245, 93317, 53712, 69079, 92125, 62397, 102365, 115860, 111618, 65452,
            83625, 90951, 110774, 114943, 99559, 101417, 100651, 98412, 109963, 68158,
            121405, 85002, 119519, 92200, 125104, 71018, 131892, 92342, 51671, 94691,
            136330, 64877, 65449, 65008, 91656, 144705, 130867, 74732, 61977, 129490,
            91928, 109200, 94488, 99216, 89115, 89756, 52113, 83463, 101765, 62363};

    public static int fuelReq(int mass) {
        return (int) (Math.floor(mass / 3)) - 2;
    }

    public static ArrayList<Integer> fromMassToFuel(int[] masses) {
        ArrayList<Integer> fuelList = new ArrayList<>();
        for (int mass : partOne.masses) {
            int fuel = (int) fuelReq(mass);
            fuelList.add(fuel);
        }
        return fuelList;
    }
    public static int fuelOnFuel(int fuel) {
        int tempFuel = fuel;
        int collectedFuel = 0;
        for (int i = 0; i < 10; i++) {
            if (tempFuel >= 0)
                collectedFuel += tempFuel;
            tempFuel = fuelReq(tempFuel);
        }
        return collectedFuel;
    }

    public static void main(String[] args) {
        ArrayList <Integer> fuelList = fromMassToFuel(masses);
        int collectedFuel = 0;
        for(int i = 0; i < fuelList.size(); i++){
            collectedFuel += fuelOnFuel(fuelList.get(i));
        }
        System.out.println(collectedFuel);
    }
}
