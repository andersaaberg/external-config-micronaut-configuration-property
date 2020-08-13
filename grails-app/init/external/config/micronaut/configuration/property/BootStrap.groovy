package external.config.micronaut.configuration.property

import org.springframework.beans.factory.annotation.Value
import javax.inject.Inject

class BootStrap {

    @Value('${my.number}')
    Integer myNumber

    @Inject
    MyConfiguration myConfiguration

    def init = { servletContext ->
        assert myNumber == 42 // works both with external-config/my-external-config.yml and application.yml
        assert myConfiguration.number == 42 // works only with application.yml
    }
    def destroy = {
    }
}
