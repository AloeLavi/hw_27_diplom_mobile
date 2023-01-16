# Проект по автоматизации тестирования мобильного приложения Wikipedia

## :page_with_curl:	Содержание

- [Технологии и инструменты](#rocket-технологии-и-инструменты)
- [Реализованные проверки](#heavy_check_markреализованные-проверки)
- [Запуск тестов из терминала](#computer-запуск-тестов-из-терминала)
- [Allure отчет](#-allure-отчет)
- [Отчет в Telegram](#-уведомления-в-telegram-с-использованием-бота)
- [Видеопримеры прохождения тестов](#clapper-пример-видео-выполнения-теста-в-selenoid)

## :rocket: Технологии и инструменты

<p align="center">
<img width="6%" title="IntelliJ IDEA" src="images/logo/idea.png">
<img width="6%" title="Java" src="images/logo/java.png">
<img width="6%" title="Selenide" src="images/logo/selenide.png">
<img width="6%" title="Allure Report" src="images/logo/allure.png">
<img width="6%" title="Gradle" src="images/logo/gradle.png">
<img width="6%" title="JUnit5" src="images/logo/junit5.png">
<img width="6%" title="JUnit5" src="images/logo/browserstack.png">
<img width="6%" title="JUnit5" src="images/logo/appium.png">
<img width="6%" title="JUnit5" src="images/logo/android-studio.png">
<img width="6%" title="GitHub" src="images/logo/github.png">
<img width="6%" title="Jenkins" src="images/logo/jenkins.png">
<img width="6%" title="Telegram" src="images/logo/telegram.png">
<img width="6%" title="selenoid" src="images/logo/selenoid.png">

</p>

## 	:heavy_check_mark:	Реализованные проверки

- Поиск
- Открытие статьи
- Добавление нового языка


## 	:computer: Запуск тестов из терминала

### :house_with_garden:	Локальный запуск тестов

```
gradle clean test
```

### :earth_asia: Удаленный запуск тестов
```
clean test
-DdeviceHost=remote
```

### <img src="images/logo/jenkins.png" width="25" height="25"  alt="Allure"/></a>	Страница сборки в [Jenkins](https://jenkins.autotests.cloud/job/15-aloe_lavi-hw_27_diplom_mobile/)
<p align="center">
<img title="allure_main" src="images/pictures/jenkins_page.png">
</p>

## <img src="images/logo/allure.png" width="25" height="25"  alt="Allure"/></a> Анализ результатов: Allure

### Главная страница Allure-отчета
Можно увидеть количество и результат выполнения тестов, а также статистику прошлых запусков:
<p align="center">
<img title="allure_main" src="images/pictures/allure_main.png">
</p>

### Страница отдельного теста

На странице теста в Allure можно увидеть:
- содержание теста (шаги) 
- результат выполнения каждого шага и теста целиком

<p align="center">
<img title="allure_test" src="images/pictures/allure test.png">
</p>

К каждому тесту прилагается: 
- скриншот последнего действия
- page source
- в случае падения тестов выводится подробный текст ошибки 


## <img src="images/logo/browserstack.png" width="25" height="25"  alt="Browserstack"/></a> Пример видео выполнения теста в Browserstack

> В Browserstack можно посмотреть видео прогона каждого теста: 
<p align="center">
  <img title="Selenoid Video" src="images/video/browserstack-video-preview.gif">
</p>

## <img src="images/logo/telegram.png" width="25" height="25"  alt="Telegram"/></a> Уведомления в Telegram с использованием бота

<p align="center">
<img title="Telegram Notifications" src="images/pictures/telegram.png">
</p>
