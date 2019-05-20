a,b=map(int,input().split(" "))
c,w=map(int,input().split(" "))
i,q=map(int,input().split(" "))
if a==c==i:
	print("yes")
elif b==w==q:
	print("yes")
elif a==b and c==w and i==q:
	print("yes")
else:
	print("no")
