public int productOfInts(int[] nums) {
  int product = nums[0];
  int lastcounted = nums[0];
  for (int i = 1; i < nums.length; i++)
    if (nums[i] > lastcounted) {
      product *= nums[i];
      lastcounted = nums[i];
    }
  return product;
}
