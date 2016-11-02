public String changeXY(String str) {
  if (str.length() == 0) return "";
  if (str.charAt(0) == 'x') str = "y" + str.substring(1);
  return str.substring(0, 1) + changeXY(str.substring(1));
}
