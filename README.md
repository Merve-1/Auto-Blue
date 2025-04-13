# 🚗 Hands-Free Driving System (HFDS) - Backend Repository ⚙️

## 🌟 Overview
This repository contains the backend components for the **Company Website** of the Hands-Free Driving System (HFDS). The system is an integrated solution for autonomous vehicle control, consisting of multiple interconnected subsystems. 

**📢 Note:** Other system components (AI module, firmware, monitoring website) are currently in development and will be uploaded to separate repositories when ready.

## 🏗️ System Architecture

The complete HFDS includes:
- **🏢 Company Website** (This repository - Java/Spring Boot/MySQL)
- **🔧 Hardware Firmware** (C) - Vehicle control and sensor interfacing
- **🧠 AI-Based Autonomous Driving Module** (Python/PyTorch) - Obstacle detection and path planning
- **📊 Vehicle Monitoring Website** - Theft prevention and maintenance alerts

## 📂 Current Repository Contents

This backend system provides:
- 👥 User account management
- 🚘 Vehicle data storage and retrieval
- ⚙️ System configuration management
- 🔒 Secure API endpoints for other HFDS components

## 🏆 Key Quality Factors

The system adheres to strict quality standards including:
- ✅ **Functional Suitability**: Accurate data management and API responses
- 🔐 **Security**: Spring Security implementation with encrypted communications
- 🛠️ **Maintainability**: Modular Spring Boot architecture

## 🛠️ Installation & Setup

1. Requirements:
   - ☕ Java 17+
   - 🐬 MySQL 8.0+
   - 🅱️ Maven 3.8+

2. Configuration:
   ```properties
   # application.properties
   spring.datasource.url=jdbc:mysql://localhost:3306/hfds_db
   spring.datasource.username=your_username
   spring.datasource.password=your_password
   ```

3. Build and run:
   ```bash
   mvn clean install
   mvn spring-boot:run
   ```

## 🔜 Coming Soon

Other HFDS components currently in development:
- 🚦 Vehicle Control Firmware (C)
- 🤖 AI Autonomous Driving Module (Python/PyTorch)
- 📈 Vehicle Monitoring Dashboard
- 📱 Mobile Companion App

