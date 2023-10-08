package com.javarush.task.task36.task3608.model;

import com.javarush.task.task36.task3608.bean.User;

public interface Model {
    ModelData getModelData();

    void loadUsers();

    void loadDeletedUsers();

    void loadUserById(long userId);
}
