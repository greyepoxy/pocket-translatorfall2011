JC = javac
JFLAGS = -g -d .
.SUFFIXES: .java .class
.java.class:
	$(JC) $(JFLAGS) $*.java

CLASSES = \
		src/Micro.java

all: group compiler

group:
	printf "Brian Bowman\nJustin Huffaker\n"
	
compiler: classes

classes: $(CLASSES:.java=.class)

clean:
	$(RM) *.class
