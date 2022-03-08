<h1>Composite-Muster</h1>
Das Composite Muster bietet an Struktur, um einzelne und gruppierte Objekte hierarchisch verwalten zu können. 
<br> Für den Anwender (Client) ist es nicht ersichtlich, ob ein einzelnes oder gruppiertes Objekt verwendet wird. Es entsteht somit eine einheitliche Verwendung.<br>
Bei der Implementierung müssen jedoch Aspekte der Konsistenz Transparent und Sicherheit beachtet werden. <br>
Iteratoren können zum Durchlauf von Composite-Strukturen verwendet werden.

<h2>Braindead Erklärung</h2>
Ein Composite-Muster ist einfach eine Baum, welches aus einem ... interface Component (wobei alles ein Component ist):
<table>
    <th><< interface >><br>Component</th>
    <tr>
        <td>
            <ul>
                <li>doOperation(): void</li>
                <li>addComponent(component: Component): void</li>
                <li>removeComponent(component: Component): void</li>
                <li>getChild(index: int): Component</li>
            </ul>
        </td>
    </tr>
</table>
... ein Composite, welches Component implementiert. Dabei stellt Composite, eine Wurzel im Baum da, welches mindestens ein Blatt hat.
<table>
    <th>Composite</th>
    <tr>
        <td>
            - components: ArrayList< Component > 
        </td>
    </tr>
    <tr>
        <td>
            <ul>
                <li>doOperation(): void</li>
                <li>addComponent(component: Component): void</li>
                <li>removeComponent(component: Component): void</li>
                <li>getChild(index: int): Component</li>
            </ul>
        </td>
    </tr>
</table>
... und ein Blatt, welches auch Component implementiert:
<table>
    <th>Leaf</th>
    <tr>
        <td>
            - components: ArrayList< Component > 
        </td>
    </tr>
    <tr>
        <td>
            <ul>
                <li>doOperation(): void</li>
                <li>addComponent(component: Component): void</li>
                <li>removeComponent(component: Component): void</li>
                <li>getChild(index: int): Component</li>
            </ul>
        </td>
    </tr>
</table>

<h2>Beispiel Implementierung</h2>
Wir werden jetzt als beispiel ein Familienbaum implementieren, welches statt 
Vater und Mutter die bezeichnung parent hat und wir davon ausgehen, dass ein Kind nur 
ein Parent hat. <br>
Ein Child hat die Fähigkeit zu Schreien (cry()) und der Parent hat die Fähigkeit 
es zu beruhigen (calmChild()):
<table>
    <th><< Interface >><br>FamilyMember</th>
    <tr>
        <td>
            <ul>
                <li>getName(): String</li>
                <li>getAge(): int</li> 
                <li>addChild(FamilyMember child): void</li>
                <li>removeChild(FamilyMember child): void)</li>
                <li>getChild(int index): FamilyMember</li> 
                <li>Cry(): void</li>
                <li>calmChild(): void</li>
            </ul>
        </td>
    </tr>
</table>
Die Klassen Parent soll die gleichen Funktionen haben wie das interface, wobei der Parent nicht 
die Funktion Cry() besitzt, weshalb in der funktion Cry() folgendes drin steht: 
"throw new UnsupportedOperationException();".
<table>
    <th>Parent</th>
    <tr>
        <td>
            - Children: ArrayList < FamilyMember >
        </td>
    </tr>
    <tr>
        <td>
            <ul>
                <li>Parent(FamilyMember child)</li>
                <li>...</li>
            </ul>
        </td>
    </tr>
</table>
Das Kind heat kein Children ArrayList somit werden auch seine Funktionen mit einem 
UnsupportedOperationException überschrieben. Jedoch hat es die Methode Cry().
Wenn das Kind ein Parent wird, wird er der Parent Klasse übergeben und ist somit ein Parent.


