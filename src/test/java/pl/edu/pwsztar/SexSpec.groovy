package pl.edu.pwsztar

import spock.lang.Specification

class SexSpec extends Specification {
    def "should check correct sex"() {
        given:
            UserId man = new UserId("98051101192")
            UserId woman = new UserId("98051101182")
        when:
            Optional<UserIdChecker.Sex> manSex = man.getSex()
            Optional<UserIdChecker.Sex> womanSex = woman.getSex()
        then:
            manSex.get() == UserIdChecker.Sex.MAN
            womanSex.get() == UserIdChecker.Sex.WOMAN
    }
}
