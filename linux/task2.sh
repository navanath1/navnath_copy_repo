#!/bin/bash

echo "enter file name"
read filename && [ -f "$filename" ] && { echo "File: $filename"; echo "Number of Words: $(wc -w < $filename)"; echo "Number of Lines: $(wc -l < $filename)"; echo "Number of Characters: $(wc -m < $filename)"; } || echo "File not found!"

