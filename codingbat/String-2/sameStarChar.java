public boolean sameStarChar(String str) {
  for (int i=1; i<str.length()-1; i++) {
    if (str.charAt(i) == "*".charAt(0) && str.charAt(i-1) != str.charAt(i+1)) {
      return false;
    }
  }
  return true;
}
