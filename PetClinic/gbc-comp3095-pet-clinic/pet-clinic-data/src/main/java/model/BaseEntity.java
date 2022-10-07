package model;

import java.io.Serializable;

public class BaseEntity implements Serializable {

    private Long _id;

    public Long get_id() {
        return _id;
    }

    public void set_id(Long _id) {
        this._id = _id;
    }
}
