import random
amount = int(input("How many random numbers would you like? "))
numberlist = []
for x in range(0,amount):
    numberlist.append(random.randrange(1,11))
print(numberlist)