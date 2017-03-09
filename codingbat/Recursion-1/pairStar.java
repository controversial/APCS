public String pairStar(String str) {
  if (str.length() < 2) return str;
  String newStr = str;
  if (str.substring(0, 1).equals(str.substring(1, 2)))
    newStr = str.substring(0, 1) + "*" + str.substring(1);
  return newStr.substring(0, 1) + pairStar(newStr.substring(1));
}
