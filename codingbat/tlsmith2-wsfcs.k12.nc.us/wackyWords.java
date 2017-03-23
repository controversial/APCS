public String[] wackyWords(String[] words) { 

    ArrayList<String> wordsList = new ArrayList<String>();
    for (int i=0; i<words.length; i++)
    {
       wordsList.add(words[i]);
    }
    
    wordsList = wackyWordsB(wordsList);
    
    String words2[] = new String[wordsList.size()];
    for (int i=0; i<wordsList.size(); i++)
    {
       words2[i]=wordsList.get(i);
    }

    return words2;
}

public ArrayList<String> wackyWordsB(ArrayList<String> wordsList) 
{
  if (wordsList.size() < 1) return wordsList;
  String pre = wordsList.get(0).substring(0, 1);
  String suf = wordsList.get(wordsList.size() - 1).substring(wordsList.get(wordsList.size() - 1).length() - 1);
  for (int i = 0; i < wordsList.size(); i++) {
    wordsList.set(i, pre + wordsList.get(i) + suf);
  }
  return wordsList;
}
