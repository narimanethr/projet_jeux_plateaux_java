
PACKAGE = game/*.java tuiles/*.java actions/*.java exception/*.java Joueur/*.java personnages/*.java plateaux/*.java ressources/*.java *.java


all: cls doc guerre agricole plateaux



doc: 
	cd src && javadoc game tuiles actions exception Joueur personnages plateaux ressources    -d ../doc

cls:
	cd src && javac -d ../classes $(PACKAGE)
guerre:
	cd classes && jar cvfm ../jar/guerre.jar ../manifest-guerre 
agricole:
	cd classes && jar cvfm ../jar/agricole.jar ../manifest-agricole
plateaux:
	cd classes && jar cvfm ../jar/plateaux.jar ../manifest-plateaux 

clean:
	rm -r classes docs
	
.PHONY: all clean doc cls



