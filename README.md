| **Muuttuja**                 | **Sallitut arvot**         | **Kielletyt arvot**                         | **Sallitut raja-arvot** | **Kielletyt raja-arvot**                    |
| ---------------------------- | -------------------------- | ------------------------------------------- | ----------------------- | ------------------------------------------- |
| **Asiakkaan nimi**           | 3-50 merkkiä               | numeeriset arvot                            | 3 merkkiä, 50 merkkiä   | 2 merkkiä, 51 merkkiä                       |
| **Kortti: numero**           | Numerot 0-9                | kirjaimet, symbolit, tyhjät merkit          | 0-9                     | < 0                                         |
| **Voimassa olo: Päivämäärä** | 01 – 12, 24 - 29           | <=00, >=13, <23, >29                        | 01 – 12, 24 - 29        | 00 kk, 13 kk, 23 vv, 30 vv                  |
| **Veloitettava summa**       | 0 – saatavilla oleva saldo | Negatiiviset arvot, Katteen ylittävät arvot | > 0                     | Saldon ylittävät summat, Negatiiviset luvut |

### Rajapintakuvaus

#### Esimerkki

Metodia käytetään tähän tyyliin

```java
int aika = 3665;
String tulos = TimeUtils.secToTime(aika);
System.out.println("Aika: " + tulos);
```

- Hyvä rajapintakuvaus sisältää yleensä seuraavat osat:
  - Metodin nimi ja parametrit: Selkeä kuvaus metodin nimestä ja sen vaatimista parametreista.
  - Palautusarvo: Minkä tyyppistä dataa metodi palauttaa.
  - Metodin kuvaus: Lyhyt kuvaus siitä, mitä metodi tekee.
  - Poikkeukset (Exceptions): Mitä poikkeuksia metodi voi heittää ja missä tilanteissa.
  - Esimerkkikutsut: Esimerkkejä siitä, miten metodia käytetään käytännössä.
  - Sivuvaikutukset: Mahdolliset sivuvaikutukset, joita metodin suorittaminen saattaa aiheuttaa.
  - Riippuvuudet: Tiedot mahdollisista muista metodeista tai järjestelmän osista, joista metodi on riippuvainen.
  - Suorituskyky ja rajoitukset: Mahdolliset suorituskyvyn näkökohdat tai rajoitukset.

Tehtävänannossa annettu kuvaus ei ole riittävä eikä kattava, koska se tarjoaa esimerkin vain metodin käytöstä.

[Kattavuusanalyysi](https://users.metropolia.fi/~joonajou/testreport)
