# zoo-oop
![Alt text of the image](https://github.com/paintInSour/zoo-oop/blob/main/zoo-oop-problem-schema.png)

В даному випадку виникає проблема того, що **Лев**, **Коза** та **Корова** повинні наслідувати поведінку класа **Животное**. В той же час **Коза**, **Корова** та **Трава** повинні мати можливість приймати поведінку класа **Еда**

![Alt text of the image](https://github.com/paintInSour/zoo-oop/blob/main/new-zoo.png)

В цьому випадку був доданий маркерний інтерфейс **Eatable** який позначає клас як як той який можливо "з'їсти" та маркерні інтерфейси **Cornivorous** та **Herbivorous** для визначення типів харчування для класу **Animal**, за якими визначаєтся можливість "поїдання" об'єктта класу **Eatable**. Така реалізація дозволяє об'єктам змінювати стани та бути одночасно **Animal** та **Eatable**

Також можна змінити реалізацію до прямої реалізації конкретним класом класу **Eatable** який буде потребувати попереднього явного перетворення до **Eatable**

![Alt text of the image](https://github.com/paintInSour/zoo-oop/blob/main/zoo-oop-var-2.png)
