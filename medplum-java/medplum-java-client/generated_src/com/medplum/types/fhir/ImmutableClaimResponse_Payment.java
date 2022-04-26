package com.medplum.types.fhir;

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
 * Immutable implementation of {@link ClaimResponse_Payment}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableClaimResponse_Payment.builder()}.
 */
@Generated(from = "ClaimResponse_Payment", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableClaimResponse_Payment implements ClaimResponse_Payment {
  private final @Nullable List<Extension> extension;
  private final @Nullable Money adjustment;
  private final Money amount;
  private final @Nullable Date date;
  private final CodeableConcept type;
  private final @Nullable String id;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable CodeableConcept adjustmentReason;
  private final @Nullable Identifier identifier;

  private ImmutableClaimResponse_Payment(
      @Nullable List<Extension> extension,
      @Nullable Money adjustment,
      Money amount,
      @Nullable Date date,
      CodeableConcept type,
      @Nullable String id,
      @Nullable List<Extension> modifierExtension,
      @Nullable CodeableConcept adjustmentReason,
      @Nullable Identifier identifier) {
    this.extension = extension;
    this.adjustment = adjustment;
    this.amount = amount;
    this.date = date;
    this.type = type;
    this.id = id;
    this.modifierExtension = modifierExtension;
    this.adjustmentReason = adjustmentReason;
    this.identifier = identifier;
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
   * @return The value of the {@code adjustment} attribute
   */
  @JsonProperty("adjustment")
  @Override
  public Optional<Money> adjustment() {
    return Optional.ofNullable(adjustment);
  }

  /**
   * @return The value of the {@code amount} attribute
   */
  @JsonProperty("amount")
  @Override
  public Money amount() {
    return amount;
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
   * @return The value of the {@code type} attribute
   */
  @JsonProperty("type")
  @Override
  public CodeableConcept type() {
    return type;
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
   * @return The value of the {@code adjustmentReason} attribute
   */
  @JsonProperty("adjustmentReason")
  @Override
  public Optional<CodeableConcept> adjustmentReason() {
    return Optional.ofNullable(adjustmentReason);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse_Payment#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse_Payment withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableClaimResponse_Payment(
        newValue,
        this.adjustment,
        this.amount,
        this.date,
        this.type,
        this.id,
        this.modifierExtension,
        this.adjustmentReason,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse_Payment#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaimResponse_Payment withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableClaimResponse_Payment(
        value,
        this.adjustment,
        this.amount,
        this.date,
        this.type,
        this.id,
        this.modifierExtension,
        this.adjustmentReason,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse_Payment#adjustment() adjustment} attribute.
   * @param value The value for adjustment
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse_Payment withAdjustment(Money value) {
    @Nullable Money newValue = Objects.requireNonNull(value, "adjustment");
    if (this.adjustment == newValue) return this;
    return new ImmutableClaimResponse_Payment(
        this.extension,
        newValue,
        this.amount,
        this.date,
        this.type,
        this.id,
        this.modifierExtension,
        this.adjustmentReason,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse_Payment#adjustment() adjustment} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for adjustment
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaimResponse_Payment withAdjustment(Optional<? extends Money> optional) {
    @Nullable Money value = optional.orElse(null);
    if (this.adjustment == value) return this;
    return new ImmutableClaimResponse_Payment(
        this.extension,
        value,
        this.amount,
        this.date,
        this.type,
        this.id,
        this.modifierExtension,
        this.adjustmentReason,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ClaimResponse_Payment#amount() amount} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for amount
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableClaimResponse_Payment withAmount(Money value) {
    if (this.amount == value) return this;
    Money newValue = Objects.requireNonNull(value, "amount");
    return new ImmutableClaimResponse_Payment(
        this.extension,
        this.adjustment,
        newValue,
        this.date,
        this.type,
        this.id,
        this.modifierExtension,
        this.adjustmentReason,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse_Payment#date() date} attribute.
   * @param value The value for date
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse_Payment withDate(Date value) {
    @Nullable Date newValue = Objects.requireNonNull(value, "date");
    if (this.date == newValue) return this;
    return new ImmutableClaimResponse_Payment(
        this.extension,
        this.adjustment,
        this.amount,
        newValue,
        this.type,
        this.id,
        this.modifierExtension,
        this.adjustmentReason,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse_Payment#date() date} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for date
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaimResponse_Payment withDate(Optional<? extends Date> optional) {
    @Nullable Date value = optional.orElse(null);
    if (this.date == value) return this;
    return new ImmutableClaimResponse_Payment(
        this.extension,
        this.adjustment,
        this.amount,
        value,
        this.type,
        this.id,
        this.modifierExtension,
        this.adjustmentReason,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ClaimResponse_Payment#type() type} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for type
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableClaimResponse_Payment withType(CodeableConcept value) {
    if (this.type == value) return this;
    CodeableConcept newValue = Objects.requireNonNull(value, "type");
    return new ImmutableClaimResponse_Payment(
        this.extension,
        this.adjustment,
        this.amount,
        this.date,
        newValue,
        this.id,
        this.modifierExtension,
        this.adjustmentReason,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse_Payment#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse_Payment withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableClaimResponse_Payment(
        this.extension,
        this.adjustment,
        this.amount,
        this.date,
        this.type,
        newValue,
        this.modifierExtension,
        this.adjustmentReason,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse_Payment#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse_Payment withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableClaimResponse_Payment(
        this.extension,
        this.adjustment,
        this.amount,
        this.date,
        this.type,
        value,
        this.modifierExtension,
        this.adjustmentReason,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse_Payment#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse_Payment withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableClaimResponse_Payment(
        this.extension,
        this.adjustment,
        this.amount,
        this.date,
        this.type,
        this.id,
        newValue,
        this.adjustmentReason,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse_Payment#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaimResponse_Payment withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableClaimResponse_Payment(
        this.extension,
        this.adjustment,
        this.amount,
        this.date,
        this.type,
        this.id,
        value,
        this.adjustmentReason,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse_Payment#adjustmentReason() adjustmentReason} attribute.
   * @param value The value for adjustmentReason
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse_Payment withAdjustmentReason(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "adjustmentReason");
    if (this.adjustmentReason == newValue) return this;
    return new ImmutableClaimResponse_Payment(
        this.extension,
        this.adjustment,
        this.amount,
        this.date,
        this.type,
        this.id,
        this.modifierExtension,
        newValue,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse_Payment#adjustmentReason() adjustmentReason} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for adjustmentReason
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaimResponse_Payment withAdjustmentReason(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.adjustmentReason == value) return this;
    return new ImmutableClaimResponse_Payment(
        this.extension,
        this.adjustment,
        this.amount,
        this.date,
        this.type,
        this.id,
        this.modifierExtension,
        value,
        this.identifier);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ClaimResponse_Payment#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableClaimResponse_Payment withIdentifier(Identifier value) {
    @Nullable Identifier newValue = Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableClaimResponse_Payment(
        this.extension,
        this.adjustment,
        this.amount,
        this.date,
        this.type,
        this.id,
        this.modifierExtension,
        this.adjustmentReason,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ClaimResponse_Payment#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableClaimResponse_Payment withIdentifier(Optional<? extends Identifier> optional) {
    @Nullable Identifier value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableClaimResponse_Payment(
        this.extension,
        this.adjustment,
        this.amount,
        this.date,
        this.type,
        this.id,
        this.modifierExtension,
        this.adjustmentReason,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableClaimResponse_Payment} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableClaimResponse_Payment
        && equalTo((ImmutableClaimResponse_Payment) another);
  }

  private boolean equalTo(ImmutableClaimResponse_Payment another) {
    return Objects.equals(extension, another.extension)
        && Objects.equals(adjustment, another.adjustment)
        && amount.equals(another.amount)
        && Objects.equals(date, another.date)
        && type.equals(another.type)
        && Objects.equals(id, another.id)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(adjustmentReason, another.adjustmentReason)
        && Objects.equals(identifier, another.identifier);
  }

  /**
   * Computes a hash code from attributes: {@code extension}, {@code adjustment}, {@code amount}, {@code date}, {@code type}, {@code id}, {@code modifierExtension}, {@code adjustmentReason}, {@code identifier}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(adjustment);
    h += (h << 5) + amount.hashCode();
    h += (h << 5) + Objects.hashCode(date);
    h += (h << 5) + type.hashCode();
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(adjustmentReason);
    h += (h << 5) + Objects.hashCode(identifier);
    return h;
  }

  /**
   * Prints the immutable value {@code ClaimResponse_Payment} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("ClaimResponse_Payment{");
    if (extension != null) {
      builder.append("extension=").append(extension);
    }
    if (adjustment != null) {
      if (builder.length() > 22) builder.append(", ");
      builder.append("adjustment=").append(adjustment);
    }
    if (builder.length() > 22) builder.append(", ");
    builder.append("amount=").append(amount);
    if (date != null) {
      builder.append(", ");
      builder.append("date=").append(date);
    }
    builder.append(", ");
    builder.append("type=").append(type);
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (adjustmentReason != null) {
      builder.append(", ");
      builder.append("adjustmentReason=").append(adjustmentReason);
    }
    if (identifier != null) {
      builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "ClaimResponse_Payment", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements ClaimResponse_Payment {
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<Money> adjustment = Optional.empty();
    boolean adjustmentIsSet;
    @Nullable Money amount;
    @Nullable Optional<Date> date = Optional.empty();
    boolean dateIsSet;
    @Nullable CodeableConcept type;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<CodeableConcept> adjustmentReason = Optional.empty();
    boolean adjustmentReasonIsSet;
    @Nullable Optional<Identifier> identifier = Optional.empty();
    boolean identifierIsSet;
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("adjustment")
    public void setAdjustment(Optional<Money> adjustment) {
      this.adjustment = adjustment;
      this.adjustmentIsSet = true;
    }
    @JsonProperty("amount")
    public void setAmount(Money amount) {
      this.amount = amount;
    }
    @JsonProperty("date")
    public void setDate(Optional<Date> date) {
      this.date = date;
      this.dateIsSet = true;
    }
    @JsonProperty("type")
    public void setType(CodeableConcept type) {
      this.type = type;
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
    @JsonProperty("adjustmentReason")
    public void setAdjustmentReason(Optional<CodeableConcept> adjustmentReason) {
      this.adjustmentReason = adjustmentReason;
      this.adjustmentReasonIsSet = true;
    }
    @JsonProperty("identifier")
    public void setIdentifier(Optional<Identifier> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Money> adjustment() { throw new UnsupportedOperationException(); }
    @Override
    public Money amount() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Date> date() { throw new UnsupportedOperationException(); }
    @Override
    public CodeableConcept type() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> adjustmentReason() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Identifier> identifier() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableClaimResponse_Payment fromJson(Json json) {
    ImmutableClaimResponse_Payment.Builder builder = ((ImmutableClaimResponse_Payment.Builder) ImmutableClaimResponse_Payment.builder());
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.adjustmentIsSet) {
      builder.adjustment(json.adjustment);
    }
    if (json.amount != null) {
      builder.amount(json.amount);
    }
    if (json.dateIsSet) {
      builder.date(json.date);
    }
    if (json.type != null) {
      builder.type(json.type);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.adjustmentReasonIsSet) {
      builder.adjustmentReason(json.adjustmentReason);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    return (ImmutableClaimResponse_Payment) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ClaimResponse_Payment} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ClaimResponse_Payment instance
   */
  public static ClaimResponse_Payment copyOf(ClaimResponse_Payment instance) {
    if (instance instanceof ImmutableClaimResponse_Payment) {
      return (ImmutableClaimResponse_Payment) instance;
    }
    return ((ImmutableClaimResponse_Payment.Builder) ImmutableClaimResponse_Payment.builder())
        .extension(instance.extension())
        .adjustment(instance.adjustment())
        .amount(instance.amount())
        .date(instance.date())
        .type(instance.type())
        .id(instance.id())
        .modifierExtension(instance.modifierExtension())
        .adjustmentReason(instance.adjustmentReason())
        .identifier(instance.identifier())
        .build();
  }

  /**
   * Creates a builder for {@link ClaimResponse_Payment ClaimResponse_Payment}.
   * <pre>
   * ImmutableClaimResponse_Payment.builder()
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link ClaimResponse_Payment#extension() extension}
   *    .adjustment(com.medplum.types.fhir.Money) // optional {@link ClaimResponse_Payment#adjustment() adjustment}
   *    .amount(com.medplum.types.fhir.Money) // required {@link ClaimResponse_Payment#amount() amount}
   *    .date(com.medplum.types.fhir.Date) // optional {@link ClaimResponse_Payment#date() date}
   *    .type(com.medplum.types.fhir.CodeableConcept) // required {@link ClaimResponse_Payment#type() type}
   *    .id(String) // optional {@link ClaimResponse_Payment#id() id}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link ClaimResponse_Payment#modifierExtension() modifierExtension}
   *    .adjustmentReason(com.medplum.types.fhir.CodeableConcept) // optional {@link ClaimResponse_Payment#adjustmentReason() adjustmentReason}
   *    .identifier(com.medplum.types.fhir.Identifier) // optional {@link ClaimResponse_Payment#identifier() identifier}
   *    .build();
   * </pre>
   * @return A new ClaimResponse_Payment builder
   */
  public static AmountBuildStage builder() {
    return new ImmutableClaimResponse_Payment.Builder();
  }

  /**
   * Builds instances of type {@link ClaimResponse_Payment ClaimResponse_Payment}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "ClaimResponse_Payment", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements AmountBuildStage, TypeBuildStage, BuildFinal {
    private static final long INIT_BIT_AMOUNT = 0x1L;
    private static final long INIT_BIT_TYPE = 0x2L;
    private static final long OPT_BIT_EXTENSION = 0x1L;
    private static final long OPT_BIT_ADJUSTMENT = 0x2L;
    private static final long OPT_BIT_DATE = 0x4L;
    private static final long OPT_BIT_ID = 0x8L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x10L;
    private static final long OPT_BIT_ADJUSTMENT_REASON = 0x20L;
    private static final long OPT_BIT_IDENTIFIER = 0x40L;
    private long initBits = 0x3L;
    private long optBits;

    private @Nullable List<Extension> extension;
    private @Nullable Money adjustment;
    private @Nullable Money amount;
    private @Nullable Date date;
    private @Nullable CodeableConcept type;
    private @Nullable String id;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable CodeableConcept adjustmentReason;
    private @Nullable Identifier identifier;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link ClaimResponse_Payment#extension() extension} to extension.
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
     * Initializes the optional value {@link ClaimResponse_Payment#extension() extension} to extension.
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
     * Initializes the optional value {@link ClaimResponse_Payment#adjustment() adjustment} to adjustment.
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
     * Initializes the optional value {@link ClaimResponse_Payment#adjustment() adjustment} to adjustment.
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
     * Initializes the value for the {@link ClaimResponse_Payment#amount() amount} attribute.
     * @param amount The value for amount 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("amount")
    public final Builder amount(Money amount) {
      checkNotIsSet(amountIsSet(), "amount");
      this.amount = Objects.requireNonNull(amount, "amount");
      initBits &= ~INIT_BIT_AMOUNT;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse_Payment#date() date} to date.
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
     * Initializes the optional value {@link ClaimResponse_Payment#date() date} to date.
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
     * Initializes the value for the {@link ClaimResponse_Payment#type() type} attribute.
     * @param type The value for type 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("type")
    public final Builder type(CodeableConcept type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = Objects.requireNonNull(type, "type");
      initBits &= ~INIT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link ClaimResponse_Payment#id() id} to id.
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
     * Initializes the optional value {@link ClaimResponse_Payment#id() id} to id.
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
     * Initializes the optional value {@link ClaimResponse_Payment#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ClaimResponse_Payment#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ClaimResponse_Payment#adjustmentReason() adjustmentReason} to adjustmentReason.
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
     * Initializes the optional value {@link ClaimResponse_Payment#adjustmentReason() adjustmentReason} to adjustmentReason.
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
     * Initializes the optional value {@link ClaimResponse_Payment#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link ClaimResponse_Payment#identifier() identifier} to identifier.
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
     * Builds a new {@link ClaimResponse_Payment ClaimResponse_Payment}.
     * @return An immutable instance of ClaimResponse_Payment
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ClaimResponse_Payment build() {
      checkRequiredAttributes();
      return new ImmutableClaimResponse_Payment(
          extension,
          adjustment,
          amount,
          date,
          type,
          id,
          modifierExtension,
          adjustmentReason,
          identifier);
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean adjustmentIsSet() {
      return (optBits & OPT_BIT_ADJUSTMENT) != 0;
    }

    private boolean dateIsSet() {
      return (optBits & OPT_BIT_DATE) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean adjustmentReasonIsSet() {
      return (optBits & OPT_BIT_ADJUSTMENT_REASON) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean amountIsSet() {
      return (initBits & INIT_BIT_AMOUNT) == 0;
    }

    private boolean typeIsSet() {
      return (initBits & INIT_BIT_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of ClaimResponse_Payment is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!amountIsSet()) attributes.add("amount");
      if (!typeIsSet()) attributes.add("type");
      return "Cannot build ClaimResponse_Payment, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "ClaimResponse_Payment", generator = "Immutables")
  public interface AmountBuildStage {
    /**
     * Initializes the value for the {@link ClaimResponse_Payment#amount() amount} attribute.
     * @param amount The value for amount 
     * @return {@code this} builder for use in a chained invocation
     */
    TypeBuildStage amount(Money amount);
  }

  @Generated(from = "ClaimResponse_Payment", generator = "Immutables")
  public interface TypeBuildStage {
    /**
     * Initializes the value for the {@link ClaimResponse_Payment#type() type} attribute.
     * @param type The value for type 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal type(CodeableConcept type);
  }

  @Generated(from = "ClaimResponse_Payment", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link ClaimResponse_Payment#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link ClaimResponse_Payment#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link ClaimResponse_Payment#adjustment() adjustment} to adjustment.
     * @param adjustment The value for adjustment
     * @return {@code this} builder for chained invocation
     */
    BuildFinal adjustment(Money adjustment);

    /**
     * Initializes the optional value {@link ClaimResponse_Payment#adjustment() adjustment} to adjustment.
     * @param adjustment The value for adjustment
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal adjustment(Optional<? extends Money> adjustment);

    /**
     * Initializes the optional value {@link ClaimResponse_Payment#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for chained invocation
     */
    BuildFinal date(Date date);

    /**
     * Initializes the optional value {@link ClaimResponse_Payment#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal date(Optional<? extends Date> date);

    /**
     * Initializes the optional value {@link ClaimResponse_Payment#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(String id);

    /**
     * Initializes the optional value {@link ClaimResponse_Payment#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<String> id);

    /**
     * Initializes the optional value {@link ClaimResponse_Payment#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link ClaimResponse_Payment#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link ClaimResponse_Payment#adjustmentReason() adjustmentReason} to adjustmentReason.
     * @param adjustmentReason The value for adjustmentReason
     * @return {@code this} builder for chained invocation
     */
    BuildFinal adjustmentReason(CodeableConcept adjustmentReason);

    /**
     * Initializes the optional value {@link ClaimResponse_Payment#adjustmentReason() adjustmentReason} to adjustmentReason.
     * @param adjustmentReason The value for adjustmentReason
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal adjustmentReason(Optional<? extends CodeableConcept> adjustmentReason);

    /**
     * Initializes the optional value {@link ClaimResponse_Payment#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(Identifier identifier);

    /**
     * Initializes the optional value {@link ClaimResponse_Payment#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(Optional<? extends Identifier> identifier);

    /**
     * Builds a new {@link ClaimResponse_Payment ClaimResponse_Payment}.
     * @return An immutable instance of ClaimResponse_Payment
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    ClaimResponse_Payment build();
  }
}
