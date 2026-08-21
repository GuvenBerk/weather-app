# Weather App - Open-Meteo API Integration

 **Live URL:** [weather-app-1-yka5.onrender.com](https://weather-app-1-yka5.onrender.com)

### Project Overview
A lightweight Spring Boot web application that consumes the third-party Open-Meteo API to deliver real-time weather data based on dynamic geographical selections.

### Technical Architecture & Design Decisions

* **Backend Strategy:** Built with Java and Spring Boot to create a robust, standalone RESTful service. The application acts as a middle-tier proxy; it fetches, parses, and formats external data before serving it to the client, preventing direct client-to-third-party coupling.
* **API Selection:** The Open-Meteo API was intentionally chosen because it operates without API keys. This eliminates secret management overhead (no `.env` leaks) for a public portfolio project while still demonstrating the ability to consume and process external REST APIs.
* **Containerization:** The application is fully containerized using **Docker**. This ensures absolute environment consistency between local development and the production deployment on Render.
* **Frontend Approach:** Kept intentionally minimal using Vanilla HTML/JS. The cascading dropdown logic handles state purely on the client side, ensuring the backend remains completely stateless and focused only on data delivery.

### Tech Stack

* **Backend:** Java, Spring Boot
* **Infrastructure:** Docker, Render
* **External API:** Open-Meteo REST API
* **Frontend:** HTML, CSS, Vanilla JavaScript

---

# Aplikacja Pogodowa - Integracja z API Open-Meteo

 **Adres URL:** [weather-app-1-yka5.onrender.com](https://weather-app-1-yka5.onrender.com)

### Opis Projektu
Lekka aplikacja internetowa oparta na Spring Boot, która integruje się z zewnętrznym API Open-Meteo, aby dostarczać dane pogodowe w czasie rzeczywistym na podstawie dynamicznego wyboru lokalizacji.

### Architektura i Decyzje Projektowe

* **Strategia Backendowa:** Aplikacja została zbudowana w Javie przy użyciu Spring Boot jako samodzielna usługa RESTful. Warstwa backendu działa tu jako proxy – pobiera, przetwarza i formatuje dane z zewnątrz przed wysłaniem ich do klienta, co zapobiega bezpośredniemu sprzężeniu klienta z zewnętrznym API.
* **Wybór API:** API Open-Meteo zostało wybrane celowo, ponieważ nie wymaga kluczy autoryzacyjnych. Eliminuje to problem zarządzania sekretami (brak ryzyka wycieku kluczy API) w publicznym repozytorium, jednocześnie udowadniając umiejętność integracji z zewnętrznymi usługami REST.
* **Konteneryzacja:** Aplikacja jest w pełni skonteneryzowana za pomocą **Dockera**, co gwarantuje spójność środowiska między programowaniem lokalnym a wdrożeniem produkcyjnym na platformie Render.
* **Podejście do Frontendu:** Zastosowano celowo minimalistyczne podejście (Vanilla HTML/JS). Logika kaskadowych list rozwijanych zarządza stanem wyłącznie po stronie klienta, dzięki czemu backend pozostaje w 100% bezstanowy (stateless) i skupia się tylko na dostarczaniu danych.

### Technologie

* **Backend:** Java, Spring Boot
* **Infrastruktura:** Docker, Render
* **Zewnętrzne API:** Open-Meteo REST API
* **Frontend:** HTML, CSS, Vanilla JavaScript
