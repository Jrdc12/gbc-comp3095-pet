package model;

import java.time.LocalDate;

public class Pet {
    private PetType _petType;
    private Owner _owner;
    private LocalDate _birthDate;

    // setters and getters

    public PetType getPetType() {
        return _petType;
    }

    public void setPetType(PetType petType) {
        _petType = petType;
    }

    public Owner getOwner() {
        return _owner;
    }

    public void setOwner(Owner owner) {
        _owner = owner;
    }

    public LocalDate getBirthDate() {
        return _birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        _birthDate = birthDate;
    }
}
