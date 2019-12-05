package dayTwo;

public class partOne {

    /*
    1- Opcode 1 adds together numbers read from two positions and stores the result in a third position.
    The three integers immediately after the opcode tell you these three positions
    the first two indicate the positions from which you should read the input values,
    and the third indicates the position at which the output should be stored.

    2- Opcode 2 works exactly like opcode 1,
    except it multiplies the two inputs instead of adding them.
    Again, the three integers after the opcode indicate where the inputs and outputs are, not their values.

    99- Opcode 99 means that the program is finished and should immediately halt.
     */

    public static int[] optiCode = {1, 39, 51, 3, 1, 1, 2, 3, 1, 3, 4, 3, 1, 5, 0, 3, 2, 9, 1, 19, 1, 19, 5, 23,
            1, 9, 23, 27, 2, 27, 6, 31, 1, 5, 31, 35, 2, 9, 35, 39, 2, 6, 39, 43, 2, 43, 13, 47, 2, 13, 47, 51, 1,
            10, 51, 55, 1, 9, 55, 59, 1, 6, 59, 63, 2, 63, 9, 67, 1, 67, 6, 71, 1, 71, 13, 75, 1, 6, 75, 79, 1, 9,
            79, 83, 2, 9, 83, 87, 1, 87, 6, 91, 1, 91, 13, 95, 2, 6, 95, 99, 1, 10, 99, 103, 2, 103, 9, 107, 1, 6,
            107, 111, 1, 10, 111, 115, 2, 6, 115, 119, 1, 5, 119, 123, 1, 123, 13, 127, 1, 127, 5, 131, 1, 6,
            131, 135, 2, 135, 13, 139, 1, 139, 2, 143, 1, 143, 10, 0, 99, 2, 0, 14, 0};
    public static int[] optiCodeTest = {1, 1, 1, 4, 99, 5, 6, 0, 99};

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
    }

    public static void main(String[] args) {
        intCodeComp(optiCode);
        System.out.println(optiCode[0]);
    }
}
