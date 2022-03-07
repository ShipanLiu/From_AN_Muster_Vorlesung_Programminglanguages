<h1>Strategie Muster</h1>
<h2>Enten Problem</h2>
Wir implementieren eine Oberklasse Ente, welches folgende Unterklassen besitz: MoorEnte, GummiEnte,
StockEnte.<br>
Auf erstem Blick würde die Oberklasse Ente folgende funktionen haben: 
<ol>
    <li>schwimmen()</li>
    <li>anzeigen()</li>
    <li>fliegen()</li>
    <li>Quaken()</li>
</ol>

Diese Funktionen werden von den Kindern verebt. Jedoch gibt es einige <b>Probleme</b>:
<ul>
    <li>Die GummiEnte kann nicht fliegen()</li>
    <li>Die GummiEnte Quakt nicht, sondern Quitcht</li>
    <li>Eine Ente kann das fliegen() erlernen</li>
    <li>Wenn diese Probleme in GummiEnte Überschrieben werden, kann es mit mehreren Enten zu vielen FUnktionen führen</li>
</ul>

<h2> Strategie-Muster (Entenverhalten)</h2>

Im Strategie-Muster ist die Oberklasse Ente vom FlugVerhalten und QuackVerhalten abhängig.
FlugVerhalten und QuackVerhalten ist ein Interface.
Im FlugVerhalten sind:
<ul>
    <li>kannFliegen()</li>
    <li>kannNichtFliegen()</li>
</ul>
Im QuackVerhalten:
<ul>
    <li>Quacken()</li>
    <li>Quitchen()</li>
    <li>nichts()</li>
</ul>

Dadurch kann eine Ente selber in der Klasse auswählen, welches Flugverhalten 
und QuakVerhalten es haben will. Wenn eine Ente lernt zu fliegen, wird einfach das 
FlugVerhalten ausgetauscht.








