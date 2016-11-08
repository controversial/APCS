public boolean arrayFront9(int[] nums) {
  for (int i=0; i<Math.min(4, nums.length); i++)
    if (nums[i] == 9) return true;

  return false;
}
