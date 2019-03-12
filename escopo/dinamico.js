var x = -1;

 function printX_statico(){
    var x = 0;
    console.log("(Estatico) X: " + x); // 0
}

function printX_dinamico(){
    var x = 0;
    console.log("(Dinamico) X: " + this.x); // ???
}

function printX() {
    printX_statico();   
    
    printX_dinamico();    
    
    this.printX_dinamico();
    this.x = this.x + ' (alterado)';
}

var a = { printX_dinamico, printX_statico, printX, x: "A" };
var b = { printX_dinamico, printX_statico, printX, x: "B" };
var c = { printX_dinamico, printX_statico, printX         };

console.log("\nA:");
a.printX();

console.log("\nB:");
b.printX();

console.log("\nC:");
c.printX();

console.log('');
a.printX_dinamico();
b.printX_dinamico();
c.printX_dinamico();