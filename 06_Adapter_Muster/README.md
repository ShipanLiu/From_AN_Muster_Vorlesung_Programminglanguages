<h1>Adapter-Muster</h1>
<h2>Steckdose</h2>
Wenn man als Europäer Urlaub in Amerika oder Asien macht, 
nimmt man oft einen Adapter mit, da unsere Ladegeräte einen anderen Stecker haben, 
als die Steckdosen im Ausland. Im Prinzip wandelt ein Adapter die gegebene Information, 
in eine für uns geeignete Ausgabe um.

<h2>Rechteck und Rectangle</h2>
Es gibt zwei Arten ein Rechteck darzustellen. Eine art wäre den Startpunkt (x, y) 
anzugeben und die Höhe und Breite. Dies wird unsere Rechteck Klasse.
Die Rectangle Klasse wird mit der oberen linkeren Ecke abgebildet (x1, y1) und der unteren rechten Ecke
(x2, y2). <br>
wir erstellen jetzt ein Adapter, womit wir ein Rechteck auf ein Rectangle 
abbilden können. Dazu wird die breite auf den x-Wert aufgerechnet und die 
Höhe aud den y-Wert. 
<br>
Da unser Adapter ein Rechteck in ein Rectangle übersetzt, erbt unser Adapter 
auch von der Rectangle Klasse. So können die ausgerechneten Werte sofort zugewiesen werden.
