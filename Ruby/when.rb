ss = "Saran"
case ss.when
when ss.s String
  puts"It is a string"
when ss.i Integer
  puts"It is Integer"
else
  puts"I don't know what it is"
end