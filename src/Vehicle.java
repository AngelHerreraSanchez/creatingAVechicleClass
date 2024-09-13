public class Vehicle {



        private String make;
        private String model;

        public Vehicle(String make, String model) {
            this.make = make;
            this.model = model;
        }

        public String getMake() {
            return make;
        }
        public String getModel() {
            return model;
        }


        public void setMake(String make) {
            if(make != "fart"){
                this.make = make;
            }else{
                System.out.println("Can't Do");
            }
        }

        public void setModel(String model) {
            if(model != "bag"){
                this.model = model;
            }else{
                System.out.println("Can't Do");
            }
        }


}
