# jphys1
A test repository for students to practice using git, java, and other software tools.

## Requirements
From a Linux or Mac terminal, run the following commands to make sure the required software is relatively up-to-date:
```tcsh
java -version
git --version
mvn --version
```

## Setup
- Contact me to be added to the list of collaborators. This will give you permission to push changes into this repository.
- Clone this repository to your local machine and then change directory (`cd` command) into it.
```tcsh
git clone https://github.com/naharrison/jphys1.git
cd jphys1
```
- Run `git config user.email` to check if git knows who you are. If not, do `git config user.email your_email@address.com`. You should use the email address you used to set up your github account. You may want to do `git config --global user.email your_email@address.com` to permanently set your git email address.
- Run `mvn install` to build the project.

## Developing the code
Now you can make changes to the code using your favorite text editor (Vim) or IDE. Once you've finished your changes, do `git status` to double check what changes you've made. It's also a good idea to pull in any recent changes made by other developers before you add, commit, and push your changes. Do all of this with the following four commands:
```tcsh
git pull
git add -A
git commit -m "A short comment describing your changes" -m "Optional: add a 2nd (or 3rd) comment with more details"
git push
```
## Running the code
- Run `mvn install` again to include any new changes.
- To run the example code MyProgram1.java, do `java -cp target/jphys1-1.0-SNAPSHOT.jar edu.ung.MyProgram1`
- If you get tired of running the same commands over and over again, you can create a shell script. For example, create a new file called build-and-run.sh with the following contents:
```tcsh
#!/bin/sh

echo "beginning build and run..."
mvn install
java -cp target/jphys1-1.0-SNAPSHOT.jar edu.ung.MyProgram1
echo "all done!"
```
- Make the file executable with the command `chmod +x build-and-run.sh`
- Now you can run everything in the shell script with the simple command `./build-and-run.sh`
