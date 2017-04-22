public int[] quizCorrections(int[] scores) {
  int[] out = new int[scores.length];
  for (int i = 0; i < scores.length; i++) out[i] = (scores[i] * 2 + 100) / 3;
  return out;
}
