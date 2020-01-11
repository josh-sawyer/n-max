#!/bin/sh
#This is a simple bash script that will poll github for changes to your repo,
#if found pull them down, and then rebuild and restart spring boot application 

while true
do

#move into your git repo where your jekyll site is
cd ~/a_folder_created_off_home/the_git_repo_folder_you_cloned_in;

git fetch;
LOCAL=$(git rev-parse HEAD);
REMOTE=$(git rev-parse @{u});

#if our local revision id doesn't match the remote, we will need to pull the changes
if [ $LOCAL != $REMOTE ]; then
    #pull and merge changes
    git pull origin master;

    #stop old service
    
    #remove current site directory
    sudo rm -rf /var/www/site.com/public_html;

    #build new jar

    #copy the newly built jar to new location
    sudo cp -r a_folder_created_off_home/the_git_repo_folder_you_cloned_in/_site /var/www/site.com/public_html
    
    #no shell start new jar
    sudo service nginx start;
fi
sleep 5
done