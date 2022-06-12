package loadSheddingFactoryPattern;

public class GetLoadShedding {

    public LoadShedding getType(String loadSheddingName){

        if(loadSheddingName == null){
            return null;
        }
        else if (loadSheddingName.equalsIgnoreCase("REGULAR")){
            return new Regular();
        }
        else if (loadSheddingName.equalsIgnoreCase("EMERGENCY")){
            return new Emergency();
        }
        else if (loadSheddingName.equalsIgnoreCase("URGENT")){
            return new Urgent();
        }
        else if (loadSheddingName.equalsIgnoreCase("PERSONAL")){
            return new Personal();
        }
        return null;
    }
}
