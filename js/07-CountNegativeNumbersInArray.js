function countNegativeNumbersInAnArray(arr) {
  let count = 0;
  for (let i = 0; i < arr.length; i++) {
    if (arr[i] < 0) {
      count++;
    }
  }
  return count;
}

const res1 = countNegativeNumbersInAnArray([
  5, -8, -8, -52, 5, -4, -8, 5, 6, -7, 85, 96, -45,
]);

console.log(res1);
