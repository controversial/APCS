public String sameEnds(String string) {
  String end = "";
  for (int i=string.length()/2; i>=0; i--) {
    end = string.substring(0, i);
    if (string.endsWith(end)) return end;
  }
  return "";
}
