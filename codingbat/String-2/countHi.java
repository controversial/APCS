public int countHi(String str) {
  int count = 0;
  for (int i=0; i<str.length()-1; i++) {
    if (str.charAt(i) == "h".charAt(0) && str.charAt(i+1) == "i".charAt(0)) {
      count++;
    }
  }
  return count;
}
