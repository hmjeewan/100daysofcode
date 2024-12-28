#Day 5 - Conditional Statements
'''2. Write a program that takes three numbers as input and prints the largest among them'''

num1 = int(input("Enter first number: "))
num2 = int(input("Enter second"))
num3 = int(input("Enter third"))
if num1 > num2 and num1 > num3:
    print("Largest number is ", num1)
elif num2 > num1 and num2 > num3:
    print("Largest number is ",num2)
else:
    print("Largest number is ",num3)