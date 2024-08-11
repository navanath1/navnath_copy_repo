#!/bin/bash
count=0; find . -type f -name "*.java" -mtime -10 -print | while read file; do echo "File modified in last 10 days: $file"; ((count++)); done; echo "Total files: $count"
