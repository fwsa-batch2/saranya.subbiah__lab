class POLYMORPHISM
    def Milk
        puts "I love to drink milk"
    end
end

class Curd < POLYMORPHISM
    def Milk
        puts "I love to eat Curd rice"
    end
end

class Ghee < POLYMORPHISM
    def Milk
        puts"I love Ghee Dhosa"
    end 
end

obj = POLYMORPHISM.new
obj.Milk()

obj = Curd.new
obj.Milk()

obj = Ghee.new
obj.Milk()