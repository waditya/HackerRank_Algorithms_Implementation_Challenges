#!/bin/python3

import sys

def sockMerchant(n, ar):
    ##Sort the array 
    ar.sort()
    br = ar
    br = list(set(br))
    ##print(br)
    no_of_pairs = 0
    counter = 0
    ##Declare and initialize variables
    for i in range(0, len(br), 1):
        for j in range(0, len(ar), 1):
            ##print(ar[j], br[i])
            if int(ar[j]/br[i] == 1):
                ##print("Match found")
                counter = counter + 1
        ##print(counter)
        no_of_pairs = no_of_pairs + int(counter/2)
        ##print(no_of_pairs)
        counter = 0
    return(no_of_pairs)

n = int(input().strip())
ar = list(map(int, input().strip().split(' ')))
result = sockMerchant(n, ar)
print(result)
