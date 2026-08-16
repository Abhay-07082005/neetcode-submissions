class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0;
        HashSet<Character> set=new HashSet<>();
        int maxlen=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            while(set.contains(c)){
                set.remove(s.charAt(l));
                l++;
            }
            set.add(c);
            maxlen=Math.max(maxlen,i-l+1);
        }
        return maxlen;
    }
}
