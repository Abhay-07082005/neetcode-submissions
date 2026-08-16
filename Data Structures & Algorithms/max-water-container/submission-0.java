class Solution {
    public int maxArea(int[] heights) {
        int l=0;
        int r=heights.length-1;
        int m=0;
        while(l<r){
            int h=Math.min(heights[l],heights[r]);
            int w=r-l;
            int area=h*w;
            m=Math.max(area,m);
            if(heights[l]<heights[r]){
                l++;
            }else{
                r--;
            }
        }
        return m;
    }
}
