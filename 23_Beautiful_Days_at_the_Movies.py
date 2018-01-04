#!/bin/python3

import sys

def beautifulDays(i, j, k):
    beautiful_days = 0
    
    for i in range(i, j + 1, 1):
        ##Strings are sliceable. Slicing a string gives you a new string from one point in the string, backwards or forwards, 
        ##to another point, by given increments. They take slice notation or a slice object in a subscript:

        ##string[subscript]
        ##The subscript creates a slice by including a colon within the braces:

        ##string[start:stop:step]
        
        reverse_day = int(str(i)[::-1])
        if (reverse_day - i)%k==0:
            beautiful_days = beautiful_days + 1
    return(beautiful_days)

if __name__ == "__main__":
    i, j, k = input().strip().split(' ')
    i, j, k = [int(i), int(j), int(k)]
    result = beautifulDays(i, j, k)
    print(result)

