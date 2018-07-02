#!/bin/python3

#Import Libraries

import sys

def jumpingOnClouds(c, k):
    ##print(c)
    ##print(k)
    energy = 100
    flag = True
    i = 0
    while(flag):
        i = (i + k)%n
        if c[i] == 1:
            energy = energy - 3
        else:
            energy = energy - 1
        if i == 0:
            flag = False
    return(energy)

if __name__ == "__main__":
    n, k = input().strip().split(' ')
    n, k = [int(n), int(k)]
    c = list(map(int, input().strip().split(' ')))
    result = jumpingOnClouds(c, k)
    print(result)

