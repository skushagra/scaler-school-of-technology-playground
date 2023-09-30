#!/bin/bash

BASE_DIR=$1

# Check if directory BASE_DIR exists

if [ ! -d $BASE_DIR  ]
then
	echo "$BASE_DIR is not a directory or does not exist."
	exit 1
fi

# echo "$BASE_DIR exists"

# Check if archive folder exists. If not create one.

if [ ! -d $BASE_DIR/archive  ]
then
	mkdir "$BASE_DIR/archive"
fi

# echo "Archive folder available"


# Create a backup and save it in archive folder

all_file_to_archive=$(find $BASE_DIR -type f -size +5k)
for file in $all_file_to_archive
do
	echo "Archiving $file"
	gzip $BASE_DIR/$file
	mv "$BASE_DIR/$file.gz" "$BASE_DIR/archive/$file.gz"
done
