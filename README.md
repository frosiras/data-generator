# data-generator

## Задание 1

Все достаточно просто. **Никаких** серверов от тебя не требуется. Мавен тоже трогать не надо. Все, что я хочу, это чтобы внутри main была какой-то код, который выводил бы случайное число в консоль.  
Логика такая:  
Запускаю main и получаю в консоли на выходе случаное число от 0 до 1000 с 2-мя знаками после запятой. Примеры чисел 100.01, 876.00, 34.96

## Задание 2

Ты справилась слишком быстро, давай попробуем что-то посложнее.
Я хочу, чтобы в этом проекте был мавен. То есть был помник(.pom) и можно было запусть mvn clean install. Проще всего создать новы проект с мавеном и либо весь еще перетащить, либо только помник и разобраться, что за что там отвечает

## Задание 3

(minor)Разберись, как в файле .gitignore запретить гиту добавлять папку target. Это бесполезная папка

Я хочу, чтобы в проекте мог запуститься spring boot. То есть достаточно, чтобы необходимые зависимости для спринг бута и приложение можно было запустить через зеленую кнопочку в идее

## Задание 4

Я хочу, чтобы теперь случайное число, которое ты генерила в первом задании возвращалось таким образом. Поднимается сервер, который принимает наши запросы. Мы кидаем запрос типа localhost:8080/getRandom и получаем это случайно число в ответ.
Надо писать это на сервере, который ты создала в третьем задании. Вот пример кода, который обрабатывает get запросы. https://www.baeldung.com/spring-new-requestmapping-shortcuts. Ну и вообще почитай, что там помимо getMapping надо написать
