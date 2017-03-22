package Deivydas;

import javax.persistence.*;
import java.util.List;

/**
 * Created by vdeiv on 2017-03-05.
 */
@Entity
@Table(name = "DORMITORY", schema = "PUBLIC", catalog = "DORMITORYDB")
public class DormitoryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;
    @Basic
    @Column(name = "STREET")
    private String street;
    @Basic
    @Column(name = "STREET_NUMBER")
    private Integer streetNumber;
    @Version
    @Column(name = "OPT_LOCK_VERSION")
    private Integer optLockVersion;

    @OneToMany(mappedBy = "dormitory")
    private List<RoomEntity> rooms;

    @Basic
    @Column(name = "STREET")
    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Basic
    @Column(name = "STREET_NUMBER")
    public Integer getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(Integer streetNumber) {
        this.streetNumber = streetNumber;
    }

    @Basic
    @Column(name = "OPT_LOCK_VERSION")
    public Integer getOptLockVersion() {
        return optLockVersion;
    }

    public void setOptLockVersion(Integer optLockVersion) {
        this.optLockVersion = optLockVersion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DormitoryEntity that = (DormitoryEntity) o;

        if (id != that.id) return false;
        if (street != null ? !street.equals(that.street) : that.street != null) return false;
        if (streetNumber != null ? !streetNumber.equals(that.streetNumber) : that.streetNumber != null) return false;
        if (optLockVersion != null ? !optLockVersion.equals(that.optLockVersion) : that.optLockVersion != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (street != null ? street.hashCode() : 0);
        result = 31 * result + (streetNumber != null ? streetNumber.hashCode() : 0);
        result = 31 * result + (optLockVersion != null ? optLockVersion.hashCode() : 0);
        return result;
    }
}
