public boolean gHappy(String str) {
  boolean isHappy = true;
  str = str + ' ';
  for (int i=0; i<str.length()-1; i++) {
    if (str.charAt(i) == 'g') {
      if (str.charAt(i+1) != 'g') isHappy = false;
      else { while (str.charAt(i) == 'g') i++; }
    }
  }
  return isHappy;
}
