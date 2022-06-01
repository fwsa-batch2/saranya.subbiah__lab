begin
    puts 3
  rescue ZeroDivisionError
    puts "It is a zero division error"         
  rescue TypeError
    puts "It is a type error"
  else
    puts "It is an error"
  ensure
    puts "Thanks for using our app"       
  end   