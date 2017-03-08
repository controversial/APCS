public boolean dividesSelf(int n) {
  int n2 = n;
  while (n2 > 0) {
    if (n2 % 10 == 0) return false; // Nothing with a zero divides itself
    if (n % (n2 % 10) != 0) return false;
    n2 /= 10;
  }
  return true;
}
