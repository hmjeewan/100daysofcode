//Day 6 - File System Module Basics
/*Read and write text files using both synchronous and asynchronous methods
Append data to files
Handle common file errors
Create and read directories, and explore directory manipulation functions*/

const fs = require('fs');
//Synchronuos reading
/*let textIn=fs.readFileSync('./Files/input.txt','utf-8');
console.log(textIn);

let content=`Data read from input.txt: ${textIn}. \nDate created ${new Date()}`;
fs.writeFileSync('./Files/output.txt',content);*/

//asynchronous reading
let textaIn = fs.readFile('./Files/input.txt','utf-8',(err,data)=>{
    console.log(data);
});
console.log('Reading data...');