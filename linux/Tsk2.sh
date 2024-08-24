#!/bin/bash
echo "enter the path to the file"
read filename
file_content=$(wc "$filename")
wordcount=$(wc -w  "$filename")
linecount=$(wc -l  "$filename")
charcount=$(wc -m  "$filename")
echo "File: $filename"
echo "File content : $file_content "
echo "Number of words : $wordcount"
echo "Number of lines : $linecount"
echo "Number of characters : $charcount"
