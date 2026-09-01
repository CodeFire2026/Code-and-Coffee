# List = you can use any type of data (string, numbers, etc.)
# Colecciones en Python
# Las listaas tambien se conocen en otros lenguajes como arreglos o vectores

names = ["Santiago","Mateo","Valentín","Martina"]
print(names)
print(names[0])
print(names[-1])
print(names[0:2]) #It only shows the 0-1 index but not the 2's index.

#Going from the beginning of the list to the index (without including it)
print(names[ :3])

#Going from the indicated index till the end.
print(names[1: ])

#Changing a value inside a list
names[3] = "Valentina"
names[0] = "Osvaldo"
print(names)

#Iterate a list
for name in names: #name is singular, the list is plural
    print(name)
else:
    print("List elements are over")

#We ask how many elements does the list have
print(len(names)) #We use the list as a parameter

#We agregate an element
names.append("Marcelo")
names.append([1,2,3])
names.append(True)
names.append(10.45)
names.append([4,5])
names.append(7)
print(names)

#Insert a new element in a specific index
names.insert(1,"Alberto")
print(names)
names.insert(3,"Debora")
print(names)

#We eliminate an element
names.remove("Osvaldo")
print(names)

#We eliminate the last element
names.pop()
print(names)

#We elminate a specific index
del names[2]
print(names)

#We eliminate, delete or clean every element
names.clear()
print(names)

#We eliminate the list
del names
#print(names)

#We define a tuple
kitchen = ("Spoon", "Knife", "Fork")
print(len(kitchen))

#Access an element, for this we use [], not ()
print(kitchen[0])
#Show the inverse way
print(kitchen[-1])

#How to access a range
print(kitchen[0:2])
#Example
vegetables = ("potato",) #A tuple needs at least from one element; a coma
#Otherwise it would only be a string type

#We go through the elements in the tuple
for cook in kitchen: #Print is using \n for line jumps
    print(cook,end=" ") #We use end= to delete line jumps

#MODIFYING A TUPLE IS SOMETHING YOU SHOULD NEVER DO
kitchenList = list(kitchen)
kitchenList[0] = "Plate"
kitchen = tuple(kitchenList)
print("\n",kitchen)

#del kitchen this is to eliminate a tuple

# Set type. It is important for data that can not be duplicated, such as a DNI or a car id.
planets = {"Mars", "Jupiter", "Venus"}
print(len(planets)) # We use len function, which means length

#Verify if an element exists into a set. It is very important to write the word exactly as it is set
print("Mars" in planets)

#Aggregate an element. You can not aggregate duplicated elements, such as adding "Earth" 2 or more times.
planets.add("Earth") #add is a function
print(planets)

#Eliminating elements.
planets.remove("Mars") # This function shows an error when entering a misspelling word.
print(planets)
planets.discard("Earthhh") # This function doesn't show anything when entering a misspelling word.
print(planets)

# Cleaning set.
planets.clear()
print(planets)

# Eliminating a set.
del planets
# print(planets)

# "Messi":10 A dictionary is composed by 2 elements
# A KEY AND A VALUE
dictionary = {
    "IDE":"Integrated Development Environment",
    "POO":"Programación Orientada a Objetos",
    "SABD":"Sistema de Administración de Base de Datos"
}
# Verify the amount of elements in the dictionary
print(len(dictionary))
print(dictionary)

# Access a dictionary with the key
print(dictionary["IDE"])

# Another way of recovering an element (function)
print(dictionary.get("POO"))
print(dictionary.get("SABD"))

# We modify elements
dictionary ["IDE"] = "Entorno de Desarrollo Integrado"
print(dictionary)

# How to go through elements
for term in dictionary: # We can only access the keys
    print(term)

# We need a function to go through a dictionary (.items)
for term, value in dictionary.items():
    print(term, value)

# Other ways of going through a dictionary (function .keys)
for term in dictionary.keys():
    print(term) # It only shows keys

for value in dictionary.values():
    print(value) # It only shows values

# Check the existence of an element
print("IDE" in dictionary) # It shows a boolean

# Aggregate an elemnt
dictionary["PK"] = "Primary Key"
print(dictionary)

# Eliminating an element
dictionary.pop("SABD")
print(dictionary)

# How to clear a dictionary
dictionary.clear()
print(dictionary)

# How to eliminate a dictionary
del dictionary

# How to concatenate lists
list1 = [1,2,3,1]
list2 = [4,5,6,1]
list3 = list1 + list2 # Concatenation
print(list3)

