<h1>Command-Muster</h1>
<h2>Programmierbare Fernbedienung</h2>
Es gibt eine bestimmte Anzahl and programmierbaren Plätzen, welches durch ein An und Aus Knopf gesteuert werden. 
Angenommen, wir besitzen bereits Klassen, wie:
<ul>
    <li>Licht</li>
    <li>TV</li> 
    <li>Stereo</li>
    <li>...</li>
</ul>
Der Client soll ein Command in der Fernbedienung (Invoker) einspeichern können, welches später benutzt werden kann, 
um diesen Command auf dem Gerät (Receiver) abspielen zu können. 
Es gibt also 2 Sequenzen:
<ol>
    <li>Ein command wird erstellt und eingespeichert.</li>
    <li>Der Invoker spielt den Command auf den Receiver ab.</li>
</ol>

Dafür erstellen wir eine Klasse, die vom Interface Command implementiert und die vom Hersteller 
erstellten Klasse verbindet. Es funktioniert ähnlich wie das Adapter-Muster, nur dass der Adapter vom 
Interface Command implementiert.
<br>
<br>
In unserem Beispiel, werden wir ein Licht in eine Fernbedienung implementieren, mit folgenden KLassen:
<ul>
    <li>Licht (Vom Hersteller)</li>
    <li>LichtCommand (Unsere Verbindung)</li>
    <li>Command (Interface)</li>
    <li>Main (Fernbedienung)</li>
</ul>



