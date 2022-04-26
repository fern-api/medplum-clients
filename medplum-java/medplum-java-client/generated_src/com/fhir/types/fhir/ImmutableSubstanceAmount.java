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
 * Immutable implementation of {@link SubstanceAmount}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableSubstanceAmount.builder()}.
 */
@Generated(from = "SubstanceAmount", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableSubstanceAmount implements SubstanceAmount {
  private final @Nullable String amountString;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable SubstanceAmount_ReferenceRange referenceRange;
  private final @Nullable Quantity amountQuantity;
  private final @Nullable Range amountRange;
  private final @Nullable String amountText;
  private final @Nullable String id;
  private final @Nullable List<Extension> extension;
  private final @Nullable CodeableConcept amountType;

  private ImmutableSubstanceAmount(
      @Nullable String amountString,
      @Nullable List<Extension> modifierExtension,
      @Nullable SubstanceAmount_ReferenceRange referenceRange,
      @Nullable Quantity amountQuantity,
      @Nullable Range amountRange,
      @Nullable String amountText,
      @Nullable String id,
      @Nullable List<Extension> extension,
      @Nullable CodeableConcept amountType) {
    this.amountString = amountString;
    this.modifierExtension = modifierExtension;
    this.referenceRange = referenceRange;
    this.amountQuantity = amountQuantity;
    this.amountRange = amountRange;
    this.amountText = amountText;
    this.id = id;
    this.extension = extension;
    this.amountType = amountType;
  }

  /**
   * @return The value of the {@code amountString} attribute
   */
  @JsonProperty("amountString")
  @Override
  public Optional<String> amountString() {
    return Optional.ofNullable(amountString);
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
   * @return The value of the {@code referenceRange} attribute
   */
  @JsonProperty("referenceRange")
  @Override
  public Optional<SubstanceAmount_ReferenceRange> referenceRange() {
    return Optional.ofNullable(referenceRange);
  }

  /**
   * @return The value of the {@code amountQuantity} attribute
   */
  @JsonProperty("amountQuantity")
  @Override
  public Optional<Quantity> amountQuantity() {
    return Optional.ofNullable(amountQuantity);
  }

  /**
   * @return The value of the {@code amountRange} attribute
   */
  @JsonProperty("amountRange")
  @Override
  public Optional<Range> amountRange() {
    return Optional.ofNullable(amountRange);
  }

  /**
   * @return The value of the {@code amountText} attribute
   */
  @JsonProperty("amountText")
  @Override
  public Optional<String> amountText() {
    return Optional.ofNullable(amountText);
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
   * @return The value of the {@code extension} attribute
   */
  @JsonProperty("extension")
  @Override
  public Optional<List<Extension>> extension() {
    return Optional.ofNullable(extension);
  }

  /**
   * @return The value of the {@code amountType} attribute
   */
  @JsonProperty("amountType")
  @Override
  public Optional<CodeableConcept> amountType() {
    return Optional.ofNullable(amountType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceAmount#amountString() amountString} attribute.
   * @param value The value for amountString
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceAmount withAmountString(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "amountString");
    if (Objects.equals(this.amountString, newValue)) return this;
    return new ImmutableSubstanceAmount(
        newValue,
        this.modifierExtension,
        this.referenceRange,
        this.amountQuantity,
        this.amountRange,
        this.amountText,
        this.id,
        this.extension,
        this.amountType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceAmount#amountString() amountString} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for amountString
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceAmount withAmountString(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.amountString, value)) return this;
    return new ImmutableSubstanceAmount(
        value,
        this.modifierExtension,
        this.referenceRange,
        this.amountQuantity,
        this.amountRange,
        this.amountText,
        this.id,
        this.extension,
        this.amountType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceAmount#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceAmount withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableSubstanceAmount(
        this.amountString,
        newValue,
        this.referenceRange,
        this.amountQuantity,
        this.amountRange,
        this.amountText,
        this.id,
        this.extension,
        this.amountType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceAmount#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceAmount withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableSubstanceAmount(
        this.amountString,
        value,
        this.referenceRange,
        this.amountQuantity,
        this.amountRange,
        this.amountText,
        this.id,
        this.extension,
        this.amountType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceAmount#referenceRange() referenceRange} attribute.
   * @param value The value for referenceRange
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceAmount withReferenceRange(SubstanceAmount_ReferenceRange value) {
    @Nullable SubstanceAmount_ReferenceRange newValue = Objects.requireNonNull(value, "referenceRange");
    if (this.referenceRange == newValue) return this;
    return new ImmutableSubstanceAmount(
        this.amountString,
        this.modifierExtension,
        newValue,
        this.amountQuantity,
        this.amountRange,
        this.amountText,
        this.id,
        this.extension,
        this.amountType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceAmount#referenceRange() referenceRange} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for referenceRange
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceAmount withReferenceRange(Optional<? extends SubstanceAmount_ReferenceRange> optional) {
    @Nullable SubstanceAmount_ReferenceRange value = optional.orElse(null);
    if (this.referenceRange == value) return this;
    return new ImmutableSubstanceAmount(
        this.amountString,
        this.modifierExtension,
        value,
        this.amountQuantity,
        this.amountRange,
        this.amountText,
        this.id,
        this.extension,
        this.amountType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceAmount#amountQuantity() amountQuantity} attribute.
   * @param value The value for amountQuantity
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceAmount withAmountQuantity(Quantity value) {
    @Nullable Quantity newValue = Objects.requireNonNull(value, "amountQuantity");
    if (this.amountQuantity == newValue) return this;
    return new ImmutableSubstanceAmount(
        this.amountString,
        this.modifierExtension,
        this.referenceRange,
        newValue,
        this.amountRange,
        this.amountText,
        this.id,
        this.extension,
        this.amountType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceAmount#amountQuantity() amountQuantity} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for amountQuantity
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceAmount withAmountQuantity(Optional<? extends Quantity> optional) {
    @Nullable Quantity value = optional.orElse(null);
    if (this.amountQuantity == value) return this;
    return new ImmutableSubstanceAmount(
        this.amountString,
        this.modifierExtension,
        this.referenceRange,
        value,
        this.amountRange,
        this.amountText,
        this.id,
        this.extension,
        this.amountType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceAmount#amountRange() amountRange} attribute.
   * @param value The value for amountRange
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceAmount withAmountRange(Range value) {
    @Nullable Range newValue = Objects.requireNonNull(value, "amountRange");
    if (this.amountRange == newValue) return this;
    return new ImmutableSubstanceAmount(
        this.amountString,
        this.modifierExtension,
        this.referenceRange,
        this.amountQuantity,
        newValue,
        this.amountText,
        this.id,
        this.extension,
        this.amountType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceAmount#amountRange() amountRange} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for amountRange
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceAmount withAmountRange(Optional<? extends Range> optional) {
    @Nullable Range value = optional.orElse(null);
    if (this.amountRange == value) return this;
    return new ImmutableSubstanceAmount(
        this.amountString,
        this.modifierExtension,
        this.referenceRange,
        this.amountQuantity,
        value,
        this.amountText,
        this.id,
        this.extension,
        this.amountType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceAmount#amountText() amountText} attribute.
   * @param value The value for amountText
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceAmount withAmountText(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "amountText");
    if (Objects.equals(this.amountText, newValue)) return this;
    return new ImmutableSubstanceAmount(
        this.amountString,
        this.modifierExtension,
        this.referenceRange,
        this.amountQuantity,
        this.amountRange,
        newValue,
        this.id,
        this.extension,
        this.amountType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceAmount#amountText() amountText} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for amountText
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceAmount withAmountText(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.amountText, value)) return this;
    return new ImmutableSubstanceAmount(
        this.amountString,
        this.modifierExtension,
        this.referenceRange,
        this.amountQuantity,
        this.amountRange,
        value,
        this.id,
        this.extension,
        this.amountType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceAmount#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceAmount withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableSubstanceAmount(
        this.amountString,
        this.modifierExtension,
        this.referenceRange,
        this.amountQuantity,
        this.amountRange,
        this.amountText,
        newValue,
        this.extension,
        this.amountType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceAmount#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceAmount withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableSubstanceAmount(
        this.amountString,
        this.modifierExtension,
        this.referenceRange,
        this.amountQuantity,
        this.amountRange,
        this.amountText,
        value,
        this.extension,
        this.amountType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceAmount#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceAmount withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableSubstanceAmount(
        this.amountString,
        this.modifierExtension,
        this.referenceRange,
        this.amountQuantity,
        this.amountRange,
        this.amountText,
        this.id,
        newValue,
        this.amountType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceAmount#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceAmount withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableSubstanceAmount(
        this.amountString,
        this.modifierExtension,
        this.referenceRange,
        this.amountQuantity,
        this.amountRange,
        this.amountText,
        this.id,
        value,
        this.amountType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceAmount#amountType() amountType} attribute.
   * @param value The value for amountType
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceAmount withAmountType(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "amountType");
    if (this.amountType == newValue) return this;
    return new ImmutableSubstanceAmount(
        this.amountString,
        this.modifierExtension,
        this.referenceRange,
        this.amountQuantity,
        this.amountRange,
        this.amountText,
        this.id,
        this.extension,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceAmount#amountType() amountType} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for amountType
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceAmount withAmountType(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.amountType == value) return this;
    return new ImmutableSubstanceAmount(
        this.amountString,
        this.modifierExtension,
        this.referenceRange,
        this.amountQuantity,
        this.amountRange,
        this.amountText,
        this.id,
        this.extension,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableSubstanceAmount} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableSubstanceAmount
        && equalTo((ImmutableSubstanceAmount) another);
  }

  private boolean equalTo(ImmutableSubstanceAmount another) {
    return Objects.equals(amountString, another.amountString)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(referenceRange, another.referenceRange)
        && Objects.equals(amountQuantity, another.amountQuantity)
        && Objects.equals(amountRange, another.amountRange)
        && Objects.equals(amountText, another.amountText)
        && Objects.equals(id, another.id)
        && Objects.equals(extension, another.extension)
        && Objects.equals(amountType, another.amountType);
  }

  /**
   * Computes a hash code from attributes: {@code amountString}, {@code modifierExtension}, {@code referenceRange}, {@code amountQuantity}, {@code amountRange}, {@code amountText}, {@code id}, {@code extension}, {@code amountType}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(amountString);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(referenceRange);
    h += (h << 5) + Objects.hashCode(amountQuantity);
    h += (h << 5) + Objects.hashCode(amountRange);
    h += (h << 5) + Objects.hashCode(amountText);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(amountType);
    return h;
  }

  /**
   * Prints the immutable value {@code SubstanceAmount} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("SubstanceAmount{");
    if (amountString != null) {
      builder.append("amountString=").append(amountString);
    }
    if (modifierExtension != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (referenceRange != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("referenceRange=").append(referenceRange);
    }
    if (amountQuantity != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("amountQuantity=").append(amountQuantity);
    }
    if (amountRange != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("amountRange=").append(amountRange);
    }
    if (amountText != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("amountText=").append(amountText);
    }
    if (id != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (extension != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (amountType != null) {
      if (builder.length() > 16) builder.append(", ");
      builder.append("amountType=").append(amountType);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "SubstanceAmount", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements SubstanceAmount {
    @Nullable Optional<String> amountString = Optional.empty();
    boolean amountStringIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<SubstanceAmount_ReferenceRange> referenceRange = Optional.empty();
    boolean referenceRangeIsSet;
    @Nullable Optional<Quantity> amountQuantity = Optional.empty();
    boolean amountQuantityIsSet;
    @Nullable Optional<Range> amountRange = Optional.empty();
    boolean amountRangeIsSet;
    @Nullable Optional<String> amountText = Optional.empty();
    boolean amountTextIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<CodeableConcept> amountType = Optional.empty();
    boolean amountTypeIsSet;
    @JsonProperty("amountString")
    public void setAmountString(Optional<String> amountString) {
      this.amountString = amountString;
      this.amountStringIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("referenceRange")
    public void setReferenceRange(Optional<SubstanceAmount_ReferenceRange> referenceRange) {
      this.referenceRange = referenceRange;
      this.referenceRangeIsSet = true;
    }
    @JsonProperty("amountQuantity")
    public void setAmountQuantity(Optional<Quantity> amountQuantity) {
      this.amountQuantity = amountQuantity;
      this.amountQuantityIsSet = true;
    }
    @JsonProperty("amountRange")
    public void setAmountRange(Optional<Range> amountRange) {
      this.amountRange = amountRange;
      this.amountRangeIsSet = true;
    }
    @JsonProperty("amountText")
    public void setAmountText(Optional<String> amountText) {
      this.amountText = amountText;
      this.amountTextIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("amountType")
    public void setAmountType(Optional<CodeableConcept> amountType) {
      this.amountType = amountType;
      this.amountTypeIsSet = true;
    }
    @Override
    public Optional<String> amountString() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<SubstanceAmount_ReferenceRange> referenceRange() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Quantity> amountQuantity() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Range> amountRange() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> amountText() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> amountType() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableSubstanceAmount fromJson(Json json) {
    ImmutableSubstanceAmount.Builder builder = ImmutableSubstanceAmount.builder();
    if (json.amountStringIsSet) {
      builder.amountString(json.amountString);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.referenceRangeIsSet) {
      builder.referenceRange(json.referenceRange);
    }
    if (json.amountQuantityIsSet) {
      builder.amountQuantity(json.amountQuantity);
    }
    if (json.amountRangeIsSet) {
      builder.amountRange(json.amountRange);
    }
    if (json.amountTextIsSet) {
      builder.amountText(json.amountText);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.amountTypeIsSet) {
      builder.amountType(json.amountType);
    }
    return (ImmutableSubstanceAmount) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link SubstanceAmount} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable SubstanceAmount instance
   */
  public static SubstanceAmount copyOf(SubstanceAmount instance) {
    if (instance instanceof ImmutableSubstanceAmount) {
      return (ImmutableSubstanceAmount) instance;
    }
    return ImmutableSubstanceAmount.builder()
        .amountString(instance.amountString())
        .modifierExtension(instance.modifierExtension())
        .referenceRange(instance.referenceRange())
        .amountQuantity(instance.amountQuantity())
        .amountRange(instance.amountRange())
        .amountText(instance.amountText())
        .id(instance.id())
        .extension(instance.extension())
        .amountType(instance.amountType())
        .build();
  }

  /**
   * Creates a builder for {@link SubstanceAmount SubstanceAmount}.
   * <pre>
   * ImmutableSubstanceAmount.builder()
   *    .amountString(String) // optional {@link SubstanceAmount#amountString() amountString}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link SubstanceAmount#modifierExtension() modifierExtension}
   *    .referenceRange(com.fhir.types.fhir.SubstanceAmount_ReferenceRange) // optional {@link SubstanceAmount#referenceRange() referenceRange}
   *    .amountQuantity(com.fhir.types.fhir.Quantity) // optional {@link SubstanceAmount#amountQuantity() amountQuantity}
   *    .amountRange(com.fhir.types.fhir.Range) // optional {@link SubstanceAmount#amountRange() amountRange}
   *    .amountText(String) // optional {@link SubstanceAmount#amountText() amountText}
   *    .id(String) // optional {@link SubstanceAmount#id() id}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link SubstanceAmount#extension() extension}
   *    .amountType(com.fhir.types.fhir.CodeableConcept) // optional {@link SubstanceAmount#amountType() amountType}
   *    .build();
   * </pre>
   * @return A new SubstanceAmount builder
   */
  public static ImmutableSubstanceAmount.Builder builder() {
    return new ImmutableSubstanceAmount.Builder();
  }

  /**
   * Builds instances of type {@link SubstanceAmount SubstanceAmount}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "SubstanceAmount", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_AMOUNT_STRING = 0x1L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x2L;
    private static final long OPT_BIT_REFERENCE_RANGE = 0x4L;
    private static final long OPT_BIT_AMOUNT_QUANTITY = 0x8L;
    private static final long OPT_BIT_AMOUNT_RANGE = 0x10L;
    private static final long OPT_BIT_AMOUNT_TEXT = 0x20L;
    private static final long OPT_BIT_ID = 0x40L;
    private static final long OPT_BIT_EXTENSION = 0x80L;
    private static final long OPT_BIT_AMOUNT_TYPE = 0x100L;
    private long optBits;

    private @Nullable String amountString;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable SubstanceAmount_ReferenceRange referenceRange;
    private @Nullable Quantity amountQuantity;
    private @Nullable Range amountRange;
    private @Nullable String amountText;
    private @Nullable String id;
    private @Nullable List<Extension> extension;
    private @Nullable CodeableConcept amountType;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link SubstanceAmount#amountString() amountString} to amountString.
     * @param amountString The value for amountString
     * @return {@code this} builder for chained invocation
     */
    public final Builder amountString(String amountString) {
      checkNotIsSet(amountStringIsSet(), "amountString");
      this.amountString = Objects.requireNonNull(amountString, "amountString");
      optBits |= OPT_BIT_AMOUNT_STRING;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceAmount#amountString() amountString} to amountString.
     * @param amountString The value for amountString
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("amountString")
    public final Builder amountString(Optional<String> amountString) {
      checkNotIsSet(amountStringIsSet(), "amountString");
      this.amountString = amountString.orElse(null);
      optBits |= OPT_BIT_AMOUNT_STRING;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceAmount#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link SubstanceAmount#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link SubstanceAmount#referenceRange() referenceRange} to referenceRange.
     * @param referenceRange The value for referenceRange
     * @return {@code this} builder for chained invocation
     */
    public final Builder referenceRange(SubstanceAmount_ReferenceRange referenceRange) {
      checkNotIsSet(referenceRangeIsSet(), "referenceRange");
      this.referenceRange = Objects.requireNonNull(referenceRange, "referenceRange");
      optBits |= OPT_BIT_REFERENCE_RANGE;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceAmount#referenceRange() referenceRange} to referenceRange.
     * @param referenceRange The value for referenceRange
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("referenceRange")
    public final Builder referenceRange(Optional<? extends SubstanceAmount_ReferenceRange> referenceRange) {
      checkNotIsSet(referenceRangeIsSet(), "referenceRange");
      this.referenceRange = referenceRange.orElse(null);
      optBits |= OPT_BIT_REFERENCE_RANGE;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceAmount#amountQuantity() amountQuantity} to amountQuantity.
     * @param amountQuantity The value for amountQuantity
     * @return {@code this} builder for chained invocation
     */
    public final Builder amountQuantity(Quantity amountQuantity) {
      checkNotIsSet(amountQuantityIsSet(), "amountQuantity");
      this.amountQuantity = Objects.requireNonNull(amountQuantity, "amountQuantity");
      optBits |= OPT_BIT_AMOUNT_QUANTITY;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceAmount#amountQuantity() amountQuantity} to amountQuantity.
     * @param amountQuantity The value for amountQuantity
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("amountQuantity")
    public final Builder amountQuantity(Optional<? extends Quantity> amountQuantity) {
      checkNotIsSet(amountQuantityIsSet(), "amountQuantity");
      this.amountQuantity = amountQuantity.orElse(null);
      optBits |= OPT_BIT_AMOUNT_QUANTITY;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceAmount#amountRange() amountRange} to amountRange.
     * @param amountRange The value for amountRange
     * @return {@code this} builder for chained invocation
     */
    public final Builder amountRange(Range amountRange) {
      checkNotIsSet(amountRangeIsSet(), "amountRange");
      this.amountRange = Objects.requireNonNull(amountRange, "amountRange");
      optBits |= OPT_BIT_AMOUNT_RANGE;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceAmount#amountRange() amountRange} to amountRange.
     * @param amountRange The value for amountRange
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("amountRange")
    public final Builder amountRange(Optional<? extends Range> amountRange) {
      checkNotIsSet(amountRangeIsSet(), "amountRange");
      this.amountRange = amountRange.orElse(null);
      optBits |= OPT_BIT_AMOUNT_RANGE;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceAmount#amountText() amountText} to amountText.
     * @param amountText The value for amountText
     * @return {@code this} builder for chained invocation
     */
    public final Builder amountText(String amountText) {
      checkNotIsSet(amountTextIsSet(), "amountText");
      this.amountText = Objects.requireNonNull(amountText, "amountText");
      optBits |= OPT_BIT_AMOUNT_TEXT;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceAmount#amountText() amountText} to amountText.
     * @param amountText The value for amountText
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("amountText")
    public final Builder amountText(Optional<String> amountText) {
      checkNotIsSet(amountTextIsSet(), "amountText");
      this.amountText = amountText.orElse(null);
      optBits |= OPT_BIT_AMOUNT_TEXT;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceAmount#id() id} to id.
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
     * Initializes the optional value {@link SubstanceAmount#id() id} to id.
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
     * Initializes the optional value {@link SubstanceAmount#extension() extension} to extension.
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
     * Initializes the optional value {@link SubstanceAmount#extension() extension} to extension.
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
     * Initializes the optional value {@link SubstanceAmount#amountType() amountType} to amountType.
     * @param amountType The value for amountType
     * @return {@code this} builder for chained invocation
     */
    public final Builder amountType(CodeableConcept amountType) {
      checkNotIsSet(amountTypeIsSet(), "amountType");
      this.amountType = Objects.requireNonNull(amountType, "amountType");
      optBits |= OPT_BIT_AMOUNT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceAmount#amountType() amountType} to amountType.
     * @param amountType The value for amountType
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("amountType")
    public final Builder amountType(Optional<? extends CodeableConcept> amountType) {
      checkNotIsSet(amountTypeIsSet(), "amountType");
      this.amountType = amountType.orElse(null);
      optBits |= OPT_BIT_AMOUNT_TYPE;
      return this;
    }

    /**
     * Builds a new {@link SubstanceAmount SubstanceAmount}.
     * @return An immutable instance of SubstanceAmount
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public SubstanceAmount build() {
      return new ImmutableSubstanceAmount(
          amountString,
          modifierExtension,
          referenceRange,
          amountQuantity,
          amountRange,
          amountText,
          id,
          extension,
          amountType);
    }

    private boolean amountStringIsSet() {
      return (optBits & OPT_BIT_AMOUNT_STRING) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean referenceRangeIsSet() {
      return (optBits & OPT_BIT_REFERENCE_RANGE) != 0;
    }

    private boolean amountQuantityIsSet() {
      return (optBits & OPT_BIT_AMOUNT_QUANTITY) != 0;
    }

    private boolean amountRangeIsSet() {
      return (optBits & OPT_BIT_AMOUNT_RANGE) != 0;
    }

    private boolean amountTextIsSet() {
      return (optBits & OPT_BIT_AMOUNT_TEXT) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean amountTypeIsSet() {
      return (optBits & OPT_BIT_AMOUNT_TYPE) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of SubstanceAmount is strict, attribute is already set: ".concat(name));
    }
  }
}
