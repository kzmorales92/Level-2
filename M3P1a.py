#Karen Morales
# 4/22/19
# Mod 3. 1b
# write a recursive function to compute the factorial number

def fac (number) :
	if number <1 :
		return 1
	else :
		return number * fac(number -1)
print(fac(9))
	
