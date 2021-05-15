package org.propagate.common.domain;

import org.propagate.common.domain.rollout.Nullable;

import java.io.Serializable;
import java.util.Objects;
import java.util.Optional;
import java.util.StringJoiner;

public class Variation implements Serializable {
    @Nullable
    private Long id;
    private String variation;

    // region Constructor, getters, setters, equals, hashCode, toString -- generated by BoB the Builder of Beans
    // The code below has been generated by BoB the Builder of Beans based on the class' fields.
    // Everything after this comment will be regenerated if you invoke BoB again.
    // If you don't know who BoB is, you can find him here: https://bitbucket.org/atlassianlabs/bob-the-builder-of-beans

    public Variation(@Nullable Long id, String variation) {
        this.id = id;
        this.variation = Objects.requireNonNull(variation);
    }

    // region Getters and setters -- generated by BoB the Builder of Beans
    public Optional<Long> getId() {
        return Optional.ofNullable(id);
    }

    public void setId(@Nullable Long id) {
        this.id = id;
    }

    public String getVariation() {
        return variation;
    }

    public void setVariation(String variation) {
        this.variation = Objects.requireNonNull(variation);
    }// endregion Getters and setters

    // region hashCode() and equals() -- generated by BoB the Builder of Beans
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Variation that = (Variation) o;

        return Objects.equals(this.getId(), that.getId()) && Objects.equals(this.getVariation(), that.getVariation());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getVariation());
    }// endregion hashCode() and equals()

    // region toString() -- generated by BoB the Builder of Beans
    @Override
    public String toString() {
        return new StringJoiner(", ", this.getClass().getSimpleName() + "{", "}")
                .add("id=" + getId())
                .add("variation=" + getVariation())
                .toString();
    }// endregion toString()
    // endregion Constructor, getters, setters, equals, hashCode, toString
}