public boolean sum28(int[] nums) {
  int twoCount = 0;
  for (int i=0; i<nums.length; i++) {
    if (nums[i] == 2) twoCount++;
  }
  return twoCount == 4;
}
