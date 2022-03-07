<h1>Facade-Muster</h1>
<h2>Kino Beispiel</h2>
Gegeben sind eine Vielzahl von Klassen zur Steuerung und Verwendung eines Heimkino-Systems.
Darunter befinden sich Klassen wie:
<ul>
    <li>Amplifier</li>
    <li>DvD Player</li> 
    <li>Projektor</li>
    <li>Tuner</li>
    <li>...</li>
</ul>

Damit ein Film starten kann, müssen einige Aufgaben erledigt werden, welches ein komplexes
Gebilde erschafft.

<h2>Facade-Muster</h2>
Mit dem Facade-Muster kann ein komplexes (Basis)-System eingebettet und die Verwendung vereinfacht werden. 
Die Facade-Klasse stellt nur andere Schnittstellen zur Verwendung zur Verfügung. Der Basis-Klassen werden nicht verändert.
Das (Basis)-System steht auch weiterhin zur Verfügung. 

<h2>Facade vs. Adapter-Muster</h2>
Fassaden und Adapter können mehrere Klassen einpacken. Der Zweck einer Fassade ist jedoch die Vereinfachung einer Schnittstelle. 
Hingegen soll ein Adapter eine Schnittstelle in eine andere umwandeln.

