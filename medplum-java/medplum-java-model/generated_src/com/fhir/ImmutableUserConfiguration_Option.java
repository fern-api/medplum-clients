//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link UserConfiguration_Option}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableUserConfiguration_Option.builder()}.
 */
@org.immutables.value.Generated(from = "UserConfiguration_Option", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableUserConfiguration_Option implements com.fhir.UserConfiguration_Option {
  private final @javax.annotation.Nullable java.lang.String valueCode;
  private final @javax.annotation.Nullable java.lang.Double valueInteger;
  private final @javax.annotation.Nullable java.lang.String valueString;
  private final @javax.annotation.Nullable java.lang.Boolean valueBoolean;
  private final @javax.annotation.Nullable com.fhir.id id;
  private final @javax.annotation.Nullable java.lang.Double valueDecimal;

  private ImmutableUserConfiguration_Option(
      @javax.annotation.Nullable java.lang.String valueCode,
      @javax.annotation.Nullable java.lang.Double valueInteger,
      @javax.annotation.Nullable java.lang.String valueString,
      @javax.annotation.Nullable java.lang.Boolean valueBoolean,
      @javax.annotation.Nullable com.fhir.id id,
      @javax.annotation.Nullable java.lang.Double valueDecimal) {
    this.valueCode = valueCode;
    this.valueInteger = valueInteger;
    this.valueString = valueString;
    this.valueBoolean = valueBoolean;
    this.id = id;
    this.valueDecimal = valueDecimal;
  }

  /**
   * @return The value of the {@code valueCode} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("valueCode")
  @Override
  public java.util.Optional<java.lang.String> valueCode() {
    return java.util.Optional.ofNullable(valueCode);
  }

  /**
   * @return The value of the {@code valueInteger} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("valueInteger")
  @Override
  public java.util.Optional<java.lang.Double> valueInteger() {
    return java.util.Optional.ofNullable(valueInteger);
  }

  /**
   * @return The value of the {@code valueString} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("valueString")
  @Override
  public java.util.Optional<java.lang.String> valueString() {
    return java.util.Optional.ofNullable(valueString);
  }

  /**
   * @return The value of the {@code valueBoolean} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("valueBoolean")
  @Override
  public java.util.Optional<java.lang.Boolean> valueBoolean() {
    return java.util.Optional.ofNullable(valueBoolean);
  }

  /**
   * @return The value of the {@code id} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("id")
  @Override
  public java.util.Optional<com.fhir.id> id() {
    return java.util.Optional.ofNullable(id);
  }

  /**
   * @return The value of the {@code valueDecimal} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("valueDecimal")
  @Override
  public java.util.Optional<java.lang.Double> valueDecimal() {
    return java.util.Optional.ofNullable(valueDecimal);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link UserConfiguration_Option#valueCode() valueCode} attribute.
   * @param value The value for valueCode
   * @return A modified copy of {@code this} object
   */
  public final ImmutableUserConfiguration_Option withValueCode(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "valueCode");
    if (java.util.Objects.equals(this.valueCode, newValue)) return this;
    return new ImmutableUserConfiguration_Option(newValue, this.valueInteger, this.valueString, this.valueBoolean, this.id, this.valueDecimal);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link UserConfiguration_Option#valueCode() valueCode} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueCode
   * @return A modified copy of {@code this} object
   */
  public final ImmutableUserConfiguration_Option withValueCode(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.valueCode, value)) return this;
    return new ImmutableUserConfiguration_Option(value, this.valueInteger, this.valueString, this.valueBoolean, this.id, this.valueDecimal);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link UserConfiguration_Option#valueInteger() valueInteger} attribute.
   * @param value The value for valueInteger
   * @return A modified copy of {@code this} object
   */
  public final ImmutableUserConfiguration_Option withValueInteger(double value) {
    @javax.annotation.Nullable java.lang.Double newValue = value;
    if (java.util.Objects.equals(this.valueInteger, newValue)) return this;
    return new ImmutableUserConfiguration_Option(this.valueCode, newValue, this.valueString, this.valueBoolean, this.id, this.valueDecimal);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link UserConfiguration_Option#valueInteger() valueInteger} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueInteger
   * @return A modified copy of {@code this} object
   */
  public final ImmutableUserConfiguration_Option withValueInteger(java.util.Optional<java.lang.Double> optional) {
    @javax.annotation.Nullable java.lang.Double value = optional.orElse(null);
    if (java.util.Objects.equals(this.valueInteger, value)) return this;
    return new ImmutableUserConfiguration_Option(this.valueCode, value, this.valueString, this.valueBoolean, this.id, this.valueDecimal);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link UserConfiguration_Option#valueString() valueString} attribute.
   * @param value The value for valueString
   * @return A modified copy of {@code this} object
   */
  public final ImmutableUserConfiguration_Option withValueString(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "valueString");
    if (java.util.Objects.equals(this.valueString, newValue)) return this;
    return new ImmutableUserConfiguration_Option(this.valueCode, this.valueInteger, newValue, this.valueBoolean, this.id, this.valueDecimal);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link UserConfiguration_Option#valueString() valueString} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueString
   * @return A modified copy of {@code this} object
   */
  public final ImmutableUserConfiguration_Option withValueString(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.valueString, value)) return this;
    return new ImmutableUserConfiguration_Option(this.valueCode, this.valueInteger, value, this.valueBoolean, this.id, this.valueDecimal);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link UserConfiguration_Option#valueBoolean() valueBoolean} attribute.
   * @param value The value for valueBoolean
   * @return A modified copy of {@code this} object
   */
  public final ImmutableUserConfiguration_Option withValueBoolean(boolean value) {
    @javax.annotation.Nullable java.lang.Boolean newValue = value;
    if (java.util.Objects.equals(this.valueBoolean, newValue)) return this;
    return new ImmutableUserConfiguration_Option(this.valueCode, this.valueInteger, this.valueString, newValue, this.id, this.valueDecimal);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link UserConfiguration_Option#valueBoolean() valueBoolean} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueBoolean
   * @return A modified copy of {@code this} object
   */
  public final ImmutableUserConfiguration_Option withValueBoolean(java.util.Optional<java.lang.Boolean> optional) {
    @javax.annotation.Nullable java.lang.Boolean value = optional.orElse(null);
    if (java.util.Objects.equals(this.valueBoolean, value)) return this;
    return new ImmutableUserConfiguration_Option(this.valueCode, this.valueInteger, this.valueString, value, this.id, this.valueDecimal);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link UserConfiguration_Option#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableUserConfiguration_Option withId(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableUserConfiguration_Option(
        this.valueCode,
        this.valueInteger,
        this.valueString,
        this.valueBoolean,
        newValue,
        this.valueDecimal);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link UserConfiguration_Option#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableUserConfiguration_Option withId(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableUserConfiguration_Option(
        this.valueCode,
        this.valueInteger,
        this.valueString,
        this.valueBoolean,
        value,
        this.valueDecimal);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link UserConfiguration_Option#valueDecimal() valueDecimal} attribute.
   * @param value The value for valueDecimal
   * @return A modified copy of {@code this} object
   */
  public final ImmutableUserConfiguration_Option withValueDecimal(double value) {
    @javax.annotation.Nullable java.lang.Double newValue = value;
    if (java.util.Objects.equals(this.valueDecimal, newValue)) return this;
    return new ImmutableUserConfiguration_Option(this.valueCode, this.valueInteger, this.valueString, this.valueBoolean, this.id, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link UserConfiguration_Option#valueDecimal() valueDecimal} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueDecimal
   * @return A modified copy of {@code this} object
   */
  public final ImmutableUserConfiguration_Option withValueDecimal(java.util.Optional<java.lang.Double> optional) {
    @javax.annotation.Nullable java.lang.Double value = optional.orElse(null);
    if (java.util.Objects.equals(this.valueDecimal, value)) return this;
    return new ImmutableUserConfiguration_Option(this.valueCode, this.valueInteger, this.valueString, this.valueBoolean, this.id, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableUserConfiguration_Option} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableUserConfiguration_Option
        && equalTo((ImmutableUserConfiguration_Option) another);
  }

  private boolean equalTo(ImmutableUserConfiguration_Option another) {
    return java.util.Objects.equals(valueCode, another.valueCode)
        && java.util.Objects.equals(valueInteger, another.valueInteger)
        && java.util.Objects.equals(valueString, another.valueString)
        && java.util.Objects.equals(valueBoolean, another.valueBoolean)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(valueDecimal, another.valueDecimal);
  }

  /**
   * Computes a hash code from attributes: {@code valueCode}, {@code valueInteger}, {@code valueString}, {@code valueBoolean}, {@code id}, {@code valueDecimal}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(valueCode);
    h += (h << 5) + java.util.Objects.hashCode(valueInteger);
    h += (h << 5) + java.util.Objects.hashCode(valueString);
    h += (h << 5) + java.util.Objects.hashCode(valueBoolean);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(valueDecimal);
    return h;
  }

  /**
   * Prints the immutable value {@code UserConfiguration_Option} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("UserConfiguration_Option{");
    if (valueCode != null) {
      builder.append("valueCode=").append(valueCode);
    }
    if (valueInteger != null) {
      if (builder.length() > 25) builder.append(", ");
      builder.append("valueInteger=").append(valueInteger);
    }
    if (valueString != null) {
      if (builder.length() > 25) builder.append(", ");
      builder.append("valueString=").append(valueString);
    }
    if (valueBoolean != null) {
      if (builder.length() > 25) builder.append(", ");
      builder.append("valueBoolean=").append(valueBoolean);
    }
    if (id != null) {
      if (builder.length() > 25) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (valueDecimal != null) {
      if (builder.length() > 25) builder.append(", ");
      builder.append("valueDecimal=").append(valueDecimal);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "UserConfiguration_Option", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.UserConfiguration_Option {
    @javax.annotation.Nullable java.util.Optional<java.lang.String> valueCode = java.util.Optional.empty();
    boolean valueCodeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.Double> valueInteger = java.util.Optional.empty();
    boolean valueIntegerIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> valueString = java.util.Optional.empty();
    boolean valueStringIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.Boolean> valueBoolean = java.util.Optional.empty();
    boolean valueBooleanIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.Double> valueDecimal = java.util.Optional.empty();
    boolean valueDecimalIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("valueCode")
    public void setValueCode(java.util.Optional<java.lang.String> valueCode) {
      this.valueCode = valueCode;
      this.valueCodeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("valueInteger")
    public void setValueInteger(java.util.Optional<java.lang.Double> valueInteger) {
      this.valueInteger = valueInteger;
      this.valueIntegerIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("valueString")
    public void setValueString(java.util.Optional<java.lang.String> valueString) {
      this.valueString = valueString;
      this.valueStringIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("valueBoolean")
    public void setValueBoolean(java.util.Optional<java.lang.Boolean> valueBoolean) {
      this.valueBoolean = valueBoolean;
      this.valueBooleanIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<com.fhir.id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("valueDecimal")
    public void setValueDecimal(java.util.Optional<java.lang.Double> valueDecimal) {
      this.valueDecimal = valueDecimal;
      this.valueDecimalIsSet = true;
    }
    @Override
    public java.util.Optional<java.lang.String> valueCode() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.Double> valueInteger() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> valueString() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.Boolean> valueBoolean() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.id> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.Double> valueDecimal() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableUserConfiguration_Option fromJson(Json json) {
    ImmutableUserConfiguration_Option.Builder builder = ImmutableUserConfiguration_Option.builder();
    if (json.valueCodeIsSet) {
      builder.valueCode(json.valueCode);
    }
    if (json.valueIntegerIsSet) {
      builder.valueInteger(json.valueInteger);
    }
    if (json.valueStringIsSet) {
      builder.valueString(json.valueString);
    }
    if (json.valueBooleanIsSet) {
      builder.valueBoolean(json.valueBoolean);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.valueDecimalIsSet) {
      builder.valueDecimal(json.valueDecimal);
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
        .valueCode(instance.valueCode())
        .valueInteger(instance.valueInteger())
        .valueString(instance.valueString())
        .valueBoolean(instance.valueBoolean())
        .id(instance.id())
        .valueDecimal(instance.valueDecimal())
        .build();
  }

  /**
   * Creates a builder for {@link UserConfiguration_Option UserConfiguration_Option}.
   * <pre>
   * ImmutableUserConfiguration_Option.builder()
   *    .valueCode(String) // optional {@link UserConfiguration_Option#valueCode() valueCode}
   *    .valueInteger(Double) // optional {@link UserConfiguration_Option#valueInteger() valueInteger}
   *    .valueString(String) // optional {@link UserConfiguration_Option#valueString() valueString}
   *    .valueBoolean(Boolean) // optional {@link UserConfiguration_Option#valueBoolean() valueBoolean}
   *    .id(com.fhir.id) // optional {@link UserConfiguration_Option#id() id}
   *    .valueDecimal(Double) // optional {@link UserConfiguration_Option#valueDecimal() valueDecimal}
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
  @org.immutables.value.Generated(from = "UserConfiguration_Option", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_VALUE_CODE = 0x1L;
    private static final long OPT_BIT_VALUE_INTEGER = 0x2L;
    private static final long OPT_BIT_VALUE_STRING = 0x4L;
    private static final long OPT_BIT_VALUE_BOOLEAN = 0x8L;
    private static final long OPT_BIT_ID = 0x10L;
    private static final long OPT_BIT_VALUE_DECIMAL = 0x20L;
    private long optBits;

    private @javax.annotation.Nullable java.lang.String valueCode;
    private @javax.annotation.Nullable java.lang.Double valueInteger;
    private @javax.annotation.Nullable java.lang.String valueString;
    private @javax.annotation.Nullable java.lang.Boolean valueBoolean;
    private @javax.annotation.Nullable com.fhir.id id;
    private @javax.annotation.Nullable java.lang.Double valueDecimal;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link UserConfiguration_Option#valueCode() valueCode} to valueCode.
     * @param valueCode The value for valueCode
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueCode(java.lang.String valueCode) {
      checkNotIsSet(valueCodeIsSet(), "valueCode");
      this.valueCode = java.util.Objects.requireNonNull(valueCode, "valueCode");
      optBits |= OPT_BIT_VALUE_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link UserConfiguration_Option#valueCode() valueCode} to valueCode.
     * @param valueCode The value for valueCode
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("valueCode")
    public final Builder valueCode(java.util.Optional<java.lang.String> valueCode) {
      checkNotIsSet(valueCodeIsSet(), "valueCode");
      this.valueCode = valueCode.orElse(null);
      optBits |= OPT_BIT_VALUE_CODE;
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
    @com.fasterxml.jackson.annotation.JsonProperty("valueInteger")
    public final Builder valueInteger(java.util.Optional<java.lang.Double> valueInteger) {
      checkNotIsSet(valueIntegerIsSet(), "valueInteger");
      this.valueInteger = valueInteger.orElse(null);
      optBits |= OPT_BIT_VALUE_INTEGER;
      return this;
    }

    /**
     * Initializes the optional value {@link UserConfiguration_Option#valueString() valueString} to valueString.
     * @param valueString The value for valueString
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueString(java.lang.String valueString) {
      checkNotIsSet(valueStringIsSet(), "valueString");
      this.valueString = java.util.Objects.requireNonNull(valueString, "valueString");
      optBits |= OPT_BIT_VALUE_STRING;
      return this;
    }

    /**
     * Initializes the optional value {@link UserConfiguration_Option#valueString() valueString} to valueString.
     * @param valueString The value for valueString
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("valueString")
    public final Builder valueString(java.util.Optional<java.lang.String> valueString) {
      checkNotIsSet(valueStringIsSet(), "valueString");
      this.valueString = valueString.orElse(null);
      optBits |= OPT_BIT_VALUE_STRING;
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
    @com.fasterxml.jackson.annotation.JsonProperty("valueBoolean")
    public final Builder valueBoolean(java.util.Optional<java.lang.Boolean> valueBoolean) {
      checkNotIsSet(valueBooleanIsSet(), "valueBoolean");
      this.valueBoolean = valueBoolean.orElse(null);
      optBits |= OPT_BIT_VALUE_BOOLEAN;
      return this;
    }

    /**
     * Initializes the optional value {@link UserConfiguration_Option#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    public final Builder id(com.fhir.id id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = java.util.Objects.requireNonNull(id, "id");
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link UserConfiguration_Option#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public final Builder id(java.util.Optional<? extends com.fhir.id> id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = id.orElse(null);
      optBits |= OPT_BIT_ID;
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
    @com.fasterxml.jackson.annotation.JsonProperty("valueDecimal")
    public final Builder valueDecimal(java.util.Optional<java.lang.Double> valueDecimal) {
      checkNotIsSet(valueDecimalIsSet(), "valueDecimal");
      this.valueDecimal = valueDecimal.orElse(null);
      optBits |= OPT_BIT_VALUE_DECIMAL;
      return this;
    }

    /**
     * Builds a new {@link UserConfiguration_Option UserConfiguration_Option}.
     * @return An immutable instance of UserConfiguration_Option
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.UserConfiguration_Option build() {
      return new ImmutableUserConfiguration_Option(valueCode, valueInteger, valueString, valueBoolean, id, valueDecimal);
    }

    private boolean valueCodeIsSet() {
      return (optBits & OPT_BIT_VALUE_CODE) != 0;
    }

    private boolean valueIntegerIsSet() {
      return (optBits & OPT_BIT_VALUE_INTEGER) != 0;
    }

    private boolean valueStringIsSet() {
      return (optBits & OPT_BIT_VALUE_STRING) != 0;
    }

    private boolean valueBooleanIsSet() {
      return (optBits & OPT_BIT_VALUE_BOOLEAN) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean valueDecimalIsSet() {
      return (optBits & OPT_BIT_VALUE_DECIMAL) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of UserConfiguration_Option is strict, attribute is already set: ".concat(name));
    }
  }
}
