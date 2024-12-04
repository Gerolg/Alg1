# [Feladat: Jack Telekinetikus Képességei](https://www.spoj.com/problems/AE2A/)

Jack azt állítja, hogy telekinetikus képességei vannak. Fogadást kötött Mike-kal, hogy ha dob egy \( n \)-szeres kockával, az eredmény pontosan \( k \) lesz. A kockájának 6 oldala van, amelyeken az 1-től 6-ig terjedő számok szerepelnek, és tökéletesen szimmetrikus.

Mike, mint racionális ember, nem hisz Jack telekinetikus képességeiben. Azonban aggódik, hogy Jack egyszerűen a szerencsével is megnyerheti a fogadást. Ezért szeretné tudni, mekkora az esély (százalékban), hogy egy ilyen szerencsés esemény bekövetkezik. Készíts egy programot, amely segít Mike-nak kiszámolni ezt a valószínűséget.

---

## Bemenet
- Az első sorban egyetlen egész szám található: \( t \) (1 ≤ \( t \) ≤ 20), a tesztesetek száma.
- A következő \( t \) sor mindegyike két egész számot tartalmaz: \( n_i \) és \( k_i \) (1 ≤ \( n_i, k_i \) ≤ \( 10^6 \)), amely egy teszteset leírását adja meg.

---

## Kimenet
- Írj ki \( t \) sort.
- Minden sorban egyetlen szám szerepeljen: az adott tesztesetben a valószínűség (százalékban), hogy Jack nyer. Az eredményt lefelé kerekítve kell megadni.

---

## Példa

### Bemenet
2 3 10 2 13
### Kimenet
11 0

---

1. Ha a \( k \)-t nem lehet elérni \( n \)-szeres dobással (például ha \( k < n \) vagy \( k > 6n \)), akkor a valószínűség 0%.
2. A programot úgy kell megírni, hogy hatékonyan kezelje a nagy \( n \) és \( k \) értékeket, akár \( 10^6 \)-ig is.
