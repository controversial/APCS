public String[] mergeTwo(String[] a, String[] b, int n) {
  String[] out = new String[n];
  int aIndex = 0; int bIndex = 0; int outIndex = 0;

  for (int i = 0; i < n; i++) {
    int compared = a[aIndex].compareTo(b[bIndex]);
    if (compared < 0) {
      out[outIndex] = a[aIndex];
      aIndex++;
    } else if (compared > 0) {
      out[outIndex] = b[bIndex];
      bIndex++;
    } else { // Two strings are equal
      out[outIndex] = a[aIndex];
      aIndex++; bIndex++;
    }
    outIndex++;
  }

  return out;
}
