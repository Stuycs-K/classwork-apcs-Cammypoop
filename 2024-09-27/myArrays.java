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
    public static void main(String[] args) {
        int[] a = new int[]{1,3,4,5};
        System.out.println("Variable: " + a  +". Expected: 1345. Returned:" + aryToString(a) );
        

    }
}
