#Karen Morales
#04/16/19

# part b4: fill un the body of the fucntion below, and
#add code for the test indicated

def add_fruit(inventory, fruit, quantity=0):
    pass
new_inventory = {}
new_inventory['fruit'] = 'strawberry'
new_inventory ['quantity'] = 10
#make test work...
add_fruit(new_inventory, 'strawberries', 10)
print ('strawberry' in new_inventory.values())
#test that strawberries are in inventory
#test that new inventory strawberries is 10
new_inventory ['quantity'] += 25
add_fruit(new_inventory, 'strawberries', 25)
#test that new inventory stawberries is now 35
print ('strawberry' in new_inventory.values())
print (new_inventory)
