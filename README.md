# Freshmen
У групу не можна додавати однакових студентів. При спробі додати однакових студентів програма викине помилку (DuplicationException).
Студент має такі характеристики(age, sex, firstName, lastName, yearOfStudy, averageScore, scholarship).
Професор має такі характеристики(age, sex, firstName, lastName).
Додати студента в групу - group.addStudent(студент).
Видалити студента з групи - group.removeStudent(студент).
Вибрати старосту в групі - group.chooseHeadman(). Староста обирається за наступними критеріями: людина з найбільшим середнім балом та стипендією, якщо ні
в кого не буде стипендії, то обирається просто з найвищим балом.
Показати старосту в групі - group.getHeadman().
Зробити перекличку в групі - професор.rollCall(потрібна група). Якщо група буде порожня, то виведе повідомлення (Group is empty!). Якщо група
не порожня, то починається перекличка, після кожного імені та фамілії потрібно написати в консоль here або left, в противному випадку програма
повідомить користувача, про некоректну відповідь та запропонує віповісти ще раз. Якщо ввести лише here, то програма виведе повідомлення (Everybody are here!).
Якщо ввести лише left, то програма виведе повідомлення (Class is empty...). В іншому випадку програма виведе по черзі імена студентів що присутні та відстуні.