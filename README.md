# Identifying design smells with jQAssistant

This repository contains a sample application with various design smells.
The challenge is to find as many design smells as you can with the help of [jQAssistant](https://jqassistant.org/).
jQAssistant is a structural code analysis framework (see [this blog post](https://www.feststelltaste.de/top5-jqassistant/) for getting to know jQAssistant a little bit better).

If you need some inspiration about what to find, take a look at this paper:

> Ganesh, Samarthyam & Sharma, Tushar. (2013). Towards a Principle-based Classification of Structural Design Smells. Journal of Object Technology. 12. 10.5381/jot.2013.12.2.a1. 


## Prerequisites


### Minimum requirements

* OpenJDK Java Development Kit with Version >=8 ([download](https://openjdk.java.net/install/))
* Git ([download](https://git-scm.com/downloads))


### Recommended

* To produce nicely looking diagrams, install GraphViz ([download](https://www.graphviz.org/download/))


## Installation

_Hint: Preferable, you use the Git bash command line or any Unix-like shell for these tasks._

Clone this repository with Git:

```
git clone https://github.com/feststelltaste/designsmells.git
```


## Build

Build the software with Maven:

```
./mvnw verify
```


## Analysis

Start the embedded Neo4j graph database with

```
./mvnw jqassistant:server
```

Browse the scanned software here: http://localhost:7474


## Contribution

If you also want to get your hands dirty with design smells, feels free to add some bad smelling code to this repository with a Pull Request!

*Have fun identifying some really bad design smells with jQAssistant!*
