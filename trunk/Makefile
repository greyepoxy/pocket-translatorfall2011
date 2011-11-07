JC := javac
LIB_ANTLR := lib/antlrworks-1.4.3.jar
ANTLR_SCRIPT := src/MicroParser.g
BUILDPATH := classes
GENERATEDPATH := generated
SOURCEPATH := src
JFLAGS := -g -classpath $(LIB_ANTLR) -sourcepath $(GENERATEDPATH)/src/:$(SOURCEPATH) -d $(BUILDPATH)
.SUFFIXES: .java .class
.java.class:
	$(JC) $(JFLAGS) $*.java

CLASSES = \
		$(GENERATEDPATH)/src/MicroParserLexer.java \
		$(GENERATEDPATH)/src/MicroParserParser.java \
		$(SOURCEPATH)/IRNode.java \
		$(SOURCEPATH)/TinyNode.java \
		$(SOURCEPATH)/FunctionClass.java \
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
	@echo Brian Bowman - bowmanb
	@echo Justin Huffaker - jhuffake
	
compiler: classes

classes: $(CLASSES:.java=.class)

clean:
	$(RM) -rf $(BUILDPATH)
	$(RM) -rf $(GENERATEDPATH)
