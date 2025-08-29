const isPalindrome = (x) =>{
    let rev = 0;
    let ori= x;
    if(x < 0) return false;
    while(x > 0){
        let rem = x % 10;
        rev = (10*rev) + rem;
        x = Math.floor(x/10);
    };
    return rev === ori;
};

console.log(isPalindrome(151));
