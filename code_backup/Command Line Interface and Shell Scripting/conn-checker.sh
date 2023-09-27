#!/bin/bash

echo "=====Checking Connection====="

ping -c1 $1 &> conn.txt
if [ "$?" == 0 ];
then
	echo "Connection was successful."
else
	echo "Connection wasn't successful."
fi
