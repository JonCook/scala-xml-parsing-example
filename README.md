# Scala XML processing example
Example scala project to demontrate scala’s built-in support for XML and its more concise syntax for dealing with iterables and collections. Read the full accompanying [blog post](http://joncook.github.io/blog/2013/11/03/xml-processing-with-scala/)

## Usage
Assumes you have jdk, scala and sbt installed. Clone and run sbt test from the root directory below.

## Project structure
The structure of this project: 

    Application directory (scala-xml-parsing-example.root)
      - src
        - main
          - scala
            - com
              - cookybear
                - content
                  - asset
        - test
          -resources
            - xml
          - scala
            - com
              - cookybear
                - content
                  - asset
                  - util
        

Here's a brief rundown of each directory and its contents.

### src/main/scala/com/cookbear/content/asset
Contains domain classes implemented with toXML fromXML methods, equivalent of java POJO's.

### src/test/resources/xml
Represents xml fixtures used in unit tests, snippets of xml.

### src/test/scala/com/cookbear/content/asset
Unit test classes implemented using [scalatest](http://www.scalatest.org/) and junit runner

### src/test/scala/com/cookbear/content/util
Utility classes used by unit test, for example fixture loader
