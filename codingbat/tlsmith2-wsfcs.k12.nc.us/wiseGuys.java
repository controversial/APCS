public int wiseGuys(int[] ages) { 

    ArrayList<Integer> agesList = new ArrayList<Integer>();
    for (int i=0; i<ages.length; i++)
    {
       agesList.add(ages[i]);
    }

    return wiseGuysB(agesList);
    
}

public int wiseGuysB(ArrayList<Integer> agesList) {
  int greatestAge = 0;
  for (int i = 0; i < agesList.size(); i += 2) {
    int combinedAge = agesList.get(i) + agesList.get(i+1);
    if (combinedAge > greatestAge) greatestAge = combinedAge;
  }
  return greatestAge;
}
