//print all even number from given array

const arr = [10, 9, 8, 5, 2, 1, 4, 7];

function printAllEvenArray(arr) {
  for (let i = 0; i < arr.length; i++) {
    if (arr[i] % 2 == 0) {
      console.log(arr[i]);
    }
  }
}

printAllEvenArray(arr);
