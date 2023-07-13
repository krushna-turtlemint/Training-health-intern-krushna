// functions in the Js

var myFun = (args) => {
  console.log("Extra arguments passed by js : ", arguments);
  console.log("we are running the function " + args);
};
myFun("krushn");

var obj = {
  FunctionInObj: function () {
    console.log("returning something");
  },
};

obj.FunctionInObj();
