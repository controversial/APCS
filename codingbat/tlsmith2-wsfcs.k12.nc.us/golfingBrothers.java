public String golfingBrothers(int[] adam, int[] bob, int[] craig) { 

    ArrayList<Integer> adamList = new ArrayList<Integer>();
    for (int i=0; i<adam.length; i++)
    {
       adamList.add(adam[i]);
    }
    ArrayList<Integer> bobList = new ArrayList<Integer>();
    for (int i=0; i<bob.length; i++)
    {
       bobList.add(bob[i]);
    }
    ArrayList<Integer> craigList = new ArrayList<Integer>();
    for (int i=0; i<craig.length; i++)
    {
       craigList.add(craig[i]);
    }

    return golfingBrothersB(adamList, bobList, craigList);
    
}

public double average(ArrayList<Integer> list) {
  double total = 0;
  for (int item : list) total += item;
  return total / list.size();
}

public String golfingBrothersB(ArrayList<Integer> adamList,
                               ArrayList<Integer> bobList,
                               ArrayList<Integer> craigList)
{
  double adamAvg = Double.MAX_VALUE, bobAvg = Double.MAX_VALUE, craigAvg = Double.MAX_VALUE;
  if (adamList.size() >= 2) adamAvg = average(adamList);
  if (bobList.size() >= 2) bobAvg = average(bobList);
  if (craigList.size() >= 2) craigAvg = average(craigList);

  if (adamAvg <= bobAvg && adamAvg <= craigAvg) return "adam";
  if (bobAvg <= adamAvg && bobAvg <= craigAvg) return "bob";
  return "craig";
}
