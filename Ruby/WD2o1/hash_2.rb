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

for i in 0...todos.length do
    for j in 0...todos[i].length do
        if todos[i][j] == "money"
            a.push(todos[i][0])
        end
        if todos[i][j] == "organize"
            b.push(todos[i][0])  
        end
        if todos[i][j] == "food"
            c.push(todos[i][0])  
        end
    end
end

puts "money:"
for d in 0...a.length do
    puts a[d]
end
puts "organize:"
for e in 0...b.length do
    puts b[e]
end
puts "food:"
for f in 0...c.length do
    puts c[f]
end
print "\n\n"