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
 * Immutable implementation of {@link SubstanceSpecification_Moiety}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableSubstanceSpecification_Moiety.builder()}.
 */
@Generated(from = "SubstanceSpecification_Moiety", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableSubstanceSpecification_Moiety
    implements SubstanceSpecification_Moiety {
  private final @Nullable Identifier identifier;
  private final @Nullable String id;
  private final @Nullable String name;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable CodeableConcept stereochemistry;
  private final @Nullable List<Extension> extension;
  private final @Nullable String molecularFormula;
  private final @Nullable CodeableConcept opticalActivity;
  private final @Nullable String amountString;
  private final @Nullable Quantity amountQuantity;
  private final @Nullable CodeableConcept role;

  private ImmutableSubstanceSpecification_Moiety(
      @Nullable Identifier identifier,
      @Nullable String id,
      @Nullable String name,
      @Nullable List<Extension> modifierExtension,
      @Nullable CodeableConcept stereochemistry,
      @Nullable List<Extension> extension,
      @Nullable String molecularFormula,
      @Nullable CodeableConcept opticalActivity,
      @Nullable String amountString,
      @Nullable Quantity amountQuantity,
      @Nullable CodeableConcept role) {
    this.identifier = identifier;
    this.id = id;
    this.name = name;
    this.modifierExtension = modifierExtension;
    this.stereochemistry = stereochemistry;
    this.extension = extension;
    this.molecularFormula = molecularFormula;
    this.opticalActivity = opticalActivity;
    this.amountString = amountString;
    this.amountQuantity = amountQuantity;
    this.role = role;
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
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public Optional<String> id() {
    return Optional.ofNullable(id);
  }

  /**
   * @return The value of the {@code name} attribute
   */
  @JsonProperty("name")
  @Override
  public Optional<String> name() {
    return Optional.ofNullable(name);
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
   * @return The value of the {@code stereochemistry} attribute
   */
  @JsonProperty("stereochemistry")
  @Override
  public Optional<CodeableConcept> stereochemistry() {
    return Optional.ofNullable(stereochemistry);
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
   * @return The value of the {@code molecularFormula} attribute
   */
  @JsonProperty("molecularFormula")
  @Override
  public Optional<String> molecularFormula() {
    return Optional.ofNullable(molecularFormula);
  }

  /**
   * @return The value of the {@code opticalActivity} attribute
   */
  @JsonProperty("opticalActivity")
  @Override
  public Optional<CodeableConcept> opticalActivity() {
    return Optional.ofNullable(opticalActivity);
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
   * @return The value of the {@code amountQuantity} attribute
   */
  @JsonProperty("amountQuantity")
  @Override
  public Optional<Quantity> amountQuantity() {
    return Optional.ofNullable(amountQuantity);
  }

  /**
   * @return The value of the {@code role} attribute
   */
  @JsonProperty("role")
  @Override
  public Optional<CodeableConcept> role() {
    return Optional.ofNullable(role);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSpecification_Moiety#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification_Moiety withIdentifier(Identifier value) {
    @Nullable Identifier newValue = Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableSubstanceSpecification_Moiety(
        newValue,
        this.id,
        this.name,
        this.modifierExtension,
        this.stereochemistry,
        this.extension,
        this.molecularFormula,
        this.opticalActivity,
        this.amountString,
        this.amountQuantity,
        this.role);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSpecification_Moiety#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSpecification_Moiety withIdentifier(Optional<? extends Identifier> optional) {
    @Nullable Identifier value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableSubstanceSpecification_Moiety(
        value,
        this.id,
        this.name,
        this.modifierExtension,
        this.stereochemistry,
        this.extension,
        this.molecularFormula,
        this.opticalActivity,
        this.amountString,
        this.amountQuantity,
        this.role);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSpecification_Moiety#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification_Moiety withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableSubstanceSpecification_Moiety(
        this.identifier,
        newValue,
        this.name,
        this.modifierExtension,
        this.stereochemistry,
        this.extension,
        this.molecularFormula,
        this.opticalActivity,
        this.amountString,
        this.amountQuantity,
        this.role);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSpecification_Moiety#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification_Moiety withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableSubstanceSpecification_Moiety(
        this.identifier,
        value,
        this.name,
        this.modifierExtension,
        this.stereochemistry,
        this.extension,
        this.molecularFormula,
        this.opticalActivity,
        this.amountString,
        this.amountQuantity,
        this.role);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSpecification_Moiety#name() name} attribute.
   * @param value The value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification_Moiety withName(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "name");
    if (Objects.equals(this.name, newValue)) return this;
    return new ImmutableSubstanceSpecification_Moiety(
        this.identifier,
        this.id,
        newValue,
        this.modifierExtension,
        this.stereochemistry,
        this.extension,
        this.molecularFormula,
        this.opticalActivity,
        this.amountString,
        this.amountQuantity,
        this.role);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSpecification_Moiety#name() name} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification_Moiety withName(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.name, value)) return this;
    return new ImmutableSubstanceSpecification_Moiety(
        this.identifier,
        this.id,
        value,
        this.modifierExtension,
        this.stereochemistry,
        this.extension,
        this.molecularFormula,
        this.opticalActivity,
        this.amountString,
        this.amountQuantity,
        this.role);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSpecification_Moiety#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification_Moiety withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableSubstanceSpecification_Moiety(
        this.identifier,
        this.id,
        this.name,
        newValue,
        this.stereochemistry,
        this.extension,
        this.molecularFormula,
        this.opticalActivity,
        this.amountString,
        this.amountQuantity,
        this.role);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSpecification_Moiety#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSpecification_Moiety withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableSubstanceSpecification_Moiety(
        this.identifier,
        this.id,
        this.name,
        value,
        this.stereochemistry,
        this.extension,
        this.molecularFormula,
        this.opticalActivity,
        this.amountString,
        this.amountQuantity,
        this.role);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSpecification_Moiety#stereochemistry() stereochemistry} attribute.
   * @param value The value for stereochemistry
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification_Moiety withStereochemistry(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "stereochemistry");
    if (this.stereochemistry == newValue) return this;
    return new ImmutableSubstanceSpecification_Moiety(
        this.identifier,
        this.id,
        this.name,
        this.modifierExtension,
        newValue,
        this.extension,
        this.molecularFormula,
        this.opticalActivity,
        this.amountString,
        this.amountQuantity,
        this.role);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSpecification_Moiety#stereochemistry() stereochemistry} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for stereochemistry
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSpecification_Moiety withStereochemistry(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.stereochemistry == value) return this;
    return new ImmutableSubstanceSpecification_Moiety(
        this.identifier,
        this.id,
        this.name,
        this.modifierExtension,
        value,
        this.extension,
        this.molecularFormula,
        this.opticalActivity,
        this.amountString,
        this.amountQuantity,
        this.role);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSpecification_Moiety#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification_Moiety withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableSubstanceSpecification_Moiety(
        this.identifier,
        this.id,
        this.name,
        this.modifierExtension,
        this.stereochemistry,
        newValue,
        this.molecularFormula,
        this.opticalActivity,
        this.amountString,
        this.amountQuantity,
        this.role);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSpecification_Moiety#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSpecification_Moiety withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableSubstanceSpecification_Moiety(
        this.identifier,
        this.id,
        this.name,
        this.modifierExtension,
        this.stereochemistry,
        value,
        this.molecularFormula,
        this.opticalActivity,
        this.amountString,
        this.amountQuantity,
        this.role);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSpecification_Moiety#molecularFormula() molecularFormula} attribute.
   * @param value The value for molecularFormula
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification_Moiety withMolecularFormula(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "molecularFormula");
    if (Objects.equals(this.molecularFormula, newValue)) return this;
    return new ImmutableSubstanceSpecification_Moiety(
        this.identifier,
        this.id,
        this.name,
        this.modifierExtension,
        this.stereochemistry,
        this.extension,
        newValue,
        this.opticalActivity,
        this.amountString,
        this.amountQuantity,
        this.role);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSpecification_Moiety#molecularFormula() molecularFormula} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for molecularFormula
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification_Moiety withMolecularFormula(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.molecularFormula, value)) return this;
    return new ImmutableSubstanceSpecification_Moiety(
        this.identifier,
        this.id,
        this.name,
        this.modifierExtension,
        this.stereochemistry,
        this.extension,
        value,
        this.opticalActivity,
        this.amountString,
        this.amountQuantity,
        this.role);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSpecification_Moiety#opticalActivity() opticalActivity} attribute.
   * @param value The value for opticalActivity
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification_Moiety withOpticalActivity(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "opticalActivity");
    if (this.opticalActivity == newValue) return this;
    return new ImmutableSubstanceSpecification_Moiety(
        this.identifier,
        this.id,
        this.name,
        this.modifierExtension,
        this.stereochemistry,
        this.extension,
        this.molecularFormula,
        newValue,
        this.amountString,
        this.amountQuantity,
        this.role);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSpecification_Moiety#opticalActivity() opticalActivity} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for opticalActivity
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSpecification_Moiety withOpticalActivity(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.opticalActivity == value) return this;
    return new ImmutableSubstanceSpecification_Moiety(
        this.identifier,
        this.id,
        this.name,
        this.modifierExtension,
        this.stereochemistry,
        this.extension,
        this.molecularFormula,
        value,
        this.amountString,
        this.amountQuantity,
        this.role);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSpecification_Moiety#amountString() amountString} attribute.
   * @param value The value for amountString
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification_Moiety withAmountString(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "amountString");
    if (Objects.equals(this.amountString, newValue)) return this;
    return new ImmutableSubstanceSpecification_Moiety(
        this.identifier,
        this.id,
        this.name,
        this.modifierExtension,
        this.stereochemistry,
        this.extension,
        this.molecularFormula,
        this.opticalActivity,
        newValue,
        this.amountQuantity,
        this.role);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSpecification_Moiety#amountString() amountString} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for amountString
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification_Moiety withAmountString(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.amountString, value)) return this;
    return new ImmutableSubstanceSpecification_Moiety(
        this.identifier,
        this.id,
        this.name,
        this.modifierExtension,
        this.stereochemistry,
        this.extension,
        this.molecularFormula,
        this.opticalActivity,
        value,
        this.amountQuantity,
        this.role);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSpecification_Moiety#amountQuantity() amountQuantity} attribute.
   * @param value The value for amountQuantity
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification_Moiety withAmountQuantity(Quantity value) {
    @Nullable Quantity newValue = Objects.requireNonNull(value, "amountQuantity");
    if (this.amountQuantity == newValue) return this;
    return new ImmutableSubstanceSpecification_Moiety(
        this.identifier,
        this.id,
        this.name,
        this.modifierExtension,
        this.stereochemistry,
        this.extension,
        this.molecularFormula,
        this.opticalActivity,
        this.amountString,
        newValue,
        this.role);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSpecification_Moiety#amountQuantity() amountQuantity} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for amountQuantity
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSpecification_Moiety withAmountQuantity(Optional<? extends Quantity> optional) {
    @Nullable Quantity value = optional.orElse(null);
    if (this.amountQuantity == value) return this;
    return new ImmutableSubstanceSpecification_Moiety(
        this.identifier,
        this.id,
        this.name,
        this.modifierExtension,
        this.stereochemistry,
        this.extension,
        this.molecularFormula,
        this.opticalActivity,
        this.amountString,
        value,
        this.role);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSpecification_Moiety#role() role} attribute.
   * @param value The value for role
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification_Moiety withRole(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "role");
    if (this.role == newValue) return this;
    return new ImmutableSubstanceSpecification_Moiety(
        this.identifier,
        this.id,
        this.name,
        this.modifierExtension,
        this.stereochemistry,
        this.extension,
        this.molecularFormula,
        this.opticalActivity,
        this.amountString,
        this.amountQuantity,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSpecification_Moiety#role() role} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for role
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSpecification_Moiety withRole(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.role == value) return this;
    return new ImmutableSubstanceSpecification_Moiety(
        this.identifier,
        this.id,
        this.name,
        this.modifierExtension,
        this.stereochemistry,
        this.extension,
        this.molecularFormula,
        this.opticalActivity,
        this.amountString,
        this.amountQuantity,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableSubstanceSpecification_Moiety} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableSubstanceSpecification_Moiety
        && equalTo((ImmutableSubstanceSpecification_Moiety) another);
  }

  private boolean equalTo(ImmutableSubstanceSpecification_Moiety another) {
    return Objects.equals(identifier, another.identifier)
        && Objects.equals(id, another.id)
        && Objects.equals(name, another.name)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(stereochemistry, another.stereochemistry)
        && Objects.equals(extension, another.extension)
        && Objects.equals(molecularFormula, another.molecularFormula)
        && Objects.equals(opticalActivity, another.opticalActivity)
        && Objects.equals(amountString, another.amountString)
        && Objects.equals(amountQuantity, another.amountQuantity)
        && Objects.equals(role, another.role);
  }

  /**
   * Computes a hash code from attributes: {@code identifier}, {@code id}, {@code name}, {@code modifierExtension}, {@code stereochemistry}, {@code extension}, {@code molecularFormula}, {@code opticalActivity}, {@code amountString}, {@code amountQuantity}, {@code role}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(identifier);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(name);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(stereochemistry);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(molecularFormula);
    h += (h << 5) + Objects.hashCode(opticalActivity);
    h += (h << 5) + Objects.hashCode(amountString);
    h += (h << 5) + Objects.hashCode(amountQuantity);
    h += (h << 5) + Objects.hashCode(role);
    return h;
  }

  /**
   * Prints the immutable value {@code SubstanceSpecification_Moiety} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("SubstanceSpecification_Moiety{");
    if (identifier != null) {
      builder.append("identifier=").append(identifier);
    }
    if (id != null) {
      if (builder.length() > 30) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (name != null) {
      if (builder.length() > 30) builder.append(", ");
      builder.append("name=").append(name);
    }
    if (modifierExtension != null) {
      if (builder.length() > 30) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (stereochemistry != null) {
      if (builder.length() > 30) builder.append(", ");
      builder.append("stereochemistry=").append(stereochemistry);
    }
    if (extension != null) {
      if (builder.length() > 30) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (molecularFormula != null) {
      if (builder.length() > 30) builder.append(", ");
      builder.append("molecularFormula=").append(molecularFormula);
    }
    if (opticalActivity != null) {
      if (builder.length() > 30) builder.append(", ");
      builder.append("opticalActivity=").append(opticalActivity);
    }
    if (amountString != null) {
      if (builder.length() > 30) builder.append(", ");
      builder.append("amountString=").append(amountString);
    }
    if (amountQuantity != null) {
      if (builder.length() > 30) builder.append(", ");
      builder.append("amountQuantity=").append(amountQuantity);
    }
    if (role != null) {
      if (builder.length() > 30) builder.append(", ");
      builder.append("role=").append(role);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "SubstanceSpecification_Moiety", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements SubstanceSpecification_Moiety {
    @Nullable Optional<Identifier> identifier = Optional.empty();
    boolean identifierIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<String> name = Optional.empty();
    boolean nameIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<CodeableConcept> stereochemistry = Optional.empty();
    boolean stereochemistryIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<String> molecularFormula = Optional.empty();
    boolean molecularFormulaIsSet;
    @Nullable Optional<CodeableConcept> opticalActivity = Optional.empty();
    boolean opticalActivityIsSet;
    @Nullable Optional<String> amountString = Optional.empty();
    boolean amountStringIsSet;
    @Nullable Optional<Quantity> amountQuantity = Optional.empty();
    boolean amountQuantityIsSet;
    @Nullable Optional<CodeableConcept> role = Optional.empty();
    boolean roleIsSet;
    @JsonProperty("identifier")
    public void setIdentifier(Optional<Identifier> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("name")
    public void setName(Optional<String> name) {
      this.name = name;
      this.nameIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("stereochemistry")
    public void setStereochemistry(Optional<CodeableConcept> stereochemistry) {
      this.stereochemistry = stereochemistry;
      this.stereochemistryIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("molecularFormula")
    public void setMolecularFormula(Optional<String> molecularFormula) {
      this.molecularFormula = molecularFormula;
      this.molecularFormulaIsSet = true;
    }
    @JsonProperty("opticalActivity")
    public void setOpticalActivity(Optional<CodeableConcept> opticalActivity) {
      this.opticalActivity = opticalActivity;
      this.opticalActivityIsSet = true;
    }
    @JsonProperty("amountString")
    public void setAmountString(Optional<String> amountString) {
      this.amountString = amountString;
      this.amountStringIsSet = true;
    }
    @JsonProperty("amountQuantity")
    public void setAmountQuantity(Optional<Quantity> amountQuantity) {
      this.amountQuantity = amountQuantity;
      this.amountQuantityIsSet = true;
    }
    @JsonProperty("role")
    public void setRole(Optional<CodeableConcept> role) {
      this.role = role;
      this.roleIsSet = true;
    }
    @Override
    public Optional<Identifier> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> name() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> stereochemistry() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> molecularFormula() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> opticalActivity() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> amountString() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Quantity> amountQuantity() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> role() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableSubstanceSpecification_Moiety fromJson(Json json) {
    ImmutableSubstanceSpecification_Moiety.Builder builder = ImmutableSubstanceSpecification_Moiety.builder();
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.nameIsSet) {
      builder.name(json.name);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.stereochemistryIsSet) {
      builder.stereochemistry(json.stereochemistry);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.molecularFormulaIsSet) {
      builder.molecularFormula(json.molecularFormula);
    }
    if (json.opticalActivityIsSet) {
      builder.opticalActivity(json.opticalActivity);
    }
    if (json.amountStringIsSet) {
      builder.amountString(json.amountString);
    }
    if (json.amountQuantityIsSet) {
      builder.amountQuantity(json.amountQuantity);
    }
    if (json.roleIsSet) {
      builder.role(json.role);
    }
    return (ImmutableSubstanceSpecification_Moiety) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link SubstanceSpecification_Moiety} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable SubstanceSpecification_Moiety instance
   */
  public static SubstanceSpecification_Moiety copyOf(SubstanceSpecification_Moiety instance) {
    if (instance instanceof ImmutableSubstanceSpecification_Moiety) {
      return (ImmutableSubstanceSpecification_Moiety) instance;
    }
    return ImmutableSubstanceSpecification_Moiety.builder()
        .identifier(instance.identifier())
        .id(instance.id())
        .name(instance.name())
        .modifierExtension(instance.modifierExtension())
        .stereochemistry(instance.stereochemistry())
        .extension(instance.extension())
        .molecularFormula(instance.molecularFormula())
        .opticalActivity(instance.opticalActivity())
        .amountString(instance.amountString())
        .amountQuantity(instance.amountQuantity())
        .role(instance.role())
        .build();
  }

  /**
   * Creates a builder for {@link SubstanceSpecification_Moiety SubstanceSpecification_Moiety}.
   * <pre>
   * ImmutableSubstanceSpecification_Moiety.builder()
   *    .identifier(com.fhir.types.fhir.Identifier) // optional {@link SubstanceSpecification_Moiety#identifier() identifier}
   *    .id(String) // optional {@link SubstanceSpecification_Moiety#id() id}
   *    .name(String) // optional {@link SubstanceSpecification_Moiety#name() name}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link SubstanceSpecification_Moiety#modifierExtension() modifierExtension}
   *    .stereochemistry(com.fhir.types.fhir.CodeableConcept) // optional {@link SubstanceSpecification_Moiety#stereochemistry() stereochemistry}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link SubstanceSpecification_Moiety#extension() extension}
   *    .molecularFormula(String) // optional {@link SubstanceSpecification_Moiety#molecularFormula() molecularFormula}
   *    .opticalActivity(com.fhir.types.fhir.CodeableConcept) // optional {@link SubstanceSpecification_Moiety#opticalActivity() opticalActivity}
   *    .amountString(String) // optional {@link SubstanceSpecification_Moiety#amountString() amountString}
   *    .amountQuantity(com.fhir.types.fhir.Quantity) // optional {@link SubstanceSpecification_Moiety#amountQuantity() amountQuantity}
   *    .role(com.fhir.types.fhir.CodeableConcept) // optional {@link SubstanceSpecification_Moiety#role() role}
   *    .build();
   * </pre>
   * @return A new SubstanceSpecification_Moiety builder
   */
  public static ImmutableSubstanceSpecification_Moiety.Builder builder() {
    return new ImmutableSubstanceSpecification_Moiety.Builder();
  }

  /**
   * Builds instances of type {@link SubstanceSpecification_Moiety SubstanceSpecification_Moiety}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "SubstanceSpecification_Moiety", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_IDENTIFIER = 0x1L;
    private static final long OPT_BIT_ID = 0x2L;
    private static final long OPT_BIT_NAME = 0x4L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x8L;
    private static final long OPT_BIT_STEREOCHEMISTRY = 0x10L;
    private static final long OPT_BIT_EXTENSION = 0x20L;
    private static final long OPT_BIT_MOLECULAR_FORMULA = 0x40L;
    private static final long OPT_BIT_OPTICAL_ACTIVITY = 0x80L;
    private static final long OPT_BIT_AMOUNT_STRING = 0x100L;
    private static final long OPT_BIT_AMOUNT_QUANTITY = 0x200L;
    private static final long OPT_BIT_ROLE = 0x400L;
    private long optBits;

    private @Nullable Identifier identifier;
    private @Nullable String id;
    private @Nullable String name;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable CodeableConcept stereochemistry;
    private @Nullable List<Extension> extension;
    private @Nullable String molecularFormula;
    private @Nullable CodeableConcept opticalActivity;
    private @Nullable String amountString;
    private @Nullable Quantity amountQuantity;
    private @Nullable CodeableConcept role;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification_Moiety#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link SubstanceSpecification_Moiety#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link SubstanceSpecification_Moiety#id() id} to id.
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
     * Initializes the optional value {@link SubstanceSpecification_Moiety#id() id} to id.
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
     * Initializes the optional value {@link SubstanceSpecification_Moiety#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for chained invocation
     */
    public final Builder name(String name) {
      checkNotIsSet(nameIsSet(), "name");
      this.name = Objects.requireNonNull(name, "name");
      optBits |= OPT_BIT_NAME;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification_Moiety#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("name")
    public final Builder name(Optional<String> name) {
      checkNotIsSet(nameIsSet(), "name");
      this.name = name.orElse(null);
      optBits |= OPT_BIT_NAME;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification_Moiety#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link SubstanceSpecification_Moiety#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link SubstanceSpecification_Moiety#stereochemistry() stereochemistry} to stereochemistry.
     * @param stereochemistry The value for stereochemistry
     * @return {@code this} builder for chained invocation
     */
    public final Builder stereochemistry(CodeableConcept stereochemistry) {
      checkNotIsSet(stereochemistryIsSet(), "stereochemistry");
      this.stereochemistry = Objects.requireNonNull(stereochemistry, "stereochemistry");
      optBits |= OPT_BIT_STEREOCHEMISTRY;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification_Moiety#stereochemistry() stereochemistry} to stereochemistry.
     * @param stereochemistry The value for stereochemistry
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("stereochemistry")
    public final Builder stereochemistry(Optional<? extends CodeableConcept> stereochemistry) {
      checkNotIsSet(stereochemistryIsSet(), "stereochemistry");
      this.stereochemistry = stereochemistry.orElse(null);
      optBits |= OPT_BIT_STEREOCHEMISTRY;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification_Moiety#extension() extension} to extension.
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
     * Initializes the optional value {@link SubstanceSpecification_Moiety#extension() extension} to extension.
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
     * Initializes the optional value {@link SubstanceSpecification_Moiety#molecularFormula() molecularFormula} to molecularFormula.
     * @param molecularFormula The value for molecularFormula
     * @return {@code this} builder for chained invocation
     */
    public final Builder molecularFormula(String molecularFormula) {
      checkNotIsSet(molecularFormulaIsSet(), "molecularFormula");
      this.molecularFormula = Objects.requireNonNull(molecularFormula, "molecularFormula");
      optBits |= OPT_BIT_MOLECULAR_FORMULA;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification_Moiety#molecularFormula() molecularFormula} to molecularFormula.
     * @param molecularFormula The value for molecularFormula
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("molecularFormula")
    public final Builder molecularFormula(Optional<String> molecularFormula) {
      checkNotIsSet(molecularFormulaIsSet(), "molecularFormula");
      this.molecularFormula = molecularFormula.orElse(null);
      optBits |= OPT_BIT_MOLECULAR_FORMULA;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification_Moiety#opticalActivity() opticalActivity} to opticalActivity.
     * @param opticalActivity The value for opticalActivity
     * @return {@code this} builder for chained invocation
     */
    public final Builder opticalActivity(CodeableConcept opticalActivity) {
      checkNotIsSet(opticalActivityIsSet(), "opticalActivity");
      this.opticalActivity = Objects.requireNonNull(opticalActivity, "opticalActivity");
      optBits |= OPT_BIT_OPTICAL_ACTIVITY;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification_Moiety#opticalActivity() opticalActivity} to opticalActivity.
     * @param opticalActivity The value for opticalActivity
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("opticalActivity")
    public final Builder opticalActivity(Optional<? extends CodeableConcept> opticalActivity) {
      checkNotIsSet(opticalActivityIsSet(), "opticalActivity");
      this.opticalActivity = opticalActivity.orElse(null);
      optBits |= OPT_BIT_OPTICAL_ACTIVITY;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification_Moiety#amountString() amountString} to amountString.
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
     * Initializes the optional value {@link SubstanceSpecification_Moiety#amountString() amountString} to amountString.
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
     * Initializes the optional value {@link SubstanceSpecification_Moiety#amountQuantity() amountQuantity} to amountQuantity.
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
     * Initializes the optional value {@link SubstanceSpecification_Moiety#amountQuantity() amountQuantity} to amountQuantity.
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
     * Initializes the optional value {@link SubstanceSpecification_Moiety#role() role} to role.
     * @param role The value for role
     * @return {@code this} builder for chained invocation
     */
    public final Builder role(CodeableConcept role) {
      checkNotIsSet(roleIsSet(), "role");
      this.role = Objects.requireNonNull(role, "role");
      optBits |= OPT_BIT_ROLE;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification_Moiety#role() role} to role.
     * @param role The value for role
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("role")
    public final Builder role(Optional<? extends CodeableConcept> role) {
      checkNotIsSet(roleIsSet(), "role");
      this.role = role.orElse(null);
      optBits |= OPT_BIT_ROLE;
      return this;
    }

    /**
     * Builds a new {@link SubstanceSpecification_Moiety SubstanceSpecification_Moiety}.
     * @return An immutable instance of SubstanceSpecification_Moiety
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public SubstanceSpecification_Moiety build() {
      return new ImmutableSubstanceSpecification_Moiety(
          identifier,
          id,
          name,
          modifierExtension,
          stereochemistry,
          extension,
          molecularFormula,
          opticalActivity,
          amountString,
          amountQuantity,
          role);
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean nameIsSet() {
      return (optBits & OPT_BIT_NAME) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean stereochemistryIsSet() {
      return (optBits & OPT_BIT_STEREOCHEMISTRY) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean molecularFormulaIsSet() {
      return (optBits & OPT_BIT_MOLECULAR_FORMULA) != 0;
    }

    private boolean opticalActivityIsSet() {
      return (optBits & OPT_BIT_OPTICAL_ACTIVITY) != 0;
    }

    private boolean amountStringIsSet() {
      return (optBits & OPT_BIT_AMOUNT_STRING) != 0;
    }

    private boolean amountQuantityIsSet() {
      return (optBits & OPT_BIT_AMOUNT_QUANTITY) != 0;
    }

    private boolean roleIsSet() {
      return (optBits & OPT_BIT_ROLE) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of SubstanceSpecification_Moiety is strict, attribute is already set: ".concat(name));
    }
  }
}
