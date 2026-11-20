public class Dog {
        private String name;
        private String ownerName;
        private int age;
        private int dogId;
        private String dogTag;
        private boolean stillInFacility;

        public Dog(){
            name = "Unnamed";
            ownerName = "Unknown";
            age = 1;
            dogId = 100;
            dogTag = "100G";
            stillInFacility = true;
            dogsCreated++;
        }

        public String getName(){
            return name;
        }
        public String getOwnerName(){
            return ownerName;
        }
        public int getAge(){
            return age;
        }
        public int getDogId(){
            return dogId;
        }
        public String getDogTag(){
            return dogTag;
        }
        public boolean isStillInFacility(){
            return stillInFacility;
        }

        public void setName(String name){
            this.name = name;
        }
        public void setAge(int age){
            this.age = age;
        }
        public void setDogTag(String dogTag){
            this.dogTag = dogTag;
        }
        public void setStillInFacility(boolean stillInFacility){
            this.stillInFacility = stillInFacility;
        }

        public Dog(String name, String ownerName, int age, int dogId){
            setName(name);
            setAge(age);
            this.ownerName = ownerName;
            this.dogId = PawesomeUtils.validateDogId(dogId);
            setStillInFacility(true);
            dogsCreated++;
            dogTag = PawesomeUtils.generateDogTag(this.dogId, 
            PawesomeUtils.generateDogChar(this.dogId));

            }


        private static int dogsCreated = 0;

        public static int getDogsCreated(){
            return dogsCreated;
        }

        public void setDogId(int dogId){
            this.dogId = PawesomeUtils.validateDogId(dogId);
            // why is setDogId(dogId) create a StackOverflowError
            this.dogTag = PawesomeUtils.generateDogTag(this.dogId, 
                PawesomeUtils.generateDogChar(this.dogId));
        }

        public String toString(){
            String profile = "Name: " + name + " Ownner: " 
            + ownerName + " Age: " + age + " DogTag: " + dogTag
            + "In the facility: " + stillInFacility;
            return profile;
        }

        public boolean equals(Dog other){
            if (other == null){
                return false;
            }
            
            if (this.dogTag.equals(other.dogTag) 
                && this.name.equals(other.name) 
                && this.ownerName.equals(other.ownerName) 
                && this.age == other.age 
                && this.stillInFacility == other.stillInFacility){
                return true;
            }
            else{
                return false;
            }
        }





    }

