public int fairlyOddNums(int[] nums) { 

    ArrayList<Integer> numsList = new ArrayList<Integer>();
    for (int i=0; i<nums.length; i++)
    {
       numsList.add(nums[i]);
    }
    
    return fairlyOddNumsB(numsList);
}

public int fairlyOddNumsB(ArrayList<Integer> numsList) {
  int sum = 0;
  for (int i = 0; i < numsList.size(); i++)
    if ((i % 2 == 0 && numsList.get(i) % 2 == 1) || (i % 2 == 1 && numsList.get(i) % 2 == 0))
      sum += numsList.get(i);
  return sum;
}
