Brian Bowman -  bowmanb
Justin Huffaker - jhuffake

To Run code after building first set CLASSPATH:
On csh or tcsh
setenv CLASSPATH ./lib/antlrworks1.4.3.jar:./classes
On bash or sh
export CLASSPATH=./lib/antlrworks1.4.3.jar:./classes
then run the code using
java Micro xxxxxx.micro

or

specify the classpath in the run command
java -cp ./lib/antlrworks1.4.3.jar:./classes Micro xxxx.micro
