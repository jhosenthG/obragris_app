# 🏗️ ObraGris: Performance & Error Reporting App

**ObraGris** is a modern Android application built to revolutionize construction project management. It equips on-site teams with powerful tools for reporting, performance tracking, and error logging. With a clean, modular architecture and a cutting-edge tech stack, the app helps streamline workflows, reduce operational issues, and enhance project efficiency through data-driven decision-making.

---

## 🚀 Key Features

- **📋 Detailed On-Site Reporting:** Quickly capture and submit structured reports directly from the construction site.
- **📷 Task Photo Capture:** Take photos of specific tasks or incidents to document progress or anomalies with visual proof.
- **📤 Email Report Sharing:** Automatically generate and send reports (with photos) to stakeholders via email.
- **📈 Performance Analysis:** Monitor key performance indicators (KPIs) to assess productivity and efficiency of various construction activities.
- **⚠️ Error & Anomaly Tracking:** Log, categorize, and analyze issues to identify recurring problems and their root causes.
- **📊 Data-Driven Insights:** (If implemented) Interactive dashboards that provide a clear view of project health, bottlenecks, and trends.
- **🌐 Offline Support:** Create reports without an internet connection and sync them once the device is back online.

---

## 🛠️ Tech Stack & Architecture

This project is built for **modularity**, **testability**, and **long-term maintainability** using modern Android development practices and tools.

### 🔧 Core Technologies

- **Jetpack Compose:** Declarative UI toolkit for building responsive, reactive interfaces.
- **Kotlin Coroutines & Flow:** Asynchronous programming and reactive data streams for smooth user experiences.
- **Retrofit:** Robust HTTP client for interacting with backend APIs.
- **Hilt (Dependency Injection):** Simple yet powerful DI framework for managing lifecycle-aware components.
- **CameraX:** Embedded camera integration to capture photos within the app.
- **JavaMail / Email API:** Send generated reports and images to project stakeholders directly from the device.

### 🧱 Architectural Approach

#### MVVM (Model–View–ViewModel)
- **View (Jetpack Compose):** Renders the UI and reacts to user interactions.
- **ViewModel:** Holds and manages UI-related state, surviving configuration changes.
- **Model:** Handles business data, networking, and persistence.

#### Clean Architecture
- **Presentation Layer:** UI components and ViewModels focused on user interaction.
- **Domain Layer:** Business logic, use cases, and abstraction through interfaces.
- **Data Layer:** Implementations of repositories, data sources (e.g., Retrofit, local storage, email sending).
