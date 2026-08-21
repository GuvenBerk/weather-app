# Weather App - Open-Meteo API Integration

**Live URL:** [weather-app-1-yka5.onrender.com](https://weather-app-1-yka5.onrender.com)

## Project Overview
A Spring Boot application that fetches real-time weather data from the Open-Meteo API. I built this project to demonstrate external API integration, backend proxy architecture, and containerized deployment.

## Architecture & Dev Notes

* **Backend as a Proxy:** The Spring Boot backend acts as a middleman. Instead of the frontend hitting the weather API directly, the backend handles fetching, parsing, and formatting the data. This keeps the client fully decoupled from the third-party service.
* **Why Open-Meteo?:** I picked this API specifically because it has no authentication requirement. That makes the project trivial to clone and run locally — no `.env` setup, no secret management — while still showing I can wire up a REST integration end-to-end.
* **Docker & Deployment:** The entire application is containerized with Docker. The local and production environments on Render run from the same image, so there are no environment-specific surprises.
* **Frontend Logic:** I kept the frontend deliberately minimal — Vanilla HTML, CSS, and JS. The cascading dropdowns (country/city selection) handle their own state on the client side, which lets the backend stay completely stateless.

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
* **Dlaczego Open-Meteo?:** Wybrałem to API celowo, bo nie wymaga żadnego klucza autoryzacyjnego. Projekt można sklonować i od razu uruchomić — bez konfigurowania `.env`, bez zarządzania sekretami — a mimo to integracja z REST API jest pełnoprawna i działa end-to-end.
* **Wdrożenie i Docker:** Cała aplikacja jest skonteneryzowana. Środowisko lokalne i produkcyjne na Renderze działają z tego samego obrazu, więc nie ma żadnych niespodzianek wynikających ze różnic środowiskowych.
* **Logika Frontendu:** Interfejs jest celowo minimalistyczny — czysty HTML, CSS i Vanilla JS. Kaskadowe listy wyboru (kraj/miasto) zarządzają swoim stanem wyłącznie po stronie klienta, co pozwala backendowi pozostać całkowicie bezstanowym (stateless).

## Technologie

* **Backend:** Java, Spring Boot
* **Infrastruktura:** Docker, Render
* **Zewnętrzne API:** Open-Meteo REST API
* **Frontend:** HTML, CSS, Vanilla JavaScript
