#!/bin/python3

import sys

def designerPdfViewer(h, word):
    #Calculate the ASCII value of character in the word. For [a - z], the ASCII value is [97 - 122]. Subtract 97 from the obtained         ##value and substitute it as the index of array h stating height of each character alphabetically.
    
    ##Calculate the width of the word.
    
    width_of_the_word = len(word)
    width_of_a_character = 1
    ##Calculate the maximum possible height of the word
    
    maximum_height_of_word = 1
    
    for index in range(0, width_of_the_word, 1):
        if h[ord(word[index]) - 97] > maximum_height_of_word:
            maximum_height_of_word = h[ord(word[index]) - 97]
    ##The time complexity is O[N]. Space complexity is O[N]
            
    ##Calculate the area of the highlighted word
    
    area = width_of_the_word * width_of_a_character * maximum_height_of_word
    return(area)

if __name__ == "__main__":
    h = list(map(int, input().strip().split(' ')))
    word = input().strip()
    result = designerPdfViewer(h, word)
    print(result)
