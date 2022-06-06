class ENCAPSULATION
    def initialize(chocolates, icecream, biscuits)
        @Choco = chocolates
        @Ice = icecream
        @Bis = biscuits
    end

    def details
        puts "Chocolate :  #@Choco"
        puts "Icecream :  #@Ice"
        puts "Biscuits :  #@Bis"
    end
end

obj1 = ENCAPSULATION.new('DairyMilk', 'Butterscotch', 'Brittania')
obj2 = ENCAPSULATION.new('Kitkat', 'Chocolate', 'Bourboun')
    obj1.details()
    obj2.details()