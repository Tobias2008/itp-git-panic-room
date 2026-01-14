# 🕵️ Git Detective – Ermittlungsprotokoll

Ziel dieser Station ist es, das Repository zu **verstehen**, nicht es zu reparieren.

- Es wird **(noch) nichts geändert**
- Es wird **(noch) nichts repariert**
- Es wird **(noch) nichts committed**

Reparaturen folgen erst im **Panic Room** 🚨

Ausgearbeitet von: Tobias Payreder




## #1 -  Überblick über die Git-History
Welche 2 Commits fallen euch in der History bereits zu Beginn negativ auf? Und warum? 

- stuff, schlechte commit message, man kennt sich nicht aus
- update more, man kennt sich nicht aus


## #2 - Ab welchem Commit ist das Projekt nicht mehr stabil?
Woran erkennt ihr, dass es ab hier ein Problem gibt?
Mit welche(n) Befehl(en) könnt ihr das herausfinden?
(Antwort: Commit-ID, Message, Begründung)
- Befehl ´git log --oneline´
- 50da5b1, Update, 'tag: v2-tests-broken'

## #3 - Welche Datei wurde dabei verändert?
Welche Datei(en) wurden im verdächtigen Commit verändert?
Mit welche(n) Befehlen könnt ihr das herausfinden?
(Antwort: Commit-ID, geänderte Datei(en), Kurzbeschreibung der Änderung)

- mit ´git diff -ce65066- -50da5b1-´ überprüfen - Fehler wurde entdeckt - division durch 0 hinzugefügt, die datei 'Calculator.java' wurde geändert

## #4 - Wer hat die entscheidende Stelle verändert?
Welche Datei ist besonders relevant und warum?
Mit welche(n) Befehlen kannst du dies rausfinden? 
(Antwort: Datei, Commit-ID der relevanten Änderung, Commit Message, betroffene Code-Stelle, warum ist diese Stelle wichtig?)

- ´git show 50da5b1´
- nur die datei Calculator.java wurde verändert
- Änderung: 
````
     public static int divide(int a, int b) {
-        return a / b;
-    }
+    // BUG: falscher Divisor -> Division durch 0
+    return a / 0;
+}
+
````
- commit message: Update
- weil hier div durch 0 hinzugefügt wurde

## #5: Vergleich vor und nach der Änderung
Was ist der Unterschied im Code, bevor und nachdem das Problem entstanden ist? Mit welchem Befehl kannst du das rausfinden? 

- mit ´git diff -ce65066- -50da5b1-´

````
     public static int divide(int a, int b) {
-        return a / b;
-    }
+    // BUG: falscher Divisor -> Division durch 0
+    return a / 0;
+}
+
````