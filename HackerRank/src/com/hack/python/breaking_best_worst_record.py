#!/bin/python3

import math
import os
#Maria plays college basketball and wants to go pro. Each season she maintains a record of her play. She tabulates the number of times she breaks her season record for most points and least points in a game. Points scored in the first game establish her record for the season, and she begins counting from there.
#Sample Input 0

#9
#10 5 20 20 4 5 2 25 1
#Sample Output 0

#2 4


import random
import re
import sys

# Complete the breakingRecords function below.
def breakingRecords(scores):
    min1=scores[0]
    max1=scores[0]
    max_record=0
    min_record=0
    for i in scores:
        if i>max1:
            max1=i
            max_record+=1
        elif i<min1:
            min1=i
            min_record+=1
    return str(max_record) + ' ' + str(min_record)
    
if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    n = int(input())

    scores = list(map(int, input().rstrip().split()))

    result = breakingRecords(scores)

    fptr.write(result)
    fptr.write('\n')

    fptr.close()
