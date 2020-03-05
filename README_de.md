# Identifizierung von Design Smells mit jQAssistant

[![Build Status](https://travis-ci.org/feststelltaste/designsmells.svg?branch=master)](https://travis-ci.org/feststelltaste/designsmells/)

Dieses Repository enthält eine Beispielanwendung mit verschiedenen Design Smells.
Die Herausforderung besteht darin, so viele Design Smells wie möglich mit Hilfe von [jQAssistant](https://jqassistant.org/) zu finden.
jQAssistant ist ein strukturelles Code-Analyse-Framework (siehe Infos [in diesem Blog-Post](https://www.feststelltaste.de/top5-jqassistant/) für weitere Informationen).

Wenn du Inspirationen brauchst, was es zu finden gilt, dann wirf einen Blick in dieses Papier:

> Ganesh, Samarthyam & Sharma, Tushar. (2013). Towards a Principle-based Classification of Structural Design Smells. Journal of Object Technology. 12. 10.5381/jot.2013.12.2.a1. 


## Voraussetzungen


### Mindestanforderungen

* OpenJDK Java Development Kit mit Version >=8 ([download](https://openjdk.java.net/install/))
* Git ([download](https://git-scm.com/downloads))


### Empfohlen

* Um gut aussehende Diagramme zu erstellen, installiere GraphViz ([download](https://www.graphviz.org/download/))


## Installation

_Hinweis: Vorzugsweise verwendst du für diese Aufgaben die Git-Bash-Kommandozeile oder eine beliebige Unix-ähnliche Shell._

Klone dieses Repository mit Git:

```
git clone https://github.com/feststelltaste/designsmells.git
```


## Bauen

Baue die Software mit Maven:

```
./mvnw verify
```


## Analyse

Starte die eingebettete Neo4j-Graphen-Datenbank mit

```
./mvnw jqassistant:server
```

Durchsuche die eingescannte Software hier: http://localhost:7474


## Mitarbeit

Wenn du dir auch die Hände mit Design Smells schmutzig machen möchtest, kannst Du hier einen Pull Request erstellen, um deinen stinkenden Code hier einzubringen!

*Viel Spaß beim Identifizieren einiger wirklich schlechter Design Smells mit jQAssistant!*
