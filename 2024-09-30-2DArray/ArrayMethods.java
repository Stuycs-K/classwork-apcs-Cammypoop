public class ArrayMethods {
    public static String arrToString(int[] nums){
        String out="[";
        for (int i=0;i<nums.length;i++){
            out+=nums[i];
            if (i!=nums.length-1){
                out+=", ";
            }
        }
        out+="]";
        return out;
    }   
    public static int arr2DSum(int[][]nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++){
            for (int ii = 0; i < nums[i].length; ii++){
                
            }
        }
    }
    public static void main(String[] args) {
        int [][] a = {{2,1},{3,4,5},{1}};
        System.out.println("Expected: 16 " + "Output: "arr2DSum(a));
        int [][] a = new int [][]{{},{},{}};
        System.out.println("Expected: 0 " + "Output: "arr2DSum(a));
        int [][] a = new int [][]{{23, 24, 29},{},{1}};
        System.out.println("Expected: 16 " + "Output: "arr2DSum(a));
        int [][] a = new int [][]{{1},{2},{3}};
        System.out.println("Expected: 6 " + "Output: "arr2DSum(a));
        int [][] a = new int [][]{{-23, 1, 2},{9, 11},{}};
        System.out.println("Expected: 0" + "Output: "arr2DSum(a));

    }
}
