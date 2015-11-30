maybe = true
i = 0

until !maybe
  puts i

  if i == 9
    maybe = false
  end

  i += 1
end

puts "Done."
