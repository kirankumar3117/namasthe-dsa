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

nxnStarPattern(4);
