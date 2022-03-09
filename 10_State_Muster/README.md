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
Wir <b>benötigen einen Kontext</b>, welches unser Kaugummiautomat ist. <b>Nur unser Kontext</b> weißt in welchem 
Zustand es sich befindet. Eine Kontextklasse sollte immer folgende funktionen haben: 
<table>
    <tr>
        <th>Kontext</th>
    </tr>
    <tr>
        <td>
            <ul style="list-style-type: none;">
                <li>- currState: State</li>
                <li>- z0: State</li>
                <li>- z1: State</li>
                <li>- z2: State</li>
                <li>- z...: State</li>
            </ul>
        </td>
    </tr>
    <tr>
        <td>
            <ul style="list-style-type: none;">
                <li >+ z0_action(): void</li>
                <li>+ z1_action(): void</li>
                <li>+ all_state_actions...: void</li>
                <li>+ <b>getState()</b>: State</li>
                <li>+ <b>setState(state: State)</b>: void</li>
                <li>+ <b>get_z1_State()</b>: State</li>
                <li>+ get_z2_State(): State</li>
                <li>+ get_z..._State(): State</li>
            </ul>
        </td>
    </tr>
</table>
Wir können mit diesen Funktionen in den StateKlassen unser <b>Kontext übergeben</b> und in den möglichen 
Übergängen, unserem Kontext einen anderen State zuweisen: <br>
<code>
    Kontext.setState(Kontext.get_z2_State());
</code>wird in z1 ausgeführt, wenn das eine mögliche aktion für z1 ist und auf den State z2 
hinführt. 
Unsere State Klassen sehen ungefähr so aus:
<table>
    <tr>
        <th>Z1 (State)</th>
    </tr>
    <tr>
        <td>
            <ul style="list-style:none;">
                <li>- kontext: Kontext</li>
            </ul>
        </td>
    </tr>
    <tr>
        <td>
            <ul style="list-style:none;">
                <li>+ Z1(): void</li>
                <li>+ z0_action():void</li>
                <li>+ <b>z1_action()</b>: void</li>
                <li>+ z..._action(): void</li>
            </ul>
        </td>
    </tr>
</table>

<h2> Implementierung </h2>
Wir werden die Kaugummi maschine im obigen Beispiel implementieren. 
Dazu erstellen wir ein Kontext und die verschiedenen States. <br>
<b>Tipp</b>: wenn eine Klasse von einem Interface implementiert, kann man <code>STRG + i</code>
Drücken, um alle vorliegenden Funktionen zu auto-fillen.
<br>
Jedes State soll ein Konstruktor besitzen, welches unser Kontext (Maschine) übernimmt.
 Gleichzeitig wird im Konstruktor unserer Maschine der kontext übergeben (mit context ist <code>this</code> gemeint).<br>
<code>this.z0 = new z0(this);</code>
<br>
Unsere Einzelnen States leiten unsere Maschine weiter. In den StateAktion Funktionen soll 
vom Momentanen State die Aktion durchgeführt werden.<br>
<code>public void GeldRein(){this.currState.GeldRein();}</code>
<br>
Im main kann die Maschine, alle states aufrufen. 

<h2>State vs. Strategy</h2>
<h3>Strategy</h3>
Das Client-Objekt gibt vor, mir welchem Strategy-Objekt gearbeitet werden soll. Die Strategy wird dabei eher selten zur 
Laufzeit verändert.
<h3>State</h3>
Es wird ein Satz von Verhaltensweisen, die an Zustande gebunden sind definiert. DIe Zustände variieren im Laufe 
der Zeit. Das Client-Objekt weiß in der Regel wenig oder gar nichts über die Zustandsobjekte.
