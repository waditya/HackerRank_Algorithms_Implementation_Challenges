#!/bin/python3

import sys
import math 
def solve(grades):
    arr = []
    ##print(len(grades))  ##-Debug_01
    for j in range(0, len(grades), 1):
        if grades[j] > 37:
            multiple_of_5 = math.ceil(grades[j]/5)
            ##print(multiple_of_5 ##-Debug_02
            if multiple_of_5*5 - grades[j] < 3:
                grades[j] =multiple_of_5*5
    return(grades)                
n = int(input().strip())
grades = []
grades_i = 0
for grades_i in range(n):
    grades_t = int(input().strip())
    grades.append(grades_t)
result = solve(grades)
print ("\n".join(map(str, result)))


