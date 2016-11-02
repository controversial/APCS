public boolean xyzThere(String str) {
  char x = "x".charAt(0), y = "y".charAt(0), z = "z".charAt(0);
  // Account for strings that start with xyz
  if (str.length() >= 3 &&
      str.charAt(0) == x &&
      str.charAt(1) == y &&
      str.charAt(2) == z)
    return true;

  for (int i=1; i<str.length()-2; i++) {
    if (str.charAt(i) == x &&
        str.charAt(i+1) == y &&
        str.charAt(i+2) == z &&
        str.charAt(i-1) != ".".charAt(0))
      return true;
  }
  return false;
}
