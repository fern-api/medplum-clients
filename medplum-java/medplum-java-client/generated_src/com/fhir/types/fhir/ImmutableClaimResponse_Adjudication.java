package com.fhir.types.fhir;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link ClaimResponse_Adjudication}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableClaimResponse_Adjudication.builder()}.
 */
@Generated(from = "ClaimResponse_Adjudication", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableClaimResponse_Adjudication
    implements ClaimResponse_Adjudication {
  private final @Nullable Money amount;
  private final @Nullable List<Extension> extension;
  private final @Nullable Decimal value;
  private final @Nullable String id;
  private final CodeableConcept category;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable CodeableConcept reason;

  private ImmutableClaimResponse_Adjudication(
      @Nullable Money amount,
      @Nullable List<Extension> extension,
      @Nullable Decimal value,
      @Nullable String id,
      CodeableConcept category,
      @Nullable List<Extension> modifierExtension,
      @Nullable CodeableConcept reason) {
    this.amount = amount;
    this.extension = extension;
    this.value = value;
    this.id = id;
    this.category = category;
    this.modifierExtension = modifierExtension;
    this.reason = reason;
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
   * @return The value of the {@code extension} attribute
   */
  @JsonProperty("extension")
  @Override
  public Optional<List<Extension>> extension() {
    return Optional.ofNullable(extension);
  }

  /**
   * @return The value of the {@code value} attribute
   */
  @JsonProperty("value")
  @Override
  public Optional<Decimal> value() {
    return Optional.ofNullable(value);
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
   * @return The value of the {@code category} attribute
   */
  @JsonProperty("category")
  @Override
  public CodeableConcept category() {
    return category;
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
   * @return The value of the {@code reason} attribute
   */
  @JsonProperty("reason")
  @Override
  public Optional<CodeableConcept> reason() {
    return Optional.ofNullable(reason);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse_Adjudication#amount() amount} attribute.
   * @param value The value for amount
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse_Adjudication withAmount(Money value) {
    @Nullable Money newValue = Objects.requireNonNull(value, "amount");
    if (this.amount == newValue) return this;
    return new ImmutableClaimResponse_Adjudication(
        newValue,
        this.extension,
        this.value,
        this.id,
        this.category,
        this.modifierExtension,
        this.reason);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse_Adjudication#amount() amount} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for amount
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaimResponse_Adjudication withAmount(Optional<? extends Money> optional) {
    @Nullable Money value = optional.orElse(null);
    if (this.amount == value) return this;
    return new ImmutableClaimResponse_Adjudication(value, this.extension, this.value, this.id, this.category, this.modifierExtension, this.reason);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse_Adjudication#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse_Adjudication withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableClaimResponse_Adjudication(this.amount, newValue, this.value, this.id, this.category, this.modifierExtension, this.reason);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse_Adjudication#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaimResponse_Adjudication withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableClaimResponse_Adjudication(this.amount, value, this.value, this.id, this.category, this.modifierExtension, this.reason);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse_Adjudication#value() value} attribute.
   * @param value The value for value
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse_Adjudication withValue(Decimal value) {
    @Nullable Decimal newValue = Objects.requireNonNull(value, "value");
    if (this.value == newValue) return this;
    return new ImmutableClaimResponse_Adjudication(
        this.amount,
        this.extension,
        newValue,
        this.id,
        this.category,
        this.modifierExtension,
        this.reason);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse_Adjudication#value() value} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for value
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaimResponse_Adjudication withValue(Optional<? extends Decimal> optional) {
    @Nullable Decimal value = optional.orElse(null);
    if (this.value == value) return this;
    return new ImmutableClaimResponse_Adjudication(this.amount, this.extension, value, this.id, this.category, this.modifierExtension, this.reason);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse_Adjudication#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse_Adjudication withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableClaimResponse_Adjudication(
        this.amount,
        this.extension,
        this.value,
        newValue,
        this.category,
        this.modifierExtension,
        this.reason);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse_Adjudication#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse_Adjudication withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableClaimResponse_Adjudication(
        this.amount,
        this.extension,
        this.value,
        value,
        this.category,
        this.modifierExtension,
        this.reason);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ClaimResponse_Adjudication#category() category} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for category
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableClaimResponse_Adjudication withCategory(CodeableConcept value) {
    if (this.category == value) return this;
    CodeableConcept newValue = Objects.requireNonNull(value, "category");
    return new ImmutableClaimResponse_Adjudication(this.amount, this.extension, this.value, this.id, newValue, this.modifierExtension, this.reason);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse_Adjudication#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse_Adjudication withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableClaimResponse_Adjudication(this.amount, this.extension, this.value, this.id, this.category, newValue, this.reason);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse_Adjudication#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaimResponse_Adjudication withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableClaimResponse_Adjudication(this.amount, this.extension, this.value, this.id, this.category, value, this.reason);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse_Adjudication#reason() reason} attribute.
   * @param value The value for reason
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse_Adjudication withReason(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "reason");
    if (this.reason == newValue) return this;
    return new ImmutableClaimResponse_Adjudication(
        this.amount,
        this.extension,
        this.value,
        this.id,
        this.category,
        this.modifierExtension,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse_Adjudication#reason() reason} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for reason
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaimResponse_Adjudication withReason(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.reason == value) return this;
    return new ImmutableClaimResponse_Adjudication(this.amount, this.extension, this.value, this.id, this.category, this.modifierExtension, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableClaimResponse_Adjudication} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableClaimResponse_Adjudication
        && equalTo((ImmutableClaimResponse_Adjudication) another);
  }

  private boolean equalTo(ImmutableClaimResponse_Adjudication another) {
    return Objects.equals(amount, another.amount)
        && Objects.equals(extension, another.extension)
        && Objects.equals(value, another.value)
        && Objects.equals(id, another.id)
        && category.equals(another.category)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(reason, another.reason);
  }

  /**
   * Computes a hash code from attributes: {@code amount}, {@code extension}, {@code value}, {@code id}, {@code category}, {@code modifierExtension}, {@code reason}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(amount);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(value);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + category.hashCode();
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(reason);
    return h;
  }

  /**
   * Prints the immutable value {@code ClaimResponse_Adjudication} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("ClaimResponse_Adjudication{");
    if (amount != null) {
      builder.append("amount=").append(amount);
    }
    if (extension != null) {
      if (builder.length() > 27) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (value != null) {
      if (builder.length() > 27) builder.append(", ");
      builder.append("value=").append(value);
    }
    if (id != null) {
      if (builder.length() > 27) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (builder.length() > 27) builder.append(", ");
    builder.append("category=").append(category);
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (reason != null) {
      builder.append(", ");
      builder.append("reason=").append(reason);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "ClaimResponse_Adjudication", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements ClaimResponse_Adjudication {
    @Nullable Optional<Money> amount = Optional.empty();
    boolean amountIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<Decimal> value = Optional.empty();
    boolean valueIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable CodeableConcept category;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<CodeableConcept> reason = Optional.empty();
    boolean reasonIsSet;
    @JsonProperty("amount")
    public void setAmount(Optional<Money> amount) {
      this.amount = amount;
      this.amountIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("value")
    public void setValue(Optional<Decimal> value) {
      this.value = value;
      this.valueIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("category")
    public void setCategory(CodeableConcept category) {
      this.category = category;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("reason")
    public void setReason(Optional<CodeableConcept> reason) {
      this.reason = reason;
      this.reasonIsSet = true;
    }
    @Override
    public Optional<Money> amount() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Decimal> value() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public CodeableConcept category() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> reason() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableClaimResponse_Adjudication fromJson(Json json) {
    ImmutableClaimResponse_Adjudication.Builder builder = ((ImmutableClaimResponse_Adjudication.Builder) ImmutableClaimResponse_Adjudication.builder());
    if (json.amountIsSet) {
      builder.amount(json.amount);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.valueIsSet) {
      builder.value(json.value);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.category != null) {
      builder.category(json.category);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.reasonIsSet) {
      builder.reason(json.reason);
    }
    return (ImmutableClaimResponse_Adjudication) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ClaimResponse_Adjudication} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ClaimResponse_Adjudication instance
   */
  public static ClaimResponse_Adjudication copyOf(ClaimResponse_Adjudication instance) {
    if (instance instanceof ImmutableClaimResponse_Adjudication) {
      return (ImmutableClaimResponse_Adjudication) instance;
    }
    return ((ImmutableClaimResponse_Adjudication.Builder) ImmutableClaimResponse_Adjudication.builder())
        .amount(instance.amount())
        .extension(instance.extension())
        .value(instance.value())
        .id(instance.id())
        .category(instance.category())
        .modifierExtension(instance.modifierExtension())
        .reason(instance.reason())
        .build();
  }

  /**
   * Creates a builder for {@link ClaimResponse_Adjudication ClaimResponse_Adjudication}.
   * <pre>
   * ImmutableClaimResponse_Adjudication.builder()
   *    .amount(com.fhir.types.fhir.Money) // optional {@link ClaimResponse_Adjudication#amount() amount}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link ClaimResponse_Adjudication#extension() extension}
   *    .value(com.fhir.types.fhir.Decimal) // optional {@link ClaimResponse_Adjudication#value() value}
   *    .id(String) // optional {@link ClaimResponse_Adjudication#id() id}
   *    .category(com.fhir.types.fhir.CodeableConcept) // required {@link ClaimResponse_Adjudication#category() category}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link ClaimResponse_Adjudication#modifierExtension() modifierExtension}
   *    .reason(com.fhir.types.fhir.CodeableConcept) // optional {@link ClaimResponse_Adjudication#reason() reason}
   *    .build();
   * </pre>
   * @return A new ClaimResponse_Adjudication builder
   */
  public static CategoryBuildStage builder() {
    return new ImmutableClaimResponse_Adjudication.Builder();
  }

  /**
   * Builds instances of type {@link ClaimResponse_Adjudication ClaimResponse_Adjudication}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "ClaimResponse_Adjudication", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements CategoryBuildStage, BuildFinal {
    private static final long INIT_BIT_CATEGORY = 0x1L;
    private static final long OPT_BIT_AMOUNT = 0x1L;
    private static final long OPT_BIT_EXTENSION = 0x2L;
    private static final long OPT_BIT_VALUE = 0x4L;
    private static final long OPT_BIT_ID = 0x8L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x10L;
    private static final long OPT_BIT_REASON = 0x20L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable Money amount;
    private @Nullable List<Extension> extension;
    private @Nullable Decimal value;
    private @Nullable String id;
    private @Nullable CodeableConcept category;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable CodeableConcept reason;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link ClaimResponse_Adjudication#amount() amount} to amount.
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
     * Initializes the optional value {@link ClaimResponse_Adjudication#amount() amount} to amount.
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
     * Initializes the optional value {@link ClaimResponse_Adjudication#extension() extension} to extension.
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
     * Initializes the optional value {@link ClaimResponse_Adjudication#extension() extension} to extension.
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
     * Initializes the optional value {@link ClaimResponse_Adjudication#value() value} to value.
     * @param value The value for value
     * @return {@code this} builder for chained invocation
     */
    public final Builder value(Decimal value) {
      checkNotIsSet(valueIsSet(), "value");
      this.value = Objects.requireNonNull(value, "value");
      optBits |= OPT_BIT_VALUE;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse_Adjudication#value() value} to value.
     * @param value The value for value
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("value")
    public final Builder value(Optional<? extends Decimal> value) {
      checkNotIsSet(valueIsSet(), "value");
      this.value = value.orElse(null);
      optBits |= OPT_BIT_VALUE;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse_Adjudication#id() id} to id.
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
     * Initializes the optional value {@link ClaimResponse_Adjudication#id() id} to id.
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
     * Initializes the value for the {@link ClaimResponse_Adjudication#category() category} attribute.
     * @param category The value for category 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("category")
    public final Builder category(CodeableConcept category) {
      checkNotIsSet(categoryIsSet(), "category");
      this.category = Objects.requireNonNull(category, "category");
      initBits &= ~INIT_BIT_CATEGORY;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse_Adjudication#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ClaimResponse_Adjudication#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ClaimResponse_Adjudication#reason() reason} to reason.
     * @param reason The value for reason
     * @return {@code this} builder for chained invocation
     */
    public final Builder reason(CodeableConcept reason) {
      checkNotIsSet(reasonIsSet(), "reason");
      this.reason = Objects.requireNonNull(reason, "reason");
      optBits |= OPT_BIT_REASON;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse_Adjudication#reason() reason} to reason.
     * @param reason The value for reason
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("reason")
    public final Builder reason(Optional<? extends CodeableConcept> reason) {
      checkNotIsSet(reasonIsSet(), "reason");
      this.reason = reason.orElse(null);
      optBits |= OPT_BIT_REASON;
      return this;
    }

    /**
     * Builds a new {@link ClaimResponse_Adjudication ClaimResponse_Adjudication}.
     * @return An immutable instance of ClaimResponse_Adjudication
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ClaimResponse_Adjudication build() {
      checkRequiredAttributes();
      return new ImmutableClaimResponse_Adjudication(amount, extension, value, id, category, modifierExtension, reason);
    }

    private boolean amountIsSet() {
      return (optBits & OPT_BIT_AMOUNT) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean valueIsSet() {
      return (optBits & OPT_BIT_VALUE) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean reasonIsSet() {
      return (optBits & OPT_BIT_REASON) != 0;
    }

    private boolean categoryIsSet() {
      return (initBits & INIT_BIT_CATEGORY) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of ClaimResponse_Adjudication is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!categoryIsSet()) attributes.add("category");
      return "Cannot build ClaimResponse_Adjudication, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "ClaimResponse_Adjudication", generator = "Immutables")
  public interface CategoryBuildStage {
    /**
     * Initializes the value for the {@link ClaimResponse_Adjudication#category() category} attribute.
     * @param category The value for category 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal category(CodeableConcept category);
  }

  @Generated(from = "ClaimResponse_Adjudication", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link ClaimResponse_Adjudication#amount() amount} to amount.
     * @param amount The value for amount
     * @return {@code this} builder for chained invocation
     */
    BuildFinal amount(Money amount);

    /**
     * Initializes the optional value {@link ClaimResponse_Adjudication#amount() amount} to amount.
     * @param amount The value for amount
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal amount(Optional<? extends Money> amount);

    /**
     * Initializes the optional value {@link ClaimResponse_Adjudication#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link ClaimResponse_Adjudication#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link ClaimResponse_Adjudication#value() value} to value.
     * @param value The value for value
     * @return {@code this} builder for chained invocation
     */
    BuildFinal value(Decimal value);

    /**
     * Initializes the optional value {@link ClaimResponse_Adjudication#value() value} to value.
     * @param value The value for value
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal value(Optional<? extends Decimal> value);

    /**
     * Initializes the optional value {@link ClaimResponse_Adjudication#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(String id);

    /**
     * Initializes the optional value {@link ClaimResponse_Adjudication#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<String> id);

    /**
     * Initializes the optional value {@link ClaimResponse_Adjudication#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link ClaimResponse_Adjudication#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link ClaimResponse_Adjudication#reason() reason} to reason.
     * @param reason The value for reason
     * @return {@code this} builder for chained invocation
     */
    BuildFinal reason(CodeableConcept reason);

    /**
     * Initializes the optional value {@link ClaimResponse_Adjudication#reason() reason} to reason.
     * @param reason The value for reason
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal reason(Optional<? extends CodeableConcept> reason);

    /**
     * Builds a new {@link ClaimResponse_Adjudication ClaimResponse_Adjudication}.
     * @return An immutable instance of ClaimResponse_Adjudication
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    ClaimResponse_Adjudication build();
  }
}
