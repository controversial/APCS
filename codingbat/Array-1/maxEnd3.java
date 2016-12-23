public int[] maxEnd3(int[] nums) {
  int first = nums[0];
  int second = nums[nums.length-1];
  if (first > second) {
    return new int[] {first, first, first};
  }
  return new int[] {second, second, second};
}
