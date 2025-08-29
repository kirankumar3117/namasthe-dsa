let digit = -259;

const countDigits = (n) => {
  if (n == 0) return 1;
  n = Math.abs(digit);
  let count = 0;
  while (n > 0) {
    n = Math.floor(n / -10);
    count++;
  }
  return count;
};

console.log(countDigits(digit));
