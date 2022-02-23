
                      var num, i, chk=0;
                      num=prompt("Enter a Number");
                        for(i=2; i<num; i++)
                        {
                           if(num%2==0)
                           {
                             chk++;
                             break;
                           }
                        }
                      if(chk==0)
                      document.write(num + " is a Prime Number");
                      else
                      document.write(num + " is not a Prime Number");
