public String front3(String str) {
  String subStr;
  if (str.length() < 3) {
    subStr = str;
  } else {
    subStr = str.substring(0, 3);
  }
  return subStr + subStr + subStr;
}
