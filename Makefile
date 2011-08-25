JC = javac
JFLAGS = -g
.SUFFIXES: .java .class
.java.class:
	$(JC) $(JFLAGS) src\$*.java

CLASSES = \
		Micro.java

all: group compiler

group:
	echo "Brian Bowman"
	echo "Justin Huffaker"
	
compiler: classes

classes: $(CLASSES:.java=.class)

clean:
	$(RM) *.class