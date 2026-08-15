class Solution {
    public int countOdds(int low, int high) {
        int count = (high - low) / 2;

        if (low % 2 != 0 || high % 2 != 0) {
            count++;
        }
        
        return count;
    }
}


Odd and even numbers alternate.
Every 2 numbers → 1 odd.

Start with:

(high - low) / 2
If low or high is odd → add 1.
No need to check every number → O(1).
