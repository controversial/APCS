public int maxTriple(int[] nums) {
  int largest = nums[0];
  largest = Math.max(largest, nums[nums.length / 2]);
  largest = Math.max(largest, nums[nums.length - 1]);
  return largest;
}
