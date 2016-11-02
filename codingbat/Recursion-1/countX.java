public int countX(String str) {
  if (str.length() == 0) return 0;
  else return (str.charAt(0) == 'x' ? 1 : 0) + countX(str.substring(1));
}
