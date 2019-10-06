#!/bin/bash
read x
read y
read z

if [ $x -eq $y ] && [ $x -eq $z ]; then
    echo "EQUILATERAL"
elif [ $x != $y ] && [ $x != $z ] && [ $y != $z ]; then
    echo "SCALENE"
else
    echo "ISOSCELES"
fi

