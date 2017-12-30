#!/bin/python3

import sys

def solve(n, s, d, m):
    ##Number of comparisons
    no_of_comparisons = n - m + 1
    
    total_number_of_ways = 0
    
    for i in range(0, no_of_comparisons, 1):
        total = 0
        for j in range(0, m, 1):
            total = s[i+j] + total
        if total == d:
            total_number_of_ways = total_number_of_ways + 1
    return(total_number_of_ways)
n = int(input().strip())
s = list(map(int, input().strip().split(' ')))
d, m = input().strip().split(' ')
d, m = [int(d), int(m)]
result = solve(n, s, d, m)
print(result)
