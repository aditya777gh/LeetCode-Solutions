class Solution {
    public double myPow(double x, int n) {
        long N = n; // 32-bit int overflow se bachne ke liye

        if (N < 0) {
            x = 1 / x;
            N = -N;
        }

        double ans = 1.0;
        double currentProduct = x;

        while (N > 0) {
            // Agar power odd hai, toh ek base ans me multiply kar lo
            if (N % 2 == 1) {
                ans *= currentProduct;
            }
            // Base ko square karo aur power ko aadha
            currentProduct *= currentProduct;
            N /= 2;
        }

        return ans;
    }
}