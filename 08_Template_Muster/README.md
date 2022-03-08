<h1>Template-Muster</h1>

<h2>Was ist ein Template?</h2>
Bei einem Template ist der grobe aufbau immer ähnlich, jedoch können einige 
kleine änderungen unternommen werden. 

<h2>Kaffee und Tee Rezept</h2>
In unserem Beispiel gibt es zwei Rezepte:

<table>
    <tr>
        <th>Kaffee Rezept</th>
        <th>Tee Rezept</th> 
    </tr>
    <tr>
        <td>Boil some water</td>
        <td>Boil some water</td>
    </tr>
    <tr>
        <td>Brew coffee in boiling water</td>
        <td>Steep tea in boiling water</td>
    </tr>
    <tr>
        <td>pour coffee in cup</td>
        <td>pour tea in cup</td>
    </tr>
    <tr>
        <td>add sugar and milk</td>
        <td>add lemon</td>
    </tr>
</table>

Wir merken, dass "Boil some water" und "pour *** in cup" gleich sind und die Reihenfolge der 
zubereitung sehr ähnlich ist. Es ist möglich ein allgemeines Rezept daraus zu machen, welches den grundlegenden Prozess 
beschreibt. 
<table>
    <tr>
        <th>Kaffee Rezept</th>
        <th>Tee Rezept</th>
        <th>Allgemeines Rezept</th>
    </tr>
    <tr>
        <td>Boil some water</td>
        <td>Boil some water</td>
        <td>boilWater()</td>
    </tr>
    <tr>
        <td>Brew coffee in boiling water</td>
        <td>Steep tea in boiling water</td>
        <td>brew()</td>
    </tr>
    <tr>
        <td>pour coffee in cup</td>
        <td>pour tea in cup</td>
        <td>pourInCup()</td>
    </tr>
    <tr>
        <td>add sugar and milk</td>
        <td>add lemon</td>
        <td>addCondiments()</td>
    </tr>
</table>

Dies wird als eine abstrakte Klasse implementiert mit "brew()" und "addCondiments()" 
als abstrakte Methoden. Diese werden in den erweiterten Klassen implementiert. 
Zudem erstellen wir eine "prepareTemplate" Methode, welches alle funktionen ausführt.

<h2>Template vs. Strategy</h2>
<h3>Strategy</h3>
Kapselt austauschbare Operationen eines Algorithmus und delegiert die Entscheidung, wie eine Operation implementiert wird. 
<h3>Template</h3>
Unterklassen entscheiden wie einzelne Schritte eines Algorithmus implementiert werden. 

