package com.company;

public class LongId <T> {
    private long id;

    public LongId(long id){
        this.id=id;
    }

    public long getId() {
        return id;
    }
    //Как не нужно делать
    public void manyIdsInParams(long userId, long serverId, long address){}

    //Как нужно делать
    public void manyIdsInParams(LongId<User> userId,
                                LongId<Server> serverId,
                                LongId<Address> address){}
}

