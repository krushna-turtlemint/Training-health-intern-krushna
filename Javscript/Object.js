//There is no need to create the class to create object like other languages
// All propertise are accessible from anywhere from the object
var obj = { 1: "mk" };
console.log("Myboject", obj);
obj.name = "krushna";
obj.sirname = "Mali";
console.log("Added new field to the object : ", obj["name"]); // Bracket Notations

console.log("Added new field to the object : ", obj.sirname); // Dot notations

// Donot use the dot notation when propertise starts with number or it is reserved word
console.log("USe square bracket notation: ", obj["1"]);
console.log("The object is : ", obj);

// Nested objects
var nestedObj = { 1: "what are you doing", object: obj };
console.log(nestedObj);
delete nestedObj[1];

console.log("Delete the fields", nestedObj);
