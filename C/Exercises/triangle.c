#include <stdio.h>

void printRow(int rowNum, int maxRow) {
  for (int i = 0; i < (maxRow - rowNum); i++) {
    putchar(' ');
  }

  for (int i = 0; i < 2*rowNum-1; i++) {
    putchar('*');
  }

  putchar('\n');
}

void printTriangle(int numRows) {
  for (int row = 1; row <= numRows; row++) {
    printRow(row, numRows);
  }
}

int main() {
  printTriangle(6);

  return 0;
}
