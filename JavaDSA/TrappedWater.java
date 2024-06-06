class TrappedWater{
    public static void trappedRain(int height[]){
        int n = height.length;
        int leftMax[] = new int[n];
        leftMax[0] = height[0];

        for(int i=1; i<n; i++){
        leftMax[i]=  Math.max(leftMax[i-1], height[i]);
        }

        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];

        for(int i = n-2; i>=0; i--){
        rightMax[i] =  Math.max(rightMax[i+1], height[i]);
        }

        //trapped water
        int TrappedWater = 0;
        for(int i=0; i<n; i++){
            int waterLevel = Math.min(leftMax[i],rightMax[i]);
            TrappedWater += waterLevel - height[i];

        }

        System.out.println(TrappedWater );

    }
    public static void main(String[] args) {
        int height[]={4,2,0,6,3,2,5};
        trappedRain(height);
    }
}