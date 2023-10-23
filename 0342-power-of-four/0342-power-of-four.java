class Solution {
    public boolean isPowerOfFour(int n) {
        return n == 1 ||
            n == 1 << 2 ||
            n == 1 << 4 ||
            n == 1 << 6 ||
            n == 1 << 8 ||
            n == 1 << 10 ||
            n == 1 << 12 ||
            n == 1 << 14 ||
            n == 1 << 16 ||
            n == 1 << 18 ||
            n == 1 << 20 ||
            n == 1 << 22 ||
            n == 1 << 24 ||
            n == 1 << 26 ||
            n == 1 << 28 ||
            n == 1 << 30;
    }
}