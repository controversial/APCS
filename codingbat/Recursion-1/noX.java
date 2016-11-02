public String noX(String str) {
  if (str.length() == 0) return str;
  return str.charAt(0) == 'x' ? noX(str.substring(1)) : str.substring(0, 1) + noX(str.substring(1));
}
