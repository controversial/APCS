public boolean stringE(String str) {
  int total = 0;
  for (int i=0; i<str.length(); i++) {
    if (str.charAt(i) == "e".charAt(0)) total++;
  }
  return total >= 1 && total <= 3;
}
