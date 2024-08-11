#!/bin/bash

validate_password() {
    local password=$1

    if [[ "$password" =~ ^[a-zA-Z0-9]+$ ]] && [[ "$password" =~ [a-z] ]] && [[ "$password" =~ [A-Z] ]]; then
        return 0  # Valid
    else
        return 1  # Invalid
    fi
}

echo "enter username"
read username

while true; do
echo "enter password"
read password

    if validate_password "$password"; then
        echo "Password is valid."
        break
    else
        echo "Invalid password. Please enter a password that is alphanumeric and contains both uppercase and lowercase letters."
    fi
done

echo "Username: $username"
echo "Password: [hidden]"
~
~
~
~
~
~
~
