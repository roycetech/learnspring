package ph.rye.spring540.model;


import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class Talker {

    private Long id;

    private String username;

    private String password;

    private String firstName;

    private String lastName;

    private String email;


    public Talker() {}

    public Talker(final String username, final String password,
            final String firstName, final String lastName, final String email) {
        this(null, username, password, firstName, lastName, email);
    }

    public Talker(final Long id, final String username, final String password,
            final String firstName, final String lastName, final String email) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(final String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(final String password) {
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(final String email) {
        this.email = email;
    }

    @Override
    public boolean equals(final Object that) {
        return EqualsBuilder.reflectionEquals(
            this,
            that,
            "firstName",
            "lastName",
            "username",
            "password",
            "email");
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(
            this,
            "firstName",
            "lastName",
            "username",
            "password",
            "email");
    }

}
