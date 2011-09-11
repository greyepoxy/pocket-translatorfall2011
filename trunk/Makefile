JC := javac
LIB_ANTLR := lib/antlrworks-1.4.3.jar
ANTLR_SCRIPT := src/MicroParser.g
SOURCEPATH := src
BUILDPATH := classes
GENERATEDPATH := generated
JFLAGS := -g -classpath $(LIB_ANTLR) -sourcepath $(SOURCEPATH) -d $(BUILDPATH)
.SUFFIXES: .java .class
.java.class:
	$(JC) $(JFLAGS) $*.java

CLASSES = \
		$(SOURCEPATH)/MicroParserLexer.java \
		$(SOURCEPATH)/MicroParserParser.java \
		$(SOURCEPATH)/Micro.java


all: group makeclassdir generate compiler

makeclassdir:
	@rm -rf $(BUILDPATH)
	@mkdir $(BUILDPATH)

generate:
	@rm -rf $(GENERATEDPATH)
	@mkdir $(GENERATEDPATH)
	@java -cp $(LIB_ANTLR) org.antlr.Tool -verbose -o $(GENERATEDPATH) $(ANTLR_SCRIPT)

group:
	@echo Brian Bowman
	@echo Justin Huffaker
	
compiler: classes

classes: $(CLASSES:.java=.class)

clean:
	$(RM) -rf $(BUILDPATH)
	$(RM) -rf $(GENERATEDPATH)
