package external.config.micronaut.configuration.property

import javax.inject.Inject

class BootStrap {

    @Inject
    MyConfiguration myConfiguration

    def init = { servletContext ->
        assert myConfiguration.number == 42
    }
    def destroy = {
    }
}
