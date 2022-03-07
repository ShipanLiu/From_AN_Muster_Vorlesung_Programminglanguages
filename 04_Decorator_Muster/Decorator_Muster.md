<h1>Decorator-Muster</h1>
<h2>Probleme mit minimalen Speziealisierungen</h2>
<h3>Kaffee Problem</h3>
Zum Kaffee können verschiedene Zutaten hinzugefügt werden. Je Zutat wird dabei extra berechnet. 
Zum Beispiel:
<ul>
    <li>Heiße Milch</li>
    <li>heiße SojaMilch</li>
    <li>Schokostreusel</li>
    <li>Karamellsirup</li>
    <li>...</li>
</ul>

Wenn man nachfragen würde, ob eine bestimmte Zutat in dem Getränk enthalten ist, dann würde man für jedes Getränk diese Abfrage schreiben müssen. 
Dies würde zur Codewiederholung führen, welches schlecht in der Umsetzung ist. 
Bei einer Preisveränderung würde man jede Klasse bearbeiten müssen.

<h2>Decorator</h2>
Wir erzeugen eine Decorator Klasse, welches von der Klasse Getränk erbt. Die weiteren Zutaten erben von der Decorator Klasse. 
Die einzelnen Zutaten wissen ihren eigenen Preis. Den Objekten wird ein Getränk übergeben. Jetzt ist unser Getränkobjekt 
eine Zutat, dessen preis wir ausrechnen können. Jedesmal, wenn unser Objekt übergeben wird, ändert sich seine Klasse und der Preis wird überschrieben. 

