# Magyarázat: Tesztkörnyezet létrehozása és működése

## Áttekintés
Ez a szkript egy automatizált tesztkörnyezet, amely ellenőrzi, hogy a Java program helyesen működik-e különböző bemeneti tesztesetekkel. A környezet a következő lépéseket hajtja végre:

1. **Tesztadatok Generálása**: Létrehoz egy tesztadat fájlt, amely tartalmazza a bemeneteket.
2. **Referencia Megoldás Számítása**: Egy lassú, de megbízható megoldással kiszámítja az elvárt kimeneteket.
3. **Program Futtatása**: A Java programot a generált bemenettel futtatja.
4. **Eredmények Összehasonlítása**: Ellenőrzi, hogy a Java program eredménye megegyezik-e a referenciaeredményekkel.

---

## Részletes Magyarázat

### 1. **Tesztadatok Generálása**
A `generate_test_cases` függvény egy `test_input.txt` nevű fájlt hoz létre, amelyben a tesztesetek találhatók. 
- **Formátum**: Az első sorban a tesztesetek száma (\( t \)), majd minden további sorban egy teszteset (\( n \) és \( k \)).
- **Példa**:
  ```txt
  10
  3 10
  2 13
  5 20
  100 300
  1000 5000
  10 60
  100 600
  200 1200
  50 300
  1 6
