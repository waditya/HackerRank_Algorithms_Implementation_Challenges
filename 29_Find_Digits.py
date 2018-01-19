#!/bin/python3

import sys

def findDigits(n):
    numberString = str(n)
    result = 0
    
    for i in range(0, len(numberString), 1):
        digit = int(numberString[i])
        if  digit!= 0:
            if n % digit == 0:
                result = result + 1
    return(result)

if __name__ == "__main__":
    t = int(input().strip())
    for a0 in range(t):
        n = int(input().strip())
        result = findDigits(n)
        print(result)

