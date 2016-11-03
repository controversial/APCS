public boolean twoAsOne(int a, int b, int c) {
  // int[] numbers = {a, b, c};
  // Arrays.sort(numbers);
  // return numbers[0] + numbers[1] == numbers[2];
  return a + b == c || b + c == a || a + c == b;
}
