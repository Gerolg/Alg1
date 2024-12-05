### [BRIDGE - Building Bridges](https://www.spoj.com/problems/BRIDGE/)

A törzs hamarosan rájön, hogy a puszta kommunikáció nem elég, és találkozni szeretnének, hogy egyesített erőt alkossanak a terminátor ellen. Azonban egy mély szakadék áll az útjukban, amelyet át kell hidalni. Mindkét oldalon azonosítottak pontokat, ahol a híd végeit meg lehet építeni. De mielőtt az építkezés megkezdődhetne, egy Chudael nevű boszorkány azt jósolta, hogy a hidat csak a megfelelő végpontok között lehet megépíteni. Ez azt jelenti, hogy az egyik oldalon az i-edik végpontról induló hídnak a másik oldalon is az i-edik végponton kell végződnie, a végpontok azonosításának sorrendjében. Ha nem így történik, az a törzs végét jelenti. A törzs a lehető legtöbb nem-metsző hidat szeretné megépíteni, az említett korlátozások figyelembevételével. Két híd akkor "metsződik", ha pontosan egy közös pontjuk van, amely nem egy végpont.

#### Bemenet

Az első sor tartalmazza a tesztesetek számát, `t` (1 ≤ t ≤ 50). Ezt követi minden tesztesethez 3 sor adat.  
- Az első sor tartalmazza az azonosított végpontok számát mindkét oldalon, `n` (1 ≤ n ≤ 103).  
- A második sor tartalmazza az első oldalon azonosított végpontok `x` koordinátáit,  
- A harmadik sor tartalmazza a második oldalon az azonosító sorrendnek megfelelő végpontok `x` koordinátáit.  

A végpontok koordinátái az azonosítás sorrendjében vannak megadva. Az `x` koordináták értéke -103 és 103 között lehet.

#### Kimenet

Minden tesztesethez egyetlen sort kell kiírni. A sor egyetlen egész számot tartalmaz – a maximálisan megépíthető hidak számát az adott korlátozások figyelembevételével.
