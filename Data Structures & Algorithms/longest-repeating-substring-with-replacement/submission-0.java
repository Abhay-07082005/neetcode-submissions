class Solution {
    public int characterReplacement(String s, int k) {
        int []f=new int[26];
        int l=0;
        int mf=0;
        int ans=0;
        for(int r=0;r<s.length();r++){
            int x=s.charAt(r)-'A';
            f[x]++;
            mf=Math.max(mf,f[x]);
            while((r-l+1)-mf>k){
                f[s.charAt(l)-'A']--;
                l++;
            }
            ans=Math.max(ans,r-l+1);
        }
        return ans;
    }
}
