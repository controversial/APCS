public boolean linearIn(int[] outer, int[] inner) {
  for (int i=0; i<inner.length; i++) {
    boolean found = false;
    for (int k=0; k<outer.length; k++)
      if (outer[k] == inner[i]) found = true;
    if (!found) return false;
  }
  return true;
}
