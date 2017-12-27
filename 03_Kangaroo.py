#!/bin/python3

import sys

def kangaroo(x1, v1, x2, v2):
    message = None
    flag = 'NO'
    if(x1 < x2):
        if(v2 >= v1):
            message = 'NO'
        else:
            message = 'YES'
    elif (x1 > x2):
        if(v1 >= v2):
            message = 'NO'
        else:
            message = 'YES'
    else:
        if(v1 == v2):
            message = 'YES'
        else:
            message = 'NO'
    if(message == 'YES'):
        
        for i in range(0, 10000 ,1):
            if x1 + v1*i == x2 + v2*i:
                flag = 'YES'
                break;
            
    return(flag)
x1, v1, x2, v2 = input().strip().split(' ')
x1, v1, x2, v2 = [int(x1), int(v1), int(x2), int(v2)]
result = kangaroo(x1, v1, x2, v2)
print(result)
