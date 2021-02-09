# Temat: 
​    System zarządzania treścią dla serwisu informacyjnego oparty na mikroserwisach
​    Micro-services based content management system for news website

## Frontend:
​	Aplikacja webowa oparna na architekturze SPA - Simple Web Application
​    PWA - progressive web application (jeżeli uda się czasowo)

- Technologie:
  - TypeScript
  - Angular            	

## Backend:

- Aplikacja udostępniająca interfejs typu REST.
- Wykorzystanie archtektury mikroserwisów w celu zapewnienia skalowalności
- Wykorzystanie konteneryzacji
- Technologie:
  - Spring Framework ( Spring MVC lub Spring Reactor)
  - Spring Data (warstwa dostępu do danych)
  - Spring Security (uwierzytelnienie i autoryzacja)
  - Spring Cloud (zarządzanie mikroserwisami)
  - *Docker (Konteneryzacja) 



# Ogólne założenia:
## Cel pracy

- Opracowanie i przedstawienie przykładowej architektury systemu spełniającego poniższe warunki
  - Wysoka skalowalność
  - Odporność na błędy
  - Architektura rozproszona oparta na mikroserwisach
  - Integracja z usługami chmury obliczeniowej
- Wykonanie przykładowego systemu na podstawie uprzednio ustalonego scenariusza 
- Zbadanie i analiza problemów występujących w trakcie tworzenia takiego systemu
- Wykonanie testów wydajnościowych związanych ze skalowaniem aplikacji w zależności od zapotrzebowania oraz niezawodności związanej z wystąpieniem awarii w poszczególnych modułach aplikacji 

## Uzasadnienie wyboru tematu

- Tendencja na rynku do:
  - odchodzenia od architektur monolitycznych
  - optymalizacja kosztów poprzez rezygnacji z utrzymania infrastruktury "on premises" na rzecz chmury obliczeniowej
  - wysoka konkurencja na rynku usług internetowych wymusza tworzenie usług w skali masowej (wymagana skalowalność)
- Niewielka ilość materiałów edukacyjnych dotyczących integracji całego stosu usług umożliwiających zarządzanie instancjami systemu mikro-serwisów

## Scenariusz 

- Utworzenie prostego systemu zarządzania treścią dla ogólno-tematycznej strony informacyjnej.
- Treści tworzone w edytorze WYSIWYG opartym na markdown.
- Zapewnienie wysokiej skalowalności systemu w sposób zautomatyzowany 
- Zapewnienie odporności systemu na błędy poszczególnych usług
- Zapewnienie optymalizacji kosztów poprzez dynamiczną alokację zasobów w chmurze obliczeniowej
- Zaczerpnięcie przykładowych artykułów za pomocą API Guardiana
      


# Uzasadnienie wyboru technologii

- Spring Cloud
  - "projekt parasolowy"
  - pełny stos technologiczny do obsług mikro-serwisów
  - warstwa abstrakcji nad poszczególnymi technologiami
- Spring Boot dla mikro-serwisów:
  - zintegorwany serwer webowy - Tomcat 
  - konwencja zamiast konfiguracji
  - redukcja tzw. "boilerplate code"
  - natywne wsparcie dla interfejsu typu REST 
- Spring Data jako warstwa dostępu do danych
  - abstrakcja ponad technologią przechowywania danych
  - automatyzacja zarządzania transakcjami
- Spring Security do autoryzacji i uwierzytelnienia
  - integracja ze Spring Boot
  - integracja z wieloma dostawcami tożsamości
- Docker do konteneryzacji instancji aplikacji
  - poziom abstrakcji ponad systemem operacyjnym
  - zachowanie wysokiej wydajności poprzez uniknięcie wirtualizacji
- Spring Cloud Gateway
  - "Brama" dla API
  - routowanie, filtrowanie, równoważenie ruchu od kilentów
  - obsługa autoryzacji/uwierzytelnienia (?)
  - non-blocking, event queue
  - 
- Netflix Eureka do odnajdywania usług
  - Integracja z projektem Spring Cloud
  - Odnajdywanie usług od strony serwera
- Netflix Hystrix do funkcji "bezpiecznika"
  - Integracja z projektem Spring Cloud
  - Odpowiednie zarządzanie ruchem w przypadku nieresponsywnej usługi
- Spring Cloud Sleuth do zarządzania logami oraz śledzenia operacji w systemie rozproszonym
- Netflix Hystrix Dashboard oraz Spring Actuator do monitoringu usług
- Spring Cloud Config Server dla konfiguracji usług
  - Scentralizowana konfiguracja
  - Zmiana konfiguracji bez potrzeby restartu
- Amazon Web Services jako dostawca chmury obliczeniwej
  - dojrzała chmura obliczeniowa
  - szeroka gama dostępnych usług
  - elastyczne zarządzanie kosztami
- Amazon DocumentDB jako baza danych
  - zarządzana usługa bazy danych typu NoSQL
  - kompatybilna z popularnym MongoDB
  - wsparcie dla replikacji w celu uzyskania wysokiej dostępnosci
- AWS Fargate jako serwer kontenerów
  - abstrakcja ponad sprzętem
  - wsparcie dla obrazów Docker'a
  - automatyczne skalowanie w zależności od obciążenia maszyn
- Amazon Cognito dla zarządzania tożsamością użytkowników
- Amazon Virtual Private Cloud do izolacji publicznej oraz prywatnej części systemu
- Angular Framework do utworzenia interfejsu użytkownika
  - wsparcie TypeScript

## Podsumowanie

- Zasadnicza trudność - integracja wielu technologii 
- Główny cel - dokumentacja oraz ukazanie problemów związanych z taką architekturą aplikacji



# Tematy do rozważenia w pracy

- Service discovery (client-side service discovery vs server-side)
- Circuit Breaker
- Microservices monitoring
- Osporność na błędy:
  - Wiele instancji poszczególnych serwisów
  - Circuit breaker
  - Bulkhead Pattern ?
- Zabezpieczenie systemu:
  - API Gateway
  - alternatywy: 
    - Distributed Session Management (nie bezstanowy)
    - https://www.youtube.com/watch?v=RRMO4oNptoQ



# Plan pracy

- Etap 1
  - Article Meta-Data Service 
  - Article Content Service 
  - Authors Info Service
- Etap 2
  - Service Discovery (Eureka)
  - Client Side Load Balancer (Ribbon)
- Etap 3
  - API Gateway (Spring Cloud Gateway)
- Pozostałe:
  - Static Frontend Service



# Różne

https://github.com/nhn/tui.editor
https://github.com/vsch/flexmark-java
https://github.com/atlassian/commonmark-java
