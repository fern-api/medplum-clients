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
 * Immutable implementation of {@link SubstanceSourceMaterial}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableSubstanceSourceMaterial.builder()}.
 */
@Generated(from = "SubstanceSourceMaterial", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableSubstanceSourceMaterial implements SubstanceSourceMaterial {
  private final @Nullable String organismName;
  private final @Nullable Id id;
  private final @Nullable SubstanceSourceMaterial_Organism organism;
  private final @Nullable List<SubstanceSourceMaterial_PartDescription> partDescription;
  private final @Nullable Uri implicitRules;
  private final @Nullable List<ResourceList> contained;
  private final @Nullable Meta meta;
  private final @Nullable List<SubstanceSourceMaterial_FractionDescription> fractionDescription;
  private final @Nullable List<CodeableConcept> countryOfOrigin;
  private final @Nullable List<Extension> extension;
  private final @Nullable List<Identifier> parentSubstanceId;
  private final String resourceType;
  private final @Nullable CodeableConcept sourceMaterialType;
  private final @Nullable Narrative text;
  private final @Nullable List<String> parentSubstanceName;
  private final @Nullable CodeableConcept developmentStage;
  private final @Nullable Identifier organismId;
  private final @Nullable CodeableConcept sourceMaterialClass;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable List<String> geographicalLocation;
  private final @Nullable CodeableConcept sourceMaterialState;
  private final @Nullable Code language;

  private ImmutableSubstanceSourceMaterial(
      @Nullable String organismName,
      @Nullable Id id,
      @Nullable SubstanceSourceMaterial_Organism organism,
      @Nullable List<SubstanceSourceMaterial_PartDescription> partDescription,
      @Nullable Uri implicitRules,
      @Nullable List<ResourceList> contained,
      @Nullable Meta meta,
      @Nullable List<SubstanceSourceMaterial_FractionDescription> fractionDescription,
      @Nullable List<CodeableConcept> countryOfOrigin,
      @Nullable List<Extension> extension,
      @Nullable List<Identifier> parentSubstanceId,
      String resourceType,
      @Nullable CodeableConcept sourceMaterialType,
      @Nullable Narrative text,
      @Nullable List<String> parentSubstanceName,
      @Nullable CodeableConcept developmentStage,
      @Nullable Identifier organismId,
      @Nullable CodeableConcept sourceMaterialClass,
      @Nullable List<Extension> modifierExtension,
      @Nullable List<String> geographicalLocation,
      @Nullable CodeableConcept sourceMaterialState,
      @Nullable Code language) {
    this.organismName = organismName;
    this.id = id;
    this.organism = organism;
    this.partDescription = partDescription;
    this.implicitRules = implicitRules;
    this.contained = contained;
    this.meta = meta;
    this.fractionDescription = fractionDescription;
    this.countryOfOrigin = countryOfOrigin;
    this.extension = extension;
    this.parentSubstanceId = parentSubstanceId;
    this.resourceType = resourceType;
    this.sourceMaterialType = sourceMaterialType;
    this.text = text;
    this.parentSubstanceName = parentSubstanceName;
    this.developmentStage = developmentStage;
    this.organismId = organismId;
    this.sourceMaterialClass = sourceMaterialClass;
    this.modifierExtension = modifierExtension;
    this.geographicalLocation = geographicalLocation;
    this.sourceMaterialState = sourceMaterialState;
    this.language = language;
  }

  /**
   * @return The value of the {@code organismName} attribute
   */
  @JsonProperty("organismName")
  @Override
  public Optional<String> organismName() {
    return Optional.ofNullable(organismName);
  }

  /**
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public Optional<Id> id() {
    return Optional.ofNullable(id);
  }

  /**
   * @return The value of the {@code organism} attribute
   */
  @JsonProperty("organism")
  @Override
  public Optional<SubstanceSourceMaterial_Organism> organism() {
    return Optional.ofNullable(organism);
  }

  /**
   * @return The value of the {@code partDescription} attribute
   */
  @JsonProperty("partDescription")
  @Override
  public Optional<List<SubstanceSourceMaterial_PartDescription>> partDescription() {
    return Optional.ofNullable(partDescription);
  }

  /**
   * @return The value of the {@code implicitRules} attribute
   */
  @JsonProperty("implicitRules")
  @Override
  public Optional<Uri> implicitRules() {
    return Optional.ofNullable(implicitRules);
  }

  /**
   * @return The value of the {@code contained} attribute
   */
  @JsonProperty("contained")
  @Override
  public Optional<List<ResourceList>> contained() {
    return Optional.ofNullable(contained);
  }

  /**
   * @return The value of the {@code meta} attribute
   */
  @JsonProperty("meta")
  @Override
  public Optional<Meta> meta() {
    return Optional.ofNullable(meta);
  }

  /**
   * @return The value of the {@code fractionDescription} attribute
   */
  @JsonProperty("fractionDescription")
  @Override
  public Optional<List<SubstanceSourceMaterial_FractionDescription>> fractionDescription() {
    return Optional.ofNullable(fractionDescription);
  }

  /**
   * @return The value of the {@code countryOfOrigin} attribute
   */
  @JsonProperty("countryOfOrigin")
  @Override
  public Optional<List<CodeableConcept>> countryOfOrigin() {
    return Optional.ofNullable(countryOfOrigin);
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
   * @return The value of the {@code parentSubstanceId} attribute
   */
  @JsonProperty("parentSubstanceId")
  @Override
  public Optional<List<Identifier>> parentSubstanceId() {
    return Optional.ofNullable(parentSubstanceId);
  }

  /**
   * @return The value of the {@code resourceType} attribute
   */
  @JsonProperty("resourceType")
  @Override
  public String resourceType() {
    return resourceType;
  }

  /**
   * @return The value of the {@code sourceMaterialType} attribute
   */
  @JsonProperty("sourceMaterialType")
  @Override
  public Optional<CodeableConcept> sourceMaterialType() {
    return Optional.ofNullable(sourceMaterialType);
  }

  /**
   * @return The value of the {@code text} attribute
   */
  @JsonProperty("text")
  @Override
  public Optional<Narrative> text() {
    return Optional.ofNullable(text);
  }

  /**
   * @return The value of the {@code parentSubstanceName} attribute
   */
  @JsonProperty("parentSubstanceName")
  @Override
  public Optional<List<String>> parentSubstanceName() {
    return Optional.ofNullable(parentSubstanceName);
  }

  /**
   * @return The value of the {@code developmentStage} attribute
   */
  @JsonProperty("developmentStage")
  @Override
  public Optional<CodeableConcept> developmentStage() {
    return Optional.ofNullable(developmentStage);
  }

  /**
   * @return The value of the {@code organismId} attribute
   */
  @JsonProperty("organismId")
  @Override
  public Optional<Identifier> organismId() {
    return Optional.ofNullable(organismId);
  }

  /**
   * @return The value of the {@code sourceMaterialClass} attribute
   */
  @JsonProperty("sourceMaterialClass")
  @Override
  public Optional<CodeableConcept> sourceMaterialClass() {
    return Optional.ofNullable(sourceMaterialClass);
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
   * @return The value of the {@code geographicalLocation} attribute
   */
  @JsonProperty("geographicalLocation")
  @Override
  public Optional<List<String>> geographicalLocation() {
    return Optional.ofNullable(geographicalLocation);
  }

  /**
   * @return The value of the {@code sourceMaterialState} attribute
   */
  @JsonProperty("sourceMaterialState")
  @Override
  public Optional<CodeableConcept> sourceMaterialState() {
    return Optional.ofNullable(sourceMaterialState);
  }

  /**
   * @return The value of the {@code language} attribute
   */
  @JsonProperty("language")
  @Override
  public Optional<Code> language() {
    return Optional.ofNullable(language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSourceMaterial#organismName() organismName} attribute.
   * @param value The value for organismName
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSourceMaterial withOrganismName(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "organismName");
    if (Objects.equals(this.organismName, newValue)) return this;
    return new ImmutableSubstanceSourceMaterial(
        newValue,
        this.id,
        this.organism,
        this.partDescription,
        this.implicitRules,
        this.contained,
        this.meta,
        this.fractionDescription,
        this.countryOfOrigin,
        this.extension,
        this.parentSubstanceId,
        this.resourceType,
        this.sourceMaterialType,
        this.text,
        this.parentSubstanceName,
        this.developmentStage,
        this.organismId,
        this.sourceMaterialClass,
        this.modifierExtension,
        this.geographicalLocation,
        this.sourceMaterialState,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSourceMaterial#organismName() organismName} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for organismName
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSourceMaterial withOrganismName(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.organismName, value)) return this;
    return new ImmutableSubstanceSourceMaterial(
        value,
        this.id,
        this.organism,
        this.partDescription,
        this.implicitRules,
        this.contained,
        this.meta,
        this.fractionDescription,
        this.countryOfOrigin,
        this.extension,
        this.parentSubstanceId,
        this.resourceType,
        this.sourceMaterialType,
        this.text,
        this.parentSubstanceName,
        this.developmentStage,
        this.organismId,
        this.sourceMaterialClass,
        this.modifierExtension,
        this.geographicalLocation,
        this.sourceMaterialState,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSourceMaterial#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSourceMaterial withId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableSubstanceSourceMaterial(
        this.organismName,
        newValue,
        this.organism,
        this.partDescription,
        this.implicitRules,
        this.contained,
        this.meta,
        this.fractionDescription,
        this.countryOfOrigin,
        this.extension,
        this.parentSubstanceId,
        this.resourceType,
        this.sourceMaterialType,
        this.text,
        this.parentSubstanceName,
        this.developmentStage,
        this.organismId,
        this.sourceMaterialClass,
        this.modifierExtension,
        this.geographicalLocation,
        this.sourceMaterialState,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSourceMaterial#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSourceMaterial withId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableSubstanceSourceMaterial(
        this.organismName,
        value,
        this.organism,
        this.partDescription,
        this.implicitRules,
        this.contained,
        this.meta,
        this.fractionDescription,
        this.countryOfOrigin,
        this.extension,
        this.parentSubstanceId,
        this.resourceType,
        this.sourceMaterialType,
        this.text,
        this.parentSubstanceName,
        this.developmentStage,
        this.organismId,
        this.sourceMaterialClass,
        this.modifierExtension,
        this.geographicalLocation,
        this.sourceMaterialState,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSourceMaterial#organism() organism} attribute.
   * @param value The value for organism
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSourceMaterial withOrganism(SubstanceSourceMaterial_Organism value) {
    @Nullable SubstanceSourceMaterial_Organism newValue = Objects.requireNonNull(value, "organism");
    if (this.organism == newValue) return this;
    return new ImmutableSubstanceSourceMaterial(
        this.organismName,
        this.id,
        newValue,
        this.partDescription,
        this.implicitRules,
        this.contained,
        this.meta,
        this.fractionDescription,
        this.countryOfOrigin,
        this.extension,
        this.parentSubstanceId,
        this.resourceType,
        this.sourceMaterialType,
        this.text,
        this.parentSubstanceName,
        this.developmentStage,
        this.organismId,
        this.sourceMaterialClass,
        this.modifierExtension,
        this.geographicalLocation,
        this.sourceMaterialState,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSourceMaterial#organism() organism} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for organism
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSourceMaterial withOrganism(Optional<? extends SubstanceSourceMaterial_Organism> optional) {
    @Nullable SubstanceSourceMaterial_Organism value = optional.orElse(null);
    if (this.organism == value) return this;
    return new ImmutableSubstanceSourceMaterial(
        this.organismName,
        this.id,
        value,
        this.partDescription,
        this.implicitRules,
        this.contained,
        this.meta,
        this.fractionDescription,
        this.countryOfOrigin,
        this.extension,
        this.parentSubstanceId,
        this.resourceType,
        this.sourceMaterialType,
        this.text,
        this.parentSubstanceName,
        this.developmentStage,
        this.organismId,
        this.sourceMaterialClass,
        this.modifierExtension,
        this.geographicalLocation,
        this.sourceMaterialState,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSourceMaterial#partDescription() partDescription} attribute.
   * @param value The value for partDescription
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSourceMaterial withPartDescription(List<SubstanceSourceMaterial_PartDescription> value) {
    @Nullable List<SubstanceSourceMaterial_PartDescription> newValue = Objects.requireNonNull(value, "partDescription");
    if (this.partDescription == newValue) return this;
    return new ImmutableSubstanceSourceMaterial(
        this.organismName,
        this.id,
        this.organism,
        newValue,
        this.implicitRules,
        this.contained,
        this.meta,
        this.fractionDescription,
        this.countryOfOrigin,
        this.extension,
        this.parentSubstanceId,
        this.resourceType,
        this.sourceMaterialType,
        this.text,
        this.parentSubstanceName,
        this.developmentStage,
        this.organismId,
        this.sourceMaterialClass,
        this.modifierExtension,
        this.geographicalLocation,
        this.sourceMaterialState,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSourceMaterial#partDescription() partDescription} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for partDescription
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSourceMaterial withPartDescription(Optional<? extends List<SubstanceSourceMaterial_PartDescription>> optional) {
    @Nullable List<SubstanceSourceMaterial_PartDescription> value = optional.orElse(null);
    if (this.partDescription == value) return this;
    return new ImmutableSubstanceSourceMaterial(
        this.organismName,
        this.id,
        this.organism,
        value,
        this.implicitRules,
        this.contained,
        this.meta,
        this.fractionDescription,
        this.countryOfOrigin,
        this.extension,
        this.parentSubstanceId,
        this.resourceType,
        this.sourceMaterialType,
        this.text,
        this.parentSubstanceName,
        this.developmentStage,
        this.organismId,
        this.sourceMaterialClass,
        this.modifierExtension,
        this.geographicalLocation,
        this.sourceMaterialState,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSourceMaterial#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSourceMaterial withImplicitRules(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableSubstanceSourceMaterial(
        this.organismName,
        this.id,
        this.organism,
        this.partDescription,
        newValue,
        this.contained,
        this.meta,
        this.fractionDescription,
        this.countryOfOrigin,
        this.extension,
        this.parentSubstanceId,
        this.resourceType,
        this.sourceMaterialType,
        this.text,
        this.parentSubstanceName,
        this.developmentStage,
        this.organismId,
        this.sourceMaterialClass,
        this.modifierExtension,
        this.geographicalLocation,
        this.sourceMaterialState,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSourceMaterial#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSourceMaterial withImplicitRules(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableSubstanceSourceMaterial(
        this.organismName,
        this.id,
        this.organism,
        this.partDescription,
        value,
        this.contained,
        this.meta,
        this.fractionDescription,
        this.countryOfOrigin,
        this.extension,
        this.parentSubstanceId,
        this.resourceType,
        this.sourceMaterialType,
        this.text,
        this.parentSubstanceName,
        this.developmentStage,
        this.organismId,
        this.sourceMaterialClass,
        this.modifierExtension,
        this.geographicalLocation,
        this.sourceMaterialState,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSourceMaterial#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSourceMaterial withContained(List<ResourceList> value) {
    @Nullable List<ResourceList> newValue = Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableSubstanceSourceMaterial(
        this.organismName,
        this.id,
        this.organism,
        this.partDescription,
        this.implicitRules,
        newValue,
        this.meta,
        this.fractionDescription,
        this.countryOfOrigin,
        this.extension,
        this.parentSubstanceId,
        this.resourceType,
        this.sourceMaterialType,
        this.text,
        this.parentSubstanceName,
        this.developmentStage,
        this.organismId,
        this.sourceMaterialClass,
        this.modifierExtension,
        this.geographicalLocation,
        this.sourceMaterialState,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSourceMaterial#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSourceMaterial withContained(Optional<? extends List<ResourceList>> optional) {
    @Nullable List<ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableSubstanceSourceMaterial(
        this.organismName,
        this.id,
        this.organism,
        this.partDescription,
        this.implicitRules,
        value,
        this.meta,
        this.fractionDescription,
        this.countryOfOrigin,
        this.extension,
        this.parentSubstanceId,
        this.resourceType,
        this.sourceMaterialType,
        this.text,
        this.parentSubstanceName,
        this.developmentStage,
        this.organismId,
        this.sourceMaterialClass,
        this.modifierExtension,
        this.geographicalLocation,
        this.sourceMaterialState,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSourceMaterial#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSourceMaterial withMeta(Meta value) {
    @Nullable Meta newValue = Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableSubstanceSourceMaterial(
        this.organismName,
        this.id,
        this.organism,
        this.partDescription,
        this.implicitRules,
        this.contained,
        newValue,
        this.fractionDescription,
        this.countryOfOrigin,
        this.extension,
        this.parentSubstanceId,
        this.resourceType,
        this.sourceMaterialType,
        this.text,
        this.parentSubstanceName,
        this.developmentStage,
        this.organismId,
        this.sourceMaterialClass,
        this.modifierExtension,
        this.geographicalLocation,
        this.sourceMaterialState,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSourceMaterial#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSourceMaterial withMeta(Optional<? extends Meta> optional) {
    @Nullable Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableSubstanceSourceMaterial(
        this.organismName,
        this.id,
        this.organism,
        this.partDescription,
        this.implicitRules,
        this.contained,
        value,
        this.fractionDescription,
        this.countryOfOrigin,
        this.extension,
        this.parentSubstanceId,
        this.resourceType,
        this.sourceMaterialType,
        this.text,
        this.parentSubstanceName,
        this.developmentStage,
        this.organismId,
        this.sourceMaterialClass,
        this.modifierExtension,
        this.geographicalLocation,
        this.sourceMaterialState,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSourceMaterial#fractionDescription() fractionDescription} attribute.
   * @param value The value for fractionDescription
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSourceMaterial withFractionDescription(List<SubstanceSourceMaterial_FractionDescription> value) {
    @Nullable List<SubstanceSourceMaterial_FractionDescription> newValue = Objects.requireNonNull(value, "fractionDescription");
    if (this.fractionDescription == newValue) return this;
    return new ImmutableSubstanceSourceMaterial(
        this.organismName,
        this.id,
        this.organism,
        this.partDescription,
        this.implicitRules,
        this.contained,
        this.meta,
        newValue,
        this.countryOfOrigin,
        this.extension,
        this.parentSubstanceId,
        this.resourceType,
        this.sourceMaterialType,
        this.text,
        this.parentSubstanceName,
        this.developmentStage,
        this.organismId,
        this.sourceMaterialClass,
        this.modifierExtension,
        this.geographicalLocation,
        this.sourceMaterialState,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSourceMaterial#fractionDescription() fractionDescription} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for fractionDescription
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSourceMaterial withFractionDescription(Optional<? extends List<SubstanceSourceMaterial_FractionDescription>> optional) {
    @Nullable List<SubstanceSourceMaterial_FractionDescription> value = optional.orElse(null);
    if (this.fractionDescription == value) return this;
    return new ImmutableSubstanceSourceMaterial(
        this.organismName,
        this.id,
        this.organism,
        this.partDescription,
        this.implicitRules,
        this.contained,
        this.meta,
        value,
        this.countryOfOrigin,
        this.extension,
        this.parentSubstanceId,
        this.resourceType,
        this.sourceMaterialType,
        this.text,
        this.parentSubstanceName,
        this.developmentStage,
        this.organismId,
        this.sourceMaterialClass,
        this.modifierExtension,
        this.geographicalLocation,
        this.sourceMaterialState,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSourceMaterial#countryOfOrigin() countryOfOrigin} attribute.
   * @param value The value for countryOfOrigin
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSourceMaterial withCountryOfOrigin(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "countryOfOrigin");
    if (this.countryOfOrigin == newValue) return this;
    return new ImmutableSubstanceSourceMaterial(
        this.organismName,
        this.id,
        this.organism,
        this.partDescription,
        this.implicitRules,
        this.contained,
        this.meta,
        this.fractionDescription,
        newValue,
        this.extension,
        this.parentSubstanceId,
        this.resourceType,
        this.sourceMaterialType,
        this.text,
        this.parentSubstanceName,
        this.developmentStage,
        this.organismId,
        this.sourceMaterialClass,
        this.modifierExtension,
        this.geographicalLocation,
        this.sourceMaterialState,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSourceMaterial#countryOfOrigin() countryOfOrigin} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for countryOfOrigin
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSourceMaterial withCountryOfOrigin(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.countryOfOrigin == value) return this;
    return new ImmutableSubstanceSourceMaterial(
        this.organismName,
        this.id,
        this.organism,
        this.partDescription,
        this.implicitRules,
        this.contained,
        this.meta,
        this.fractionDescription,
        value,
        this.extension,
        this.parentSubstanceId,
        this.resourceType,
        this.sourceMaterialType,
        this.text,
        this.parentSubstanceName,
        this.developmentStage,
        this.organismId,
        this.sourceMaterialClass,
        this.modifierExtension,
        this.geographicalLocation,
        this.sourceMaterialState,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSourceMaterial#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSourceMaterial withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableSubstanceSourceMaterial(
        this.organismName,
        this.id,
        this.organism,
        this.partDescription,
        this.implicitRules,
        this.contained,
        this.meta,
        this.fractionDescription,
        this.countryOfOrigin,
        newValue,
        this.parentSubstanceId,
        this.resourceType,
        this.sourceMaterialType,
        this.text,
        this.parentSubstanceName,
        this.developmentStage,
        this.organismId,
        this.sourceMaterialClass,
        this.modifierExtension,
        this.geographicalLocation,
        this.sourceMaterialState,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSourceMaterial#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSourceMaterial withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableSubstanceSourceMaterial(
        this.organismName,
        this.id,
        this.organism,
        this.partDescription,
        this.implicitRules,
        this.contained,
        this.meta,
        this.fractionDescription,
        this.countryOfOrigin,
        value,
        this.parentSubstanceId,
        this.resourceType,
        this.sourceMaterialType,
        this.text,
        this.parentSubstanceName,
        this.developmentStage,
        this.organismId,
        this.sourceMaterialClass,
        this.modifierExtension,
        this.geographicalLocation,
        this.sourceMaterialState,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSourceMaterial#parentSubstanceId() parentSubstanceId} attribute.
   * @param value The value for parentSubstanceId
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSourceMaterial withParentSubstanceId(List<Identifier> value) {
    @Nullable List<Identifier> newValue = Objects.requireNonNull(value, "parentSubstanceId");
    if (this.parentSubstanceId == newValue) return this;
    return new ImmutableSubstanceSourceMaterial(
        this.organismName,
        this.id,
        this.organism,
        this.partDescription,
        this.implicitRules,
        this.contained,
        this.meta,
        this.fractionDescription,
        this.countryOfOrigin,
        this.extension,
        newValue,
        this.resourceType,
        this.sourceMaterialType,
        this.text,
        this.parentSubstanceName,
        this.developmentStage,
        this.organismId,
        this.sourceMaterialClass,
        this.modifierExtension,
        this.geographicalLocation,
        this.sourceMaterialState,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSourceMaterial#parentSubstanceId() parentSubstanceId} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for parentSubstanceId
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSourceMaterial withParentSubstanceId(Optional<? extends List<Identifier>> optional) {
    @Nullable List<Identifier> value = optional.orElse(null);
    if (this.parentSubstanceId == value) return this;
    return new ImmutableSubstanceSourceMaterial(
        this.organismName,
        this.id,
        this.organism,
        this.partDescription,
        this.implicitRules,
        this.contained,
        this.meta,
        this.fractionDescription,
        this.countryOfOrigin,
        this.extension,
        value,
        this.resourceType,
        this.sourceMaterialType,
        this.text,
        this.parentSubstanceName,
        this.developmentStage,
        this.organismId,
        this.sourceMaterialClass,
        this.modifierExtension,
        this.geographicalLocation,
        this.sourceMaterialState,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SubstanceSourceMaterial#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSubstanceSourceMaterial withResourceType(String value) {
    String newValue = Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableSubstanceSourceMaterial(
        this.organismName,
        this.id,
        this.organism,
        this.partDescription,
        this.implicitRules,
        this.contained,
        this.meta,
        this.fractionDescription,
        this.countryOfOrigin,
        this.extension,
        this.parentSubstanceId,
        newValue,
        this.sourceMaterialType,
        this.text,
        this.parentSubstanceName,
        this.developmentStage,
        this.organismId,
        this.sourceMaterialClass,
        this.modifierExtension,
        this.geographicalLocation,
        this.sourceMaterialState,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSourceMaterial#sourceMaterialType() sourceMaterialType} attribute.
   * @param value The value for sourceMaterialType
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSourceMaterial withSourceMaterialType(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "sourceMaterialType");
    if (this.sourceMaterialType == newValue) return this;
    return new ImmutableSubstanceSourceMaterial(
        this.organismName,
        this.id,
        this.organism,
        this.partDescription,
        this.implicitRules,
        this.contained,
        this.meta,
        this.fractionDescription,
        this.countryOfOrigin,
        this.extension,
        this.parentSubstanceId,
        this.resourceType,
        newValue,
        this.text,
        this.parentSubstanceName,
        this.developmentStage,
        this.organismId,
        this.sourceMaterialClass,
        this.modifierExtension,
        this.geographicalLocation,
        this.sourceMaterialState,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSourceMaterial#sourceMaterialType() sourceMaterialType} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for sourceMaterialType
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSourceMaterial withSourceMaterialType(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.sourceMaterialType == value) return this;
    return new ImmutableSubstanceSourceMaterial(
        this.organismName,
        this.id,
        this.organism,
        this.partDescription,
        this.implicitRules,
        this.contained,
        this.meta,
        this.fractionDescription,
        this.countryOfOrigin,
        this.extension,
        this.parentSubstanceId,
        this.resourceType,
        value,
        this.text,
        this.parentSubstanceName,
        this.developmentStage,
        this.organismId,
        this.sourceMaterialClass,
        this.modifierExtension,
        this.geographicalLocation,
        this.sourceMaterialState,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSourceMaterial#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSourceMaterial withText(Narrative value) {
    @Nullable Narrative newValue = Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableSubstanceSourceMaterial(
        this.organismName,
        this.id,
        this.organism,
        this.partDescription,
        this.implicitRules,
        this.contained,
        this.meta,
        this.fractionDescription,
        this.countryOfOrigin,
        this.extension,
        this.parentSubstanceId,
        this.resourceType,
        this.sourceMaterialType,
        newValue,
        this.parentSubstanceName,
        this.developmentStage,
        this.organismId,
        this.sourceMaterialClass,
        this.modifierExtension,
        this.geographicalLocation,
        this.sourceMaterialState,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSourceMaterial#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSourceMaterial withText(Optional<? extends Narrative> optional) {
    @Nullable Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableSubstanceSourceMaterial(
        this.organismName,
        this.id,
        this.organism,
        this.partDescription,
        this.implicitRules,
        this.contained,
        this.meta,
        this.fractionDescription,
        this.countryOfOrigin,
        this.extension,
        this.parentSubstanceId,
        this.resourceType,
        this.sourceMaterialType,
        value,
        this.parentSubstanceName,
        this.developmentStage,
        this.organismId,
        this.sourceMaterialClass,
        this.modifierExtension,
        this.geographicalLocation,
        this.sourceMaterialState,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSourceMaterial#parentSubstanceName() parentSubstanceName} attribute.
   * @param value The value for parentSubstanceName
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSourceMaterial withParentSubstanceName(List<String> value) {
    @Nullable List<String> newValue = Objects.requireNonNull(value, "parentSubstanceName");
    if (this.parentSubstanceName == newValue) return this;
    return new ImmutableSubstanceSourceMaterial(
        this.organismName,
        this.id,
        this.organism,
        this.partDescription,
        this.implicitRules,
        this.contained,
        this.meta,
        this.fractionDescription,
        this.countryOfOrigin,
        this.extension,
        this.parentSubstanceId,
        this.resourceType,
        this.sourceMaterialType,
        this.text,
        newValue,
        this.developmentStage,
        this.organismId,
        this.sourceMaterialClass,
        this.modifierExtension,
        this.geographicalLocation,
        this.sourceMaterialState,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSourceMaterial#parentSubstanceName() parentSubstanceName} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for parentSubstanceName
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSourceMaterial withParentSubstanceName(Optional<? extends List<String>> optional) {
    @Nullable List<String> value = optional.orElse(null);
    if (this.parentSubstanceName == value) return this;
    return new ImmutableSubstanceSourceMaterial(
        this.organismName,
        this.id,
        this.organism,
        this.partDescription,
        this.implicitRules,
        this.contained,
        this.meta,
        this.fractionDescription,
        this.countryOfOrigin,
        this.extension,
        this.parentSubstanceId,
        this.resourceType,
        this.sourceMaterialType,
        this.text,
        value,
        this.developmentStage,
        this.organismId,
        this.sourceMaterialClass,
        this.modifierExtension,
        this.geographicalLocation,
        this.sourceMaterialState,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSourceMaterial#developmentStage() developmentStage} attribute.
   * @param value The value for developmentStage
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSourceMaterial withDevelopmentStage(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "developmentStage");
    if (this.developmentStage == newValue) return this;
    return new ImmutableSubstanceSourceMaterial(
        this.organismName,
        this.id,
        this.organism,
        this.partDescription,
        this.implicitRules,
        this.contained,
        this.meta,
        this.fractionDescription,
        this.countryOfOrigin,
        this.extension,
        this.parentSubstanceId,
        this.resourceType,
        this.sourceMaterialType,
        this.text,
        this.parentSubstanceName,
        newValue,
        this.organismId,
        this.sourceMaterialClass,
        this.modifierExtension,
        this.geographicalLocation,
        this.sourceMaterialState,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSourceMaterial#developmentStage() developmentStage} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for developmentStage
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSourceMaterial withDevelopmentStage(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.developmentStage == value) return this;
    return new ImmutableSubstanceSourceMaterial(
        this.organismName,
        this.id,
        this.organism,
        this.partDescription,
        this.implicitRules,
        this.contained,
        this.meta,
        this.fractionDescription,
        this.countryOfOrigin,
        this.extension,
        this.parentSubstanceId,
        this.resourceType,
        this.sourceMaterialType,
        this.text,
        this.parentSubstanceName,
        value,
        this.organismId,
        this.sourceMaterialClass,
        this.modifierExtension,
        this.geographicalLocation,
        this.sourceMaterialState,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSourceMaterial#organismId() organismId} attribute.
   * @param value The value for organismId
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSourceMaterial withOrganismId(Identifier value) {
    @Nullable Identifier newValue = Objects.requireNonNull(value, "organismId");
    if (this.organismId == newValue) return this;
    return new ImmutableSubstanceSourceMaterial(
        this.organismName,
        this.id,
        this.organism,
        this.partDescription,
        this.implicitRules,
        this.contained,
        this.meta,
        this.fractionDescription,
        this.countryOfOrigin,
        this.extension,
        this.parentSubstanceId,
        this.resourceType,
        this.sourceMaterialType,
        this.text,
        this.parentSubstanceName,
        this.developmentStage,
        newValue,
        this.sourceMaterialClass,
        this.modifierExtension,
        this.geographicalLocation,
        this.sourceMaterialState,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSourceMaterial#organismId() organismId} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for organismId
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSourceMaterial withOrganismId(Optional<? extends Identifier> optional) {
    @Nullable Identifier value = optional.orElse(null);
    if (this.organismId == value) return this;
    return new ImmutableSubstanceSourceMaterial(
        this.organismName,
        this.id,
        this.organism,
        this.partDescription,
        this.implicitRules,
        this.contained,
        this.meta,
        this.fractionDescription,
        this.countryOfOrigin,
        this.extension,
        this.parentSubstanceId,
        this.resourceType,
        this.sourceMaterialType,
        this.text,
        this.parentSubstanceName,
        this.developmentStage,
        value,
        this.sourceMaterialClass,
        this.modifierExtension,
        this.geographicalLocation,
        this.sourceMaterialState,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSourceMaterial#sourceMaterialClass() sourceMaterialClass} attribute.
   * @param value The value for sourceMaterialClass
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSourceMaterial withSourceMaterialClass(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "sourceMaterialClass");
    if (this.sourceMaterialClass == newValue) return this;
    return new ImmutableSubstanceSourceMaterial(
        this.organismName,
        this.id,
        this.organism,
        this.partDescription,
        this.implicitRules,
        this.contained,
        this.meta,
        this.fractionDescription,
        this.countryOfOrigin,
        this.extension,
        this.parentSubstanceId,
        this.resourceType,
        this.sourceMaterialType,
        this.text,
        this.parentSubstanceName,
        this.developmentStage,
        this.organismId,
        newValue,
        this.modifierExtension,
        this.geographicalLocation,
        this.sourceMaterialState,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSourceMaterial#sourceMaterialClass() sourceMaterialClass} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for sourceMaterialClass
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSourceMaterial withSourceMaterialClass(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.sourceMaterialClass == value) return this;
    return new ImmutableSubstanceSourceMaterial(
        this.organismName,
        this.id,
        this.organism,
        this.partDescription,
        this.implicitRules,
        this.contained,
        this.meta,
        this.fractionDescription,
        this.countryOfOrigin,
        this.extension,
        this.parentSubstanceId,
        this.resourceType,
        this.sourceMaterialType,
        this.text,
        this.parentSubstanceName,
        this.developmentStage,
        this.organismId,
        value,
        this.modifierExtension,
        this.geographicalLocation,
        this.sourceMaterialState,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSourceMaterial#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSourceMaterial withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableSubstanceSourceMaterial(
        this.organismName,
        this.id,
        this.organism,
        this.partDescription,
        this.implicitRules,
        this.contained,
        this.meta,
        this.fractionDescription,
        this.countryOfOrigin,
        this.extension,
        this.parentSubstanceId,
        this.resourceType,
        this.sourceMaterialType,
        this.text,
        this.parentSubstanceName,
        this.developmentStage,
        this.organismId,
        this.sourceMaterialClass,
        newValue,
        this.geographicalLocation,
        this.sourceMaterialState,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSourceMaterial#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSourceMaterial withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableSubstanceSourceMaterial(
        this.organismName,
        this.id,
        this.organism,
        this.partDescription,
        this.implicitRules,
        this.contained,
        this.meta,
        this.fractionDescription,
        this.countryOfOrigin,
        this.extension,
        this.parentSubstanceId,
        this.resourceType,
        this.sourceMaterialType,
        this.text,
        this.parentSubstanceName,
        this.developmentStage,
        this.organismId,
        this.sourceMaterialClass,
        value,
        this.geographicalLocation,
        this.sourceMaterialState,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSourceMaterial#geographicalLocation() geographicalLocation} attribute.
   * @param value The value for geographicalLocation
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSourceMaterial withGeographicalLocation(List<String> value) {
    @Nullable List<String> newValue = Objects.requireNonNull(value, "geographicalLocation");
    if (this.geographicalLocation == newValue) return this;
    return new ImmutableSubstanceSourceMaterial(
        this.organismName,
        this.id,
        this.organism,
        this.partDescription,
        this.implicitRules,
        this.contained,
        this.meta,
        this.fractionDescription,
        this.countryOfOrigin,
        this.extension,
        this.parentSubstanceId,
        this.resourceType,
        this.sourceMaterialType,
        this.text,
        this.parentSubstanceName,
        this.developmentStage,
        this.organismId,
        this.sourceMaterialClass,
        this.modifierExtension,
        newValue,
        this.sourceMaterialState,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSourceMaterial#geographicalLocation() geographicalLocation} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for geographicalLocation
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSourceMaterial withGeographicalLocation(Optional<? extends List<String>> optional) {
    @Nullable List<String> value = optional.orElse(null);
    if (this.geographicalLocation == value) return this;
    return new ImmutableSubstanceSourceMaterial(
        this.organismName,
        this.id,
        this.organism,
        this.partDescription,
        this.implicitRules,
        this.contained,
        this.meta,
        this.fractionDescription,
        this.countryOfOrigin,
        this.extension,
        this.parentSubstanceId,
        this.resourceType,
        this.sourceMaterialType,
        this.text,
        this.parentSubstanceName,
        this.developmentStage,
        this.organismId,
        this.sourceMaterialClass,
        this.modifierExtension,
        value,
        this.sourceMaterialState,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSourceMaterial#sourceMaterialState() sourceMaterialState} attribute.
   * @param value The value for sourceMaterialState
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSourceMaterial withSourceMaterialState(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "sourceMaterialState");
    if (this.sourceMaterialState == newValue) return this;
    return new ImmutableSubstanceSourceMaterial(
        this.organismName,
        this.id,
        this.organism,
        this.partDescription,
        this.implicitRules,
        this.contained,
        this.meta,
        this.fractionDescription,
        this.countryOfOrigin,
        this.extension,
        this.parentSubstanceId,
        this.resourceType,
        this.sourceMaterialType,
        this.text,
        this.parentSubstanceName,
        this.developmentStage,
        this.organismId,
        this.sourceMaterialClass,
        this.modifierExtension,
        this.geographicalLocation,
        newValue,
        this.language);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSourceMaterial#sourceMaterialState() sourceMaterialState} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for sourceMaterialState
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSourceMaterial withSourceMaterialState(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.sourceMaterialState == value) return this;
    return new ImmutableSubstanceSourceMaterial(
        this.organismName,
        this.id,
        this.organism,
        this.partDescription,
        this.implicitRules,
        this.contained,
        this.meta,
        this.fractionDescription,
        this.countryOfOrigin,
        this.extension,
        this.parentSubstanceId,
        this.resourceType,
        this.sourceMaterialType,
        this.text,
        this.parentSubstanceName,
        this.developmentStage,
        this.organismId,
        this.sourceMaterialClass,
        this.modifierExtension,
        this.geographicalLocation,
        value,
        this.language);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSourceMaterial#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSourceMaterial withLanguage(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableSubstanceSourceMaterial(
        this.organismName,
        this.id,
        this.organism,
        this.partDescription,
        this.implicitRules,
        this.contained,
        this.meta,
        this.fractionDescription,
        this.countryOfOrigin,
        this.extension,
        this.parentSubstanceId,
        this.resourceType,
        this.sourceMaterialType,
        this.text,
        this.parentSubstanceName,
        this.developmentStage,
        this.organismId,
        this.sourceMaterialClass,
        this.modifierExtension,
        this.geographicalLocation,
        this.sourceMaterialState,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSourceMaterial#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSourceMaterial withLanguage(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableSubstanceSourceMaterial(
        this.organismName,
        this.id,
        this.organism,
        this.partDescription,
        this.implicitRules,
        this.contained,
        this.meta,
        this.fractionDescription,
        this.countryOfOrigin,
        this.extension,
        this.parentSubstanceId,
        this.resourceType,
        this.sourceMaterialType,
        this.text,
        this.parentSubstanceName,
        this.developmentStage,
        this.organismId,
        this.sourceMaterialClass,
        this.modifierExtension,
        this.geographicalLocation,
        this.sourceMaterialState,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableSubstanceSourceMaterial} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableSubstanceSourceMaterial
        && equalTo((ImmutableSubstanceSourceMaterial) another);
  }

  private boolean equalTo(ImmutableSubstanceSourceMaterial another) {
    return Objects.equals(organismName, another.organismName)
        && Objects.equals(id, another.id)
        && Objects.equals(organism, another.organism)
        && Objects.equals(partDescription, another.partDescription)
        && Objects.equals(implicitRules, another.implicitRules)
        && Objects.equals(contained, another.contained)
        && Objects.equals(meta, another.meta)
        && Objects.equals(fractionDescription, another.fractionDescription)
        && Objects.equals(countryOfOrigin, another.countryOfOrigin)
        && Objects.equals(extension, another.extension)
        && Objects.equals(parentSubstanceId, another.parentSubstanceId)
        && resourceType.equals(another.resourceType)
        && Objects.equals(sourceMaterialType, another.sourceMaterialType)
        && Objects.equals(text, another.text)
        && Objects.equals(parentSubstanceName, another.parentSubstanceName)
        && Objects.equals(developmentStage, another.developmentStage)
        && Objects.equals(organismId, another.organismId)
        && Objects.equals(sourceMaterialClass, another.sourceMaterialClass)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(geographicalLocation, another.geographicalLocation)
        && Objects.equals(sourceMaterialState, another.sourceMaterialState)
        && Objects.equals(language, another.language);
  }

  /**
   * Computes a hash code from attributes: {@code organismName}, {@code id}, {@code organism}, {@code partDescription}, {@code implicitRules}, {@code contained}, {@code meta}, {@code fractionDescription}, {@code countryOfOrigin}, {@code extension}, {@code parentSubstanceId}, {@code resourceType}, {@code sourceMaterialType}, {@code text}, {@code parentSubstanceName}, {@code developmentStage}, {@code organismId}, {@code sourceMaterialClass}, {@code modifierExtension}, {@code geographicalLocation}, {@code sourceMaterialState}, {@code language}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(organismName);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(organism);
    h += (h << 5) + Objects.hashCode(partDescription);
    h += (h << 5) + Objects.hashCode(implicitRules);
    h += (h << 5) + Objects.hashCode(contained);
    h += (h << 5) + Objects.hashCode(meta);
    h += (h << 5) + Objects.hashCode(fractionDescription);
    h += (h << 5) + Objects.hashCode(countryOfOrigin);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(parentSubstanceId);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + Objects.hashCode(sourceMaterialType);
    h += (h << 5) + Objects.hashCode(text);
    h += (h << 5) + Objects.hashCode(parentSubstanceName);
    h += (h << 5) + Objects.hashCode(developmentStage);
    h += (h << 5) + Objects.hashCode(organismId);
    h += (h << 5) + Objects.hashCode(sourceMaterialClass);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(geographicalLocation);
    h += (h << 5) + Objects.hashCode(sourceMaterialState);
    h += (h << 5) + Objects.hashCode(language);
    return h;
  }

  /**
   * Prints the immutable value {@code SubstanceSourceMaterial} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("SubstanceSourceMaterial{");
    if (organismName != null) {
      builder.append("organismName=").append(organismName);
    }
    if (id != null) {
      if (builder.length() > 24) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (organism != null) {
      if (builder.length() > 24) builder.append(", ");
      builder.append("organism=").append(organism);
    }
    if (partDescription != null) {
      if (builder.length() > 24) builder.append(", ");
      builder.append("partDescription=").append(partDescription);
    }
    if (implicitRules != null) {
      if (builder.length() > 24) builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (contained != null) {
      if (builder.length() > 24) builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (meta != null) {
      if (builder.length() > 24) builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (fractionDescription != null) {
      if (builder.length() > 24) builder.append(", ");
      builder.append("fractionDescription=").append(fractionDescription);
    }
    if (countryOfOrigin != null) {
      if (builder.length() > 24) builder.append(", ");
      builder.append("countryOfOrigin=").append(countryOfOrigin);
    }
    if (extension != null) {
      if (builder.length() > 24) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (parentSubstanceId != null) {
      if (builder.length() > 24) builder.append(", ");
      builder.append("parentSubstanceId=").append(parentSubstanceId);
    }
    if (builder.length() > 24) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (sourceMaterialType != null) {
      builder.append(", ");
      builder.append("sourceMaterialType=").append(sourceMaterialType);
    }
    if (text != null) {
      builder.append(", ");
      builder.append("text=").append(text);
    }
    if (parentSubstanceName != null) {
      builder.append(", ");
      builder.append("parentSubstanceName=").append(parentSubstanceName);
    }
    if (developmentStage != null) {
      builder.append(", ");
      builder.append("developmentStage=").append(developmentStage);
    }
    if (organismId != null) {
      builder.append(", ");
      builder.append("organismId=").append(organismId);
    }
    if (sourceMaterialClass != null) {
      builder.append(", ");
      builder.append("sourceMaterialClass=").append(sourceMaterialClass);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (geographicalLocation != null) {
      builder.append(", ");
      builder.append("geographicalLocation=").append(geographicalLocation);
    }
    if (sourceMaterialState != null) {
      builder.append(", ");
      builder.append("sourceMaterialState=").append(sourceMaterialState);
    }
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "SubstanceSourceMaterial", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements SubstanceSourceMaterial {
    @Nullable Optional<String> organismName = Optional.empty();
    boolean organismNameIsSet;
    @Nullable Optional<Id> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<SubstanceSourceMaterial_Organism> organism = Optional.empty();
    boolean organismIsSet;
    @Nullable Optional<List<SubstanceSourceMaterial_PartDescription>> partDescription = Optional.empty();
    boolean partDescriptionIsSet;
    @Nullable Optional<Uri> implicitRules = Optional.empty();
    boolean implicitRulesIsSet;
    @Nullable Optional<List<ResourceList>> contained = Optional.empty();
    boolean containedIsSet;
    @Nullable Optional<Meta> meta = Optional.empty();
    boolean metaIsSet;
    @Nullable Optional<List<SubstanceSourceMaterial_FractionDescription>> fractionDescription = Optional.empty();
    boolean fractionDescriptionIsSet;
    @Nullable Optional<List<CodeableConcept>> countryOfOrigin = Optional.empty();
    boolean countryOfOriginIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<List<Identifier>> parentSubstanceId = Optional.empty();
    boolean parentSubstanceIdIsSet;
    @Nullable String resourceType;
    @Nullable Optional<CodeableConcept> sourceMaterialType = Optional.empty();
    boolean sourceMaterialTypeIsSet;
    @Nullable Optional<Narrative> text = Optional.empty();
    boolean textIsSet;
    @Nullable Optional<List<String>> parentSubstanceName = Optional.empty();
    boolean parentSubstanceNameIsSet;
    @Nullable Optional<CodeableConcept> developmentStage = Optional.empty();
    boolean developmentStageIsSet;
    @Nullable Optional<Identifier> organismId = Optional.empty();
    boolean organismIdIsSet;
    @Nullable Optional<CodeableConcept> sourceMaterialClass = Optional.empty();
    boolean sourceMaterialClassIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<List<String>> geographicalLocation = Optional.empty();
    boolean geographicalLocationIsSet;
    @Nullable Optional<CodeableConcept> sourceMaterialState = Optional.empty();
    boolean sourceMaterialStateIsSet;
    @Nullable Optional<Code> language = Optional.empty();
    boolean languageIsSet;
    @JsonProperty("organismName")
    public void setOrganismName(Optional<String> organismName) {
      this.organismName = organismName;
      this.organismNameIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<Id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("organism")
    public void setOrganism(Optional<SubstanceSourceMaterial_Organism> organism) {
      this.organism = organism;
      this.organismIsSet = true;
    }
    @JsonProperty("partDescription")
    public void setPartDescription(Optional<List<SubstanceSourceMaterial_PartDescription>> partDescription) {
      this.partDescription = partDescription;
      this.partDescriptionIsSet = true;
    }
    @JsonProperty("implicitRules")
    public void setImplicitRules(Optional<Uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @JsonProperty("contained")
    public void setContained(Optional<List<ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @JsonProperty("meta")
    public void setMeta(Optional<Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @JsonProperty("fractionDescription")
    public void setFractionDescription(Optional<List<SubstanceSourceMaterial_FractionDescription>> fractionDescription) {
      this.fractionDescription = fractionDescription;
      this.fractionDescriptionIsSet = true;
    }
    @JsonProperty("countryOfOrigin")
    public void setCountryOfOrigin(Optional<List<CodeableConcept>> countryOfOrigin) {
      this.countryOfOrigin = countryOfOrigin;
      this.countryOfOriginIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("parentSubstanceId")
    public void setParentSubstanceId(Optional<List<Identifier>> parentSubstanceId) {
      this.parentSubstanceId = parentSubstanceId;
      this.parentSubstanceIdIsSet = true;
    }
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
      this.resourceType = resourceType;
    }
    @JsonProperty("sourceMaterialType")
    public void setSourceMaterialType(Optional<CodeableConcept> sourceMaterialType) {
      this.sourceMaterialType = sourceMaterialType;
      this.sourceMaterialTypeIsSet = true;
    }
    @JsonProperty("text")
    public void setText(Optional<Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @JsonProperty("parentSubstanceName")
    public void setParentSubstanceName(Optional<List<String>> parentSubstanceName) {
      this.parentSubstanceName = parentSubstanceName;
      this.parentSubstanceNameIsSet = true;
    }
    @JsonProperty("developmentStage")
    public void setDevelopmentStage(Optional<CodeableConcept> developmentStage) {
      this.developmentStage = developmentStage;
      this.developmentStageIsSet = true;
    }
    @JsonProperty("organismId")
    public void setOrganismId(Optional<Identifier> organismId) {
      this.organismId = organismId;
      this.organismIdIsSet = true;
    }
    @JsonProperty("sourceMaterialClass")
    public void setSourceMaterialClass(Optional<CodeableConcept> sourceMaterialClass) {
      this.sourceMaterialClass = sourceMaterialClass;
      this.sourceMaterialClassIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("geographicalLocation")
    public void setGeographicalLocation(Optional<List<String>> geographicalLocation) {
      this.geographicalLocation = geographicalLocation;
      this.geographicalLocationIsSet = true;
    }
    @JsonProperty("sourceMaterialState")
    public void setSourceMaterialState(Optional<CodeableConcept> sourceMaterialState) {
      this.sourceMaterialState = sourceMaterialState;
      this.sourceMaterialStateIsSet = true;
    }
    @JsonProperty("language")
    public void setLanguage(Optional<Code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @Override
    public Optional<String> organismName() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<SubstanceSourceMaterial_Organism> organism() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<SubstanceSourceMaterial_PartDescription>> partDescription() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<SubstanceSourceMaterial_FractionDescription>> fractionDescription() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> countryOfOrigin() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Identifier>> parentSubstanceId() { throw new UnsupportedOperationException(); }
    @Override
    public String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> sourceMaterialType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<String>> parentSubstanceName() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> developmentStage() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Identifier> organismId() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> sourceMaterialClass() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<String>> geographicalLocation() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> sourceMaterialState() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> language() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableSubstanceSourceMaterial fromJson(Json json) {
    ImmutableSubstanceSourceMaterial.Builder builder = ((ImmutableSubstanceSourceMaterial.Builder) ImmutableSubstanceSourceMaterial.builder());
    if (json.organismNameIsSet) {
      builder.organismName(json.organismName);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.organismIsSet) {
      builder.organism(json.organism);
    }
    if (json.partDescriptionIsSet) {
      builder.partDescription(json.partDescription);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.fractionDescriptionIsSet) {
      builder.fractionDescription(json.fractionDescription);
    }
    if (json.countryOfOriginIsSet) {
      builder.countryOfOrigin(json.countryOfOrigin);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.parentSubstanceIdIsSet) {
      builder.parentSubstanceId(json.parentSubstanceId);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.sourceMaterialTypeIsSet) {
      builder.sourceMaterialType(json.sourceMaterialType);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.parentSubstanceNameIsSet) {
      builder.parentSubstanceName(json.parentSubstanceName);
    }
    if (json.developmentStageIsSet) {
      builder.developmentStage(json.developmentStage);
    }
    if (json.organismIdIsSet) {
      builder.organismId(json.organismId);
    }
    if (json.sourceMaterialClassIsSet) {
      builder.sourceMaterialClass(json.sourceMaterialClass);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.geographicalLocationIsSet) {
      builder.geographicalLocation(json.geographicalLocation);
    }
    if (json.sourceMaterialStateIsSet) {
      builder.sourceMaterialState(json.sourceMaterialState);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    return (ImmutableSubstanceSourceMaterial) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link SubstanceSourceMaterial} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable SubstanceSourceMaterial instance
   */
  public static SubstanceSourceMaterial copyOf(SubstanceSourceMaterial instance) {
    if (instance instanceof ImmutableSubstanceSourceMaterial) {
      return (ImmutableSubstanceSourceMaterial) instance;
    }
    return ((ImmutableSubstanceSourceMaterial.Builder) ImmutableSubstanceSourceMaterial.builder())
        .organismName(instance.organismName())
        .id(instance.id())
        .organism(instance.organism())
        .partDescription(instance.partDescription())
        .implicitRules(instance.implicitRules())
        .contained(instance.contained())
        .meta(instance.meta())
        .fractionDescription(instance.fractionDescription())
        .countryOfOrigin(instance.countryOfOrigin())
        .extension(instance.extension())
        .parentSubstanceId(instance.parentSubstanceId())
        .resourceType(instance.resourceType())
        .sourceMaterialType(instance.sourceMaterialType())
        .text(instance.text())
        .parentSubstanceName(instance.parentSubstanceName())
        .developmentStage(instance.developmentStage())
        .organismId(instance.organismId())
        .sourceMaterialClass(instance.sourceMaterialClass())
        .modifierExtension(instance.modifierExtension())
        .geographicalLocation(instance.geographicalLocation())
        .sourceMaterialState(instance.sourceMaterialState())
        .language(instance.language())
        .build();
  }

  /**
   * Creates a builder for {@link SubstanceSourceMaterial SubstanceSourceMaterial}.
   * <pre>
   * ImmutableSubstanceSourceMaterial.builder()
   *    .organismName(String) // optional {@link SubstanceSourceMaterial#organismName() organismName}
   *    .id(com.medplum.types.fhir.Id) // optional {@link SubstanceSourceMaterial#id() id}
   *    .organism(com.medplum.types.fhir.SubstanceSourceMaterial_Organism) // optional {@link SubstanceSourceMaterial#organism() organism}
   *    .partDescription(List&amp;lt;com.medplum.types.fhir.SubstanceSourceMaterial_PartDescription&amp;gt;) // optional {@link SubstanceSourceMaterial#partDescription() partDescription}
   *    .implicitRules(com.medplum.types.fhir.Uri) // optional {@link SubstanceSourceMaterial#implicitRules() implicitRules}
   *    .contained(List&amp;lt;com.medplum.types.fhir.ResourceList&amp;gt;) // optional {@link SubstanceSourceMaterial#contained() contained}
   *    .meta(com.medplum.types.fhir.Meta) // optional {@link SubstanceSourceMaterial#meta() meta}
   *    .fractionDescription(List&amp;lt;com.medplum.types.fhir.SubstanceSourceMaterial_FractionDescription&amp;gt;) // optional {@link SubstanceSourceMaterial#fractionDescription() fractionDescription}
   *    .countryOfOrigin(List&amp;lt;com.medplum.types.fhir.CodeableConcept&amp;gt;) // optional {@link SubstanceSourceMaterial#countryOfOrigin() countryOfOrigin}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link SubstanceSourceMaterial#extension() extension}
   *    .parentSubstanceId(List&amp;lt;com.medplum.types.fhir.Identifier&amp;gt;) // optional {@link SubstanceSourceMaterial#parentSubstanceId() parentSubstanceId}
   *    .resourceType(String) // required {@link SubstanceSourceMaterial#resourceType() resourceType}
   *    .sourceMaterialType(com.medplum.types.fhir.CodeableConcept) // optional {@link SubstanceSourceMaterial#sourceMaterialType() sourceMaterialType}
   *    .text(com.medplum.types.fhir.Narrative) // optional {@link SubstanceSourceMaterial#text() text}
   *    .parentSubstanceName(List&amp;lt;String&amp;gt;) // optional {@link SubstanceSourceMaterial#parentSubstanceName() parentSubstanceName}
   *    .developmentStage(com.medplum.types.fhir.CodeableConcept) // optional {@link SubstanceSourceMaterial#developmentStage() developmentStage}
   *    .organismId(com.medplum.types.fhir.Identifier) // optional {@link SubstanceSourceMaterial#organismId() organismId}
   *    .sourceMaterialClass(com.medplum.types.fhir.CodeableConcept) // optional {@link SubstanceSourceMaterial#sourceMaterialClass() sourceMaterialClass}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link SubstanceSourceMaterial#modifierExtension() modifierExtension}
   *    .geographicalLocation(List&amp;lt;String&amp;gt;) // optional {@link SubstanceSourceMaterial#geographicalLocation() geographicalLocation}
   *    .sourceMaterialState(com.medplum.types.fhir.CodeableConcept) // optional {@link SubstanceSourceMaterial#sourceMaterialState() sourceMaterialState}
   *    .language(com.medplum.types.fhir.Code) // optional {@link SubstanceSourceMaterial#language() language}
   *    .build();
   * </pre>
   * @return A new SubstanceSourceMaterial builder
   */
  public static ResourceTypeBuildStage builder() {
    return new ImmutableSubstanceSourceMaterial.Builder();
  }

  /**
   * Builds instances of type {@link SubstanceSourceMaterial SubstanceSourceMaterial}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "SubstanceSourceMaterial", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long OPT_BIT_ORGANISM_NAME = 0x1L;
    private static final long OPT_BIT_ID = 0x2L;
    private static final long OPT_BIT_ORGANISM = 0x4L;
    private static final long OPT_BIT_PART_DESCRIPTION = 0x8L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x10L;
    private static final long OPT_BIT_CONTAINED = 0x20L;
    private static final long OPT_BIT_META = 0x40L;
    private static final long OPT_BIT_FRACTION_DESCRIPTION = 0x80L;
    private static final long OPT_BIT_COUNTRY_OF_ORIGIN = 0x100L;
    private static final long OPT_BIT_EXTENSION = 0x200L;
    private static final long OPT_BIT_PARENT_SUBSTANCE_ID = 0x400L;
    private static final long OPT_BIT_SOURCE_MATERIAL_TYPE = 0x800L;
    private static final long OPT_BIT_TEXT = 0x1000L;
    private static final long OPT_BIT_PARENT_SUBSTANCE_NAME = 0x2000L;
    private static final long OPT_BIT_DEVELOPMENT_STAGE = 0x4000L;
    private static final long OPT_BIT_ORGANISM_ID = 0x8000L;
    private static final long OPT_BIT_SOURCE_MATERIAL_CLASS = 0x10000L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x20000L;
    private static final long OPT_BIT_GEOGRAPHICAL_LOCATION = 0x40000L;
    private static final long OPT_BIT_SOURCE_MATERIAL_STATE = 0x80000L;
    private static final long OPT_BIT_LANGUAGE = 0x100000L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable String organismName;
    private @Nullable Id id;
    private @Nullable SubstanceSourceMaterial_Organism organism;
    private @Nullable List<SubstanceSourceMaterial_PartDescription> partDescription;
    private @Nullable Uri implicitRules;
    private @Nullable List<ResourceList> contained;
    private @Nullable Meta meta;
    private @Nullable List<SubstanceSourceMaterial_FractionDescription> fractionDescription;
    private @Nullable List<CodeableConcept> countryOfOrigin;
    private @Nullable List<Extension> extension;
    private @Nullable List<Identifier> parentSubstanceId;
    private @Nullable String resourceType;
    private @Nullable CodeableConcept sourceMaterialType;
    private @Nullable Narrative text;
    private @Nullable List<String> parentSubstanceName;
    private @Nullable CodeableConcept developmentStage;
    private @Nullable Identifier organismId;
    private @Nullable CodeableConcept sourceMaterialClass;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable List<String> geographicalLocation;
    private @Nullable CodeableConcept sourceMaterialState;
    private @Nullable Code language;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial#organismName() organismName} to organismName.
     * @param organismName The value for organismName
     * @return {@code this} builder for chained invocation
     */
    public final Builder organismName(String organismName) {
      checkNotIsSet(organismNameIsSet(), "organismName");
      this.organismName = Objects.requireNonNull(organismName, "organismName");
      optBits |= OPT_BIT_ORGANISM_NAME;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial#organismName() organismName} to organismName.
     * @param organismName The value for organismName
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("organismName")
    public final Builder organismName(Optional<String> organismName) {
      checkNotIsSet(organismNameIsSet(), "organismName");
      this.organismName = organismName.orElse(null);
      optBits |= OPT_BIT_ORGANISM_NAME;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    public final Builder id(Id id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = Objects.requireNonNull(id, "id");
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("id")
    public final Builder id(Optional<? extends Id> id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = id.orElse(null);
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial#organism() organism} to organism.
     * @param organism The value for organism
     * @return {@code this} builder for chained invocation
     */
    public final Builder organism(SubstanceSourceMaterial_Organism organism) {
      checkNotIsSet(organismIsSet(), "organism");
      this.organism = Objects.requireNonNull(organism, "organism");
      optBits |= OPT_BIT_ORGANISM;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial#organism() organism} to organism.
     * @param organism The value for organism
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("organism")
    public final Builder organism(Optional<? extends SubstanceSourceMaterial_Organism> organism) {
      checkNotIsSet(organismIsSet(), "organism");
      this.organism = organism.orElse(null);
      optBits |= OPT_BIT_ORGANISM;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial#partDescription() partDescription} to partDescription.
     * @param partDescription The value for partDescription
     * @return {@code this} builder for chained invocation
     */
    public final Builder partDescription(List<SubstanceSourceMaterial_PartDescription> partDescription) {
      checkNotIsSet(partDescriptionIsSet(), "partDescription");
      this.partDescription = Objects.requireNonNull(partDescription, "partDescription");
      optBits |= OPT_BIT_PART_DESCRIPTION;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial#partDescription() partDescription} to partDescription.
     * @param partDescription The value for partDescription
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("partDescription")
    public final Builder partDescription(Optional<? extends List<SubstanceSourceMaterial_PartDescription>> partDescription) {
      checkNotIsSet(partDescriptionIsSet(), "partDescription");
      this.partDescription = partDescription.orElse(null);
      optBits |= OPT_BIT_PART_DESCRIPTION;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    public final Builder implicitRules(Uri implicitRules) {
      checkNotIsSet(implicitRulesIsSet(), "implicitRules");
      this.implicitRules = Objects.requireNonNull(implicitRules, "implicitRules");
      optBits |= OPT_BIT_IMPLICIT_RULES;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("implicitRules")
    public final Builder implicitRules(Optional<? extends Uri> implicitRules) {
      checkNotIsSet(implicitRulesIsSet(), "implicitRules");
      this.implicitRules = implicitRules.orElse(null);
      optBits |= OPT_BIT_IMPLICIT_RULES;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    public final Builder contained(List<ResourceList> contained) {
      checkNotIsSet(containedIsSet(), "contained");
      this.contained = Objects.requireNonNull(contained, "contained");
      optBits |= OPT_BIT_CONTAINED;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("contained")
    public final Builder contained(Optional<? extends List<ResourceList>> contained) {
      checkNotIsSet(containedIsSet(), "contained");
      this.contained = contained.orElse(null);
      optBits |= OPT_BIT_CONTAINED;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    public final Builder meta(Meta meta) {
      checkNotIsSet(metaIsSet(), "meta");
      this.meta = Objects.requireNonNull(meta, "meta");
      optBits |= OPT_BIT_META;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("meta")
    public final Builder meta(Optional<? extends Meta> meta) {
      checkNotIsSet(metaIsSet(), "meta");
      this.meta = meta.orElse(null);
      optBits |= OPT_BIT_META;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial#fractionDescription() fractionDescription} to fractionDescription.
     * @param fractionDescription The value for fractionDescription
     * @return {@code this} builder for chained invocation
     */
    public final Builder fractionDescription(List<SubstanceSourceMaterial_FractionDescription> fractionDescription) {
      checkNotIsSet(fractionDescriptionIsSet(), "fractionDescription");
      this.fractionDescription = Objects.requireNonNull(fractionDescription, "fractionDescription");
      optBits |= OPT_BIT_FRACTION_DESCRIPTION;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial#fractionDescription() fractionDescription} to fractionDescription.
     * @param fractionDescription The value for fractionDescription
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("fractionDescription")
    public final Builder fractionDescription(Optional<? extends List<SubstanceSourceMaterial_FractionDescription>> fractionDescription) {
      checkNotIsSet(fractionDescriptionIsSet(), "fractionDescription");
      this.fractionDescription = fractionDescription.orElse(null);
      optBits |= OPT_BIT_FRACTION_DESCRIPTION;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial#countryOfOrigin() countryOfOrigin} to countryOfOrigin.
     * @param countryOfOrigin The value for countryOfOrigin
     * @return {@code this} builder for chained invocation
     */
    public final Builder countryOfOrigin(List<CodeableConcept> countryOfOrigin) {
      checkNotIsSet(countryOfOriginIsSet(), "countryOfOrigin");
      this.countryOfOrigin = Objects.requireNonNull(countryOfOrigin, "countryOfOrigin");
      optBits |= OPT_BIT_COUNTRY_OF_ORIGIN;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial#countryOfOrigin() countryOfOrigin} to countryOfOrigin.
     * @param countryOfOrigin The value for countryOfOrigin
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("countryOfOrigin")
    public final Builder countryOfOrigin(Optional<? extends List<CodeableConcept>> countryOfOrigin) {
      checkNotIsSet(countryOfOriginIsSet(), "countryOfOrigin");
      this.countryOfOrigin = countryOfOrigin.orElse(null);
      optBits |= OPT_BIT_COUNTRY_OF_ORIGIN;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial#extension() extension} to extension.
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
     * Initializes the optional value {@link SubstanceSourceMaterial#extension() extension} to extension.
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
     * Initializes the optional value {@link SubstanceSourceMaterial#parentSubstanceId() parentSubstanceId} to parentSubstanceId.
     * @param parentSubstanceId The value for parentSubstanceId
     * @return {@code this} builder for chained invocation
     */
    public final Builder parentSubstanceId(List<Identifier> parentSubstanceId) {
      checkNotIsSet(parentSubstanceIdIsSet(), "parentSubstanceId");
      this.parentSubstanceId = Objects.requireNonNull(parentSubstanceId, "parentSubstanceId");
      optBits |= OPT_BIT_PARENT_SUBSTANCE_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial#parentSubstanceId() parentSubstanceId} to parentSubstanceId.
     * @param parentSubstanceId The value for parentSubstanceId
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("parentSubstanceId")
    public final Builder parentSubstanceId(Optional<? extends List<Identifier>> parentSubstanceId) {
      checkNotIsSet(parentSubstanceIdIsSet(), "parentSubstanceId");
      this.parentSubstanceId = parentSubstanceId.orElse(null);
      optBits |= OPT_BIT_PARENT_SUBSTANCE_ID;
      return this;
    }

    /**
     * Initializes the value for the {@link SubstanceSourceMaterial#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("resourceType")
    public final Builder resourceType(String resourceType) {
      checkNotIsSet(resourceTypeIsSet(), "resourceType");
      this.resourceType = Objects.requireNonNull(resourceType, "resourceType");
      initBits &= ~INIT_BIT_RESOURCE_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial#sourceMaterialType() sourceMaterialType} to sourceMaterialType.
     * @param sourceMaterialType The value for sourceMaterialType
     * @return {@code this} builder for chained invocation
     */
    public final Builder sourceMaterialType(CodeableConcept sourceMaterialType) {
      checkNotIsSet(sourceMaterialTypeIsSet(), "sourceMaterialType");
      this.sourceMaterialType = Objects.requireNonNull(sourceMaterialType, "sourceMaterialType");
      optBits |= OPT_BIT_SOURCE_MATERIAL_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial#sourceMaterialType() sourceMaterialType} to sourceMaterialType.
     * @param sourceMaterialType The value for sourceMaterialType
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("sourceMaterialType")
    public final Builder sourceMaterialType(Optional<? extends CodeableConcept> sourceMaterialType) {
      checkNotIsSet(sourceMaterialTypeIsSet(), "sourceMaterialType");
      this.sourceMaterialType = sourceMaterialType.orElse(null);
      optBits |= OPT_BIT_SOURCE_MATERIAL_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    public final Builder text(Narrative text) {
      checkNotIsSet(textIsSet(), "text");
      this.text = Objects.requireNonNull(text, "text");
      optBits |= OPT_BIT_TEXT;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("text")
    public final Builder text(Optional<? extends Narrative> text) {
      checkNotIsSet(textIsSet(), "text");
      this.text = text.orElse(null);
      optBits |= OPT_BIT_TEXT;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial#parentSubstanceName() parentSubstanceName} to parentSubstanceName.
     * @param parentSubstanceName The value for parentSubstanceName
     * @return {@code this} builder for chained invocation
     */
    public final Builder parentSubstanceName(List<String> parentSubstanceName) {
      checkNotIsSet(parentSubstanceNameIsSet(), "parentSubstanceName");
      this.parentSubstanceName = Objects.requireNonNull(parentSubstanceName, "parentSubstanceName");
      optBits |= OPT_BIT_PARENT_SUBSTANCE_NAME;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial#parentSubstanceName() parentSubstanceName} to parentSubstanceName.
     * @param parentSubstanceName The value for parentSubstanceName
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("parentSubstanceName")
    public final Builder parentSubstanceName(Optional<? extends List<String>> parentSubstanceName) {
      checkNotIsSet(parentSubstanceNameIsSet(), "parentSubstanceName");
      this.parentSubstanceName = parentSubstanceName.orElse(null);
      optBits |= OPT_BIT_PARENT_SUBSTANCE_NAME;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial#developmentStage() developmentStage} to developmentStage.
     * @param developmentStage The value for developmentStage
     * @return {@code this} builder for chained invocation
     */
    public final Builder developmentStage(CodeableConcept developmentStage) {
      checkNotIsSet(developmentStageIsSet(), "developmentStage");
      this.developmentStage = Objects.requireNonNull(developmentStage, "developmentStage");
      optBits |= OPT_BIT_DEVELOPMENT_STAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial#developmentStage() developmentStage} to developmentStage.
     * @param developmentStage The value for developmentStage
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("developmentStage")
    public final Builder developmentStage(Optional<? extends CodeableConcept> developmentStage) {
      checkNotIsSet(developmentStageIsSet(), "developmentStage");
      this.developmentStage = developmentStage.orElse(null);
      optBits |= OPT_BIT_DEVELOPMENT_STAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial#organismId() organismId} to organismId.
     * @param organismId The value for organismId
     * @return {@code this} builder for chained invocation
     */
    public final Builder organismId(Identifier organismId) {
      checkNotIsSet(organismIdIsSet(), "organismId");
      this.organismId = Objects.requireNonNull(organismId, "organismId");
      optBits |= OPT_BIT_ORGANISM_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial#organismId() organismId} to organismId.
     * @param organismId The value for organismId
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("organismId")
    public final Builder organismId(Optional<? extends Identifier> organismId) {
      checkNotIsSet(organismIdIsSet(), "organismId");
      this.organismId = organismId.orElse(null);
      optBits |= OPT_BIT_ORGANISM_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial#sourceMaterialClass() sourceMaterialClass} to sourceMaterialClass.
     * @param sourceMaterialClass The value for sourceMaterialClass
     * @return {@code this} builder for chained invocation
     */
    public final Builder sourceMaterialClass(CodeableConcept sourceMaterialClass) {
      checkNotIsSet(sourceMaterialClassIsSet(), "sourceMaterialClass");
      this.sourceMaterialClass = Objects.requireNonNull(sourceMaterialClass, "sourceMaterialClass");
      optBits |= OPT_BIT_SOURCE_MATERIAL_CLASS;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial#sourceMaterialClass() sourceMaterialClass} to sourceMaterialClass.
     * @param sourceMaterialClass The value for sourceMaterialClass
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("sourceMaterialClass")
    public final Builder sourceMaterialClass(Optional<? extends CodeableConcept> sourceMaterialClass) {
      checkNotIsSet(sourceMaterialClassIsSet(), "sourceMaterialClass");
      this.sourceMaterialClass = sourceMaterialClass.orElse(null);
      optBits |= OPT_BIT_SOURCE_MATERIAL_CLASS;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link SubstanceSourceMaterial#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link SubstanceSourceMaterial#geographicalLocation() geographicalLocation} to geographicalLocation.
     * @param geographicalLocation The value for geographicalLocation
     * @return {@code this} builder for chained invocation
     */
    public final Builder geographicalLocation(List<String> geographicalLocation) {
      checkNotIsSet(geographicalLocationIsSet(), "geographicalLocation");
      this.geographicalLocation = Objects.requireNonNull(geographicalLocation, "geographicalLocation");
      optBits |= OPT_BIT_GEOGRAPHICAL_LOCATION;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial#geographicalLocation() geographicalLocation} to geographicalLocation.
     * @param geographicalLocation The value for geographicalLocation
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("geographicalLocation")
    public final Builder geographicalLocation(Optional<? extends List<String>> geographicalLocation) {
      checkNotIsSet(geographicalLocationIsSet(), "geographicalLocation");
      this.geographicalLocation = geographicalLocation.orElse(null);
      optBits |= OPT_BIT_GEOGRAPHICAL_LOCATION;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial#sourceMaterialState() sourceMaterialState} to sourceMaterialState.
     * @param sourceMaterialState The value for sourceMaterialState
     * @return {@code this} builder for chained invocation
     */
    public final Builder sourceMaterialState(CodeableConcept sourceMaterialState) {
      checkNotIsSet(sourceMaterialStateIsSet(), "sourceMaterialState");
      this.sourceMaterialState = Objects.requireNonNull(sourceMaterialState, "sourceMaterialState");
      optBits |= OPT_BIT_SOURCE_MATERIAL_STATE;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial#sourceMaterialState() sourceMaterialState} to sourceMaterialState.
     * @param sourceMaterialState The value for sourceMaterialState
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("sourceMaterialState")
    public final Builder sourceMaterialState(Optional<? extends CodeableConcept> sourceMaterialState) {
      checkNotIsSet(sourceMaterialStateIsSet(), "sourceMaterialState");
      this.sourceMaterialState = sourceMaterialState.orElse(null);
      optBits |= OPT_BIT_SOURCE_MATERIAL_STATE;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    public final Builder language(Code language) {
      checkNotIsSet(languageIsSet(), "language");
      this.language = Objects.requireNonNull(language, "language");
      optBits |= OPT_BIT_LANGUAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("language")
    public final Builder language(Optional<? extends Code> language) {
      checkNotIsSet(languageIsSet(), "language");
      this.language = language.orElse(null);
      optBits |= OPT_BIT_LANGUAGE;
      return this;
    }

    /**
     * Builds a new {@link SubstanceSourceMaterial SubstanceSourceMaterial}.
     * @return An immutable instance of SubstanceSourceMaterial
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public SubstanceSourceMaterial build() {
      checkRequiredAttributes();
      return new ImmutableSubstanceSourceMaterial(
          organismName,
          id,
          organism,
          partDescription,
          implicitRules,
          contained,
          meta,
          fractionDescription,
          countryOfOrigin,
          extension,
          parentSubstanceId,
          resourceType,
          sourceMaterialType,
          text,
          parentSubstanceName,
          developmentStage,
          organismId,
          sourceMaterialClass,
          modifierExtension,
          geographicalLocation,
          sourceMaterialState,
          language);
    }

    private boolean organismNameIsSet() {
      return (optBits & OPT_BIT_ORGANISM_NAME) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean organismIsSet() {
      return (optBits & OPT_BIT_ORGANISM) != 0;
    }

    private boolean partDescriptionIsSet() {
      return (optBits & OPT_BIT_PART_DESCRIPTION) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean fractionDescriptionIsSet() {
      return (optBits & OPT_BIT_FRACTION_DESCRIPTION) != 0;
    }

    private boolean countryOfOriginIsSet() {
      return (optBits & OPT_BIT_COUNTRY_OF_ORIGIN) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean parentSubstanceIdIsSet() {
      return (optBits & OPT_BIT_PARENT_SUBSTANCE_ID) != 0;
    }

    private boolean sourceMaterialTypeIsSet() {
      return (optBits & OPT_BIT_SOURCE_MATERIAL_TYPE) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean parentSubstanceNameIsSet() {
      return (optBits & OPT_BIT_PARENT_SUBSTANCE_NAME) != 0;
    }

    private boolean developmentStageIsSet() {
      return (optBits & OPT_BIT_DEVELOPMENT_STAGE) != 0;
    }

    private boolean organismIdIsSet() {
      return (optBits & OPT_BIT_ORGANISM_ID) != 0;
    }

    private boolean sourceMaterialClassIsSet() {
      return (optBits & OPT_BIT_SOURCE_MATERIAL_CLASS) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean geographicalLocationIsSet() {
      return (optBits & OPT_BIT_GEOGRAPHICAL_LOCATION) != 0;
    }

    private boolean sourceMaterialStateIsSet() {
      return (optBits & OPT_BIT_SOURCE_MATERIAL_STATE) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of SubstanceSourceMaterial is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build SubstanceSourceMaterial, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "SubstanceSourceMaterial", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link SubstanceSourceMaterial#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(String resourceType);
  }

  @Generated(from = "SubstanceSourceMaterial", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial#organismName() organismName} to organismName.
     * @param organismName The value for organismName
     * @return {@code this} builder for chained invocation
     */
    BuildFinal organismName(String organismName);

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial#organismName() organismName} to organismName.
     * @param organismName The value for organismName
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal organismName(Optional<String> organismName);

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(Id id);

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<? extends Id> id);

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial#organism() organism} to organism.
     * @param organism The value for organism
     * @return {@code this} builder for chained invocation
     */
    BuildFinal organism(SubstanceSourceMaterial_Organism organism);

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial#organism() organism} to organism.
     * @param organism The value for organism
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal organism(Optional<? extends SubstanceSourceMaterial_Organism> organism);

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial#partDescription() partDescription} to partDescription.
     * @param partDescription The value for partDescription
     * @return {@code this} builder for chained invocation
     */
    BuildFinal partDescription(List<SubstanceSourceMaterial_PartDescription> partDescription);

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial#partDescription() partDescription} to partDescription.
     * @param partDescription The value for partDescription
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal partDescription(Optional<? extends List<SubstanceSourceMaterial_PartDescription>> partDescription);

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(Uri implicitRules);

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(Optional<? extends Uri> implicitRules);

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(List<ResourceList> contained);

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(Optional<? extends List<ResourceList>> contained);

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(Meta meta);

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(Optional<? extends Meta> meta);

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial#fractionDescription() fractionDescription} to fractionDescription.
     * @param fractionDescription The value for fractionDescription
     * @return {@code this} builder for chained invocation
     */
    BuildFinal fractionDescription(List<SubstanceSourceMaterial_FractionDescription> fractionDescription);

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial#fractionDescription() fractionDescription} to fractionDescription.
     * @param fractionDescription The value for fractionDescription
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal fractionDescription(Optional<? extends List<SubstanceSourceMaterial_FractionDescription>> fractionDescription);

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial#countryOfOrigin() countryOfOrigin} to countryOfOrigin.
     * @param countryOfOrigin The value for countryOfOrigin
     * @return {@code this} builder for chained invocation
     */
    BuildFinal countryOfOrigin(List<CodeableConcept> countryOfOrigin);

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial#countryOfOrigin() countryOfOrigin} to countryOfOrigin.
     * @param countryOfOrigin The value for countryOfOrigin
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal countryOfOrigin(Optional<? extends List<CodeableConcept>> countryOfOrigin);

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial#parentSubstanceId() parentSubstanceId} to parentSubstanceId.
     * @param parentSubstanceId The value for parentSubstanceId
     * @return {@code this} builder for chained invocation
     */
    BuildFinal parentSubstanceId(List<Identifier> parentSubstanceId);

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial#parentSubstanceId() parentSubstanceId} to parentSubstanceId.
     * @param parentSubstanceId The value for parentSubstanceId
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal parentSubstanceId(Optional<? extends List<Identifier>> parentSubstanceId);

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial#sourceMaterialType() sourceMaterialType} to sourceMaterialType.
     * @param sourceMaterialType The value for sourceMaterialType
     * @return {@code this} builder for chained invocation
     */
    BuildFinal sourceMaterialType(CodeableConcept sourceMaterialType);

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial#sourceMaterialType() sourceMaterialType} to sourceMaterialType.
     * @param sourceMaterialType The value for sourceMaterialType
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal sourceMaterialType(Optional<? extends CodeableConcept> sourceMaterialType);

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(Narrative text);

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(Optional<? extends Narrative> text);

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial#parentSubstanceName() parentSubstanceName} to parentSubstanceName.
     * @param parentSubstanceName The value for parentSubstanceName
     * @return {@code this} builder for chained invocation
     */
    BuildFinal parentSubstanceName(List<String> parentSubstanceName);

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial#parentSubstanceName() parentSubstanceName} to parentSubstanceName.
     * @param parentSubstanceName The value for parentSubstanceName
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal parentSubstanceName(Optional<? extends List<String>> parentSubstanceName);

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial#developmentStage() developmentStage} to developmentStage.
     * @param developmentStage The value for developmentStage
     * @return {@code this} builder for chained invocation
     */
    BuildFinal developmentStage(CodeableConcept developmentStage);

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial#developmentStage() developmentStage} to developmentStage.
     * @param developmentStage The value for developmentStage
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal developmentStage(Optional<? extends CodeableConcept> developmentStage);

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial#organismId() organismId} to organismId.
     * @param organismId The value for organismId
     * @return {@code this} builder for chained invocation
     */
    BuildFinal organismId(Identifier organismId);

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial#organismId() organismId} to organismId.
     * @param organismId The value for organismId
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal organismId(Optional<? extends Identifier> organismId);

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial#sourceMaterialClass() sourceMaterialClass} to sourceMaterialClass.
     * @param sourceMaterialClass The value for sourceMaterialClass
     * @return {@code this} builder for chained invocation
     */
    BuildFinal sourceMaterialClass(CodeableConcept sourceMaterialClass);

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial#sourceMaterialClass() sourceMaterialClass} to sourceMaterialClass.
     * @param sourceMaterialClass The value for sourceMaterialClass
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal sourceMaterialClass(Optional<? extends CodeableConcept> sourceMaterialClass);

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial#geographicalLocation() geographicalLocation} to geographicalLocation.
     * @param geographicalLocation The value for geographicalLocation
     * @return {@code this} builder for chained invocation
     */
    BuildFinal geographicalLocation(List<String> geographicalLocation);

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial#geographicalLocation() geographicalLocation} to geographicalLocation.
     * @param geographicalLocation The value for geographicalLocation
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal geographicalLocation(Optional<? extends List<String>> geographicalLocation);

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial#sourceMaterialState() sourceMaterialState} to sourceMaterialState.
     * @param sourceMaterialState The value for sourceMaterialState
     * @return {@code this} builder for chained invocation
     */
    BuildFinal sourceMaterialState(CodeableConcept sourceMaterialState);

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial#sourceMaterialState() sourceMaterialState} to sourceMaterialState.
     * @param sourceMaterialState The value for sourceMaterialState
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal sourceMaterialState(Optional<? extends CodeableConcept> sourceMaterialState);

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(Code language);

    /**
     * Initializes the optional value {@link SubstanceSourceMaterial#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(Optional<? extends Code> language);

    /**
     * Builds a new {@link SubstanceSourceMaterial SubstanceSourceMaterial}.
     * @return An immutable instance of SubstanceSourceMaterial
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    SubstanceSourceMaterial build();
  }
}
