# ARXMLContainerSorterByShortName

The Container Reorderer program reads an ARXML file containing a list of containers with unique IDs and reorders them alphabetically by their sub-container name "SHORT-NAME". The reordered containers are then written to a new ARXML file.

**ARXML** stands for Autosar xml
**Autosar** stands for AUTomotive Open System ARchitecture

## Requirements

To run the program, you need to have the following dependencies installed:

- Java Development Kit (JDK) 8 or later

Exceptions
The program may throw the following exceptions:

1- **NotValidAutosarFileException**: This is a user-defined checked exception that is thrown when the input file is not a valid Autosar XML file with a ".arxml" extension. The exception message will indicate that the file is not a valid Autosar file.

2- **EmptyAutosarFileException**: This is a user-defined unchecked exception that is thrown when the input file is empty. The exception message will indicate that the file is empty.

If an exception is thrown during the program execution, the program will terminate and the exception message will be displayed on the console.


## Usage

To use the program, you need to have an ARXML file that contains a list of containers with unique IDs. Each container should have a sub-container called "SHORT-NAME" that contains the name of the container.

1- Clone the repository from GitHub or download the source code as a ZIP file.
2- Extract the Zip file.
3- You can just run Run.bat to test all the cases: (It also contains the compilation of the whole program.)
  • Normal case --> provide the input file and specify it’s name inside the batch script.
  • Not valid Autosar file case --> provide the file also 
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




