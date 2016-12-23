public int maxSpan(int[] nums) {
  int maxSpanLength = 0;
  
  for (int i=0; i<nums.length; i++) {
    int spanLength = 0;

    for (int k=i; k<nums.length; k++)
      if (nums[k] == nums[i])
        spanLength = (k - i) + 1;

    if (spanLength > maxSpanLength) maxSpanLength = spanLength;
  }
  
  return maxSpanLength;
}
