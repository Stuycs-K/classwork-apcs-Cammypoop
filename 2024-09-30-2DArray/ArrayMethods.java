// Steven Wu swu60@stuy.edu
// Haowen Xiao hxiao61@stuy.edu
public class ArrayMethods {
    public static String arrToString(int[] ary) {
        String out = "[";
        for (int i = 0; i < ary.length; i++) {
            out += ary[i];
            if (i != ary.length - 1) {
                out += ", ";
            }
        }
        out += "]";
        return out;
    }

    public static String arrToString(int[][] ary) {
        String out = "[";
        for (int i = 0; i < ary.length; i++) {
            out += arrToString(ary[i]);
            if (i != ary.length - 1) {
                out += ", ";
            }
        }
        out += "]";
        return out;
    }

    public static int arr2DSum(int[][] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int ii = 0; ii < nums[i].length; ii++) {
                count += nums[i][ii];
            }
        }
        return count;
    }

    public static int[][] swapRC(int[][] nums) {
        int[][] out = new int[nums[0].length][nums.length];
        for (int i = 0; i < nums.length; i++) {
            for (int ii = 0; ii < nums[i].length; ii++) {
                out[ii][i] = nums[i][ii];
            }
        }
        return out;
    }

    // 3. Modify a given 2D array of integer as follows:
    // Replace all the negative values:
    // -When the row number is the same as the column number replace
    // that negative with the value 1
    // -All other negatives replace with 0
    public static void replaceNegative(int[][] vals) {
        for (int i = 0; i < vals.length; i++){
            for (int ii = 0; ii < vals[i].length; ii++) {
                if (vals[i][ii] < 0 && i == ii){
                    vals[i][ii] = 1;
                }
                else if (vals[i][ii] < 0){
                    vals[i][ii] = 0;
                }
            }
        }
    }

    // 4. Make a copy of the given 2d array.
    // When testing : make sure that changing the original does NOT change the copy.
    // DO NOT use any built in methods that "copy" an array.
    // You SHOULD write a helper method for this.
    // If you don't see a good way to do that, you should stop and look at prior
    // methods.
    public static int[][] copy(int[][] nums) {
        int[][] out = new int[nums.length][nums[0].length];
        for (int i = 0; i < out.length; i++){
            //out[i];
        }
        return out;
    }

    public static int[] onedcopy(int[] nums){
        int[] out = new int[nums.length];
        for (int i = 0; i < out.length; i++){
            out[i] = nums[i];
        }
        return out;
    }

    public static void main(String[] args) {
        int[][] a = { { 2, 1 }, { 3, 4, 5 }, { 1 } };
        System.out.println("Expected: 16 " + "Output: " + arr2DSum(a));
        a = new int[][] { {}, {}, {} };
        System.out.println("Expected: 0 " + "Output: " + arr2DSum(a));
        a = new int[][] { { 23, 24, 29 }, {}, { 1 } };
        System.out.println("Expected: 77 " + "Output: " + arr2DSum(a));
        a = new int[][] { { 1 }, { 2 }, { 3 } };
        System.out.println("Expected: 6 " + "Output: " + arr2DSum(a));
        a = new int[][] { { -23, 1, 2 }, { 9, 11 }, {} };
        System.out.println("Expected: 0" + "Output: " + arr2DSum(a));

        int[] b = { 2, 1, 3 };
        System.out.println("Expected: [2, 1, 3] " + "Output: " + arrToString(b));
        b = new int[] {};
        System.out.println("Expected: [] " + "Output: " + arrToString(b));
        b = new int[] { 0, -5, 7, 10 };
        System.out.println("Expected: [0, -5, 7, 10] " + "Output: " + arrToString(b));
        b = new int[] { 9 };
        System.out.println("Expected: [9] " + "Output: " + arrToString(b));

        int[][] c = { { 2, 1 }, { 3, 4, 5 }, { 1 } };
        System.out.println("Expected: [[2, 1], [3, 4, 5], [1]] " + "Output: " + arrToString(c));
        c = new int[][] { {}, {}, {} };
        System.out.println("Expected: [[], [], []] " + "Output: " + arrToString(c));
        c = new int[][] { { 23, 24, 29 }, {}, { 1 } };
        System.out.println("Expected: [[23, 24, 29], [], [1]] " + "Output: " + arrToString(c));
        c = new int[][] { { 1 }, { 2 }, { 3 } };
        System.out.println("Expected: [[1], [2], [3]] " + "Output: " + arrToString(c));
        c = new int[][] { { -23, 1, 2 }, { 9, 11 }, {} };
        System.out.println("Expected: [[-23, 1, 2], [9, 11], []] " + "Output: " + arrToString(c));

        int[][] d = { { 1, 2, 3 }, { 4, 5, 6 } };
        int[][] result = swapRC(d);
        System.out.println("Expected: [[1, 4], [2, 5], [3, 6]] " + "Output: " + arrToString(result));
        d = new int[][] { { 7, 8 }, { 9, 10 }, { 11, 12 } };
        result = swapRC(d);
        System.out.println("Expected: [[7, 9, 11], [8, 10, 12]] " + "Output: " + arrToString(result));
        d = new int[][] { { 1, 2 }, { 3, 4 } };
        result = swapRC(d);
        System.out.println("Expected: [[1, 3], [2, 4]] " + "Output: " + arrToString(result));
        d = new int[][] { { 5 } };
        result = swapRC(d);
        System.out.println("Expected: [[5]] " + "Output: " + arrToString(result));
        d = new int[][] { { 10, 20 }, { 30, 40 }, { 50, 60 }, { 70, 80 } };
        result = swapRC(d);
        System.out.println("Expected: [[10, 30, 50, 70], [20, 40, 60, 80]] " + "Output: " + arrToString(result));

        int[][] e = { { - 2, - 1 }, {  -3, -4,-5 }, { -1 } };
        replaceNegative(e);
        System.out.println("Expected: [[1, 0], [0, 1, 0], [0]] " + "Output: " + arrToString(e));
        e = new int[][] { {  2, - 1 }, {  -3, 4,-5 }, { 1 } };
        replaceNegative(e);
        System.out.println("Expected: [[2, 0], [0, 4, 0], [1]] " + "Output: " + arrToString(e));
        e = new int[][] { { 10 , 1 }, {  0 , -4,0 }, { -1, 1, -1 } };
        replaceNegative(e);
        System.out.println("Expected: [[10, 1], [0, 0, 0], [0, 1, 1]] " + "Output: " + arrToString(e));
        e = new int[][] { { -10, 20 }, { -30, -40 }, { -50, 60 }, { 70, -80 } };
        replaceNegative(e);
        System.out.println("Expected: [[1, 20], [0, 1], [0, 60], [70, 0]] " + "Output: " + arrToString(e));
    }
}
