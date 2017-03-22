public String[] catty(String[] animals) { 

    ArrayList<String> animalsList = new ArrayList<String>();
    for (int i=0; i<animals.length; i++)
    {
       animalsList.add(animals[i]);
    }
    
    ArrayList<String> catsList = cattyB(animalsList);
    
    String cats[] = new String[catsList.size()];
    for (int i=0; i<catsList.size(); i++)
    {
       cats[i]=catsList.get(i);
    }

    return cats;
}

public ArrayList<String> cattyB(ArrayList<String> animalsList) 
{    
  ArrayList<String> catsList = new ArrayList<String>();
  for (String animal : animalsList)
    if (animal.toLowerCase().indexOf("cat") >= 0) catsList.add(animal);
  return catsList;
}
