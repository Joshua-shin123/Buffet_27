num1 = int(input("Please enter a number: "))
sum = 0
for x in range(1,num1):
    print(x, end=" + ")
    sum = sum + x
print(num1)
sum = sum + num1
print("The sum of 1 to " + str(num1) + " is: " + str(sum))