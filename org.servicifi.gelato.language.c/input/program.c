int add (int a, int b) {
  return a + b;
}

int main() {
  int sum = 0;
  int counter = 1;
  while (counter < 11) {
    sum = add(sum, counter);

    if (sum > 100)
      break; 

    counter = add(counter, 1);
  }
}


