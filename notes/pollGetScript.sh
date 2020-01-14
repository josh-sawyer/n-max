#!/bin/sh
#This is a simple bash script that will poll github for changes to your repo,
#if found pull them down, and then rebuild and restart spring boot application

#move into your git repo where your jekyll site is
cd ~/n-max;

git fetch;
LOCAL=$(git rev-parse HEAD);
REMOTE=$(git rev-parse @{u});

#if our local revision id doesn't match the remote, we will need to pull the changes
if [ $LOCAL != $REMOTE ]; then
    #pull and merge changes
    git pull origin master;

    #stop old service
    sudo service n-max stop;

    #build new jar
    ./gradlew build;
    
    #no shell start new jar
    sudo service n-max start;
fi
