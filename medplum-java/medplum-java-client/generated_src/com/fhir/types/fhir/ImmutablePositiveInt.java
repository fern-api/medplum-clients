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
 * Immutable implementation of {@link PositiveInt}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutablePositiveInt.builder()}.
 */
@Generated(from = "PositiveInt", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
final class ImmutablePositiveInt implements PositiveInt {
  private final int value;

  private ImmutablePositiveInt(int value) {
    this.value = value;
  }

  /**
   * @return The value of the {@code value} attribute
   */
  @JsonProperty("value")
  @JsonValue
  @Override
  public int value() {
    return value;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link PositiveInt#value() value} attribute.
   * A value equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for value
   * @return A modified copy of the {@code this} object
   */
  public final ImmutablePositiveInt withValue(int value) {
    if (this.value == value) return this;
    return new ImmutablePositiveInt(value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutablePositiveInt} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutablePositiveInt
        && equalTo((ImmutablePositiveInt) another);
  }

  private boolean equalTo(ImmutablePositiveInt another) {
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
   * Prints the immutable value {@code PositiveInt} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "PositiveInt{"
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
  static ImmutablePositiveInt fromJson(int jsonValue) {
    ImmutablePositiveInt.Builder builder = ((ImmutablePositiveInt.Builder) ImmutablePositiveInt.builder());
    builder.value(jsonValue);
    return (ImmutablePositiveInt) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link PositiveInt} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable PositiveInt instance
   */
  public static PositiveInt copyOf(PositiveInt instance) {
    if (instance instanceof ImmutablePositiveInt) {
      return (ImmutablePositiveInt) instance;
    }
    return ((ImmutablePositiveInt.Builder) ImmutablePositiveInt.builder())
        .value(instance.value())
        .build();
  }

  /**
   * Creates a builder for {@link PositiveInt PositiveInt}.
   * <pre>
   * ImmutablePositiveInt.builder()
   *    .value(int) // required {@link PositiveInt#value() value}
   *    .build();
   * </pre>
   * @return A new PositiveInt builder
   */
  public static ValueBuildStage builder() {
    return new ImmutablePositiveInt.Builder();
  }

  /**
   * Builds instances of type {@link PositiveInt PositiveInt}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "PositiveInt", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements ValueBuildStage, BuildFinal {
    private static final long INIT_BIT_VALUE = 0x1L;
    private long initBits = 0x1L;

    private int value;

    private Builder() {
    }

    /**
     * Initializes the value for the {@link PositiveInt#value() value} attribute.
     * @param value The value for value 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("value")
    public final Builder value(int value) {
      checkNotIsSet(valueIsSet(), "value");
      this.value = value;
      initBits &= ~INIT_BIT_VALUE;
      return this;
    }

    /**
     * Builds a new {@link PositiveInt PositiveInt}.
     * @return An immutable instance of PositiveInt
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public PositiveInt build() {
      checkRequiredAttributes();
      return new ImmutablePositiveInt(value);
    }

    private boolean valueIsSet() {
      return (initBits & INIT_BIT_VALUE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of PositiveInt is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!valueIsSet()) attributes.add("value");
      return "Cannot build PositiveInt, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "PositiveInt", generator = "Immutables")
  public interface ValueBuildStage {
    /**
     * Initializes the value for the {@link PositiveInt#value() value} attribute.
     * @param value The value for value 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal value(int value);
  }

  @Generated(from = "PositiveInt", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Builds a new {@link PositiveInt PositiveInt}.
     * @return An immutable instance of PositiveInt
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    PositiveInt build();
  }
}
