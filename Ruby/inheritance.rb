class Red
    def initialize
        puts "I love red colour"
    end

    def Green
        puts "The plants looks Green"
    end
end

class Black < Red
    def initialize
        puts "I love to wear Black colour dress"
    end
end

Red.new
obj = Black.new
obj.Green