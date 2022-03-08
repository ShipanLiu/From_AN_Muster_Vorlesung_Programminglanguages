<h1>Strategie-Muster</h1>
<h2>Wann ist ein Code schlecht ?</h2>
Bei der Implementierung sollte man sich Gedanken darüber machen, ob folgende 
Punkte beachtet wurden:
<ul>
    <li><b>Code-Duplikation</b>:<br>
        ==> Fehleranfällig bei Änderungen</li>
    <li>Neue Typen hinzufügen und benötigt Zugriff auf die Klasse<br>
        ==> <b>Erweiterung</b> erschwert</li>
    <li>Unklar welche Typen unterstützt werden<br>
        ==> Undurchsichtige Nutzung</li>
</ul>

<h2>Warum / Wann Strategie-Muster ?</h2>
Ein einfaches Beispiel wäre eine Online-Zahlung an dem Verkäufer. 
Es gibt verschiedene Arten eine Online-Zahlung zu betätigen. Beispiel:
<ul>
    <li>Paypal (Nutzername)</li>
    <li>Bank (BIC, Verwendungszweck, ...)</li>
    <li>Crypto (Adresse)</li>
</ul>
Egal wie die Zahlung erfolgt, der Nutzer <b>kann zwischen diesen "Strategien" 
aussuchen</b>. Wenn sich die Funktionen <b>nur im Algorithmus unterscheiden</b> aber ein 
<b>gemeinsames Ziel</b> haben, bietet es sich an, das Strategie-Muster zu verwenden. 
Dies <b>vermindert die Code-Duplikation</b>, wenn es richtig ausgeführt wird. Zudem 
kann diese Strategie <b>in der Laufzeit umgeändert und erweitert</b> werden, ohne 
dass die Klassen, die es benutzten, darüber wissen müssen. 

<h2>Implementierung</h2>
Für ein richtiges Beispiel siehe <a href="https://github.com/anvinh01/Muster/tree/main/01_Strategie_Muster_Ente">01_Strategie_Muster_Ente</a>.<br>
Für eine Implementierung des Strategie Musters, benötigen wir ein Interface. Die möglichen Strategien sind Klassen, welches das 
Interface implementiert. Die funktionen im Interface müssen nur angedeutet werden, da diese in den Strategie 
Klassen überschrieben werden. Diese Klassen können nur die funktion von Interface zurückgeben, jedoch können intern 
private Funktionen erstellt werden. <br>
<h3>Anwendung</h3>
Wenn jetzt eine Strategie angewendet wird, wird dem Typ Strategie ein new Strat1() zugefügt. 
Falls die Strategie ein Wert annehmen soll, benötigt diese Klasse einen Konstruktor. 
Jetzt kann unsere Strategie angewendet werden und wenn nötigt ausgetauscht werden. 