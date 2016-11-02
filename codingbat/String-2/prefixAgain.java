public boolean prefixAgain(String str, int n) {
  return str.lastIndexOf(str.substring(0, n)) != 0;
}
