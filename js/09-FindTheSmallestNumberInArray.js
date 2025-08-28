function findSmallestNumber(arr) {
  let smallest = arr[0];
  for (let i = 1; i < arr.length; i++) {
    if (arr[i] < smallest) {
      smallest = arr[i];
    }
  }
  return smallest;
}

const arr = [-10, -7, -2, -1, -8, -225, -56];

console.log("Smallest number", findSmallestNumber(arr));
