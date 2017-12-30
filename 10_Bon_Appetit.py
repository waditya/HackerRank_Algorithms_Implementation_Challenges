#!/bin/python3

import sys

def bonAppetit(n, k, b, ar):
    # Complete this function
    
    sum_to_be_split_equally = sum(ar) - ar[k]
    
    split_for_Anna = sum_to_be_split_equally / 2
    
    if b == split_for_Anna:
        return('Bon Appetit')
    else:
        return(b - int(split_for_Anna))

n, k = input().strip().split(' ')
n, k = [int(n), int(k)]
ar = list(map(int, input().strip().split(' ')))
b = int(input().strip())
result = bonAppetit(n, k, b, ar)
print(result)
