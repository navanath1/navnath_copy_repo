#!/bin/bash

echo "All Java files:"
find -name "*.java" -print

echo "All Java files older than 10 days:"
find -name "*.java" -mtime -10 -print

find -name "*.java" -mtime -10 -delete 
echo "Files older than 10 days removed"
