package ph.rye.spring641.model;


import javax.validation.constraints.Size;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.hibernate.validator.constraints.Email;

import com.sun.istack.internal.NotNull;


public class Talker {


    private Long id;

    @NotNull
    @Size(min = 5, max = 16, message = "{username.size}")
    private String username;

    @NotNull
    @Size(min = 5, max = 25, message = "{password.size}")
    private String password;

    @NotNull
    @Size(min = 2, max = 30, message = "{firstName.size}")
    private String firstName;

    @NotNull
    @Size(min = 2, max = 30, message = "{lastName.size}")
    private String lastName;

    @NotNull
    @Email
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
