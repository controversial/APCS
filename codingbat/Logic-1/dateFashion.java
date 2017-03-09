public int dateFashion(int you, int date) {
  return (you > 8 || date > 8) ? (you > 2 && date > 2 ? 2 : 0) : (you > 2 && date > 2 ? 1 : 0); 
}
