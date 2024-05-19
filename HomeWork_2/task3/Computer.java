package task3;

public class Computer {

    private Processor processor;
    private RAM ram;

    public Computer(String processorModel, int ramSize){
        this.processor = new Processor(processorModel);
        this.ram = new RAM(ramSize);
    }

    public static class Processor {
        String model;

        public Processor(String model){
            this.model = model;
        }

        public String getDetails(){
            return model;
        }
    }

    public class RAM {

        int size;

        public RAM(int size) {
            this.size = size;
        }

        public int getDetails(){
            return size;
        }
    }

    public static void main (String[] args){

        Computer comp = new Computer("Intel Core i7", 8);
        System.out.println("Процессор: " + comp.processor.getDetails());
        System.out.println("RAM: " + comp.ram.getDetails());
    }
}
