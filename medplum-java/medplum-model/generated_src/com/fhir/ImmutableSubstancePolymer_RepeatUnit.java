package com.fhir;

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
 * Immutable implementation of {@link SubstancePolymer_RepeatUnit}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableSubstancePolymer_RepeatUnit.builder()}.
 */
@Generated(from = "SubstancePolymer_RepeatUnit", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableSubstancePolymer_RepeatUnit implements SubstancePolymer_RepeatUnit {
  private final @Nullable List<Extension> extension;
  private final @Nullable List<SubstancePolymer_StructuralRepresentation> structuralRepresentation;
  private final @Nullable String id;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable SubstanceAmount amount;
  private final @Nullable CodeableConcept orientationOfPolymerisation;
  private final @Nullable List<SubstancePolymer_DegreeOfPolymerisation> degreeOfPolymerisation;
  private final @Nullable String repeatUnit;

  private ImmutableSubstancePolymer_RepeatUnit(
      @Nullable List<Extension> extension,
      @Nullable List<SubstancePolymer_StructuralRepresentation> structuralRepresentation,
      @Nullable String id,
      @Nullable List<Extension> modifierExtension,
      @Nullable SubstanceAmount amount,
      @Nullable CodeableConcept orientationOfPolymerisation,
      @Nullable List<SubstancePolymer_DegreeOfPolymerisation> degreeOfPolymerisation,
      @Nullable String repeatUnit) {
    this.extension = extension;
    this.structuralRepresentation = structuralRepresentation;
    this.id = id;
    this.modifierExtension = modifierExtension;
    this.amount = amount;
    this.orientationOfPolymerisation = orientationOfPolymerisation;
    this.degreeOfPolymerisation = degreeOfPolymerisation;
    this.repeatUnit = repeatUnit;
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
   * @return The value of the {@code structuralRepresentation} attribute
   */
  @JsonProperty("structuralRepresentation")
  @Override
  public Optional<List<SubstancePolymer_StructuralRepresentation>> structuralRepresentation() {
    return Optional.ofNullable(structuralRepresentation);
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
   * @return The value of the {@code amount} attribute
   */
  @JsonProperty("amount")
  @Override
  public Optional<SubstanceAmount> amount() {
    return Optional.ofNullable(amount);
  }

  /**
   * @return The value of the {@code orientationOfPolymerisation} attribute
   */
  @JsonProperty("orientationOfPolymerisation")
  @Override
  public Optional<CodeableConcept> orientationOfPolymerisation() {
    return Optional.ofNullable(orientationOfPolymerisation);
  }

  /**
   * @return The value of the {@code degreeOfPolymerisation} attribute
   */
  @JsonProperty("degreeOfPolymerisation")
  @Override
  public Optional<List<SubstancePolymer_DegreeOfPolymerisation>> degreeOfPolymerisation() {
    return Optional.ofNullable(degreeOfPolymerisation);
  }

  /**
   * @return The value of the {@code repeatUnit} attribute
   */
  @JsonProperty("repeatUnit")
  @Override
  public Optional<String> repeatUnit() {
    return Optional.ofNullable(repeatUnit);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstancePolymer_RepeatUnit#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstancePolymer_RepeatUnit withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableSubstancePolymer_RepeatUnit(
        newValue,
        this.structuralRepresentation,
        this.id,
        this.modifierExtension,
        this.amount,
        this.orientationOfPolymerisation,
        this.degreeOfPolymerisation,
        this.repeatUnit);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstancePolymer_RepeatUnit#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstancePolymer_RepeatUnit withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableSubstancePolymer_RepeatUnit(
        value,
        this.structuralRepresentation,
        this.id,
        this.modifierExtension,
        this.amount,
        this.orientationOfPolymerisation,
        this.degreeOfPolymerisation,
        this.repeatUnit);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstancePolymer_RepeatUnit#structuralRepresentation() structuralRepresentation} attribute.
   * @param value The value for structuralRepresentation
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstancePolymer_RepeatUnit withStructuralRepresentation(List<SubstancePolymer_StructuralRepresentation> value) {
    @Nullable List<SubstancePolymer_StructuralRepresentation> newValue = Objects.requireNonNull(value, "structuralRepresentation");
    if (this.structuralRepresentation == newValue) return this;
    return new ImmutableSubstancePolymer_RepeatUnit(
        this.extension,
        newValue,
        this.id,
        this.modifierExtension,
        this.amount,
        this.orientationOfPolymerisation,
        this.degreeOfPolymerisation,
        this.repeatUnit);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstancePolymer_RepeatUnit#structuralRepresentation() structuralRepresentation} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for structuralRepresentation
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstancePolymer_RepeatUnit withStructuralRepresentation(Optional<? extends List<SubstancePolymer_StructuralRepresentation>> optional) {
    @Nullable List<SubstancePolymer_StructuralRepresentation> value = optional.orElse(null);
    if (this.structuralRepresentation == value) return this;
    return new ImmutableSubstancePolymer_RepeatUnit(
        this.extension,
        value,
        this.id,
        this.modifierExtension,
        this.amount,
        this.orientationOfPolymerisation,
        this.degreeOfPolymerisation,
        this.repeatUnit);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstancePolymer_RepeatUnit#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstancePolymer_RepeatUnit withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableSubstancePolymer_RepeatUnit(
        this.extension,
        this.structuralRepresentation,
        newValue,
        this.modifierExtension,
        this.amount,
        this.orientationOfPolymerisation,
        this.degreeOfPolymerisation,
        this.repeatUnit);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstancePolymer_RepeatUnit#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstancePolymer_RepeatUnit withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableSubstancePolymer_RepeatUnit(
        this.extension,
        this.structuralRepresentation,
        value,
        this.modifierExtension,
        this.amount,
        this.orientationOfPolymerisation,
        this.degreeOfPolymerisation,
        this.repeatUnit);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstancePolymer_RepeatUnit#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstancePolymer_RepeatUnit withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableSubstancePolymer_RepeatUnit(
        this.extension,
        this.structuralRepresentation,
        this.id,
        newValue,
        this.amount,
        this.orientationOfPolymerisation,
        this.degreeOfPolymerisation,
        this.repeatUnit);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstancePolymer_RepeatUnit#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstancePolymer_RepeatUnit withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableSubstancePolymer_RepeatUnit(
        this.extension,
        this.structuralRepresentation,
        this.id,
        value,
        this.amount,
        this.orientationOfPolymerisation,
        this.degreeOfPolymerisation,
        this.repeatUnit);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstancePolymer_RepeatUnit#amount() amount} attribute.
   * @param value The value for amount
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstancePolymer_RepeatUnit withAmount(SubstanceAmount value) {
    @Nullable SubstanceAmount newValue = Objects.requireNonNull(value, "amount");
    if (this.amount == newValue) return this;
    return new ImmutableSubstancePolymer_RepeatUnit(
        this.extension,
        this.structuralRepresentation,
        this.id,
        this.modifierExtension,
        newValue,
        this.orientationOfPolymerisation,
        this.degreeOfPolymerisation,
        this.repeatUnit);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstancePolymer_RepeatUnit#amount() amount} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for amount
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstancePolymer_RepeatUnit withAmount(Optional<? extends SubstanceAmount> optional) {
    @Nullable SubstanceAmount value = optional.orElse(null);
    if (this.amount == value) return this;
    return new ImmutableSubstancePolymer_RepeatUnit(
        this.extension,
        this.structuralRepresentation,
        this.id,
        this.modifierExtension,
        value,
        this.orientationOfPolymerisation,
        this.degreeOfPolymerisation,
        this.repeatUnit);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstancePolymer_RepeatUnit#orientationOfPolymerisation() orientationOfPolymerisation} attribute.
   * @param value The value for orientationOfPolymerisation
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstancePolymer_RepeatUnit withOrientationOfPolymerisation(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "orientationOfPolymerisation");
    if (this.orientationOfPolymerisation == newValue) return this;
    return new ImmutableSubstancePolymer_RepeatUnit(
        this.extension,
        this.structuralRepresentation,
        this.id,
        this.modifierExtension,
        this.amount,
        newValue,
        this.degreeOfPolymerisation,
        this.repeatUnit);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstancePolymer_RepeatUnit#orientationOfPolymerisation() orientationOfPolymerisation} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for orientationOfPolymerisation
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstancePolymer_RepeatUnit withOrientationOfPolymerisation(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.orientationOfPolymerisation == value) return this;
    return new ImmutableSubstancePolymer_RepeatUnit(
        this.extension,
        this.structuralRepresentation,
        this.id,
        this.modifierExtension,
        this.amount,
        value,
        this.degreeOfPolymerisation,
        this.repeatUnit);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstancePolymer_RepeatUnit#degreeOfPolymerisation() degreeOfPolymerisation} attribute.
   * @param value The value for degreeOfPolymerisation
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstancePolymer_RepeatUnit withDegreeOfPolymerisation(List<SubstancePolymer_DegreeOfPolymerisation> value) {
    @Nullable List<SubstancePolymer_DegreeOfPolymerisation> newValue = Objects.requireNonNull(value, "degreeOfPolymerisation");
    if (this.degreeOfPolymerisation == newValue) return this;
    return new ImmutableSubstancePolymer_RepeatUnit(
        this.extension,
        this.structuralRepresentation,
        this.id,
        this.modifierExtension,
        this.amount,
        this.orientationOfPolymerisation,
        newValue,
        this.repeatUnit);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstancePolymer_RepeatUnit#degreeOfPolymerisation() degreeOfPolymerisation} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for degreeOfPolymerisation
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstancePolymer_RepeatUnit withDegreeOfPolymerisation(Optional<? extends List<SubstancePolymer_DegreeOfPolymerisation>> optional) {
    @Nullable List<SubstancePolymer_DegreeOfPolymerisation> value = optional.orElse(null);
    if (this.degreeOfPolymerisation == value) return this;
    return new ImmutableSubstancePolymer_RepeatUnit(
        this.extension,
        this.structuralRepresentation,
        this.id,
        this.modifierExtension,
        this.amount,
        this.orientationOfPolymerisation,
        value,
        this.repeatUnit);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstancePolymer_RepeatUnit#repeatUnit() repeatUnit} attribute.
   * @param value The value for repeatUnit
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstancePolymer_RepeatUnit withRepeatUnit(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "repeatUnit");
    if (Objects.equals(this.repeatUnit, newValue)) return this;
    return new ImmutableSubstancePolymer_RepeatUnit(
        this.extension,
        this.structuralRepresentation,
        this.id,
        this.modifierExtension,
        this.amount,
        this.orientationOfPolymerisation,
        this.degreeOfPolymerisation,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstancePolymer_RepeatUnit#repeatUnit() repeatUnit} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for repeatUnit
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstancePolymer_RepeatUnit withRepeatUnit(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.repeatUnit, value)) return this;
    return new ImmutableSubstancePolymer_RepeatUnit(
        this.extension,
        this.structuralRepresentation,
        this.id,
        this.modifierExtension,
        this.amount,
        this.orientationOfPolymerisation,
        this.degreeOfPolymerisation,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableSubstancePolymer_RepeatUnit} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableSubstancePolymer_RepeatUnit
        && equalTo((ImmutableSubstancePolymer_RepeatUnit) another);
  }

  private boolean equalTo(ImmutableSubstancePolymer_RepeatUnit another) {
    return Objects.equals(extension, another.extension)
        && Objects.equals(structuralRepresentation, another.structuralRepresentation)
        && Objects.equals(id, another.id)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(amount, another.amount)
        && Objects.equals(orientationOfPolymerisation, another.orientationOfPolymerisation)
        && Objects.equals(degreeOfPolymerisation, another.degreeOfPolymerisation)
        && Objects.equals(repeatUnit, another.repeatUnit);
  }

  /**
   * Computes a hash code from attributes: {@code extension}, {@code structuralRepresentation}, {@code id}, {@code modifierExtension}, {@code amount}, {@code orientationOfPolymerisation}, {@code degreeOfPolymerisation}, {@code repeatUnit}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(structuralRepresentation);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(amount);
    h += (h << 5) + Objects.hashCode(orientationOfPolymerisation);
    h += (h << 5) + Objects.hashCode(degreeOfPolymerisation);
    h += (h << 5) + Objects.hashCode(repeatUnit);
    return h;
  }

  /**
   * Prints the immutable value {@code SubstancePolymer_RepeatUnit} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("SubstancePolymer_RepeatUnit{");
    if (extension != null) {
      builder.append("extension=").append(extension);
    }
    if (structuralRepresentation != null) {
      if (builder.length() > 28) builder.append(", ");
      builder.append("structuralRepresentation=").append(structuralRepresentation);
    }
    if (id != null) {
      if (builder.length() > 28) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (modifierExtension != null) {
      if (builder.length() > 28) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (amount != null) {
      if (builder.length() > 28) builder.append(", ");
      builder.append("amount=").append(amount);
    }
    if (orientationOfPolymerisation != null) {
      if (builder.length() > 28) builder.append(", ");
      builder.append("orientationOfPolymerisation=").append(orientationOfPolymerisation);
    }
    if (degreeOfPolymerisation != null) {
      if (builder.length() > 28) builder.append(", ");
      builder.append("degreeOfPolymerisation=").append(degreeOfPolymerisation);
    }
    if (repeatUnit != null) {
      if (builder.length() > 28) builder.append(", ");
      builder.append("repeatUnit=").append(repeatUnit);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "SubstancePolymer_RepeatUnit", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements SubstancePolymer_RepeatUnit {
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<List<SubstancePolymer_StructuralRepresentation>> structuralRepresentation = Optional.empty();
    boolean structuralRepresentationIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<SubstanceAmount> amount = Optional.empty();
    boolean amountIsSet;
    @Nullable Optional<CodeableConcept> orientationOfPolymerisation = Optional.empty();
    boolean orientationOfPolymerisationIsSet;
    @Nullable Optional<List<SubstancePolymer_DegreeOfPolymerisation>> degreeOfPolymerisation = Optional.empty();
    boolean degreeOfPolymerisationIsSet;
    @Nullable Optional<String> repeatUnit = Optional.empty();
    boolean repeatUnitIsSet;
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("structuralRepresentation")
    public void setStructuralRepresentation(Optional<List<SubstancePolymer_StructuralRepresentation>> structuralRepresentation) {
      this.structuralRepresentation = structuralRepresentation;
      this.structuralRepresentationIsSet = true;
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
    @JsonProperty("amount")
    public void setAmount(Optional<SubstanceAmount> amount) {
      this.amount = amount;
      this.amountIsSet = true;
    }
    @JsonProperty("orientationOfPolymerisation")
    public void setOrientationOfPolymerisation(Optional<CodeableConcept> orientationOfPolymerisation) {
      this.orientationOfPolymerisation = orientationOfPolymerisation;
      this.orientationOfPolymerisationIsSet = true;
    }
    @JsonProperty("degreeOfPolymerisation")
    public void setDegreeOfPolymerisation(Optional<List<SubstancePolymer_DegreeOfPolymerisation>> degreeOfPolymerisation) {
      this.degreeOfPolymerisation = degreeOfPolymerisation;
      this.degreeOfPolymerisationIsSet = true;
    }
    @JsonProperty("repeatUnit")
    public void setRepeatUnit(Optional<String> repeatUnit) {
      this.repeatUnit = repeatUnit;
      this.repeatUnitIsSet = true;
    }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<SubstancePolymer_StructuralRepresentation>> structuralRepresentation() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<SubstanceAmount> amount() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> orientationOfPolymerisation() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<SubstancePolymer_DegreeOfPolymerisation>> degreeOfPolymerisation() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> repeatUnit() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableSubstancePolymer_RepeatUnit fromJson(Json json) {
    ImmutableSubstancePolymer_RepeatUnit.Builder builder = ImmutableSubstancePolymer_RepeatUnit.builder();
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.structuralRepresentationIsSet) {
      builder.structuralRepresentation(json.structuralRepresentation);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.amountIsSet) {
      builder.amount(json.amount);
    }
    if (json.orientationOfPolymerisationIsSet) {
      builder.orientationOfPolymerisation(json.orientationOfPolymerisation);
    }
    if (json.degreeOfPolymerisationIsSet) {
      builder.degreeOfPolymerisation(json.degreeOfPolymerisation);
    }
    if (json.repeatUnitIsSet) {
      builder.repeatUnit(json.repeatUnit);
    }
    return (ImmutableSubstancePolymer_RepeatUnit) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link SubstancePolymer_RepeatUnit} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable SubstancePolymer_RepeatUnit instance
   */
  public static SubstancePolymer_RepeatUnit copyOf(SubstancePolymer_RepeatUnit instance) {
    if (instance instanceof ImmutableSubstancePolymer_RepeatUnit) {
      return (ImmutableSubstancePolymer_RepeatUnit) instance;
    }
    return ImmutableSubstancePolymer_RepeatUnit.builder()
        .extension(instance.extension())
        .structuralRepresentation(instance.structuralRepresentation())
        .id(instance.id())
        .modifierExtension(instance.modifierExtension())
        .amount(instance.amount())
        .orientationOfPolymerisation(instance.orientationOfPolymerisation())
        .degreeOfPolymerisation(instance.degreeOfPolymerisation())
        .repeatUnit(instance.repeatUnit())
        .build();
  }

  /**
   * Creates a builder for {@link SubstancePolymer_RepeatUnit SubstancePolymer_RepeatUnit}.
   * <pre>
   * ImmutableSubstancePolymer_RepeatUnit.builder()
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link SubstancePolymer_RepeatUnit#extension() extension}
   *    .structuralRepresentation(List&amp;lt;com.fhir.SubstancePolymer_StructuralRepresentation&amp;gt;) // optional {@link SubstancePolymer_RepeatUnit#structuralRepresentation() structuralRepresentation}
   *    .id(String) // optional {@link SubstancePolymer_RepeatUnit#id() id}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link SubstancePolymer_RepeatUnit#modifierExtension() modifierExtension}
   *    .amount(com.fhir.SubstanceAmount) // optional {@link SubstancePolymer_RepeatUnit#amount() amount}
   *    .orientationOfPolymerisation(com.fhir.CodeableConcept) // optional {@link SubstancePolymer_RepeatUnit#orientationOfPolymerisation() orientationOfPolymerisation}
   *    .degreeOfPolymerisation(List&amp;lt;com.fhir.SubstancePolymer_DegreeOfPolymerisation&amp;gt;) // optional {@link SubstancePolymer_RepeatUnit#degreeOfPolymerisation() degreeOfPolymerisation}
   *    .repeatUnit(String) // optional {@link SubstancePolymer_RepeatUnit#repeatUnit() repeatUnit}
   *    .build();
   * </pre>
   * @return A new SubstancePolymer_RepeatUnit builder
   */
  public static ImmutableSubstancePolymer_RepeatUnit.Builder builder() {
    return new ImmutableSubstancePolymer_RepeatUnit.Builder();
  }

  /**
   * Builds instances of type {@link SubstancePolymer_RepeatUnit SubstancePolymer_RepeatUnit}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "SubstancePolymer_RepeatUnit", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_EXTENSION = 0x1L;
    private static final long OPT_BIT_STRUCTURAL_REPRESENTATION = 0x2L;
    private static final long OPT_BIT_ID = 0x4L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x8L;
    private static final long OPT_BIT_AMOUNT = 0x10L;
    private static final long OPT_BIT_ORIENTATION_OF_POLYMERISATION = 0x20L;
    private static final long OPT_BIT_DEGREE_OF_POLYMERISATION = 0x40L;
    private static final long OPT_BIT_REPEAT_UNIT = 0x80L;
    private long optBits;

    private @Nullable List<Extension> extension;
    private @Nullable List<SubstancePolymer_StructuralRepresentation> structuralRepresentation;
    private @Nullable String id;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable SubstanceAmount amount;
    private @Nullable CodeableConcept orientationOfPolymerisation;
    private @Nullable List<SubstancePolymer_DegreeOfPolymerisation> degreeOfPolymerisation;
    private @Nullable String repeatUnit;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link SubstancePolymer_RepeatUnit#extension() extension} to extension.
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
     * Initializes the optional value {@link SubstancePolymer_RepeatUnit#extension() extension} to extension.
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
     * Initializes the optional value {@link SubstancePolymer_RepeatUnit#structuralRepresentation() structuralRepresentation} to structuralRepresentation.
     * @param structuralRepresentation The value for structuralRepresentation
     * @return {@code this} builder for chained invocation
     */
    public final Builder structuralRepresentation(List<SubstancePolymer_StructuralRepresentation> structuralRepresentation) {
      checkNotIsSet(structuralRepresentationIsSet(), "structuralRepresentation");
      this.structuralRepresentation = Objects.requireNonNull(structuralRepresentation, "structuralRepresentation");
      optBits |= OPT_BIT_STRUCTURAL_REPRESENTATION;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstancePolymer_RepeatUnit#structuralRepresentation() structuralRepresentation} to structuralRepresentation.
     * @param structuralRepresentation The value for structuralRepresentation
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("structuralRepresentation")
    public final Builder structuralRepresentation(Optional<? extends List<SubstancePolymer_StructuralRepresentation>> structuralRepresentation) {
      checkNotIsSet(structuralRepresentationIsSet(), "structuralRepresentation");
      this.structuralRepresentation = structuralRepresentation.orElse(null);
      optBits |= OPT_BIT_STRUCTURAL_REPRESENTATION;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstancePolymer_RepeatUnit#id() id} to id.
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
     * Initializes the optional value {@link SubstancePolymer_RepeatUnit#id() id} to id.
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
     * Initializes the optional value {@link SubstancePolymer_RepeatUnit#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link SubstancePolymer_RepeatUnit#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link SubstancePolymer_RepeatUnit#amount() amount} to amount.
     * @param amount The value for amount
     * @return {@code this} builder for chained invocation
     */
    public final Builder amount(SubstanceAmount amount) {
      checkNotIsSet(amountIsSet(), "amount");
      this.amount = Objects.requireNonNull(amount, "amount");
      optBits |= OPT_BIT_AMOUNT;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstancePolymer_RepeatUnit#amount() amount} to amount.
     * @param amount The value for amount
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("amount")
    public final Builder amount(Optional<? extends SubstanceAmount> amount) {
      checkNotIsSet(amountIsSet(), "amount");
      this.amount = amount.orElse(null);
      optBits |= OPT_BIT_AMOUNT;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstancePolymer_RepeatUnit#orientationOfPolymerisation() orientationOfPolymerisation} to orientationOfPolymerisation.
     * @param orientationOfPolymerisation The value for orientationOfPolymerisation
     * @return {@code this} builder for chained invocation
     */
    public final Builder orientationOfPolymerisation(CodeableConcept orientationOfPolymerisation) {
      checkNotIsSet(orientationOfPolymerisationIsSet(), "orientationOfPolymerisation");
      this.orientationOfPolymerisation = Objects.requireNonNull(orientationOfPolymerisation, "orientationOfPolymerisation");
      optBits |= OPT_BIT_ORIENTATION_OF_POLYMERISATION;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstancePolymer_RepeatUnit#orientationOfPolymerisation() orientationOfPolymerisation} to orientationOfPolymerisation.
     * @param orientationOfPolymerisation The value for orientationOfPolymerisation
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("orientationOfPolymerisation")
    public final Builder orientationOfPolymerisation(Optional<? extends CodeableConcept> orientationOfPolymerisation) {
      checkNotIsSet(orientationOfPolymerisationIsSet(), "orientationOfPolymerisation");
      this.orientationOfPolymerisation = orientationOfPolymerisation.orElse(null);
      optBits |= OPT_BIT_ORIENTATION_OF_POLYMERISATION;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstancePolymer_RepeatUnit#degreeOfPolymerisation() degreeOfPolymerisation} to degreeOfPolymerisation.
     * @param degreeOfPolymerisation The value for degreeOfPolymerisation
     * @return {@code this} builder for chained invocation
     */
    public final Builder degreeOfPolymerisation(List<SubstancePolymer_DegreeOfPolymerisation> degreeOfPolymerisation) {
      checkNotIsSet(degreeOfPolymerisationIsSet(), "degreeOfPolymerisation");
      this.degreeOfPolymerisation = Objects.requireNonNull(degreeOfPolymerisation, "degreeOfPolymerisation");
      optBits |= OPT_BIT_DEGREE_OF_POLYMERISATION;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstancePolymer_RepeatUnit#degreeOfPolymerisation() degreeOfPolymerisation} to degreeOfPolymerisation.
     * @param degreeOfPolymerisation The value for degreeOfPolymerisation
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("degreeOfPolymerisation")
    public final Builder degreeOfPolymerisation(Optional<? extends List<SubstancePolymer_DegreeOfPolymerisation>> degreeOfPolymerisation) {
      checkNotIsSet(degreeOfPolymerisationIsSet(), "degreeOfPolymerisation");
      this.degreeOfPolymerisation = degreeOfPolymerisation.orElse(null);
      optBits |= OPT_BIT_DEGREE_OF_POLYMERISATION;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstancePolymer_RepeatUnit#repeatUnit() repeatUnit} to repeatUnit.
     * @param repeatUnit The value for repeatUnit
     * @return {@code this} builder for chained invocation
     */
    public final Builder repeatUnit(String repeatUnit) {
      checkNotIsSet(repeatUnitIsSet(), "repeatUnit");
      this.repeatUnit = Objects.requireNonNull(repeatUnit, "repeatUnit");
      optBits |= OPT_BIT_REPEAT_UNIT;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstancePolymer_RepeatUnit#repeatUnit() repeatUnit} to repeatUnit.
     * @param repeatUnit The value for repeatUnit
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("repeatUnit")
    public final Builder repeatUnit(Optional<String> repeatUnit) {
      checkNotIsSet(repeatUnitIsSet(), "repeatUnit");
      this.repeatUnit = repeatUnit.orElse(null);
      optBits |= OPT_BIT_REPEAT_UNIT;
      return this;
    }

    /**
     * Builds a new {@link SubstancePolymer_RepeatUnit SubstancePolymer_RepeatUnit}.
     * @return An immutable instance of SubstancePolymer_RepeatUnit
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public SubstancePolymer_RepeatUnit build() {
      return new ImmutableSubstancePolymer_RepeatUnit(
          extension,
          structuralRepresentation,
          id,
          modifierExtension,
          amount,
          orientationOfPolymerisation,
          degreeOfPolymerisation,
          repeatUnit);
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean structuralRepresentationIsSet() {
      return (optBits & OPT_BIT_STRUCTURAL_REPRESENTATION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean amountIsSet() {
      return (optBits & OPT_BIT_AMOUNT) != 0;
    }

    private boolean orientationOfPolymerisationIsSet() {
      return (optBits & OPT_BIT_ORIENTATION_OF_POLYMERISATION) != 0;
    }

    private boolean degreeOfPolymerisationIsSet() {
      return (optBits & OPT_BIT_DEGREE_OF_POLYMERISATION) != 0;
    }

    private boolean repeatUnitIsSet() {
      return (optBits & OPT_BIT_REPEAT_UNIT) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of SubstancePolymer_RepeatUnit is strict, attribute is already set: ".concat(name));
    }
  }
}
