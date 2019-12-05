package dayTwo;

public class partTwo {
    public static int[] optiCode = {1, 12, 2, 3, 1, 1, 2, 3, 1, 3, 4, 3, 1, 5, 0, 3, 2, 9, 1, 19, 1, 19, 5, 23,
            1, 9, 23, 27, 2, 27, 6, 31, 1, 5, 31, 35, 2, 9, 35, 39, 2, 6, 39, 43, 2, 43, 13, 47, 2, 13, 47, 51, 1,
            10, 51, 55, 1, 9, 55, 59, 1, 6, 59, 63, 2, 63, 9, 67, 1, 67, 6, 71, 1, 71, 13, 75, 1, 6, 75, 79, 1, 9,
            79, 83, 2, 9, 83, 87, 1, 87, 6, 91, 1, 91, 13, 95, 2, 6, 95, 99, 1, 10, 99, 103, 2, 103, 9, 107, 1, 6,
            107, 111, 1, 10, 111, 115, 2, 6, 115, 119, 1, 5, 119, 123, 1, 123, 13, 127, 1, 127, 5, 131, 1, 6,
            131, 135, 2, 135, 13, 139, 1, 139, 2, 143, 1, 143, 10, 0, 99, 2, 0, 14, 0};
    public static int[] optiCodeTest = {1, 1, 1, 4, 99, 5, 6, 0, 99};

    public static int[] returnOptiCodes(int[] optiCode) {
        int[] tempArray = new int[optiCode.length];
        System.arraycopy(optiCode, 0, tempArray, 0, optiCode.length);
        return tempArray;
    }

    public static void intCodeComp(int[] optiCode) {
        for (int i = 0; i < optiCode.length; i++) {
            if (i % 4 == 0) {
                int position = optiCode[i + 3];
                int tal1 = optiCode[optiCode[i + 1]];
                int tal2 = optiCode[optiCode[i + 2]];
                if (optiCode[i] == 99)
                    break;
                if (optiCode[i] == 1)
                    optiCode[position] = tal1 + tal2;
                if (optiCode[i] == 2)
                    optiCode[position] = tal1 * tal2;
            }
        }
        if (optiCode[0] == 19690720) {
            System.out.println("Noun: " + optiCode[1]);
            System.out.println("Verb: " + optiCode[2]);
        }
    }

    public static void main(String[] args) {
        int[] codes = returnOptiCodes(optiCode);
        for (int k = 0; k < 99; k++) {
            for (int j = 0; j < 99; j++) {
                codes[1] = k;
                codes[2] = j;
                for (int i = 0; i < codes.length; i++) {
                    if (i % 4 == 0) {
                        int position = codes[i + 3];
                        int tal1 = codes[codes[i + 1]];
                        int tal2 = codes[codes[i + 2]];
                        if (codes[i] == 99){
                            if (codes[0] == 19690720) {
                                System.out.println("Noun: " + codes[1]);
                                System.out.println("Verb: " + codes[2]);
                                int nounVerb = (100 * codes[1]) + codes[2];
                                System.out.println(nounVerb);
                            }
                            break;
                        }
                        if (codes[i] == 1 && position < 153)
                            codes[position] = tal1 + tal2;
                        if (codes[i] == 2 && position < 153) {
                            codes[position] = tal1 * tal2;
                        }
                    }

                }
                codes = returnOptiCodes(optiCode);
            }
        }
    }
}

