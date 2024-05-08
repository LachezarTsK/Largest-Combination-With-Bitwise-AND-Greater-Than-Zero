
function largestCombination(candidates: number[]): number {
    const BITS_IN_INT32 = 32;
    let largestCombination = 0;

    for (let shifts = 0; shifts < BITS_IN_INT32; ++shifts) {
        let frequencyCurrentBit = 0;
        for (let value of candidates) {
            frequencyCurrentBit += (value >> shifts) & 1;
        }
        largestCombination = Math.max(largestCombination, frequencyCurrentBit);
    }
    return largestCombination;
};
