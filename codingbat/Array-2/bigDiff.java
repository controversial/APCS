public int bigDiff(int[] nums) {
  int smallest = nums[0];
  int largest = nums[0];
  
  for (int i=0; i<nums.length; i++) {
    smallest = Math.min(smallest, nums[i]);
    largest = Math.max(largest, nums[i]);
  }
  
  return largest - smallest;
}
