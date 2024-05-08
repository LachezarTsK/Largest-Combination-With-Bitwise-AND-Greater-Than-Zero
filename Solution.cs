
using System;

public class Solution
{
    private static readonly int BITS_IN_INT32 = 32;

    public int LargestCombination(int[] candidates)
    {
        int largestCombination = 0;

        for (int shifts = 0; shifts < BITS_IN_INT32; ++shifts)
        {
            int frequencyCurrentBit = 0;
            foreach (int value in candidates)
            {
                frequencyCurrentBit += (value >> shifts) & 1;
            }
            largestCombination = Math.Max(largestCombination, frequencyCurrentBit);
        }
        return largestCombination;
    }
}
