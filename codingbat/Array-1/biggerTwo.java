public int[] biggerTwo(int[] a, int[] b) {
  int asum = a[0] + a[1];
  int bsum = b[0] + b[1];
  
  if (asum >= bsum) return a;
  return b;
}
