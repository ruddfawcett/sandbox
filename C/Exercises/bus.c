#include <stdio.h>

int main() {
  int curHour, curMin, depHour, depMin;

  fputs("What is the current hour? ", stdout);
  scanf("%d", &curHour);
  fputs("What is the current minute? ", stdout);
  scanf("%d", &curMin);
  fputs("When does your bus leave in hours? ", stdout);
  scanf("%d", &depHour);
  fputs("When does your bus leave in minutes? ", stdout);
  scanf("%d", &depMin);

  int waitMin = (depHour * 60 + depMin) - (curHour * 60 + curMin);
  int waitHours = waitMin/60;

  waitMin %= 60;

  char * hourString = "hours";
  char * minString = "minutes";

  if (waitHours == 1) {
    hourString = "hour";
  }

  if (waitMin == 1) {
    minString = "minute";
  }

  printf("Your bus leaves in %d %s and %d %s.\n", waitHours, hourString, waitMin, minString);

  return 0;
}
