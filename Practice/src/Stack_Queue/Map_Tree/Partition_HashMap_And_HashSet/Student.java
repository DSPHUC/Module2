package Stack_Queue.Map_Tree.Partition_HashMap_And_HashSet;

public class Student {
    private String name;
    private byte age;
    private String address;
    public Student(){}
    public Student(String name, byte age,String address){
        this.name=name;
        this.address=address;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
@Override
    public String toString(){
        return "Student@name="+name+", age "+age+", address "+address;
}
}
