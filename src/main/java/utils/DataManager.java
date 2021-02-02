package utils;


public class DataManager {

    private static DataManager dataManager;

    private DataManager() {    }

    public static DataManager getInstance(){
        if(dataManager==null){
            dataManager=new DataManager();
        }
        return dataManager;
    }

}
