# Megoldási folyamat

## 1. Probléma elemzése
A cél, hogy hatékonyan meghatározzuk azokat a párokat, amelyek közötti különbség pontosan \( K \). A párok sorrendje nem számít, tehát \( (a, b) \) ugyanaz, mint \( (b, a) \). 

## 2. Egyszerű megközelítés
Egy kétszintű ciklussal minden lehetséges párt összehasonlíthatnánk:
- Iterálunk az összes \( a \)-n és \( b \)-n.
- Ellenőrizzük, hogy \( |a - b| = K \)-e.
- Ez \( O(N^2) \) időbonyolultságú, ami túl lassú, ha \( N \) akár \( 10^5 \) is lehet.

## 3. Hatékony megoldás: Hashing használata
A probléma hatékony megoldásához használhatunk egy halmazt (\( \text{Set} \)), amely lehetővé teszi a gyors keresést:
1. Iterálunk a tömb elemein.
2. Ellenőrizzük, hogy a szám \( num - K \) vagy \( num + K \) már szerepel-e a halmazban.
3. Ha igen, növeljük a számlálót.
4. Adjuk hozzá az aktuális számot a halmazhoz, hogy a következő iterációban már ez is vizsgálható legyen.

Ezzel a módszerrel a megoldás időbonyolultsága \( O(N) \), ami gyors és hatékony.

---
