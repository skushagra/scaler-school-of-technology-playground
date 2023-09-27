#!/bin/bash

fun() {
	num=$1
	num1=$2
	let sum=num+num1
 	echo "sum is $sum"
 	exit $sum
}

fun 100 200
# echo !!
echo $?
