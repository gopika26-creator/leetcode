class Solution {
    public boolean checkGoodInteger(int n) {
        int digitsum = 0;
        int Squaresum = 0;
        while(n>0){
            int x = n%10;
            digitsum += x;
            Squaresum += x*x;
            n /= 10; 
        }
        return Squaresum - digitsum >= 50;
    }
}