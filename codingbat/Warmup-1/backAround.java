public String backAround(String str) {
  char lastChar = str.charAt(str.length() - 1);
  return lastChar + str + lastChar;
}
