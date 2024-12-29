// program to  abstract
from abc import ABC, abstractmethod

# Abstract class
class Animal(ABC):
    
    @abstractmethod
    def make_sound(self):
        pass

# Subclass
class Dog(Animal):
    
    def make_sound(self):
        return "Bark"

class Cat(Animal):
    
    def make_sound(self):
        return "Meow"

# Using the classes
dog = Dog()
print(dog.make_sound())  # Output: Bark

cat = Cat()
print(cat.make_sound())  # Output: Meow
