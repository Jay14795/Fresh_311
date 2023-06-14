package data;

import com.github.javafaker.Faker;

/**
 * Created By Faisal Khatri on 25-07-2022
 */
public class TestDataBuilder {

    public static final Faker FAKER = Faker.instance ();

    public static LoginData getLoginData () {
        return LoginData.builder ()
                .email (FAKER.internet ()
                        .emailAddress ())
                .password (FAKER.internet ()
                        .password ())
                .build ();
    }

}