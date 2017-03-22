public String[] scaredyCat(String[] pets) { 

    ArrayList<String> petsList = new ArrayList<String>();
    for (int i=0; i<pets.length; i++)
    {
       petsList.add(pets[i]);
    }
    
    petsList = scaredyCatB(petsList);
    
    String pets2[] = new String[petsList.size()];
    for (int i=0; i<petsList.size(); i++)
    {
       pets2[i]=petsList.get(i);
    }
    return pets2;
}

public ArrayList<String> scaredyCatB(ArrayList<String> petsList) {    
  for (int i = 0; i < petsList.size() - 1; i++) {
    if (petsList.get(i).equals("dog") && petsList.get(i+1).equals("cat")) {
      petsList.remove(i+1);
      i--;
    }
  }
  return petsList;
}
