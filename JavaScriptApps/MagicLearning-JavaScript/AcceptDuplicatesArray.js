// Challenge name: accept-duplicates-from-array
// Description:
// Given an array the algorithm will only allow and sort in descending order
// the numbers found to be duplicates. Do not allocate extra space for another array,
// you must do this in place with constant memory.


function acceptDuplicatesArray(arrayOfNumbers) {
    const ln = arrayOfNumbers.length;
    for (let i = 0; i < ln ; i++) {
        for (let j = i+1; j < ln ; j++) {
            if(arrayOfNumbers[i] < arrayOfNumbers[j]){
                let temp = arrayOfNumbers[i];
                arrayOfNumbers[i] = arrayOfNumbers[j]
                arrayOfNumbers[j] = temp;
            }
        }
    }
    return arrayOfNumbers;
}
function findDuplicates(arrayOfNumbers){
    let duplicates = [];
    let seen = {}
    for (let i = 0; i <arrayOfNumbers.length ; i++) {
        let currentNumber = arrayOfNumbers[i];

        if(seen[currentNumber]){
            duplicates.push(currentNumber);
        }else{
            seen[currentNumber] = true;
        }

    }
}


const input = [1, 3, 2, 3, 2, 1, 3];
console.log(acceptDuplicatesArray(input))

