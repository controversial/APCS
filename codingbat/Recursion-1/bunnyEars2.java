public int bunnyEars2(int bunnies) {
  if (bunnies == 0) return 0;
  else return bunnyEars2(bunnies-1) + (bunnies % 2 == 1 ? 2 : 3);
}
