public int[] make2(int[] a, int[] b) {
  int[] out = new int[2];
  int i;
  for (i = 0; i < a.length && i < 2; i++) {
    out[i] = a[i];
  }
  for (int i2 = i; i2 - i < b.length && i2 < 2; i2++) {
    out[i2] = b[i2-i];
  }
  return out;
}
