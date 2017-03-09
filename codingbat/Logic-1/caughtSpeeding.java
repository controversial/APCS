public int caughtSpeeding(int speed, boolean isBirthday) {
  int limit1 = isBirthday ? 65 : 60;
  int limit2 = isBirthday ? 85 : 80;
  if (speed <= limit1) return 0;
  if (speed <= limit2) return 1;
  return 2;
}
