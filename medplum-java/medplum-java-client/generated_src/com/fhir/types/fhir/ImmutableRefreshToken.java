package com.fhir.types.fhir;

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
 * Immutable implementation of {@link RefreshToken}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableRefreshToken.builder()}.
 */
@Generated(from = "RefreshToken", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
final class ImmutableRefreshToken implements RefreshToken {
  private final String value;

  private ImmutableRefreshToken(String value) {
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
   * Copy the current immutable object by setting a value for the {@link RefreshToken#value() value} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for value
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableRefreshToken withValue(String value) {
    String newValue = Objects.requireNonNull(value, "value");
    if (this.value.equals(newValue)) return this;
    return new ImmutableRefreshToken(newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableRefreshToken} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableRefreshToken
        && equalTo((ImmutableRefreshToken) another);
  }

  private boolean equalTo(ImmutableRefreshToken another) {
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
   * Prints the immutable value {@code RefreshToken} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    return "RefreshToken{"
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
  static ImmutableRefreshToken fromJson(String jsonValue) {
    ImmutableRefreshToken.Builder builder = ((ImmutableRefreshToken.Builder) ImmutableRefreshToken.builder());
    builder.value(jsonValue);
    return (ImmutableRefreshToken) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link RefreshToken} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable RefreshToken instance
   */
  public static RefreshToken copyOf(RefreshToken instance) {
    if (instance instanceof ImmutableRefreshToken) {
      return (ImmutableRefreshToken) instance;
    }
    return ((ImmutableRefreshToken.Builder) ImmutableRefreshToken.builder())
        .value(instance.value())
        .build();
  }

  /**
   * Creates a builder for {@link RefreshToken RefreshToken}.
   * <pre>
   * ImmutableRefreshToken.builder()
   *    .value(String) // required {@link RefreshToken#value() value}
   *    .build();
   * </pre>
   * @return A new RefreshToken builder
   */
  public static ValueBuildStage builder() {
    return new ImmutableRefreshToken.Builder();
  }

  /**
   * Builds instances of type {@link RefreshToken RefreshToken}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "RefreshToken", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements ValueBuildStage, BuildFinal {
    private static final long INIT_BIT_VALUE = 0x1L;
    private long initBits = 0x1L;

    private @Nullable String value;

    private Builder() {
    }

    /**
     * Initializes the value for the {@link RefreshToken#value() value} attribute.
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
     * Builds a new {@link RefreshToken RefreshToken}.
     * @return An immutable instance of RefreshToken
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public RefreshToken build() {
      checkRequiredAttributes();
      return new ImmutableRefreshToken(value);
    }

    private boolean valueIsSet() {
      return (initBits & INIT_BIT_VALUE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of RefreshToken is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!valueIsSet()) attributes.add("value");
      return "Cannot build RefreshToken, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "RefreshToken", generator = "Immutables")
  public interface ValueBuildStage {
    /**
     * Initializes the value for the {@link RefreshToken#value() value} attribute.
     * @param value The value for value 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal value(String value);
  }

  @Generated(from = "RefreshToken", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Builds a new {@link RefreshToken RefreshToken}.
     * @return An immutable instance of RefreshToken
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    RefreshToken build();
  }
}
