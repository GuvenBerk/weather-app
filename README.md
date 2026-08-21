# Weather App - Open-Meteo API Integration

**Live URL:** [weather-app-1-yka5.onrender.com](https://weather-app-1-yka5.onrender.com)

## Project Overview
A Spring Boot application that fetches real-time weather data from the Open-Meteo API. I built this project to demonstrate external API integration, backend proxy architecture, and containerized deployment.

## Architecture & Dev Notes

* **Backend as a Proxy:** The Spring Boot backend serves as a middleman. Instead of the frontend making requests directly to the weather API, the backend fetches, parses, and formats the data. This keeps the client fully decoupled from the third-party service.
* **Why Open-Meteo?:** I specifically chose this API because it doesn't require authentication keys. This makes the project easy to clone and run locally without setting up `.env` files or managing secrets, while still proving I can handle REST integrations.
* **Docker & Deployment:** The entire application is containerized with Docker. This ensures it runs exactly the same way in my local environment as it does in production on Render.
* **Frontend Logic:** I kept the frontend intentionally simple using Vanilla HTML, CSS, and JS. The cascading dropdowns (country/city selection) manage their own state on the client side, allowing the backend to remain completely stateless.

## Tech Stack

* **Backend:** Java, Spring Boot
* **Infrastructure:** Docker, Render
* **External API:** Open-Meteo REST API
* **Frontend:** HTML, CSS, Vanilla JavaScript

---

# Aplikacja Pogodowa - Integracja z API Open-Meteo

**Adres URL:** [weather-app-1-yka5.onrender.com](https://weather-app-1-yka5.onrender.com)

## Opis Projektu
Aplikacja pogodowa w Spring Boot, która pobiera dane w czasie rzeczywistym z API Open-Meteo. Głównym celem projektu było przećwiczenie integracji z zewnętrznym API, stworzenie architektury typu proxy oraz konteneryzacja.

## Architektura i Notatki Projektowe

* **Backend jako Proxy:** Backend w Spring Boot działa tutaj jako pośrednik. Zamiast odpytywać API bezpośrednio z frontendu, to serwer pobiera i formatuje dane. Dzięki temu klient nie jest na sztywno powiązany z zewnętrzną usługą.
* **Dlaczego Open-Meteo?:** Wybrałem to API celowo, ponieważ nie wymaga klucza autoryzacyjnego. Ułatwia to uruchomienie projektu natychmiast po sklonowaniu (bez konfigurowania plików `.env` i zarządzania sekretami), a jednocześnie udowadnia umiejętność pracy z REST API.
* **Wdrożenie i Docker:** Cała aplikacja jest skonteneryzowana. Dzięki użyciu Dockera mam pewność, że środowisko lokalne jest w 100% zgodne ze środowiskiem produkcyjnym na platformie Render.
* **Logika Frontendu:** Zastosowałem prosty interfejs w czystym HTML, CSS i Vanilla JS. Kaskadowe listy wyboru (kraj/miasto) zarządzają swoim stanem wyłącznie po stronie klienta, co pozwala backendowi pozostać całkowicie bezstanowym (stateless).

## Technologie

* **Backend:** Java, Spring Boot
* **Infrastruktura:** Docker, Render
* **Zewnętrzne API:** Open-Meteo REST API
* **Frontend:** HTML, CSS, Vanilla JavaScript
