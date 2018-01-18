#!/bin/python3

import sys

def saveThePrisoner(n, m, s):
    if m > n:
        return(m%n + s - 1)
    elif m==n:
        return(m - (s - 1))
    else:
        diff = n - m
        if s + m > n:
            return(n - s + 1)
        else:
            return(s + m -1)

t = int(input().strip())
for a0 in range(t):
    n, m, s = input().strip().split(' ')
    n, m, s = [int(n), int(m), int(s)]
    result = saveThePrisoner(n, m, s)
    print(result)

