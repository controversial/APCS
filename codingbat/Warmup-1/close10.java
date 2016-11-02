public int close10(int a, int b) {
  int adist = Math.abs(10 - a), bdist = Math.abs(10 - b);
  
  if (adist < bdist) return a;
  else if (bdist < adist) return b;
  return 0;
}
