function findLargestNumber(arr) {
  let largest = arr[0];
  for (let i = 1; i < arr.length; i++) {
    if (arr[i] > largest) {
      largest = arr[i];
    }
  }
  return largest;
}

const arr = [-10, -7, -2, -1, -8, -225, -56];

console.log("largest number", findLargestNumber(arr));
