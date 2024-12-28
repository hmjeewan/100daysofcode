#Day 5 - Conditional Statements
'''4. Write a program that reads the percentage and then prints their corresponding letter grade (A, B, C, D, or F)'''

num = int(input('Enter a number: '))
if num >= 0 and num <= 100:
    if num >=75:
        print("The Grade is A")
    elif num >=65:
        print("The Grade is B")
    elif num >=55:
        print("The Grade is C")
    elif num >=45:
        print("The Grade is D")
    else:
        print("The Grade is F")
else:
    print("Invalid number")