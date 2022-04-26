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
 * Immutable implementation of {@link Immunization_ProtocolApplied}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableImmunization_ProtocolApplied.builder()}.
 */
@Generated(from = "Immunization_ProtocolApplied", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableImmunization_ProtocolApplied
    implements Immunization_ProtocolApplied {
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable List<Extension> extension;
  private final @Nullable Double doseNumberPositiveInt;
  private final @Nullable String id;
  private final @Nullable String doseNumberString;
  private final @Nullable Reference authority;
  private final @Nullable Double seriesDosesPositiveInt;
  private final @Nullable List<CodeableConcept> targetDisease;
  private final @Nullable String seriesDosesString;
  private final @Nullable String series;

  private ImmutableImmunization_ProtocolApplied(
      @Nullable List<Extension> modifierExtension,
      @Nullable List<Extension> extension,
      @Nullable Double doseNumberPositiveInt,
      @Nullable String id,
      @Nullable String doseNumberString,
      @Nullable Reference authority,
      @Nullable Double seriesDosesPositiveInt,
      @Nullable List<CodeableConcept> targetDisease,
      @Nullable String seriesDosesString,
      @Nullable String series) {
    this.modifierExtension = modifierExtension;
    this.extension = extension;
    this.doseNumberPositiveInt = doseNumberPositiveInt;
    this.id = id;
    this.doseNumberString = doseNumberString;
    this.authority = authority;
    this.seriesDosesPositiveInt = seriesDosesPositiveInt;
    this.targetDisease = targetDisease;
    this.seriesDosesString = seriesDosesString;
    this.series = series;
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
   * @return The value of the {@code doseNumberPositiveInt} attribute
   */
  @JsonProperty("doseNumberPositiveInt")
  @Override
  public Optional<Double> doseNumberPositiveInt() {
    return Optional.ofNullable(doseNumberPositiveInt);
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
   * @return The value of the {@code doseNumberString} attribute
   */
  @JsonProperty("doseNumberString")
  @Override
  public Optional<String> doseNumberString() {
    return Optional.ofNullable(doseNumberString);
  }

  /**
   * @return The value of the {@code authority} attribute
   */
  @JsonProperty("authority")
  @Override
  public Optional<Reference> authority() {
    return Optional.ofNullable(authority);
  }

  /**
   * @return The value of the {@code seriesDosesPositiveInt} attribute
   */
  @JsonProperty("seriesDosesPositiveInt")
  @Override
  public Optional<Double> seriesDosesPositiveInt() {
    return Optional.ofNullable(seriesDosesPositiveInt);
  }

  /**
   * @return The value of the {@code targetDisease} attribute
   */
  @JsonProperty("targetDisease")
  @Override
  public Optional<List<CodeableConcept>> targetDisease() {
    return Optional.ofNullable(targetDisease);
  }

  /**
   * @return The value of the {@code seriesDosesString} attribute
   */
  @JsonProperty("seriesDosesString")
  @Override
  public Optional<String> seriesDosesString() {
    return Optional.ofNullable(seriesDosesString);
  }

  /**
   * @return The value of the {@code series} attribute
   */
  @JsonProperty("series")
  @Override
  public Optional<String> series() {
    return Optional.ofNullable(series);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Immunization_ProtocolApplied#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunization_ProtocolApplied withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableImmunization_ProtocolApplied(
        newValue,
        this.extension,
        this.doseNumberPositiveInt,
        this.id,
        this.doseNumberString,
        this.authority,
        this.seriesDosesPositiveInt,
        this.targetDisease,
        this.seriesDosesString,
        this.series);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Immunization_ProtocolApplied#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImmunization_ProtocolApplied withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableImmunization_ProtocolApplied(
        value,
        this.extension,
        this.doseNumberPositiveInt,
        this.id,
        this.doseNumberString,
        this.authority,
        this.seriesDosesPositiveInt,
        this.targetDisease,
        this.seriesDosesString,
        this.series);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Immunization_ProtocolApplied#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunization_ProtocolApplied withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableImmunization_ProtocolApplied(
        this.modifierExtension,
        newValue,
        this.doseNumberPositiveInt,
        this.id,
        this.doseNumberString,
        this.authority,
        this.seriesDosesPositiveInt,
        this.targetDisease,
        this.seriesDosesString,
        this.series);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Immunization_ProtocolApplied#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImmunization_ProtocolApplied withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableImmunization_ProtocolApplied(
        this.modifierExtension,
        value,
        this.doseNumberPositiveInt,
        this.id,
        this.doseNumberString,
        this.authority,
        this.seriesDosesPositiveInt,
        this.targetDisease,
        this.seriesDosesString,
        this.series);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Immunization_ProtocolApplied#doseNumberPositiveInt() doseNumberPositiveInt} attribute.
   * @param value The value for doseNumberPositiveInt
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunization_ProtocolApplied withDoseNumberPositiveInt(double value) {
    @Nullable Double newValue = value;
    if (Objects.equals(this.doseNumberPositiveInt, newValue)) return this;
    return new ImmutableImmunization_ProtocolApplied(
        this.modifierExtension,
        this.extension,
        newValue,
        this.id,
        this.doseNumberString,
        this.authority,
        this.seriesDosesPositiveInt,
        this.targetDisease,
        this.seriesDosesString,
        this.series);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Immunization_ProtocolApplied#doseNumberPositiveInt() doseNumberPositiveInt} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for doseNumberPositiveInt
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunization_ProtocolApplied withDoseNumberPositiveInt(Optional<Double> optional) {
    @Nullable Double value = optional.orElse(null);
    if (Objects.equals(this.doseNumberPositiveInt, value)) return this;
    return new ImmutableImmunization_ProtocolApplied(
        this.modifierExtension,
        this.extension,
        value,
        this.id,
        this.doseNumberString,
        this.authority,
        this.seriesDosesPositiveInt,
        this.targetDisease,
        this.seriesDosesString,
        this.series);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Immunization_ProtocolApplied#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunization_ProtocolApplied withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableImmunization_ProtocolApplied(
        this.modifierExtension,
        this.extension,
        this.doseNumberPositiveInt,
        newValue,
        this.doseNumberString,
        this.authority,
        this.seriesDosesPositiveInt,
        this.targetDisease,
        this.seriesDosesString,
        this.series);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Immunization_ProtocolApplied#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunization_ProtocolApplied withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableImmunization_ProtocolApplied(
        this.modifierExtension,
        this.extension,
        this.doseNumberPositiveInt,
        value,
        this.doseNumberString,
        this.authority,
        this.seriesDosesPositiveInt,
        this.targetDisease,
        this.seriesDosesString,
        this.series);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Immunization_ProtocolApplied#doseNumberString() doseNumberString} attribute.
   * @param value The value for doseNumberString
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunization_ProtocolApplied withDoseNumberString(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "doseNumberString");
    if (Objects.equals(this.doseNumberString, newValue)) return this;
    return new ImmutableImmunization_ProtocolApplied(
        this.modifierExtension,
        this.extension,
        this.doseNumberPositiveInt,
        this.id,
        newValue,
        this.authority,
        this.seriesDosesPositiveInt,
        this.targetDisease,
        this.seriesDosesString,
        this.series);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Immunization_ProtocolApplied#doseNumberString() doseNumberString} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for doseNumberString
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunization_ProtocolApplied withDoseNumberString(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.doseNumberString, value)) return this;
    return new ImmutableImmunization_ProtocolApplied(
        this.modifierExtension,
        this.extension,
        this.doseNumberPositiveInt,
        this.id,
        value,
        this.authority,
        this.seriesDosesPositiveInt,
        this.targetDisease,
        this.seriesDosesString,
        this.series);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Immunization_ProtocolApplied#authority() authority} attribute.
   * @param value The value for authority
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunization_ProtocolApplied withAuthority(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "authority");
    if (this.authority == newValue) return this;
    return new ImmutableImmunization_ProtocolApplied(
        this.modifierExtension,
        this.extension,
        this.doseNumberPositiveInt,
        this.id,
        this.doseNumberString,
        newValue,
        this.seriesDosesPositiveInt,
        this.targetDisease,
        this.seriesDosesString,
        this.series);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Immunization_ProtocolApplied#authority() authority} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for authority
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImmunization_ProtocolApplied withAuthority(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.authority == value) return this;
    return new ImmutableImmunization_ProtocolApplied(
        this.modifierExtension,
        this.extension,
        this.doseNumberPositiveInt,
        this.id,
        this.doseNumberString,
        value,
        this.seriesDosesPositiveInt,
        this.targetDisease,
        this.seriesDosesString,
        this.series);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Immunization_ProtocolApplied#seriesDosesPositiveInt() seriesDosesPositiveInt} attribute.
   * @param value The value for seriesDosesPositiveInt
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunization_ProtocolApplied withSeriesDosesPositiveInt(double value) {
    @Nullable Double newValue = value;
    if (Objects.equals(this.seriesDosesPositiveInt, newValue)) return this;
    return new ImmutableImmunization_ProtocolApplied(
        this.modifierExtension,
        this.extension,
        this.doseNumberPositiveInt,
        this.id,
        this.doseNumberString,
        this.authority,
        newValue,
        this.targetDisease,
        this.seriesDosesString,
        this.series);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Immunization_ProtocolApplied#seriesDosesPositiveInt() seriesDosesPositiveInt} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for seriesDosesPositiveInt
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunization_ProtocolApplied withSeriesDosesPositiveInt(Optional<Double> optional) {
    @Nullable Double value = optional.orElse(null);
    if (Objects.equals(this.seriesDosesPositiveInt, value)) return this;
    return new ImmutableImmunization_ProtocolApplied(
        this.modifierExtension,
        this.extension,
        this.doseNumberPositiveInt,
        this.id,
        this.doseNumberString,
        this.authority,
        value,
        this.targetDisease,
        this.seriesDosesString,
        this.series);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Immunization_ProtocolApplied#targetDisease() targetDisease} attribute.
   * @param value The value for targetDisease
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunization_ProtocolApplied withTargetDisease(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "targetDisease");
    if (this.targetDisease == newValue) return this;
    return new ImmutableImmunization_ProtocolApplied(
        this.modifierExtension,
        this.extension,
        this.doseNumberPositiveInt,
        this.id,
        this.doseNumberString,
        this.authority,
        this.seriesDosesPositiveInt,
        newValue,
        this.seriesDosesString,
        this.series);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Immunization_ProtocolApplied#targetDisease() targetDisease} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for targetDisease
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImmunization_ProtocolApplied withTargetDisease(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.targetDisease == value) return this;
    return new ImmutableImmunization_ProtocolApplied(
        this.modifierExtension,
        this.extension,
        this.doseNumberPositiveInt,
        this.id,
        this.doseNumberString,
        this.authority,
        this.seriesDosesPositiveInt,
        value,
        this.seriesDosesString,
        this.series);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Immunization_ProtocolApplied#seriesDosesString() seriesDosesString} attribute.
   * @param value The value for seriesDosesString
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunization_ProtocolApplied withSeriesDosesString(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "seriesDosesString");
    if (Objects.equals(this.seriesDosesString, newValue)) return this;
    return new ImmutableImmunization_ProtocolApplied(
        this.modifierExtension,
        this.extension,
        this.doseNumberPositiveInt,
        this.id,
        this.doseNumberString,
        this.authority,
        this.seriesDosesPositiveInt,
        this.targetDisease,
        newValue,
        this.series);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Immunization_ProtocolApplied#seriesDosesString() seriesDosesString} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for seriesDosesString
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunization_ProtocolApplied withSeriesDosesString(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.seriesDosesString, value)) return this;
    return new ImmutableImmunization_ProtocolApplied(
        this.modifierExtension,
        this.extension,
        this.doseNumberPositiveInt,
        this.id,
        this.doseNumberString,
        this.authority,
        this.seriesDosesPositiveInt,
        this.targetDisease,
        value,
        this.series);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Immunization_ProtocolApplied#series() series} attribute.
   * @param value The value for series
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunization_ProtocolApplied withSeries(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "series");
    if (Objects.equals(this.series, newValue)) return this;
    return new ImmutableImmunization_ProtocolApplied(
        this.modifierExtension,
        this.extension,
        this.doseNumberPositiveInt,
        this.id,
        this.doseNumberString,
        this.authority,
        this.seriesDosesPositiveInt,
        this.targetDisease,
        this.seriesDosesString,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Immunization_ProtocolApplied#series() series} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for series
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImmunization_ProtocolApplied withSeries(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.series, value)) return this;
    return new ImmutableImmunization_ProtocolApplied(
        this.modifierExtension,
        this.extension,
        this.doseNumberPositiveInt,
        this.id,
        this.doseNumberString,
        this.authority,
        this.seriesDosesPositiveInt,
        this.targetDisease,
        this.seriesDosesString,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableImmunization_ProtocolApplied} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableImmunization_ProtocolApplied
        && equalTo((ImmutableImmunization_ProtocolApplied) another);
  }

  private boolean equalTo(ImmutableImmunization_ProtocolApplied another) {
    return Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(extension, another.extension)
        && Objects.equals(doseNumberPositiveInt, another.doseNumberPositiveInt)
        && Objects.equals(id, another.id)
        && Objects.equals(doseNumberString, another.doseNumberString)
        && Objects.equals(authority, another.authority)
        && Objects.equals(seriesDosesPositiveInt, another.seriesDosesPositiveInt)
        && Objects.equals(targetDisease, another.targetDisease)
        && Objects.equals(seriesDosesString, another.seriesDosesString)
        && Objects.equals(series, another.series);
  }

  /**
   * Computes a hash code from attributes: {@code modifierExtension}, {@code extension}, {@code doseNumberPositiveInt}, {@code id}, {@code doseNumberString}, {@code authority}, {@code seriesDosesPositiveInt}, {@code targetDisease}, {@code seriesDosesString}, {@code series}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(doseNumberPositiveInt);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(doseNumberString);
    h += (h << 5) + Objects.hashCode(authority);
    h += (h << 5) + Objects.hashCode(seriesDosesPositiveInt);
    h += (h << 5) + Objects.hashCode(targetDisease);
    h += (h << 5) + Objects.hashCode(seriesDosesString);
    h += (h << 5) + Objects.hashCode(series);
    return h;
  }

  /**
   * Prints the immutable value {@code Immunization_ProtocolApplied} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Immunization_ProtocolApplied{");
    if (modifierExtension != null) {
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (extension != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (doseNumberPositiveInt != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("doseNumberPositiveInt=").append(doseNumberPositiveInt);
    }
    if (id != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (doseNumberString != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("doseNumberString=").append(doseNumberString);
    }
    if (authority != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("authority=").append(authority);
    }
    if (seriesDosesPositiveInt != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("seriesDosesPositiveInt=").append(seriesDosesPositiveInt);
    }
    if (targetDisease != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("targetDisease=").append(targetDisease);
    }
    if (seriesDosesString != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("seriesDosesString=").append(seriesDosesString);
    }
    if (series != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("series=").append(series);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "Immunization_ProtocolApplied", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Immunization_ProtocolApplied {
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<Double> doseNumberPositiveInt = Optional.empty();
    boolean doseNumberPositiveIntIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<String> doseNumberString = Optional.empty();
    boolean doseNumberStringIsSet;
    @Nullable Optional<Reference> authority = Optional.empty();
    boolean authorityIsSet;
    @Nullable Optional<Double> seriesDosesPositiveInt = Optional.empty();
    boolean seriesDosesPositiveIntIsSet;
    @Nullable Optional<List<CodeableConcept>> targetDisease = Optional.empty();
    boolean targetDiseaseIsSet;
    @Nullable Optional<String> seriesDosesString = Optional.empty();
    boolean seriesDosesStringIsSet;
    @Nullable Optional<String> series = Optional.empty();
    boolean seriesIsSet;
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
    @JsonProperty("doseNumberPositiveInt")
    public void setDoseNumberPositiveInt(Optional<Double> doseNumberPositiveInt) {
      this.doseNumberPositiveInt = doseNumberPositiveInt;
      this.doseNumberPositiveIntIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("doseNumberString")
    public void setDoseNumberString(Optional<String> doseNumberString) {
      this.doseNumberString = doseNumberString;
      this.doseNumberStringIsSet = true;
    }
    @JsonProperty("authority")
    public void setAuthority(Optional<Reference> authority) {
      this.authority = authority;
      this.authorityIsSet = true;
    }
    @JsonProperty("seriesDosesPositiveInt")
    public void setSeriesDosesPositiveInt(Optional<Double> seriesDosesPositiveInt) {
      this.seriesDosesPositiveInt = seriesDosesPositiveInt;
      this.seriesDosesPositiveIntIsSet = true;
    }
    @JsonProperty("targetDisease")
    public void setTargetDisease(Optional<List<CodeableConcept>> targetDisease) {
      this.targetDisease = targetDisease;
      this.targetDiseaseIsSet = true;
    }
    @JsonProperty("seriesDosesString")
    public void setSeriesDosesString(Optional<String> seriesDosesString) {
      this.seriesDosesString = seriesDosesString;
      this.seriesDosesStringIsSet = true;
    }
    @JsonProperty("series")
    public void setSeries(Optional<String> series) {
      this.series = series;
      this.seriesIsSet = true;
    }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Double> doseNumberPositiveInt() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> doseNumberString() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> authority() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Double> seriesDosesPositiveInt() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> targetDisease() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> seriesDosesString() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> series() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableImmunization_ProtocolApplied fromJson(Json json) {
    ImmutableImmunization_ProtocolApplied.Builder builder = ImmutableImmunization_ProtocolApplied.builder();
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.doseNumberPositiveIntIsSet) {
      builder.doseNumberPositiveInt(json.doseNumberPositiveInt);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.doseNumberStringIsSet) {
      builder.doseNumberString(json.doseNumberString);
    }
    if (json.authorityIsSet) {
      builder.authority(json.authority);
    }
    if (json.seriesDosesPositiveIntIsSet) {
      builder.seriesDosesPositiveInt(json.seriesDosesPositiveInt);
    }
    if (json.targetDiseaseIsSet) {
      builder.targetDisease(json.targetDisease);
    }
    if (json.seriesDosesStringIsSet) {
      builder.seriesDosesString(json.seriesDosesString);
    }
    if (json.seriesIsSet) {
      builder.series(json.series);
    }
    return (ImmutableImmunization_ProtocolApplied) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Immunization_ProtocolApplied} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Immunization_ProtocolApplied instance
   */
  public static Immunization_ProtocolApplied copyOf(Immunization_ProtocolApplied instance) {
    if (instance instanceof ImmutableImmunization_ProtocolApplied) {
      return (ImmutableImmunization_ProtocolApplied) instance;
    }
    return ImmutableImmunization_ProtocolApplied.builder()
        .modifierExtension(instance.modifierExtension())
        .extension(instance.extension())
        .doseNumberPositiveInt(instance.doseNumberPositiveInt())
        .id(instance.id())
        .doseNumberString(instance.doseNumberString())
        .authority(instance.authority())
        .seriesDosesPositiveInt(instance.seriesDosesPositiveInt())
        .targetDisease(instance.targetDisease())
        .seriesDosesString(instance.seriesDosesString())
        .series(instance.series())
        .build();
  }

  /**
   * Creates a builder for {@link Immunization_ProtocolApplied Immunization_ProtocolApplied}.
   * <pre>
   * ImmutableImmunization_ProtocolApplied.builder()
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link Immunization_ProtocolApplied#modifierExtension() modifierExtension}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link Immunization_ProtocolApplied#extension() extension}
   *    .doseNumberPositiveInt(Double) // optional {@link Immunization_ProtocolApplied#doseNumberPositiveInt() doseNumberPositiveInt}
   *    .id(String) // optional {@link Immunization_ProtocolApplied#id() id}
   *    .doseNumberString(String) // optional {@link Immunization_ProtocolApplied#doseNumberString() doseNumberString}
   *    .authority(com.fhir.types.fhir.Reference) // optional {@link Immunization_ProtocolApplied#authority() authority}
   *    .seriesDosesPositiveInt(Double) // optional {@link Immunization_ProtocolApplied#seriesDosesPositiveInt() seriesDosesPositiveInt}
   *    .targetDisease(List&amp;lt;com.fhir.types.fhir.CodeableConcept&amp;gt;) // optional {@link Immunization_ProtocolApplied#targetDisease() targetDisease}
   *    .seriesDosesString(String) // optional {@link Immunization_ProtocolApplied#seriesDosesString() seriesDosesString}
   *    .series(String) // optional {@link Immunization_ProtocolApplied#series() series}
   *    .build();
   * </pre>
   * @return A new Immunization_ProtocolApplied builder
   */
  public static ImmutableImmunization_ProtocolApplied.Builder builder() {
    return new ImmutableImmunization_ProtocolApplied.Builder();
  }

  /**
   * Builds instances of type {@link Immunization_ProtocolApplied Immunization_ProtocolApplied}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "Immunization_ProtocolApplied", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x1L;
    private static final long OPT_BIT_EXTENSION = 0x2L;
    private static final long OPT_BIT_DOSE_NUMBER_POSITIVE_INT = 0x4L;
    private static final long OPT_BIT_ID = 0x8L;
    private static final long OPT_BIT_DOSE_NUMBER_STRING = 0x10L;
    private static final long OPT_BIT_AUTHORITY = 0x20L;
    private static final long OPT_BIT_SERIES_DOSES_POSITIVE_INT = 0x40L;
    private static final long OPT_BIT_TARGET_DISEASE = 0x80L;
    private static final long OPT_BIT_SERIES_DOSES_STRING = 0x100L;
    private static final long OPT_BIT_SERIES = 0x200L;
    private long optBits;

    private @Nullable List<Extension> modifierExtension;
    private @Nullable List<Extension> extension;
    private @Nullable Double doseNumberPositiveInt;
    private @Nullable String id;
    private @Nullable String doseNumberString;
    private @Nullable Reference authority;
    private @Nullable Double seriesDosesPositiveInt;
    private @Nullable List<CodeableConcept> targetDisease;
    private @Nullable String seriesDosesString;
    private @Nullable String series;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Immunization_ProtocolApplied#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Immunization_ProtocolApplied#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Immunization_ProtocolApplied#extension() extension} to extension.
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
     * Initializes the optional value {@link Immunization_ProtocolApplied#extension() extension} to extension.
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
     * Initializes the optional value {@link Immunization_ProtocolApplied#doseNumberPositiveInt() doseNumberPositiveInt} to doseNumberPositiveInt.
     * @param doseNumberPositiveInt The value for doseNumberPositiveInt
     * @return {@code this} builder for chained invocation
     */
    public final Builder doseNumberPositiveInt(double doseNumberPositiveInt) {
      checkNotIsSet(doseNumberPositiveIntIsSet(), "doseNumberPositiveInt");
      this.doseNumberPositiveInt = doseNumberPositiveInt;
      optBits |= OPT_BIT_DOSE_NUMBER_POSITIVE_INT;
      return this;
    }

    /**
     * Initializes the optional value {@link Immunization_ProtocolApplied#doseNumberPositiveInt() doseNumberPositiveInt} to doseNumberPositiveInt.
     * @param doseNumberPositiveInt The value for doseNumberPositiveInt
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("doseNumberPositiveInt")
    public final Builder doseNumberPositiveInt(Optional<Double> doseNumberPositiveInt) {
      checkNotIsSet(doseNumberPositiveIntIsSet(), "doseNumberPositiveInt");
      this.doseNumberPositiveInt = doseNumberPositiveInt.orElse(null);
      optBits |= OPT_BIT_DOSE_NUMBER_POSITIVE_INT;
      return this;
    }

    /**
     * Initializes the optional value {@link Immunization_ProtocolApplied#id() id} to id.
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
     * Initializes the optional value {@link Immunization_ProtocolApplied#id() id} to id.
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
     * Initializes the optional value {@link Immunization_ProtocolApplied#doseNumberString() doseNumberString} to doseNumberString.
     * @param doseNumberString The value for doseNumberString
     * @return {@code this} builder for chained invocation
     */
    public final Builder doseNumberString(String doseNumberString) {
      checkNotIsSet(doseNumberStringIsSet(), "doseNumberString");
      this.doseNumberString = Objects.requireNonNull(doseNumberString, "doseNumberString");
      optBits |= OPT_BIT_DOSE_NUMBER_STRING;
      return this;
    }

    /**
     * Initializes the optional value {@link Immunization_ProtocolApplied#doseNumberString() doseNumberString} to doseNumberString.
     * @param doseNumberString The value for doseNumberString
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("doseNumberString")
    public final Builder doseNumberString(Optional<String> doseNumberString) {
      checkNotIsSet(doseNumberStringIsSet(), "doseNumberString");
      this.doseNumberString = doseNumberString.orElse(null);
      optBits |= OPT_BIT_DOSE_NUMBER_STRING;
      return this;
    }

    /**
     * Initializes the optional value {@link Immunization_ProtocolApplied#authority() authority} to authority.
     * @param authority The value for authority
     * @return {@code this} builder for chained invocation
     */
    public final Builder authority(Reference authority) {
      checkNotIsSet(authorityIsSet(), "authority");
      this.authority = Objects.requireNonNull(authority, "authority");
      optBits |= OPT_BIT_AUTHORITY;
      return this;
    }

    /**
     * Initializes the optional value {@link Immunization_ProtocolApplied#authority() authority} to authority.
     * @param authority The value for authority
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("authority")
    public final Builder authority(Optional<? extends Reference> authority) {
      checkNotIsSet(authorityIsSet(), "authority");
      this.authority = authority.orElse(null);
      optBits |= OPT_BIT_AUTHORITY;
      return this;
    }

    /**
     * Initializes the optional value {@link Immunization_ProtocolApplied#seriesDosesPositiveInt() seriesDosesPositiveInt} to seriesDosesPositiveInt.
     * @param seriesDosesPositiveInt The value for seriesDosesPositiveInt
     * @return {@code this} builder for chained invocation
     */
    public final Builder seriesDosesPositiveInt(double seriesDosesPositiveInt) {
      checkNotIsSet(seriesDosesPositiveIntIsSet(), "seriesDosesPositiveInt");
      this.seriesDosesPositiveInt = seriesDosesPositiveInt;
      optBits |= OPT_BIT_SERIES_DOSES_POSITIVE_INT;
      return this;
    }

    /**
     * Initializes the optional value {@link Immunization_ProtocolApplied#seriesDosesPositiveInt() seriesDosesPositiveInt} to seriesDosesPositiveInt.
     * @param seriesDosesPositiveInt The value for seriesDosesPositiveInt
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("seriesDosesPositiveInt")
    public final Builder seriesDosesPositiveInt(Optional<Double> seriesDosesPositiveInt) {
      checkNotIsSet(seriesDosesPositiveIntIsSet(), "seriesDosesPositiveInt");
      this.seriesDosesPositiveInt = seriesDosesPositiveInt.orElse(null);
      optBits |= OPT_BIT_SERIES_DOSES_POSITIVE_INT;
      return this;
    }

    /**
     * Initializes the optional value {@link Immunization_ProtocolApplied#targetDisease() targetDisease} to targetDisease.
     * @param targetDisease The value for targetDisease
     * @return {@code this} builder for chained invocation
     */
    public final Builder targetDisease(List<CodeableConcept> targetDisease) {
      checkNotIsSet(targetDiseaseIsSet(), "targetDisease");
      this.targetDisease = Objects.requireNonNull(targetDisease, "targetDisease");
      optBits |= OPT_BIT_TARGET_DISEASE;
      return this;
    }

    /**
     * Initializes the optional value {@link Immunization_ProtocolApplied#targetDisease() targetDisease} to targetDisease.
     * @param targetDisease The value for targetDisease
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("targetDisease")
    public final Builder targetDisease(Optional<? extends List<CodeableConcept>> targetDisease) {
      checkNotIsSet(targetDiseaseIsSet(), "targetDisease");
      this.targetDisease = targetDisease.orElse(null);
      optBits |= OPT_BIT_TARGET_DISEASE;
      return this;
    }

    /**
     * Initializes the optional value {@link Immunization_ProtocolApplied#seriesDosesString() seriesDosesString} to seriesDosesString.
     * @param seriesDosesString The value for seriesDosesString
     * @return {@code this} builder for chained invocation
     */
    public final Builder seriesDosesString(String seriesDosesString) {
      checkNotIsSet(seriesDosesStringIsSet(), "seriesDosesString");
      this.seriesDosesString = Objects.requireNonNull(seriesDosesString, "seriesDosesString");
      optBits |= OPT_BIT_SERIES_DOSES_STRING;
      return this;
    }

    /**
     * Initializes the optional value {@link Immunization_ProtocolApplied#seriesDosesString() seriesDosesString} to seriesDosesString.
     * @param seriesDosesString The value for seriesDosesString
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("seriesDosesString")
    public final Builder seriesDosesString(Optional<String> seriesDosesString) {
      checkNotIsSet(seriesDosesStringIsSet(), "seriesDosesString");
      this.seriesDosesString = seriesDosesString.orElse(null);
      optBits |= OPT_BIT_SERIES_DOSES_STRING;
      return this;
    }

    /**
     * Initializes the optional value {@link Immunization_ProtocolApplied#series() series} to series.
     * @param series The value for series
     * @return {@code this} builder for chained invocation
     */
    public final Builder series(String series) {
      checkNotIsSet(seriesIsSet(), "series");
      this.series = Objects.requireNonNull(series, "series");
      optBits |= OPT_BIT_SERIES;
      return this;
    }

    /**
     * Initializes the optional value {@link Immunization_ProtocolApplied#series() series} to series.
     * @param series The value for series
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("series")
    public final Builder series(Optional<String> series) {
      checkNotIsSet(seriesIsSet(), "series");
      this.series = series.orElse(null);
      optBits |= OPT_BIT_SERIES;
      return this;
    }

    /**
     * Builds a new {@link Immunization_ProtocolApplied Immunization_ProtocolApplied}.
     * @return An immutable instance of Immunization_ProtocolApplied
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public Immunization_ProtocolApplied build() {
      return new ImmutableImmunization_ProtocolApplied(
          modifierExtension,
          extension,
          doseNumberPositiveInt,
          id,
          doseNumberString,
          authority,
          seriesDosesPositiveInt,
          targetDisease,
          seriesDosesString,
          series);
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean doseNumberPositiveIntIsSet() {
      return (optBits & OPT_BIT_DOSE_NUMBER_POSITIVE_INT) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean doseNumberStringIsSet() {
      return (optBits & OPT_BIT_DOSE_NUMBER_STRING) != 0;
    }

    private boolean authorityIsSet() {
      return (optBits & OPT_BIT_AUTHORITY) != 0;
    }

    private boolean seriesDosesPositiveIntIsSet() {
      return (optBits & OPT_BIT_SERIES_DOSES_POSITIVE_INT) != 0;
    }

    private boolean targetDiseaseIsSet() {
      return (optBits & OPT_BIT_TARGET_DISEASE) != 0;
    }

    private boolean seriesDosesStringIsSet() {
      return (optBits & OPT_BIT_SERIES_DOSES_STRING) != 0;
    }

    private boolean seriesIsSet() {
      return (optBits & OPT_BIT_SERIES) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of Immunization_ProtocolApplied is strict, attribute is already set: ".concat(name));
    }
  }
}
