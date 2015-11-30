#include <stdio.h>
#include <stdbool.h>

int main() {
  bool maybe = true;
  int i = 0;

  do {
    printf("%d\n", i);

    if (i == 9) {
      maybe = false;
    }

    i++;
  }
  while (maybe == true);

  printf("Done.");

  return 0;
}
