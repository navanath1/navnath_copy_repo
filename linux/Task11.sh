#!/bin/bash
echo "Enter a string:"
read string
length=${#string}
for (( i=0; i<$length; i++)); do
    char=${string:i:1}
    count=$(echo "$string" | grep -o "$char" | wc -l)
    echo "$char=$count"
done

