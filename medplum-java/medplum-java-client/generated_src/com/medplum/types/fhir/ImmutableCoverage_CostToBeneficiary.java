package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link Coverage_CostToBeneficiary}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableCoverage_CostToBeneficiary.builder()}.
 */
@Generated(from = "Coverage_CostToBeneficiary", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableCoverage_CostToBeneficiary
    implements Coverage_CostToBeneficiary {
  private final @Nullable Quantity valueQuantity;
  private final @Nullable String id;
  private final @Nullable CodeableConcept type;
  private final @Nullable List<Extension> extension;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable Money valueMoney;
  private final @Nullable List<Coverage_Exception> exception;

  private ImmutableCoverage_CostToBeneficiary(
      @Nullable Quantity valueQuantity,
      @Nullable String id,
      @Nullable CodeableConcept type,
      @Nullable List<Extension> extension,
      @Nullable List<Extension> modifierExtension,
      @Nullable Money valueMoney,
      @Nullable List<Coverage_Exception> exception) {
    this.valueQuantity = valueQuantity;
    this.id = id;
    this.type = type;
    this.extension = extension;
    this.modifierExtension = modifierExtension;
    this.valueMoney = valueMoney;
    this.exception = exception;
  }

  /**
   * @return The value of the {@code valueQuantity} attribute
   */
  @JsonProperty("valueQuantity")
  @Override
  public Optional<Quantity> valueQuantity() {
    return Optional.ofNullable(valueQuantity);
  }

  /**
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public Optional<String> id() {
    return Optional.ofNullable(id);
  }

  /**
   * @return The value of the {@code type} attribute
   */
  @JsonProperty("type")
  @Override
  public Optional<CodeableConcept> type() {
    return Optional.ofNullable(type);
  }

  /**
   * @return The value of the {@code extension} attribute
   */
  @JsonProperty("extension")
  @Override
  public Optional<List<Extension>> extension() {
    return Optional.ofNullable(extension);
  }

  /**
   * @return The value of the {@code modifierExtension} attribute
   */
  @JsonProperty("modifierExtension")
  @Override
  public Optional<List<Extension>> modifierExtension() {
    return Optional.ofNullable(modifierExtension);
  }

  /**
   * @return The value of the {@code valueMoney} attribute
   */
  @JsonProperty("valueMoney")
  @Override
  public Optional<Money> valueMoney() {
    return Optional.ofNullable(valueMoney);
  }

  /**
   * @return The value of the {@code exception} attribute
   */
  @JsonProperty("exception")
  @Override
  public Optional<List<Coverage_Exception>> exception() {
    return Optional.ofNullable(exception);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Coverage_CostToBeneficiary#valueQuantity() valueQuantity} attribute.
   * @param value The value for valueQuantity
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverage_CostToBeneficiary withValueQuantity(Quantity value) {
    @Nullable Quantity newValue = Objects.requireNonNull(value, "valueQuantity");
    if (this.valueQuantity == newValue) return this;
    return new ImmutableCoverage_CostToBeneficiary(
        newValue,
        this.id,
        this.type,
        this.extension,
        this.modifierExtension,
        this.valueMoney,
        this.exception);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Coverage_CostToBeneficiary#valueQuantity() valueQuantity} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueQuantity
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverage_CostToBeneficiary withValueQuantity(Optional<? extends Quantity> optional) {
    @Nullable Quantity value = optional.orElse(null);
    if (this.valueQuantity == value) return this;
    return new ImmutableCoverage_CostToBeneficiary(
        value,
        this.id,
        this.type,
        this.extension,
        this.modifierExtension,
        this.valueMoney,
        this.exception);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Coverage_CostToBeneficiary#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverage_CostToBeneficiary withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableCoverage_CostToBeneficiary(
        this.valueQuantity,
        newValue,
        this.type,
        this.extension,
        this.modifierExtension,
        this.valueMoney,
        this.exception);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Coverage_CostToBeneficiary#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverage_CostToBeneficiary withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableCoverage_CostToBeneficiary(
        this.valueQuantity,
        value,
        this.type,
        this.extension,
        this.modifierExtension,
        this.valueMoney,
        this.exception);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Coverage_CostToBeneficiary#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverage_CostToBeneficiary withType(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutableCoverage_CostToBeneficiary(
        this.valueQuantity,
        this.id,
        newValue,
        this.extension,
        this.modifierExtension,
        this.valueMoney,
        this.exception);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Coverage_CostToBeneficiary#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverage_CostToBeneficiary withType(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutableCoverage_CostToBeneficiary(
        this.valueQuantity,
        this.id,
        value,
        this.extension,
        this.modifierExtension,
        this.valueMoney,
        this.exception);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Coverage_CostToBeneficiary#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverage_CostToBeneficiary withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableCoverage_CostToBeneficiary(
        this.valueQuantity,
        this.id,
        this.type,
        newValue,
        this.modifierExtension,
        this.valueMoney,
        this.exception);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Coverage_CostToBeneficiary#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverage_CostToBeneficiary withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableCoverage_CostToBeneficiary(
        this.valueQuantity,
        this.id,
        this.type,
        value,
        this.modifierExtension,
        this.valueMoney,
        this.exception);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Coverage_CostToBeneficiary#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverage_CostToBeneficiary withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableCoverage_CostToBeneficiary(
        this.valueQuantity,
        this.id,
        this.type,
        this.extension,
        newValue,
        this.valueMoney,
        this.exception);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Coverage_CostToBeneficiary#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverage_CostToBeneficiary withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableCoverage_CostToBeneficiary(this.valueQuantity, this.id, this.type, this.extension, value, this.valueMoney, this.exception);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Coverage_CostToBeneficiary#valueMoney() valueMoney} attribute.
   * @param value The value for valueMoney
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverage_CostToBeneficiary withValueMoney(Money value) {
    @Nullable Money newValue = Objects.requireNonNull(value, "valueMoney");
    if (this.valueMoney == newValue) return this;
    return new ImmutableCoverage_CostToBeneficiary(
        this.valueQuantity,
        this.id,
        this.type,
        this.extension,
        this.modifierExtension,
        newValue,
        this.exception);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Coverage_CostToBeneficiary#valueMoney() valueMoney} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for valueMoney
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverage_CostToBeneficiary withValueMoney(Optional<? extends Money> optional) {
    @Nullable Money value = optional.orElse(null);
    if (this.valueMoney == value) return this;
    return new ImmutableCoverage_CostToBeneficiary(
        this.valueQuantity,
        this.id,
        this.type,
        this.extension,
        this.modifierExtension,
        value,
        this.exception);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Coverage_CostToBeneficiary#exception() exception} attribute.
   * @param value The value for exception
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCoverage_CostToBeneficiary withException(List<Coverage_Exception> value) {
    @Nullable List<Coverage_Exception> newValue = Objects.requireNonNull(value, "exception");
    if (this.exception == newValue) return this;
    return new ImmutableCoverage_CostToBeneficiary(
        this.valueQuantity,
        this.id,
        this.type,
        this.extension,
        this.modifierExtension,
        this.valueMoney,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Coverage_CostToBeneficiary#exception() exception} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for exception
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCoverage_CostToBeneficiary withException(Optional<? extends List<Coverage_Exception>> optional) {
    @Nullable List<Coverage_Exception> value = optional.orElse(null);
    if (this.exception == value) return this;
    return new ImmutableCoverage_CostToBeneficiary(
        this.valueQuantity,
        this.id,
        this.type,
        this.extension,
        this.modifierExtension,
        this.valueMoney,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableCoverage_CostToBeneficiary} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableCoverage_CostToBeneficiary
        && equalTo((ImmutableCoverage_CostToBeneficiary) another);
  }

  private boolean equalTo(ImmutableCoverage_CostToBeneficiary another) {
    return Objects.equals(valueQuantity, another.valueQuantity)
        && Objects.equals(id, another.id)
        && Objects.equals(type, another.type)
        && Objects.equals(extension, another.extension)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(valueMoney, another.valueMoney)
        && Objects.equals(exception, another.exception);
  }

  /**
   * Computes a hash code from attributes: {@code valueQuantity}, {@code id}, {@code type}, {@code extension}, {@code modifierExtension}, {@code valueMoney}, {@code exception}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(valueQuantity);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(type);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(valueMoney);
    h += (h << 5) + Objects.hashCode(exception);
    return h;
  }

  /**
   * Prints the immutable value {@code Coverage_CostToBeneficiary} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Coverage_CostToBeneficiary{");
    if (valueQuantity != null) {
      builder.append("valueQuantity=").append(valueQuantity);
    }
    if (id != null) {
      if (builder.length() > 27) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (type != null) {
      if (builder.length() > 27) builder.append(", ");
      builder.append("type=").append(type);
    }
    if (extension != null) {
      if (builder.length() > 27) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (modifierExtension != null) {
      if (builder.length() > 27) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (valueMoney != null) {
      if (builder.length() > 27) builder.append(", ");
      builder.append("valueMoney=").append(valueMoney);
    }
    if (exception != null) {
      if (builder.length() > 27) builder.append(", ");
      builder.append("exception=").append(exception);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "Coverage_CostToBeneficiary", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Coverage_CostToBeneficiary {
    @Nullable Optional<Quantity> valueQuantity = Optional.empty();
    boolean valueQuantityIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<CodeableConcept> type = Optional.empty();
    boolean typeIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<Money> valueMoney = Optional.empty();
    boolean valueMoneyIsSet;
    @Nullable Optional<List<Coverage_Exception>> exception = Optional.empty();
    boolean exceptionIsSet;
    @JsonProperty("valueQuantity")
    public void setValueQuantity(Optional<Quantity> valueQuantity) {
      this.valueQuantity = valueQuantity;
      this.valueQuantityIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("type")
    public void setType(Optional<CodeableConcept> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("valueMoney")
    public void setValueMoney(Optional<Money> valueMoney) {
      this.valueMoney = valueMoney;
      this.valueMoneyIsSet = true;
    }
    @JsonProperty("exception")
    public void setException(Optional<List<Coverage_Exception>> exception) {
      this.exception = exception;
      this.exceptionIsSet = true;
    }
    @Override
    public Optional<Quantity> valueQuantity() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> type() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Money> valueMoney() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Coverage_Exception>> exception() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableCoverage_CostToBeneficiary fromJson(Json json) {
    ImmutableCoverage_CostToBeneficiary.Builder builder = ImmutableCoverage_CostToBeneficiary.builder();
    if (json.valueQuantityIsSet) {
      builder.valueQuantity(json.valueQuantity);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.valueMoneyIsSet) {
      builder.valueMoney(json.valueMoney);
    }
    if (json.exceptionIsSet) {
      builder.exception(json.exception);
    }
    return (ImmutableCoverage_CostToBeneficiary) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Coverage_CostToBeneficiary} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Coverage_CostToBeneficiary instance
   */
  public static Coverage_CostToBeneficiary copyOf(Coverage_CostToBeneficiary instance) {
    if (instance instanceof ImmutableCoverage_CostToBeneficiary) {
      return (ImmutableCoverage_CostToBeneficiary) instance;
    }
    return ImmutableCoverage_CostToBeneficiary.builder()
        .valueQuantity(instance.valueQuantity())
        .id(instance.id())
        .type(instance.type())
        .extension(instance.extension())
        .modifierExtension(instance.modifierExtension())
        .valueMoney(instance.valueMoney())
        .exception(instance.exception())
        .build();
  }

  /**
   * Creates a builder for {@link Coverage_CostToBeneficiary Coverage_CostToBeneficiary}.
   * <pre>
   * ImmutableCoverage_CostToBeneficiary.builder()
   *    .valueQuantity(com.medplum.types.fhir.Quantity) // optional {@link Coverage_CostToBeneficiary#valueQuantity() valueQuantity}
   *    .id(String) // optional {@link Coverage_CostToBeneficiary#id() id}
   *    .type(com.medplum.types.fhir.CodeableConcept) // optional {@link Coverage_CostToBeneficiary#type() type}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link Coverage_CostToBeneficiary#extension() extension}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link Coverage_CostToBeneficiary#modifierExtension() modifierExtension}
   *    .valueMoney(com.medplum.types.fhir.Money) // optional {@link Coverage_CostToBeneficiary#valueMoney() valueMoney}
   *    .exception(List&amp;lt;com.medplum.types.fhir.Coverage_Exception&amp;gt;) // optional {@link Coverage_CostToBeneficiary#exception() exception}
   *    .build();
   * </pre>
   * @return A new Coverage_CostToBeneficiary builder
   */
  public static ImmutableCoverage_CostToBeneficiary.Builder builder() {
    return new ImmutableCoverage_CostToBeneficiary.Builder();
  }

  /**
   * Builds instances of type {@link Coverage_CostToBeneficiary Coverage_CostToBeneficiary}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "Coverage_CostToBeneficiary", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_VALUE_QUANTITY = 0x1L;
    private static final long OPT_BIT_ID = 0x2L;
    private static final long OPT_BIT_TYPE = 0x4L;
    private static final long OPT_BIT_EXTENSION = 0x8L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x10L;
    private static final long OPT_BIT_VALUE_MONEY = 0x20L;
    private static final long OPT_BIT_EXCEPTION = 0x40L;
    private long optBits;

    private @Nullable Quantity valueQuantity;
    private @Nullable String id;
    private @Nullable CodeableConcept type;
    private @Nullable List<Extension> extension;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable Money valueMoney;
    private @Nullable List<Coverage_Exception> exception;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Coverage_CostToBeneficiary#valueQuantity() valueQuantity} to valueQuantity.
     * @param valueQuantity The value for valueQuantity
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueQuantity(Quantity valueQuantity) {
      checkNotIsSet(valueQuantityIsSet(), "valueQuantity");
      this.valueQuantity = Objects.requireNonNull(valueQuantity, "valueQuantity");
      optBits |= OPT_BIT_VALUE_QUANTITY;
      return this;
    }

    /**
     * Initializes the optional value {@link Coverage_CostToBeneficiary#valueQuantity() valueQuantity} to valueQuantity.
     * @param valueQuantity The value for valueQuantity
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("valueQuantity")
    public final Builder valueQuantity(Optional<? extends Quantity> valueQuantity) {
      checkNotIsSet(valueQuantityIsSet(), "valueQuantity");
      this.valueQuantity = valueQuantity.orElse(null);
      optBits |= OPT_BIT_VALUE_QUANTITY;
      return this;
    }

    /**
     * Initializes the optional value {@link Coverage_CostToBeneficiary#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    public final Builder id(String id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = Objects.requireNonNull(id, "id");
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link Coverage_CostToBeneficiary#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("id")
    public final Builder id(Optional<String> id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = id.orElse(null);
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link Coverage_CostToBeneficiary#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    public final Builder type(CodeableConcept type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = Objects.requireNonNull(type, "type");
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Coverage_CostToBeneficiary#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("type")
    public final Builder type(Optional<? extends CodeableConcept> type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = type.orElse(null);
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Coverage_CostToBeneficiary#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    public final Builder extension(List<Extension> extension) {
      checkNotIsSet(extensionIsSet(), "extension");
      this.extension = Objects.requireNonNull(extension, "extension");
      optBits |= OPT_BIT_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link Coverage_CostToBeneficiary#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("extension")
    public final Builder extension(Optional<? extends List<Extension>> extension) {
      checkNotIsSet(extensionIsSet(), "extension");
      this.extension = extension.orElse(null);
      optBits |= OPT_BIT_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link Coverage_CostToBeneficiary#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    public final Builder modifierExtension(List<Extension> modifierExtension) {
      checkNotIsSet(modifierExtensionIsSet(), "modifierExtension");
      this.modifierExtension = Objects.requireNonNull(modifierExtension, "modifierExtension");
      optBits |= OPT_BIT_MODIFIER_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link Coverage_CostToBeneficiary#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("modifierExtension")
    public final Builder modifierExtension(Optional<? extends List<Extension>> modifierExtension) {
      checkNotIsSet(modifierExtensionIsSet(), "modifierExtension");
      this.modifierExtension = modifierExtension.orElse(null);
      optBits |= OPT_BIT_MODIFIER_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link Coverage_CostToBeneficiary#valueMoney() valueMoney} to valueMoney.
     * @param valueMoney The value for valueMoney
     * @return {@code this} builder for chained invocation
     */
    public final Builder valueMoney(Money valueMoney) {
      checkNotIsSet(valueMoneyIsSet(), "valueMoney");
      this.valueMoney = Objects.requireNonNull(valueMoney, "valueMoney");
      optBits |= OPT_BIT_VALUE_MONEY;
      return this;
    }

    /**
     * Initializes the optional value {@link Coverage_CostToBeneficiary#valueMoney() valueMoney} to valueMoney.
     * @param valueMoney The value for valueMoney
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("valueMoney")
    public final Builder valueMoney(Optional<? extends Money> valueMoney) {
      checkNotIsSet(valueMoneyIsSet(), "valueMoney");
      this.valueMoney = valueMoney.orElse(null);
      optBits |= OPT_BIT_VALUE_MONEY;
      return this;
    }

    /**
     * Initializes the optional value {@link Coverage_CostToBeneficiary#exception() exception} to exception.
     * @param exception The value for exception
     * @return {@code this} builder for chained invocation
     */
    public final Builder exception(List<Coverage_Exception> exception) {
      checkNotIsSet(exceptionIsSet(), "exception");
      this.exception = Objects.requireNonNull(exception, "exception");
      optBits |= OPT_BIT_EXCEPTION;
      return this;
    }

    /**
     * Initializes the optional value {@link Coverage_CostToBeneficiary#exception() exception} to exception.
     * @param exception The value for exception
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("exception")
    public final Builder exception(Optional<? extends List<Coverage_Exception>> exception) {
      checkNotIsSet(exceptionIsSet(), "exception");
      this.exception = exception.orElse(null);
      optBits |= OPT_BIT_EXCEPTION;
      return this;
    }

    /**
     * Builds a new {@link Coverage_CostToBeneficiary Coverage_CostToBeneficiary}.
     * @return An immutable instance of Coverage_CostToBeneficiary
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public Coverage_CostToBeneficiary build() {
      return new ImmutableCoverage_CostToBeneficiary(valueQuantity, id, type, extension, modifierExtension, valueMoney, exception);
    }

    private boolean valueQuantityIsSet() {
      return (optBits & OPT_BIT_VALUE_QUANTITY) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean valueMoneyIsSet() {
      return (optBits & OPT_BIT_VALUE_MONEY) != 0;
    }

    private boolean exceptionIsSet() {
      return (optBits & OPT_BIT_EXCEPTION) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of Coverage_CostToBeneficiary is strict, attribute is already set: ".concat(name));
    }
  }
}
