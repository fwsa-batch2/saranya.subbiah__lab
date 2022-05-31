class CLASSVARIABLE
    @@no_of_students=0

    def initialize(id, name, age)
        @stu_id=id
        @stu_name=name
        @stu_age=age
    end
    
    def result
        puts "Student id #@stu_id"
        puts "Student name #@stu_name"
        puts "Student age #@stu_age"
    end

    def total
        @@no_of_students += 1
        puts "Total Number of Students = #@@no_of_students"
    end
end

obj1=CLASSVARIABLE.new("1","Abi","19")
obj2=CLASSVARIABLE.new("2","Jeru","19")
obj1.result()
obj1.total()
obj2.result()
obj2.total()
