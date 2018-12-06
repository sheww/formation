#!/bin/sh

if test $# -eq 0 
  then
	  echo "Pas d'argument"
	  exit 0
fi
if test $# -gt 1
  then
	echo "Trop d'arguments"
	exit 0
fi	
	echo "Hello $1!!!"
