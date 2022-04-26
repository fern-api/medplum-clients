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
 * Immutable implementation of {@link Dosage_DoseAndRate}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableDosage_DoseAndRate.builder()}.
 */
@Generated(from = "Dosage_DoseAndRate", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableDosage_DoseAndRate implements Dosage_DoseAndRate {
  private final @Nullable String id;
  private final @Nullable Range doseRange;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable List<Extension> extension;
  private final @Nullable Ratio rateRatio;
  private final @Nullable Range rateRange;
  private final @Nullable Quantity rateQuantity;
  private final @Nullable Quantity doseQuantity;
  private final @Nullable CodeableConcept type;

  private ImmutableDosage_DoseAndRate(
      @Nullable String id,
      @Nullable Range doseRange,
      @Nullable List<Extension> modifierExtension,
      @Nullable List<Extension> extension,
      @Nullable Ratio rateRatio,
      @Nullable Range rateRange,
      @Nullable Quantity rateQuantity,
      @Nullable Quantity doseQuantity,
      @Nullable CodeableConcept type) {
    this.id = id;
    this.doseRange = doseRange;
    this.modifierExtension = modifierExtension;
    this.extension = extension;
    this.rateRatio = rateRatio;
    this.rateRange = rateRange;
    this.rateQuantity = rateQuantity;
    this.doseQuantity = doseQuantity;
    this.type = type;
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
   * @return The value of the {@code doseRange} attribute
   */
  @JsonProperty("doseRange")
  @Override
  public Optional<Range> doseRange() {
    return Optional.ofNullable(doseRange);
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
   * @return The value of the {@code extension} attribute
   */
  @JsonProperty("extension")
  @Override
  public Optional<List<Extension>> extension() {
    return Optional.ofNullable(extension);
  }

  /**
   * @return The value of the {@code rateRatio} attribute
   */
  @JsonProperty("rateRatio")
  @Override
  public Optional<Ratio> rateRatio() {
    return Optional.ofNullable(rateRatio);
  }

  /**
   * @return The value of the {@code rateRange} attribute
   */
  @JsonProperty("rateRange")
  @Override
  public Optional<Range> rateRange() {
    return Optional.ofNullable(rateRange);
  }

  /**
   * @return The value of the {@code rateQuantity} attribute
   */
  @JsonProperty("rateQuantity")
  @Override
  public Optional<Quantity> rateQuantity() {
    return Optional.ofNullable(rateQuantity);
  }

  /**
   * @return The value of the {@code doseQuantity} attribute
   */
  @JsonProperty("doseQuantity")
  @Override
  public Optional<Quantity> doseQuantity() {
    return Optional.ofNullable(doseQuantity);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Dosage_DoseAndRate#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDosage_DoseAndRate withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableDosage_DoseAndRate(
        newValue,
        this.doseRange,
        this.modifierExtension,
        this.extension,
        this.rateRatio,
        this.rateRange,
        this.rateQuantity,
        this.doseQuantity,
        this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Dosage_DoseAndRate#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDosage_DoseAndRate withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableDosage_DoseAndRate(
        value,
        this.doseRange,
        this.modifierExtension,
        this.extension,
        this.rateRatio,
        this.rateRange,
        this.rateQuantity,
        this.doseQuantity,
        this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Dosage_DoseAndRate#doseRange() doseRange} attribute.
   * @param value The value for doseRange
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDosage_DoseAndRate withDoseRange(Range value) {
    @Nullable Range newValue = Objects.requireNonNull(value, "doseRange");
    if (this.doseRange == newValue) return this;
    return new ImmutableDosage_DoseAndRate(
        this.id,
        newValue,
        this.modifierExtension,
        this.extension,
        this.rateRatio,
        this.rateRange,
        this.rateQuantity,
        this.doseQuantity,
        this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Dosage_DoseAndRate#doseRange() doseRange} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for doseRange
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDosage_DoseAndRate withDoseRange(Optional<? extends Range> optional) {
    @Nullable Range value = optional.orElse(null);
    if (this.doseRange == value) return this;
    return new ImmutableDosage_DoseAndRate(
        this.id,
        value,
        this.modifierExtension,
        this.extension,
        this.rateRatio,
        this.rateRange,
        this.rateQuantity,
        this.doseQuantity,
        this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Dosage_DoseAndRate#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDosage_DoseAndRate withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableDosage_DoseAndRate(
        this.id,
        this.doseRange,
        newValue,
        this.extension,
        this.rateRatio,
        this.rateRange,
        this.rateQuantity,
        this.doseQuantity,
        this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Dosage_DoseAndRate#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDosage_DoseAndRate withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableDosage_DoseAndRate(
        this.id,
        this.doseRange,
        value,
        this.extension,
        this.rateRatio,
        this.rateRange,
        this.rateQuantity,
        this.doseQuantity,
        this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Dosage_DoseAndRate#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDosage_DoseAndRate withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableDosage_DoseAndRate(
        this.id,
        this.doseRange,
        this.modifierExtension,
        newValue,
        this.rateRatio,
        this.rateRange,
        this.rateQuantity,
        this.doseQuantity,
        this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Dosage_DoseAndRate#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDosage_DoseAndRate withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableDosage_DoseAndRate(
        this.id,
        this.doseRange,
        this.modifierExtension,
        value,
        this.rateRatio,
        this.rateRange,
        this.rateQuantity,
        this.doseQuantity,
        this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Dosage_DoseAndRate#rateRatio() rateRatio} attribute.
   * @param value The value for rateRatio
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDosage_DoseAndRate withRateRatio(Ratio value) {
    @Nullable Ratio newValue = Objects.requireNonNull(value, "rateRatio");
    if (this.rateRatio == newValue) return this;
    return new ImmutableDosage_DoseAndRate(
        this.id,
        this.doseRange,
        this.modifierExtension,
        this.extension,
        newValue,
        this.rateRange,
        this.rateQuantity,
        this.doseQuantity,
        this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Dosage_DoseAndRate#rateRatio() rateRatio} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for rateRatio
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDosage_DoseAndRate withRateRatio(Optional<? extends Ratio> optional) {
    @Nullable Ratio value = optional.orElse(null);
    if (this.rateRatio == value) return this;
    return new ImmutableDosage_DoseAndRate(
        this.id,
        this.doseRange,
        this.modifierExtension,
        this.extension,
        value,
        this.rateRange,
        this.rateQuantity,
        this.doseQuantity,
        this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Dosage_DoseAndRate#rateRange() rateRange} attribute.
   * @param value The value for rateRange
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDosage_DoseAndRate withRateRange(Range value) {
    @Nullable Range newValue = Objects.requireNonNull(value, "rateRange");
    if (this.rateRange == newValue) return this;
    return new ImmutableDosage_DoseAndRate(
        this.id,
        this.doseRange,
        this.modifierExtension,
        this.extension,
        this.rateRatio,
        newValue,
        this.rateQuantity,
        this.doseQuantity,
        this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Dosage_DoseAndRate#rateRange() rateRange} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for rateRange
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDosage_DoseAndRate withRateRange(Optional<? extends Range> optional) {
    @Nullable Range value = optional.orElse(null);
    if (this.rateRange == value) return this;
    return new ImmutableDosage_DoseAndRate(
        this.id,
        this.doseRange,
        this.modifierExtension,
        this.extension,
        this.rateRatio,
        value,
        this.rateQuantity,
        this.doseQuantity,
        this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Dosage_DoseAndRate#rateQuantity() rateQuantity} attribute.
   * @param value The value for rateQuantity
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDosage_DoseAndRate withRateQuantity(Quantity value) {
    @Nullable Quantity newValue = Objects.requireNonNull(value, "rateQuantity");
    if (this.rateQuantity == newValue) return this;
    return new ImmutableDosage_DoseAndRate(
        this.id,
        this.doseRange,
        this.modifierExtension,
        this.extension,
        this.rateRatio,
        this.rateRange,
        newValue,
        this.doseQuantity,
        this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Dosage_DoseAndRate#rateQuantity() rateQuantity} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for rateQuantity
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDosage_DoseAndRate withRateQuantity(Optional<? extends Quantity> optional) {
    @Nullable Quantity value = optional.orElse(null);
    if (this.rateQuantity == value) return this;
    return new ImmutableDosage_DoseAndRate(
        this.id,
        this.doseRange,
        this.modifierExtension,
        this.extension,
        this.rateRatio,
        this.rateRange,
        value,
        this.doseQuantity,
        this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Dosage_DoseAndRate#doseQuantity() doseQuantity} attribute.
   * @param value The value for doseQuantity
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDosage_DoseAndRate withDoseQuantity(Quantity value) {
    @Nullable Quantity newValue = Objects.requireNonNull(value, "doseQuantity");
    if (this.doseQuantity == newValue) return this;
    return new ImmutableDosage_DoseAndRate(
        this.id,
        this.doseRange,
        this.modifierExtension,
        this.extension,
        this.rateRatio,
        this.rateRange,
        this.rateQuantity,
        newValue,
        this.type);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Dosage_DoseAndRate#doseQuantity() doseQuantity} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for doseQuantity
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDosage_DoseAndRate withDoseQuantity(Optional<? extends Quantity> optional) {
    @Nullable Quantity value = optional.orElse(null);
    if (this.doseQuantity == value) return this;
    return new ImmutableDosage_DoseAndRate(
        this.id,
        this.doseRange,
        this.modifierExtension,
        this.extension,
        this.rateRatio,
        this.rateRange,
        this.rateQuantity,
        value,
        this.type);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Dosage_DoseAndRate#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDosage_DoseAndRate withType(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutableDosage_DoseAndRate(
        this.id,
        this.doseRange,
        this.modifierExtension,
        this.extension,
        this.rateRatio,
        this.rateRange,
        this.rateQuantity,
        this.doseQuantity,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Dosage_DoseAndRate#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDosage_DoseAndRate withType(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutableDosage_DoseAndRate(
        this.id,
        this.doseRange,
        this.modifierExtension,
        this.extension,
        this.rateRatio,
        this.rateRange,
        this.rateQuantity,
        this.doseQuantity,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableDosage_DoseAndRate} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableDosage_DoseAndRate
        && equalTo((ImmutableDosage_DoseAndRate) another);
  }

  private boolean equalTo(ImmutableDosage_DoseAndRate another) {
    return Objects.equals(id, another.id)
        && Objects.equals(doseRange, another.doseRange)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(extension, another.extension)
        && Objects.equals(rateRatio, another.rateRatio)
        && Objects.equals(rateRange, another.rateRange)
        && Objects.equals(rateQuantity, another.rateQuantity)
        && Objects.equals(doseQuantity, another.doseQuantity)
        && Objects.equals(type, another.type);
  }

  /**
   * Computes a hash code from attributes: {@code id}, {@code doseRange}, {@code modifierExtension}, {@code extension}, {@code rateRatio}, {@code rateRange}, {@code rateQuantity}, {@code doseQuantity}, {@code type}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(doseRange);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(rateRatio);
    h += (h << 5) + Objects.hashCode(rateRange);
    h += (h << 5) + Objects.hashCode(rateQuantity);
    h += (h << 5) + Objects.hashCode(doseQuantity);
    h += (h << 5) + Objects.hashCode(type);
    return h;
  }

  /**
   * Prints the immutable value {@code Dosage_DoseAndRate} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Dosage_DoseAndRate{");
    if (id != null) {
      builder.append("id=").append(id);
    }
    if (doseRange != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("doseRange=").append(doseRange);
    }
    if (modifierExtension != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (extension != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (rateRatio != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("rateRatio=").append(rateRatio);
    }
    if (rateRange != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("rateRange=").append(rateRange);
    }
    if (rateQuantity != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("rateQuantity=").append(rateQuantity);
    }
    if (doseQuantity != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("doseQuantity=").append(doseQuantity);
    }
    if (type != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("type=").append(type);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "Dosage_DoseAndRate", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Dosage_DoseAndRate {
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<Range> doseRange = Optional.empty();
    boolean doseRangeIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<Ratio> rateRatio = Optional.empty();
    boolean rateRatioIsSet;
    @Nullable Optional<Range> rateRange = Optional.empty();
    boolean rateRangeIsSet;
    @Nullable Optional<Quantity> rateQuantity = Optional.empty();
    boolean rateQuantityIsSet;
    @Nullable Optional<Quantity> doseQuantity = Optional.empty();
    boolean doseQuantityIsSet;
    @Nullable Optional<CodeableConcept> type = Optional.empty();
    boolean typeIsSet;
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("doseRange")
    public void setDoseRange(Optional<Range> doseRange) {
      this.doseRange = doseRange;
      this.doseRangeIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("rateRatio")
    public void setRateRatio(Optional<Ratio> rateRatio) {
      this.rateRatio = rateRatio;
      this.rateRatioIsSet = true;
    }
    @JsonProperty("rateRange")
    public void setRateRange(Optional<Range> rateRange) {
      this.rateRange = rateRange;
      this.rateRangeIsSet = true;
    }
    @JsonProperty("rateQuantity")
    public void setRateQuantity(Optional<Quantity> rateQuantity) {
      this.rateQuantity = rateQuantity;
      this.rateQuantityIsSet = true;
    }
    @JsonProperty("doseQuantity")
    public void setDoseQuantity(Optional<Quantity> doseQuantity) {
      this.doseQuantity = doseQuantity;
      this.doseQuantityIsSet = true;
    }
    @JsonProperty("type")
    public void setType(Optional<CodeableConcept> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Range> doseRange() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Ratio> rateRatio() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Range> rateRange() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Quantity> rateQuantity() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Quantity> doseQuantity() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> type() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableDosage_DoseAndRate fromJson(Json json) {
    ImmutableDosage_DoseAndRate.Builder builder = ImmutableDosage_DoseAndRate.builder();
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.doseRangeIsSet) {
      builder.doseRange(json.doseRange);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.rateRatioIsSet) {
      builder.rateRatio(json.rateRatio);
    }
    if (json.rateRangeIsSet) {
      builder.rateRange(json.rateRange);
    }
    if (json.rateQuantityIsSet) {
      builder.rateQuantity(json.rateQuantity);
    }
    if (json.doseQuantityIsSet) {
      builder.doseQuantity(json.doseQuantity);
    }
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    return (ImmutableDosage_DoseAndRate) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Dosage_DoseAndRate} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Dosage_DoseAndRate instance
   */
  public static Dosage_DoseAndRate copyOf(Dosage_DoseAndRate instance) {
    if (instance instanceof ImmutableDosage_DoseAndRate) {
      return (ImmutableDosage_DoseAndRate) instance;
    }
    return ImmutableDosage_DoseAndRate.builder()
        .id(instance.id())
        .doseRange(instance.doseRange())
        .modifierExtension(instance.modifierExtension())
        .extension(instance.extension())
        .rateRatio(instance.rateRatio())
        .rateRange(instance.rateRange())
        .rateQuantity(instance.rateQuantity())
        .doseQuantity(instance.doseQuantity())
        .type(instance.type())
        .build();
  }

  /**
   * Creates a builder for {@link Dosage_DoseAndRate Dosage_DoseAndRate}.
   * <pre>
   * ImmutableDosage_DoseAndRate.builder()
   *    .id(String) // optional {@link Dosage_DoseAndRate#id() id}
   *    .doseRange(com.fhir.types.fhir.Range) // optional {@link Dosage_DoseAndRate#doseRange() doseRange}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link Dosage_DoseAndRate#modifierExtension() modifierExtension}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link Dosage_DoseAndRate#extension() extension}
   *    .rateRatio(com.fhir.types.fhir.Ratio) // optional {@link Dosage_DoseAndRate#rateRatio() rateRatio}
   *    .rateRange(com.fhir.types.fhir.Range) // optional {@link Dosage_DoseAndRate#rateRange() rateRange}
   *    .rateQuantity(com.fhir.types.fhir.Quantity) // optional {@link Dosage_DoseAndRate#rateQuantity() rateQuantity}
   *    .doseQuantity(com.fhir.types.fhir.Quantity) // optional {@link Dosage_DoseAndRate#doseQuantity() doseQuantity}
   *    .type(com.fhir.types.fhir.CodeableConcept) // optional {@link Dosage_DoseAndRate#type() type}
   *    .build();
   * </pre>
   * @return A new Dosage_DoseAndRate builder
   */
  public static ImmutableDosage_DoseAndRate.Builder builder() {
    return new ImmutableDosage_DoseAndRate.Builder();
  }

  /**
   * Builds instances of type {@link Dosage_DoseAndRate Dosage_DoseAndRate}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "Dosage_DoseAndRate", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_ID = 0x1L;
    private static final long OPT_BIT_DOSE_RANGE = 0x2L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x4L;
    private static final long OPT_BIT_EXTENSION = 0x8L;
    private static final long OPT_BIT_RATE_RATIO = 0x10L;
    private static final long OPT_BIT_RATE_RANGE = 0x20L;
    private static final long OPT_BIT_RATE_QUANTITY = 0x40L;
    private static final long OPT_BIT_DOSE_QUANTITY = 0x80L;
    private static final long OPT_BIT_TYPE = 0x100L;
    private long optBits;

    private @Nullable String id;
    private @Nullable Range doseRange;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable List<Extension> extension;
    private @Nullable Ratio rateRatio;
    private @Nullable Range rateRange;
    private @Nullable Quantity rateQuantity;
    private @Nullable Quantity doseQuantity;
    private @Nullable CodeableConcept type;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Dosage_DoseAndRate#id() id} to id.
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
     * Initializes the optional value {@link Dosage_DoseAndRate#id() id} to id.
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
     * Initializes the optional value {@link Dosage_DoseAndRate#doseRange() doseRange} to doseRange.
     * @param doseRange The value for doseRange
     * @return {@code this} builder for chained invocation
     */
    public final Builder doseRange(Range doseRange) {
      checkNotIsSet(doseRangeIsSet(), "doseRange");
      this.doseRange = Objects.requireNonNull(doseRange, "doseRange");
      optBits |= OPT_BIT_DOSE_RANGE;
      return this;
    }

    /**
     * Initializes the optional value {@link Dosage_DoseAndRate#doseRange() doseRange} to doseRange.
     * @param doseRange The value for doseRange
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("doseRange")
    public final Builder doseRange(Optional<? extends Range> doseRange) {
      checkNotIsSet(doseRangeIsSet(), "doseRange");
      this.doseRange = doseRange.orElse(null);
      optBits |= OPT_BIT_DOSE_RANGE;
      return this;
    }

    /**
     * Initializes the optional value {@link Dosage_DoseAndRate#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Dosage_DoseAndRate#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Dosage_DoseAndRate#extension() extension} to extension.
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
     * Initializes the optional value {@link Dosage_DoseAndRate#extension() extension} to extension.
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
     * Initializes the optional value {@link Dosage_DoseAndRate#rateRatio() rateRatio} to rateRatio.
     * @param rateRatio The value for rateRatio
     * @return {@code this} builder for chained invocation
     */
    public final Builder rateRatio(Ratio rateRatio) {
      checkNotIsSet(rateRatioIsSet(), "rateRatio");
      this.rateRatio = Objects.requireNonNull(rateRatio, "rateRatio");
      optBits |= OPT_BIT_RATE_RATIO;
      return this;
    }

    /**
     * Initializes the optional value {@link Dosage_DoseAndRate#rateRatio() rateRatio} to rateRatio.
     * @param rateRatio The value for rateRatio
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("rateRatio")
    public final Builder rateRatio(Optional<? extends Ratio> rateRatio) {
      checkNotIsSet(rateRatioIsSet(), "rateRatio");
      this.rateRatio = rateRatio.orElse(null);
      optBits |= OPT_BIT_RATE_RATIO;
      return this;
    }

    /**
     * Initializes the optional value {@link Dosage_DoseAndRate#rateRange() rateRange} to rateRange.
     * @param rateRange The value for rateRange
     * @return {@code this} builder for chained invocation
     */
    public final Builder rateRange(Range rateRange) {
      checkNotIsSet(rateRangeIsSet(), "rateRange");
      this.rateRange = Objects.requireNonNull(rateRange, "rateRange");
      optBits |= OPT_BIT_RATE_RANGE;
      return this;
    }

    /**
     * Initializes the optional value {@link Dosage_DoseAndRate#rateRange() rateRange} to rateRange.
     * @param rateRange The value for rateRange
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("rateRange")
    public final Builder rateRange(Optional<? extends Range> rateRange) {
      checkNotIsSet(rateRangeIsSet(), "rateRange");
      this.rateRange = rateRange.orElse(null);
      optBits |= OPT_BIT_RATE_RANGE;
      return this;
    }

    /**
     * Initializes the optional value {@link Dosage_DoseAndRate#rateQuantity() rateQuantity} to rateQuantity.
     * @param rateQuantity The value for rateQuantity
     * @return {@code this} builder for chained invocation
     */
    public final Builder rateQuantity(Quantity rateQuantity) {
      checkNotIsSet(rateQuantityIsSet(), "rateQuantity");
      this.rateQuantity = Objects.requireNonNull(rateQuantity, "rateQuantity");
      optBits |= OPT_BIT_RATE_QUANTITY;
      return this;
    }

    /**
     * Initializes the optional value {@link Dosage_DoseAndRate#rateQuantity() rateQuantity} to rateQuantity.
     * @param rateQuantity The value for rateQuantity
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("rateQuantity")
    public final Builder rateQuantity(Optional<? extends Quantity> rateQuantity) {
      checkNotIsSet(rateQuantityIsSet(), "rateQuantity");
      this.rateQuantity = rateQuantity.orElse(null);
      optBits |= OPT_BIT_RATE_QUANTITY;
      return this;
    }

    /**
     * Initializes the optional value {@link Dosage_DoseAndRate#doseQuantity() doseQuantity} to doseQuantity.
     * @param doseQuantity The value for doseQuantity
     * @return {@code this} builder for chained invocation
     */
    public final Builder doseQuantity(Quantity doseQuantity) {
      checkNotIsSet(doseQuantityIsSet(), "doseQuantity");
      this.doseQuantity = Objects.requireNonNull(doseQuantity, "doseQuantity");
      optBits |= OPT_BIT_DOSE_QUANTITY;
      return this;
    }

    /**
     * Initializes the optional value {@link Dosage_DoseAndRate#doseQuantity() doseQuantity} to doseQuantity.
     * @param doseQuantity The value for doseQuantity
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("doseQuantity")
    public final Builder doseQuantity(Optional<? extends Quantity> doseQuantity) {
      checkNotIsSet(doseQuantityIsSet(), "doseQuantity");
      this.doseQuantity = doseQuantity.orElse(null);
      optBits |= OPT_BIT_DOSE_QUANTITY;
      return this;
    }

    /**
     * Initializes the optional value {@link Dosage_DoseAndRate#type() type} to type.
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
     * Initializes the optional value {@link Dosage_DoseAndRate#type() type} to type.
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
     * Builds a new {@link Dosage_DoseAndRate Dosage_DoseAndRate}.
     * @return An immutable instance of Dosage_DoseAndRate
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public Dosage_DoseAndRate build() {
      return new ImmutableDosage_DoseAndRate(
          id,
          doseRange,
          modifierExtension,
          extension,
          rateRatio,
          rateRange,
          rateQuantity,
          doseQuantity,
          type);
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean doseRangeIsSet() {
      return (optBits & OPT_BIT_DOSE_RANGE) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean rateRatioIsSet() {
      return (optBits & OPT_BIT_RATE_RATIO) != 0;
    }

    private boolean rateRangeIsSet() {
      return (optBits & OPT_BIT_RATE_RANGE) != 0;
    }

    private boolean rateQuantityIsSet() {
      return (optBits & OPT_BIT_RATE_QUANTITY) != 0;
    }

    private boolean doseQuantityIsSet() {
      return (optBits & OPT_BIT_DOSE_QUANTITY) != 0;
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of Dosage_DoseAndRate is strict, attribute is already set: ".concat(name));
    }
  }
}
