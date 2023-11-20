package dog;

class Dog {
	
    private final String name;
    private final int age;

    public Dog(final String name, final int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    
    @Override
    public String toString() {
    	return "Ім'я: " + name + ", Вік: " + age + " років";
    }
    
}
