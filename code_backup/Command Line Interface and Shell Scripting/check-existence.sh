#!/bin/bash

# -d to check if directory exists

if [ -f $1 ] || [ -d $1 ]
then
	echo "$1 found"
else
	echo "$1 not found"
fi
