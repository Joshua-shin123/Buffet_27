import requests

number = int(input("How many jokes would you like to see? "))
kind = input("Do you want single or two part jokes? ")

if kind == "single" or "singles":
    for x in range(0,number):
        joke = requests.get("https://v2.jokeapi.dev/joke/Any?blacklistFlags=nsfw,religious,political,racist,sexist,explicit&type=single").json()
        joke2Part = requests.get("https://v2.jokeapi.dev/joke/Any?blacklistFlags=nsfw,religious,political,racist,sexist,explicit&type=twopart").json()
        print(joke["joke"])

elif kind == "two part" or "twopart" or "two parts":
    for x in range(0,number):
        joke = requests.get("https://v2.jokeapi.dev/joke/Any?blacklistFlags=nsfw,religious,political,racist,sexist,explicit&type=single").json()
        joke2Part = requests.get("https://v2.jokeapi.dev/joke/Any?blacklistFlags=nsfw,religious,political,racist,sexist,explicit&type=twopart").json()
        print(joke["setup"])
        print(joke["delivery"])

else:
    print("You didn't pick doubles or singles.")