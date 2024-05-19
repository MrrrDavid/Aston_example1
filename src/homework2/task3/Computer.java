package homework2.task3;

public class Computer {

    public static class Processor {

        private String model;

        public String getDetails() {
            return model;
        }

        public Processor(String model) {
            this.model = model;
        }
    }

    public class Ram {

        private String size;

        public String getDetails() {
            return size;
        }

        public Ram(String size) {
            this.size = size;
        }
    }

}
