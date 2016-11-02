public int max1020(int a, int b) {
  boolean ainrange = a >= 10 && a <= 20,
          binrange = b >= 10 && b <= 20;
  if (!ainrange && !binrange) return 0;
  else if (ainrange && binrange) return Math.max(a, b);
  else if (ainrange && !binrange) return a;
  else return b;
}
