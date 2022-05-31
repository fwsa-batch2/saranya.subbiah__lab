class GLOBALVARIABLE
    $var=10
    def print
      puts "Hello am Saranya #$var"
    end
end

class GLOBALVARIABLE2
    def output
        puts "Saran #$var"
    end
end

obj1=GLOBALVARIABLE.new
obj1.print
obj2=GLOBALVARIABLE2.new
obj2.ouput