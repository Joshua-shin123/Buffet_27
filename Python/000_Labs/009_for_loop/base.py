length = int(input("Please enter line length: "))
direction = input("Do you want a horizontal or vertical line? ")

if direction == "horizontal":   
    for x in range(0,length):
        print("*", end="")

elif direction == "vertical":
    for x in range(0,length):
        print("*")
else:
    print("Sorry, thats not a direction I can provide.")