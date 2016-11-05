public int makeChocolate(int small, int big, int goal) {
  int bigToUse, smallToUse;

  // Number of big bars to use
  if (big == 0) bigToUse = 0;
  else bigToUse = goal / 5;
  if (bigToUse > big) bigToUse = big;
  // Number of small bars to use
  smallToUse = goal - 5*bigToUse;
  if (smallToUse > small) return -1;

  else return smallToUse;
}
