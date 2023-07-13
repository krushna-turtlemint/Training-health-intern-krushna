// There are different data types in the java script such as :
// String
// Number
//Boolean
// null
// The java script is weak typing language
var a = 10;
var b = "stirng";
console.log(a, b);
console.log("you can assign any value to any variable");
a = b;
console.log("String assigned to int", a);
console.log("The type of the a and b respectively: ", typeof a, typeof b);

// coercion for type conversion
// Following will convert the integer into the string
console.log(typeof ("4" + 123));
a = 10;
b = "10";

// This is the problem while using the equal signs
if (a == b) {
  console.log("values are same due to coercion");
  console.log(
    "When we compare them the one of the values one is converted to another type"
  );
} else {
  console.log("values are not same");
}

//strict checking in the javascript

if (a === b) {
  console.log("values are same due to coercion");
} else {
  console.log("values are not same");
}
