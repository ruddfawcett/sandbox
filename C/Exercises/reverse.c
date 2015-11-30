#include <stdio.h>
#include <string.h>

int main() {
  char s[101]; // A string of upto 100 chars + '\0'
  int i;

  fputs("Please write a string: ", stdout);
  fgets(s, 101, stdin);
  puts("Your sentence in reverse: ");

  for (i = strlen(s) - 1; i >= 0; i--) {
    if (s[i] == '\n') {
      continue;
    }
    else {
      putchar(s[i]);
    }
  }
  putchar('\n');

  return 0;
}
