
//Урок 6. Хранение и обработка данных ч3: множество коллекций Set

////////////////////////////////////////////////////////////////////////////////////

//HashSet

/*
isEmpty() – проверка на пустоту.

add(V) – добавление элемента в коллекцию.

remove(V) – удаление элемента из коллекцию.

contains(V) – проверка на включение элемента в коллекции.

clear() – удаление всех элементов коллекции.

size() – возвращает количество элементов коллекции.
*/

////////////////////////////////////////////////////////////////////////////////////

////HashSet
package WORK;

import java.util.HashSet;
import java.util.Set;

public class program {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(12);
        set.add(123);
        set.add(1234);
        set.add(1234);
        System.out.println(set.contains(12)); // true
        set.add(null);
        System.out.println(set.size()); // 5
        System.out.println(set); // [null, 1, 1234, 123, 12]
        set.remove(12);
        for (var item : set)
            System.out.println(item); // null 1 1234 123
        set.clear();
        System.out.println(set); // []
    }
}

/* 
ОТВЕТ:
true
5   
[null, 1, 1234, 123, 12]
null
1
1234
123
[]
*/

////////////////////////////////////////////////////////////////////////////////////

//HashSet как синоним множества

package WORK;

import java.util.Arrays;
import java.util.HashSet;

public class program {
    public static void main(String[] args) {
        var a = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        var b = new HashSet<>(Arrays.asList(2, 3, 5, 7, 11, 13, 17));
        var u = new HashSet<Integer>(a);
        u.addAll(b);
        var r = new HashSet<Integer>(a);
        r.retainAll(b);
        var s = new HashSet<Integer>(a);
        s.removeAll(b);
        System.out.println(a); // [1, 2, 3, 4, 5, 6]
        System.out.println(b); // [17, 2, 3, 5, 7, 11]
        System.out.println(u); // [1, 17, 2, 3, 4, 5, 6, 11]
        System.out.println(r); // [2, 3, 5, 7]
        System.out.println(s); // [1, 4, 6]
        boolean res = a.addAll(b);
    }
}

/* 
ОТВЕТ:
[1, 2, 3, 4, 5, 6, 7]
[17, 2, 3, 5, 7, 11, 13]
[1, 17, 2, 3, 4, 5, 6, 7, 11, 13]
[2, 3, 5, 7]
[1, 4, 6]
*/

////////////////////////////////////////////////////////////////////////////////////

//HashSet как синоним множества

/* 
first()
last()
headSet(E)
tailSet(E)
subSet(E1, E2)
*/

////////////////////////////////////////////////////////////////////////////////////

//HashSet как синоним множества

package WORK;

import java.util.*;

public class program {
    public static void main(String[] args) {
        var a = new TreeSet<>(Arrays.asList(1, 7, 2, 3, 6, 4, 5));
        var b = new TreeSet<>(Arrays.asList(13, 3, 17, 7, 2, 11, 5));
        System.out.println(a); // [1, 2, 3, 4, 5, 6, 7]
        System.out.println(b); // [2, 3, 5, 7, 11, 13, 17]
        System.out.println(a.headSet(4)); // [1, 2, 3]
        System.out.println(a.tailSet(4)); // [4, 5, 6, 7]
        System.out.println(a.subSet(3, 5)); // [3, 4]
    }
}

/* 
ОТВЕТ:
[1, 2, 3, 4, 5, 6, 7]
[2, 3, 5, 7, 11, 13, 17]
[1, 2, 3]
[4, 5, 6, 7]
[3, 4]
*/

////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////

//TreeSet

/* 
● В основе HashMap.
● Упорядочен по возрастанию.
● null’ов быть не может.
*/

package WORK;

import java.util.*;

public class program {
    public static void main(String[] args) {
        var a = new TreeSet<>(Arrays.asList(1, 7, 2, 3, 6, 4, 5));
        var b = new TreeSet<>(Arrays.asList(13, 3, 17, 7, 2, 11, 5));
        System.out.println(a); // [1, 2, 3, 4, 5, 6, 7]
        System.out.println(b); // [2, 3, 5, 7, 11, 13, 17]
        System.out.println(a.contains(1)); // true
    }
}

/* 
ОТВЕТ:
[1, 2, 3, 4, 5, 6, 7]
[2, 3, 5, 7, 11, 13, 17]
true
*/

////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////

//LinkedHashSet

/* 
● В основе HashMap.
● Помнит порядок.
Использовать, когда нужен HashSet с запоминанием порядка элемента
*/

////////////////////////////////////////////////////////////////////////////////////

//LinkedHashSet

/*
isEmpty() – проверка на пустоту.

add(V) – добавление элемента в коллекцию.

remove(V) – удаление элемента из коллекцию.

contains(V) – проверка на включение элемента в коллекции.

clear() – удаление всех элементов коллекции.

size() – возвращает количество элементов коллекции
*/

