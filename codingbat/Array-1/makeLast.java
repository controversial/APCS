public int[] makeLast(int[] nums) {
  int[] out = new int[nums.length*2];
  out[out.length-1] = nums[nums.length-1];
  return out;
}
