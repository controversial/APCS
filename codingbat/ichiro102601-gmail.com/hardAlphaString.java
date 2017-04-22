public String hardAlphaString(String str) {
  ArrayList<String> sortedWords = new ArrayList<>();
  for (String word : str.split(" ")) {
    String[] letters = word.split("");
    Arrays.sort(letters);
    sortedWords.add(String.join("", letters));
  }
  return String.join(" ", sortedWords);
}
