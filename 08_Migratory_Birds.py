#!/bin/python3

import sys

def migratoryBirds(n, ar):
    type = 0
    ar.sort()
    previous_streak = 1
    current_streak = 1
    
    type_of_maximum = 1
    
    for i in range(1, n, 1):
        if ar[i] == ar[i-1]:
            current_streak = current_streak + 1
            if current_streak > previous_streak:
                previous_streak = current_streak
                type_of_maximum = ar[i]
        else:
            current_streak = 1
    return(type_of_maximum)

n = int(input().strip())
ar = list(map(int, input().strip().split(' ')))
result = migratoryBirds(n, ar)
print(result)
