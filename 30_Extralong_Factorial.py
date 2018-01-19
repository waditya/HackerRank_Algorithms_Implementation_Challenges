#!/bin/python3

import sys

def extraLongFactorials(n):
    result = 1
    while(n - 1):
        result = result * n
        n = n - 1
        #print(n)
    print(result)
    
    

if __name__ == "__main__":
    n = int(input().strip())
    extraLongFactorials(n)

