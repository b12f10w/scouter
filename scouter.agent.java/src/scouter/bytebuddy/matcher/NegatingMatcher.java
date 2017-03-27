// Generated by delombok at Sun Feb 26 12:31:38 KST 2017
package scouter.bytebuddy.matcher;

/**
 * An element matcher that reverses the matching result of another matcher.
 *
 * @param <T> The type of the matched entity.
 */
public class NegatingMatcher<T> extends ElementMatcher.Junction.AbstractBase<T> {
    /**
     * The element matcher to be negated.
     */
    private final ElementMatcher<? super T> matcher;

    /**
     * Creates a new negating element matcher.
     *
     * @param matcher The element matcher to be negated.
     */
    public NegatingMatcher(ElementMatcher<? super T> matcher) {
        this.matcher = matcher;
    }

    @Override
    public boolean matches(T target) {
        return !matcher.matches(target);
    }

    @Override
    public String toString() {
        return "not(" + matcher + ')';
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    @javax.annotation.Generated("lombok")
    public boolean equals(final java.lang.Object o) {
        if (o == this) return true;
        if (!(o instanceof NegatingMatcher)) return false;
        final NegatingMatcher<?> other = (NegatingMatcher<?>) o;
        if (!other.canEqual((java.lang.Object) this)) return false;
        final java.lang.Object this$matcher = this.matcher;
        final java.lang.Object other$matcher = other.matcher;
        if (this$matcher == null ? other$matcher != null : !this$matcher.equals(other$matcher)) return false;
        return true;
    }

    @java.lang.SuppressWarnings("all")
    @javax.annotation.Generated("lombok")
    protected boolean canEqual(final java.lang.Object other) {
        return other instanceof NegatingMatcher;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    @javax.annotation.Generated("lombok")
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final java.lang.Object $matcher = this.matcher;
        result = result * PRIME + ($matcher == null ? 43 : $matcher.hashCode());
        return result;
    }
}