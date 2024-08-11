#!/bin/bash

echo "enter the dir_path"
read dir_path

echo "enter the filename"
read filename

if [ -z "$dir_path" ]; then
	dir_path="/"
fi

if [ ! -d "$dir_path" ]; then
	echo "the $dir_path does not exit"
	dir_path="/"
fi

echo "searching for the $filename in $dir_path"
find "$dir_path" -name "$filename"



