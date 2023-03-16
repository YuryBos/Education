package Practice._2023_03_09;

import java.util.List;
import java.util.ListIterator;

public class MyIterator {
    //сделать курсорами вместо итераторов
    boolean hasNext(List<Integer> list) {

            return true;
//        } else {
//            return false;
//        }
    }

    Integer next(List<Integer> list) {
        ListIterator<Integer> listIterator = list.listIterator();
        if (listIterator.hasNext()) {
            return listIterator.next();
        } else {
            return null;
        }
    }

    String removeNext(Integer number ,List<Integer> list) {
        //если объект есть то-Объект такой то удален
        //если нет то - объекта такого то нету
        if (list.contains(number)) {
            list.remove(number);
            return "Объект " + number + " удален";
        } else {
            return "Объекта " + number + " нету";
        }
    }

    String removePrevious(List<Integer> list) {
        //если объект есть то-Объект такой то удален
        //если нет то - объекта такого то нету
        if (list.size() > 0) {
            list.remove(list.size() - 1);
            return "Объект " + list.get(list.size() - 1) + " удален";
        } else {
            return "Объекта " + list.get(list.size() - 1) + " нету";
        }
    }

    boolean hasPrevious(List<Integer> list) {
        return true;

    }

    Integer previous(List<Integer> list) {
        return 0;
    }
    private static boolean movePointer (){

//        int start = 0; // индекс первого элемента
//        int end = characters.size() - 1; // индекс последнего элемента
//        while (start < end) { // пока индекс первого элемента меньше индекса последнего элемента
//            if (characters.get(start) != characters.get(end)) { // если символы не равны
//                return false; // возвращаем false
//            }
//            start++; // увеличиваем индекс первого элемента
//            end--; // уменьшаем индекс последнего элемента
//        }
        return true; // возвращаем true, если все элементы совпадают
    }
}