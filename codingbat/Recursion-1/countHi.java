public int countHi(String str) {
  if (str.length() == 1 || str.length() == 0)  return 0;
  else return (str.substring(0, 2).equals("hi") ? 1 : 0) + countHi(str.substring(1));
}
