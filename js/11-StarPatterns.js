// Print Square start pattern

const nxnStarPattern = (n) => {
  for (let i = 0; i < n; i++) {
    let star = "";
    for (let j = 0; j < n; j++) {
      star += "*";
    }
    console.log(star);
  }
};

const rightAngleStarPattern = (n) => {
  for (let i = 0; i < n; i++) {
    let row = "";
    for (let j = 0; j <= i; j++) {
      row += "*";
    }
    console.log(row);
  }
};

const rightAngleNumberPattern = (n) => {
  for (let i = 0; i < n; i++) {
    let row = "";
    for (let j = 0; j <= i; j++) {
      row +=  (j+1)
    }
    console.log(row);
  }
};

const rightTriangleRepeatedNumberPattern = (n) => {
  for (let i = 0; i < n; i++) {
    let row = "";
    for (let j = 0; j <= i; j++) {
      row +=  (i+1)
    }
    console.log(row);
  }
};

// nxnStarPattern(4);
// rightAngleStarPattern(4);
// rightAngleNumberPattern(4);
rightTriangleRepeatedNumberPattern(4);
