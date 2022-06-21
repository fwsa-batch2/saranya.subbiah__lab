def get_argument
    if ARGV.empty?
        puts "Usage: ruby lookup.rb <domain>"
        exit
    end
    ARGV.first
end


domain = get_argument



file = File.open("zone")
dns_raw = File.readlines(file)
def parse_dns(params)
    for i in 0...params.length do
        if params[i].include? "#"
            array = params.drop(i+1)
        end
    end
    hash = {}
    arr = []
    for j in 0...array.length do
        arr[j] = array[j].split(",")
        puts arr[j]
    end
    for j in 0...arr.length do
        hash[arr[j][1].strip] = arr[j][2].strip
    end
    
    hash.compact
end
def resolve(records,lookup_chain,domain_name)
    if (domain_name == "google.com" || domain_name == "ruby-lang.org")
        lookup_chain.push(records[domain_name])
        lookup_chain
    else
        key = lookup_chain.last
        puts key
        if records.has_key?(key)
            lookup_chain.push(records[key])
            #puts lookup_chain
            # puts records[key]
            # puts domain_name
            resolve(records,lookup_chain,domain_name)
            lookup_chain
        end
    end
end


dns_records = parse_dns(dns_raw)
p dns_records
lookup_chain = [domain]
lookup_chain = resolve(dns_records, lookup_chain, domain)
puts lookup_chain.join(" => ")