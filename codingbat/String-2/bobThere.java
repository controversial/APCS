public boolean bobThere(String str) {
  for (int i=0; i<str.length()-2; i++) {
    if (str.charAt(i) == "b".charAt(0) && str.charAt(i+2) == "b".charAt(0))
      return true;
  }
  return false;
}
