<h1>Proxy-Muster</h1>
<h2>Vorliegendes Problem</h2>
Wir greifen auf ein Bild im Internet zu, welches Zeit benötigt geladen zu werden. 
Dieses Bild wird nach dem Laden angezeigt. Der Benutzer sieht in der Zeit nichts. 

<h2>Proxy-Objekt</h2>
Damit der Benutzer noch eine Rückgabe hat, erstellen wir ein Ladebildschirm für diese Zeit. 
Dies kann mithilfe von einem Proxy-Objekt umgesetzt werden. 
Ein Proxy_objekt dient als Stellvertreter, für das richtige Objekt und kann auch später durch das richtige 
Objekt ersetzt werden. 

<h2>Proxy-Muster</h2>
Es existiert ein Interface "Objekt" und zwei Klassen ("EchtesObjekt" und "ProxyObjekt"), welches 
das Interface "Objekt" implementiert. 
<table>
    <tr style="margin: 0px; padding: 0px; border: 0px solid black;">
        <td style="border: 0px solid black;"> 
            <table>
                <tr>
                    <th><< interface >><br>Objekt</th>
                </tr>
                <tr>
                    <td>
                        + request()
                    </td>
                </tr>
            </table>
        </td>
        <td style="border: 0px solid black;">
            <table>
                <tr>
                    <th>ProxyObjekt</th>
                </tr>
                <tr>
                   <td>
                        <ul style="list-style: None;">
                            <li>- retrieving: boolean</li>
                            <li>- realObject: EchtesObjekt</li>
                        </ul>
                    </td> 
                </tr>
                <tr>
                    <td>
                        <ul style="list-style: none;">
                            <li>+ request(): void</li>
                        </ul>
                    </td>
                </tr>
            </table>
        </td>
        <td style="border: 0px solid black;">
            <table>
                <tr>
                    <th>EchtesObjekt</th>
                </tr>
                <tr>
                    <td>
                        <ul style="list-style: none;">
                            <li>+ request(): void</li>
                        </ul>
                    </td>
                </tr>
            </table>
        </td>
    </tr>
</table>

Das ProxyObjekt und das EchteObjekt implementieren beide vom interface "Objekt".
Sobald das EchteObjekt fertig geladen hat, wird das ProxyObjekt mit dem echten Objekt ausgetauscht. 
Aus diesem Grund hat unser Proxy Element ein attribut "realObject". Dieses verbleibt bis der Prozess beendet ist, Null. 
<br>
In der request() Funktion gibt es oft einen ähnlichen aufbau:<br>
````java
public void request(){

    if(this.realObjekt!=null){
        return this.realObjekt.request()       // Dies bedeutet,
    // dass unser Proxy mit dem realen ersetzt wird, wenn es existiert
    }else{
        // wenn das RealeObjekt noch nicht existiert, dann wird etwas anderes gemacht
        System.out.println("Das reale Objekt wird geladen...");

        // wenn wir es "retrieved" haben, dann ändert sich somit auch der boolean
        // damit kann unser Proxy abgelöst werden und ein RealObjekt kann erstellt werden
        if(!this.retrieving){
            this.realObject=new EchtesObjekt();
        }else{
            // falls nicht, dann wird es retrieved
            this.request();
        }
    // Diese funktion wird solange ausgeführt, bis das reale Objekt da ist
    return this.request();
    }
}
````


<h2>E-Mail Beispiel</h2>
Gegeben ist eine E-Mail, die mit Base64 verschlüsselt ist. Um diese E-Mail zu entschlüsseln, 
benötigen wir die Library <code>import java.util. Base64;</code> und folgende Zeilen: <br>
<code>
byte[] decodedBytes = Base64.getDecoder().decode(encodedString);<br>
String decodedString = new String(decodedBytes);
</code><br>
<br>
Unser Proxy soll in diesem Fall eine verschlüsselte E-Mail entschlüsseln und weitergeben zur Klasse "EmailImpl", welches 
dann mit der funktion "isEncrypted()" nachprüft, ob die nachricht verschlüsselt ist. Ein Inferface E-Mail hat zwei funktionen: 



<table>
    <tr style="border: 0px solid black;">
        <td style="border: 0px solid black;">
            <table>
                <tr>
                    <th><< interface >><br>IEmail</th>
                </tr>
                <tr>
                    <td>
                        <ul style="padding-left: 0px;list-style: none;">
                            <li>+ getSubject(): String</li>
                            <li>+ getContent(): String</li>
                        </ul>
                    </td>
                </tr>
            </table>
        </td>
        <td style="border: 0px solid black;">
            <table>
                <tr>
                    <th>EmailImpl</th>
                </tr>    
                <tr>
                    <td>
                        <ul style="padding-left: 0px; list-style: none;">
                            <li>- subject: String</li>
                            <li>- content: String</li>
                        </ul>
                    </td>
                </tr>
                <tr>
                    <td>+ isEncrypted(): boolean</td>
                </tr>
            </table>
        </td>
        <td style="border: 0px solid black;">
            <table>
                <tr>
                    <th>ProxyEmail</th>
                </tr>    
                <tr>
                    <td>
                        <ul style="padding-left: 0px; list-style: none;">
                            <li>- subject: String</li>
                            <li>- encodedString: String</li>
                            <li>- encodedEmail: EmailImpl</li>
                        </ul>
                    </td>
                </tr>
                <tr>
                    <td>
                        <ul style="padding-left: 0px; list-style: none;">
                            <li>+ ProxyEmail(encodedString: String)</li> 
                            <li>+ isEncrypted(): boolean</li>
                            <li>+ decode(): String</li>
                        </ul>
                    </td>
                </tr>
            </table>
        </td>
    </tr>
</table>




