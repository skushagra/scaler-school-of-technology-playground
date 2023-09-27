#!/bin/bash


fun() {
	echo "Hello from fun()"
}


sum() {
	num1=$1
	num2=$2
	let sum=num1+num2
	echo "sum is $sum"

}

sum $1 $2
