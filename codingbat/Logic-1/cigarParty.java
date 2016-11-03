public boolean cigarParty(int cigars, boolean isWeekend) {
  // return isWeekend ? cigars >= 40 : cigars >= 40 && cigars <= 60;
  return (isWeekend && cigars >= 40) || (!isWeekend && cigars >= 40 && cigars <= 60);
}
