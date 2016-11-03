public boolean array220(int[] nums, int index) {
  if (index == nums.length) return false;
  if (index == 0) return array220(nums, 1); // Start at 1
  return nums[index] == nums[index-1] * 10 || array220(nums, index + 1);
}
