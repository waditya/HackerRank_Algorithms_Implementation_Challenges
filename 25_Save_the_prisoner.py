#!/bin/python3

import sys

def saveThePrisoner(n, m, s):
    remainder = m % n
    if m > n:    
        poisoned_person_number = (remainder + (s - 1))% n
        while  poisoned_person_number > n:
            poisoned_person_number = poisoned_person_number%n 
    elif m == n:
        poisoned_person_number = (s - 1) + int((m - s + 1)/m)
    else:
        if s + m > n:
            poisoned_person_number = (n - s + 1)
        else:
            poisoned_person_number = (s + m -1)
    return(poisoned_person_number)

t = int(input().strip())
for a0 in range(t):
    n, m, s = input().strip().split(' ')
    n, m, s = [int(n), int(m), int(s)]
    result = saveThePrisoner(n, m, s)
    print(result)
