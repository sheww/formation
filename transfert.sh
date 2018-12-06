#!/bin/bash

#AUTHOR Jeremy Dos Santos

# Script qui permet de se connecter et de telecharger un fichier venant d'un 
# serveur ftp passer en paramètre  et de l'enregistrer la ou l'on souhaite

# Verifie si tous les paramètres sont passés par l'utilisateur

if test $# -ne 4 
  then
        echo "Erreur au niveau des parametres"
        exit 1
fi

# Stocke les paramètres dans des variables plus compréhensible

filename=$1
local_dir=$2
remote_dir=$3
hostname=$4
user="jdossantos"

#Charge le mot de passe a partir d'un fichier
pass=`cat password`

# Print afin que l'utilisateur puisse verifier s'il ne s'est pas trompé

#echo "Connexion au serveur $hostname envoi de $filename"

# Se connecte au serveur

ftp -n $hostname << EOF 
quote USER $user
quote PASS $pass
binary
get $remote_dir/$filename $local_dir/$filename

EOF
