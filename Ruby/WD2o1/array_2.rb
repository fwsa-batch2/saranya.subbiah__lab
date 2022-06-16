books = ["Design as Art", "Anathem", "Shogun"]
authors = ["Bruno Munari", "Neal Stephenson", "James Clavell"]
if books.length == authors.length
    for i in 0...authors.length
        p "#{books[i]} was written by #{authors[i]}"
    end
end