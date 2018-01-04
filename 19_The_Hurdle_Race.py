#!/bin/python3

import sys

def hurdleRace(k, height):
    maximum_height = k
    no_of_magic_drinks_consumed = 0
    
    for i in range(0, len(height), 1):
        if height[i] > maximum_height:
            no_of_magic_drinks_consumed = no_of_magic_drinks_consumed + height[i] - maximum_height
            maximum_height = height[i]
    return(no_of_magic_drinks_consumed)
            

if __name__ == "__main__":
    n, k = input().strip().split(' ')
    n, k = [int(n), int(k)]
    height = list(map(int, input().strip().split(' ')))
    result = hurdleRace(k, height)
    print(result)
