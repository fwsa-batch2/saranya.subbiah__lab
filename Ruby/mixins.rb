module School
    def class
        
    end
    def Students

    end
end

module Teachers
    def StaffRoom

    end
    def Meeting

    end
end

class Matric
    include School
    include Teachers
    
   def Principal

   end
end

obj = Matric.new
obj.class
obj.Students
obj.StaffRoom
obj.Meeting
obj.Principal

