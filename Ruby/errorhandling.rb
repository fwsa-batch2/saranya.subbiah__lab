begin
    puts 3
  rescue ZeroDivisionError
    puts "It is a zero division error"         
  rescue TypeError
    puts "It is Type error"
  else
    puts "Error"
  ensure
    puts "Thank you"       
  end   