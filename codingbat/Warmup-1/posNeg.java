public boolean posNeg(int a, int b, boolean negative) {
  if (negative) {return a < 0 && b < 0;}
  else {
    int [] values = {a, b};
    Arrays.sort(values);
    return values[0] < 0 && values[1] > 0;
  }
}
