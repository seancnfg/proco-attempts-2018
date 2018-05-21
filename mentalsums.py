def mentsum(x):
    count = 0
    x = str(x)
    while len(x) > 1:
        new = 0
        for j in x:
            new += int(j) ** 2
        x = str(new)
        count += 1
    print count


if __name__ == '__main__':
    q, a, b = map(int, raw_input().split())
    for i in range(1, q + 1):
        mentsum((a + b * i) % 1000000007)