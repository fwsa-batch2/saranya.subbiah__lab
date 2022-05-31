class INSTANCEVARIABLE
    def Students(name,age)
        @stu_name=name
        @stu_age=age
    end
    def Blazers
        puts"StudentName #@stu_name"
        puts"StudentAge #@stu_age"
    end
end
obj1=INSTANCEVARIABLE.new
obj1.Students("Abi", 19)
obj1.Blazers

