function findingElement(arr, x) {
  for (let i = 0; i < arr.length; i++) {
    if (arr[i] === x) {
      return i;
    }
  }
  return -1;
}

const res1 = findingElement([10, 9, 8, 7, 5, 2, 25], 25);

console.log(res1);
