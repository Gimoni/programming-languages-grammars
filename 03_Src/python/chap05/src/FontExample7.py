# test example
from util.VT100 import clearScreen, reset
from util.Font import printFont
# from util.getDateTime import printDate, printTime
import time
from util.getDateTime import printTime, printDate, getWeekDay

current = time.time(); 
clearScreen()

year = 2023
month = 3
day = 20

hour = int(current)//60//60%24 + 9
minute = int(current)//60%60
second = int(current)%60

# date = '2023-03-20'
printDate = f'{year:04d}-{month:02d}-{day:02d}'
for i in range(len(printDate)):
    ch = printDate[i]        # 저장 
    # print(date[i])
    # print(ch)
    printFont(ch, 10, 10 + i*7)
    
printTime = f'{hour:02d}:{minute:02d}:{second:02d}'
for i in range(len(printTime)):
        ch = printTime[i]
        printFont(ch, 20, 25 + i*7)

# getWeekDay = f'{week:03s}'



print()
print(printDate)
print(printTime)




reset()

print("Program End")