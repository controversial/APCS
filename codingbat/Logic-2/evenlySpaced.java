public boolean evenlySpaced(int a, int b, int c) {
  int[] args = {a, b, c};
  Arrays.sort(args);
  return args[1] - args[0] == args[2] - args[1];
}
