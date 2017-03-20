public int sumEvenIndexes(int[] nums) { 

    ArrayList<Integer> numsList = new ArrayList<Integer>();
    for (int i=0; i<nums.length; i++)
    {
       numsList.add(nums[i]);
    }
    
    return sumEvenIndexesB(numsList);
}

public int sumEvenIndexesB(ArrayList<Integer> numsList) {
  int sum = 0;
  for (int i = 0; i < numsList.size(); i++) {
    if (i % 2 == 0) sum += numsList.get(i);
  }
  return sum;
}
