#!/bin/bash



read -p "Enter your username: " username && [[ $username =~ ^[A-Z]+$ ]] && echo "Valid username: $username" || echo "Invalid username. Please enter a string in UPPERCASE without spaces."

