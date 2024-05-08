
import kotlin.math.max

class Solution {

    private companion object {
        const val BITS_IN_INT32 = 32
    }

    fun largestCombination(candidates: IntArray): Int {
        var largestCombination = 0

        for (shifts in 0..<BITS_IN_INT32) {
            var frequencyCurrentBit = 0
            for (value in candidates) {
                frequencyCurrentBit += (value shr shifts) and 1
            }
            largestCombination = max(largestCombination, frequencyCurrentBit)
        }
        return largestCombination
    }
}
