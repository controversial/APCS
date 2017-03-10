public String alarmClock(int day, boolean vacation) {
  return (day == 0 || day == 6) ? (vacation ? "off" : "10:00") : (vacation ? "10:00" : "7:00");
}
