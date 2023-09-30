#!/bin/bash


all_files_to_archive=$(find ./ -type f -size +5k)

for file in $all_files_to_archive
do
	echo $file
done
