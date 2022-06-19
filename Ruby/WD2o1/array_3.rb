todos = [
    ["Send invoice", "money"],
    ["Clean room", "organize"],
    ["Pay rent", "money"],
    ["Arrange books", "organize"],
    ["Pay taxes", "money"],
    ["Buy groceries", "food"]
  ]
 
 a = []
 b = []
 c = []

 todos.each{|x|
     a.push (x[0]) if x[1] == "money"
     b.push (x[0]) if x[1] == "organize"
     c.push (x[0]) if x[1] == "food"
 }
puts ["money", "#{a}"], ["organize", "#{b}"], ["food", "#{c}"]

