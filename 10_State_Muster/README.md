<h1>State-Muster</h1>

<h2>Zustandsautomaten</h2>
Einige Funktionen können/sollten nur ausgeführt werden können, wenn 
wir uns in einem bestimmten Zustand befinden. So einen Zustandsautomaten sollte uns 
von Theoretische Informatik bekannt vorkommen. 

<h2>Beispiel: Kaugummiautomat</h2>
Ein Kaugummiautomat gibt nur einen Kaugummi aus, wenn ein 50 Cent Stück 
vorliegt. Nach dem Drehen kommt ein Kaugummi raus, und es kehrt wieder in 
den unbezahlten Zustand zurück. Mit diesen Informationen kann ein Graph entwickelt werden:
<table>
    <tr>
        <th>Zustand (z)</th>
        <th>Aktion</th>
        <th>resultierender Zustand (z)</th>
    </tr>
    <tr>
        <td style="background: rgba(0, 250, 0, 0.5)">z0: hat kein Geld</td>
        <td>Geld wird reingesteckt</td>
        <td style="background: rgba(0, 0, 250, 0.5)">z1: Hat Geld</td>
    </tr> 
    <tr>
        <td style="background: rgba(0, 0, 250, 0.5)">z1: Hat Geld</td>
        <td>nimmt Geld zurück</td>
        <td style="background: rgba(0, 250, 0, 0.5)">z0: Hat kein Geld</td>
    </tr>
    <tr>
        <td style="background: rgba(0, 0, 250, 0.5)">z1: Hat Geld</td>
        <td>Dreht den Kurbel</td>
        <td style="background: rgba(250, 20, 250, 0.5)">z2: Kaugummi raus</td>
    </tr>
    <tr>
        <td style="background: rgba(250, 20, 250, 0.5)">z2: Kaugummi raus</td>
        <td>Kaugummi > 0</td>
        <td style="background: rgba(0, 250, 0, 0.5)">z0: Hat kein Geld</td>
    </tr>
    <tr>
        <td style="background: rgba(250, 20, 250, 0.5)">z2: Kaugummi raus</td>
        <td>Kaugummi == 0</td>
        <td style="background: rgba(250, 0, 0, 0.5)">z3: Keine Kaugummis mehr</td>
    </tr>
</table>

Die Frage die wir uns stellen ist: "Wie kann sichergestellt werden, dass eine Methode 
nur beim <b>vorausgesehenen Zustand ausgeführt</b> wird?".
<br>
Dafür listen wir alle möglichen Aktionen einmal auf:
<ul>
    <li>GeldRein()</li>
    <li>GeldRaus()</li>
    <li>KurbelDrehen()</li>
    <li>KaugummiCheck()</li>
</ul>
Wir werden 4 Zustände Implementieren, welche diese Funktionen enthalten werden. 
Diese Zustände implementieren vom Interface Zustand.<br>
Wir benötigen einen Kontext, welches u

<h2>State vs. Strategy</h2>
<h3›Strategy‹/h3>
Das Client-Objekt gibt vor, mir welchem Strategy-Objekt gearbeitet werden soll. Die Strategy wird dabei eher selten zur 
Laufzeit verändert.
<h3›State‹/h3>
Es wird ein Satz von Verhaltensweisen, die an Zustande gebunden sind definiert. DIe Zustände variieren im Laufe 
der Zeit. Das Client-Objekt weiß in der Regel wenig oder gar nichts über die Zustandsobjekte.
