

from util.Math import factorial
# def factorial(n):
#     value = 1;
#     for i in range(1, n+1):
#         value *= i
#
#     return value 


# print(factorial(3))
# print(factorial(10))
# print(factorial(300))

for i in range(1, 11):
    print(f'{i:2}! = {factorial(i):@>10}')






print("End...")