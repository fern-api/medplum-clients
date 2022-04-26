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
 * Immutable implementation of {@link ExplanationOfBenefit_Adjudication}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableExplanationOfBenefit_Adjudication.builder()}.
 */
@Generated(from = "ExplanationOfBenefit_Adjudication", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableExplanationOfBenefit_Adjudication
    implements ExplanationOfBenefit_Adjudication {
  private final @Nullable Money amount;
  private final @Nullable String id;
  private final @Nullable CodeableConcept reason;
  private final @Nullable Decimal value;
  private final @Nullable List<Extension> extension;
  private final CodeableConcept category;
  private final @Nullable List<Extension> modifierExtension;

  private ImmutableExplanationOfBenefit_Adjudication(
      @Nullable Money amount,
      @Nullable String id,
      @Nullable CodeableConcept reason,
      @Nullable Decimal value,
      @Nullable List<Extension> extension,
      CodeableConcept category,
      @Nullable List<Extension> modifierExtension) {
    this.amount = amount;
    this.id = id;
    this.reason = reason;
    this.value = value;
    this.extension = extension;
    this.category = category;
    this.modifierExtension = modifierExtension;
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
   * @return The value of the {@code reason} attribute
   */
  @JsonProperty("reason")
  @Override
  public Optional<CodeableConcept> reason() {
    return Optional.ofNullable(reason);
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
   * @return The value of the {@code extension} attribute
   */
  @JsonProperty("extension")
  @Override
  public Optional<List<Extension>> extension() {
    return Optional.ofNullable(extension);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_Adjudication#amount() amount} attribute.
   * @param value The value for amount
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_Adjudication withAmount(Money value) {
    @Nullable Money newValue = Objects.requireNonNull(value, "amount");
    if (this.amount == newValue) return this;
    return new ImmutableExplanationOfBenefit_Adjudication(
        newValue,
        this.id,
        this.reason,
        this.value,
        this.extension,
        this.category,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_Adjudication#amount() amount} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for amount
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_Adjudication withAmount(Optional<? extends Money> optional) {
    @Nullable Money value = optional.orElse(null);
    if (this.amount == value) return this;
    return new ImmutableExplanationOfBenefit_Adjudication(value, this.id, this.reason, this.value, this.extension, this.category, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_Adjudication#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_Adjudication withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableExplanationOfBenefit_Adjudication(
        this.amount,
        newValue,
        this.reason,
        this.value,
        this.extension,
        this.category,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_Adjudication#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_Adjudication withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableExplanationOfBenefit_Adjudication(
        this.amount,
        value,
        this.reason,
        this.value,
        this.extension,
        this.category,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_Adjudication#reason() reason} attribute.
   * @param value The value for reason
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_Adjudication withReason(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "reason");
    if (this.reason == newValue) return this;
    return new ImmutableExplanationOfBenefit_Adjudication(
        this.amount,
        this.id,
        newValue,
        this.value,
        this.extension,
        this.category,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_Adjudication#reason() reason} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for reason
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_Adjudication withReason(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.reason == value) return this;
    return new ImmutableExplanationOfBenefit_Adjudication(this.amount, this.id, value, this.value, this.extension, this.category, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_Adjudication#value() value} attribute.
   * @param value The value for value
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_Adjudication withValue(Decimal value) {
    @Nullable Decimal newValue = Objects.requireNonNull(value, "value");
    if (this.value == newValue) return this;
    return new ImmutableExplanationOfBenefit_Adjudication(
        this.amount,
        this.id,
        this.reason,
        newValue,
        this.extension,
        this.category,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_Adjudication#value() value} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for value
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_Adjudication withValue(Optional<? extends Decimal> optional) {
    @Nullable Decimal value = optional.orElse(null);
    if (this.value == value) return this;
    return new ImmutableExplanationOfBenefit_Adjudication(this.amount, this.id, this.reason, value, this.extension, this.category, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_Adjudication#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_Adjudication withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableExplanationOfBenefit_Adjudication(this.amount, this.id, this.reason, this.value, newValue, this.category, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_Adjudication#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_Adjudication withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableExplanationOfBenefit_Adjudication(this.amount, this.id, this.reason, this.value, value, this.category, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ExplanationOfBenefit_Adjudication#category() category} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for category
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableExplanationOfBenefit_Adjudication withCategory(CodeableConcept value) {
    if (this.category == value) return this;
    CodeableConcept newValue = Objects.requireNonNull(value, "category");
    return new ImmutableExplanationOfBenefit_Adjudication(this.amount, this.id, this.reason, this.value, this.extension, newValue, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_Adjudication#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_Adjudication withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableExplanationOfBenefit_Adjudication(this.amount, this.id, this.reason, this.value, this.extension, this.category, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_Adjudication#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_Adjudication withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableExplanationOfBenefit_Adjudication(this.amount, this.id, this.reason, this.value, this.extension, this.category, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableExplanationOfBenefit_Adjudication} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableExplanationOfBenefit_Adjudication
        && equalTo((ImmutableExplanationOfBenefit_Adjudication) another);
  }

  private boolean equalTo(ImmutableExplanationOfBenefit_Adjudication another) {
    return Objects.equals(amount, another.amount)
        && Objects.equals(id, another.id)
        && Objects.equals(reason, another.reason)
        && Objects.equals(value, another.value)
        && Objects.equals(extension, another.extension)
        && category.equals(another.category)
        && Objects.equals(modifierExtension, another.modifierExtension);
  }

  /**
   * Computes a hash code from attributes: {@code amount}, {@code id}, {@code reason}, {@code value}, {@code extension}, {@code category}, {@code modifierExtension}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(amount);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(reason);
    h += (h << 5) + Objects.hashCode(value);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + category.hashCode();
    h += (h << 5) + Objects.hashCode(modifierExtension);
    return h;
  }

  /**
   * Prints the immutable value {@code ExplanationOfBenefit_Adjudication} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("ExplanationOfBenefit_Adjudication{");
    if (amount != null) {
      builder.append("amount=").append(amount);
    }
    if (id != null) {
      if (builder.length() > 34) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (reason != null) {
      if (builder.length() > 34) builder.append(", ");
      builder.append("reason=").append(reason);
    }
    if (value != null) {
      if (builder.length() > 34) builder.append(", ");
      builder.append("value=").append(value);
    }
    if (extension != null) {
      if (builder.length() > 34) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (builder.length() > 34) builder.append(", ");
    builder.append("category=").append(category);
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "ExplanationOfBenefit_Adjudication", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements ExplanationOfBenefit_Adjudication {
    @Nullable Optional<Money> amount = Optional.empty();
    boolean amountIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<CodeableConcept> reason = Optional.empty();
    boolean reasonIsSet;
    @Nullable Optional<Decimal> value = Optional.empty();
    boolean valueIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable CodeableConcept category;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
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
    @JsonProperty("reason")
    public void setReason(Optional<CodeableConcept> reason) {
      this.reason = reason;
      this.reasonIsSet = true;
    }
    @JsonProperty("value")
    public void setValue(Optional<Decimal> value) {
      this.value = value;
      this.valueIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
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
    @Override
    public Optional<Money> amount() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> reason() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Decimal> value() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public CodeableConcept category() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableExplanationOfBenefit_Adjudication fromJson(Json json) {
    ImmutableExplanationOfBenefit_Adjudication.Builder builder = ((ImmutableExplanationOfBenefit_Adjudication.Builder) ImmutableExplanationOfBenefit_Adjudication.builder());
    if (json.amountIsSet) {
      builder.amount(json.amount);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.reasonIsSet) {
      builder.reason(json.reason);
    }
    if (json.valueIsSet) {
      builder.value(json.value);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.category != null) {
      builder.category(json.category);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    return (ImmutableExplanationOfBenefit_Adjudication) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ExplanationOfBenefit_Adjudication} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ExplanationOfBenefit_Adjudication instance
   */
  public static ExplanationOfBenefit_Adjudication copyOf(ExplanationOfBenefit_Adjudication instance) {
    if (instance instanceof ImmutableExplanationOfBenefit_Adjudication) {
      return (ImmutableExplanationOfBenefit_Adjudication) instance;
    }
    return ((ImmutableExplanationOfBenefit_Adjudication.Builder) ImmutableExplanationOfBenefit_Adjudication.builder())
        .amount(instance.amount())
        .id(instance.id())
        .reason(instance.reason())
        .value(instance.value())
        .extension(instance.extension())
        .category(instance.category())
        .modifierExtension(instance.modifierExtension())
        .build();
  }

  /**
   * Creates a builder for {@link ExplanationOfBenefit_Adjudication ExplanationOfBenefit_Adjudication}.
   * <pre>
   * ImmutableExplanationOfBenefit_Adjudication.builder()
   *    .amount(com.fhir.types.fhir.Money) // optional {@link ExplanationOfBenefit_Adjudication#amount() amount}
   *    .id(String) // optional {@link ExplanationOfBenefit_Adjudication#id() id}
   *    .reason(com.fhir.types.fhir.CodeableConcept) // optional {@link ExplanationOfBenefit_Adjudication#reason() reason}
   *    .value(com.fhir.types.fhir.Decimal) // optional {@link ExplanationOfBenefit_Adjudication#value() value}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link ExplanationOfBenefit_Adjudication#extension() extension}
   *    .category(com.fhir.types.fhir.CodeableConcept) // required {@link ExplanationOfBenefit_Adjudication#category() category}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link ExplanationOfBenefit_Adjudication#modifierExtension() modifierExtension}
   *    .build();
   * </pre>
   * @return A new ExplanationOfBenefit_Adjudication builder
   */
  public static CategoryBuildStage builder() {
    return new ImmutableExplanationOfBenefit_Adjudication.Builder();
  }

  /**
   * Builds instances of type {@link ExplanationOfBenefit_Adjudication ExplanationOfBenefit_Adjudication}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "ExplanationOfBenefit_Adjudication", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements CategoryBuildStage, BuildFinal {
    private static final long INIT_BIT_CATEGORY = 0x1L;
    private static final long OPT_BIT_AMOUNT = 0x1L;
    private static final long OPT_BIT_ID = 0x2L;
    private static final long OPT_BIT_REASON = 0x4L;
    private static final long OPT_BIT_VALUE = 0x8L;
    private static final long OPT_BIT_EXTENSION = 0x10L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x20L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable Money amount;
    private @Nullable String id;
    private @Nullable CodeableConcept reason;
    private @Nullable Decimal value;
    private @Nullable List<Extension> extension;
    private @Nullable CodeableConcept category;
    private @Nullable List<Extension> modifierExtension;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Adjudication#amount() amount} to amount.
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
     * Initializes the optional value {@link ExplanationOfBenefit_Adjudication#amount() amount} to amount.
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
     * Initializes the optional value {@link ExplanationOfBenefit_Adjudication#id() id} to id.
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
     * Initializes the optional value {@link ExplanationOfBenefit_Adjudication#id() id} to id.
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
     * Initializes the optional value {@link ExplanationOfBenefit_Adjudication#reason() reason} to reason.
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
     * Initializes the optional value {@link ExplanationOfBenefit_Adjudication#reason() reason} to reason.
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
     * Initializes the optional value {@link ExplanationOfBenefit_Adjudication#value() value} to value.
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
     * Initializes the optional value {@link ExplanationOfBenefit_Adjudication#value() value} to value.
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
     * Initializes the optional value {@link ExplanationOfBenefit_Adjudication#extension() extension} to extension.
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
     * Initializes the optional value {@link ExplanationOfBenefit_Adjudication#extension() extension} to extension.
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
     * Initializes the value for the {@link ExplanationOfBenefit_Adjudication#category() category} attribute.
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
     * Initializes the optional value {@link ExplanationOfBenefit_Adjudication#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ExplanationOfBenefit_Adjudication#modifierExtension() modifierExtension} to modifierExtension.
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
     * Builds a new {@link ExplanationOfBenefit_Adjudication ExplanationOfBenefit_Adjudication}.
     * @return An immutable instance of ExplanationOfBenefit_Adjudication
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ExplanationOfBenefit_Adjudication build() {
      checkRequiredAttributes();
      return new ImmutableExplanationOfBenefit_Adjudication(amount, id, reason, value, extension, category, modifierExtension);
    }

    private boolean amountIsSet() {
      return (optBits & OPT_BIT_AMOUNT) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean reasonIsSet() {
      return (optBits & OPT_BIT_REASON) != 0;
    }

    private boolean valueIsSet() {
      return (optBits & OPT_BIT_VALUE) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean categoryIsSet() {
      return (initBits & INIT_BIT_CATEGORY) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of ExplanationOfBenefit_Adjudication is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!categoryIsSet()) attributes.add("category");
      return "Cannot build ExplanationOfBenefit_Adjudication, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "ExplanationOfBenefit_Adjudication", generator = "Immutables")
  public interface CategoryBuildStage {
    /**
     * Initializes the value for the {@link ExplanationOfBenefit_Adjudication#category() category} attribute.
     * @param category The value for category 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal category(CodeableConcept category);
  }

  @Generated(from = "ExplanationOfBenefit_Adjudication", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Adjudication#amount() amount} to amount.
     * @param amount The value for amount
     * @return {@code this} builder for chained invocation
     */
    BuildFinal amount(Money amount);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Adjudication#amount() amount} to amount.
     * @param amount The value for amount
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal amount(Optional<? extends Money> amount);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Adjudication#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(String id);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Adjudication#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<String> id);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Adjudication#reason() reason} to reason.
     * @param reason The value for reason
     * @return {@code this} builder for chained invocation
     */
    BuildFinal reason(CodeableConcept reason);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Adjudication#reason() reason} to reason.
     * @param reason The value for reason
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal reason(Optional<? extends CodeableConcept> reason);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Adjudication#value() value} to value.
     * @param value The value for value
     * @return {@code this} builder for chained invocation
     */
    BuildFinal value(Decimal value);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Adjudication#value() value} to value.
     * @param value The value for value
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal value(Optional<? extends Decimal> value);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Adjudication#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Adjudication#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Adjudication#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Adjudication#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Builds a new {@link ExplanationOfBenefit_Adjudication ExplanationOfBenefit_Adjudication}.
     * @return An immutable instance of ExplanationOfBenefit_Adjudication
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    ExplanationOfBenefit_Adjudication build();
  }
}
