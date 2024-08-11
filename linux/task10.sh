#!/bin/bash

read -p "enter the string: " string

charcters=${#string}

for ((i = 0 ; i< $charcters; i++));
do

        echo "character at position $i: ${string: $i:1}"
done




