public int count8(int n) {
  if (n == 0) return 0;
  int value = 0;
  if (n % 10 == 8) {
    value = n / 10 % 10 == 8 ? 2: 1;
  }
  return value + count8(n / 10);
}
