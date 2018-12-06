#!/bin/bash

if test $# -eq 0
  then
	  echo "Aucun argument fourni"
	  exit 2
fi
  echo "Hello $1"
