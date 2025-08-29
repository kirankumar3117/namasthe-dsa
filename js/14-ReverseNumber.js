

function reverseNumber(num){
    let ori = num;
    let rev = 0;
    num = Math.abs(num);
    while(num > 0){
        let rem = num % 10;
        rev = ( 10*rev ) + rem;
        num  = Math.floor(num/10);
    };
    return (ori < 0) ? -rev : rev;
};

console.log(reverseNumber(-585555))