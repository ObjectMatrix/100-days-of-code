
// factorial_no_names = (f => (n => ((n === 0) ? 1 : n * f(f)(n - 1))))
//           (f => (n => ((n === 0) ? 1 : n * f(f)(n - 1))))

//factorial_no_names = (f => (n => ((n === 0) ? 1 : n * f(f)(n - 1))))((f => (n => ((n === 0) ? 1 : n * f(f)(n - 1)))))
//[1,2,3,4,5,6,7,8,9,10,11].map(factorial_no_names)
[1,2,3,4,5,6,7,8,9,10,11].map(x => console.log(x))