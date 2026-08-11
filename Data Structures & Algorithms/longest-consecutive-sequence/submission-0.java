class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        int lon=0;
        for(int num:set){
            if(!set.contains(num-1)){
                int c=num;
                int len=1;
                while(set.contains(c+1)){
                    c++;
                    len++;
                }
                lon=Math.max(lon,len);
            }
        }
        return lon;
    }
}
