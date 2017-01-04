public boolean canBalance(int[] nums) {
  for (int i=0; i<nums.length; i++) {
    int beforeSum = 0;
    int afterSum  = 0;

    for (int k=0; k<nums.length; k++)
      if (k < i) beforeSum += nums[k];
      else afterSum += nums[k];
    
    if (beforeSum == afterSum) return true;
  }
  
  return false;
}
