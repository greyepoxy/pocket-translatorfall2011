Brian Bowman -  bowmanb
Justin Huffaker - jhuffake

To Run code after building first set CLASSPATH:
On csh or tcsh
setenv CLASSPATH .:./ref/antlrworks-1.4.3.jar
On bash or sh
export CLASSPATH=.:./ref/antlrworks-1.4.3.jar
then run the code using
java Micro xxxxxx.micro

or

specify the classpath in the run command
java -cp .:ref/antlrworks-1.4.3.jar Micro xxxxxx.micro
