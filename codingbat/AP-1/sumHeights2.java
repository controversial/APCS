public int sumHeights2(int[] heights, int start, int end) {
  int totalDiff = 0;
  for (int i = start; i < end; i++) {
    if (heights[i] < heights[i + 1]) totalDiff += (heights[i+1] - heights[i]) * 2;
    else totalDiff += heights[i] - heights[i+1];
  }
  return totalDiff;
}
