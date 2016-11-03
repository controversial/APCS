public boolean in1To10(int n, boolean outsideMode) {
  //return outsideMode ? (n <= 1 || n >= 10) : (n >= 1 && n <= 10);
  return (outsideMode && (n <= 1 || n >= 10)) || (!outsideMode && n >= 1 && n <= 10);
}
