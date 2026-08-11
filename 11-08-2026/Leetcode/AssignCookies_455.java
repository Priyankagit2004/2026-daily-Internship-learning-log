class AssignCookies_455 {
    public int findContentChildren(int[] g, int[] s) {
        //first sort both the arrays 
        Arrays.sort(g);
        Arrays.sort(s);

        int left = 0; //greed pointer
        int right = 0; //size pointer

        while(left<g.length && right<s.length){
            if(s[right]>=g[left]){
                right++;
                left++;
            }
            else{
                right++;
            }
        }
        return left;

    }
}