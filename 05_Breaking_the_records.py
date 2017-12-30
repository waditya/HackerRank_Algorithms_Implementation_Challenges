#!/bin/python3

import sys

def breakingRecords(score):
    min_score = score[0]
    max_score = score[0]
    
    max_record_counter = 0
    min_record_counter = 0
    
    for ctr in range (0, len(score), 1):
        current_score = score[ctr]
        if current_score > max_score:
            max_score = current_score
            max_record_counter = max_record_counter + 1
        if current_score < min_score:
            min_score = current_score
            min_record_counter = min_record_counter + 1
    arr = [0, 0]
    arr[0] = max_record_counter
    arr[1] = min_record_counter
    
    return(arr)

if __name__ == "__main__":
    n = int(input().strip())
    score = list(map(int, input().strip().split(' ')))
    result = breakingRecords(score)
    print (" ".join(map(str, result)))


