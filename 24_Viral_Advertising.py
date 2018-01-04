#!/bin/python3

import sys
import math

def viralAdvertising(n):
    no_of_shares_on_a_day = [2]
    for index in range(n-1):
        no_of_shares_on_a_day.append(int(3 * no_of_shares_on_a_day[index]/2))
    return(sum(no_of_shares_on_a_day))
        

if __name__ == "__main__":
    n = int(input().strip())
    result = viralAdvertising(n)
    print(result)
