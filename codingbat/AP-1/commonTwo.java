public int commonTwo(String[] a, String[] b) {
  // Sets cannot contain duplicates
  Set<String> commonItems = new HashSet<String>();

  int aIndex = 0; int bIndex = 0;

  while (aIndex < a.length && bIndex < b.length) {
    // Compare the current string in A to the current string in B
    int compared = a[aIndex].compareTo(b[bIndex]);
    // If A comes before B, go to the next item in A
    if (compared < 0) aIndex++;
    // If B comes before A, go to the next item in B
    else if (compared > 0) bIndex++;
    // If the two strings are equal, add the match to the commonItems Set and move
    // to the next item in both arrays.
    else {
      commonItems.add(a[aIndex]);
      aIndex++;
      bIndex++;
    }
  }

  // The set will not contain duplicates by nature, so just take the size of the set.
  return commonItems.size();
}
