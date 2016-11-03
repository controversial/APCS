public int scoresAverage(int[] scores) {
  int[] firstHalf = Arrays.copyOfRange(scores, 0, scores.length / 2);
  int[] secondHalf = Arrays.copyOfRange(scores, scores.length / 2, scores.length);
  
  int firstSum = 0, secondSum = 0;
  for (int i=0; i<firstHalf.length; i++) {
    firstSum += firstHalf[i];
  }
  for (int i=0; i<secondHalf.length; i++) {
    secondSum += secondHalf[i];
  }

  return Math.max(firstSum/firstHalf.length, secondSum / secondHalf.length);
}
