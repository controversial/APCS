public String allStar(String str) {
  if (str.length() == 0) return "";
  return str.substring(0, 1) + (allStar(str.substring(1)).equals("") ? "" : "*" + allStar(str.substring(1)));
}
