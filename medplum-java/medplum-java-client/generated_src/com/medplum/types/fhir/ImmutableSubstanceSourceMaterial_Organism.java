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
 * Immutable implementation of {@link SubstanceSourceMaterial_Organism}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableSubstanceSourceMaterial_Organism.builder()}.
 */
@Generated(from = "SubstanceSourceMaterial_Organism", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableSubstanceSourceMaterial_Organism
    implements SubstanceSourceMaterial_Organism {
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable String id;
  private final @Nullable List<SubstanceSourceMaterial_Author> author;
  private final @Nullable List<Extension> extension;
  private final @Nullable SubstanceSourceMaterial_OrganismGeneral organismGeneral;
  private final @Nullable CodeableConcept genus;
  private final @Nullable CodeableConcept family;
  private final @Nullable SubstanceSourceMaterial_Hybrid hybrid;
  private final @Nullable CodeableConcept intraspecificType;
  private final @Nullable CodeableConcept species;
  private final @Nullable String intraspecificDescription;

  private ImmutableSubstanceSourceMaterial_Organism(
      @Nullable List<Extension> modifierExtension,
      @Nullable String id,
      @Nullable List<SubstanceSourceMaterial_Author> author,
      @Nullable List<Extension> extension,
      @Nullable SubstanceSourceMaterial_OrganismGeneral organismGeneral,
      @Nullable CodeableConcept genus,
      @Nullable CodeableConcept family,
      @Nullable SubstanceSourceMaterial_Hybrid hybrid,
      @Nullable CodeableConcept intraspecificType,
      @Nullable CodeableConcept species,
      @Nullable String intraspecificDescription) {
    this.modifierExtension = modifierExtension;
    this.id = id;
    this.author = author;
    this.extension = extension;
    this.organismGeneral = organismGeneral;
    this.genus = genus;
    this.family = family;
    this.hybrid = hybrid;
    this.intraspecificType = intraspecificType;
    this.species = species;
    this.intraspecificDescription = intraspecificDescription;
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
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public Optional<String> id() {
    return Optional.ofNullable(id);
  }

  /**
   * @return The value of the {@code author} attribute
   */
  @JsonProperty("author")
  @Override
  public Optional<List<SubstanceSourceMaterial_Author>> author() {
    return Optional.ofNullable(author);
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
   * @return The value of the {@code organismGeneral} attribute
   */
  @JsonProperty("organismGeneral")
  @Override
  public Optional<SubstanceSourceMaterial_OrganismGeneral> organismGeneral() {
    return Optional.ofNullable(organismGeneral);
  }

  /**
   * @return The value of the {@code genus} attribute
   */
  @JsonProperty("genus")
  @Override
  public Optional<CodeableConcept> genus() {
    return Optional.ofNullable(genus);
  }

  /**
   * @return The value of the {@code family} attribute
   */
  @JsonProperty("family")
  @Override
  public Optional<CodeableConcept> family() {
    return Optional.ofNullable(family);
  }

  /**
   * @return The value of the {@code hybrid} attribute
   */
  @JsonProperty("hybrid")
  @Override
  public Optional<SubstanceSourceMaterial_Hybrid> hybrid() {
    return Optional.ofNullable(hybrid);
  }

  /**
   * @return The value of the {@code intraspecificType} attribute
   */
  @JsonProperty("intraspecificType")
  @Override
  public Optional<CodeableConcept> intraspecificType() {
    return Optional.ofNullable(intraspecificType);
  }

  /**
   * @return The value of the {@code species} attribute
   */
  @JsonProperty("species")
  @Override
  public Optional<CodeableConcept> species() {
    return Optional.ofNullable(species);
  }

  /**
   * @return The value of the {@code intraspecificDescription} attribute
   */
  @JsonProperty("intraspecificDescription")
  @Override
  public Optional<String> intraspecificDescription() {
    return Optional.ofNullable(intraspecificDescription);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSourceMaterial_Organism#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSourceMaterial_Organism withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableSubstanceSourceMaterial_Organism(
        newValue,
        this.id,
        this.author,
        this.extension,
        this.organismGeneral,
        this.genus,
        this.family,
        this.hybrid,
        this.intraspecificType,
        this.species,
        this.intraspecificDescription);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSourceMaterial_Organism#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSourceMaterial_Organism withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableSubstanceSourceMaterial_Organism(
        value,
        this.id,
        this.author,
        this.extension,
        this.organismGeneral,
        this.genus,
        this.family,
        this.hybrid,
        this.intraspecificType,
        this.species,
        this.intraspecificDescription);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSourceMaterial_Organism#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSourceMaterial_Organism withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableSubstanceSourceMaterial_Organism(
        this.modifierExtension,
        newValue,
        this.author,
        this.extension,
        this.organismGeneral,
        this.genus,
        this.family,
        this.hybrid,
        this.intraspecificType,
        this.species,
        this.intraspecificDescription);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSourceMaterial_Organism#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSourceMaterial_Organism withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableSubstanceSourceMaterial_Organism(
        this.modifierExtension,
        value,
        this.author,
        this.extension,
        this.organismGeneral,
        this.genus,
        this.family,
        this.hybrid,
        this.intraspecificType,
        this.species,
        this.intraspecificDescription);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSourceMaterial_Organism#author() author} attribute.
   * @param value The value for author
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSourceMaterial_Organism withAuthor(List<SubstanceSourceMaterial_Author> value) {
    @Nullable List<SubstanceSourceMaterial_Author> newValue = Objects.requireNonNull(value, "author");
    if (this.author == newValue) return this;
    return new ImmutableSubstanceSourceMaterial_Organism(
        this.modifierExtension,
        this.id,
        newValue,
        this.extension,
        this.organismGeneral,
        this.genus,
        this.family,
        this.hybrid,
        this.intraspecificType,
        this.species,
        this.intraspecificDescription);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSourceMaterial_Organism#author() author} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for author
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSourceMaterial_Organism withAuthor(Optional<? extends List<SubstanceSourceMaterial_Author>> optional) {
    @Nullable List<SubstanceSourceMaterial_Author> value = optional.orElse(null);
    if (this.author == value) return this;
    return new ImmutableSubstanceSourceMaterial_Organism(
        this.modifierExtension,
        this.id,
        value,
        this.extension,
        this.organismGeneral,
        this.genus,
        this.family,
        this.hybrid,
        this.intraspecificType,
        this.species,
        this.intraspecificDescription);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSourceMaterial_Organism#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSourceMaterial_Organism withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableSubstanceSourceMaterial_Organism(
        this.modifierExtension,
        this.id,
        this.author,
        newValue,
        this.organismGeneral,
        this.genus,
        this.family,
        this.hybrid,
        this.intraspecificType,
        this.species,
        this.intraspecificDescription);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSourceMaterial_Organism#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSourceMaterial_Organism withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableSubstanceSourceMaterial_Organism(
        this.modifierExtension,
        this.id,
        this.author,
        value,
        this.organismGeneral,
        this.genus,
        this.family,
        this.hybrid,
        this.intraspecificType,
        this.species,
        this.intraspecificDescription);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSourceMaterial_Organism#organismGeneral() organismGeneral} attribute.
   * @param value The value for organismGeneral
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSourceMaterial_Organism withOrganismGeneral(SubstanceSourceMaterial_OrganismGeneral value) {
    @Nullable SubstanceSourceMaterial_OrganismGeneral newValue = Objects.requireNonNull(value, "organismGeneral");
    if (this.organismGeneral == newValue) return this;
    return new ImmutableSubstanceSourceMaterial_Organism(
        this.modifierExtension,
        this.id,
        this.author,
        this.extension,
        newValue,
        this.genus,
        this.family,
        this.hybrid,
        this.intraspecificType,
        this.species,
        this.intraspecificDescription);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSourceMaterial_Organism#organismGeneral() organismGeneral} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for organismGeneral
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSourceMaterial_Organism withOrganismGeneral(Optional<? extends SubstanceSourceMaterial_OrganismGeneral> optional) {
    @Nullable SubstanceSourceMaterial_OrganismGeneral value = optional.orElse(null);
    if (this.organismGeneral == value) return this;
    return new ImmutableSubstanceSourceMaterial_Organism(
        this.modifierExtension,
        this.id,
        this.author,
        this.extension,
        value,
        this.genus,
        this.family,
        this.hybrid,
        this.intraspecificType,
        this.species,
        this.intraspecificDescription);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSourceMaterial_Organism#genus() genus} attribute.
   * @param value The value for genus
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSourceMaterial_Organism withGenus(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "genus");
    if (this.genus == newValue) return this;
    return new ImmutableSubstanceSourceMaterial_Organism(
        this.modifierExtension,
        this.id,
        this.author,
        this.extension,
        this.organismGeneral,
        newValue,
        this.family,
        this.hybrid,
        this.intraspecificType,
        this.species,
        this.intraspecificDescription);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSourceMaterial_Organism#genus() genus} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for genus
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSourceMaterial_Organism withGenus(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.genus == value) return this;
    return new ImmutableSubstanceSourceMaterial_Organism(
        this.modifierExtension,
        this.id,
        this.author,
        this.extension,
        this.organismGeneral,
        value,
        this.family,
        this.hybrid,
        this.intraspecificType,
        this.species,
        this.intraspecificDescription);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSourceMaterial_Organism#family() family} attribute.
   * @param value The value for family
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSourceMaterial_Organism withFamily(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "family");
    if (this.family == newValue) return this;
    return new ImmutableSubstanceSourceMaterial_Organism(
        this.modifierExtension,
        this.id,
        this.author,
        this.extension,
        this.organismGeneral,
        this.genus,
        newValue,
        this.hybrid,
        this.intraspecificType,
        this.species,
        this.intraspecificDescription);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSourceMaterial_Organism#family() family} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for family
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSourceMaterial_Organism withFamily(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.family == value) return this;
    return new ImmutableSubstanceSourceMaterial_Organism(
        this.modifierExtension,
        this.id,
        this.author,
        this.extension,
        this.organismGeneral,
        this.genus,
        value,
        this.hybrid,
        this.intraspecificType,
        this.species,
        this.intraspecificDescription);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSourceMaterial_Organism#hybrid() hybrid} attribute.
   * @param value The value for hybrid
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSourceMaterial_Organism withHybrid(SubstanceSourceMaterial_Hybrid value) {
    @Nullable SubstanceSourceMaterial_Hybrid newValue = Objects.requireNonNull(value, "hybrid");
    if (this.hybrid == newValue) return this;
    return new ImmutableSubstanceSourceMaterial_Organism(
        this.modifierExtension,
        this.id,
        this.author,
        this.extension,
        this.organismGeneral,
        this.genus,
        this.family,
        newValue,
        this.intraspecificType,
        this.species,
        this.intraspecificDescription);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSourceMaterial_Organism#hybrid() hybrid} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for hybrid
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSourceMaterial_Organism withHybrid(Optional<? extends SubstanceSourceMaterial_Hybrid> optional) {
    @Nullable SubstanceSourceMaterial_Hybrid value = optional.orElse(null);
    if (this.hybrid == value) return this;
    return new ImmutableSubstanceSourceMaterial_Organism(
        this.modifierExtension,
        this.id,
        this.author,
        this.extension,
        this.organismGeneral,
        this.genus,
        this.family,
        value,
        this.intraspecificType,
        this.species,
        this.intraspecificDescription);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSourceMaterial_Organism#intraspecificType() intraspecificType} attribute.
   * @param value The value for intraspecificType
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSourceMaterial_Organism withIntraspecificType(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "intraspecificType");
    if (this.intraspecificType == newValue) return this;
    return new ImmutableSubstanceSourceMaterial_Organism(
        this.modifierExtension,
        this.id,
        this.author,
        this.extension,
        this.organismGeneral,
        this.genus,
        this.family,
        this.hybrid,
        newValue,
        this.species,
        this.intraspecificDescription);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSourceMaterial_Organism#intraspecificType() intraspecificType} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for intraspecificType
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSourceMaterial_Organism withIntraspecificType(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.intraspecificType == value) return this;
    return new ImmutableSubstanceSourceMaterial_Organism(
        this.modifierExtension,
        this.id,
        this.author,
        this.extension,
        this.organismGeneral,
        this.genus,
        this.family,
        this.hybrid,
        value,
        this.species,
        this.intraspecificDescription);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSourceMaterial_Organism#species() species} attribute.
   * @param value The value for species
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSourceMaterial_Organism withSpecies(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "species");
    if (this.species == newValue) return this;
    return new ImmutableSubstanceSourceMaterial_Organism(
        this.modifierExtension,
        this.id,
        this.author,
        this.extension,
        this.organismGeneral,
        this.genus,
        this.family,
        this.hybrid,
        this.intraspecificType,
        newValue,
        this.intraspecificDescription);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSourceMaterial_Organism#species() species} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for species
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSourceMaterial_Organism withSpecies(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.species == value) return this;
    return new ImmutableSubstanceSourceMaterial_Organism(
        this.modifierExtension,
        this.id,
        this.author,
        this.extension,
        this.organismGeneral,
        this.genus,
        this.family,
        this.hybrid,
        this.intraspecificType,
        value,
        this.intraspecificDescription);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSourceMaterial_Organism#intraspecificDescription() intraspecificDescription} attribute.
   * @param value The value for intraspecificDescription
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSourceMaterial_Organism withIntraspecificDescription(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "intraspecificDescription");
    if (Objects.equals(this.intraspecificDescription, newValue)) return this;
    return new ImmutableSubstanceSourceMaterial_Organism(
        this.modifierExtension,
        this.id,
        this.author,
        this.extension,
        this.organismGeneral,
        this.genus,
        this.family,
        this.hybrid,
        this.intraspecificType,
        this.species,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSourceMaterial_Organism#intraspecificDescription() intraspecificDescription} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for intraspecificDescription
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSourceMaterial_Organism withIntraspecificDescription(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.intraspecificDescription, value)) return this;
    return new ImmutableSubstanceSourceMaterial_Organism(
        this.modifierExtension,
        this.id,
        this.author,
        this.extension,
        this.organismGeneral,
        this.genus,
        this.family,
        this.hybrid,
        this.intraspecificType,
        this.species,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableSubstanceSourceMaterial_Organism} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableSubstanceSourceMaterial_Organism
        && equalTo((ImmutableSubstanceSourceMaterial_Organism) another);
  }

  private boolean equalTo(ImmutableSubstanceSourceMaterial_Organism another) {
    return Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(id, another.id)
        && Objects.equals(author, another.author)
        && Objects.equals(extension, another.extension)
        && Objects.equals(organismGeneral, another.organismGeneral)
        && Objects.equals(genus, another.genus)
        && Objects.equals(family, another.family)
        && Objects.equals(hybrid, another.hybrid)
        && Objects.equals(intraspecificType, another.intraspecificType)
        && Objects.equals(species, another.species)
        && Objects.equals(intraspecificDescription, another.intraspecificDescription);
  }

  /**
   * Computes a hash code from attributes: {@code modifierExtension}, {@code id}, {@code author}, {@code extension}, {@code organismGeneral}, {@code genus}, {@code family}, {@code hybrid}, {@code intraspecificType}, {@code species}, {@code intraspecificDescription}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(author);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(organismGeneral);
    h += (h << 5) + Objects.hashCode(genus);
    h += (h << 5) + Objects.hashCode(family);
    h += (h << 5) + Objects.hashCode(hybrid);
    h += (h << 5) + Objects.hashCode(intraspecificType);
    h += (h << 5) + Objects.hashCode(species);
    h += (h << 5) + Objects.hashCode(intraspecificDescription);
    return h;
  }

  /**
   * Prints the immutable value {@code SubstanceSourceMaterial_Organism} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("SubstanceSourceMaterial_Organism{");
    if (modifierExtension != null) {
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (id != null) {
      if (builder.length() > 33) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (author != null) {
      if (builder.length() > 33) builder.append(", ");
      builder.append("author=").append(author);
    }
    if (extension != null) {
      if (builder.length() > 33) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (organismGeneral != null) {
      if (builder.length() > 33) builder.append(", ");
      builder.append("organismGeneral=").append(organismGeneral);
    }
    if (genus != null) {
      if (builder.length() > 33) builder.append(", ");
      builder.append("genus=").append(genus);
    }
    if (family != null) {
      if (builder.length() > 33) builder.append(", ");
      builder.append("family=").append(family);
    }
    if (hybrid != null) {
      if (builder.length() > 33) builder.append(", ");
      builder.append("hybrid=").append(hybrid);
    }
    if (intraspecificType != null) {
      if (builder.length() > 33) builder.append(", ");
      builder.append("intraspecificType=").append(intraspecificType);
    }
    if (species != null) {
      if (builder.length() > 33) builder.append(", ");
      builder.append("species=").append(species);
    }
    if (intraspecificDescription != null) {
      if (builder.length() > 33) builder.append(", ");
      builder.append("intraspecificDescription=").append(intraspecificDescription);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "SubstanceSourceMaterial_Organism", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements SubstanceSourceMaterial_Organism {
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<SubstanceSourceMaterial_Author>> author = Optional.empty();
    boolean authorIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<SubstanceSourceMaterial_OrganismGeneral> organismGeneral = Optional.empty();
    boolean organismGeneralIsSet;
    @Nullable Optional<CodeableConcept> genus = Optional.empty();
    boolean genusIsSet;
    @Nullable Optional<CodeableConcept> family = Optional.empty();
    boolean familyIsSet;
    @Nullable Optional<SubstanceSourceMaterial_Hybrid> hybrid = Optional.empty();
    boolean hybridIsSet;
    @Nullable Optional<CodeableConcept> intraspecificType = Optional.empty();
    boolean intraspecificTypeIsSet;
    @Nullable Optional<CodeableConcept> species = Optional.empty();
    boolean speciesIsSet;
    @Nullable Optional<String> intraspecificDescription = Optional.empty();
    boolean intraspecificDescriptionIsSet;
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("author")
    public void setAuthor(Optional<List<SubstanceSourceMaterial_Author>> author) {
      this.author = author;
      this.authorIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("organismGeneral")
    public void setOrganismGeneral(Optional<SubstanceSourceMaterial_OrganismGeneral> organismGeneral) {
      this.organismGeneral = organismGeneral;
      this.organismGeneralIsSet = true;
    }
    @JsonProperty("genus")
    public void setGenus(Optional<CodeableConcept> genus) {
      this.genus = genus;
      this.genusIsSet = true;
    }
    @JsonProperty("family")
    public void setFamily(Optional<CodeableConcept> family) {
      this.family = family;
      this.familyIsSet = true;
    }
    @JsonProperty("hybrid")
    public void setHybrid(Optional<SubstanceSourceMaterial_Hybrid> hybrid) {
      this.hybrid = hybrid;
      this.hybridIsSet = true;
    }
    @JsonProperty("intraspecificType")
    public void setIntraspecificType(Optional<CodeableConcept> intraspecificType) {
      this.intraspecificType = intraspecificType;
      this.intraspecificTypeIsSet = true;
    }
    @JsonProperty("species")
    public void setSpecies(Optional<CodeableConcept> species) {
      this.species = species;
      this.speciesIsSet = true;
    }
    @JsonProperty("intraspecificDescription")
    public void setIntraspecificDescription(Optional<String> intraspecificDescription) {
      this.intraspecificDescription = intraspecificDescription;
      this.intraspecificDescriptionIsSet = true;
    }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<SubstanceSourceMaterial_Author>> author() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<SubstanceSourceMaterial_OrganismGeneral> organismGeneral() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> genus() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> family() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<SubstanceSourceMaterial_Hybrid> hybrid() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> intraspecificType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> species() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> intraspecificDescription() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableSubstanceSourceMaterial_Organism fromJson(Json json) {
    ImmutableSubstanceSourceMaterial_Organism.Builder builder = ImmutableSubstanceSourceMaterial_Organism.builder();
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.authorIsSet) {
      builder.author(json.author);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.organismGeneralIsSet) {
      builder.organismGeneral(json.organismGeneral);
    }
    if (json.genusIsSet) {
      builder.genus(json.genus);
    }
    if (json.familyIsSet) {
      builder.family(json.family);
    }
    if (json.hybridIsSet) {
      builder.hybrid(json.hybrid);
    }
    if (json.intraspecificTypeIsSet) {
      builder.intraspecificType(json.intraspecificType);
    }
    if (json.speciesIsSet) {
      builder.species(json.species);
    }
    if (json.intraspecificDescriptionIsSet) {
      builder.intraspecificDescription(json.intraspecificDescription);
    }
    return (ImmutableSubstanceSourceMaterial_Organism) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link SubstanceSourceMaterial_Organism} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable SubstanceSourceMaterial_Organism instance
   */
  public static SubstanceSourceMaterial_Organism copyOf(SubstanceSourceMaterial_Organism instance) {
    if (instance instanceof ImmutableSubstanceSourceMaterial_Organism) {
      return (ImmutableSubstanceSourceMaterial_Organism) instance;
    }
    return ImmutableSubstanceSourceMaterial_Organism.builder()
        .modifierExtension(instance.modifierExtension())
        .id(instance.id())
        .author(instance.author())
        .extension(instance.extension())
        .organismGeneral(instance.organismGeneral())
        .genus(instance.genus())
        .family(instance.family())
        .hybrid(instance.hybrid())
        .intraspecificType(instance.intraspecificType())
        .species(instance.species())
        .intraspecificDescription(instance.intraspecificDescription())
        .build();
  }

  /**
   * Creates a builder for {@link SubstanceSourceMaterial_Organism SubstanceSourceMaterial_Organism}.
   * <pre>
   * ImmutableSubstanceSourceMaterial_Organism.builder()
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link SubstanceSourceMaterial_Organism#modifierExtension() modifierExtension}
   *    .id(String) // optional {@link SubstanceSourceMaterial_Organism#id() id}
   *    .author(List&amp;lt;com.medplum.types.fhir.SubstanceSourceMaterial_Author&amp;gt;) // optional {@link SubstanceSourceMaterial_Organism#author() author}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link SubstanceSourceMaterial_Organism#extension() extension}
   *    .organismGeneral(com.medplum.types.fhir.SubstanceSourceMaterial_OrganismGeneral) // optional {@link SubstanceSourceMaterial_Organism#organismGeneral() organismGeneral}
   *    .genus(com.medplum.types.fhir.CodeableConcept) // optional {@link SubstanceSourceMaterial_Organism#genus() genus}
   *    .family(com.medplum.types.fhir.CodeableConcept) // optional {@link SubstanceSourceMaterial_Organism#family() family}
   *    .hybrid(com.medplum.types.fhir.SubstanceSourceMaterial_Hybrid) // optional {@link SubstanceSourceMaterial_Organism#hybrid() hybrid}
   *    .intraspecificType(com.medplum.types.fhir.CodeableConcept) // optional {@link SubstanceSourceMaterial_Organism#intraspecificType() intraspecificType}
   *    .species(com.medplum.types.fhir.CodeableConcept) // optional {@link SubstanceSourceMaterial_Organism#species() species}
   *    .intraspecificDescription(String) // optional {@link SubstanceSourceMaterial_Organism#intraspecificDescription() intraspecificDescription}
   *    .build();
   * </pre>
   * @return A new SubstanceSourceMaterial_Organism builder
   */
  public static ImmutableSubstanceSourceMaterial_Organism.Builder builder() {
    return new ImmutableSubstanceSourceMaterial_Organism.Builder();
  }

  /**
   * Builds instances of type {@link SubstanceSourceMaterial_Organism SubstanceSourceMaterial_Organism}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "SubstanceSourceMaterial_Organism", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x1L;
    private static final long OPT_BIT_ID = 0x2L;
    private static final long OPT_BIT_AUTHOR = 0x4L;
    private static final long OPT_BIT_EXTENSION = 0x8L;
    private static final long OPT_BIT_ORGANISM_GENERAL = 0x10L;
    private static final long OPT_BIT_GENUS = 0x20L;
    private static final long OPT_BIT_FAMILY = 0x40L;
    private static final long OPT_BIT_HYBRID = 0x80L;
    private static final long OPT_BIT_INTRASPECIFIC_TYPE = 0x100L;
    private static final long OPT_BIT_SPECIES = 0x200L;
    private static final long OPT_BIT_INTRASPECIFIC_DESCRIPTION = 0x400L;
    private long optBits;

    private @Nullable List<Extension> modifierExtension;
    private @Nullable String id;
    private @Nullable List<SubstanceSourceMaterial_Author> author;
    private @Nullable List<Extension> extension;
    private @Nullable SubstanceSourceMaterial_OrganismGeneral organismGeneral;
    private @Nullable CodeableConcept genus;
    private @Nullable CodeableConcept family;
    private @Nullable SubstanceSourceMaterial_Hybrid hybrid;
    private @Nullable CodeableConcept intraspecificType;
    private @Nullable CodeableConcept species;
    private @Nullable String intraspecificDescription;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial_Organism#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link SubstanceSourceMaterial_Organism#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link SubstanceSourceMaterial_Organism#id() id} to id.
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
     * Initializes the optional value {@link SubstanceSourceMaterial_Organism#id() id} to id.
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
     * Initializes the optional value {@link SubstanceSourceMaterial_Organism#author() author} to author.
     * @param author The value for author
     * @return {@code this} builder for chained invocation
     */
    public final Builder author(List<SubstanceSourceMaterial_Author> author) {
      checkNotIsSet(authorIsSet(), "author");
      this.author = Objects.requireNonNull(author, "author");
      optBits |= OPT_BIT_AUTHOR;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial_Organism#author() author} to author.
     * @param author The value for author
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("author")
    public final Builder author(Optional<? extends List<SubstanceSourceMaterial_Author>> author) {
      checkNotIsSet(authorIsSet(), "author");
      this.author = author.orElse(null);
      optBits |= OPT_BIT_AUTHOR;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial_Organism#extension() extension} to extension.
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
     * Initializes the optional value {@link SubstanceSourceMaterial_Organism#extension() extension} to extension.
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
     * Initializes the optional value {@link SubstanceSourceMaterial_Organism#organismGeneral() organismGeneral} to organismGeneral.
     * @param organismGeneral The value for organismGeneral
     * @return {@code this} builder for chained invocation
     */
    public final Builder organismGeneral(SubstanceSourceMaterial_OrganismGeneral organismGeneral) {
      checkNotIsSet(organismGeneralIsSet(), "organismGeneral");
      this.organismGeneral = Objects.requireNonNull(organismGeneral, "organismGeneral");
      optBits |= OPT_BIT_ORGANISM_GENERAL;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial_Organism#organismGeneral() organismGeneral} to organismGeneral.
     * @param organismGeneral The value for organismGeneral
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("organismGeneral")
    public final Builder organismGeneral(Optional<? extends SubstanceSourceMaterial_OrganismGeneral> organismGeneral) {
      checkNotIsSet(organismGeneralIsSet(), "organismGeneral");
      this.organismGeneral = organismGeneral.orElse(null);
      optBits |= OPT_BIT_ORGANISM_GENERAL;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial_Organism#genus() genus} to genus.
     * @param genus The value for genus
     * @return {@code this} builder for chained invocation
     */
    public final Builder genus(CodeableConcept genus) {
      checkNotIsSet(genusIsSet(), "genus");
      this.genus = Objects.requireNonNull(genus, "genus");
      optBits |= OPT_BIT_GENUS;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial_Organism#genus() genus} to genus.
     * @param genus The value for genus
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("genus")
    public final Builder genus(Optional<? extends CodeableConcept> genus) {
      checkNotIsSet(genusIsSet(), "genus");
      this.genus = genus.orElse(null);
      optBits |= OPT_BIT_GENUS;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial_Organism#family() family} to family.
     * @param family The value for family
     * @return {@code this} builder for chained invocation
     */
    public final Builder family(CodeableConcept family) {
      checkNotIsSet(familyIsSet(), "family");
      this.family = Objects.requireNonNull(family, "family");
      optBits |= OPT_BIT_FAMILY;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial_Organism#family() family} to family.
     * @param family The value for family
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("family")
    public final Builder family(Optional<? extends CodeableConcept> family) {
      checkNotIsSet(familyIsSet(), "family");
      this.family = family.orElse(null);
      optBits |= OPT_BIT_FAMILY;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial_Organism#hybrid() hybrid} to hybrid.
     * @param hybrid The value for hybrid
     * @return {@code this} builder for chained invocation
     */
    public final Builder hybrid(SubstanceSourceMaterial_Hybrid hybrid) {
      checkNotIsSet(hybridIsSet(), "hybrid");
      this.hybrid = Objects.requireNonNull(hybrid, "hybrid");
      optBits |= OPT_BIT_HYBRID;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial_Organism#hybrid() hybrid} to hybrid.
     * @param hybrid The value for hybrid
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("hybrid")
    public final Builder hybrid(Optional<? extends SubstanceSourceMaterial_Hybrid> hybrid) {
      checkNotIsSet(hybridIsSet(), "hybrid");
      this.hybrid = hybrid.orElse(null);
      optBits |= OPT_BIT_HYBRID;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial_Organism#intraspecificType() intraspecificType} to intraspecificType.
     * @param intraspecificType The value for intraspecificType
     * @return {@code this} builder for chained invocation
     */
    public final Builder intraspecificType(CodeableConcept intraspecificType) {
      checkNotIsSet(intraspecificTypeIsSet(), "intraspecificType");
      this.intraspecificType = Objects.requireNonNull(intraspecificType, "intraspecificType");
      optBits |= OPT_BIT_INTRASPECIFIC_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial_Organism#intraspecificType() intraspecificType} to intraspecificType.
     * @param intraspecificType The value for intraspecificType
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("intraspecificType")
    public final Builder intraspecificType(Optional<? extends CodeableConcept> intraspecificType) {
      checkNotIsSet(intraspecificTypeIsSet(), "intraspecificType");
      this.intraspecificType = intraspecificType.orElse(null);
      optBits |= OPT_BIT_INTRASPECIFIC_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial_Organism#species() species} to species.
     * @param species The value for species
     * @return {@code this} builder for chained invocation
     */
    public final Builder species(CodeableConcept species) {
      checkNotIsSet(speciesIsSet(), "species");
      this.species = Objects.requireNonNull(species, "species");
      optBits |= OPT_BIT_SPECIES;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial_Organism#species() species} to species.
     * @param species The value for species
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("species")
    public final Builder species(Optional<? extends CodeableConcept> species) {
      checkNotIsSet(speciesIsSet(), "species");
      this.species = species.orElse(null);
      optBits |= OPT_BIT_SPECIES;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial_Organism#intraspecificDescription() intraspecificDescription} to intraspecificDescription.
     * @param intraspecificDescription The value for intraspecificDescription
     * @return {@code this} builder for chained invocation
     */
    public final Builder intraspecificDescription(String intraspecificDescription) {
      checkNotIsSet(intraspecificDescriptionIsSet(), "intraspecificDescription");
      this.intraspecificDescription = Objects.requireNonNull(intraspecificDescription, "intraspecificDescription");
      optBits |= OPT_BIT_INTRASPECIFIC_DESCRIPTION;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial_Organism#intraspecificDescription() intraspecificDescription} to intraspecificDescription.
     * @param intraspecificDescription The value for intraspecificDescription
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("intraspecificDescription")
    public final Builder intraspecificDescription(Optional<String> intraspecificDescription) {
      checkNotIsSet(intraspecificDescriptionIsSet(), "intraspecificDescription");
      this.intraspecificDescription = intraspecificDescription.orElse(null);
      optBits |= OPT_BIT_INTRASPECIFIC_DESCRIPTION;
      return this;
    }

    /**
     * Builds a new {@link SubstanceSourceMaterial_Organism SubstanceSourceMaterial_Organism}.
     * @return An immutable instance of SubstanceSourceMaterial_Organism
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public SubstanceSourceMaterial_Organism build() {
      return new ImmutableSubstanceSourceMaterial_Organism(
          modifierExtension,
          id,
          author,
          extension,
          organismGeneral,
          genus,
          family,
          hybrid,
          intraspecificType,
          species,
          intraspecificDescription);
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean authorIsSet() {
      return (optBits & OPT_BIT_AUTHOR) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean organismGeneralIsSet() {
      return (optBits & OPT_BIT_ORGANISM_GENERAL) != 0;
    }

    private boolean genusIsSet() {
      return (optBits & OPT_BIT_GENUS) != 0;
    }

    private boolean familyIsSet() {
      return (optBits & OPT_BIT_FAMILY) != 0;
    }

    private boolean hybridIsSet() {
      return (optBits & OPT_BIT_HYBRID) != 0;
    }

    private boolean intraspecificTypeIsSet() {
      return (optBits & OPT_BIT_INTRASPECIFIC_TYPE) != 0;
    }

    private boolean speciesIsSet() {
      return (optBits & OPT_BIT_SPECIES) != 0;
    }

    private boolean intraspecificDescriptionIsSet() {
      return (optBits & OPT_BIT_INTRASPECIFIC_DESCRIPTION) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of SubstanceSourceMaterial_Organism is strict, attribute is already set: ".concat(name));
    }
  }
}
