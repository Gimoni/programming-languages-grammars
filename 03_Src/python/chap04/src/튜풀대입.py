
x = 1
y = 2

x1, y1 = 10, 20 # tuple 대입

print(x1, y1)

x1, y1 = y1, x1

print(x1, y1)

tmp = x1
x1 = y1
y1 = tmp

print(x1, y1)


print("Program End...")