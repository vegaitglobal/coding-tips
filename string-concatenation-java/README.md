# String concatenation in Java
Simple example and benchmarking of two different string concatenation in Java. 
It's created to show why you should use StringBuilder to concatenate strings.


In Concatenation class we have two methods that do the same thing, concatenate strings just in different ways.
```concatenate ``` method uses '+' for concatenation while ```concatenateWithStringBuilder``` uses StringBuilder.
For example we used the name of our company "Vega IT Sourcing" which contains 16 characters (with empty spaces).
Name is split into array of character strings and then used for concatenation.
Even in this small and simple example we can see difference when using StringBuilder by running benchmarking
on concatenation methods. 

In order to run this project first make you sure that you have java installed by running:
```java -version```.
If you get info about currently installed java, then you're good to go, 
if not, install java jdk and repeat the steps.

### How to run benchmarking
It's a maven based project, so to run it just execute:
```$xslt
mvn clean package
``` 
Which will generate a jar file that you can run with:
```$xslt
java -jar target/string-concatenation-1.0-jar-with-dependencies.jar
```

### How to run unit tests
Execute following command:
```$xslt
mvn test
``` 

