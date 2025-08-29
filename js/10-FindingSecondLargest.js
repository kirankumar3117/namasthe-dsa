const arr = [1, 7, 14, 2, 0, 9, 4, 14];

function FindSecondLargest(arr) {
  if (arr.length < 2) {
    return -1;
  }

  let firstLargest = arr[0] > arr[1] ? arr[0] : arr[1];
  let secondLargest = arr[0] < arr[1] ? arr[0] : arr[1];

  for (let i = 2; i < arr.length; i++) {
    if (arr[i] > firstLargest) {
      secondLargest = firstLargest;
      firstLargest = arr[i];
    } else if (arr[i] > secondLargest && arr[i] != firstLargest) {
      secondLargest = arr[i];
    }
  }

  return secondLargest;
}

// function FindSecondLargest(arr) {
//   if (arr.length < 2) {
//     return -1;
//   }

//   let firstLargest = arr[0] > arr[1] ? arr[0] : arr[1];
//   let secondLargest = arr[0] < arr[1] ? arr[0] : arr[1];

//   for (let i = 2; i < arr.length; i++) {
//     if (arr[i] > firstLargest) {
//       secondLargest = arr[i];
//       if (firstLargest < secondLargest) {
//         secondLargest = firstLargest;
//         firstLargest = arr[i];
//       }
//     }
//   }

//   return secondLargest;
// }

/* Corner Cases */

// 1. what if array size is less than two, what should i return
// 2. is array contains negative integers as well ?
// 3. does array contains duplicates as well

//infinite way
// function FindSecondLargest(arr) {
//   let firstLargest = -Infinity;
//   let secondLargest = -Infinity;

//   for (let i = 0; i < arr.length; i++) {
//     if (secondLargest < arr[i]) {
//       secondLargest = arr[i];
//       if (firstLargest < secondLargest) {
//         secondLargest = firstLargest;
//         firstLargest = arr[i];
//       }
//     }
//   }

//   return secondLargest;
// }

console.log("second largest", FindSecondLargest(arr));
