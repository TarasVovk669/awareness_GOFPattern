 # Ітератор
 
 ***_Ітератор_*** - поведінковий паттерн, який дає змогу послідовно обходити елементи складових об'єктів,
  не розкриваючи їхньою внутрішньої реалізації.
 
 ### Приклад:
 
 Уявимо що ми з вами та нашими душевними комрадами вирішили глянути меми і підняти трішки настрій. Склавши весла, ви сіли за ноут, покляцали і перед вами список свіжих мемів.
 Але ви отримали весь список, а не кожен мем окремо і не можете повністю оцінити їх по окремості.
 Наша дружня команда вирішує використати паттерн Ітератор, для того що всеж таки отримати свою дозу ендорфінів.
 Ідея паттерну полягає в тому, щоб винести поведінку обходу колекції з самої колекції в окремий об'єкт.
 
 `Iterator` - інтерфейс який містить тільки 2 методи (`hasNext` та `next`)
 `Iterable` - інтерфейс який повинен бути реалізований в нашій структурі даних для отримання ітератора.
 

### Застосування:
 - Мати декілька способів обходу однієї і тої самої структури даних.

### Переваги:
 - Спрощує класи зберігання даних.
 - Дозволяє реалізувати різні способи обходу колекцій.
 
### Недоліки:
 - Невиправданий, якщо можна обійтись простим циклом.