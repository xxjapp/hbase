# hbase

## Original Content

Apache HBase [1] is an open-source, distributed, versioned, column-oriented
store modeled after Google' Bigtable: A Distributed Storage System for
Structured Data by Chang et al.[2]  Just as Bigtable leverages the distributed
data storage provided by the Google File System, HBase provides Bigtable-like
capabilities on top of Apache Hadoop [3].

To get started using HBase, the full documentation for this release can be
found under the doc/ directory that accompanies this README.  Using a browser,
open the docs/index.html to view the project home page (or browse to [1]).
The hbase 'book' at docs/book.html has a 'quick start' section and is where you
should being your exploration of the hbase project.

The latest HBase can be downloaded from an Apache Mirror [4].

The source code can be found at [5]

The HBase issue tracker is at [6]

Apache HBase is made available under the Apache License, version 2.0 [7]

The HBase mailing lists and archives are listed here [8].

1. http://hbase.apache.org
2. http://labs.google.com/papers/bigtable.html
3. http://hadoop.apache.org
4. http://www.apache.org/dyn/closer.cgi/hbase/
5. http://hbase.apache.org/docs/current/source-repository.html
6. http://hbase.apache.org/docs/current/issue-tracking.html
7. http://hbase.apache.org/docs/current/license.html
8. http://hbase.apache.org/docs/current/mail-lists.html

## Build with Eclipse

1. maven not work correctly case 1

    ```
    Could not calculate build plan: Plugin org.apache.maven.plugins:maven-antrun-plugin:1.6 or one of its dependencies could not be resolved: Failed to read artifact descriptor for org.apache.maven.plugins:maven-antrun-plugin:jar:1.6
    ```

    **Solution**: remove `~/.m2` and import hbase maven project again

2. maven not work correctly case 2

    ```
    AClusterStatus cannot be resolved to a type	AvroServer.java	/hbase/src/main/java/org/apache/hadoop/hbase/avro	line 159	Java Problem
    ```

    **Solution**: clean git ignored files and import hbase maven project again, or add the following to generated .classpath file

    ```xml
	<classpathentry kind="src" output="target/classes" path="target/generated-jamon">
		<attributes>
			<attribute name="optional" value="true"/>
			<attribute name="maven.pomderived" value="true"/>
		</attributes>
	</classpathentry>
	<classpathentry kind="src" output="target/classes" path="target/generated-sources/java">
		<attributes>
			<attribute name="optional" value="true"/>
			<attribute name="maven.pomderived" value="true"/>
		</attributes>
	</classpathentry>
    ```
