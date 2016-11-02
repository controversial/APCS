public int countCode(String str) {
  int count = 0;
  for (int i=0; i<str.length()-3; i++) {
    if (str.charAt(i) == "code".charAt(0) &&
        str.charAt(i+1) == "code".charAt(1) &&
        str.charAt(i+3) == "code".charAt(3))
      count++;
  }
  return count;
}
