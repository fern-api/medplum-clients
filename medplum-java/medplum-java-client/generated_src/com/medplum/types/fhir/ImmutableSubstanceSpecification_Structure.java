package com.medplum.types.fhir;

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
 * Immutable implementation of {@link SubstanceSpecification_Structure}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableSubstanceSpecification_Structure.builder()}.
 */
@Generated(from = "SubstanceSpecification_Structure", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableSubstanceSpecification_Structure
    implements SubstanceSpecification_Structure {
  private final @Nullable CodeableConcept stereochemistry;
  private final @Nullable SubstanceSpecification_MolecularWeight molecularWeight;
  private final @Nullable String id;
  private final @Nullable List<Reference> source;
  private final @Nullable String molecularFormulaByMoiety;
  private final @Nullable CodeableConcept opticalActivity;
  private final @Nullable String molecularFormula;
  private final @Nullable List<SubstanceSpecification_Isotope> isotope;
  private final @Nullable List<Extension> extension;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable List<SubstanceSpecification_Representation> representation;

  private ImmutableSubstanceSpecification_Structure(
      @Nullable CodeableConcept stereochemistry,
      @Nullable SubstanceSpecification_MolecularWeight molecularWeight,
      @Nullable String id,
      @Nullable List<Reference> source,
      @Nullable String molecularFormulaByMoiety,
      @Nullable CodeableConcept opticalActivity,
      @Nullable String molecularFormula,
      @Nullable List<SubstanceSpecification_Isotope> isotope,
      @Nullable List<Extension> extension,
      @Nullable List<Extension> modifierExtension,
      @Nullable List<SubstanceSpecification_Representation> representation) {
    this.stereochemistry = stereochemistry;
    this.molecularWeight = molecularWeight;
    this.id = id;
    this.source = source;
    this.molecularFormulaByMoiety = molecularFormulaByMoiety;
    this.opticalActivity = opticalActivity;
    this.molecularFormula = molecularFormula;
    this.isotope = isotope;
    this.extension = extension;
    this.modifierExtension = modifierExtension;
    this.representation = representation;
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
   * @return The value of the {@code molecularWeight} attribute
   */
  @JsonProperty("molecularWeight")
  @Override
  public Optional<SubstanceSpecification_MolecularWeight> molecularWeight() {
    return Optional.ofNullable(molecularWeight);
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
   * @return The value of the {@code source} attribute
   */
  @JsonProperty("source")
  @Override
  public Optional<List<Reference>> source() {
    return Optional.ofNullable(source);
  }

  /**
   * @return The value of the {@code molecularFormulaByMoiety} attribute
   */
  @JsonProperty("molecularFormulaByMoiety")
  @Override
  public Optional<String> molecularFormulaByMoiety() {
    return Optional.ofNullable(molecularFormulaByMoiety);
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
   * @return The value of the {@code molecularFormula} attribute
   */
  @JsonProperty("molecularFormula")
  @Override
  public Optional<String> molecularFormula() {
    return Optional.ofNullable(molecularFormula);
  }

  /**
   * @return The value of the {@code isotope} attribute
   */
  @JsonProperty("isotope")
  @Override
  public Optional<List<SubstanceSpecification_Isotope>> isotope() {
    return Optional.ofNullable(isotope);
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @JsonProperty("modifierExtension")
  @Override
  public Optional<List<Extension>> modifierExtension() {
    return Optional.ofNullable(modifierExtension);
  }

  /**
   * @return The value of the {@code representation} attribute
   */
  @JsonProperty("representation")
  @Override
  public Optional<List<SubstanceSpecification_Representation>> representation() {
    return Optional.ofNullable(representation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSpecification_Structure#stereochemistry() stereochemistry} attribute.
   * @param value The value for stereochemistry
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification_Structure withStereochemistry(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "stereochemistry");
    if (this.stereochemistry == newValue) return this;
    return new ImmutableSubstanceSpecification_Structure(
        newValue,
        this.molecularWeight,
        this.id,
        this.source,
        this.molecularFormulaByMoiety,
        this.opticalActivity,
        this.molecularFormula,
        this.isotope,
        this.extension,
        this.modifierExtension,
        this.representation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSpecification_Structure#stereochemistry() stereochemistry} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for stereochemistry
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSpecification_Structure withStereochemistry(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.stereochemistry == value) return this;
    return new ImmutableSubstanceSpecification_Structure(
        value,
        this.molecularWeight,
        this.id,
        this.source,
        this.molecularFormulaByMoiety,
        this.opticalActivity,
        this.molecularFormula,
        this.isotope,
        this.extension,
        this.modifierExtension,
        this.representation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSpecification_Structure#molecularWeight() molecularWeight} attribute.
   * @param value The value for molecularWeight
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification_Structure withMolecularWeight(SubstanceSpecification_MolecularWeight value) {
    @Nullable SubstanceSpecification_MolecularWeight newValue = Objects.requireNonNull(value, "molecularWeight");
    if (this.molecularWeight == newValue) return this;
    return new ImmutableSubstanceSpecification_Structure(
        this.stereochemistry,
        newValue,
        this.id,
        this.source,
        this.molecularFormulaByMoiety,
        this.opticalActivity,
        this.molecularFormula,
        this.isotope,
        this.extension,
        this.modifierExtension,
        this.representation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSpecification_Structure#molecularWeight() molecularWeight} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for molecularWeight
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSpecification_Structure withMolecularWeight(Optional<? extends SubstanceSpecification_MolecularWeight> optional) {
    @Nullable SubstanceSpecification_MolecularWeight value = optional.orElse(null);
    if (this.molecularWeight == value) return this;
    return new ImmutableSubstanceSpecification_Structure(
        this.stereochemistry,
        value,
        this.id,
        this.source,
        this.molecularFormulaByMoiety,
        this.opticalActivity,
        this.molecularFormula,
        this.isotope,
        this.extension,
        this.modifierExtension,
        this.representation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSpecification_Structure#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification_Structure withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableSubstanceSpecification_Structure(
        this.stereochemistry,
        this.molecularWeight,
        newValue,
        this.source,
        this.molecularFormulaByMoiety,
        this.opticalActivity,
        this.molecularFormula,
        this.isotope,
        this.extension,
        this.modifierExtension,
        this.representation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSpecification_Structure#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification_Structure withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableSubstanceSpecification_Structure(
        this.stereochemistry,
        this.molecularWeight,
        value,
        this.source,
        this.molecularFormulaByMoiety,
        this.opticalActivity,
        this.molecularFormula,
        this.isotope,
        this.extension,
        this.modifierExtension,
        this.representation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSpecification_Structure#source() source} attribute.
   * @param value The value for source
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification_Structure withSource(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "source");
    if (this.source == newValue) return this;
    return new ImmutableSubstanceSpecification_Structure(
        this.stereochemistry,
        this.molecularWeight,
        this.id,
        newValue,
        this.molecularFormulaByMoiety,
        this.opticalActivity,
        this.molecularFormula,
        this.isotope,
        this.extension,
        this.modifierExtension,
        this.representation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSpecification_Structure#source() source} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for source
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSpecification_Structure withSource(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.source == value) return this;
    return new ImmutableSubstanceSpecification_Structure(
        this.stereochemistry,
        this.molecularWeight,
        this.id,
        value,
        this.molecularFormulaByMoiety,
        this.opticalActivity,
        this.molecularFormula,
        this.isotope,
        this.extension,
        this.modifierExtension,
        this.representation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSpecification_Structure#molecularFormulaByMoiety() molecularFormulaByMoiety} attribute.
   * @param value The value for molecularFormulaByMoiety
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification_Structure withMolecularFormulaByMoiety(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "molecularFormulaByMoiety");
    if (Objects.equals(this.molecularFormulaByMoiety, newValue)) return this;
    return new ImmutableSubstanceSpecification_Structure(
        this.stereochemistry,
        this.molecularWeight,
        this.id,
        this.source,
        newValue,
        this.opticalActivity,
        this.molecularFormula,
        this.isotope,
        this.extension,
        this.modifierExtension,
        this.representation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSpecification_Structure#molecularFormulaByMoiety() molecularFormulaByMoiety} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for molecularFormulaByMoiety
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification_Structure withMolecularFormulaByMoiety(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.molecularFormulaByMoiety, value)) return this;
    return new ImmutableSubstanceSpecification_Structure(
        this.stereochemistry,
        this.molecularWeight,
        this.id,
        this.source,
        value,
        this.opticalActivity,
        this.molecularFormula,
        this.isotope,
        this.extension,
        this.modifierExtension,
        this.representation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSpecification_Structure#opticalActivity() opticalActivity} attribute.
   * @param value The value for opticalActivity
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification_Structure withOpticalActivity(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "opticalActivity");
    if (this.opticalActivity == newValue) return this;
    return new ImmutableSubstanceSpecification_Structure(
        this.stereochemistry,
        this.molecularWeight,
        this.id,
        this.source,
        this.molecularFormulaByMoiety,
        newValue,
        this.molecularFormula,
        this.isotope,
        this.extension,
        this.modifierExtension,
        this.representation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSpecification_Structure#opticalActivity() opticalActivity} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for opticalActivity
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSpecification_Structure withOpticalActivity(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.opticalActivity == value) return this;
    return new ImmutableSubstanceSpecification_Structure(
        this.stereochemistry,
        this.molecularWeight,
        this.id,
        this.source,
        this.molecularFormulaByMoiety,
        value,
        this.molecularFormula,
        this.isotope,
        this.extension,
        this.modifierExtension,
        this.representation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSpecification_Structure#molecularFormula() molecularFormula} attribute.
   * @param value The value for molecularFormula
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification_Structure withMolecularFormula(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "molecularFormula");
    if (Objects.equals(this.molecularFormula, newValue)) return this;
    return new ImmutableSubstanceSpecification_Structure(
        this.stereochemistry,
        this.molecularWeight,
        this.id,
        this.source,
        this.molecularFormulaByMoiety,
        this.opticalActivity,
        newValue,
        this.isotope,
        this.extension,
        this.modifierExtension,
        this.representation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSpecification_Structure#molecularFormula() molecularFormula} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for molecularFormula
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification_Structure withMolecularFormula(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.molecularFormula, value)) return this;
    return new ImmutableSubstanceSpecification_Structure(
        this.stereochemistry,
        this.molecularWeight,
        this.id,
        this.source,
        this.molecularFormulaByMoiety,
        this.opticalActivity,
        value,
        this.isotope,
        this.extension,
        this.modifierExtension,
        this.representation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSpecification_Structure#isotope() isotope} attribute.
   * @param value The value for isotope
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification_Structure withIsotope(List<SubstanceSpecification_Isotope> value) {
    @Nullable List<SubstanceSpecification_Isotope> newValue = Objects.requireNonNull(value, "isotope");
    if (this.isotope == newValue) return this;
    return new ImmutableSubstanceSpecification_Structure(
        this.stereochemistry,
        this.molecularWeight,
        this.id,
        this.source,
        this.molecularFormulaByMoiety,
        this.opticalActivity,
        this.molecularFormula,
        newValue,
        this.extension,
        this.modifierExtension,
        this.representation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSpecification_Structure#isotope() isotope} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for isotope
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSpecification_Structure withIsotope(Optional<? extends List<SubstanceSpecification_Isotope>> optional) {
    @Nullable List<SubstanceSpecification_Isotope> value = optional.orElse(null);
    if (this.isotope == value) return this;
    return new ImmutableSubstanceSpecification_Structure(
        this.stereochemistry,
        this.molecularWeight,
        this.id,
        this.source,
        this.molecularFormulaByMoiety,
        this.opticalActivity,
        this.molecularFormula,
        value,
        this.extension,
        this.modifierExtension,
        this.representation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSpecification_Structure#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification_Structure withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableSubstanceSpecification_Structure(
        this.stereochemistry,
        this.molecularWeight,
        this.id,
        this.source,
        this.molecularFormulaByMoiety,
        this.opticalActivity,
        this.molecularFormula,
        this.isotope,
        newValue,
        this.modifierExtension,
        this.representation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSpecification_Structure#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSpecification_Structure withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableSubstanceSpecification_Structure(
        this.stereochemistry,
        this.molecularWeight,
        this.id,
        this.source,
        this.molecularFormulaByMoiety,
        this.opticalActivity,
        this.molecularFormula,
        this.isotope,
        value,
        this.modifierExtension,
        this.representation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSpecification_Structure#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification_Structure withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableSubstanceSpecification_Structure(
        this.stereochemistry,
        this.molecularWeight,
        this.id,
        this.source,
        this.molecularFormulaByMoiety,
        this.opticalActivity,
        this.molecularFormula,
        this.isotope,
        this.extension,
        newValue,
        this.representation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSpecification_Structure#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSpecification_Structure withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableSubstanceSpecification_Structure(
        this.stereochemistry,
        this.molecularWeight,
        this.id,
        this.source,
        this.molecularFormulaByMoiety,
        this.opticalActivity,
        this.molecularFormula,
        this.isotope,
        this.extension,
        value,
        this.representation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSpecification_Structure#representation() representation} attribute.
   * @param value The value for representation
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification_Structure withRepresentation(List<SubstanceSpecification_Representation> value) {
    @Nullable List<SubstanceSpecification_Representation> newValue = Objects.requireNonNull(value, "representation");
    if (this.representation == newValue) return this;
    return new ImmutableSubstanceSpecification_Structure(
        this.stereochemistry,
        this.molecularWeight,
        this.id,
        this.source,
        this.molecularFormulaByMoiety,
        this.opticalActivity,
        this.molecularFormula,
        this.isotope,
        this.extension,
        this.modifierExtension,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSpecification_Structure#representation() representation} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for representation
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSpecification_Structure withRepresentation(Optional<? extends List<SubstanceSpecification_Representation>> optional) {
    @Nullable List<SubstanceSpecification_Representation> value = optional.orElse(null);
    if (this.representation == value) return this;
    return new ImmutableSubstanceSpecification_Structure(
        this.stereochemistry,
        this.molecularWeight,
        this.id,
        this.source,
        this.molecularFormulaByMoiety,
        this.opticalActivity,
        this.molecularFormula,
        this.isotope,
        this.extension,
        this.modifierExtension,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableSubstanceSpecification_Structure} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableSubstanceSpecification_Structure
        && equalTo((ImmutableSubstanceSpecification_Structure) another);
  }

  private boolean equalTo(ImmutableSubstanceSpecification_Structure another) {
    return Objects.equals(stereochemistry, another.stereochemistry)
        && Objects.equals(molecularWeight, another.molecularWeight)
        && Objects.equals(id, another.id)
        && Objects.equals(source, another.source)
        && Objects.equals(molecularFormulaByMoiety, another.molecularFormulaByMoiety)
        && Objects.equals(opticalActivity, another.opticalActivity)
        && Objects.equals(molecularFormula, another.molecularFormula)
        && Objects.equals(isotope, another.isotope)
        && Objects.equals(extension, another.extension)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(representation, another.representation);
  }

  /**
   * Computes a hash code from attributes: {@code stereochemistry}, {@code molecularWeight}, {@code id}, {@code source}, {@code molecularFormulaByMoiety}, {@code opticalActivity}, {@code molecularFormula}, {@code isotope}, {@code extension}, {@code modifierExtension}, {@code representation}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(stereochemistry);
    h += (h << 5) + Objects.hashCode(molecularWeight);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(source);
    h += (h << 5) + Objects.hashCode(molecularFormulaByMoiety);
    h += (h << 5) + Objects.hashCode(opticalActivity);
    h += (h << 5) + Objects.hashCode(molecularFormula);
    h += (h << 5) + Objects.hashCode(isotope);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(representation);
    return h;
  }

  /**
   * Prints the immutable value {@code SubstanceSpecification_Structure} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("SubstanceSpecification_Structure{");
    if (stereochemistry != null) {
      builder.append("stereochemistry=").append(stereochemistry);
    }
    if (molecularWeight != null) {
      if (builder.length() > 33) builder.append(", ");
      builder.append("molecularWeight=").append(molecularWeight);
    }
    if (id != null) {
      if (builder.length() > 33) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (source != null) {
      if (builder.length() > 33) builder.append(", ");
      builder.append("source=").append(source);
    }
    if (molecularFormulaByMoiety != null) {
      if (builder.length() > 33) builder.append(", ");
      builder.append("molecularFormulaByMoiety=").append(molecularFormulaByMoiety);
    }
    if (opticalActivity != null) {
      if (builder.length() > 33) builder.append(", ");
      builder.append("opticalActivity=").append(opticalActivity);
    }
    if (molecularFormula != null) {
      if (builder.length() > 33) builder.append(", ");
      builder.append("molecularFormula=").append(molecularFormula);
    }
    if (isotope != null) {
      if (builder.length() > 33) builder.append(", ");
      builder.append("isotope=").append(isotope);
    }
    if (extension != null) {
      if (builder.length() > 33) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (modifierExtension != null) {
      if (builder.length() > 33) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (representation != null) {
      if (builder.length() > 33) builder.append(", ");
      builder.append("representation=").append(representation);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "SubstanceSpecification_Structure", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements SubstanceSpecification_Structure {
    @Nullable Optional<CodeableConcept> stereochemistry = Optional.empty();
    boolean stereochemistryIsSet;
    @Nullable Optional<SubstanceSpecification_MolecularWeight> molecularWeight = Optional.empty();
    boolean molecularWeightIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Reference>> source = Optional.empty();
    boolean sourceIsSet;
    @Nullable Optional<String> molecularFormulaByMoiety = Optional.empty();
    boolean molecularFormulaByMoietyIsSet;
    @Nullable Optional<CodeableConcept> opticalActivity = Optional.empty();
    boolean opticalActivityIsSet;
    @Nullable Optional<String> molecularFormula = Optional.empty();
    boolean molecularFormulaIsSet;
    @Nullable Optional<List<SubstanceSpecification_Isotope>> isotope = Optional.empty();
    boolean isotopeIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<List<SubstanceSpecification_Representation>> representation = Optional.empty();
    boolean representationIsSet;
    @JsonProperty("stereochemistry")
    public void setStereochemistry(Optional<CodeableConcept> stereochemistry) {
      this.stereochemistry = stereochemistry;
      this.stereochemistryIsSet = true;
    }
    @JsonProperty("molecularWeight")
    public void setMolecularWeight(Optional<SubstanceSpecification_MolecularWeight> molecularWeight) {
      this.molecularWeight = molecularWeight;
      this.molecularWeightIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("source")
    public void setSource(Optional<List<Reference>> source) {
      this.source = source;
      this.sourceIsSet = true;
    }
    @JsonProperty("molecularFormulaByMoiety")
    public void setMolecularFormulaByMoiety(Optional<String> molecularFormulaByMoiety) {
      this.molecularFormulaByMoiety = molecularFormulaByMoiety;
      this.molecularFormulaByMoietyIsSet = true;
    }
    @JsonProperty("opticalActivity")
    public void setOpticalActivity(Optional<CodeableConcept> opticalActivity) {
      this.opticalActivity = opticalActivity;
      this.opticalActivityIsSet = true;
    }
    @JsonProperty("molecularFormula")
    public void setMolecularFormula(Optional<String> molecularFormula) {
      this.molecularFormula = molecularFormula;
      this.molecularFormulaIsSet = true;
    }
    @JsonProperty("isotope")
    public void setIsotope(Optional<List<SubstanceSpecification_Isotope>> isotope) {
      this.isotope = isotope;
      this.isotopeIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("representation")
    public void setRepresentation(Optional<List<SubstanceSpecification_Representation>> representation) {
      this.representation = representation;
      this.representationIsSet = true;
    }
    @Override
    public Optional<CodeableConcept> stereochemistry() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<SubstanceSpecification_MolecularWeight> molecularWeight() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> source() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> molecularFormulaByMoiety() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> opticalActivity() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> molecularFormula() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<SubstanceSpecification_Isotope>> isotope() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<SubstanceSpecification_Representation>> representation() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableSubstanceSpecification_Structure fromJson(Json json) {
    ImmutableSubstanceSpecification_Structure.Builder builder = ImmutableSubstanceSpecification_Structure.builder();
    if (json.stereochemistryIsSet) {
      builder.stereochemistry(json.stereochemistry);
    }
    if (json.molecularWeightIsSet) {
      builder.molecularWeight(json.molecularWeight);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.sourceIsSet) {
      builder.source(json.source);
    }
    if (json.molecularFormulaByMoietyIsSet) {
      builder.molecularFormulaByMoiety(json.molecularFormulaByMoiety);
    }
    if (json.opticalActivityIsSet) {
      builder.opticalActivity(json.opticalActivity);
    }
    if (json.molecularFormulaIsSet) {
      builder.molecularFormula(json.molecularFormula);
    }
    if (json.isotopeIsSet) {
      builder.isotope(json.isotope);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.representationIsSet) {
      builder.representation(json.representation);
    }
    return (ImmutableSubstanceSpecification_Structure) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link SubstanceSpecification_Structure} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable SubstanceSpecification_Structure instance
   */
  public static SubstanceSpecification_Structure copyOf(SubstanceSpecification_Structure instance) {
    if (instance instanceof ImmutableSubstanceSpecification_Structure) {
      return (ImmutableSubstanceSpecification_Structure) instance;
    }
    return ImmutableSubstanceSpecification_Structure.builder()
        .stereochemistry(instance.stereochemistry())
        .molecularWeight(instance.molecularWeight())
        .id(instance.id())
        .source(instance.source())
        .molecularFormulaByMoiety(instance.molecularFormulaByMoiety())
        .opticalActivity(instance.opticalActivity())
        .molecularFormula(instance.molecularFormula())
        .isotope(instance.isotope())
        .extension(instance.extension())
        .modifierExtension(instance.modifierExtension())
        .representation(instance.representation())
        .build();
  }

  /**
   * Creates a builder for {@link SubstanceSpecification_Structure SubstanceSpecification_Structure}.
   * <pre>
   * ImmutableSubstanceSpecification_Structure.builder()
   *    .stereochemistry(com.medplum.types.fhir.CodeableConcept) // optional {@link SubstanceSpecification_Structure#stereochemistry() stereochemistry}
   *    .molecularWeight(com.medplum.types.fhir.SubstanceSpecification_MolecularWeight) // optional {@link SubstanceSpecification_Structure#molecularWeight() molecularWeight}
   *    .id(String) // optional {@link SubstanceSpecification_Structure#id() id}
   *    .source(List&amp;lt;com.medplum.types.fhir.Reference&amp;gt;) // optional {@link SubstanceSpecification_Structure#source() source}
   *    .molecularFormulaByMoiety(String) // optional {@link SubstanceSpecification_Structure#molecularFormulaByMoiety() molecularFormulaByMoiety}
   *    .opticalActivity(com.medplum.types.fhir.CodeableConcept) // optional {@link SubstanceSpecification_Structure#opticalActivity() opticalActivity}
   *    .molecularFormula(String) // optional {@link SubstanceSpecification_Structure#molecularFormula() molecularFormula}
   *    .isotope(List&amp;lt;com.medplum.types.fhir.SubstanceSpecification_Isotope&amp;gt;) // optional {@link SubstanceSpecification_Structure#isotope() isotope}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link SubstanceSpecification_Structure#extension() extension}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link SubstanceSpecification_Structure#modifierExtension() modifierExtension}
   *    .representation(List&amp;lt;com.medplum.types.fhir.SubstanceSpecification_Representation&amp;gt;) // optional {@link SubstanceSpecification_Structure#representation() representation}
   *    .build();
   * </pre>
   * @return A new SubstanceSpecification_Structure builder
   */
  public static ImmutableSubstanceSpecification_Structure.Builder builder() {
    return new ImmutableSubstanceSpecification_Structure.Builder();
  }

  /**
   * Builds instances of type {@link SubstanceSpecification_Structure SubstanceSpecification_Structure}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "SubstanceSpecification_Structure", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_STEREOCHEMISTRY = 0x1L;
    private static final long OPT_BIT_MOLECULAR_WEIGHT = 0x2L;
    private static final long OPT_BIT_ID = 0x4L;
    private static final long OPT_BIT_SOURCE = 0x8L;
    private static final long OPT_BIT_MOLECULAR_FORMULA_BY_MOIETY = 0x10L;
    private static final long OPT_BIT_OPTICAL_ACTIVITY = 0x20L;
    private static final long OPT_BIT_MOLECULAR_FORMULA = 0x40L;
    private static final long OPT_BIT_ISOTOPE = 0x80L;
    private static final long OPT_BIT_EXTENSION = 0x100L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x200L;
    private static final long OPT_BIT_REPRESENTATION = 0x400L;
    private long optBits;

    private @Nullable CodeableConcept stereochemistry;
    private @Nullable SubstanceSpecification_MolecularWeight molecularWeight;
    private @Nullable String id;
    private @Nullable List<Reference> source;
    private @Nullable String molecularFormulaByMoiety;
    private @Nullable CodeableConcept opticalActivity;
    private @Nullable String molecularFormula;
    private @Nullable List<SubstanceSpecification_Isotope> isotope;
    private @Nullable List<Extension> extension;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable List<SubstanceSpecification_Representation> representation;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification_Structure#stereochemistry() stereochemistry} to stereochemistry.
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
     * Initializes the optional value {@link SubstanceSpecification_Structure#stereochemistry() stereochemistry} to stereochemistry.
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
     * Initializes the optional value {@link SubstanceSpecification_Structure#molecularWeight() molecularWeight} to molecularWeight.
     * @param molecularWeight The value for molecularWeight
     * @return {@code this} builder for chained invocation
     */
    public final Builder molecularWeight(SubstanceSpecification_MolecularWeight molecularWeight) {
      checkNotIsSet(molecularWeightIsSet(), "molecularWeight");
      this.molecularWeight = Objects.requireNonNull(molecularWeight, "molecularWeight");
      optBits |= OPT_BIT_MOLECULAR_WEIGHT;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification_Structure#molecularWeight() molecularWeight} to molecularWeight.
     * @param molecularWeight The value for molecularWeight
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("molecularWeight")
    public final Builder molecularWeight(Optional<? extends SubstanceSpecification_MolecularWeight> molecularWeight) {
      checkNotIsSet(molecularWeightIsSet(), "molecularWeight");
      this.molecularWeight = molecularWeight.orElse(null);
      optBits |= OPT_BIT_MOLECULAR_WEIGHT;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification_Structure#id() id} to id.
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
     * Initializes the optional value {@link SubstanceSpecification_Structure#id() id} to id.
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
     * Initializes the optional value {@link SubstanceSpecification_Structure#source() source} to source.
     * @param source The value for source
     * @return {@code this} builder for chained invocation
     */
    public final Builder source(List<Reference> source) {
      checkNotIsSet(sourceIsSet(), "source");
      this.source = Objects.requireNonNull(source, "source");
      optBits |= OPT_BIT_SOURCE;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification_Structure#source() source} to source.
     * @param source The value for source
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("source")
    public final Builder source(Optional<? extends List<Reference>> source) {
      checkNotIsSet(sourceIsSet(), "source");
      this.source = source.orElse(null);
      optBits |= OPT_BIT_SOURCE;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification_Structure#molecularFormulaByMoiety() molecularFormulaByMoiety} to molecularFormulaByMoiety.
     * @param molecularFormulaByMoiety The value for molecularFormulaByMoiety
     * @return {@code this} builder for chained invocation
     */
    public final Builder molecularFormulaByMoiety(String molecularFormulaByMoiety) {
      checkNotIsSet(molecularFormulaByMoietyIsSet(), "molecularFormulaByMoiety");
      this.molecularFormulaByMoiety = Objects.requireNonNull(molecularFormulaByMoiety, "molecularFormulaByMoiety");
      optBits |= OPT_BIT_MOLECULAR_FORMULA_BY_MOIETY;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification_Structure#molecularFormulaByMoiety() molecularFormulaByMoiety} to molecularFormulaByMoiety.
     * @param molecularFormulaByMoiety The value for molecularFormulaByMoiety
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("molecularFormulaByMoiety")
    public final Builder molecularFormulaByMoiety(Optional<String> molecularFormulaByMoiety) {
      checkNotIsSet(molecularFormulaByMoietyIsSet(), "molecularFormulaByMoiety");
      this.molecularFormulaByMoiety = molecularFormulaByMoiety.orElse(null);
      optBits |= OPT_BIT_MOLECULAR_FORMULA_BY_MOIETY;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification_Structure#opticalActivity() opticalActivity} to opticalActivity.
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
     * Initializes the optional value {@link SubstanceSpecification_Structure#opticalActivity() opticalActivity} to opticalActivity.
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
     * Initializes the optional value {@link SubstanceSpecification_Structure#molecularFormula() molecularFormula} to molecularFormula.
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
     * Initializes the optional value {@link SubstanceSpecification_Structure#molecularFormula() molecularFormula} to molecularFormula.
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
     * Initializes the optional value {@link SubstanceSpecification_Structure#isotope() isotope} to isotope.
     * @param isotope The value for isotope
     * @return {@code this} builder for chained invocation
     */
    public final Builder isotope(List<SubstanceSpecification_Isotope> isotope) {
      checkNotIsSet(isotopeIsSet(), "isotope");
      this.isotope = Objects.requireNonNull(isotope, "isotope");
      optBits |= OPT_BIT_ISOTOPE;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification_Structure#isotope() isotope} to isotope.
     * @param isotope The value for isotope
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("isotope")
    public final Builder isotope(Optional<? extends List<SubstanceSpecification_Isotope>> isotope) {
      checkNotIsSet(isotopeIsSet(), "isotope");
      this.isotope = isotope.orElse(null);
      optBits |= OPT_BIT_ISOTOPE;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification_Structure#extension() extension} to extension.
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
     * Initializes the optional value {@link SubstanceSpecification_Structure#extension() extension} to extension.
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
     * Initializes the optional value {@link SubstanceSpecification_Structure#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link SubstanceSpecification_Structure#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link SubstanceSpecification_Structure#representation() representation} to representation.
     * @param representation The value for representation
     * @return {@code this} builder for chained invocation
     */
    public final Builder representation(List<SubstanceSpecification_Representation> representation) {
      checkNotIsSet(representationIsSet(), "representation");
      this.representation = Objects.requireNonNull(representation, "representation");
      optBits |= OPT_BIT_REPRESENTATION;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification_Structure#representation() representation} to representation.
     * @param representation The value for representation
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("representation")
    public final Builder representation(Optional<? extends List<SubstanceSpecification_Representation>> representation) {
      checkNotIsSet(representationIsSet(), "representation");
      this.representation = representation.orElse(null);
      optBits |= OPT_BIT_REPRESENTATION;
      return this;
    }

    /**
     * Builds a new {@link SubstanceSpecification_Structure SubstanceSpecification_Structure}.
     * @return An immutable instance of SubstanceSpecification_Structure
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public SubstanceSpecification_Structure build() {
      return new ImmutableSubstanceSpecification_Structure(
          stereochemistry,
          molecularWeight,
          id,
          source,
          molecularFormulaByMoiety,
          opticalActivity,
          molecularFormula,
          isotope,
          extension,
          modifierExtension,
          representation);
    }

    private boolean stereochemistryIsSet() {
      return (optBits & OPT_BIT_STEREOCHEMISTRY) != 0;
    }

    private boolean molecularWeightIsSet() {
      return (optBits & OPT_BIT_MOLECULAR_WEIGHT) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean sourceIsSet() {
      return (optBits & OPT_BIT_SOURCE) != 0;
    }

    private boolean molecularFormulaByMoietyIsSet() {
      return (optBits & OPT_BIT_MOLECULAR_FORMULA_BY_MOIETY) != 0;
    }

    private boolean opticalActivityIsSet() {
      return (optBits & OPT_BIT_OPTICAL_ACTIVITY) != 0;
    }

    private boolean molecularFormulaIsSet() {
      return (optBits & OPT_BIT_MOLECULAR_FORMULA) != 0;
    }

    private boolean isotopeIsSet() {
      return (optBits & OPT_BIT_ISOTOPE) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean representationIsSet() {
      return (optBits & OPT_BIT_REPRESENTATION) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of SubstanceSpecification_Structure is strict, attribute is already set: ".concat(name));
    }
  }
}
