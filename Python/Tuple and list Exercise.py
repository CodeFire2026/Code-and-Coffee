#Given the following tuple:
tuplee = (13, 1, 8, 3, 2, 5, 8) #We define the tuple
#Create a list that only includes numbers lower than 5 and print [1, 3, 2]
list = []
for number in tuplee:
    if number < 5:
        list.append(number)
print(list)

