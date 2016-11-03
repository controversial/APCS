public boolean shareDigit(int a, int b) {
  String a2 = Integer.toString(a), b2 = Integer.toString(b);
  return a2.charAt(0) == b2.charAt(0) || a2.charAt(1) == b2.charAt(1) || a2.charAt(0) == b2.charAt(1) || a2.charAt(1) == b2.charAt(0);
}
