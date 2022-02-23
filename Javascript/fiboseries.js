
         let number = parseInt(prompt("Enter the number of terms: "));
         let num1 = 0, num2 = 1, nextTerm;
         
         document.write("Fibonacci Series:");
         
         for (let i = 0; i < number; i++) {
             document.write("<br>");
             document.write(num1);
             nextTerm = num1 + num2;
             num1 = num2;
             num2 = nextTerm;
         }
         
