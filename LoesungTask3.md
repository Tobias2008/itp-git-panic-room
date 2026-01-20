# Panic Room – Finale Zusammenfassung

##  Team

- **Teamname:** Einsamer Wolf
- **Mitglieder:**
  - Tobias Payreder


---

## Überblick – Unsere Learnings (Zusammengefasst durch ChatGPT)

- Sauberes Debugging spart langfristig Zeit
- Aussagekräftige Commit-Messages sind essenziell für Teamarbeit
- Git ermöglicht das gezielte Wiederherstellen einzelner Dateien
- Tests helfen, Fehler früh zu erkennen und Regressionen zu vermeiden

---

## Dokumentation der Problemlösungen

### Aufgabe 1 – Division durch 0

- Division durch 0 entfernt
- Division durch 0 abgeprüft
- Test zur Überprüfung der Division hinzugefügt
- Test zur Überprüfung der Division durch 0 ergänzt

---

### Aufgabe 2 – Commit-Messages verbessern

| Schlechte Commit-Message | Verbesserte Version |
|------------------------|---------------------|
| `stuff` | `Debug info added` |
| `update` | `Updated calculator syntax` |
| `update more` | `Important files added` |

---

### Aufgabe 3 – Datei entfernen

- `debug.log` hatte keinen Nutzen
- Die Datei wurde entfernt

---

### Aufgabe 4 – Datei wiederherstellen

- Es stellte sich heraus, dass `debug.log` doch wichtig war
- Vorgehensweise:

```
git log
git checkout f58dc085f86d5cf87fd448f94b294a1665db9fc9 -- debug.log
git add debug.log
git commit -m "Restore debug.log"
```