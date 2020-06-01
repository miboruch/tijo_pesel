package pl.edu.pwsztar

import spock.lang.Specification

class UserIdSpec extends Specification {
    /* correct, incorrect, empty, null */

    def "should check correct size"() {
        given:
            UserId userId = new UserId("98051101192")
        when:
            boolean isCorrect = userId.isCorrectSize();
        then:
            isCorrect
    }
    def "should check incorrect size"() {
        given:
            UserId userId = new UserId("980511011921")
        when:
            boolean isCorrect = userId.isCorrectSize();
        then:
            !isCorrect
    }
    def "should check empty string"() {
        given:
            UserId userId = new UserId("")
        when:
            boolean isCorrect = userId.isCorrectSize();
        then:
            !isCorrect
    }
    def "should check null"() {
        given:
            UserId userId = new UserId(null)
        when:
            boolean isCorrect = userId.isCorrectSize();
        then:
            !isCorrect
    }
}
