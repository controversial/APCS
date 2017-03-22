public boolean winRace(int[] votes) { 
    ArrayList<Integer> votesList = new ArrayList<Integer>();
    for (int i=0; i<votes.length; i++)
    {
       votesList.add(votes[i]);
    }

    return winRaceB(votesList);
    
}

public boolean winRaceB(ArrayList<Integer> votesList) {
  int sum = 0;
  for (int vote : votesList) sum += vote;
  return sum >= 0;
}
