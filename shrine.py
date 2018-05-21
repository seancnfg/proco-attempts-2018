n = int(raw_input())
a, b, c = map(int, raw_input().split())
x, y, z = map(int, raw_input().split())

print(abs(a-x) + abs(b-y) + abs(c-z))