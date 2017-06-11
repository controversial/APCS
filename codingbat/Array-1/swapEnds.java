public int[] swapEnds(int[] nums) {
  int temp = nums[nums.length - 1];
  nums[nums.length - 1] = nums[0];
  nums[0] = temp;
  return nums;
}
