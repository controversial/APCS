public int[] seriesUp(int n) {
  String outstr = "";
  for (int i=1; i<=n; i++) {
    for (int k=1; k<=i; k++) {
      outstr += k;
    }
  }

  int[] out = new int[outstr.length()];
  for (int j=0; j<out.length; j++) {
    out[j] = Character.getNumericValue(outstr.charAt(j));
  }

  return out;
}
