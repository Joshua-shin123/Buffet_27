joke = input("Would you like to hear a joke? ")

if joke == "yes" or "Yes" or "yeah" or "Yeah":
    import random
    x = (random.randrange(5))
    jokelist = ["I can't belive I got fired from the calendar factory. All I did was take a day off!", "Money talks, but mine always says goodbye.", "Why can't you trust an atom? Because they make up literally everything!", "I'm reading a book about anti-gravity, and its impossible to put down!", "I'd tell you a construction joke, but I'm still working on it."]
    print(jokelist[x])
else:
    print("Aww man!")