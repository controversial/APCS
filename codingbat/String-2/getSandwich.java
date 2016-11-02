public String getSandwich(String str) {
  int first = str.indexOf("bread"), last = str.lastIndexOf("bread");
  if (first == last || first == -1) return "";
  return str.substring(first+5, last);
}
