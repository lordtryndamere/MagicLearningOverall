



const num = 4;

const getFc = (num)=>{
    if(num < 0) return -1;
    if(num===0 ||num === 1) return 1;
    return num * getFc(num-1);

}
const myFc = getFc(num)
console.log(myFc)