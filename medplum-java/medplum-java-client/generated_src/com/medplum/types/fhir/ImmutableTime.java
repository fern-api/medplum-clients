package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link Time}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableTime.builder()}.
 */
@Generated(from = "Time", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
final class ImmutableTime implements Time {
  private final String value;

  private ImmutableTime(String value) {
    this.value = value;
  }

  /**
   * @return The value of the {@code value} attribute
   */
  @JsonProperty("value")
  @JsonValue
  @Override
  public String value() {
    return value;
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Time#value() value} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for value
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTime withValue(String value) {
    String newValue = Objects.requireNonNull(value, "value");
    if (this.value.equals(newValue)) return this;
    return new ImmutableTime(newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableTime} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableTime
        && equalTo((ImmutableTime) another);
  }

  private boolean equalTo(ImmutableTime another) {
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
   * Prints the immutable value {@code Time} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "Time{"
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
  static ImmutableTime fromJson(String jsonValue) {
    ImmutableTime.Builder builder = ((ImmutableTime.Builder) ImmutableTime.builder());
    builder.value(jsonValue);
    return (ImmutableTime) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Time} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Time instance
   */
  public static Time copyOf(Time instance) {
    if (instance instanceof ImmutableTime) {
      return (ImmutableTime) instance;
    }
    return ((ImmutableTime.Builder) ImmutableTime.builder())
        .value(instance.value())
        .build();
  }

  /**
   * Creates a builder for {@link Time Time}.
   * <pre>
   * ImmutableTime.builder()
   *    .value(String) // required {@link Time#value() value}
   *    .build();
   * </pre>
   * @return A new Time builder
   */
  public static ValueBuildStage builder() {
    return new ImmutableTime.Builder();
  }

  /**
   * Builds instances of type {@link Time Time}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "Time", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements ValueBuildStage, BuildFinal {
    private static final long INIT_BIT_VALUE = 0x1L;
    private long initBits = 0x1L;

    private @Nullable String value;

    private Builder() {
    }

    /**
     * Initializes the value for the {@link Time#value() value} attribute.
     * @param value The value for value 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("value")
    public final Builder value(String value) {
      checkNotIsSet(valueIsSet(), "value");
      this.value = Objects.requireNonNull(value, "value");
      initBits &= ~INIT_BIT_VALUE;
      return this;
    }

    /**
     * Builds a new {@link Time Time}.
     * @return An immutable instance of Time
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public Time build() {
      checkRequiredAttributes();
      return new ImmutableTime(value);
    }

    private boolean valueIsSet() {
      return (initBits & INIT_BIT_VALUE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of Time is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!valueIsSet()) attributes.add("value");
      return "Cannot build Time, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "Time", generator = "Immutables")
  public interface ValueBuildStage {
    /**
     * Initializes the value for the {@link Time#value() value} attribute.
     * @param value The value for value 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal value(String value);
  }

  @Generated(from = "Time", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Builds a new {@link Time Time}.
     * @return An immutable instance of Time
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    Time build();
  }
}