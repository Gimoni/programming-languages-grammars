# Global Variable 전역변수 , Nonlocal Variable 지역변수 


num = 100       #전역변수 

def xxx():
    # print(num)  #전역변수 
    # global num  # 전역변수 참조 
    
    num = 200   #지역변수 
    print(num)
    
xxx()

print(num)


print("Program End.. ")