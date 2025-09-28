# Spring Dependency Injection Demo (XML Config)

## Описание
Этот проект демонстрирует механизм внедрения зависимостей (Dependency Injection) в **Spring Framework** с использованием:
- Конфигурации в формате **XML** (`applicationContext.xml`)
- Внедрения зависимостей через **конструктор** и **setter**
- Передачи зависимостей по ссылке

Приложение представляет собой простейшее **консольное приложение**:  
есть интерфейс `Actuator`, его реализации (гидравлический и электрический приводы) и класс `Mechanism`, который использует зависимость для выполнения действий.

---

## Требования
Перед запуском убедитесь, что установлены:
- [Java 21+](https://adoptium.net/) (проверить: `java -version`)
- [Apache Maven 3.9+](https://maven.apache.org/download.cgi) (проверить: `mvn -v`)

---

## Сборка и запуск

### 1. Клонировать репозиторий
```bash
git clone https://github.com/StepanovIvan05/pr2
cd pr2
```

### 2. Cобрать проект
```bash
mvn clean install
```

### 3. Запустить приложение
```bash
mvn exec:java
```

## Структура проекта
```bash
src/
 ├── main/
 │   ├── java/com/example/springxml/
 │   │   ├── MainApp.java          # Точка входа (консольное приложение)
 │   │   ├── Actuator.java         # Интерфейс
 │   │   ├── HydraulicActuator.java# Реализация Actuator
 │   │   ├── ElectricActuator.java # Реализация Actuator
 │   │   └── Mechanism.java        # Зависимый класс
 │   └── resources/
 │       └── applicationContext.xml# XML-конфигурация Spring
 └── test/
     └── java/...
```