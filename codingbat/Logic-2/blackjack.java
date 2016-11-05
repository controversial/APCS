public int blackjack(int a, int b) {
  int adist = 21 - a, bdist = 21 - b;
  if (adist < 0 && bdist < 0) {
    return 0;
  } else {
    if (adist >= 0 && a > b) return a;
    else if (bdist >= 0 && b > a) return b;
    else if (adist >= 0) return a;
    else return b;
  }
}
