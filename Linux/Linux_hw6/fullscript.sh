#!/bin/bash
echo "hello student"
echo -n "Enter your name: "
read name
echo "Welcome $name"
mkdir /tmp/test
date +"%H:%M_%S" > /tpm/test/mydate.txt
echo "Saving data"

for run in {1..10}
do
echo $run
sleep 0.5
done

echo "date saved continue work"
df -h >> /tmp/test/mydate.txt
mkdir /opt/mydate
cp /tmp/test/mydate.txt /opt/mydate/newmydate.txt
for run in {1..5}
do
echo $run
sleep 1
done
echo "Well done boss"

