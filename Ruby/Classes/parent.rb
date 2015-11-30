class Parent < Person
  attr_accessor :children

  def initialize(name, age, children)
    @name = name
    @age = age
    @children = children
  end

  def children
    @children.each do |child|
      puts child
    end
  end
end
