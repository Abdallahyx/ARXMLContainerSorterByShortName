# ARXMLContainerSorterByShortName

The Container Reorderer program reads an ARXML file containing a list of containers with unique IDs and reorders them alphabetically by their sub-container name "SHORT-NAME". The reordered containers are then written to a new ARXML file.

**ARXML** stands for Autosar xml

**Autosar** stands for AUTomotive Open System ARchitecture

## Requirements

To run the program, you need to have the following dependencies installed:

- Java Development Kit (JDK) 8 or later

## Exceptions

The program may throw the following exceptions:

1- **NotValidAutosarFileException**: This is a user-defined checked exception that is thrown when the input file is not a valid Autosar XML file with a ".arxml" extension. The exception message will indicate that the file is not a valid Autosar file.

2- **EmptyAutosarFileException**: This is a user-defined unchecked exception that is thrown when the input file is empty. The exception message will indicate that the file is empty.

If an exception is thrown during the program execution, the program will terminate and the exception message will be displayed on the console.


## Usage

To use the program, you need to have an ARXML file that contains a list of containers with unique IDs. Each container should have a sub-container called "SHORT-NAME" that contains the name of the container.

1- Clone the repository from GitHub or download the source code as a ZIP file.

2- Extract the Zip file.

3- You can just run Run.bat to test all the cases: (It also contains the compilation of the whole program.)
  • Normal case
  • Not valid Autosar file case 
  • Empty file
  
Or you can open cmd and run these commands:

- To compile the whole program:

```
javac *.java
```

- To test the program:

```
java App Sample.arxml
```
## Examples

Here's an example of how to use the program:

Suppose we have an input ARXML file named Sample.arxml with the following contents:

```xml
<?xml version="1.0" encoding="UTF-8"?>
<AUTOSAR>
   <CONTAINER UUID="198ae269-8478-44bd-92b5-14982c4ff68a">
       <SHORT-NAME>ContainerB</SHORT-NAME>
       <LONG-NAME>AA</LONG-NAME>
   </CONTAINER>
   <CONTAINER UUID="198ae269-8478-44bd-92b5-14982c4ff68b">
       <SHORT-NAME>ContainerA</SHORT-NAME>
       <LONG-NAME>BB</LONG-NAME>
   </CONTAINER>
   <CONTAINER UUID="198ae269-8478-44bd-92b5-14982c4ff68c">
       <SHORT-NAME>ContainerC</SHORT-NAME>
       <LONG-NAME>CC</LONG-NAME>
   </CONTAINER>
</AUTOSAR>
```

To reorder the containers alphabetically by their sub-container name "SHORT-NAME", we can run the following command:

```
java App Sample.arxml
```

After the program has executed, the output file named Sample_mod.arxml will contain the reordered containers:

```xml
<?xml version="1.0" encoding="UTF-8"?>
<AUTOSAR>
   <CONTAINER UUID="198ae269-8478-44bd-92b5-14982c4ff68a">
       <SHORT-NAME>ContainerA</SHORT-NAME>
       <LONG-NAME>BB</LONG-NAME>
   </CONTAINER>
   <CONTAINER UUID="198ae269-8478-44bd-92b5-14982c4ff68b">
       <SHORT-NAME>ContainerB</SHORT-NAME>
       <LONG-NAME>AA</LONG-NAME>
   </CONTAINER>
   <CONTAINER UUID="198ae269-8478-44bd-92b5-14982c4ff68c">
       <SHORT-NAME>ContainerC</SHORT-NAME>
       <LONG-NAME>CC</LONG-NAME>
   </CONTAINER>
</AUTOSAR>
```



