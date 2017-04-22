public double clockDegrees(double hour, double min) {
  return Math.abs((min * 6) - (hour * 30 + (min * 6) / 12));
}
