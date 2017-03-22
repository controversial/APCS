public boolean freeSoup(int[] personA, int[] personB) { 

    ArrayList<Integer> aList = new ArrayList<Integer>();
    for (int i=0; i<personA.length; i++)
    {
       aList.add(personA[i]);
    }
    ArrayList<Integer> bList = new ArrayList<Integer>();
    for (int i=0; i<personB.length; i++)
    {
       bList.add(personB[i]);
    }

    return freeSoupB(aList, bList);  
}

public boolean freeSoupB(ArrayList<Integer> aList, ArrayList<Integer> bList)
{
  return (
    aList.get(1) + bList.get(1) >= 20
    && aList.get(0) + aList.get(2) >= 5
    && bList.get(0) + bList.get(2) >= 5
  );
}
