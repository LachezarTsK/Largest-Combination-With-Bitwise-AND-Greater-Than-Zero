
public class Solution {

    private static final int BITS_IN_INT32 = 32;

    public int largestCombination(int[] candidates) {
        int largestCombination = 0;

        for (int shifts = 0; shifts < BITS_IN_INT32; ++shifts) {
            int frequencyCurrentBit = 0;
            for (int value : candidates) {
                frequencyCurrentBit += (value >> shifts) & 1;
            }
            largestCombination = Math.max(largestCombination, frequencyCurrentBit);
        }
        return largestCombination;
    }
}
