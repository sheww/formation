#!/bin/sh
i=0
if [ -d "rep1" ]
then
	echo "Dossier existe déja"
	exit 1
fi
for i in 0 1 2
do
	mkdir rep$((i+1))
	cd rep$((i+1))
	if test $i -eq 0 
	  then
	  touch test.txt
	fi
	if test $i -eq 2 
	  then
	  mv ~/rep1/test.txt .
	fi
done
tree ~
