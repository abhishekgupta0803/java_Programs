public class Duplicate{
    public static void duplicate(int nums[]){

        for(int i=0; i<nums.length; i++){
            if(nums[i] == nums[i+1-1]){
                System.out.println(nums[i]);
                continue;
            }
        
        }

    }
    public static void main(String[] args) {
        int nums[]={1,1,2,2,3};
        duplicate(nums);
    }
}