////////////////////////////////////////////////////////////////////////////////////

//LinkedHashSet

package WORK;

import java.util.*;

public class program {
    public static void main(String[] args) {
        var a = new LinkedHashSet<>(Arrays.asList(1, 7, 2, 3, 6, 4, 5));
        var b = new LinkedHashSet<>(Arrays.asList(13, 3, 17, 7, 2, 11, 5));
        a.add(28);
        System.out.println(a); // [1, 7, 2, 3, 6, 4, 5, 28]
        System.out.println(b); // [13, 3, 17, 7, 2, 11, 5]
    }
}

/* 
ОТВЕТ:
[1, 7, 2, 3, 6, 4, 5, 28]
[13, 3, 17, 7, 2, 11, 5]
*/

////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////

// §2. Введение
// в создание
// собственных типов

/*
Java является объектно-ориентированным языком.

Программа, написанная на Java, должна соответствовать
парадигме объектно-ориентированного программирования.

Следует понимать, что принципы ООП не просто определяют
структуру программы. Это некий фундаментальный подход,
с которым нам предстоит разобраться.

Спагетти-код – код, в котором данные связаны с методами
для их обработки и в итоге может получиться так, что отдельные
ветви алгоритма переплетаются, образуя запутанный клубок,
в котором невозможно разобраться
*/

////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////

//§2. Введение в создание собственных типов

/*
Решение проблемы получило название объектно-ориентированное
программирование или объектно-ориентированное проектирование или ООП.

При использовании данного подхода, упорядочивание кода базируется
на объединении данных, с одной стороны, и методов для обработки этих
данных, с другой стороны, в одно целое. Это «одно целое» в ООП называется
экземпляром класса.

Вся программа при этом имеет блочную структуру, что существенно упрощает
анализ кода и внесение в него изменения.

ООП – искусственный прием, в большинстве случаев не зависящий, от языка
программирования. 
*/

////////////////////////////////////////////////////////////////////////////////////

//§2. Введение в создание собственных типов

/* 
Если говорят, что разработка идет с использованием ООП – это говорит о
том, что используются классы и экземпляры этих классов.

Каждый экземпляр класса определяется общим шаблоном, который
называется классом.

В рамках класса задается общая структура, на основе которой затем
создаются экземпляры.

Данные, относящиеся к классу, называются полями класса, а код для их
обработки — методами класса.
*/

////////////////////////////////////////////////////////////////////////////////////

//§2. Введение в создание собственных типов

/* 
Примеры:

Автомобиль – Lada 2107 UIN 123123123, S/N 789789789
Здание – Дом по адресу г.Москва ул. Ленина 21к1
Ученик – Сергей Камянецкий, 51 МиИ, СмолГУ
Мобильный телефон – Siemens CX60 IMEI 1234520032022
Геометрическая фигура – додекаэдр
Работник – Смиронова Т.В. 14.02.1994, ID 728, Компания GeekBrains
Котики – Барсик
*/

///////////////////////////////////////////////////////////////
package Lesson_06.part2;

import java.util.*;

public class Ex001_Program {

    public static void main(String[] args) {
        // #region

        Worker w1 = new Worker();
        w1.firstName = "Имя_1";
        w1.lastName = "Фамилия_1";
        w1.salary = 100;
        w1.id = 1000;

        Worker w4 = new Worker();
        w4.firstName = "Имя_1";
        w4.lastName = "Фамилия_1";
        w4.salary = 100;
        w4.id = 1000;

        Worker w2 = new Worker();
        w2.firstName = "Имя_2";
        w2.lastName = "Фамилия_2";
        w2.salary = 200;
        w2.id = 2000;

        Worker w3 = new Worker();
        w3.firstName = "Имя_3";
        w3.lastName = "Фамилия_3";
        w3.salary = 300;
        w3.id = 3000;

        // System.out.println(w1);
        // System.out.println(w2);
        // System.out.println(w3);
        // #endregion

        System.out.println(w1 == w4);
        System.out.println(w1.equals(w4));
        var workers = new HashSet<Worker>(Arrays.asList(w1, w2, w3));
        System.out.println(workers.contains(w4));

    }
}

/////////////////////////////////////////////////////////////////////////////////

package Lesson_06.part2;

public class Worker {
    int id;
    int salary;
    String firstName;
    String lastName;

    @Override
    public String toString() {
        return String.format("%d %s %s %d", id, firstName, lastName, salary);
    }

    @Override
    public boolean equals(Object o) {
        var t = (Worker) o;
        return id == t.id && firstName == t.firstName;
    }
    @Override
    public int hashCode() {
        return id;
    }
}
