class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int lv=0,rv=0,l=0,r=n-1,w=0;
        while(l<r){
            if(height[l]<height[r]){
                if(height[l]>=lv){
                    lv=height[l];
                }else{
                    w+=lv-height[l];
                }
                l++;
            }else{
                if(height[r]>=rv){
                    rv=height[r];
                }else{
                    w+=rv-height[r];
                }
                r--;
            }
        }
        return w;
    }
}
