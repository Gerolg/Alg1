### Megoldás Magyarázata

A probléma lényege, hogy megkeressük a maximális nem-metsző hidak számát. Ez a **leghosszabb növekvő részsorozat (LIS)** problémájára vezethető vissza.

1. **Elemzés**  
   A hidakat csak azonos sorrendű végpontok között lehet megépíteni. Ahhoz, hogy ne metsződjenek, a második oldal koordinátáit növekvő sorrendben kell kiválasztanunk.

2. **Megoldás**  
   Az LIS-t bináris kereséssel számítjuk ki:
   - Végigmegyünk a második oldal koordinátáin.
   - Egy segédtömbben (`dp`) tartjuk fenn a növekvő sorrendet.
   - A megfelelő pozíciót az `Arrays.binarySearch` segítségével találjuk meg.

3. **Komplexitás**  
   Minden teszteset: **O(n log n)**. Az összes teszteset: **O(t × n log n)**.

4. **Kimenet**  
   Az LIS hossza a maximálisan megépíthető hidak száma, amit minden tesztesethez kiírunk.
