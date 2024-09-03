
public class Dog extends HousePet {
    protected int numberOfWalksPerDay;

    public Dog() {
//This calls HousePet() automatically.
        numberOfWalksPerDay = 2;
    }


public Dog(String n, String o, String ff, int numWalks){
//We must explicitly call the HousePet() overloaded
//constructor, passing it the name, owner, and food info.
            super(n, o, ff);
            numberOfWalksPerDay = numWalks;

        }

/*Here are the two methods that are abstract in the superclass, which
are overriden here, thus making Dog a complete class*/

        public String where_I_Sleep () {
            return "your mother house";
        }

            public String how_I_Move () {
                return "elon musk rocket";
            }

                public String toString () {
                    String output = super.toString();
/*modify coded here to override toString method --- provide
complete description of a Dog*/

                    return output;

                }

            }

