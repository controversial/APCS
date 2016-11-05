public int loneSum(int a, int b, int c) {
  int outa = a, outb = b, outc = c;
  if (a == b) {outa = 0; outb = 0;}
  if (b == c) {outb = 0; outc = 0;}
  if (c == a) {outa = 0; outc = 0;}
  return outa + outb + outc;
}
