# from util.VT100 import clearScreen
# import util.VT100
# from util.Font import printFont

import util.VT100 as VT100
import util.Font as Font



VT100.clearScreen()
# util.VT100.clearScreen()
# clearScreen

# printFont
Font.printFont('0', 1, 1)
Font.printFont('1', 1, 10)
Font.printFont('2', 1, 20)
Font.printFont('3', 1, 30)


VT100.reset()


print ("End.. ")