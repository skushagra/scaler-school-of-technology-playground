#!/bin/bash

cd "/home/kali/System/Scaler School of Technology"
git add -A
time_of_commit=$(date)
git commit -m "Planned commit at $time_of_commit"
git push origin master
if [ "$?" == 0  ]
then
	sed -i "$aSuccessful commit to git branch at $time_of_commit" commit_logs
else
	sed -i "$aUnsuccessfull commit to git branch at $time_of_commit" commit_logs
fi

