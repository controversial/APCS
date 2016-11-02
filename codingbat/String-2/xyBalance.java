public boolean xyBalance(String str) {
  int lastX = str.lastIndexOf("x");
  return lastX == -1 || str.substring(lastX).indexOf("y") != -1;
}
