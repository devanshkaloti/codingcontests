cases = int(input())
i = 1

while cases >= i:

    size = int(input())
    herPath = input()
    myPath = ""

    for c in herPath:
        if c == "E":
            myPath += "S"
        else:
            myPath += "E"
    print("Case #%s: %s" %(i, myPath))
    i += 1