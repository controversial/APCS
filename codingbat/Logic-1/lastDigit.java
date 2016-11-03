public boolean lastDigit(int a, int b, int c) {
  String a2=Integer.toString(a), b2=Integer.toString(b), c2=Integer.toString(c);
  char lastDigitOfA = a2.charAt(a2.length()-1);
  char lastDigitOfB = b2.charAt(b2.length()-1);
  char lastDigitOfC = c2.charAt(c2.length()-1);
  
  return lastDigitOfA == lastDigitOfB || lastDigitOfB == lastDigitOfC || lastDigitOfA == lastDigitOfC;
}
