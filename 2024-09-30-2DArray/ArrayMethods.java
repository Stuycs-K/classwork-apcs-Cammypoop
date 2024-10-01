// Steven Wu swu60@stuy.edu
// Haowen Xiao hxiao61@stuy.edu
public class ArrayMethods {
    public static String arrToString(int[] ary){
        String out="[";
        for (int i=0;i<ary.length;i++){
            out+=ary[i];
            if (i!=ary.length-1){
                out+=", ";
            }
        }
        out+="]";
        return out;
    }
    public static String arrToString(int[][] ary){
        String out = "[";
        for (int i = 0; i < ary.length; i++){
            out += arrToString(ary[i]);
            if (i!=ary.length-1){
                out+=", ";
            }
        }
        out += "]";
        return out;
    }
    public static int arr2DSum(int[][]nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++){
            for (int ii = 0; ii < nums[i].length; ii++){
                count += nums[i][ii];
            }
        }
        return count;
    }
    public static int[][] swapRC(int[][]nums){
        int[][] out = new int[nums[0].length][nums.length];
        for (int i = 0; i < nums.length; i++){
            for (int ii = 0; ii < nums[i].length; ii++){
                out[ii][i] = nums[i][ii];
            }
        }
        return out;
    }
    public static void main(String[] args) {
        int [][] a = {{2,1},{3,4,5},{1}};
        System.out.println("Expected: 16 " + "Output: " + arr2DSum(a));
        a = new int [][]{{},{},{}};
        System.out.println("Expected: 0 " + "Output: " + arr2DSum(a));
        a = new int [][]{{23, 24, 29},{},{1}};
        System.out.println("Expected: 77 " + "Output: " + arr2DSum(a));
        a = new int [][]{{1},{2},{3}};
        System.out.println("Expected: 6 " + "Output: " + arr2DSum(a));
        a = new int [][]{{-23, 1, 2},{9, 11},{}};
        System.out.println("Expected: 0" + "Output: " + arr2DSum(a));


        int[] b = {2, 1, 3};
        System.out.println("Expected: [2, 1, 3] " + "Output: " + arrToString(b));
        b = new int[] {};
        System.out.println("Expected: [] " + "Output: " + arrToString(b));
        b = new int[] { 0, -5, 7, 10 };
        System.out.println("Expected: [0, -5, 7, 10] " + "Output: " + arrToString(b));
        b = new int[] { 9 };
        System.out.println("Expected: [9] " + "Output: " + arrToString(b));


        int[][] c = {{2, 1}, {3, 4, 5}, {1}};
        System.out.println("Expected: [[2, 1], [3, 4, 5], [1]] " + "Output: " + arrToString(c));
        c = new int[][] {{}, {}, {}};
        System.out.println("Expected: [[], [], []] " + "Output: " + arrToString(c));
        c = new int[][] {{23, 24, 29}, {}, {1}};
        System.out.println("Expected: [[23, 24, 29], [], [1]] " + "Output: " + arrToString(c));
        c = new int[][] {{1}, {2}, {3}};
        System.out.println("Expected: [[1], [2], [3]] " + "Output: " + arrToString(c));
        c = new int[][] {{-23, 1, 2}, {9, 11}, {}};
        System.out.println("Expected: [[-23, 1, 2], [9, 11], []] " + "Output: " + arrToString(c));

        
        int[][] d = {{1, 2, 3}, {4, 5, 6}};
        int[][] result = swapRC(d);
        System.out.println("Expected: [[1, 4], [2, 5], [3, 6]] " + "Output: " + arrToString(result));
        d = new int[][] {{7, 8}, {9, 10}, {11, 12}};
        result = swapRC(d);
        System.out.println("Expected: [[7, 9, 11], [8, 10, 12]] " + "Output: " + arrToString(result));
        d = new int[][] {{1, 2}, {3, 4}};
        result = swapRC(d);
        System.out.println("Expected: [[1, 3], [2, 4]] " + "Output: " + arrToString(result));
        d = new int[][] {{5}};
        result = swapRC(d);
        System.out.println("Expected: [[5]] " + "Output: " + arrToString(result));
        d = new int[][] {{10, 20}, {30, 40}, {50, 60}, {70, 80}};
        result = swapRC(d);
        System.out.println("Expected: [[10, 30, 50, 70], [20, 40, 60, 80]] " + "Output: " + arrToString(result));

    }
}
