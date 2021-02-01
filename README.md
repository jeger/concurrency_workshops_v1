# Instrukcje

## Ćwiczenie 1

### Krok 1

Uruchom serwer:
```mvn clean install```
a następnie ```java -jar target/warsztaty-v1-1.0-SNAPSHOT.jar```

W terminalu uruchom kilka razy z rzędu 
curl http://localhost:8080/counter

Zgodnie z intuicją, serwer odsyła nam kolejny numerek, za każdym razem większy o jeden.

### Krok 2

Zainstaluj narzędzie ab  (apache benchmark)
```sudo apt-get update -y```
```sudo apt-get install -y apache2-utils.```

Narzędzie ab służy do testów obciążeniowych końcówek http.
Przykładowy test dla 1000 zapytań i 20 zapytań realizowanych jednocześnie:

ab -n 1000 -c 20 -l

więcej: ```man ab```

Sprawdź ponownie z użyciem ```curl``` czy licznik faktycznie powiększył się o 1000.




