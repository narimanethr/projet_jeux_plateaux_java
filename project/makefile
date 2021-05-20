ARCHIVE_FILES=$(wildcard jar/* test/* documents/* src/*) manifesthumanwar manifesthumanfarm manifestfarm manifestwar Makefile README.md
PACKAGE = game
DELETE = classes docs

all: cls doc



doc: 
	cd src && javadoc $(PACKAGE) -d ../doc

cls:


clean:
	rm -r $(DELETE)
	
.PHONY: all clean doc cls

.ONESHELL:

