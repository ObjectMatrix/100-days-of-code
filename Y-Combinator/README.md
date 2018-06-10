# Y-Combinator
The λ-calculus, the language in which the Y combinator is typically expressed, is a programming language which contains only anonymous functions, function applications and variable references.  

```js
The notation λv.e stands for the function that maps the input v to the output e. JavaScript supports anonymous functions:

λv.e == function (v) { 
  return e ; 
  }
```


So, if we can find a way to express the Y combinator in the λ-calculus, we can express it in JavaScript too.   
To derive the Y combinator, start with the core property we seek. Namely, if we give the Y combinator a functional F, then Y(F) needs to be a fixed point:

`Y(F) = F(Y(F))`  

We could actually transliterate this definition into JavaScript as:   

`function Y(F) { return F(Y(F)) ; }`

Of course, if we tried to use it, it would never work because the function Y immediately calls itself, leading to infinite recursion.

Using a little λ-calculus, however, we can wrap the call to Y in a λ-term:

`Y(F) = F(λ x.(Y(F))(x))`  

if we tried to use it, it would never work because the function Y immediately calls itself, leading to infinite recursion.

Using a little λ-calculus, however, we can wrap the call to Y in a λ-term:

`Y(F) = F(λ x.(Y(F))(x))`

Y(F) = F(λ x.(Y(F))(x))
Now, when we invoke the function Y, it immediately calls the function F, and passes it λ x.(Y(F))(x), which is equivalent to the fixed point.

Or, in JavaScript:
```
function Y(F) { 
   return F(function (x) { 
  return (Y(F))(x) ; 
 }); 
}
```
This function will actually find the fixed point of a functional, and we could use it to eliminate recursion. Of course, as defined, the function Y calls itself recursively, so we haven't really eliminated recursion yet. We've just moved it all into the function Y.
