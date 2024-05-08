
package main

const BITS_IN_INT32 = 32

func largestCombination(candidates []int) int {
	var largestCombination = 0

	for shifts := 0; shifts < BITS_IN_INT32; shifts++ {
		var frequencyCurrentBit = 0
		for _, value := range candidates {
			frequencyCurrentBit += (value >> shifts) & 1
		}
		largestCombination = max(largestCombination, frequencyCurrentBit)
	}
	return largestCombination
}
