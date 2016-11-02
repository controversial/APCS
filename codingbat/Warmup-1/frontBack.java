public String frontBack(String str) {
  if (str.length() <= 1) {
    return str;
  } else {
    char firstChar = str.charAt(0);
    char lastChar = str.charAt(str.length() - 1);
    return lastChar + str.substring(1, str.length() - 1) + firstChar;
  }
}
