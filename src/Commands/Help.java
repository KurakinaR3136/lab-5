package Commands;

import Controller.CommandWithoutArg;

public class Help implements CommandWithoutArg {
    @Override
    public void execute(Object o) {
        System.out.println("help : вывести справку по доступным командам\n" +
                "info : вывести в стандартный поток вывода информацию о коллекции (тип, дата инициализации, количество элементов и т.д.)\n" +
                "show : вывести в стандартный поток вывода все элементы коллекции в строковом представлении\n" +
                "add {element} : добавить новый элемент в коллекцию\n" +
                "update id {element} : обновить значение элемента коллекции, id которого равен заданному\n" +
                "remove_by_id id : удалить элемент из коллекции по его id\n" +
                "clear : очистить коллекцию\n" +
                "save : сохранить коллекцию в файл\n" +
                "replace_if_greater key {element} : заменить значение по ключу, если новое значение больше старого\n" +
                "replace_if_lower key {element} : заменить значение по ключу, если новое значение меньше старого\n" +
                "execute_script file_name : считать и исполнить скрипт из указанного файла. В скрипте содержатся команды в таком же виде, в котором их вводит пользователь в интерактивном режиме.\n" +
                "exit : завершить программу (без сохранения в файл)\n" +
                "count_less_than_official_address officialAddress : вывести количество элементов, значение поля officialAddress которых меньше заданного\n");


    }

    @Override
    public String getName() {
        return "help";
    }
}
