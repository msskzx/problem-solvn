#!/bin/bash

#https://www.hackerrank.com/challenges/bash-tutorials---getting-started-with-conditionals/problem?isFullScreen=true

read ans
if [[ "$ans" == "Y" || "$ans" == "y" ]]; then
    echo "YES"
elif [[ "$ans" == "N" || "$ans" == "n" ]]; then
    echo "NO"
fi
