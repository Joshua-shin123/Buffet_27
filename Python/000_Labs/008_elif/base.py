x = int(input("Please enter a number: "))
y = input("Please enter an operation ( - + * / ): ")
z = int(input("Please enter another number: "))

if y == "+":
    answer = x + z
    print(str(x) + " " + y + " " + str(z) + " = " + str(answer))
elif y == "-":
    answer = x - z
    print(str(x) + " " + y + " " + str(z) + " = " + str(answer))
elif y == "*":
    answer = x * z
    print(str(x) + " " + y + " " + str(z) + " = " + str(answer))
elif y == "%":
    answer = x % z
    print(str(x) + " " + y + " " + str(z) + " = " + str(answer))
else:
    answer = x / z
    print(str(x) + " " + y + " " + str(z) + " = " + str(answer))