"""
Exercise 1: Iterate a range from 0 to 10 printing numbers divisible by 3
Run example: 0,3,6,9

Exercise 2: Create a range of numbers between 2 and 6 and print them
Run example: 2,3,4,5,6

Exercise 3: Create a range from 3 to 10 but increasing by 2, instead of 1.
Run example: 3,5,7,9
"""

#Exercise 1:
print("Range from 0 to 10 with numbers divisible by 3")
for i in range(11):
    if i % 3 == 0:
        print(i)

#Exercise 2:
print("Range from 2 to 6")
for i in range(2,7):
    print(i)

#Exercise 3:
print("Range from 3 to 10 increasing by 2")
for i in range (3,11,2):
    print(i)



