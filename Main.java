public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setAge(42);
        System.out.println(persona.getAge());
        persona.setName("Julius Novachrono");
        System.out.println(persona.getName());
        persona.setPhone("8173533777");
        System.out.println(persona.getPhone());
    }
   
    static class Persona {
        private int age;
        private String name;
        private String phone;

        public void setAge(int age){

            this.age = age;

        }

        public int getAge(){
            return this.age;
        }

        public void setName(String name){

            this.name = name;
        }

        public String getName(){
            return this.name;
        }

        public void setPhone(String phone){
            this.phone = phone;
        }

        public String getPhone(){
            return this.phone;
        }

    }
}
