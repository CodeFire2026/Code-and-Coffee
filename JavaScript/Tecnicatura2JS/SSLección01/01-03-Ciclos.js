// While Cycle
let counter = 0;
while(counter < 3){
    console.log(counter);
    counter++;
}
console.log("End of While Cycle");

// Do While Cycle
let count = 0;
do{
    console.log(count);
    count++;
}while(count < 3);
console.log("End of Do While Cycle");

// For Cycle
for(let counting = 0; counting < 3 ; counting++){
    console.log(counting);
}
console.log('End of For Cycle');

// Reserved Word Break
for (let counting = 0; counting <=10; counting++){
    if (counting % 2 == 0){
        console.log(counting); // It shows every even number
        break; 
    }
}
console.log('The Cycle ends when the first even number is found')

// Continue Reserved Word and Label tags
beggining:
for (let counting = 0; counting <=10; counting++){
    if (counting % 2 !== 0){
        continue beggining; // It will cotinue to the next iteration
    }
    console.log(counting);
}
console.log('The Cycle ends')















