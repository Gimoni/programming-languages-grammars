from util.VT100 import cursorMove, reset, clearScreen, setForeground,\
    setBackground

from util.Font import printFont
from time import sleep
from random import randint



clearScreen()

for i in range(50):
    ch = chr(randint(ord('0'), ord('9')))
    printFont(ch, 1, 1+i)
    sleep(0.1)
    printFont(' ', 1, 1+i)
    
for i in range(30):
    ch = chr(randint(ord('0'), ord('9')))
    printFont(ch, 1+i, 50)
    sleep(0.1)
    printFont(' ', 1+i, 50)
    
for i in range(50):
    ch = chr(randint(ord('0'), ord('9')))
    printFont(ch, 30, 50-i)
    sleep(0.1)
    printFont(' ', 30, 50-i)
    
for i in range(30):
    ch = chr(randint(ord('0'), ord('9')))
    printFont(ch, 30-i, 1)
    sleep(0.1)
    printFont(' ', 30-i, 1)
    
reset()


print("Program End")