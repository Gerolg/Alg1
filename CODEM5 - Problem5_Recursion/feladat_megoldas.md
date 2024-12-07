# Megoldási folyamat
## Probléma megoldási stratégiája
A **backtracking** módszerrel:
1. Egy rekurzív függvényt használunk, amely próbálja hozzáadni az aktuális objektumot a kombinációhoz vagy kihagyja azt.
2. Ha elérjük a \( k \)-t, frissítjük a minimális objektumszámot.
3. Ha az aktuális súly meghaladja \( k \)-t, visszalépünk.
4. Ha nincs több vizsgálandó objektum, befejezzük az aktuális ágat.

---
