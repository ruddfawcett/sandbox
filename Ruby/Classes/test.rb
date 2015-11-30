require_relative 'person'
require_relative 'parent'
require_relative 'child'

bob = Child.new("Bob Doe", 16)
jane = Child.new("Jane Doe", 16)

john = Parent.new("John Doe", 48, [bob, jane])

puts john

if john.is_a?(Parent)
  john.children
end
