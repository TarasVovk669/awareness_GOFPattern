 # Спостерігач/Observer
 
 ***_Спостерігач_*** - поведінковий патерн, котрий створює механізм підписки  і дає змогу об'єктам підписуватись на якусь подію і реагувати на неї.
 
Паттерн пропонує зберігати всередині об'єкта-видавця(`Publisher`) список посилань на об'єкти підписників(`Subscriber`). Причому видавець **не повинен** вести список підписок самостійно.
Він лише повинен надавати методи, за допомогою яких підписники могли б додавати або прибирати себе зі списку.
 
 ## Приклад
 Яскравим прикладом паттерну може стати видавництво журналу/газети та люди котрі підписались на отримання сповіщень, коли  виходитиме новий випуск. 
 
 1) Видавець(`Magazine`) володіє внутрішнім станом, зміни якого цікаво відслідковувати підписникам. Видавець містить механізм підписки: список підписників та методи підписки/відписки.
 2) Підписник(`Observer`) визначає інтерфейс, яким користується видавець для надсилання сповіщень. Здебільшого для цього досить одного методу.
 3) Конкретні підписники(`ManObserver/WomanObserver`) виконують щось у відповідь на сповіщення, яке надійшло від видавця. Ці класи мають дотримуватися загального інтерфейсу, щоб видавець не залежав від конкретних класів підписників.
 
### Застосування:
 - Якщо після зміни стану одного об'єкту потрібно щось зробити в інших, але ви не знаєте наперед, які саме об'єкти мають відреагувати.
 - Якщо одні об'єкти мають спостерігати за іншими, але тільки у визначених випадках.
 
 
### Переваги:
 - Видавці не залежать від конкретних класів підписників.
 - Можна підписувати і відписувати підписників "на льоту".
 
### Недоліки:
 - Підписники сповіщаються у випадковому порядку.