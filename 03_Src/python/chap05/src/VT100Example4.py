# 함수 사용. 
from  util.VT100 import (clearScreen, 
                         cursorMove, 
                         setForeground, 
                         setBackground, 
                         reset)

clearScreen()

cursorMove(10, 20)
setForeground(31)       # red
setBackground(44)       # blue
print("Hello World")

reset()
print("Program End")





