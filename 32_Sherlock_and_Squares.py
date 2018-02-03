#!/bin/python3

import sys
import math

def squares(a, b):
    ##print(a)
    ##print(b)
    ##print(math.sqrt(a))
    ##print(math.ceil(math.sqrt(a)))
    if math.ceil(math.sqrt(a)) * math.ceil(math.sqrt(a)) >= a:
        lower_bound = math.ceil(math.sqrt(a))
    else:
        lower_bound = a
    ##print("Lower bound : "+str(lower_bound))
    ##print(math.sqrt(b))
    ##print(math.floor(math.sqrt(b)))
    if math.ceil(math.sqrt(b)) * math.ceil(math.sqrt(b)) > b and math.floor(math.sqrt(b)) * math.floor(math.sqrt(b)) < b:
        upper_bound = math.floor(math.sqrt(b))
    else :
        upper_bound = math.ceil(math.sqrt(b))
    ##print("Upper bound : "+str(upper_bound))
    return(upper_bound - lower_bound + 1)

if __name__ == "__main__":
    q = int(input().strip())
    for a0 in range(q):
        a, b = input().strip().split(' ')
        a, b = [int(a), int(b)]
        result = squares(a, b)
        print(result)

