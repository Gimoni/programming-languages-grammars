from pickle import TRUE


#
# [2~100] 소수의 갯수는? 

def is_prime(num):
    for i in range(2, 101):
        sosu = True
        for j in range(2, i):
            if(i%j==0):
                sosu = False
                break
        if sosu:
            print(i, ",", end="")

num = int(2 <= 101)
#
# print(is_prime(2, 101))
print("소수는 : ", is_prime(True), num)



print("End...")