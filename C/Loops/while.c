#include <stdio.h>
#include <stdbool.h>

int main () {
  bool maybe = true;
  int i = 0;

  while (maybe) {
    printf("%d\n", i);

    if (i == 9) {
      maybe = false;
      printf("Done.");
    }

    i++;
  }

   return 0;
}
