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

    }
}
