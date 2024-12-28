//Day 5 - NodeJS Timers
//Executes a function after a delay using setTimeout()
  
setTimeout(()=>{
    console.log("This message is diaplayed after 3 seconds");
},3000);

//Executes a function repeatedly with a delay between each call using setInterval()
function repeatWithDelay() {
    console.log("Function executed at", new Date().toLocaleTimeString());
  }
  
  // Call the function every 2 seconds (2000 ms)
  const intervalId = setInterval(repeatWithDelay, 2000);
  
  // Stop the interval after 10 seconds
  setTimeout(() => {
    clearInterval(intervalId);
    console.log("Interval cleared at", new Date().toLocaleTimeString());
  }, 10000);