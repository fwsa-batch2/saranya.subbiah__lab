books = ["Design as Art", "Anathem", "Shogun"]
authors = ["Bruno Munari", "Neal Stephenson", "James Clavell"]
num = {}
for val in 0...books.length do
    for a in 0...authors.length do
        if val == a
            b = authors[a].split.first.downcase.to_sym
            c = books[val]
            num.store(b,c)
        end
    end
end
puts num