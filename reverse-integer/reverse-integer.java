class Solution {
    public int reverse(int x) {
        int n = x;
        if (n < 0) n *= -1;
        long sum = 0;

        while (n > 0) {
            sum = sum * 10 + x % 10;
            x = x / 10;
            n = n / 10;
        }

        if(sum < Math.pow(-2,31) || sum > Math.pow(2,31)) return 0;
        else return (int) sum;
    }
}