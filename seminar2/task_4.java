// Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса, 
// используя StringBuilder. Данные для фильтрации приведены ниже в виде json строки. Если значение null, 
// то параметр не должен попадать в запрос. Параметры для фильтрации: 
// {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
// то есть должно получиться что-то вроде:
// where name = Ivanov and country = Russia and city = Moscow

package seminar1;

public class task_4 {

    public static void main(String[] args) {
        String req = "select * from students where ";
        String filtr = "name: Ivanov, country: Russia, city: Moscow, age: null";
        StringBuilder sb = new StringBuilder(req);
        StringBuilder res = new StringBuilder(filtr);
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < res.length(); i++) {
            if (res.charAt(i) == ':'){
                res.setCharAt(i, '=');
                res.insert(i, ' ');
            }
            else if (res.charAt(i) == ','){
                res.replace(i, i+1, "and");
                res.insert(i, ' ');
            }
            else if (res.charAt(i) == 'n' && res.charAt(i+3) == 'l') {
                res.delete(i-11, i+4);
            }
        }
        result.append(sb);
        result.append(res);
        System.out.println(result);
    } 
        
    
}
