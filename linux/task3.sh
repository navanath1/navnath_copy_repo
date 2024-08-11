#!/bin/bash
 
read -p "Enter path (default: /home): " path && path=${path:-/home} && read -p "Enter filename: " filename && [ -f "$path/$filename" ] && echo "File found: $path/$filename" || echo "File not found in $path"
