public class myArrays{
    public static String aryToString(int[] nums){
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
    public static int[] returnCopy(int[]ary){
        int[] out = new int[ary.length];
        for (int i = 0; i < out.length; i++){
            out[i] = ary[i];
        }
        return out;
    }
    public static void main(String[] args) {
        System.out.println("aryToCopy(int[] nums):");
        // compare the strings
        int[] a = {1,3,4,5};
        System.out.println("Variable: " + "[1, 3, 4, 5]"  + ". Returned: " + aryToString(a) + ".");
        a = new int[]{5,6,13};
        System.out.println("Variable: " + "[5, 6, 13]"  + ". Returned: " + aryToString(a) + ".");
        a = new int[]{1};
        System.out.println("Variable: " + "[1]"  + ". Returned: " + aryToString(a) + ".");

        System.out.println("returnCopy(int[] ary):");
        System.out.println("(Correct output is false)");
        // check if they have different addresses
        a = new int[]{1,3,4,5};
        System.out.println("Variable: " + "[1, 3, 4, 5]"  + ". Returned: " + (returnCopy(a) == a));
        a = new int[]{5,6,13};
        System.out.println("Variable: " + "[5, 6, 13]"  + ". Returned: " + (returnCopy(a) == a));
        a = new int[]{1};
        System.out.println("Variable: " + "[1]"  + ". Returned: " + (returnCopy(a) == a));
    }
}
