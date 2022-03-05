<h1>Observer-Muster</h1>
<h2>Vorliegende Problem (Reporter <-> NachrichtenSender)</h2>
Als Beispiel für das Observer-Muster nehmen wir uns ein Beispiel anhand einem Reporter und mehreren NachreichtenSender. 
<b>Mehrere</b> Nachrichtensender wollen vom Reporter eine Auskunft haben und rufen diesen an. Als Reporter <b>kann er nur einen 
NachrichtenSender antworten</b>. Die anderen müssen <b>warten</b>.<br>
Dadurch verbraucht der Reporter nur unnötig Zeit, weil er jedem NachrichtenSender seine Geschichte erzählen muss und 
die NachrichtenSender verschwenden auch ihre Zeit, da sie warten müssen, bis er mit dem Vorherigem fertig ist.

<h2>Observer-Muster</h2>
Der Reporter gibt nur einmal eine Geschichte raus und die NachrichtenSender können es sich angucken. Wenn es eine 
änderung gibt, werden diese benachrichtigt. <br>
Typischerweise hat der Observer (Reporter) folgende funktionen und Attribute:
<ul>
    <li>ArrayList aus Abos</li>
    <li>Funktion für das Registrieren der Abos</li>  
    <li>Funktion für das Entfernen der Abos</li>
    <li>Funktion für das Benachrichtigen der Abos, welches durch das Interface der Abos erfolgt</li>
</ul>






