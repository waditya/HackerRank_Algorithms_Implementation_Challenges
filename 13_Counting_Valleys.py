#!/bin/python3

import sys

def countingValleys(n, s):
    counter = 0
    up_counter = 0
    no_of_valleys = 0
    for i in range(0, len(s), 1):
        if s[i]== 'D':
            if counter < 3:
                counter = counter + 1
        else:
            counter = 0
        if counter == 2:
            no_of_valleys = no_of_valleys + 1
    return(no_of_valleys)

if __name__ == "__main__":
    n = int(input().strip())
    s = input().strip()
    result = countingValleys(n, s)
    print(result)
