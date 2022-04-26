package com.fhir.types.fhir;

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
 * Immutable implementation of {@link Invoice_PriceComponent}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableInvoice_PriceComponent.builder()}.
 */
@Generated(from = "Invoice_PriceComponent", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableInvoice_PriceComponent implements Invoice_PriceComponent {
  private final @Nullable List<Extension> extension;
  private final @Nullable Money amount;
  private final @Nullable String id;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable Invoice_PricecomponentType type;
  private final @Nullable CodeableConcept code;
  private final @Nullable Decimal factor;

  private ImmutableInvoice_PriceComponent(
      @Nullable List<Extension> extension,
      @Nullable Money amount,
      @Nullable String id,
      @Nullable List<Extension> modifierExtension,
      @Nullable Invoice_PricecomponentType type,
      @Nullable CodeableConcept code,
      @Nullable Decimal factor) {
    this.extension = extension;
    this.amount = amount;
    this.id = id;
    this.modifierExtension = modifierExtension;
    this.type = type;
    this.code = code;
    this.factor = factor;
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
   * @return The value of the {@code amount} attribute
   */
  @JsonProperty("amount")
  @Override
  public Optional<Money> amount() {
    return Optional.ofNullable(amount);
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @JsonProperty("modifierExtension")
  @Override
  public Optional<List<Extension>> modifierExtension() {
    return Optional.ofNullable(modifierExtension);
  }

  /**
   * @return The value of the {@code type} attribute
   */
  @JsonProperty("type")
  @Override
  public Optional<Invoice_PricecomponentType> type() {
    return Optional.ofNullable(type);
  }

  /**
   * @return The value of the {@code code} attribute
   */
  @JsonProperty("code")
  @Override
  public Optional<CodeableConcept> code() {
    return Optional.ofNullable(code);
  }

  /**
   * @return The value of the {@code factor} attribute
   */
  @JsonProperty("factor")
  @Override
  public Optional<Decimal> factor() {
    return Optional.ofNullable(factor);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Invoice_PriceComponent#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInvoice_PriceComponent withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableInvoice_PriceComponent(newValue, this.amount, this.id, this.modifierExtension, this.type, this.code, this.factor);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Invoice_PriceComponent#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableInvoice_PriceComponent withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableInvoice_PriceComponent(value, this.amount, this.id, this.modifierExtension, this.type, this.code, this.factor);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Invoice_PriceComponent#amount() amount} attribute.
   * @param value The value for amount
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInvoice_PriceComponent withAmount(Money value) {
    @Nullable Money newValue = Objects.requireNonNull(value, "amount");
    if (this.amount == newValue) return this;
    return new ImmutableInvoice_PriceComponent(this.extension, newValue, this.id, this.modifierExtension, this.type, this.code, this.factor);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Invoice_PriceComponent#amount() amount} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for amount
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableInvoice_PriceComponent withAmount(Optional<? extends Money> optional) {
    @Nullable Money value = optional.orElse(null);
    if (this.amount == value) return this;
    return new ImmutableInvoice_PriceComponent(this.extension, value, this.id, this.modifierExtension, this.type, this.code, this.factor);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Invoice_PriceComponent#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInvoice_PriceComponent withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableInvoice_PriceComponent(
        this.extension,
        this.amount,
        newValue,
        this.modifierExtension,
        this.type,
        this.code,
        this.factor);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Invoice_PriceComponent#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInvoice_PriceComponent withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableInvoice_PriceComponent(this.extension, this.amount, value, this.modifierExtension, this.type, this.code, this.factor);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Invoice_PriceComponent#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInvoice_PriceComponent withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableInvoice_PriceComponent(this.extension, this.amount, this.id, newValue, this.type, this.code, this.factor);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Invoice_PriceComponent#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableInvoice_PriceComponent withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableInvoice_PriceComponent(this.extension, this.amount, this.id, value, this.type, this.code, this.factor);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Invoice_PriceComponent#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInvoice_PriceComponent withType(Invoice_PricecomponentType value) {
    @Nullable Invoice_PricecomponentType newValue = Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutableInvoice_PriceComponent(this.extension, this.amount, this.id, this.modifierExtension, newValue, this.code, this.factor);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Invoice_PriceComponent#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableInvoice_PriceComponent withType(Optional<? extends Invoice_PricecomponentType> optional) {
    @Nullable Invoice_PricecomponentType value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutableInvoice_PriceComponent(this.extension, this.amount, this.id, this.modifierExtension, value, this.code, this.factor);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Invoice_PriceComponent#code() code} attribute.
   * @param value The value for code
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInvoice_PriceComponent withCode(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "code");
    if (this.code == newValue) return this;
    return new ImmutableInvoice_PriceComponent(this.extension, this.amount, this.id, this.modifierExtension, this.type, newValue, this.factor);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Invoice_PriceComponent#code() code} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for code
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableInvoice_PriceComponent withCode(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.code == value) return this;
    return new ImmutableInvoice_PriceComponent(this.extension, this.amount, this.id, this.modifierExtension, this.type, value, this.factor);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Invoice_PriceComponent#factor() factor} attribute.
   * @param value The value for factor
   * @return A modified copy of {@code this} object
   */
  public final ImmutableInvoice_PriceComponent withFactor(Decimal value) {
    @Nullable Decimal newValue = Objects.requireNonNull(value, "factor");
    if (this.factor == newValue) return this;
    return new ImmutableInvoice_PriceComponent(this.extension, this.amount, this.id, this.modifierExtension, this.type, this.code, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Invoice_PriceComponent#factor() factor} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for factor
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableInvoice_PriceComponent withFactor(Optional<? extends Decimal> optional) {
    @Nullable Decimal value = optional.orElse(null);
    if (this.factor == value) return this;
    return new ImmutableInvoice_PriceComponent(this.extension, this.amount, this.id, this.modifierExtension, this.type, this.code, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableInvoice_PriceComponent} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableInvoice_PriceComponent
        && equalTo((ImmutableInvoice_PriceComponent) another);
  }

  private boolean equalTo(ImmutableInvoice_PriceComponent another) {
    return Objects.equals(extension, another.extension)
        && Objects.equals(amount, another.amount)
        && Objects.equals(id, another.id)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(type, another.type)
        && Objects.equals(code, another.code)
        && Objects.equals(factor, another.factor);
  }

  /**
   * Computes a hash code from attributes: {@code extension}, {@code amount}, {@code id}, {@code modifierExtension}, {@code type}, {@code code}, {@code factor}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(amount);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(type);
    h += (h << 5) + Objects.hashCode(code);
    h += (h << 5) + Objects.hashCode(factor);
    return h;
  }

  /**
   * Prints the immutable value {@code Invoice_PriceComponent} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Invoice_PriceComponent{");
    if (extension != null) {
      builder.append("extension=").append(extension);
    }
    if (amount != null) {
      if (builder.length() > 23) builder.append(", ");
      builder.append("amount=").append(amount);
    }
    if (id != null) {
      if (builder.length() > 23) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (modifierExtension != null) {
      if (builder.length() > 23) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (type != null) {
      if (builder.length() > 23) builder.append(", ");
      builder.append("type=").append(type);
    }
    if (code != null) {
      if (builder.length() > 23) builder.append(", ");
      builder.append("code=").append(code);
    }
    if (factor != null) {
      if (builder.length() > 23) builder.append(", ");
      builder.append("factor=").append(factor);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "Invoice_PriceComponent", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Invoice_PriceComponent {
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<Money> amount = Optional.empty();
    boolean amountIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<Invoice_PricecomponentType> type = Optional.empty();
    boolean typeIsSet;
    @Nullable Optional<CodeableConcept> code = Optional.empty();
    boolean codeIsSet;
    @Nullable Optional<Decimal> factor = Optional.empty();
    boolean factorIsSet;
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("amount")
    public void setAmount(Optional<Money> amount) {
      this.amount = amount;
      this.amountIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("type")
    public void setType(Optional<Invoice_PricecomponentType> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @JsonProperty("code")
    public void setCode(Optional<CodeableConcept> code) {
      this.code = code;
      this.codeIsSet = true;
    }
    @JsonProperty("factor")
    public void setFactor(Optional<Decimal> factor) {
      this.factor = factor;
      this.factorIsSet = true;
    }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Money> amount() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Invoice_PricecomponentType> type() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> code() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Decimal> factor() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableInvoice_PriceComponent fromJson(Json json) {
    ImmutableInvoice_PriceComponent.Builder builder = ImmutableInvoice_PriceComponent.builder();
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.amountIsSet) {
      builder.amount(json.amount);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.codeIsSet) {
      builder.code(json.code);
    }
    if (json.factorIsSet) {
      builder.factor(json.factor);
    }
    return (ImmutableInvoice_PriceComponent) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Invoice_PriceComponent} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Invoice_PriceComponent instance
   */
  public static Invoice_PriceComponent copyOf(Invoice_PriceComponent instance) {
    if (instance instanceof ImmutableInvoice_PriceComponent) {
      return (ImmutableInvoice_PriceComponent) instance;
    }
    return ImmutableInvoice_PriceComponent.builder()
        .extension(instance.extension())
        .amount(instance.amount())
        .id(instance.id())
        .modifierExtension(instance.modifierExtension())
        .type(instance.type())
        .code(instance.code())
        .factor(instance.factor())
        .build();
  }

  /**
   * Creates a builder for {@link Invoice_PriceComponent Invoice_PriceComponent}.
   * <pre>
   * ImmutableInvoice_PriceComponent.builder()
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link Invoice_PriceComponent#extension() extension}
   *    .amount(com.fhir.types.fhir.Money) // optional {@link Invoice_PriceComponent#amount() amount}
   *    .id(String) // optional {@link Invoice_PriceComponent#id() id}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link Invoice_PriceComponent#modifierExtension() modifierExtension}
   *    .type(Invoice_PricecomponentType) // optional {@link Invoice_PriceComponent#type() type}
   *    .code(com.fhir.types.fhir.CodeableConcept) // optional {@link Invoice_PriceComponent#code() code}
   *    .factor(com.fhir.types.fhir.Decimal) // optional {@link Invoice_PriceComponent#factor() factor}
   *    .build();
   * </pre>
   * @return A new Invoice_PriceComponent builder
   */
  public static ImmutableInvoice_PriceComponent.Builder builder() {
    return new ImmutableInvoice_PriceComponent.Builder();
  }

  /**
   * Builds instances of type {@link Invoice_PriceComponent Invoice_PriceComponent}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "Invoice_PriceComponent", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_EXTENSION = 0x1L;
    private static final long OPT_BIT_AMOUNT = 0x2L;
    private static final long OPT_BIT_ID = 0x4L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x8L;
    private static final long OPT_BIT_TYPE = 0x10L;
    private static final long OPT_BIT_CODE = 0x20L;
    private static final long OPT_BIT_FACTOR = 0x40L;
    private long optBits;

    private @Nullable List<Extension> extension;
    private @Nullable Money amount;
    private @Nullable String id;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable Invoice_PricecomponentType type;
    private @Nullable CodeableConcept code;
    private @Nullable Decimal factor;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Invoice_PriceComponent#extension() extension} to extension.
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
     * Initializes the optional value {@link Invoice_PriceComponent#extension() extension} to extension.
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
     * Initializes the optional value {@link Invoice_PriceComponent#amount() amount} to amount.
     * @param amount The value for amount
     * @return {@code this} builder for chained invocation
     */
    public final Builder amount(Money amount) {
      checkNotIsSet(amountIsSet(), "amount");
      this.amount = Objects.requireNonNull(amount, "amount");
      optBits |= OPT_BIT_AMOUNT;
      return this;
    }

    /**
     * Initializes the optional value {@link Invoice_PriceComponent#amount() amount} to amount.
     * @param amount The value for amount
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("amount")
    public final Builder amount(Optional<? extends Money> amount) {
      checkNotIsSet(amountIsSet(), "amount");
      this.amount = amount.orElse(null);
      optBits |= OPT_BIT_AMOUNT;
      return this;
    }

    /**
     * Initializes the optional value {@link Invoice_PriceComponent#id() id} to id.
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
     * Initializes the optional value {@link Invoice_PriceComponent#id() id} to id.
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
     * Initializes the optional value {@link Invoice_PriceComponent#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Invoice_PriceComponent#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Invoice_PriceComponent#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    public final Builder type(Invoice_PricecomponentType type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = Objects.requireNonNull(type, "type");
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Invoice_PriceComponent#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("type")
    public final Builder type(Optional<? extends Invoice_PricecomponentType> type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = type.orElse(null);
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Invoice_PriceComponent#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for chained invocation
     */
    public final Builder code(CodeableConcept code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = Objects.requireNonNull(code, "code");
      optBits |= OPT_BIT_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link Invoice_PriceComponent#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("code")
    public final Builder code(Optional<? extends CodeableConcept> code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = code.orElse(null);
      optBits |= OPT_BIT_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link Invoice_PriceComponent#factor() factor} to factor.
     * @param factor The value for factor
     * @return {@code this} builder for chained invocation
     */
    public final Builder factor(Decimal factor) {
      checkNotIsSet(factorIsSet(), "factor");
      this.factor = Objects.requireNonNull(factor, "factor");
      optBits |= OPT_BIT_FACTOR;
      return this;
    }

    /**
     * Initializes the optional value {@link Invoice_PriceComponent#factor() factor} to factor.
     * @param factor The value for factor
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("factor")
    public final Builder factor(Optional<? extends Decimal> factor) {
      checkNotIsSet(factorIsSet(), "factor");
      this.factor = factor.orElse(null);
      optBits |= OPT_BIT_FACTOR;
      return this;
    }

    /**
     * Builds a new {@link Invoice_PriceComponent Invoice_PriceComponent}.
     * @return An immutable instance of Invoice_PriceComponent
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public Invoice_PriceComponent build() {
      return new ImmutableInvoice_PriceComponent(extension, amount, id, modifierExtension, type, code, factor);
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean amountIsSet() {
      return (optBits & OPT_BIT_AMOUNT) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean codeIsSet() {
      return (optBits & OPT_BIT_CODE) != 0;
    }

    private boolean factorIsSet() {
      return (optBits & OPT_BIT_FACTOR) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of Invoice_PriceComponent is strict, attribute is already set: ".concat(name));
    }
  }
}
