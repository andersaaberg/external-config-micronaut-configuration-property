package external.config.micronaut.configuration.property

import io.micronaut.context.annotation.ConfigurationProperties

@ConfigurationProperties('my')
class MyConfiguration {
    Integer number
}
