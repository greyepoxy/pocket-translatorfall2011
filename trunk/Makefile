JC = javac
JFLAGS = -g
.SUFFIXES: .java .class
.java.class:
	$(JC) $(JFLAGS) src/$*.java

CLASSES = \
		Micro.java

all: group compiler

group:
	printf "Brian Bowman\nJustin Huffaker\n"
	
compiler: classes

classes: $(CLASSES:.java=.class)

clean:
	$(RM) *.class