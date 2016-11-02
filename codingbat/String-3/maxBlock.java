public int maxBlock(String str) {
  str += "@";
  int maxBlockLength = 0;
  for (int i=0; i<str.length() - 1; i++) {
    char currentChar = str.charAt(i);
    int thisBlockLength = 0;
    for (int j=i; str.charAt(j) == currentChar; j++) {
      thisBlockLength++;
    }
    if (thisBlockLength > maxBlockLength) maxBlockLength = thisBlockLength;
  }
  return maxBlockLength;
}
