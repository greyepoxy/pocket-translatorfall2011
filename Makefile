JC = javac
SOURCEPATH = ./src
CLASSPATH = .:./ref/antlrworks-1.4.3.jar
JFLAGS = -g -classpath $(CLASSPATH) -sourcepath $(SOURCEPATH) -d .
.SUFFIXES: .java .class
.java.class:
	$(JC) $(JFLAGS) $*.java

CLASSES = \
		src/MicroParserLexer.java \
		src/MicroParserParser.java \
		src/Micro.java


all: group compiler

group:
	@echo Brian Bowman
	@echo Justin Huffaker
	
compiler: classes

classes: $(CLASSES:.java=.class)

clean:
	$(RM) *.class
