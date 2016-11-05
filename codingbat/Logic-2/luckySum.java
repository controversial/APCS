public int luckySum(int a, int b, int c) {
  int sum = 0;
  if (a != 13) {sum += a;} else {return sum;}
  if (b != 13) {sum += b;} else {return sum;}
  if (c != 13) sum += c;
  return sum;
}
