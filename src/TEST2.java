import java.util.*;

public class TEST2 {
    /**
     * Класс для хранения информации о пакетах и их зависимостях.
     */
    public class Package{
        private String name; //уникальное название пакета
        private List<Package> dependencies = new ArrayList<>(); //список пакетов, от которых зависит данный

        public Package(String name)  {
            this.name = name;
        }

        public List<Package> getDependencies() {
            return dependencies;
        }

        public String getName(){
            return name;
        }
    }

    /**
     * Класс для хранения информации о проекте и входящих в него пакетах.
     */
    public class Project {
        private String name; //название проекта
        private List<Package> packages = new ArrayList<>(); //список пакетов проекта

        public Project(String name){
            this.name = name;
        }

        /**
         * Проверяет наличие циклических зависимостей между пакетами проекта.
         Когда мы говорим "A зависит от B (или A -> B)", имеется в виду, что пакет B
         содержится списке зависимостей (dependencies) пакета A.
         * Например,
         * в проекте A->B->C->A – цикл есть
         * в проекте A->B->D, A->C->D – цикла нет
         */
        public Boolean hasCyclicDependencies(){
            return true;
        }

        /**
         * Упорядоченный список пакетов проекта для компиляции с учетом их
         * зависимостей. Скомпилировать пакет мы можем только после успешной компиляции его зависимостей.
         * Например, для проекта A->B->C, D->C
         порядок компиляции может быть C, B, A, D или C, D, B, A или C, B, D, A
         */
        public List<Package> getCompilationOrder(){
            return new ArrayList<Package>();
            }
    }
}
