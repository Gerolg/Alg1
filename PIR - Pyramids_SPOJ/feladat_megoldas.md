# Megoldási stratégia

A tetraéder térfogatának meghatározása a Cayley-Menger-determináns segítségével történik. Az élek alapján először kiszámítjuk a Cayley-Menger mátrixot, majd annak determinánsából a térfogatot.

### Cayley-Menger mátrix
Az élek alapján a mátrix a következő formátumú:\
\[
\text{CM} = \
\begin{bmatrix}\
0 & 1 & 1 & 1 & 1 \
1 & 0 & AB^2 & AC^2 & AD^2 \
1 & AB^2 & 0 & BC^2 & BD^2 \
1 & AC^2 & BC^2 & 0 & CD^2 \
1 & AD^2 & BD^2 & CD^2 & 0 \
\end{bmatrix}
\]

### Térfogat képlete
A térfogat a következő képletből számítható:
\[
\text{Volume} = \sqrt{\frac{-\text{det(CM)}}{288}}
\]

### Lépések:
1. Kiszámítjuk a Cayley-Menger mátrixot.
2. Meghatározzuk a mátrix determinánsát.
3. A térfogatot kiszámítjuk a fenti képlet alapján.

---
