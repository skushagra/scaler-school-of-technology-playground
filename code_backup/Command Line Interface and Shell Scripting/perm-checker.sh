#!/bin/bash

# Check if file name provided
if [ "$#" -ne 1 ]
then
	echo "Expecting file name. Filename not found"
	exit 1
fi

filename=$1

# Check if file exists

if [ ! -f $filename  ]
then
	echo "$filename not found"
	exit 1
fi

# Check permissions on files

if [ -r $filename  ]
then
	echo "Read permission on $filename"
else
	echo "$file is read protected"
	chmod u+r $filename
fi

if [ -w $filename  ]
then
	echo "Write permission on $filename"
	chmod u+w $filename
else
	echo "$file is write protected"
fi

if [ -x $filename  ]
then
	echo "Execute permission $filename"
else
	echo "$filename is execute protected"
	chmod u+x $filename
fi
