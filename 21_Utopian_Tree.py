#!/bin/python3

import sys

def utopianTree(n):
    height_of_tree = 1
    for i in range(1, n + 1, 1):
        if i%2 == 1:
            height_of_tree = 2 * height_of_tree
        else:
            height_of_tree = height_of_tree + 1
    return(height_of_tree)

if __name__ == "__main__":
    t = int(input().strip())
    for a0 in range(t):
        n = int(input().strip())
        result = utopianTree(n)
        print(result)

