
import random as r 
import time

while True :
    line = r.random()

    ch = chr(int(r.random()*26) + ord('A'))           # 코드값을 알아내는 함수 ord 

    print(line)
    print(ch)
    time.sleep(1)

# for 문을 사용해서 5번의 결과를 출력하고 프로그램을 종료. 
# for i in range(5):
#     line = r.random()
#
#     ch = chr(int(r.random()*26) + ord('A'))           # 코드값을 알아내는 함수 ord 
#
#     print(line)
#     print(ch)
#     time.sleep(1)


    
print("Program End...")






# In [1]: ord('A')
# Out[1]: 65
#
# In [2]: ord('a')
# Out[2]: 97
#
# In [3]: ord('0')
# Out[3]: 48
#
# In [4]: chr(65)
# Out[4]: 'A'
#
# In [5]: chr(97)
# Out[5]: 'a'
#
# In [6]: chr(48)
# Out[6]: '0'