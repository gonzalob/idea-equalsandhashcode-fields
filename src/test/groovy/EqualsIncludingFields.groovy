import groovy.transform.EqualsAndHashCode
import org.junit.Test

@EqualsAndHashCode(includeFields = true)
class EqualsIncludingFields {

    @Test
    void '@EqualsAndHashCode with includeFields = true fails when compiled with IDEA'() {
        EqualsIncludingFields o1 = new EqualsIncludingFields()
        EqualsIncludingFields o2 = new EqualsIncludingFields()
        assert o1 == o2
    }
}
