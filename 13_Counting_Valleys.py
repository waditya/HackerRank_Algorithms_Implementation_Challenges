#!/bin/python3

import sys

def countingValleys(n, s):
    counter = 0
    up_counter = 0
    no_of_valleys = 0
    for i in range(0, len(s), 1):
        if s[i]== 'D':
            counter = counter - 1
        else:
            counter = counter + 1
        if counter == 0 and s[i] == 'U':
            no_of_valleys = no_of_valleys + 1
    return(no_of_valleys)

if __name__ == "__main__":
    n = int(input().strip())
    s = input().strip()
    result = countingValleys(n, s)
    print(result)
