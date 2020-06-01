package pl.edu.pwsztar

import spock.lang.Specification

class IsIdCorrectSpec extends Specification {
    def "should check if id is correct"() {
        given:
            UserId firstUser = new UserId("83070477662")
            UserId secondUser = new UserId("98222373512")
            UserId thirdUser = new UserId("00012268743")
        when:
            boolean isFirstUserCorrect = firstUser.isCorrect()
            boolean isSecondUserCorrect = secondUser.isCorrect()
            boolean isThirdUserCorrect = thirdUser.isCorrect()
        then:
            isFirstUserCorrect
            !isSecondUserCorrect
            !isThirdUserCorrect
    }
}
