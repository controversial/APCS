public int[] copyEndy(int[] nums, int count) {
  int[] endys = new int[count];
  int endyCount = 0;
  for (int i = 0; i < nums.length; i++) {
    if (nums[i] >= 0 && nums[i] <= 10 || nums[i] >= 90 && nums[i] <= 100) {
      endys[endyCount] = nums[i];
      endyCount++;
      if (endyCount == count) return endys;
    }
  }
  return endys;
}
