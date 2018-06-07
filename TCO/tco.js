"use strict"
const fact = (n, acc) => {
 if (n == 1) 
    return acc
 else
  return recursive (n-1, n*acc)
}

const recursive = (n, a) => {
  return n * a
}
let r  = fact(99999, 1)
console.log(r)