#!/bin/python3

import sys

def angryProfessor(k, a):
    threshold = 0
    for i in range(0, len(a), 1):
        if a[i] <= 0:
            threshold = threshold + 1
    if threshold >=k:
        return('NO')
    else:
        return('YES')

if __name__ == "__main__":
    t = int(input().strip())
    for a0 in range(t):
        n, k = input().strip().split(' ')
        n, k = [int(n), int(k)]
        a = list(map(int, input().strip().split(' ')))
        result = angryProfessor(k, a)
        print(result)
