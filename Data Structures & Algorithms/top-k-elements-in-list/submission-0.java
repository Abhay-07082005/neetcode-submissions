class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }
        }
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->map.get(b)-map.get(a));
        for(Integer x:map.keySet()){
            pq.add(x);
        }
        int []res=new int[k];
        int i=0;
        while(i<k){
            res[i]=pq.poll();
            i++;
        }
        return res;
    }
}
