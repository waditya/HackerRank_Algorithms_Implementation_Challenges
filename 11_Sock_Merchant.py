#!/bin/python3

import sys

def sockMerchant(n, ar):
    ##Sort the array 
    ar.sort()
    
    ##Declare and initialize variables
    no_of_pairs = 0
    
    for i in range(1, len(ar), 2):
        if ar[i] == ar[i - 1]:
            no_of_pairs = no_of_pairs + 1
        else:
            i = i - 1
    return(no_of_pairs)

n = int(input().strip())
ar = list(map(int, input().strip().split(' ')))
result = sockMerchant(n, ar)
print(result)
