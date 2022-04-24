//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link unsignedInt}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableUnsignedInt.builder()}.
 */
@org.immutables.value.Generated(from = "unsignedInt", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
final class ImmutableUnsignedInt implements com.fhir.unsignedInt {
  private final int value;

  private ImmutableUnsignedInt(int value) {
    this.value = value;
  }

  /**
   * @return The value of the {@code value} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("value")
  @com.fasterxml.jackson.annotation.JsonValue
  @Override
  public int value() {
    return value;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link unsignedInt#value() value} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for value
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableUnsignedInt withValue(int value) {
    if (this.value == value) return this;
    return new ImmutableUnsignedInt(value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableUnsignedInt} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableUnsignedInt
        && equalTo((ImmutableUnsignedInt) another);
  }

  private boolean equalTo(ImmutableUnsignedInt another) {
    return value == another.value;
  }

  /**
   * Computes a hash code from attributes: {@code value}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + value;
    return h;
  }

  /**
   * Prints the immutable value {@code unsignedInt} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "unsignedInt{"
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
  static ImmutableUnsignedInt fromJson(int jsonValue) {
    ImmutableUnsignedInt.Builder builder = ((ImmutableUnsignedInt.Builder) ImmutableUnsignedInt.builder());
    builder.value(jsonValue);
    return (ImmutableUnsignedInt) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link unsignedInt} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable unsignedInt instance
   */
  public static unsignedInt copyOf(unsignedInt instance) {
    if (instance instanceof ImmutableUnsignedInt) {
      return (ImmutableUnsignedInt) instance;
    }
    return ((ImmutableUnsignedInt.Builder) ImmutableUnsignedInt.builder())
        .value(instance.value())
        .build();
  }

  /**
   * Creates a builder for {@link unsignedInt unsignedInt}.
   * <pre>
   * ImmutableUnsignedInt.builder()
   *    .value(int) // required {@link unsignedInt#value() value}
   *    .build();
   * </pre>
   * @return A new unsignedInt builder
   */
  public static ValueBuildStage builder() {
    return new ImmutableUnsignedInt.Builder();
  }

  /**
   * Builds instances of type {@link unsignedInt unsignedInt}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "unsignedInt", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements ValueBuildStage, BuildFinal {
    private static final long INIT_BIT_VALUE = 0x1L;
    private long initBits = 0x1L;

    private int value;

    private Builder() {
    }

    /**
     * Initializes the value for the {@link unsignedInt#value() value} attribute.
     * @param value The value for value 
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    public final Builder value(int value) {
      checkNotIsSet(valueIsSet(), "value");
      this.value = value;
      initBits &= ~INIT_BIT_VALUE;
      return this;
    }

    /**
     * Builds a new {@link unsignedInt unsignedInt}.
     * @return An immutable instance of unsignedInt
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.unsignedInt build() {
      checkRequiredAttributes();
      return new ImmutableUnsignedInt(value);
    }

    private boolean valueIsSet() {
      return (initBits & INIT_BIT_VALUE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of unsignedInt is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!valueIsSet()) attributes.add("value");
      return "Cannot build unsignedInt, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "unsignedInt", generator = "Immutables")
  public interface ValueBuildStage {
    /**
     * Initializes the value for the {@link unsignedInt#value() value} attribute.
     * @param value The value for value 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal value(int value);
  }

  @org.immutables.value.Generated(from = "unsignedInt", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Builds a new {@link unsignedInt unsignedInt}.
     * @return An immutable instance of unsignedInt
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    unsignedInt build();
  }
}
