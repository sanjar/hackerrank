# Print the list in lexicographic increasing order.

x = 2
y = 2
z = 2
n = 2
fa = []
for i in range(x+1):
    ia = []
    for j in range(y+1):
        for k in range(z+1):
            if (i+j+k) != n:
                ia.append(i)
                ia.append(j)
                ia.append(k)
                ia_copy = ia.copy()
                fa.append(ia_copy)
                ia.clear()

print(fa)
