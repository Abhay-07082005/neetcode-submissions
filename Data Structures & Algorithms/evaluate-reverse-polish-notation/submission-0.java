class Solution {
    public int evalRPN(String[] tokens) {
        int []st=new int[tokens.length];
        int t=-1;
        for(int i=0;i<tokens.length;i++){
            if(tokens[i].equals("+")|| tokens[i].equals("-")|| tokens[i].equals("*")|| tokens[i].equals("/")){
            int b=st[t--];
            int a=st[t--];
            if(tokens[i].equals("+")){
                st[++t]=a+b;
            }else if(tokens[i].equals("-")){
                st[++t]=a-b;
            }else if(tokens[i].equals("*")){
                st[++t]=a*b;
            }else{
                st[++t]=a/b;
            }
            }else{
                st[++t]=Integer.parseInt(tokens[i]);
            }
        }
        return st[t];
    }
}