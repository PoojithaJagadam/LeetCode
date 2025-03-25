class Solution {

    static boolean check(int[][] rectangles,int k) {
        int gap=0;
        Arrays.sort(rectangles, (a,b)-> a[k]-b[k]);
        int end=rectangles[0][k+2];
        for(int i=1;i<rectangles.length;i++) {
            if(end<=rectangles[i][k])
                gap++;
            end=Math.max(end,rectangles[i][k+2]);
        }
        return gap>=2;
    }
    public boolean checkValidCuts(int n, int[][] rectangles) {
        return check(rectangles,0) || check(rectangles,1);
    }
}