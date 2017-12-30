#!/bin/python3

import sys

def divisibleSumPairs(n, k, ar):
    # Declare Variables
    number_of_pairs = 0
    
    ##Double loop logic
    
    for i in range(0, len(ar) - 1, 1):
        for j in range(i + 1, len(ar), 1 ):            
            if (ar[i] + ar[j]) % k == 0:                
                number_of_pairs = number_of_pairs + 1
    return(number_of_pairs)

n, k = input().strip().split(' ')
n, k = [int(n), int(k)]
ar = list(map(int, input().strip().split(' ')))
result = divisibleSumPairs(n, k, ar)
print(result)
