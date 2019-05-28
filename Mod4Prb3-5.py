#Karen Morales
# 04/30/19
#Mod4Prb3-5
# creating a class named student  andf using __init__() function to assign
# values for names and major. Extend the student class by creating a method that
# prints a greeting uisng the student's name and execute it on the student1 object

class sampleClass:
    def __init__(self, name, major) :
        self. name = name
        self. major = major
    def myfunc (self):
        print ("Hello"    +   self.name)

p1 = sampleClass("Karen", "Computer Science")

print (p1.name)
print (p1.major)

p1.myfunc()


p1.major = "Business"

print (p1.major)
