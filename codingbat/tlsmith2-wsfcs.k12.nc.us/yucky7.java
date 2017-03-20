public int yucky7(int[] nums) 
{ 
    ArrayList<Integer> numsList = new ArrayList<Integer>();
    for (int i=0; i<nums.length; i++)
    {
       numsList.add(nums[i]);
    }

    return yucky7b(numsList);
    
}

public int yucky7b(ArrayList<Integer> numsList)
{
  int sum = 0;
  for (int i = 0; i < numsList.size(); i++) {
    if (numsList.get(i) == 7) {
      if (i < numsList.size() - 1 && numsList.get(i + 1) != 7) i++;
      continue;
    } else {
      sum += numsList.get(i);
    }
  }
  return sum;
}
