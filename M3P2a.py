#Karen Morales
# 04/22/19

#Mod 3.2b

#Write a recursive function to reverse a list.

fruitList = ["apples", "bananas", "oranges", "pears"]
def reverse (lst) :
    return [ lst[-1]]+ reverse (lst[:-1]) if lst else []

print (reverse(fruitList))
