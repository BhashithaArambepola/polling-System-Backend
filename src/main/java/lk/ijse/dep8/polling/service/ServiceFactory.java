package lk.ijse.dep8.polling.service;



public class ServiceFactory {

    private static ServiceFactory serviceFactory;

    private ServiceFactory(){

    }

    public static ServiceFactory getInstance(){
        return (serviceFactory == null) ? (serviceFactory = new ServiceFactory()): serviceFactory;
    }

    public <T extends SuperService> T getService(ServiceType type){
        switch (type){
            case POLL:
                return null;
//                return (T) new PollServiceImpl();
            default:
                return null;
        }
    }

    public enum ServiceType{
        POLL
    }
}