# Magyarázat: A Feladat Megoldása

## Probléma Áttekintése
A feladat lényege, hogy kiszámítsuk annak a valószínűségét, hogy egy \( n \)-szer dobott szabályos, 6 oldalú kockával a dobott számok összege pontosan \( k \) lesz. A kimeneti eredményt százalékban kell megadni, lefelé kerekítve.  

A probléma megoldása kihívást jelent, mivel:
1. \( n \) és \( k \) értékei akár \( 10^6 \)-ig is terjedhetnek.
2. A lehetséges kimenetek száma exponenciálisan növekszik \( n \)-nel, ezért közvetlen (brute force) megközelítés nem működik.

---

## Megoldási Stratégia
A feladat hatékony megoldásához dinamikus programozást alkalmazunk, amely csökkenti az ismétlődő számításokat. A megoldás lépései:

### 1. **Értelmetlen Esetek Kizárása**
Már a kezdetekkor kizárjuk azokat az eseteket, ahol a megoldás nyilvánvalóan lehetetlen:
- Ha \( k < n \): Az összeg nem lehet kisebb, mint az \( n \)-szer dobott 1-esek (legalacsonyabb érték).
- Ha \( k > 6 \cdot n \): Az összeg nem lehet nagyobb, mint az \( n \)-szer dobott 6-osok (legnagyobb érték).
Ezekben az esetekben a valószínűség 0%.

### 2. **Dinamikus Programozás**
A dinamikus programozás segít kiszámolni a lehetséges kockadobások számát, amelyekkel elérhetjük az \( k \)-t.  
Az algoritmus lépései:
1. Definiálunk egy `dp` tömböt, ahol:
   - `dp[s]` a lehetséges dobások száma, amelyek összege \( s \).
2. Kezdetben:
   - \( dp[0] = 1 \) (0 dobás esetén az összeg csak 0 lehet).
3. Minden dobásnál frissítjük a `dp` értékeket:
   - Egy új `next_dp` tömböt használunk, és minden \( s \)-hez hozzáadjuk az \( s + \text{dobott szám} \) értéket.

#### Példa Frissítésre
Ha \( dp[s] \)-ben az érték 5, és dobunk egy 2-est, akkor \( next_dp[s + 2] \)-be hozzáadjuk ezt az 5-öt.

#### Összesítve
- Az \( n \)-edik dobás után \( dp[k] \) adja meg, hány különböző módon érhetjük el az \( k \)-t.

### 3. **Valószínűség Kiszámítása**
A valószínűséget a következő képlettel számítjuk:
\[
\text{valószínűség} = \left\lfloor \frac{\text{dp}[k] \cdot 100}{6^n} \right\rfloor
\]
Itt \( 6^n \) az összes lehetséges dobáskombináció száma.

### 4. **Hatékony Megvalósítás**
Mivel \( n \) és \( k \) értékei nagyon nagyok lehetnek, az algoritmus optimalizálása kulcsfontosságú:
- **Memóriahasználat minimalizálása**: Az \( dp \) tömb méretét korlátozhatjuk \( [n, 6n] \) intervallumra.
- **Moduláris aritmetika**: Nagy számításokat \( 10^9 + 7 \)-tel modulózva végezhetünk a túlcsordulás elkerülése érdekében.
