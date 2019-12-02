package dayOne;

public class partOne {
    /*
Fuel required to launch a given module is based on its mass.
Specifically, to find the fuel required for a module:
take its mass, divide by three, round down, and subtract 2.
 */
   public static int [] masses = {93326, 54591, 106194, 129163, 110634, 81294, 59548, 77988, 66354, 108990, 91097, 102076, 67526,
            135820, 109167, 94391,78323, 75009, 61836, 55751, 54229, 145159, 103821, 136601, 119830, 57607, 69157, 115099,
            53756, 136063, 62243, 111594, 57598, 83789, 130669, 67435, 112187, 141492, 109872, 84640, 119694, 119030, 75716,
            119017, 106547, 101674, 120137, 93759, 115976, 119378, 86245, 93317, 53712, 69079, 92125, 62397, 102365,
            115860, 111618, 65452, 83625, 90951, 110774, 114943, 99559, 101417, 100651, 98412, 109963, 68158, 121405,
            85002, 119519, 92200, 125104, 71018, 131892, 92342, 51671, 94691, 136330, 64877, 65449, 65008, 91656, 144705,
            130867, 74732, 61977, 129490, 91928, 109200, 94488, 99216, 89115, 89756, 52113, 83463, 101765, 62363};
    public static double countFuelReq(int mass){
        return (Math.floor(mass / 3)) - 2;
    }
    public static int countCollectedFuel(int [] masses){
        int collectedFuel = 0;
        for(int mass : partOne.masses){
            collectedFuel += partOne.countFuelReq(mass);
        }
        return collectedFuel;
    }
    public static void main(String[] args) {

        System.out.println(countCollectedFuel(masses));
        System.out.println(countFuelReq(1969));
        System.out.println(countFuelReq(100756));
        System.out.println(countFuelReq(14));
        System.out.println(countFuelReq(12));
    }
}
