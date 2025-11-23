#!/bin/bash
# Compile and run JUnit tests

# Compile source code
javac -d out ds/linear/linkedList/*.java

# Compile tests
javac -cp "lib/junit-platform-console-standalone-1.10.1.jar:out" -d out test/ds/linear/linkedList/*.java

# Run tests
java -jar lib/junit-platform-console-standalone-1.10.1.jar --class-path out --scan-class-path
