class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> complements = new HashMap<>();
        for(int i = 0; i < numbers.length; i++) {
            for(int j = i + 1; j < numbers.length; j++) {
                if(target - numbers[i] == numbers[j]) {
                    return new int[]{i + 1, j + 1};
                }
            }
        }
        return numbers;
    }
}
