require "date"

class Todo
  attr_accessor :text,:date,:complete 
  def initialize(text,due_date,complete)
      @text = text
      @due_date = due_date
      @complete = complete
  end

  
  def overdue 
    date = Date.today
    return (@due_date < date)? true : false
  end
  def due_later
    date = Date.today
    return (@due_date >date)? true : false
  end
  def due_today
    date = Date.today
    return (@due_date == date)? true : false
  end
  
  def to_displayable_string 
     sym = (complete)? "[X]" : "[]"
     return "#{sym} #{text} #{@due_date}"
  end
end

class TodosList
  def initialize(todos) 
    @todos = todos
  end
  def add(record) 
    @todos.push(record)
  end
  def overdue
    TodosList.new(@todos.filter { |todo| todo.overdue})
  end  

  def due_today
      TodosList.new(@todos.filter { |todo| todo.due_today})
  end
  def due_later
     TodosList.new(@todos.filter { |todo| todo.due_later})
  end

  def to_displayable_list
    result = []
    @todos.each do |rec|
      date = Date.today
      if rec.date == date
        result.push("#{rec.to_displayable_string} #{rec.date}")
      else
        result.push("#{rec.to_displayable_string} #{rec.date}")
      end
    end

    return result 
  end

end

date = Date.today 


todos = [
  { text: "Submit", due_date: date - 1, completed: false },
  { text: "Pay", due_date: date, completed: true },
  { text: "File taxes", due_date: date + 1, completed: false },
  { text: "Call", due_date: date + 1, completed: false },
]

todos = todos.map { |todo|
  Todo.new(todo[:text], todo[:due_date], todo[:completed])
}

todos_list = TodosList.new(todos)

todos_list.add(Todo.new("Service", date, false))

puts "My Todo-list\n\n"

puts "Overdue\n"
puts todos_list.overdue.to_displayable_list
puts "\n\n"

puts "Due Today\n"
puts todos_list.due_today.to_displayable_list
puts "\n\n"

puts "Due Later\n"
puts todos_list.due_later.to_displayable_list
puts "\n\n"