package com.fhir.types.fhir;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link UserConfiguration_Option}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableUserConfiguration_Option.builder()}.
 */
@Generated(from = "UserConfiguration_Option", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableUserConfiguration_Option implements UserConfiguration_Option {
  private final @Nullable Id id;
  private final @Nullable String valueString;
  private final @Nullable String valueCode;
  private final @Nullable Double valueDecimal;
  private final @Nullable Boolean valueBoolean;
  private final @Nullable Double valueInteger;

  private ImmutableUserConfiguration_Option(
      @Nullable Id id,
      @Nullable String valueString,
      @Nullable String valueCode,
      @Nullable Double valueDecimal,
      @Nullable Boolean valueBoolean,
      @Nullable Double valueInteger) {
    this.id = id;
    this.valueString = valueString;
    this.valueCode = valueCode;
    this.valueDecimal = valueDecimal;
    this.valueBoolean = valueBoolean;
    this.valueInteger = valueInteger;
  }

  /**
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public Optional<Id> id() {
    return Optional.ofNullable(id);
  }

  /**
   * @return The value of the {@code valueString} attribute
   */
  @JsonProperty("valueString")
  @Override
  public Optional<String> valueString() {
    return Optional.ofNullable(valueString);
  }

  /**
   * @return The value of the {@code valueCode} attribute
   */
  @JsonProperty("valueCode")
  @Override
  public Optional<String> valueCode() {
    return Optional.ofNullable(valueCode);
  }

  /**
   * @return The value of the {@code valueDecimal} attribute
   */
  @JsonProperty("valueDecimal")
  @Override
  public Optional<Double> valueDecimal() {
    return Optional.ofNullable(valueDecimal);
  }

  /**
   * @return The value of the {@code valueBoolean} attribute
   */
  @JsonProperty("valueBoolean")
  @Override
  public Optional<Boolean> valueBoolean() {
    return Optional.ofNullable(valueBoolean);
  }

  /**
   * @return The value of the {@code valueInteger} attribute
   */
  @JsonProperty("valueInteger")
  @Override
  public Optional<Double> valueInteger() {
    return Optional.ofNullable(valueInteger);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link UserConfiguration_Option#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableUserConfiguration_Option withId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableUserConfiguration_Option(
        newValue,
        this.valueString,
        this.valueCode,
        this.valueDecimal,
        this.valueBoolean,
        this.valueInteger);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link UserConfiguration_Option#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableUserConfiguration_Option withId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableUserConfiguration_Option(
        value,
        this.valueString,
        this.valueCode,
        this.valueDecimal,
        this.valueBoolean,
        this.valueInteger);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link UserConfiguration_Option#valueString() valueString} attribute.
   * @param value The value for valueString
   * @return A modified copy of {@code this} object
   */
  public final ImmutableUserConfiguration_Option withValueString(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "valueString");
    if (Objects.equals(this.valueString, newValue)) return this;
    return new ImmutableUserConfiguration_Option(this.id, newValue, this.valueCode, this.valueDecimal, this.valueBoolean, this.valueInteger);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link UserConfiguration_Option#valueString() valueString} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueString
   * @return A modified copy of {@code this} object
   */
  public final ImmutableUserConfiguration_Option withValueString(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.valueString, value)) return this;
    return new ImmutableUserConfiguration_Option(this.id, value, this.valueCode, this.valueDecimal, this.valueBoolean, this.valueInteger);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link UserConfiguration_Option#valueCode() valueCode} attribute.
   * @param value The value for valueCode
   * @return A modified copy of {@code this} object
   */
  public final ImmutableUserConfiguration_Option withValueCode(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "valueCode");
    if (Objects.equals(this.valueCode, newValue)) return this;
    return new ImmutableUserConfiguration_Option(this.id, this.valueString, newValue, this.valueDecimal, this.valueBoolean, this.valueInteger);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link UserConfiguration_Option#valueCode() valueCode} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueCode
   * @return A modified copy of {@code this} object
   */
  public final ImmutableUserConfiguration_Option withValueCode(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.valueCode, value)) return this;
    return new ImmutableUserConfiguration_Option(this.id, this.valueString, value, this.valueDecimal, this.valueBoolean, this.valueInteger);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link UserConfiguration_Option#valueDecimal() valueDecimal} attribute.
   * @param value The value for valueDecimal
   * @return A modified copy of {@code this} object
   */
  public final ImmutableUserConfiguration_Option withValueDecimal(double value) {
    @Nullable Double newValue = value;
    if (Objects.equals(this.valueDecimal, newValue)) return this;
    return new ImmutableUserConfiguration_Option(this.id, this.valueString, this.valueCode, newValue, this.valueBoolean, this.valueInteger);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link UserConfiguration_Option#valueDecimal() valueDecimal} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueDecimal
   * @return A modified copy of {@code this} object
   */
  public final ImmutableUserConfiguration_Option withValueDecimal(Optional<Double> optional) {
    @Nullable Double value = optional.orElse(null);
    if (Objects.equals(this.valueDecimal, value)) return this;
    return new ImmutableUserConfiguration_Option(this.id, this.valueString, this.valueCode, value, this.valueBoolean, this.valueInteger);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link UserConfiguration_Option#valueBoolean() valueBoolean} attribute.
   * @param value The value for valueBoolean
   * @return A modified copy of {@code this} object
   */
  public final ImmutableUserConfiguration_Option withValueBoolean(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this.valueBoolean, newValue)) return this;
    return new ImmutableUserConfiguration_Option(this.id, this.valueString, this.valueCode, this.valueDecimal, newValue, this.valueInteger);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link UserConfiguration_Option#valueBoolean() valueBoolean} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueBoolean
   * @return A modified copy of {@code this} object
   */
  public final ImmutableUserConfiguration_Option withValueBoolean(Optional<Boolean> optional) {
    @Nullable Boolean value = optional.orElse(null);
    if (Objects.equals(this.valueBoolean, value)) return this;
    return new ImmutableUserConfiguration_Option(this.id, this.valueString, this.valueCode, this.valueDecimal, value, this.valueInteger);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link UserConfiguration_Option#valueInteger() valueInteger} attribute.
   * @param value The value for valueInteger
   * @return A modified copy of {@code this} object
   */
  public final ImmutableUserConfiguration_Option withValueInteger(double value) {
    @Nullable Double newValue = value;
    if (Objects.equals(this.valueInteger, newValue)) return this;
    return new ImmutableUserConfiguration_Option(this.id, this.valueString, this.valueCode, this.valueDecimal, this.valueBoolean, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link UserConfiguration_Option#valueInteger() valueInteger} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueInteger
   * @return A modified copy of {@code this} object
   */
  public final ImmutableUserConfiguration_Option withValueInteger(Optional<Double> optional) {
    @Nullable Double value = optional.orElse(null);
    if (Objects.equals(this.valueInteger, value)) return this;
    return new ImmutableUserConfiguration_Option(this.id, this.valueString, this.valueCode, this.valueDecimal, this.valueBoolean, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableUserConfiguration_Option} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableUserConfiguration_Option
        && equalTo((ImmutableUserConfiguration_Option) another);
  }

  private boolean equalTo(ImmutableUserConfiguration_Option another) {
    return Objects.equals(id, another.id)
        && Objects.equals(valueString, another.valueString)
        && Objects.equals(valueCode, another.valueCode)
        && Objects.equals(valueDecimal, another.valueDecimal)
        && Objects.equals(valueBoolean, another.valueBoolean)
        && Objects.equals(valueInteger, another.valueInteger);
  }

  /**
   * Computes a hash code from attributes: {@code id}, {@code valueString}, {@code valueCode}, {@code valueDecimal}, {@code valueBoolean}, {@code valueInteger}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(valueString);
    h += (h << 5) + Objects.hashCode(valueCode);
    h += (h << 5) + Objects.hashCode(valueDecimal);
    h += (h << 5) + Objects.hashCode(valueBoolean);
    h += (h << 5) + Objects.hashCode(valueInteger);
    return h;
  }

  /**
   * Prints the immutable value {@code UserConfiguration_Option} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("UserConfiguration_Option{");
    if (id != null) {
      builder.append("id=").append(id);
    }
    if (valueString != null) {
      if (builder.length() > 25) builder.append(", ");
      builder.append("valueString=").append(valueString);
    }
    if (valueCode != null) {
      if (builder.length() > 25) builder.append(", ");
      builder.append("valueCode=").append(valueCode);
    }
    if (valueDecimal != null) {
      if (builder.length() > 25) builder.append(", ");
      builder.append("valueDecimal=").append(valueDecimal);
    }
    if (valueBoolean != null) {
      if (builder.length() > 25) builder.append(", ");
      builder.append("valueBoolean=").append(valueBoolean);
    }
    if (valueInteger != null) {
      if (builder.length() > 25) builder.append(", ");
      builder.append("valueInteger=").append(valueInteger);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "UserConfiguration_Option", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements UserConfiguration_Option {
    @Nullable Optional<Id> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<String> valueString = Optional.empty();
    boolean valueStringIsSet;
    @Nullable Optional<String> valueCode = Optional.empty();
    boolean valueCodeIsSet;
    @Nullable Optional<Double> valueDecimal = Optional.empty();
    boolean valueDecimalIsSet;
    @Nullable Optional<Boolean> valueBoolean = Optional.empty();
    boolean valueBooleanIsSet;
    @Nullable Optional<Double> valueInteger = Optional.empty();
    boolean valueIntegerIsSet;
    @JsonProperty("id")
    public void setId(Optional<Id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("valueString")
    public void setValueString(Optional<String> valueString) {
      this.valueString = valueString;
      this.valueStringIsSet = true;
    }
    @JsonProperty("valueCode")
    public void setValueCode(Optional<String> valueCode) {
      this.valueCode = valueCode;
      this.valueCodeIsSet = true;
    }
    @JsonProperty("valueDecimal")
    public void setValueDecimal(Optional<Double> valueDecimal) {
      this.valueDecimal = valueDecimal;
      this.valueDecimalIsSet = true;
    }
    @JsonProperty("valueBoolean")
    public void setValueBoolean(Optional<Boolean> valueBoolean) {
      this.valueBoolean = valueBoolean;
      this.valueBooleanIsSet = true;
    }
    @JsonProperty("valueInteger")
    public void setValueInteger(Optional<Double> valueInteger) {
      this.valueInteger = valueInteger;
      this.valueIntegerIsSet = true;
    }
    @Override
    public Optional<Id> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> valueString() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> valueCode() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Double> valueDecimal() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Boolean> valueBoolean() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Double> valueInteger() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableUserConfiguration_Option fromJson(Json json) {
    ImmutableUserConfiguration_Option.Builder builder = ImmutableUserConfiguration_Option.builder();
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.valueStringIsSet) {
      builder.valueString(json.valueString);
    }
    if (json.valueCodeIsSet) {
      builder.valueCode(json.valueCode);
    }
    if (json.valueDecimalIsSet) {
      builder.valueDecimal(json.valueDecimal);
    }
    if (json.valueBooleanIsSet) {
      builder.valueBoolean(json.valueBoolean);
    }
    if (json.valueIntegerIsSet) {
      builder.valueInteger(json.valueInteger);
    }
    return (ImmutableUserConfiguration_Option) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link UserConfiguration_Option} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable UserConfiguration_Option instance
   */
  public static UserConfiguration_Option copyOf(UserConfiguration_Option instance) {
    if (instance instanceof ImmutableUserConfiguration_Option) {
      return (ImmutableUserConfiguration_Option) instance;
    }
    return ImmutableUserConfiguration_Option.builder()
        .id(instance.id())
        .valueString(instance.valueString())
        .valueCode(instance.valueCode())
        .valueDecimal(instance.valueDecimal())
        .valueBoolean(instance.valueBoolean())
        .valueInteger(instance.valueInteger())
        .build();
  }

  /**
   * Creates a builder for {@link UserConfiguration_Option UserConfiguration_Option}.
   * <pre>
   * ImmutableUserConfiguration_Option.builder()
   *    .id(com.fhir.types.fhir.Id) // optional {@link UserConfiguration_Option#id() id}
   *    .valueString(String) // optional {@link UserConfiguration_Option#valueString() valueString}
   *    .valueCode(String) // optional {@link UserConfiguration_Option#valueCode() valueCode}
   *    .valueDecimal(Double) // optional {@link UserConfiguration_Option#valueDecimal() valueDecimal}
   *    .valueBoolean(Boolean) // optional {@link UserConfiguration_Option#valueBoolean() valueBoolean}
   *    .valueInteger(Double) // optional {@link UserConfiguration_Option#valueInteger() valueInteger}
   *    .build();
   * </pre>
   * @return A new UserConfiguration_Option builder
   */
  public static ImmutableUserConfiguration_Option.Builder builder() {
    return new ImmutableUserConfiguration_Option.Builder();
  }

  /**
   * Builds instances of type {@link UserConfiguration_Option UserConfiguration_Option}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "UserConfiguration_Option", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_ID = 0x1L;
    private static final long OPT_BIT_VALUE_STRING = 0x2L;
    private static final long OPT_BIT_VALUE_CODE = 0x4L;
    private static final long OPT_BIT_VALUE_DECIMAL = 0x8L;
    private static final long OPT_BIT_VALUE_BOOLEAN = 0x10L;
    private static final long OPT_BIT_VALUE_INTEGER = 0x20L;
    private long optBits;

    private @Nullable Id id;
    private @Nullable String valueString;
    private @Nullable String valueCode;
    private @Nullable Double valueDecimal;
    private @Nullable Boolean valueBoolean;
    private @Nullable Double valueInteger;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link UserConfiguration_Option#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    public final Builder id(Id id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = Objects.requireNonNull(id, "id");
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link UserConfiguration_Option#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("id")
    public final Builder id(Optional<? extends Id> id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = id.orElse(null);
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link UserConfiguration_Option#valueString() valueString} to valueString.
     * @param valueString The value for valueString
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueString(String valueString) {
      checkNotIsSet(valueStringIsSet(), "valueString");
      this.valueString = Objects.requireNonNull(valueString, "valueString");
      optBits |= OPT_BIT_VALUE_STRING;
      return this;
    }

    /**
     * Initializes the optional value {@link UserConfiguration_Option#valueString() valueString} to valueString.
     * @param valueString The value for valueString
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("valueString")
    public final Builder valueString(Optional<String> valueString) {
      checkNotIsSet(valueStringIsSet(), "valueString");
      this.valueString = valueString.orElse(null);
      optBits |= OPT_BIT_VALUE_STRING;
      return this;
    }

    /**
     * Initializes the optional value {@link UserConfiguration_Option#valueCode() valueCode} to valueCode.
     * @param valueCode The value for valueCode
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueCode(String valueCode) {
      checkNotIsSet(valueCodeIsSet(), "valueCode");
      this.valueCode = Objects.requireNonNull(valueCode, "valueCode");
      optBits |= OPT_BIT_VALUE_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link UserConfiguration_Option#valueCode() valueCode} to valueCode.
     * @param valueCode The value for valueCode
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("valueCode")
    public final Builder valueCode(Optional<String> valueCode) {
      checkNotIsSet(valueCodeIsSet(), "valueCode");
      this.valueCode = valueCode.orElse(null);
      optBits |= OPT_BIT_VALUE_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link UserConfiguration_Option#valueDecimal() valueDecimal} to valueDecimal.
     * @param valueDecimal The value for valueDecimal
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueDecimal(double valueDecimal) {
      checkNotIsSet(valueDecimalIsSet(), "valueDecimal");
      this.valueDecimal = valueDecimal;
      optBits |= OPT_BIT_VALUE_DECIMAL;
      return this;
    }

    /**
     * Initializes the optional value {@link UserConfiguration_Option#valueDecimal() valueDecimal} to valueDecimal.
     * @param valueDecimal The value for valueDecimal
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("valueDecimal")
    public final Builder valueDecimal(Optional<Double> valueDecimal) {
      checkNotIsSet(valueDecimalIsSet(), "valueDecimal");
      this.valueDecimal = valueDecimal.orElse(null);
      optBits |= OPT_BIT_VALUE_DECIMAL;
      return this;
    }

    /**
     * Initializes the optional value {@link UserConfiguration_Option#valueBoolean() valueBoolean} to valueBoolean.
     * @param valueBoolean The value for valueBoolean
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueBoolean(boolean valueBoolean) {
      checkNotIsSet(valueBooleanIsSet(), "valueBoolean");
      this.valueBoolean = valueBoolean;
      optBits |= OPT_BIT_VALUE_BOOLEAN;
      return this;
    }

    /**
     * Initializes the optional value {@link UserConfiguration_Option#valueBoolean() valueBoolean} to valueBoolean.
     * @param valueBoolean The value for valueBoolean
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("valueBoolean")
    public final Builder valueBoolean(Optional<Boolean> valueBoolean) {
      checkNotIsSet(valueBooleanIsSet(), "valueBoolean");
      this.valueBoolean = valueBoolean.orElse(null);
      optBits |= OPT_BIT_VALUE_BOOLEAN;
      return this;
    }

    /**
     * Initializes the optional value {@link UserConfiguration_Option#valueInteger() valueInteger} to valueInteger.
     * @param valueInteger The value for valueInteger
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueInteger(double valueInteger) {
      checkNotIsSet(valueIntegerIsSet(), "valueInteger");
      this.valueInteger = valueInteger;
      optBits |= OPT_BIT_VALUE_INTEGER;
      return this;
    }

    /**
     * Initializes the optional value {@link UserConfiguration_Option#valueInteger() valueInteger} to valueInteger.
     * @param valueInteger The value for valueInteger
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("valueInteger")
    public final Builder valueInteger(Optional<Double> valueInteger) {
      checkNotIsSet(valueIntegerIsSet(), "valueInteger");
      this.valueInteger = valueInteger.orElse(null);
      optBits |= OPT_BIT_VALUE_INTEGER;
      return this;
    }

    /**
     * Builds a new {@link UserConfiguration_Option UserConfiguration_Option}.
     * @return An immutable instance of UserConfiguration_Option
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public UserConfiguration_Option build() {
      return new ImmutableUserConfiguration_Option(id, valueString, valueCode, valueDecimal, valueBoolean, valueInteger);
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean valueStringIsSet() {
      return (optBits & OPT_BIT_VALUE_STRING) != 0;
    }

    private boolean valueCodeIsSet() {
      return (optBits & OPT_BIT_VALUE_CODE) != 0;
    }

    private boolean valueDecimalIsSet() {
      return (optBits & OPT_BIT_VALUE_DECIMAL) != 0;
    }

    private boolean valueBooleanIsSet() {
      return (optBits & OPT_BIT_VALUE_BOOLEAN) != 0;
    }

    private boolean valueIntegerIsSet() {
      return (optBits & OPT_BIT_VALUE_INTEGER) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of UserConfiguration_Option is strict, attribute is already set: ".concat(name));
    }
  }
}
