public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
  // return equalOk ? a <= b && b <= c : a < b && b < c;
  return equalOk && a <= b && b <= c || !equalOk && a < b && b < c;
}
