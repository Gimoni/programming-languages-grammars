

import time

current = time.time();          # 현재시간을 초단위로 return

# year = 0
# month = 0
# day = 0
# week = 0

# hour = (current//(1000*60*60))%24 
# minute = (current//(1000*60))%60 
# second = (current//1000)%60

hour = int(current)//60//60%24 + 9
minute = int(current)//60%60
second = int(current)%60

print("current = ", current)
print("current = ", current, type(current))

# print("%04d-%02d-%02d-%02d" % (year, month, day, week))        # 연산자 오버로딩
print(type(hour), type(minute), type(second))        # 연산자 오버로딩
print("%02d:%02d:%02d" % (hour, minute, second))        # 연산자 오버로딩




print("Program End...")