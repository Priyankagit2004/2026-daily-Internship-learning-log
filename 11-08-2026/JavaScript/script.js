let total = 100;

total += 50;   // Adds 50 to total
console.log("after add = " + total);  // Outputs: 150

total *= 2;    // Multiplies total by 2
console.log("after mul = " + total);  // Outputs: 300

total -= 100;  // Subtracts 100 from total
console.log("after sub = " + total);  // Outputs: 200


let age = 20;
let hasLicense = true;

// AND operator: Both conditions must be true
if (age >= 18 && hasLicense) {
  console.log("You can drive!");
} else {
  console.log("You cannot drive.");
}

// OR operator: Only one condition needs to be true
if (age < 18 || !hasLicense) {
  console.log("You cannot drive.");
} else {
  console.log("You can drive!");
}

// NOT operator: Negates the value
let isLoggedIn = false;
console.log(!isLoggedIn);  // Outputs: true

let firstName = "John";
let lastName = "Doe";
let fullName = firstName + " " + lastName;

console.log(fullName);  // Outputs: John Doe

age = 30;
let name = "Alice";
let isStudent = true;

console.log(typeof age);       // Outputs: number
console.log(typeof name);      // Outputs: string
console.log(typeof isStudent); // Outputs: boolean


let count = 10;
console.log(++count);
console.log(count++);
console.log(count);
