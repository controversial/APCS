public int[] copyEvens(int[] nums, int count) {
  int[] evens = new int[count];
  int evensCount = 0;
  for (int i = 0; i < nums.length; i++) {
    if (nums[i] % 2 == 0) {
      evens[evensCount] = nums[i];
      evensCount++;
      if (evensCount == count) return evens;
    }
  }
  return evens;
}
