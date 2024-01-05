


const word1 =  "abc";
const word2 =  "pqrst";

//optimize solution

const alternatedString = (w1,w2)=>{
    let mergedString = "";
    //find minLength
    const minLength =  Math.min(w1.length,w2.length);
    for (let i = 0; i< minLength; i++){
     mergedString=mergedString.concat(w1.charAt(i)).concat(w2.charAt(i));
    }
    if(w1.length>w2.length) mergedString = mergedString.concat(w1.substring(minLength));
    else mergedString=mergedString.concat(w2.substring(minLength))
    return mergedString;
}

const myAlternatedString = alternatedString(word1,word2);
console.log(myAlternatedString)
