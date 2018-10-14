a=input("enter a character")
if(a.isalpha()):
    b=a.lower()
    if(b in ['a','e','i','o','u']):
        print("it start with a vowel")
    else:
        print("it start with consonant")
else:
    print("invalid input")
