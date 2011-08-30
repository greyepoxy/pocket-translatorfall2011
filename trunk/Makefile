JC = javac
SOURCEPATH = ./src
CLASSPATH = ref/antlrworks-1.4.3.jar
JFLAGS = -g -classpath $(CLASSPATH) -sourcepath $(SOURCEPATH) -d .
.SUFFIXES: .java .class
.java.class:
	$(JC) $(JFLAGS) $*.java

CLASSES = \
		src/MicroLexer.java \
		src/Micro.java


all: group compiler

group:
	printf "Brian Bowman\nJustin Huffaker\n"
	
compiler: classes

classes: $(CLASSES:.java=.class)

clean:
	$(RM) *.class
