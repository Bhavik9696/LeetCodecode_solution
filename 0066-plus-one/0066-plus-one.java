class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;

        for (int i = n - 1; i >= 0; i--) {
            // if the current digit is less than 9, just add 1 and return
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            // if the digit is 9, set it to 0 and continue
            digits[i] = 0;
        }

        // If we're here, it means all digits were 9 (e.g., [9,9,9])
        // So we need a new array with an extra digit, like [1,0,0,0]
        int[] result = new int[n + 1];
        result[0] = 1; // rest are already 0 by default
        return result;
    }
}
