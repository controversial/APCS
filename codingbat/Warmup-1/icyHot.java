public boolean icyHot(int temp1, int temp2) {
  int[] temps = {temp1, temp2};
  Arrays.sort(temps);
  return temps[0] < 0 && temps[1] > 100;
}
