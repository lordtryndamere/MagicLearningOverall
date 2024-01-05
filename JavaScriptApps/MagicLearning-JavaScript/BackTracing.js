/*
 * Crea una función que encuentre todas las combinaciones de los números
 * de una lista que suman el valor objetivo.
 * - La función recibirá una lista de números enteros positivos
 *   y un valor objetivo.
 * - Para obtener las combinaciones sólo se puede usar
 *   una vez cada elemento de la lista (pero pueden existir
 *   elementos repetidos en ella).
 * - Ejemplo: Lista = [1, 5, 3, 2],  Objetivo = 6
 *   Soluciones: [1, 5] y [1, 3, 2] (ambas combinaciones suman 6)
 *   (Si no existen combinaciones, retornar una lista vacía)
 */




function findSums(target,input) {
    input.sort();
    let results = [];
    function findSum(target,index,currentMatches) {
        //the base case
        if(target === 0){
            results.push(Array.from(currentMatches));
            return;
        }
        if(target<0 || input.length === index) return;
        //init to backtrack
        for (let i = index; i<input.length; i++){
            const currentValue = input[i];
            //add the currentValue
            if(i>index && currentValue === input[i-1]) continue;
            currentMatches.push(currentValue);
            findSum(target - currentValue,i+1,currentMatches);
            currentMatches.pop();
        }

    }
    findSum(target,0,[]);
    console.log(results)
    return results;
}
findSums(6,[1, 5, 3, 2])





