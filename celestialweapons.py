n = int(raw_input())
godLimit = map(int, raw_input().split())
prices = sorted(map(int, raw_input().split()))
ans = []
for god in godLimit:
    #find which they can buy
    found = False
    if prices[0] > god:
        ans.append('-1')
    else:
        for x in range(len(prices) - 1, -1, -1):
            if god >= prices[x]:
                ans.append(str(prices[x]))
                prices.pop(x)
                found = True
                break
        if found == False:
            ans.append("-1")
print(" ".join(ans))
