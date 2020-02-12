ar = [1, 3, 2, 6, 1, 2]
k = 3
count = 0
for i in range(len(ar)):
    for j in ar[i+1:]:
        #print(j)
        #print(ar[i]+j)
        if (ar[i]+j) % k == 0:
            count += 1
print(count)