public boolean equalIsNot(String str) {
  str += " ";
  int notCount = 0, isCount = 0;
  for (int i=0; i<str.length()-2; i++) {
    if (str.substring(i, i+2).equals("is")) isCount++;
    if (str.substring(i, i+3).equals("not")) notCount++;
  }
  return isCount == notCount;
}
