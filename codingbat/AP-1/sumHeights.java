public int sumHeights(int[] heights, int start, int end) {
  int totalDiff = 0;
  for (int i = start; i < end; i++) {
    totalDiff += Math.abs(heights[i] - heights[i+1]);
  }
  return totalDiff;
}
