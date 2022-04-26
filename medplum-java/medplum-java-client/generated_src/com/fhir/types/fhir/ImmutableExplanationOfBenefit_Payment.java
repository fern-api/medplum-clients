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
 * Immutable implementation of {@link ExplanationOfBenefit_Payment}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableExplanationOfBenefit_Payment.builder()}.
 */
@Generated(from = "ExplanationOfBenefit_Payment", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableExplanationOfBenefit_Payment
    implements ExplanationOfBenefit_Payment {
  private final @Nullable String id;
  private final @Nullable CodeableConcept type;
  private final @Nullable CodeableConcept adjustmentReason;
  private final @Nullable Money adjustment;
  private final @Nullable Identifier identifier;
  private final @Nullable List<Extension> extension;
  private final @Nullable Money amount;
  private final @Nullable Date date;
  private final @Nullable List<Extension> modifierExtension;

  private ImmutableExplanationOfBenefit_Payment(
      @Nullable String id,
      @Nullable CodeableConcept type,
      @Nullable CodeableConcept adjustmentReason,
      @Nullable Money adjustment,
      @Nullable Identifier identifier,
      @Nullable List<Extension> extension,
      @Nullable Money amount,
      @Nullable Date date,
      @Nullable List<Extension> modifierExtension) {
    this.id = id;
    this.type = type;
    this.adjustmentReason = adjustmentReason;
    this.adjustment = adjustment;
    this.identifier = identifier;
    this.extension = extension;
    this.amount = amount;
    this.date = date;
    this.modifierExtension = modifierExtension;
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
   * @return The value of the {@code adjustmentReason} attribute
   */
  @JsonProperty("adjustmentReason")
  @Override
  public Optional<CodeableConcept> adjustmentReason() {
    return Optional.ofNullable(adjustmentReason);
  }

  /**
   * @return The value of the {@code adjustment} attribute
   */
  @JsonProperty("adjustment")
  @Override
  public Optional<Money> adjustment() {
    return Optional.ofNullable(adjustment);
  }

  /**
   * @return The value of the {@code identifier} attribute
   */
  @JsonProperty("identifier")
  @Override
  public Optional<Identifier> identifier() {
    return Optional.ofNullable(identifier);
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
   * @return The value of the {@code date} attribute
   */
  @JsonProperty("date")
  @Override
  public Optional<Date> date() {
    return Optional.ofNullable(date);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_Payment#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_Payment withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableExplanationOfBenefit_Payment(
        newValue,
        this.type,
        this.adjustmentReason,
        this.adjustment,
        this.identifier,
        this.extension,
        this.amount,
        this.date,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_Payment#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_Payment withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableExplanationOfBenefit_Payment(
        value,
        this.type,
        this.adjustmentReason,
        this.adjustment,
        this.identifier,
        this.extension,
        this.amount,
        this.date,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_Payment#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_Payment withType(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutableExplanationOfBenefit_Payment(
        this.id,
        newValue,
        this.adjustmentReason,
        this.adjustment,
        this.identifier,
        this.extension,
        this.amount,
        this.date,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_Payment#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_Payment withType(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutableExplanationOfBenefit_Payment(
        this.id,
        value,
        this.adjustmentReason,
        this.adjustment,
        this.identifier,
        this.extension,
        this.amount,
        this.date,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_Payment#adjustmentReason() adjustmentReason} attribute.
   * @param value The value for adjustmentReason
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_Payment withAdjustmentReason(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "adjustmentReason");
    if (this.adjustmentReason == newValue) return this;
    return new ImmutableExplanationOfBenefit_Payment(
        this.id,
        this.type,
        newValue,
        this.adjustment,
        this.identifier,
        this.extension,
        this.amount,
        this.date,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_Payment#adjustmentReason() adjustmentReason} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for adjustmentReason
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_Payment withAdjustmentReason(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.adjustmentReason == value) return this;
    return new ImmutableExplanationOfBenefit_Payment(
        this.id,
        this.type,
        value,
        this.adjustment,
        this.identifier,
        this.extension,
        this.amount,
        this.date,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_Payment#adjustment() adjustment} attribute.
   * @param value The value for adjustment
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_Payment withAdjustment(Money value) {
    @Nullable Money newValue = Objects.requireNonNull(value, "adjustment");
    if (this.adjustment == newValue) return this;
    return new ImmutableExplanationOfBenefit_Payment(
        this.id,
        this.type,
        this.adjustmentReason,
        newValue,
        this.identifier,
        this.extension,
        this.amount,
        this.date,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_Payment#adjustment() adjustment} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for adjustment
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_Payment withAdjustment(Optional<? extends Money> optional) {
    @Nullable Money value = optional.orElse(null);
    if (this.adjustment == value) return this;
    return new ImmutableExplanationOfBenefit_Payment(
        this.id,
        this.type,
        this.adjustmentReason,
        value,
        this.identifier,
        this.extension,
        this.amount,
        this.date,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_Payment#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_Payment withIdentifier(Identifier value) {
    @Nullable Identifier newValue = Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableExplanationOfBenefit_Payment(
        this.id,
        this.type,
        this.adjustmentReason,
        this.adjustment,
        newValue,
        this.extension,
        this.amount,
        this.date,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_Payment#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_Payment withIdentifier(Optional<? extends Identifier> optional) {
    @Nullable Identifier value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableExplanationOfBenefit_Payment(
        this.id,
        this.type,
        this.adjustmentReason,
        this.adjustment,
        value,
        this.extension,
        this.amount,
        this.date,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_Payment#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_Payment withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableExplanationOfBenefit_Payment(
        this.id,
        this.type,
        this.adjustmentReason,
        this.adjustment,
        this.identifier,
        newValue,
        this.amount,
        this.date,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_Payment#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_Payment withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableExplanationOfBenefit_Payment(
        this.id,
        this.type,
        this.adjustmentReason,
        this.adjustment,
        this.identifier,
        value,
        this.amount,
        this.date,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_Payment#amount() amount} attribute.
   * @param value The value for amount
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_Payment withAmount(Money value) {
    @Nullable Money newValue = Objects.requireNonNull(value, "amount");
    if (this.amount == newValue) return this;
    return new ImmutableExplanationOfBenefit_Payment(
        this.id,
        this.type,
        this.adjustmentReason,
        this.adjustment,
        this.identifier,
        this.extension,
        newValue,
        this.date,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_Payment#amount() amount} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for amount
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_Payment withAmount(Optional<? extends Money> optional) {
    @Nullable Money value = optional.orElse(null);
    if (this.amount == value) return this;
    return new ImmutableExplanationOfBenefit_Payment(
        this.id,
        this.type,
        this.adjustmentReason,
        this.adjustment,
        this.identifier,
        this.extension,
        value,
        this.date,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_Payment#date() date} attribute.
   * @param value The value for date
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_Payment withDate(Date value) {
    @Nullable Date newValue = Objects.requireNonNull(value, "date");
    if (this.date == newValue) return this;
    return new ImmutableExplanationOfBenefit_Payment(
        this.id,
        this.type,
        this.adjustmentReason,
        this.adjustment,
        this.identifier,
        this.extension,
        this.amount,
        newValue,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_Payment#date() date} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for date
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_Payment withDate(Optional<? extends Date> optional) {
    @Nullable Date value = optional.orElse(null);
    if (this.date == value) return this;
    return new ImmutableExplanationOfBenefit_Payment(
        this.id,
        this.type,
        this.adjustmentReason,
        this.adjustment,
        this.identifier,
        this.extension,
        this.amount,
        value,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_Payment#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_Payment withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableExplanationOfBenefit_Payment(
        this.id,
        this.type,
        this.adjustmentReason,
        this.adjustment,
        this.identifier,
        this.extension,
        this.amount,
        this.date,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_Payment#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_Payment withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableExplanationOfBenefit_Payment(
        this.id,
        this.type,
        this.adjustmentReason,
        this.adjustment,
        this.identifier,
        this.extension,
        this.amount,
        this.date,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableExplanationOfBenefit_Payment} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableExplanationOfBenefit_Payment
        && equalTo((ImmutableExplanationOfBenefit_Payment) another);
  }

  private boolean equalTo(ImmutableExplanationOfBenefit_Payment another) {
    return Objects.equals(id, another.id)
        && Objects.equals(type, another.type)
        && Objects.equals(adjustmentReason, another.adjustmentReason)
        && Objects.equals(adjustment, another.adjustment)
        && Objects.equals(identifier, another.identifier)
        && Objects.equals(extension, another.extension)
        && Objects.equals(amount, another.amount)
        && Objects.equals(date, another.date)
        && Objects.equals(modifierExtension, another.modifierExtension);
  }

  /**
   * Computes a hash code from attributes: {@code id}, {@code type}, {@code adjustmentReason}, {@code adjustment}, {@code identifier}, {@code extension}, {@code amount}, {@code date}, {@code modifierExtension}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(type);
    h += (h << 5) + Objects.hashCode(adjustmentReason);
    h += (h << 5) + Objects.hashCode(adjustment);
    h += (h << 5) + Objects.hashCode(identifier);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(amount);
    h += (h << 5) + Objects.hashCode(date);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    return h;
  }

  /**
   * Prints the immutable value {@code ExplanationOfBenefit_Payment} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("ExplanationOfBenefit_Payment{");
    if (id != null) {
      builder.append("id=").append(id);
    }
    if (type != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("type=").append(type);
    }
    if (adjustmentReason != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("adjustmentReason=").append(adjustmentReason);
    }
    if (adjustment != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("adjustment=").append(adjustment);
    }
    if (identifier != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (extension != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (amount != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("amount=").append(amount);
    }
    if (date != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("date=").append(date);
    }
    if (modifierExtension != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "ExplanationOfBenefit_Payment", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements ExplanationOfBenefit_Payment {
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<CodeableConcept> type = Optional.empty();
    boolean typeIsSet;
    @Nullable Optional<CodeableConcept> adjustmentReason = Optional.empty();
    boolean adjustmentReasonIsSet;
    @Nullable Optional<Money> adjustment = Optional.empty();
    boolean adjustmentIsSet;
    @Nullable Optional<Identifier> identifier = Optional.empty();
    boolean identifierIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<Money> amount = Optional.empty();
    boolean amountIsSet;
    @Nullable Optional<Date> date = Optional.empty();
    boolean dateIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
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
    @JsonProperty("adjustmentReason")
    public void setAdjustmentReason(Optional<CodeableConcept> adjustmentReason) {
      this.adjustmentReason = adjustmentReason;
      this.adjustmentReasonIsSet = true;
    }
    @JsonProperty("adjustment")
    public void setAdjustment(Optional<Money> adjustment) {
      this.adjustment = adjustment;
      this.adjustmentIsSet = true;
    }
    @JsonProperty("identifier")
    public void setIdentifier(Optional<Identifier> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
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
    @JsonProperty("date")
    public void setDate(Optional<Date> date) {
      this.date = date;
      this.dateIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> type() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> adjustmentReason() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Money> adjustment() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Identifier> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Money> amount() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Date> date() { throw new UnsupportedOperationException(); }
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
  static ImmutableExplanationOfBenefit_Payment fromJson(Json json) {
    ImmutableExplanationOfBenefit_Payment.Builder builder = ImmutableExplanationOfBenefit_Payment.builder();
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.adjustmentReasonIsSet) {
      builder.adjustmentReason(json.adjustmentReason);
    }
    if (json.adjustmentIsSet) {
      builder.adjustment(json.adjustment);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.amountIsSet) {
      builder.amount(json.amount);
    }
    if (json.dateIsSet) {
      builder.date(json.date);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    return (ImmutableExplanationOfBenefit_Payment) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ExplanationOfBenefit_Payment} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ExplanationOfBenefit_Payment instance
   */
  public static ExplanationOfBenefit_Payment copyOf(ExplanationOfBenefit_Payment instance) {
    if (instance instanceof ImmutableExplanationOfBenefit_Payment) {
      return (ImmutableExplanationOfBenefit_Payment) instance;
    }
    return ImmutableExplanationOfBenefit_Payment.builder()
        .id(instance.id())
        .type(instance.type())
        .adjustmentReason(instance.adjustmentReason())
        .adjustment(instance.adjustment())
        .identifier(instance.identifier())
        .extension(instance.extension())
        .amount(instance.amount())
        .date(instance.date())
        .modifierExtension(instance.modifierExtension())
        .build();
  }

  /**
   * Creates a builder for {@link ExplanationOfBenefit_Payment ExplanationOfBenefit_Payment}.
   * <pre>
   * ImmutableExplanationOfBenefit_Payment.builder()
   *    .id(String) // optional {@link ExplanationOfBenefit_Payment#id() id}
   *    .type(com.fhir.types.fhir.CodeableConcept) // optional {@link ExplanationOfBenefit_Payment#type() type}
   *    .adjustmentReason(com.fhir.types.fhir.CodeableConcept) // optional {@link ExplanationOfBenefit_Payment#adjustmentReason() adjustmentReason}
   *    .adjustment(com.fhir.types.fhir.Money) // optional {@link ExplanationOfBenefit_Payment#adjustment() adjustment}
   *    .identifier(com.fhir.types.fhir.Identifier) // optional {@link ExplanationOfBenefit_Payment#identifier() identifier}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link ExplanationOfBenefit_Payment#extension() extension}
   *    .amount(com.fhir.types.fhir.Money) // optional {@link ExplanationOfBenefit_Payment#amount() amount}
   *    .date(com.fhir.types.fhir.Date) // optional {@link ExplanationOfBenefit_Payment#date() date}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link ExplanationOfBenefit_Payment#modifierExtension() modifierExtension}
   *    .build();
   * </pre>
   * @return A new ExplanationOfBenefit_Payment builder
   */
  public static ImmutableExplanationOfBenefit_Payment.Builder builder() {
    return new ImmutableExplanationOfBenefit_Payment.Builder();
  }

  /**
   * Builds instances of type {@link ExplanationOfBenefit_Payment ExplanationOfBenefit_Payment}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "ExplanationOfBenefit_Payment", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_ID = 0x1L;
    private static final long OPT_BIT_TYPE = 0x2L;
    private static final long OPT_BIT_ADJUSTMENT_REASON = 0x4L;
    private static final long OPT_BIT_ADJUSTMENT = 0x8L;
    private static final long OPT_BIT_IDENTIFIER = 0x10L;
    private static final long OPT_BIT_EXTENSION = 0x20L;
    private static final long OPT_BIT_AMOUNT = 0x40L;
    private static final long OPT_BIT_DATE = 0x80L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x100L;
    private long optBits;

    private @Nullable String id;
    private @Nullable CodeableConcept type;
    private @Nullable CodeableConcept adjustmentReason;
    private @Nullable Money adjustment;
    private @Nullable Identifier identifier;
    private @Nullable List<Extension> extension;
    private @Nullable Money amount;
    private @Nullable Date date;
    private @Nullable List<Extension> modifierExtension;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Payment#id() id} to id.
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
     * Initializes the optional value {@link ExplanationOfBenefit_Payment#id() id} to id.
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
     * Initializes the optional value {@link ExplanationOfBenefit_Payment#type() type} to type.
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
     * Initializes the optional value {@link ExplanationOfBenefit_Payment#type() type} to type.
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
     * Initializes the optional value {@link ExplanationOfBenefit_Payment#adjustmentReason() adjustmentReason} to adjustmentReason.
     * @param adjustmentReason The value for adjustmentReason
     * @return {@code this} builder for chained invocation
     */
    public final Builder adjustmentReason(CodeableConcept adjustmentReason) {
      checkNotIsSet(adjustmentReasonIsSet(), "adjustmentReason");
      this.adjustmentReason = Objects.requireNonNull(adjustmentReason, "adjustmentReason");
      optBits |= OPT_BIT_ADJUSTMENT_REASON;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Payment#adjustmentReason() adjustmentReason} to adjustmentReason.
     * @param adjustmentReason The value for adjustmentReason
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("adjustmentReason")
    public final Builder adjustmentReason(Optional<? extends CodeableConcept> adjustmentReason) {
      checkNotIsSet(adjustmentReasonIsSet(), "adjustmentReason");
      this.adjustmentReason = adjustmentReason.orElse(null);
      optBits |= OPT_BIT_ADJUSTMENT_REASON;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Payment#adjustment() adjustment} to adjustment.
     * @param adjustment The value for adjustment
     * @return {@code this} builder for chained invocation
     */
    public final Builder adjustment(Money adjustment) {
      checkNotIsSet(adjustmentIsSet(), "adjustment");
      this.adjustment = Objects.requireNonNull(adjustment, "adjustment");
      optBits |= OPT_BIT_ADJUSTMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Payment#adjustment() adjustment} to adjustment.
     * @param adjustment The value for adjustment
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("adjustment")
    public final Builder adjustment(Optional<? extends Money> adjustment) {
      checkNotIsSet(adjustmentIsSet(), "adjustment");
      this.adjustment = adjustment.orElse(null);
      optBits |= OPT_BIT_ADJUSTMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Payment#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    public final Builder identifier(Identifier identifier) {
      checkNotIsSet(identifierIsSet(), "identifier");
      this.identifier = Objects.requireNonNull(identifier, "identifier");
      optBits |= OPT_BIT_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Payment#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("identifier")
    public final Builder identifier(Optional<? extends Identifier> identifier) {
      checkNotIsSet(identifierIsSet(), "identifier");
      this.identifier = identifier.orElse(null);
      optBits |= OPT_BIT_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Payment#extension() extension} to extension.
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
     * Initializes the optional value {@link ExplanationOfBenefit_Payment#extension() extension} to extension.
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
     * Initializes the optional value {@link ExplanationOfBenefit_Payment#amount() amount} to amount.
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
     * Initializes the optional value {@link ExplanationOfBenefit_Payment#amount() amount} to amount.
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
     * Initializes the optional value {@link ExplanationOfBenefit_Payment#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for chained invocation
     */
    public final Builder date(Date date) {
      checkNotIsSet(dateIsSet(), "date");
      this.date = Objects.requireNonNull(date, "date");
      optBits |= OPT_BIT_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Payment#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("date")
    public final Builder date(Optional<? extends Date> date) {
      checkNotIsSet(dateIsSet(), "date");
      this.date = date.orElse(null);
      optBits |= OPT_BIT_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Payment#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ExplanationOfBenefit_Payment#modifierExtension() modifierExtension} to modifierExtension.
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
     * Builds a new {@link ExplanationOfBenefit_Payment ExplanationOfBenefit_Payment}.
     * @return An immutable instance of ExplanationOfBenefit_Payment
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ExplanationOfBenefit_Payment build() {
      return new ImmutableExplanationOfBenefit_Payment(
          id,
          type,
          adjustmentReason,
          adjustment,
          identifier,
          extension,
          amount,
          date,
          modifierExtension);
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean adjustmentReasonIsSet() {
      return (optBits & OPT_BIT_ADJUSTMENT_REASON) != 0;
    }

    private boolean adjustmentIsSet() {
      return (optBits & OPT_BIT_ADJUSTMENT) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean amountIsSet() {
      return (optBits & OPT_BIT_AMOUNT) != 0;
    }

    private boolean dateIsSet() {
      return (optBits & OPT_BIT_DATE) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of ExplanationOfBenefit_Payment is strict, attribute is already set: ".concat(name));
    }
  }
}
