// array not the similar to other language they are object which works like other object in js
// But when we access like this arr[0] then 0 is converted to 0 => "0" implicitely
var myArray = [1, 2, 3, 4, 200, 6];
var arr2 = myArray;
console.log(typeof arr2);
arr2.push(10);
arr2.sort();
myArray.sort(function (a, b) {
  return a - b;
});
console.log("add element", arr2, myArray);
