    public class Human {

        private String name;
        private int age;
        private String town;
        private String job;
        public Human (String name,String town,int age,String job) {
            if (name==null){
                System.out.println("Информация не указана");}
            else {this.name = name;}
            if (town==null){
                System.out.println("Информация не указана");}
            else {this.town = town;}
            if (age >= 0) {
                this.age = age;
            } else {
                this.age = 0;
            }
            if (job==null){
                System.out.println("Информация не указана");}
            else {this.job = job;}

            System.out.println(" Привет! Меня зовут " + name+". Я из города "+town+". Я родился в "+age+" году. " +"Я работаю на должности "+job+". Будем знакомы!");}}


