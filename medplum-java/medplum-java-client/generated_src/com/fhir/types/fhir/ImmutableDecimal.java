package com.fhir.types.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link Decimal}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableDecimal.builder()}.
 */
@Generated(from = "Decimal", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
final class ImmutableDecimal implements Decimal {
  private final double value;

  private ImmutableDecimal(double value) {
    this.value = value;
  }

  /**
   * @return The value of the {@code value} attribute
   */
  @JsonProperty("value")
  @JsonValue
  @Override
  public double value() {
    return value;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Decimal#value() value} attribute.
   * A value strict bits equality used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for value
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableDecimal withValue(double value) {
    if (Double.doubleToLongBits(this.value) == Double.doubleToLongBits(value)) return this;
    return new ImmutableDecimal(value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableDecimal} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableDecimal
        && equalTo((ImmutableDecimal) another);
  }

  private boolean equalTo(ImmutableDecimal another) {
    return Double.doubleToLongBits(value) == Double.doubleToLongBits(another.value);
  }

  /**
   * Computes a hash code from attributes: {@code value}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Double.hashCode(value);
    return h;
  }

  /**
   * Prints the immutable value {@code Decimal} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "Decimal{"
        + "value=" + value
        + "}";
  }

  /**
   * @param jsonValue to construct object from
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableDecimal fromJson(double jsonValue) {
    ImmutableDecimal.Builder builder = ((ImmutableDecimal.Builder) ImmutableDecimal.builder());
    builder.value(jsonValue);
    return (ImmutableDecimal) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Decimal} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Decimal instance
   */
  public static Decimal copyOf(Decimal instance) {
    if (instance instanceof ImmutableDecimal) {
      return (ImmutableDecimal) instance;
    }
    return ((ImmutableDecimal.Builder) ImmutableDecimal.builder())
        .value(instance.value())
        .build();
  }

  /**
   * Creates a builder for {@link Decimal Decimal}.
   * <pre>
   * ImmutableDecimal.builder()
   *    .value(double) // required {@link Decimal#value() value}
   *    .build();
   * </pre>
   * @return A new Decimal builder
   */
  public static ValueBuildStage builder() {
    return new ImmutableDecimal.Builder();
  }

  /**
   * Builds instances of type {@link Decimal Decimal}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "Decimal", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements ValueBuildStage, BuildFinal {
    private static final long INIT_BIT_VALUE = 0x1L;
    private long initBits = 0x1L;

    private double value;

    private Builder() {
    }

    /**
     * Initializes the value for the {@link Decimal#value() value} attribute.
     * @param value The value for value 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("value")
    public final Builder value(double value) {
      checkNotIsSet(valueIsSet(), "value");
      this.value = value;
      initBits &= ~INIT_BIT_VALUE;
      return this;
    }

    /**
     * Builds a new {@link Decimal Decimal}.
     * @return An immutable instance of Decimal
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public Decimal build() {
      checkRequiredAttributes();
      return new ImmutableDecimal(value);
    }

    private boolean valueIsSet() {
      return (initBits & INIT_BIT_VALUE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of Decimal is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!valueIsSet()) attributes.add("value");
      return "Cannot build Decimal, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "Decimal", generator = "Immutables")
  public interface ValueBuildStage {
    /**
     * Initializes the value for the {@link Decimal#value() value} attribute.
     * @param value The value for value 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal value(double value);
  }

  @Generated(from = "Decimal", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Builds a new {@link Decimal Decimal}.
     * @return An immutable instance of Decimal
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    Decimal build();
  }
}
