#Day 5 - Conditional Statements
'''3. Write a program that checks if a given input year is a leap year or not'''

year = int(input('Enter the year: '))
if year % 4 == 0 and year % 100 != 0 :
    print('The year is a leap year')
else:
    print('The year is not a leap year')