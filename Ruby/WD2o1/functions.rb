def salute(name,app)
    arr = name.split(" ")
    line = "#{app.capitalize()} Mr. #{arr.last}"
end
puts salute("Nelson Rolihlahla Mandela", "hello")
puts salute("Sir Alan Turing", "welcome")