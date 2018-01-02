#!/bin/python3

import sys
import math

def solve(n, p):
    if n%2 == 1:
        no_of_last_page = n - 1        
    else:
        no_of_last_page = n        
    
    if p%2 == 1:
        distance_from_start = int((p-1)/2)
        distance_from_end = int((no_of_last_page - (p - 1))/2)
    else:
        distance_from_start = int(p/2)
        distance_from_end = int((no_of_last_page - p)/2)
    
    ##Return the least number of pages to turn over
    if(distance_from_start <= distance_from_end):
            return(distance_from_start)
    else:
        return(distance_from_end)
        
        

n = int(input().strip())
p = int(input().strip())
result = solve(n, p)
print(result)
