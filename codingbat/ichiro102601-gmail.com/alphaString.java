public String alphaString(String str) {
  String out = str.substring(0, 1);
  String lastCounted = str.substring(0, 1);
  for (int i = 1; i < str.length(); i++) {
    if (str.substring(i, i+1).compareTo(lastCounted) >= 0) {
      out += str.substring(i, i+1);
      lastCounted = str.substring(i, i+1);
    }
  }
  return out;
}
