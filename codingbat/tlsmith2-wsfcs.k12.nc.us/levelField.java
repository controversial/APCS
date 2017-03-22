public boolean levelField(int[] nums) { 

    ArrayList<Integer> numsList = new ArrayList<Integer>();
    for (int i=0; i<nums.length; i++)
    {
       numsList.add(nums[i]);
    }
    
    return levelFieldB(numsList);
}

public boolean levelFieldB(ArrayList<Integer> numsList) {
  if (numsList.size() < 3) return false;
  // Compute lowest and highest values
  int low = numsList.get(0);
  int high = numsList.get(0);
  for (int elevation : numsList) {
    if (elevation < low) low = elevation;
    if (elevation > high) high = elevation;
  }
  // Make sure range is not greater than eight
  return high - low <= 8;
}
