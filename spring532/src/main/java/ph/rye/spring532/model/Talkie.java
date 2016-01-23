package ph.rye.spring532.model;

import java.util.Date;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;


public class Talkie {


    private final Long id;
    private final String message;
    private final Date time;
    private final Double latitude;
    private final Double longitude;


    public Talkie(final String message, final Date time) {
        this(null, message, time, null, null);
    }

    public Talkie(final Long id, final String message, final Date time,
            final Double longitude, final Double latitude) {
        this.id = id;
        this.message = message;
        this.time = time;
        this.longitude = longitude;
        this.latitude = latitude;
    }


    public long getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }

    public Date getTime() {
        return time;
    }

    public Double getLongitude() {
        return longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    @Override
    public boolean equals(final Object that) {
        return EqualsBuilder.reflectionEquals(this, that, "id", "time");
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this, "id", "time");
    }
}