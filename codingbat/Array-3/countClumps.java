public int countClumps(int[] nums) {
  int clumps = 0;
  int clumpSize = 0;
  for (int i=0; i<nums.length; i+= clumpSize) {
    int k;
    for (k=i+1; k<nums.length; k++) {
      if (nums[i] != nums[k]) {
        break;
      }
    }
    clumpSize = k - i;
    if (clumpSize > 1) clumps++;
  }
  return clumps;
}
