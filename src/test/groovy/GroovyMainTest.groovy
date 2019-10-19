import spock.lang.Specification
import spock.lang.Unroll

class GroovyMainTest extends Specification {
    def "MainGroovy.hello should return hello"() {
        expect:
        MainGroovy.hello() == "Hello from Groovy!"
    }

    @Unroll
    def "#a to the power of #b should be equal #c"(int a, int b, int c) {
        expect:
        Math.pow(a, b) == c

        where:
        a | b | c
        1 | 2 | 1
        2 | 2 | 4
        3 | 2 | 9
    }
}
