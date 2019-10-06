#!/bin/bash
read choice

if [ "$choice" == "Y" ] || [ "$choice" == "y" ]; then
    echo "YES"
fi

if [ "$choice" == "N" ] || [ "$choice" == "n" ]; then
    echo "NO"
fi