list3.extend([7,8,9,1]) # Function to aggregate elements to a list
print(list3)

print(list3.index(5)) # Function to find in which index is the entered value
#print(list3.index(0)) # If a searched element isn't part of the list, there will be an error

# How to know how many repeated values are there into a list
print(list3.count(1))

# How to turn a list upside down
list3.reverse()
print(list3)

# How to make a list multiply repeating its elements
list3 = list3 * 2
print(list3)

# Organization methods, in Python it's a function
list3.sort() # It organizes elements ascendingly
print(list3)

list3.sort(reverse=True) # It organizes elements descendingly
print(list3)

# Tuple Review
tuple = (1,"Hi",1.5,[1,2,3],4,"Hello") # It can contain any kind of data type inside
print(tuple)

print(4 in tuple) # Boolean action, its answer will be a boolean type
# What we can use inside a tuple are: index, count, len
# In tuples you can turn a tuple into a list and a list into a tuple

# Set type review
# How to define a set
set1 = set() # It´s empty
set2 = {"Bye"}
set1.add(67)
set2.add("Hi")
print(set1)
set1.add("Hi")
print(set2)
print(3 not in set2) # We ask if number 3 is NOT in set2

# How to make the equality of two sets
print(set2 == set1) # It shows a boolean as an answer

# Set operations
set3 = set1 | set2 # The line merge both sets
print(set3)

# Set elements in common
set3 = set1 & set2 # Which elements are there in common
print(set3)

set3= set1 - set2 # Assigns the value that is in set1 but not in set2
print(set3)

set3 = set2 - set1
print(set3)

set3 = set1 ^ set2 #Elements that don't share or are different from each other
print(set3)

set3 = set1 | set2
print(set1.issubset(set3)) # We ask if a set is a subset of other
print(set1.issubset(set3))
print(set3.issubset(set1))
print(set3.issubset(set2))

print(set3.issuperset(set1)) # We ask if set1 elements are inside set3
print(set3.issuperset(set2)) # If it's true, it means set3 is a superset
print(set2.issuperset(set3))

# How to know if both sets are disjointed, this means they share NO elements between them
print(set1.isdisjoint(set2)) # There are NO things in common

# Turn a set into unchangeable
set1 = frozenset # This makes the set be totally unchangeable
# We can't aggregate, modify or eliminate elemnts inside the set

# Dictionary Review
newDictionary = {"Blue" : "Azul", "Red" : "Rojo", "Green" : "Verde", "Yellow" : "Amarillo"}
print(newDictionary)

# How to eliminate
del (newDictionary["Red"]) # You can delete keys, but never values associated to those keys.
print(newDictionary)

# Dictionaries can store different type of data
dictionary2 = {"Santu":{"Age":40,"Height":1.83}, "Osvaldo":[45,1.85],"Natalia":[35,1.67]}
print(dictionary2)

argentinaNationalTeam = {
    10: {"Name": "Lionel Messi", "Age": 35, "Height": 1.70, "Price": "50M", "Position": "Right Winger"},
    20: {"Name": "Nicolás Paz", "Age": 21, "Height": 1.75, "Price": "70M", "Position": "Attacking Midfielder"},
    8: {"Name": "Alexis Mac Allister", "Age": 27, "Height": 1.74, "Price": "70M", "Position": "Central Midfielder"},
    9: {"Name": "Julián Álvarez", "Age": 26, "Height": 1.70, "Price": "90M", "Position": "Striker"},
    24: {"Name": "Enzo Fernández", "Age": 25, "Height": 1.78, "Price": "65M", "Position": "Central Midfielder"},
    13: {"Name": "Cristian Romero", "Age": 28, "Height": 1.85, "Price": "60M", "Position": "Centre-Back"},
    17: {"Name": "Nicolás González", "Age": 28, "Height": 1.80, "Price": "30M", "Position": "Left Winger"},
    22: {"Name": "Lautaro Martínez", "Age": 28, "Height": 1.74, "Price": "80M", "Position": "Striker"},
    11: {"Name": "Giuliano Simeone", "Age": 23, "Height": 1.79, "Price": "35M", "Position": "Right Winger"},
    5: {"Name": "Leandro Paredes", "Age": 32, "Height": 1.80, "Price": "8M", "Position": "Defensive Midfielder"}
}
for key, value in argentinaNationalTeam.items():
    print(key, value)

print("The amount of players we´ve got uploaded into the dictionary is: ", end="")
print(len(argentinaNationalTeam))






