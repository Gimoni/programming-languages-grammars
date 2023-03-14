

import turtle
from tkinter import mainloop

t = turtle.Turtle('turtle')

radius = 200

t.speed(0)
t.pencolor('red')

t.home()

t.up()
t.setposition(0,-radius)

t.down()
t.circle(radius)

t.up()
t.home()

t.down()
t.pencolor('black')
t.speed(8)

for i in range(10):
    t.left(36)
    t.forward(radius)
    t.setpos(0, 0)

t.speed(1)

t.left(18)
t.forward(radius)

t.left(18)
t.pencolor("purple")
t.pensize(3)

import math

# length = math.sqrt(math.pow(radius,2)*2 - 2*radius*radius*math.cos(math.radians(144)));
# length = math.sqrt((radius**2)*2 - 2*radius*radius*math.cos(math.radians(144)));
length = math.sqrt(radius**2*2 - 2*radius*radius*math.cos(math.radians(144)));

for i in range(5):
    t.left(144)
    t.forward(length)



mainloop()

print("Program End...")



