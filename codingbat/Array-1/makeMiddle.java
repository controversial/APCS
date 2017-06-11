public int[] makeMiddle(int[] nums) {
  int[] out = new int[2];
  out[0] = nums[nums.length / 2 - 1];
  out[1] = nums[nums.length / 2];
  return out;
}
