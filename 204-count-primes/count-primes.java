class Solution {
    public int countPrimes(int n) {
        if (n <= 2) {
            return 0; // 2 se strictly chhota koi prime nahi hota
        }

        // '2' ek prime hai, isliye count shuru me 1 rakha
        int s = 1;

        // Sirf odd numbers check karenge: 3, 5, 7, 9, ...
        for (int i = 3; i < n; i += 2) {
            boolean isPrime = true;

            // Sirf square root tak check karo (j * j <= i)
            for (int j = 3; j * j <= i; j += 2) {
                if (i % j == 0) {
                    isPrime = false;
                    break; // factor milte hi aage check karne ki zaroorat nahi
                }
            }

            if (isPrime) {
                s++;
            }
        }

        return s;
    }
    
}