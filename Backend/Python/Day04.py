#Day 4 - Arithmetic Operations
'''1. Write a program that declares two integer variables and perform basic arithmetic operations (addition, subtraction, multiplication, division) on them. Print the results to the console.
2. Write a program that calculates the area of a rectangle. Prompt the user to input the length(integer) and width(integer) of the rectangle, calculate the area (length * width), and print the result.
3. Modify the above program to read decimal numbers as the length and width, and output the area to two decimal points'''
a=5
b=4
print(a+b)
print(a-b)
print(a*b)
print(a/b)

length=int(input("Enter the length of the rectangle: "))
width=int(input("Enter the width of the rectangle: "))
print("The area of rectangle is:",length*width)

dlength=float(input("Enter the length of the rectangle: "))
dwidth=float(input("Enter the width of the rectangle: "))
print("The area of rectangle is:" , dlength*dwidth)