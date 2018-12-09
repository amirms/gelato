GeLaTo
======
Current Status
-------
### Cobol
* Island grammar-based parsing based on ANSI Cobol85 language specification with IBM extensions
* Our metamodel of the Cobol abstract syntax consists of almost 500 classes, divided into 29 packages
* Support for different features of Cobol including abbreviated conditions, etc.
* Limited Support for SQL and CICS statements
* Includes support for Copybooks by expanding COPY statements during pre-processing
* Repairing and completion of the abstract syntax model during post-processing

### Job Control Language (JCL) for batch processing in z/OS
* Multi-pass preprocessing followed by island grammar-based parsing
* Support for EXEC statements to find the programs that are invoked through a job unit. 
* TODO
	* JCL (sub-)procedures
	* INCLUDE statements, etc.

### Data flow Analysis Framework
* Perform intra-procedural and inter-procedural data flow analysis

References
-------------
* Gelato: GEneric LAnguage TOols for model-driven analysis of legacy software systems: https://ieeexplore.ieee.org/document/6671328
* A Generic Framework for Model-Driven Analysis of Heterogeneous Legacy Software Systems: https://dspace.library.uu.nl/handle/1874/359542
