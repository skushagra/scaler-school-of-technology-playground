#!/bin/bash

BASE_DIR=$1

# Check if directory BASE_DIR exists

if [ ! -d $BASE_DIR  ]
then
	echo "$BASE_DIR is not a directory"
	exit 1
fi

echo "$BASE_DIR exists"

# Check if archive folder exists. If not create one.

if [ ! -d $BASE_DIR/archive  ]
then
	mkdir "$BASE_DIR/archive"
fi

echo "Archive folder available"

for file in `find $BASE_DIR -type f -size +20k`
do
	echo 'Archiving $file'
	gzip $file
	mv $BASE_DIR/$file.gz $BASE_DIR/archive/$file.gz
done
