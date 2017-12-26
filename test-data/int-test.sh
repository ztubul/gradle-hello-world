#! /bin/bash -x
out=`java -jar $1 $2`
if [ "$out" != "$3" ]; then
	exit 1
fi
exit 0
