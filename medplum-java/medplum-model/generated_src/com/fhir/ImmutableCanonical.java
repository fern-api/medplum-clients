//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link canonical}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableCanonical.builder()}.
 */
@org.immutables.value.Generated(from = "canonical", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
final class ImmutableCanonical implements com.fhir.canonical {
  private final java.lang.String value;

  private ImmutableCanonical(java.lang.String value) {
    this.value = value;
  }

  /**
   * @return The value of the {@code value} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("value")
  @com.fasterxml.jackson.annotation.JsonValue
  @Override
  public java.lang.String value() {
    return value;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link canonical#value() value} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for value
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCanonical withValue(java.lang.String value) {
    java.lang.String newValue = java.util.Objects.requireNonNull(value, "value");
    if (this.value.equals(newValue)) return this;
    return new ImmutableCanonical(newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableCanonical} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableCanonical
        && equalTo((ImmutableCanonical) another);
  }

  private boolean equalTo(ImmutableCanonical another) {
    return value.equals(another.value);
  }

  /**
   * Computes a hash code from attributes: {@code value}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + value.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code canonical} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "canonical{"
        + "value=" + value
        + "}";
  }

  /**
   * @param jsonValue to construct object from
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableCanonical fromJson(java.lang.String jsonValue) {
    ImmutableCanonical.Builder builder = ((ImmutableCanonical.Builder) ImmutableCanonical.builder());
    builder.value(jsonValue);
    return (ImmutableCanonical) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link canonical} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable canonical instance
   */
  public static canonical copyOf(canonical instance) {
    if (instance instanceof ImmutableCanonical) {
      return (ImmutableCanonical) instance;
    }
    return ((ImmutableCanonical.Builder) ImmutableCanonical.builder())
        .value(instance.value())
        .build();
  }

  /**
   * Creates a builder for {@link canonical canonical}.
   * <pre>
   * ImmutableCanonical.builder()
   *    .value(String) // required {@link canonical#value() value}
   *    .build();
   * </pre>
   * @return A new canonical builder
   */
  public static ValueBuildStage builder() {
    return new ImmutableCanonical.Builder();
  }

  /**
   * Builds instances of type {@link canonical canonical}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "canonical", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements ValueBuildStage, BuildFinal {
    private static final long INIT_BIT_VALUE = 0x1L;
    private long initBits = 0x1L;

    private @javax.annotation.Nullable java.lang.String value;

    private Builder() {
    }

    /**
     * Initializes the value for the {@link canonical#value() value} attribute.
     * @param value The value for value 
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    public final Builder value(java.lang.String value) {
      checkNotIsSet(valueIsSet(), "value");
      this.value = java.util.Objects.requireNonNull(value, "value");
      initBits &= ~INIT_BIT_VALUE;
      return this;
    }

    /**
     * Builds a new {@link canonical canonical}.
     * @return An immutable instance of canonical
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.canonical build() {
      checkRequiredAttributes();
      return new ImmutableCanonical(value);
    }

    private boolean valueIsSet() {
      return (initBits & INIT_BIT_VALUE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of canonical is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!valueIsSet()) attributes.add("value");
      return "Cannot build canonical, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "canonical", generator = "Immutables")
  public interface ValueBuildStage {
    /**
     * Initializes the value for the {@link canonical#value() value} attribute.
     * @param value The value for value 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal value(java.lang.String value);
  }

  @org.immutables.value.Generated(from = "canonical", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Builds a new {@link canonical canonical}.
     * @return An immutable instance of canonical
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    canonical build();
  }
}
