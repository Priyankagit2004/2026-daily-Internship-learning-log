console.log("Hello, World!");

let myName = "Priyanka";
console.log(myName);

let x = 10;
let y = 20;

if (x < y) {
  console.log("x is less than y");
}

//let can be changed, but const cannot be changed
let score = 100;
score = 150;
console.log(score);  // Outputs: 150

const pi = 3.14;
console.log(pi);  // Outputs: 3.14
pi = 3.15;  // Error: Assignment to constant variable.

//Naming variables
let userName = "John";
let totalScore = 100;
let $discountRate = 0.15;
let 2cool = true;  // Cannot start with a number
let total score = 95;  // No spaces allowed

//DATA TYPES
//1.STRINGS
let name = "Alice";         // Double quotes
let greeting = 'Hello!';    // Single quotes
let message = `Hi, ${name}! Welcome to JavaScript!`;  // Template literal
console.log(message);  // Outputs: Hi, Alice! Welcome to JavaScript!

//2.Numbers
let age = 30;       // Integer
let price = 19.99;  // Decimal
console.log(age + price);  // Outputs: 49.99

//3. boolean
let isLoggedIn = true;
let hasDiscount = false;
console.log(isLoggedIn);  // Outputs: true

//4.undefined
let myVar;
console.log(myVar);  // Outputs: undefined

//5.null
let emptyBox = null;
console.log(emptyBox);  // Outputs: null

//6.Symbol and bigint
let uniqueKey = Symbol("unique");
console.log(uniqueKey);  // Outputs: Symbol(unique)
let largeNumber = BigInt(9007199254740991);  // Very large number
console.log(largeNumber);  // Outputs: 9007199254740991n

//Non-Primitives Data Types
// 1. Objects
let person = {
  name: "Alice",
  age: 30,
  isStudent: true
};
console.log(person.name);  // Outputs: Alice


//2.Arrays
let colors = ["red", "green", "blue"];
console.log(colors[0]);  // Outputs: red

// Arrays can hold mixed data types
let mixedArray = [42, "hello", true, { key: "value" }];
console.log(mixedArray[3]);  // Outputs: { key: "value" }

//Dynamic Typing in JavaScript
let value = 42;          // Number
value = "Now I'm a string!";  // String
console.log(value);      // Outputs: Now I'm a string!
