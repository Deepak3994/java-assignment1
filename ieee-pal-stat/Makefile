
all:
	javac -cp .:/home/chiru/sois/jarfiles/poi-3.15-beta2/poi-3.15-beta2.jar:/home/chiru/sois/jarfiles/poi-3.15-beta2/poi-ooxml-3.15-beta2.jar *.java

runtest:
	java -classpath /home/chiru/sois/jarfiles/poi-3.15-beta2/poi-3.15-beta2.jar:/home/chiru/sois/jarfiles/poi-3.15-beta2/poi-ooxml-3.15-beta2.jar:/home/chiru/sois/jarfiles/poi-3.15-beta2/ooxml-lib/xmlbeans-2.6.0.jar:/home/chiru/sois/jarfiles/poi-3.15-beta2/poi-ooxml-schemas-3.15-beta2.jar:. TestStatPAL $(DATA_PATH)

clean:
	rm -f *.class
