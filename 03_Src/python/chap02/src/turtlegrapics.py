

import turtle
from tkinter import mainloop

t = turtle.Turtle('turtle')

t.speed(1)
t.pencolor('red')
t.circle(100)

for i in range(4):
    t.forward(100)
    t.left(90)

mainloop()

print("Program End...")



