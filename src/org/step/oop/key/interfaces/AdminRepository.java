package org.step.oop.key.interfaces;

public class AdminRepository implements Repository<Admin> {

    @Override
    public Admin[] findAll() {
        return new Admin[0];
    }

    @Override
    public Admin findById() {
        return null;
    }

    @Override
    public void save(Admin admin) {

    }

    @Override
    public void delete(Admin admin) {

    }
}
