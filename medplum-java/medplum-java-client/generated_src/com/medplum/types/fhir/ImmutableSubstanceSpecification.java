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
 * Immutable implementation of {@link SubstanceSpecification}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableSubstanceSpecification.builder()}.
 */
@Generated(from = "SubstanceSpecification", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableSubstanceSpecification implements SubstanceSpecification {
  private final @Nullable Reference sourceMaterial;
  private final @Nullable List<SubstanceSpecification_Relationship> relationship;
  private final @Nullable Identifier identifier;
  private final @Nullable String comment;
  private final @Nullable List<ResourceList> contained;
  private final @Nullable List<Extension> extension;
  private final @Nullable List<Reference> source;
  private final @Nullable List<SubstanceSpecification_Moiety> moiety;
  private final @Nullable SubstanceSpecification_Structure structure;
  private final @Nullable List<SubstanceSpecification_Code> code;
  private final @Nullable CodeableConcept status;
  private final @Nullable Reference polymer;
  private final @Nullable Reference protein;
  private final @Nullable Narrative text;
  private final @Nullable Meta meta;
  private final @Nullable Id id;
  private final @Nullable CodeableConcept type;
  private final @Nullable List<SubstanceSpecification_MolecularWeight> molecularWeight;
  private final @Nullable Code language;
  private final @Nullable List<SubstanceSpecification_Property> property;
  private final @Nullable Reference nucleicAcid;
  private final @Nullable CodeableConcept domain;
  private final @Nullable Uri implicitRules;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable List<SubstanceSpecification_Name> name;
  private final String resourceType;
  private final @Nullable String description;
  private final @Nullable Reference referenceInformation;

  private ImmutableSubstanceSpecification(
      @Nullable Reference sourceMaterial,
      @Nullable List<SubstanceSpecification_Relationship> relationship,
      @Nullable Identifier identifier,
      @Nullable String comment,
      @Nullable List<ResourceList> contained,
      @Nullable List<Extension> extension,
      @Nullable List<Reference> source,
      @Nullable List<SubstanceSpecification_Moiety> moiety,
      @Nullable SubstanceSpecification_Structure structure,
      @Nullable List<SubstanceSpecification_Code> code,
      @Nullable CodeableConcept status,
      @Nullable Reference polymer,
      @Nullable Reference protein,
      @Nullable Narrative text,
      @Nullable Meta meta,
      @Nullable Id id,
      @Nullable CodeableConcept type,
      @Nullable List<SubstanceSpecification_MolecularWeight> molecularWeight,
      @Nullable Code language,
      @Nullable List<SubstanceSpecification_Property> property,
      @Nullable Reference nucleicAcid,
      @Nullable CodeableConcept domain,
      @Nullable Uri implicitRules,
      @Nullable List<Extension> modifierExtension,
      @Nullable List<SubstanceSpecification_Name> name,
      String resourceType,
      @Nullable String description,
      @Nullable Reference referenceInformation) {
    this.sourceMaterial = sourceMaterial;
    this.relationship = relationship;
    this.identifier = identifier;
    this.comment = comment;
    this.contained = contained;
    this.extension = extension;
    this.source = source;
    this.moiety = moiety;
    this.structure = structure;
    this.code = code;
    this.status = status;
    this.polymer = polymer;
    this.protein = protein;
    this.text = text;
    this.meta = meta;
    this.id = id;
    this.type = type;
    this.molecularWeight = molecularWeight;
    this.language = language;
    this.property = property;
    this.nucleicAcid = nucleicAcid;
    this.domain = domain;
    this.implicitRules = implicitRules;
    this.modifierExtension = modifierExtension;
    this.name = name;
    this.resourceType = resourceType;
    this.description = description;
    this.referenceInformation = referenceInformation;
  }

  /**
   * @return The value of the {@code sourceMaterial} attribute
   */
  @JsonProperty("sourceMaterial")
  @Override
  public Optional<Reference> sourceMaterial() {
    return Optional.ofNullable(sourceMaterial);
  }

  /**
   * @return The value of the {@code relationship} attribute
   */
  @JsonProperty("relationship")
  @Override
  public Optional<List<SubstanceSpecification_Relationship>> relationship() {
    return Optional.ofNullable(relationship);
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
   * @return The value of the {@code comment} attribute
   */
  @JsonProperty("comment")
  @Override
  public Optional<String> comment() {
    return Optional.ofNullable(comment);
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
   * @return The value of the {@code extension} attribute
   */
  @JsonProperty("extension")
  @Override
  public Optional<List<Extension>> extension() {
    return Optional.ofNullable(extension);
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
   * @return The value of the {@code moiety} attribute
   */
  @JsonProperty("moiety")
  @Override
  public Optional<List<SubstanceSpecification_Moiety>> moiety() {
    return Optional.ofNullable(moiety);
  }

  /**
   * @return The value of the {@code structure} attribute
   */
  @JsonProperty("structure")
  @Override
  public Optional<SubstanceSpecification_Structure> structure() {
    return Optional.ofNullable(structure);
  }

  /**
   * @return The value of the {@code code} attribute
   */
  @JsonProperty("code")
  @Override
  public Optional<List<SubstanceSpecification_Code>> code() {
    return Optional.ofNullable(code);
  }

  /**
   * @return The value of the {@code status} attribute
   */
  @JsonProperty("status")
  @Override
  public Optional<CodeableConcept> status() {
    return Optional.ofNullable(status);
  }

  /**
   * @return The value of the {@code polymer} attribute
   */
  @JsonProperty("polymer")
  @Override
  public Optional<Reference> polymer() {
    return Optional.ofNullable(polymer);
  }

  /**
   * @return The value of the {@code protein} attribute
   */
  @JsonProperty("protein")
  @Override
  public Optional<Reference> protein() {
    return Optional.ofNullable(protein);
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
   * @return The value of the {@code meta} attribute
   */
  @JsonProperty("meta")
  @Override
  public Optional<Meta> meta() {
    return Optional.ofNullable(meta);
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
   * @return The value of the {@code type} attribute
   */
  @JsonProperty("type")
  @Override
  public Optional<CodeableConcept> type() {
    return Optional.ofNullable(type);
  }

  /**
   * @return The value of the {@code molecularWeight} attribute
   */
  @JsonProperty("molecularWeight")
  @Override
  public Optional<List<SubstanceSpecification_MolecularWeight>> molecularWeight() {
    return Optional.ofNullable(molecularWeight);
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
   * @return The value of the {@code property} attribute
   */
  @JsonProperty("property")
  @Override
  public Optional<List<SubstanceSpecification_Property>> property() {
    return Optional.ofNullable(property);
  }

  /**
   * @return The value of the {@code nucleicAcid} attribute
   */
  @JsonProperty("nucleicAcid")
  @Override
  public Optional<Reference> nucleicAcid() {
    return Optional.ofNullable(nucleicAcid);
  }

  /**
   * @return The value of the {@code domain} attribute
   */
  @JsonProperty("domain")
  @Override
  public Optional<CodeableConcept> domain() {
    return Optional.ofNullable(domain);
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @JsonProperty("modifierExtension")
  @Override
  public Optional<List<Extension>> modifierExtension() {
    return Optional.ofNullable(modifierExtension);
  }

  /**
   * @return The value of the {@code name} attribute
   */
  @JsonProperty("name")
  @Override
  public Optional<List<SubstanceSpecification_Name>> name() {
    return Optional.ofNullable(name);
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
   * @return The value of the {@code description} attribute
   */
  @JsonProperty("description")
  @Override
  public Optional<String> description() {
    return Optional.ofNullable(description);
  }

  /**
   * @return The value of the {@code referenceInformation} attribute
   */
  @JsonProperty("referenceInformation")
  @Override
  public Optional<Reference> referenceInformation() {
    return Optional.ofNullable(referenceInformation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSpecification#sourceMaterial() sourceMaterial} attribute.
   * @param value The value for sourceMaterial
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification withSourceMaterial(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "sourceMaterial");
    if (this.sourceMaterial == newValue) return this;
    return new ImmutableSubstanceSpecification(
        newValue,
        this.relationship,
        this.identifier,
        this.comment,
        this.contained,
        this.extension,
        this.source,
        this.moiety,
        this.structure,
        this.code,
        this.status,
        this.polymer,
        this.protein,
        this.text,
        this.meta,
        this.id,
        this.type,
        this.molecularWeight,
        this.language,
        this.property,
        this.nucleicAcid,
        this.domain,
        this.implicitRules,
        this.modifierExtension,
        this.name,
        this.resourceType,
        this.description,
        this.referenceInformation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSpecification#sourceMaterial() sourceMaterial} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for sourceMaterial
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSpecification withSourceMaterial(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.sourceMaterial == value) return this;
    return new ImmutableSubstanceSpecification(
        value,
        this.relationship,
        this.identifier,
        this.comment,
        this.contained,
        this.extension,
        this.source,
        this.moiety,
        this.structure,
        this.code,
        this.status,
        this.polymer,
        this.protein,
        this.text,
        this.meta,
        this.id,
        this.type,
        this.molecularWeight,
        this.language,
        this.property,
        this.nucleicAcid,
        this.domain,
        this.implicitRules,
        this.modifierExtension,
        this.name,
        this.resourceType,
        this.description,
        this.referenceInformation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSpecification#relationship() relationship} attribute.
   * @param value The value for relationship
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification withRelationship(List<SubstanceSpecification_Relationship> value) {
    @Nullable List<SubstanceSpecification_Relationship> newValue = Objects.requireNonNull(value, "relationship");
    if (this.relationship == newValue) return this;
    return new ImmutableSubstanceSpecification(
        this.sourceMaterial,
        newValue,
        this.identifier,
        this.comment,
        this.contained,
        this.extension,
        this.source,
        this.moiety,
        this.structure,
        this.code,
        this.status,
        this.polymer,
        this.protein,
        this.text,
        this.meta,
        this.id,
        this.type,
        this.molecularWeight,
        this.language,
        this.property,
        this.nucleicAcid,
        this.domain,
        this.implicitRules,
        this.modifierExtension,
        this.name,
        this.resourceType,
        this.description,
        this.referenceInformation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSpecification#relationship() relationship} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for relationship
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSpecification withRelationship(Optional<? extends List<SubstanceSpecification_Relationship>> optional) {
    @Nullable List<SubstanceSpecification_Relationship> value = optional.orElse(null);
    if (this.relationship == value) return this;
    return new ImmutableSubstanceSpecification(
        this.sourceMaterial,
        value,
        this.identifier,
        this.comment,
        this.contained,
        this.extension,
        this.source,
        this.moiety,
        this.structure,
        this.code,
        this.status,
        this.polymer,
        this.protein,
        this.text,
        this.meta,
        this.id,
        this.type,
        this.molecularWeight,
        this.language,
        this.property,
        this.nucleicAcid,
        this.domain,
        this.implicitRules,
        this.modifierExtension,
        this.name,
        this.resourceType,
        this.description,
        this.referenceInformation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSpecification#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification withIdentifier(Identifier value) {
    @Nullable Identifier newValue = Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableSubstanceSpecification(
        this.sourceMaterial,
        this.relationship,
        newValue,
        this.comment,
        this.contained,
        this.extension,
        this.source,
        this.moiety,
        this.structure,
        this.code,
        this.status,
        this.polymer,
        this.protein,
        this.text,
        this.meta,
        this.id,
        this.type,
        this.molecularWeight,
        this.language,
        this.property,
        this.nucleicAcid,
        this.domain,
        this.implicitRules,
        this.modifierExtension,
        this.name,
        this.resourceType,
        this.description,
        this.referenceInformation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSpecification#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSpecification withIdentifier(Optional<? extends Identifier> optional) {
    @Nullable Identifier value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableSubstanceSpecification(
        this.sourceMaterial,
        this.relationship,
        value,
        this.comment,
        this.contained,
        this.extension,
        this.source,
        this.moiety,
        this.structure,
        this.code,
        this.status,
        this.polymer,
        this.protein,
        this.text,
        this.meta,
        this.id,
        this.type,
        this.molecularWeight,
        this.language,
        this.property,
        this.nucleicAcid,
        this.domain,
        this.implicitRules,
        this.modifierExtension,
        this.name,
        this.resourceType,
        this.description,
        this.referenceInformation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSpecification#comment() comment} attribute.
   * @param value The value for comment
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification withComment(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "comment");
    if (Objects.equals(this.comment, newValue)) return this;
    return new ImmutableSubstanceSpecification(
        this.sourceMaterial,
        this.relationship,
        this.identifier,
        newValue,
        this.contained,
        this.extension,
        this.source,
        this.moiety,
        this.structure,
        this.code,
        this.status,
        this.polymer,
        this.protein,
        this.text,
        this.meta,
        this.id,
        this.type,
        this.molecularWeight,
        this.language,
        this.property,
        this.nucleicAcid,
        this.domain,
        this.implicitRules,
        this.modifierExtension,
        this.name,
        this.resourceType,
        this.description,
        this.referenceInformation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSpecification#comment() comment} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for comment
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification withComment(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.comment, value)) return this;
    return new ImmutableSubstanceSpecification(
        this.sourceMaterial,
        this.relationship,
        this.identifier,
        value,
        this.contained,
        this.extension,
        this.source,
        this.moiety,
        this.structure,
        this.code,
        this.status,
        this.polymer,
        this.protein,
        this.text,
        this.meta,
        this.id,
        this.type,
        this.molecularWeight,
        this.language,
        this.property,
        this.nucleicAcid,
        this.domain,
        this.implicitRules,
        this.modifierExtension,
        this.name,
        this.resourceType,
        this.description,
        this.referenceInformation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSpecification#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification withContained(List<ResourceList> value) {
    @Nullable List<ResourceList> newValue = Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableSubstanceSpecification(
        this.sourceMaterial,
        this.relationship,
        this.identifier,
        this.comment,
        newValue,
        this.extension,
        this.source,
        this.moiety,
        this.structure,
        this.code,
        this.status,
        this.polymer,
        this.protein,
        this.text,
        this.meta,
        this.id,
        this.type,
        this.molecularWeight,
        this.language,
        this.property,
        this.nucleicAcid,
        this.domain,
        this.implicitRules,
        this.modifierExtension,
        this.name,
        this.resourceType,
        this.description,
        this.referenceInformation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSpecification#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSpecification withContained(Optional<? extends List<ResourceList>> optional) {
    @Nullable List<ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableSubstanceSpecification(
        this.sourceMaterial,
        this.relationship,
        this.identifier,
        this.comment,
        value,
        this.extension,
        this.source,
        this.moiety,
        this.structure,
        this.code,
        this.status,
        this.polymer,
        this.protein,
        this.text,
        this.meta,
        this.id,
        this.type,
        this.molecularWeight,
        this.language,
        this.property,
        this.nucleicAcid,
        this.domain,
        this.implicitRules,
        this.modifierExtension,
        this.name,
        this.resourceType,
        this.description,
        this.referenceInformation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSpecification#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableSubstanceSpecification(
        this.sourceMaterial,
        this.relationship,
        this.identifier,
        this.comment,
        this.contained,
        newValue,
        this.source,
        this.moiety,
        this.structure,
        this.code,
        this.status,
        this.polymer,
        this.protein,
        this.text,
        this.meta,
        this.id,
        this.type,
        this.molecularWeight,
        this.language,
        this.property,
        this.nucleicAcid,
        this.domain,
        this.implicitRules,
        this.modifierExtension,
        this.name,
        this.resourceType,
        this.description,
        this.referenceInformation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSpecification#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSpecification withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableSubstanceSpecification(
        this.sourceMaterial,
        this.relationship,
        this.identifier,
        this.comment,
        this.contained,
        value,
        this.source,
        this.moiety,
        this.structure,
        this.code,
        this.status,
        this.polymer,
        this.protein,
        this.text,
        this.meta,
        this.id,
        this.type,
        this.molecularWeight,
        this.language,
        this.property,
        this.nucleicAcid,
        this.domain,
        this.implicitRules,
        this.modifierExtension,
        this.name,
        this.resourceType,
        this.description,
        this.referenceInformation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSpecification#source() source} attribute.
   * @param value The value for source
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification withSource(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "source");
    if (this.source == newValue) return this;
    return new ImmutableSubstanceSpecification(
        this.sourceMaterial,
        this.relationship,
        this.identifier,
        this.comment,
        this.contained,
        this.extension,
        newValue,
        this.moiety,
        this.structure,
        this.code,
        this.status,
        this.polymer,
        this.protein,
        this.text,
        this.meta,
        this.id,
        this.type,
        this.molecularWeight,
        this.language,
        this.property,
        this.nucleicAcid,
        this.domain,
        this.implicitRules,
        this.modifierExtension,
        this.name,
        this.resourceType,
        this.description,
        this.referenceInformation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSpecification#source() source} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for source
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSpecification withSource(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.source == value) return this;
    return new ImmutableSubstanceSpecification(
        this.sourceMaterial,
        this.relationship,
        this.identifier,
        this.comment,
        this.contained,
        this.extension,
        value,
        this.moiety,
        this.structure,
        this.code,
        this.status,
        this.polymer,
        this.protein,
        this.text,
        this.meta,
        this.id,
        this.type,
        this.molecularWeight,
        this.language,
        this.property,
        this.nucleicAcid,
        this.domain,
        this.implicitRules,
        this.modifierExtension,
        this.name,
        this.resourceType,
        this.description,
        this.referenceInformation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSpecification#moiety() moiety} attribute.
   * @param value The value for moiety
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification withMoiety(List<SubstanceSpecification_Moiety> value) {
    @Nullable List<SubstanceSpecification_Moiety> newValue = Objects.requireNonNull(value, "moiety");
    if (this.moiety == newValue) return this;
    return new ImmutableSubstanceSpecification(
        this.sourceMaterial,
        this.relationship,
        this.identifier,
        this.comment,
        this.contained,
        this.extension,
        this.source,
        newValue,
        this.structure,
        this.code,
        this.status,
        this.polymer,
        this.protein,
        this.text,
        this.meta,
        this.id,
        this.type,
        this.molecularWeight,
        this.language,
        this.property,
        this.nucleicAcid,
        this.domain,
        this.implicitRules,
        this.modifierExtension,
        this.name,
        this.resourceType,
        this.description,
        this.referenceInformation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSpecification#moiety() moiety} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for moiety
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSpecification withMoiety(Optional<? extends List<SubstanceSpecification_Moiety>> optional) {
    @Nullable List<SubstanceSpecification_Moiety> value = optional.orElse(null);
    if (this.moiety == value) return this;
    return new ImmutableSubstanceSpecification(
        this.sourceMaterial,
        this.relationship,
        this.identifier,
        this.comment,
        this.contained,
        this.extension,
        this.source,
        value,
        this.structure,
        this.code,
        this.status,
        this.polymer,
        this.protein,
        this.text,
        this.meta,
        this.id,
        this.type,
        this.molecularWeight,
        this.language,
        this.property,
        this.nucleicAcid,
        this.domain,
        this.implicitRules,
        this.modifierExtension,
        this.name,
        this.resourceType,
        this.description,
        this.referenceInformation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSpecification#structure() structure} attribute.
   * @param value The value for structure
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification withStructure(SubstanceSpecification_Structure value) {
    @Nullable SubstanceSpecification_Structure newValue = Objects.requireNonNull(value, "structure");
    if (this.structure == newValue) return this;
    return new ImmutableSubstanceSpecification(
        this.sourceMaterial,
        this.relationship,
        this.identifier,
        this.comment,
        this.contained,
        this.extension,
        this.source,
        this.moiety,
        newValue,
        this.code,
        this.status,
        this.polymer,
        this.protein,
        this.text,
        this.meta,
        this.id,
        this.type,
        this.molecularWeight,
        this.language,
        this.property,
        this.nucleicAcid,
        this.domain,
        this.implicitRules,
        this.modifierExtension,
        this.name,
        this.resourceType,
        this.description,
        this.referenceInformation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSpecification#structure() structure} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for structure
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSpecification withStructure(Optional<? extends SubstanceSpecification_Structure> optional) {
    @Nullable SubstanceSpecification_Structure value = optional.orElse(null);
    if (this.structure == value) return this;
    return new ImmutableSubstanceSpecification(
        this.sourceMaterial,
        this.relationship,
        this.identifier,
        this.comment,
        this.contained,
        this.extension,
        this.source,
        this.moiety,
        value,
        this.code,
        this.status,
        this.polymer,
        this.protein,
        this.text,
        this.meta,
        this.id,
        this.type,
        this.molecularWeight,
        this.language,
        this.property,
        this.nucleicAcid,
        this.domain,
        this.implicitRules,
        this.modifierExtension,
        this.name,
        this.resourceType,
        this.description,
        this.referenceInformation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSpecification#code() code} attribute.
   * @param value The value for code
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification withCode(List<SubstanceSpecification_Code> value) {
    @Nullable List<SubstanceSpecification_Code> newValue = Objects.requireNonNull(value, "code");
    if (this.code == newValue) return this;
    return new ImmutableSubstanceSpecification(
        this.sourceMaterial,
        this.relationship,
        this.identifier,
        this.comment,
        this.contained,
        this.extension,
        this.source,
        this.moiety,
        this.structure,
        newValue,
        this.status,
        this.polymer,
        this.protein,
        this.text,
        this.meta,
        this.id,
        this.type,
        this.molecularWeight,
        this.language,
        this.property,
        this.nucleicAcid,
        this.domain,
        this.implicitRules,
        this.modifierExtension,
        this.name,
        this.resourceType,
        this.description,
        this.referenceInformation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSpecification#code() code} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for code
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSpecification withCode(Optional<? extends List<SubstanceSpecification_Code>> optional) {
    @Nullable List<SubstanceSpecification_Code> value = optional.orElse(null);
    if (this.code == value) return this;
    return new ImmutableSubstanceSpecification(
        this.sourceMaterial,
        this.relationship,
        this.identifier,
        this.comment,
        this.contained,
        this.extension,
        this.source,
        this.moiety,
        this.structure,
        value,
        this.status,
        this.polymer,
        this.protein,
        this.text,
        this.meta,
        this.id,
        this.type,
        this.molecularWeight,
        this.language,
        this.property,
        this.nucleicAcid,
        this.domain,
        this.implicitRules,
        this.modifierExtension,
        this.name,
        this.resourceType,
        this.description,
        this.referenceInformation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSpecification#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification withStatus(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableSubstanceSpecification(
        this.sourceMaterial,
        this.relationship,
        this.identifier,
        this.comment,
        this.contained,
        this.extension,
        this.source,
        this.moiety,
        this.structure,
        this.code,
        newValue,
        this.polymer,
        this.protein,
        this.text,
        this.meta,
        this.id,
        this.type,
        this.molecularWeight,
        this.language,
        this.property,
        this.nucleicAcid,
        this.domain,
        this.implicitRules,
        this.modifierExtension,
        this.name,
        this.resourceType,
        this.description,
        this.referenceInformation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSpecification#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSpecification withStatus(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableSubstanceSpecification(
        this.sourceMaterial,
        this.relationship,
        this.identifier,
        this.comment,
        this.contained,
        this.extension,
        this.source,
        this.moiety,
        this.structure,
        this.code,
        value,
        this.polymer,
        this.protein,
        this.text,
        this.meta,
        this.id,
        this.type,
        this.molecularWeight,
        this.language,
        this.property,
        this.nucleicAcid,
        this.domain,
        this.implicitRules,
        this.modifierExtension,
        this.name,
        this.resourceType,
        this.description,
        this.referenceInformation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSpecification#polymer() polymer} attribute.
   * @param value The value for polymer
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification withPolymer(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "polymer");
    if (this.polymer == newValue) return this;
    return new ImmutableSubstanceSpecification(
        this.sourceMaterial,
        this.relationship,
        this.identifier,
        this.comment,
        this.contained,
        this.extension,
        this.source,
        this.moiety,
        this.structure,
        this.code,
        this.status,
        newValue,
        this.protein,
        this.text,
        this.meta,
        this.id,
        this.type,
        this.molecularWeight,
        this.language,
        this.property,
        this.nucleicAcid,
        this.domain,
        this.implicitRules,
        this.modifierExtension,
        this.name,
        this.resourceType,
        this.description,
        this.referenceInformation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSpecification#polymer() polymer} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for polymer
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSpecification withPolymer(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.polymer == value) return this;
    return new ImmutableSubstanceSpecification(
        this.sourceMaterial,
        this.relationship,
        this.identifier,
        this.comment,
        this.contained,
        this.extension,
        this.source,
        this.moiety,
        this.structure,
        this.code,
        this.status,
        value,
        this.protein,
        this.text,
        this.meta,
        this.id,
        this.type,
        this.molecularWeight,
        this.language,
        this.property,
        this.nucleicAcid,
        this.domain,
        this.implicitRules,
        this.modifierExtension,
        this.name,
        this.resourceType,
        this.description,
        this.referenceInformation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSpecification#protein() protein} attribute.
   * @param value The value for protein
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification withProtein(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "protein");
    if (this.protein == newValue) return this;
    return new ImmutableSubstanceSpecification(
        this.sourceMaterial,
        this.relationship,
        this.identifier,
        this.comment,
        this.contained,
        this.extension,
        this.source,
        this.moiety,
        this.structure,
        this.code,
        this.status,
        this.polymer,
        newValue,
        this.text,
        this.meta,
        this.id,
        this.type,
        this.molecularWeight,
        this.language,
        this.property,
        this.nucleicAcid,
        this.domain,
        this.implicitRules,
        this.modifierExtension,
        this.name,
        this.resourceType,
        this.description,
        this.referenceInformation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSpecification#protein() protein} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for protein
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSpecification withProtein(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.protein == value) return this;
    return new ImmutableSubstanceSpecification(
        this.sourceMaterial,
        this.relationship,
        this.identifier,
        this.comment,
        this.contained,
        this.extension,
        this.source,
        this.moiety,
        this.structure,
        this.code,
        this.status,
        this.polymer,
        value,
        this.text,
        this.meta,
        this.id,
        this.type,
        this.molecularWeight,
        this.language,
        this.property,
        this.nucleicAcid,
        this.domain,
        this.implicitRules,
        this.modifierExtension,
        this.name,
        this.resourceType,
        this.description,
        this.referenceInformation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSpecification#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification withText(Narrative value) {
    @Nullable Narrative newValue = Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableSubstanceSpecification(
        this.sourceMaterial,
        this.relationship,
        this.identifier,
        this.comment,
        this.contained,
        this.extension,
        this.source,
        this.moiety,
        this.structure,
        this.code,
        this.status,
        this.polymer,
        this.protein,
        newValue,
        this.meta,
        this.id,
        this.type,
        this.molecularWeight,
        this.language,
        this.property,
        this.nucleicAcid,
        this.domain,
        this.implicitRules,
        this.modifierExtension,
        this.name,
        this.resourceType,
        this.description,
        this.referenceInformation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSpecification#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSpecification withText(Optional<? extends Narrative> optional) {
    @Nullable Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableSubstanceSpecification(
        this.sourceMaterial,
        this.relationship,
        this.identifier,
        this.comment,
        this.contained,
        this.extension,
        this.source,
        this.moiety,
        this.structure,
        this.code,
        this.status,
        this.polymer,
        this.protein,
        value,
        this.meta,
        this.id,
        this.type,
        this.molecularWeight,
        this.language,
        this.property,
        this.nucleicAcid,
        this.domain,
        this.implicitRules,
        this.modifierExtension,
        this.name,
        this.resourceType,
        this.description,
        this.referenceInformation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSpecification#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification withMeta(Meta value) {
    @Nullable Meta newValue = Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableSubstanceSpecification(
        this.sourceMaterial,
        this.relationship,
        this.identifier,
        this.comment,
        this.contained,
        this.extension,
        this.source,
        this.moiety,
        this.structure,
        this.code,
        this.status,
        this.polymer,
        this.protein,
        this.text,
        newValue,
        this.id,
        this.type,
        this.molecularWeight,
        this.language,
        this.property,
        this.nucleicAcid,
        this.domain,
        this.implicitRules,
        this.modifierExtension,
        this.name,
        this.resourceType,
        this.description,
        this.referenceInformation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSpecification#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSpecification withMeta(Optional<? extends Meta> optional) {
    @Nullable Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableSubstanceSpecification(
        this.sourceMaterial,
        this.relationship,
        this.identifier,
        this.comment,
        this.contained,
        this.extension,
        this.source,
        this.moiety,
        this.structure,
        this.code,
        this.status,
        this.polymer,
        this.protein,
        this.text,
        value,
        this.id,
        this.type,
        this.molecularWeight,
        this.language,
        this.property,
        this.nucleicAcid,
        this.domain,
        this.implicitRules,
        this.modifierExtension,
        this.name,
        this.resourceType,
        this.description,
        this.referenceInformation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSpecification#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification withId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableSubstanceSpecification(
        this.sourceMaterial,
        this.relationship,
        this.identifier,
        this.comment,
        this.contained,
        this.extension,
        this.source,
        this.moiety,
        this.structure,
        this.code,
        this.status,
        this.polymer,
        this.protein,
        this.text,
        this.meta,
        newValue,
        this.type,
        this.molecularWeight,
        this.language,
        this.property,
        this.nucleicAcid,
        this.domain,
        this.implicitRules,
        this.modifierExtension,
        this.name,
        this.resourceType,
        this.description,
        this.referenceInformation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSpecification#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSpecification withId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableSubstanceSpecification(
        this.sourceMaterial,
        this.relationship,
        this.identifier,
        this.comment,
        this.contained,
        this.extension,
        this.source,
        this.moiety,
        this.structure,
        this.code,
        this.status,
        this.polymer,
        this.protein,
        this.text,
        this.meta,
        value,
        this.type,
        this.molecularWeight,
        this.language,
        this.property,
        this.nucleicAcid,
        this.domain,
        this.implicitRules,
        this.modifierExtension,
        this.name,
        this.resourceType,
        this.description,
        this.referenceInformation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSpecification#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification withType(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutableSubstanceSpecification(
        this.sourceMaterial,
        this.relationship,
        this.identifier,
        this.comment,
        this.contained,
        this.extension,
        this.source,
        this.moiety,
        this.structure,
        this.code,
        this.status,
        this.polymer,
        this.protein,
        this.text,
        this.meta,
        this.id,
        newValue,
        this.molecularWeight,
        this.language,
        this.property,
        this.nucleicAcid,
        this.domain,
        this.implicitRules,
        this.modifierExtension,
        this.name,
        this.resourceType,
        this.description,
        this.referenceInformation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSpecification#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSpecification withType(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutableSubstanceSpecification(
        this.sourceMaterial,
        this.relationship,
        this.identifier,
        this.comment,
        this.contained,
        this.extension,
        this.source,
        this.moiety,
        this.structure,
        this.code,
        this.status,
        this.polymer,
        this.protein,
        this.text,
        this.meta,
        this.id,
        value,
        this.molecularWeight,
        this.language,
        this.property,
        this.nucleicAcid,
        this.domain,
        this.implicitRules,
        this.modifierExtension,
        this.name,
        this.resourceType,
        this.description,
        this.referenceInformation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSpecification#molecularWeight() molecularWeight} attribute.
   * @param value The value for molecularWeight
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification withMolecularWeight(List<SubstanceSpecification_MolecularWeight> value) {
    @Nullable List<SubstanceSpecification_MolecularWeight> newValue = Objects.requireNonNull(value, "molecularWeight");
    if (this.molecularWeight == newValue) return this;
    return new ImmutableSubstanceSpecification(
        this.sourceMaterial,
        this.relationship,
        this.identifier,
        this.comment,
        this.contained,
        this.extension,
        this.source,
        this.moiety,
        this.structure,
        this.code,
        this.status,
        this.polymer,
        this.protein,
        this.text,
        this.meta,
        this.id,
        this.type,
        newValue,
        this.language,
        this.property,
        this.nucleicAcid,
        this.domain,
        this.implicitRules,
        this.modifierExtension,
        this.name,
        this.resourceType,
        this.description,
        this.referenceInformation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSpecification#molecularWeight() molecularWeight} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for molecularWeight
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSpecification withMolecularWeight(Optional<? extends List<SubstanceSpecification_MolecularWeight>> optional) {
    @Nullable List<SubstanceSpecification_MolecularWeight> value = optional.orElse(null);
    if (this.molecularWeight == value) return this;
    return new ImmutableSubstanceSpecification(
        this.sourceMaterial,
        this.relationship,
        this.identifier,
        this.comment,
        this.contained,
        this.extension,
        this.source,
        this.moiety,
        this.structure,
        this.code,
        this.status,
        this.polymer,
        this.protein,
        this.text,
        this.meta,
        this.id,
        this.type,
        value,
        this.language,
        this.property,
        this.nucleicAcid,
        this.domain,
        this.implicitRules,
        this.modifierExtension,
        this.name,
        this.resourceType,
        this.description,
        this.referenceInformation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSpecification#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification withLanguage(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableSubstanceSpecification(
        this.sourceMaterial,
        this.relationship,
        this.identifier,
        this.comment,
        this.contained,
        this.extension,
        this.source,
        this.moiety,
        this.structure,
        this.code,
        this.status,
        this.polymer,
        this.protein,
        this.text,
        this.meta,
        this.id,
        this.type,
        this.molecularWeight,
        newValue,
        this.property,
        this.nucleicAcid,
        this.domain,
        this.implicitRules,
        this.modifierExtension,
        this.name,
        this.resourceType,
        this.description,
        this.referenceInformation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSpecification#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSpecification withLanguage(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableSubstanceSpecification(
        this.sourceMaterial,
        this.relationship,
        this.identifier,
        this.comment,
        this.contained,
        this.extension,
        this.source,
        this.moiety,
        this.structure,
        this.code,
        this.status,
        this.polymer,
        this.protein,
        this.text,
        this.meta,
        this.id,
        this.type,
        this.molecularWeight,
        value,
        this.property,
        this.nucleicAcid,
        this.domain,
        this.implicitRules,
        this.modifierExtension,
        this.name,
        this.resourceType,
        this.description,
        this.referenceInformation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSpecification#property() property} attribute.
   * @param value The value for property
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification withProperty(List<SubstanceSpecification_Property> value) {
    @Nullable List<SubstanceSpecification_Property> newValue = Objects.requireNonNull(value, "property");
    if (this.property == newValue) return this;
    return new ImmutableSubstanceSpecification(
        this.sourceMaterial,
        this.relationship,
        this.identifier,
        this.comment,
        this.contained,
        this.extension,
        this.source,
        this.moiety,
        this.structure,
        this.code,
        this.status,
        this.polymer,
        this.protein,
        this.text,
        this.meta,
        this.id,
        this.type,
        this.molecularWeight,
        this.language,
        newValue,
        this.nucleicAcid,
        this.domain,
        this.implicitRules,
        this.modifierExtension,
        this.name,
        this.resourceType,
        this.description,
        this.referenceInformation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSpecification#property() property} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for property
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSpecification withProperty(Optional<? extends List<SubstanceSpecification_Property>> optional) {
    @Nullable List<SubstanceSpecification_Property> value = optional.orElse(null);
    if (this.property == value) return this;
    return new ImmutableSubstanceSpecification(
        this.sourceMaterial,
        this.relationship,
        this.identifier,
        this.comment,
        this.contained,
        this.extension,
        this.source,
        this.moiety,
        this.structure,
        this.code,
        this.status,
        this.polymer,
        this.protein,
        this.text,
        this.meta,
        this.id,
        this.type,
        this.molecularWeight,
        this.language,
        value,
        this.nucleicAcid,
        this.domain,
        this.implicitRules,
        this.modifierExtension,
        this.name,
        this.resourceType,
        this.description,
        this.referenceInformation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSpecification#nucleicAcid() nucleicAcid} attribute.
   * @param value The value for nucleicAcid
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification withNucleicAcid(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "nucleicAcid");
    if (this.nucleicAcid == newValue) return this;
    return new ImmutableSubstanceSpecification(
        this.sourceMaterial,
        this.relationship,
        this.identifier,
        this.comment,
        this.contained,
        this.extension,
        this.source,
        this.moiety,
        this.structure,
        this.code,
        this.status,
        this.polymer,
        this.protein,
        this.text,
        this.meta,
        this.id,
        this.type,
        this.molecularWeight,
        this.language,
        this.property,
        newValue,
        this.domain,
        this.implicitRules,
        this.modifierExtension,
        this.name,
        this.resourceType,
        this.description,
        this.referenceInformation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSpecification#nucleicAcid() nucleicAcid} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for nucleicAcid
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSpecification withNucleicAcid(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.nucleicAcid == value) return this;
    return new ImmutableSubstanceSpecification(
        this.sourceMaterial,
        this.relationship,
        this.identifier,
        this.comment,
        this.contained,
        this.extension,
        this.source,
        this.moiety,
        this.structure,
        this.code,
        this.status,
        this.polymer,
        this.protein,
        this.text,
        this.meta,
        this.id,
        this.type,
        this.molecularWeight,
        this.language,
        this.property,
        value,
        this.domain,
        this.implicitRules,
        this.modifierExtension,
        this.name,
        this.resourceType,
        this.description,
        this.referenceInformation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSpecification#domain() domain} attribute.
   * @param value The value for domain
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification withDomain(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "domain");
    if (this.domain == newValue) return this;
    return new ImmutableSubstanceSpecification(
        this.sourceMaterial,
        this.relationship,
        this.identifier,
        this.comment,
        this.contained,
        this.extension,
        this.source,
        this.moiety,
        this.structure,
        this.code,
        this.status,
        this.polymer,
        this.protein,
        this.text,
        this.meta,
        this.id,
        this.type,
        this.molecularWeight,
        this.language,
        this.property,
        this.nucleicAcid,
        newValue,
        this.implicitRules,
        this.modifierExtension,
        this.name,
        this.resourceType,
        this.description,
        this.referenceInformation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSpecification#domain() domain} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for domain
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSpecification withDomain(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.domain == value) return this;
    return new ImmutableSubstanceSpecification(
        this.sourceMaterial,
        this.relationship,
        this.identifier,
        this.comment,
        this.contained,
        this.extension,
        this.source,
        this.moiety,
        this.structure,
        this.code,
        this.status,
        this.polymer,
        this.protein,
        this.text,
        this.meta,
        this.id,
        this.type,
        this.molecularWeight,
        this.language,
        this.property,
        this.nucleicAcid,
        value,
        this.implicitRules,
        this.modifierExtension,
        this.name,
        this.resourceType,
        this.description,
        this.referenceInformation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSpecification#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification withImplicitRules(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableSubstanceSpecification(
        this.sourceMaterial,
        this.relationship,
        this.identifier,
        this.comment,
        this.contained,
        this.extension,
        this.source,
        this.moiety,
        this.structure,
        this.code,
        this.status,
        this.polymer,
        this.protein,
        this.text,
        this.meta,
        this.id,
        this.type,
        this.molecularWeight,
        this.language,
        this.property,
        this.nucleicAcid,
        this.domain,
        newValue,
        this.modifierExtension,
        this.name,
        this.resourceType,
        this.description,
        this.referenceInformation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSpecification#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSpecification withImplicitRules(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableSubstanceSpecification(
        this.sourceMaterial,
        this.relationship,
        this.identifier,
        this.comment,
        this.contained,
        this.extension,
        this.source,
        this.moiety,
        this.structure,
        this.code,
        this.status,
        this.polymer,
        this.protein,
        this.text,
        this.meta,
        this.id,
        this.type,
        this.molecularWeight,
        this.language,
        this.property,
        this.nucleicAcid,
        this.domain,
        value,
        this.modifierExtension,
        this.name,
        this.resourceType,
        this.description,
        this.referenceInformation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSpecification#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableSubstanceSpecification(
        this.sourceMaterial,
        this.relationship,
        this.identifier,
        this.comment,
        this.contained,
        this.extension,
        this.source,
        this.moiety,
        this.structure,
        this.code,
        this.status,
        this.polymer,
        this.protein,
        this.text,
        this.meta,
        this.id,
        this.type,
        this.molecularWeight,
        this.language,
        this.property,
        this.nucleicAcid,
        this.domain,
        this.implicitRules,
        newValue,
        this.name,
        this.resourceType,
        this.description,
        this.referenceInformation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSpecification#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSpecification withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableSubstanceSpecification(
        this.sourceMaterial,
        this.relationship,
        this.identifier,
        this.comment,
        this.contained,
        this.extension,
        this.source,
        this.moiety,
        this.structure,
        this.code,
        this.status,
        this.polymer,
        this.protein,
        this.text,
        this.meta,
        this.id,
        this.type,
        this.molecularWeight,
        this.language,
        this.property,
        this.nucleicAcid,
        this.domain,
        this.implicitRules,
        value,
        this.name,
        this.resourceType,
        this.description,
        this.referenceInformation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSpecification#name() name} attribute.
   * @param value The value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification withName(List<SubstanceSpecification_Name> value) {
    @Nullable List<SubstanceSpecification_Name> newValue = Objects.requireNonNull(value, "name");
    if (this.name == newValue) return this;
    return new ImmutableSubstanceSpecification(
        this.sourceMaterial,
        this.relationship,
        this.identifier,
        this.comment,
        this.contained,
        this.extension,
        this.source,
        this.moiety,
        this.structure,
        this.code,
        this.status,
        this.polymer,
        this.protein,
        this.text,
        this.meta,
        this.id,
        this.type,
        this.molecularWeight,
        this.language,
        this.property,
        this.nucleicAcid,
        this.domain,
        this.implicitRules,
        this.modifierExtension,
        newValue,
        this.resourceType,
        this.description,
        this.referenceInformation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSpecification#name() name} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for name
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSpecification withName(Optional<? extends List<SubstanceSpecification_Name>> optional) {
    @Nullable List<SubstanceSpecification_Name> value = optional.orElse(null);
    if (this.name == value) return this;
    return new ImmutableSubstanceSpecification(
        this.sourceMaterial,
        this.relationship,
        this.identifier,
        this.comment,
        this.contained,
        this.extension,
        this.source,
        this.moiety,
        this.structure,
        this.code,
        this.status,
        this.polymer,
        this.protein,
        this.text,
        this.meta,
        this.id,
        this.type,
        this.molecularWeight,
        this.language,
        this.property,
        this.nucleicAcid,
        this.domain,
        this.implicitRules,
        this.modifierExtension,
        value,
        this.resourceType,
        this.description,
        this.referenceInformation);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SubstanceSpecification#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSubstanceSpecification withResourceType(String value) {
    String newValue = Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableSubstanceSpecification(
        this.sourceMaterial,
        this.relationship,
        this.identifier,
        this.comment,
        this.contained,
        this.extension,
        this.source,
        this.moiety,
        this.structure,
        this.code,
        this.status,
        this.polymer,
        this.protein,
        this.text,
        this.meta,
        this.id,
        this.type,
        this.molecularWeight,
        this.language,
        this.property,
        this.nucleicAcid,
        this.domain,
        this.implicitRules,
        this.modifierExtension,
        this.name,
        newValue,
        this.description,
        this.referenceInformation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSpecification#description() description} attribute.
   * @param value The value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification withDescription(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "description");
    if (Objects.equals(this.description, newValue)) return this;
    return new ImmutableSubstanceSpecification(
        this.sourceMaterial,
        this.relationship,
        this.identifier,
        this.comment,
        this.contained,
        this.extension,
        this.source,
        this.moiety,
        this.structure,
        this.code,
        this.status,
        this.polymer,
        this.protein,
        this.text,
        this.meta,
        this.id,
        this.type,
        this.molecularWeight,
        this.language,
        this.property,
        this.nucleicAcid,
        this.domain,
        this.implicitRules,
        this.modifierExtension,
        this.name,
        this.resourceType,
        newValue,
        this.referenceInformation);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSpecification#description() description} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification withDescription(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.description, value)) return this;
    return new ImmutableSubstanceSpecification(
        this.sourceMaterial,
        this.relationship,
        this.identifier,
        this.comment,
        this.contained,
        this.extension,
        this.source,
        this.moiety,
        this.structure,
        this.code,
        this.status,
        this.polymer,
        this.protein,
        this.text,
        this.meta,
        this.id,
        this.type,
        this.molecularWeight,
        this.language,
        this.property,
        this.nucleicAcid,
        this.domain,
        this.implicitRules,
        this.modifierExtension,
        this.name,
        this.resourceType,
        value,
        this.referenceInformation);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSpecification#referenceInformation() referenceInformation} attribute.
   * @param value The value for referenceInformation
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification withReferenceInformation(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "referenceInformation");
    if (this.referenceInformation == newValue) return this;
    return new ImmutableSubstanceSpecification(
        this.sourceMaterial,
        this.relationship,
        this.identifier,
        this.comment,
        this.contained,
        this.extension,
        this.source,
        this.moiety,
        this.structure,
        this.code,
        this.status,
        this.polymer,
        this.protein,
        this.text,
        this.meta,
        this.id,
        this.type,
        this.molecularWeight,
        this.language,
        this.property,
        this.nucleicAcid,
        this.domain,
        this.implicitRules,
        this.modifierExtension,
        this.name,
        this.resourceType,
        this.description,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSpecification#referenceInformation() referenceInformation} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for referenceInformation
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSpecification withReferenceInformation(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.referenceInformation == value) return this;
    return new ImmutableSubstanceSpecification(
        this.sourceMaterial,
        this.relationship,
        this.identifier,
        this.comment,
        this.contained,
        this.extension,
        this.source,
        this.moiety,
        this.structure,
        this.code,
        this.status,
        this.polymer,
        this.protein,
        this.text,
        this.meta,
        this.id,
        this.type,
        this.molecularWeight,
        this.language,
        this.property,
        this.nucleicAcid,
        this.domain,
        this.implicitRules,
        this.modifierExtension,
        this.name,
        this.resourceType,
        this.description,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableSubstanceSpecification} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableSubstanceSpecification
        && equalTo((ImmutableSubstanceSpecification) another);
  }

  private boolean equalTo(ImmutableSubstanceSpecification another) {
    return Objects.equals(sourceMaterial, another.sourceMaterial)
        && Objects.equals(relationship, another.relationship)
        && Objects.equals(identifier, another.identifier)
        && Objects.equals(comment, another.comment)
        && Objects.equals(contained, another.contained)
        && Objects.equals(extension, another.extension)
        && Objects.equals(source, another.source)
        && Objects.equals(moiety, another.moiety)
        && Objects.equals(structure, another.structure)
        && Objects.equals(code, another.code)
        && Objects.equals(status, another.status)
        && Objects.equals(polymer, another.polymer)
        && Objects.equals(protein, another.protein)
        && Objects.equals(text, another.text)
        && Objects.equals(meta, another.meta)
        && Objects.equals(id, another.id)
        && Objects.equals(type, another.type)
        && Objects.equals(molecularWeight, another.molecularWeight)
        && Objects.equals(language, another.language)
        && Objects.equals(property, another.property)
        && Objects.equals(nucleicAcid, another.nucleicAcid)
        && Objects.equals(domain, another.domain)
        && Objects.equals(implicitRules, another.implicitRules)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(name, another.name)
        && resourceType.equals(another.resourceType)
        && Objects.equals(description, another.description)
        && Objects.equals(referenceInformation, another.referenceInformation);
  }

  /**
   * Computes a hash code from attributes: {@code sourceMaterial}, {@code relationship}, {@code identifier}, {@code comment}, {@code contained}, {@code extension}, {@code source}, {@code moiety}, {@code structure}, {@code code}, {@code status}, {@code polymer}, {@code protein}, {@code text}, {@code meta}, {@code id}, {@code type}, {@code molecularWeight}, {@code language}, {@code property}, {@code nucleicAcid}, {@code domain}, {@code implicitRules}, {@code modifierExtension}, {@code name}, {@code resourceType}, {@code description}, {@code referenceInformation}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(sourceMaterial);
    h += (h << 5) + Objects.hashCode(relationship);
    h += (h << 5) + Objects.hashCode(identifier);
    h += (h << 5) + Objects.hashCode(comment);
    h += (h << 5) + Objects.hashCode(contained);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(source);
    h += (h << 5) + Objects.hashCode(moiety);
    h += (h << 5) + Objects.hashCode(structure);
    h += (h << 5) + Objects.hashCode(code);
    h += (h << 5) + Objects.hashCode(status);
    h += (h << 5) + Objects.hashCode(polymer);
    h += (h << 5) + Objects.hashCode(protein);
    h += (h << 5) + Objects.hashCode(text);
    h += (h << 5) + Objects.hashCode(meta);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(type);
    h += (h << 5) + Objects.hashCode(molecularWeight);
    h += (h << 5) + Objects.hashCode(language);
    h += (h << 5) + Objects.hashCode(property);
    h += (h << 5) + Objects.hashCode(nucleicAcid);
    h += (h << 5) + Objects.hashCode(domain);
    h += (h << 5) + Objects.hashCode(implicitRules);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(name);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + Objects.hashCode(description);
    h += (h << 5) + Objects.hashCode(referenceInformation);
    return h;
  }

  /**
   * Prints the immutable value {@code SubstanceSpecification} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("SubstanceSpecification{");
    if (sourceMaterial != null) {
      builder.append("sourceMaterial=").append(sourceMaterial);
    }
    if (relationship != null) {
      if (builder.length() > 23) builder.append(", ");
      builder.append("relationship=").append(relationship);
    }
    if (identifier != null) {
      if (builder.length() > 23) builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (comment != null) {
      if (builder.length() > 23) builder.append(", ");
      builder.append("comment=").append(comment);
    }
    if (contained != null) {
      if (builder.length() > 23) builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (extension != null) {
      if (builder.length() > 23) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (source != null) {
      if (builder.length() > 23) builder.append(", ");
      builder.append("source=").append(source);
    }
    if (moiety != null) {
      if (builder.length() > 23) builder.append(", ");
      builder.append("moiety=").append(moiety);
    }
    if (structure != null) {
      if (builder.length() > 23) builder.append(", ");
      builder.append("structure=").append(structure);
    }
    if (code != null) {
      if (builder.length() > 23) builder.append(", ");
      builder.append("code=").append(code);
    }
    if (status != null) {
      if (builder.length() > 23) builder.append(", ");
      builder.append("status=").append(status);
    }
    if (polymer != null) {
      if (builder.length() > 23) builder.append(", ");
      builder.append("polymer=").append(polymer);
    }
    if (protein != null) {
      if (builder.length() > 23) builder.append(", ");
      builder.append("protein=").append(protein);
    }
    if (text != null) {
      if (builder.length() > 23) builder.append(", ");
      builder.append("text=").append(text);
    }
    if (meta != null) {
      if (builder.length() > 23) builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (id != null) {
      if (builder.length() > 23) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (type != null) {
      if (builder.length() > 23) builder.append(", ");
      builder.append("type=").append(type);
    }
    if (molecularWeight != null) {
      if (builder.length() > 23) builder.append(", ");
      builder.append("molecularWeight=").append(molecularWeight);
    }
    if (language != null) {
      if (builder.length() > 23) builder.append(", ");
      builder.append("language=").append(language);
    }
    if (property != null) {
      if (builder.length() > 23) builder.append(", ");
      builder.append("property=").append(property);
    }
    if (nucleicAcid != null) {
      if (builder.length() > 23) builder.append(", ");
      builder.append("nucleicAcid=").append(nucleicAcid);
    }
    if (domain != null) {
      if (builder.length() > 23) builder.append(", ");
      builder.append("domain=").append(domain);
    }
    if (implicitRules != null) {
      if (builder.length() > 23) builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (modifierExtension != null) {
      if (builder.length() > 23) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (name != null) {
      if (builder.length() > 23) builder.append(", ");
      builder.append("name=").append(name);
    }
    if (builder.length() > 23) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (description != null) {
      builder.append(", ");
      builder.append("description=").append(description);
    }
    if (referenceInformation != null) {
      builder.append(", ");
      builder.append("referenceInformation=").append(referenceInformation);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "SubstanceSpecification", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements SubstanceSpecification {
    @Nullable Optional<Reference> sourceMaterial = Optional.empty();
    boolean sourceMaterialIsSet;
    @Nullable Optional<List<SubstanceSpecification_Relationship>> relationship = Optional.empty();
    boolean relationshipIsSet;
    @Nullable Optional<Identifier> identifier = Optional.empty();
    boolean identifierIsSet;
    @Nullable Optional<String> comment = Optional.empty();
    boolean commentIsSet;
    @Nullable Optional<List<ResourceList>> contained = Optional.empty();
    boolean containedIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<List<Reference>> source = Optional.empty();
    boolean sourceIsSet;
    @Nullable Optional<List<SubstanceSpecification_Moiety>> moiety = Optional.empty();
    boolean moietyIsSet;
    @Nullable Optional<SubstanceSpecification_Structure> structure = Optional.empty();
    boolean structureIsSet;
    @Nullable Optional<List<SubstanceSpecification_Code>> code = Optional.empty();
    boolean codeIsSet;
    @Nullable Optional<CodeableConcept> status = Optional.empty();
    boolean statusIsSet;
    @Nullable Optional<Reference> polymer = Optional.empty();
    boolean polymerIsSet;
    @Nullable Optional<Reference> protein = Optional.empty();
    boolean proteinIsSet;
    @Nullable Optional<Narrative> text = Optional.empty();
    boolean textIsSet;
    @Nullable Optional<Meta> meta = Optional.empty();
    boolean metaIsSet;
    @Nullable Optional<Id> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<CodeableConcept> type = Optional.empty();
    boolean typeIsSet;
    @Nullable Optional<List<SubstanceSpecification_MolecularWeight>> molecularWeight = Optional.empty();
    boolean molecularWeightIsSet;
    @Nullable Optional<Code> language = Optional.empty();
    boolean languageIsSet;
    @Nullable Optional<List<SubstanceSpecification_Property>> property = Optional.empty();
    boolean propertyIsSet;
    @Nullable Optional<Reference> nucleicAcid = Optional.empty();
    boolean nucleicAcidIsSet;
    @Nullable Optional<CodeableConcept> domain = Optional.empty();
    boolean domainIsSet;
    @Nullable Optional<Uri> implicitRules = Optional.empty();
    boolean implicitRulesIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<List<SubstanceSpecification_Name>> name = Optional.empty();
    boolean nameIsSet;
    @Nullable String resourceType;
    @Nullable Optional<String> description = Optional.empty();
    boolean descriptionIsSet;
    @Nullable Optional<Reference> referenceInformation = Optional.empty();
    boolean referenceInformationIsSet;
    @JsonProperty("sourceMaterial")
    public void setSourceMaterial(Optional<Reference> sourceMaterial) {
      this.sourceMaterial = sourceMaterial;
      this.sourceMaterialIsSet = true;
    }
    @JsonProperty("relationship")
    public void setRelationship(Optional<List<SubstanceSpecification_Relationship>> relationship) {
      this.relationship = relationship;
      this.relationshipIsSet = true;
    }
    @JsonProperty("identifier")
    public void setIdentifier(Optional<Identifier> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @JsonProperty("comment")
    public void setComment(Optional<String> comment) {
      this.comment = comment;
      this.commentIsSet = true;
    }
    @JsonProperty("contained")
    public void setContained(Optional<List<ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("source")
    public void setSource(Optional<List<Reference>> source) {
      this.source = source;
      this.sourceIsSet = true;
    }
    @JsonProperty("moiety")
    public void setMoiety(Optional<List<SubstanceSpecification_Moiety>> moiety) {
      this.moiety = moiety;
      this.moietyIsSet = true;
    }
    @JsonProperty("structure")
    public void setStructure(Optional<SubstanceSpecification_Structure> structure) {
      this.structure = structure;
      this.structureIsSet = true;
    }
    @JsonProperty("code")
    public void setCode(Optional<List<SubstanceSpecification_Code>> code) {
      this.code = code;
      this.codeIsSet = true;
    }
    @JsonProperty("status")
    public void setStatus(Optional<CodeableConcept> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @JsonProperty("polymer")
    public void setPolymer(Optional<Reference> polymer) {
      this.polymer = polymer;
      this.polymerIsSet = true;
    }
    @JsonProperty("protein")
    public void setProtein(Optional<Reference> protein) {
      this.protein = protein;
      this.proteinIsSet = true;
    }
    @JsonProperty("text")
    public void setText(Optional<Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @JsonProperty("meta")
    public void setMeta(Optional<Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<Id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("type")
    public void setType(Optional<CodeableConcept> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @JsonProperty("molecularWeight")
    public void setMolecularWeight(Optional<List<SubstanceSpecification_MolecularWeight>> molecularWeight) {
      this.molecularWeight = molecularWeight;
      this.molecularWeightIsSet = true;
    }
    @JsonProperty("language")
    public void setLanguage(Optional<Code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @JsonProperty("property")
    public void setProperty(Optional<List<SubstanceSpecification_Property>> property) {
      this.property = property;
      this.propertyIsSet = true;
    }
    @JsonProperty("nucleicAcid")
    public void setNucleicAcid(Optional<Reference> nucleicAcid) {
      this.nucleicAcid = nucleicAcid;
      this.nucleicAcidIsSet = true;
    }
    @JsonProperty("domain")
    public void setDomain(Optional<CodeableConcept> domain) {
      this.domain = domain;
      this.domainIsSet = true;
    }
    @JsonProperty("implicitRules")
    public void setImplicitRules(Optional<Uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("name")
    public void setName(Optional<List<SubstanceSpecification_Name>> name) {
      this.name = name;
      this.nameIsSet = true;
    }
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
      this.resourceType = resourceType;
    }
    @JsonProperty("description")
    public void setDescription(Optional<String> description) {
      this.description = description;
      this.descriptionIsSet = true;
    }
    @JsonProperty("referenceInformation")
    public void setReferenceInformation(Optional<Reference> referenceInformation) {
      this.referenceInformation = referenceInformation;
      this.referenceInformationIsSet = true;
    }
    @Override
    public Optional<Reference> sourceMaterial() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<SubstanceSpecification_Relationship>> relationship() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Identifier> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> comment() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> source() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<SubstanceSpecification_Moiety>> moiety() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<SubstanceSpecification_Structure> structure() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<SubstanceSpecification_Code>> code() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> status() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> polymer() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> protein() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> type() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<SubstanceSpecification_MolecularWeight>> molecularWeight() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> language() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<SubstanceSpecification_Property>> property() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> nucleicAcid() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> domain() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<SubstanceSpecification_Name>> name() { throw new UnsupportedOperationException(); }
    @Override
    public String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> description() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> referenceInformation() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableSubstanceSpecification fromJson(Json json) {
    ImmutableSubstanceSpecification.Builder builder = ((ImmutableSubstanceSpecification.Builder) ImmutableSubstanceSpecification.builder());
    if (json.sourceMaterialIsSet) {
      builder.sourceMaterial(json.sourceMaterial);
    }
    if (json.relationshipIsSet) {
      builder.relationship(json.relationship);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.commentIsSet) {
      builder.comment(json.comment);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.sourceIsSet) {
      builder.source(json.source);
    }
    if (json.moietyIsSet) {
      builder.moiety(json.moiety);
    }
    if (json.structureIsSet) {
      builder.structure(json.structure);
    }
    if (json.codeIsSet) {
      builder.code(json.code);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.polymerIsSet) {
      builder.polymer(json.polymer);
    }
    if (json.proteinIsSet) {
      builder.protein(json.protein);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.molecularWeightIsSet) {
      builder.molecularWeight(json.molecularWeight);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.propertyIsSet) {
      builder.property(json.property);
    }
    if (json.nucleicAcidIsSet) {
      builder.nucleicAcid(json.nucleicAcid);
    }
    if (json.domainIsSet) {
      builder.domain(json.domain);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.nameIsSet) {
      builder.name(json.name);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.descriptionIsSet) {
      builder.description(json.description);
    }
    if (json.referenceInformationIsSet) {
      builder.referenceInformation(json.referenceInformation);
    }
    return (ImmutableSubstanceSpecification) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link SubstanceSpecification} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable SubstanceSpecification instance
   */
  public static SubstanceSpecification copyOf(SubstanceSpecification instance) {
    if (instance instanceof ImmutableSubstanceSpecification) {
      return (ImmutableSubstanceSpecification) instance;
    }
    return ((ImmutableSubstanceSpecification.Builder) ImmutableSubstanceSpecification.builder())
        .sourceMaterial(instance.sourceMaterial())
        .relationship(instance.relationship())
        .identifier(instance.identifier())
        .comment(instance.comment())
        .contained(instance.contained())
        .extension(instance.extension())
        .source(instance.source())
        .moiety(instance.moiety())
        .structure(instance.structure())
        .code(instance.code())
        .status(instance.status())
        .polymer(instance.polymer())
        .protein(instance.protein())
        .text(instance.text())
        .meta(instance.meta())
        .id(instance.id())
        .type(instance.type())
        .molecularWeight(instance.molecularWeight())
        .language(instance.language())
        .property(instance.property())
        .nucleicAcid(instance.nucleicAcid())
        .domain(instance.domain())
        .implicitRules(instance.implicitRules())
        .modifierExtension(instance.modifierExtension())
        .name(instance.name())
        .resourceType(instance.resourceType())
        .description(instance.description())
        .referenceInformation(instance.referenceInformation())
        .build();
  }

  /**
   * Creates a builder for {@link SubstanceSpecification SubstanceSpecification}.
   * <pre>
   * ImmutableSubstanceSpecification.builder()
   *    .sourceMaterial(com.medplum.types.fhir.Reference) // optional {@link SubstanceSpecification#sourceMaterial() sourceMaterial}
   *    .relationship(List&amp;lt;com.medplum.types.fhir.SubstanceSpecification_Relationship&amp;gt;) // optional {@link SubstanceSpecification#relationship() relationship}
   *    .identifier(com.medplum.types.fhir.Identifier) // optional {@link SubstanceSpecification#identifier() identifier}
   *    .comment(String) // optional {@link SubstanceSpecification#comment() comment}
   *    .contained(List&amp;lt;com.medplum.types.fhir.ResourceList&amp;gt;) // optional {@link SubstanceSpecification#contained() contained}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link SubstanceSpecification#extension() extension}
   *    .source(List&amp;lt;com.medplum.types.fhir.Reference&amp;gt;) // optional {@link SubstanceSpecification#source() source}
   *    .moiety(List&amp;lt;com.medplum.types.fhir.SubstanceSpecification_Moiety&amp;gt;) // optional {@link SubstanceSpecification#moiety() moiety}
   *    .structure(com.medplum.types.fhir.SubstanceSpecification_Structure) // optional {@link SubstanceSpecification#structure() structure}
   *    .code(List&amp;lt;com.medplum.types.fhir.SubstanceSpecification_Code&amp;gt;) // optional {@link SubstanceSpecification#code() code}
   *    .status(com.medplum.types.fhir.CodeableConcept) // optional {@link SubstanceSpecification#status() status}
   *    .polymer(com.medplum.types.fhir.Reference) // optional {@link SubstanceSpecification#polymer() polymer}
   *    .protein(com.medplum.types.fhir.Reference) // optional {@link SubstanceSpecification#protein() protein}
   *    .text(com.medplum.types.fhir.Narrative) // optional {@link SubstanceSpecification#text() text}
   *    .meta(com.medplum.types.fhir.Meta) // optional {@link SubstanceSpecification#meta() meta}
   *    .id(com.medplum.types.fhir.Id) // optional {@link SubstanceSpecification#id() id}
   *    .type(com.medplum.types.fhir.CodeableConcept) // optional {@link SubstanceSpecification#type() type}
   *    .molecularWeight(List&amp;lt;com.medplum.types.fhir.SubstanceSpecification_MolecularWeight&amp;gt;) // optional {@link SubstanceSpecification#molecularWeight() molecularWeight}
   *    .language(com.medplum.types.fhir.Code) // optional {@link SubstanceSpecification#language() language}
   *    .property(List&amp;lt;com.medplum.types.fhir.SubstanceSpecification_Property&amp;gt;) // optional {@link SubstanceSpecification#property() property}
   *    .nucleicAcid(com.medplum.types.fhir.Reference) // optional {@link SubstanceSpecification#nucleicAcid() nucleicAcid}
   *    .domain(com.medplum.types.fhir.CodeableConcept) // optional {@link SubstanceSpecification#domain() domain}
   *    .implicitRules(com.medplum.types.fhir.Uri) // optional {@link SubstanceSpecification#implicitRules() implicitRules}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link SubstanceSpecification#modifierExtension() modifierExtension}
   *    .name(List&amp;lt;com.medplum.types.fhir.SubstanceSpecification_Name&amp;gt;) // optional {@link SubstanceSpecification#name() name}
   *    .resourceType(String) // required {@link SubstanceSpecification#resourceType() resourceType}
   *    .description(String) // optional {@link SubstanceSpecification#description() description}
   *    .referenceInformation(com.medplum.types.fhir.Reference) // optional {@link SubstanceSpecification#referenceInformation() referenceInformation}
   *    .build();
   * </pre>
   * @return A new SubstanceSpecification builder
   */
  public static ResourceTypeBuildStage builder() {
    return new ImmutableSubstanceSpecification.Builder();
  }

  /**
   * Builds instances of type {@link SubstanceSpecification SubstanceSpecification}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "SubstanceSpecification", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long OPT_BIT_SOURCE_MATERIAL = 0x1L;
    private static final long OPT_BIT_RELATIONSHIP = 0x2L;
    private static final long OPT_BIT_IDENTIFIER = 0x4L;
    private static final long OPT_BIT_COMMENT = 0x8L;
    private static final long OPT_BIT_CONTAINED = 0x10L;
    private static final long OPT_BIT_EXTENSION = 0x20L;
    private static final long OPT_BIT_SOURCE = 0x40L;
    private static final long OPT_BIT_MOIETY = 0x80L;
    private static final long OPT_BIT_STRUCTURE = 0x100L;
    private static final long OPT_BIT_CODE = 0x200L;
    private static final long OPT_BIT_STATUS = 0x400L;
    private static final long OPT_BIT_POLYMER = 0x800L;
    private static final long OPT_BIT_PROTEIN = 0x1000L;
    private static final long OPT_BIT_TEXT = 0x2000L;
    private static final long OPT_BIT_META = 0x4000L;
    private static final long OPT_BIT_ID = 0x8000L;
    private static final long OPT_BIT_TYPE = 0x10000L;
    private static final long OPT_BIT_MOLECULAR_WEIGHT = 0x20000L;
    private static final long OPT_BIT_LANGUAGE = 0x40000L;
    private static final long OPT_BIT_PROPERTY = 0x80000L;
    private static final long OPT_BIT_NUCLEIC_ACID = 0x100000L;
    private static final long OPT_BIT_DOMAIN = 0x200000L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x400000L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x800000L;
    private static final long OPT_BIT_NAME = 0x1000000L;
    private static final long OPT_BIT_DESCRIPTION = 0x2000000L;
    private static final long OPT_BIT_REFERENCE_INFORMATION = 0x4000000L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable Reference sourceMaterial;
    private @Nullable List<SubstanceSpecification_Relationship> relationship;
    private @Nullable Identifier identifier;
    private @Nullable String comment;
    private @Nullable List<ResourceList> contained;
    private @Nullable List<Extension> extension;
    private @Nullable List<Reference> source;
    private @Nullable List<SubstanceSpecification_Moiety> moiety;
    private @Nullable SubstanceSpecification_Structure structure;
    private @Nullable List<SubstanceSpecification_Code> code;
    private @Nullable CodeableConcept status;
    private @Nullable Reference polymer;
    private @Nullable Reference protein;
    private @Nullable Narrative text;
    private @Nullable Meta meta;
    private @Nullable Id id;
    private @Nullable CodeableConcept type;
    private @Nullable List<SubstanceSpecification_MolecularWeight> molecularWeight;
    private @Nullable Code language;
    private @Nullable List<SubstanceSpecification_Property> property;
    private @Nullable Reference nucleicAcid;
    private @Nullable CodeableConcept domain;
    private @Nullable Uri implicitRules;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable List<SubstanceSpecification_Name> name;
    private @Nullable String resourceType;
    private @Nullable String description;
    private @Nullable Reference referenceInformation;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification#sourceMaterial() sourceMaterial} to sourceMaterial.
     * @param sourceMaterial The value for sourceMaterial
     * @return {@code this} builder for chained invocation
     */
    public final Builder sourceMaterial(Reference sourceMaterial) {
      checkNotIsSet(sourceMaterialIsSet(), "sourceMaterial");
      this.sourceMaterial = Objects.requireNonNull(sourceMaterial, "sourceMaterial");
      optBits |= OPT_BIT_SOURCE_MATERIAL;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification#sourceMaterial() sourceMaterial} to sourceMaterial.
     * @param sourceMaterial The value for sourceMaterial
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("sourceMaterial")
    public final Builder sourceMaterial(Optional<? extends Reference> sourceMaterial) {
      checkNotIsSet(sourceMaterialIsSet(), "sourceMaterial");
      this.sourceMaterial = sourceMaterial.orElse(null);
      optBits |= OPT_BIT_SOURCE_MATERIAL;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification#relationship() relationship} to relationship.
     * @param relationship The value for relationship
     * @return {@code this} builder for chained invocation
     */
    public final Builder relationship(List<SubstanceSpecification_Relationship> relationship) {
      checkNotIsSet(relationshipIsSet(), "relationship");
      this.relationship = Objects.requireNonNull(relationship, "relationship");
      optBits |= OPT_BIT_RELATIONSHIP;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification#relationship() relationship} to relationship.
     * @param relationship The value for relationship
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("relationship")
    public final Builder relationship(Optional<? extends List<SubstanceSpecification_Relationship>> relationship) {
      checkNotIsSet(relationshipIsSet(), "relationship");
      this.relationship = relationship.orElse(null);
      optBits |= OPT_BIT_RELATIONSHIP;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link SubstanceSpecification#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link SubstanceSpecification#comment() comment} to comment.
     * @param comment The value for comment
     * @return {@code this} builder for chained invocation
     */
    public final Builder comment(String comment) {
      checkNotIsSet(commentIsSet(), "comment");
      this.comment = Objects.requireNonNull(comment, "comment");
      optBits |= OPT_BIT_COMMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification#comment() comment} to comment.
     * @param comment The value for comment
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("comment")
    public final Builder comment(Optional<String> comment) {
      checkNotIsSet(commentIsSet(), "comment");
      this.comment = comment.orElse(null);
      optBits |= OPT_BIT_COMMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification#contained() contained} to contained.
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
     * Initializes the optional value {@link SubstanceSpecification#contained() contained} to contained.
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
     * Initializes the optional value {@link SubstanceSpecification#extension() extension} to extension.
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
     * Initializes the optional value {@link SubstanceSpecification#extension() extension} to extension.
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
     * Initializes the optional value {@link SubstanceSpecification#source() source} to source.
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
     * Initializes the optional value {@link SubstanceSpecification#source() source} to source.
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
     * Initializes the optional value {@link SubstanceSpecification#moiety() moiety} to moiety.
     * @param moiety The value for moiety
     * @return {@code this} builder for chained invocation
     */
    public final Builder moiety(List<SubstanceSpecification_Moiety> moiety) {
      checkNotIsSet(moietyIsSet(), "moiety");
      this.moiety = Objects.requireNonNull(moiety, "moiety");
      optBits |= OPT_BIT_MOIETY;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification#moiety() moiety} to moiety.
     * @param moiety The value for moiety
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("moiety")
    public final Builder moiety(Optional<? extends List<SubstanceSpecification_Moiety>> moiety) {
      checkNotIsSet(moietyIsSet(), "moiety");
      this.moiety = moiety.orElse(null);
      optBits |= OPT_BIT_MOIETY;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification#structure() structure} to structure.
     * @param structure The value for structure
     * @return {@code this} builder for chained invocation
     */
    public final Builder structure(SubstanceSpecification_Structure structure) {
      checkNotIsSet(structureIsSet(), "structure");
      this.structure = Objects.requireNonNull(structure, "structure");
      optBits |= OPT_BIT_STRUCTURE;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification#structure() structure} to structure.
     * @param structure The value for structure
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("structure")
    public final Builder structure(Optional<? extends SubstanceSpecification_Structure> structure) {
      checkNotIsSet(structureIsSet(), "structure");
      this.structure = structure.orElse(null);
      optBits |= OPT_BIT_STRUCTURE;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for chained invocation
     */
    public final Builder code(List<SubstanceSpecification_Code> code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = Objects.requireNonNull(code, "code");
      optBits |= OPT_BIT_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("code")
    public final Builder code(Optional<? extends List<SubstanceSpecification_Code>> code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = code.orElse(null);
      optBits |= OPT_BIT_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(CodeableConcept status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("status")
    public final Builder status(Optional<? extends CodeableConcept> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification#polymer() polymer} to polymer.
     * @param polymer The value for polymer
     * @return {@code this} builder for chained invocation
     */
    public final Builder polymer(Reference polymer) {
      checkNotIsSet(polymerIsSet(), "polymer");
      this.polymer = Objects.requireNonNull(polymer, "polymer");
      optBits |= OPT_BIT_POLYMER;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification#polymer() polymer} to polymer.
     * @param polymer The value for polymer
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("polymer")
    public final Builder polymer(Optional<? extends Reference> polymer) {
      checkNotIsSet(polymerIsSet(), "polymer");
      this.polymer = polymer.orElse(null);
      optBits |= OPT_BIT_POLYMER;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification#protein() protein} to protein.
     * @param protein The value for protein
     * @return {@code this} builder for chained invocation
     */
    public final Builder protein(Reference protein) {
      checkNotIsSet(proteinIsSet(), "protein");
      this.protein = Objects.requireNonNull(protein, "protein");
      optBits |= OPT_BIT_PROTEIN;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification#protein() protein} to protein.
     * @param protein The value for protein
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("protein")
    public final Builder protein(Optional<? extends Reference> protein) {
      checkNotIsSet(proteinIsSet(), "protein");
      this.protein = protein.orElse(null);
      optBits |= OPT_BIT_PROTEIN;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification#text() text} to text.
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
     * Initializes the optional value {@link SubstanceSpecification#text() text} to text.
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
     * Initializes the optional value {@link SubstanceSpecification#meta() meta} to meta.
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
     * Initializes the optional value {@link SubstanceSpecification#meta() meta} to meta.
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
     * Initializes the optional value {@link SubstanceSpecification#id() id} to id.
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
     * Initializes the optional value {@link SubstanceSpecification#id() id} to id.
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
     * Initializes the optional value {@link SubstanceSpecification#type() type} to type.
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
     * Initializes the optional value {@link SubstanceSpecification#type() type} to type.
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
     * Initializes the optional value {@link SubstanceSpecification#molecularWeight() molecularWeight} to molecularWeight.
     * @param molecularWeight The value for molecularWeight
     * @return {@code this} builder for chained invocation
     */
    public final Builder molecularWeight(List<SubstanceSpecification_MolecularWeight> molecularWeight) {
      checkNotIsSet(molecularWeightIsSet(), "molecularWeight");
      this.molecularWeight = Objects.requireNonNull(molecularWeight, "molecularWeight");
      optBits |= OPT_BIT_MOLECULAR_WEIGHT;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification#molecularWeight() molecularWeight} to molecularWeight.
     * @param molecularWeight The value for molecularWeight
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("molecularWeight")
    public final Builder molecularWeight(Optional<? extends List<SubstanceSpecification_MolecularWeight>> molecularWeight) {
      checkNotIsSet(molecularWeightIsSet(), "molecularWeight");
      this.molecularWeight = molecularWeight.orElse(null);
      optBits |= OPT_BIT_MOLECULAR_WEIGHT;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification#language() language} to language.
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
     * Initializes the optional value {@link SubstanceSpecification#language() language} to language.
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
     * Initializes the optional value {@link SubstanceSpecification#property() property} to property.
     * @param property The value for property
     * @return {@code this} builder for chained invocation
     */
    public final Builder property(List<SubstanceSpecification_Property> property) {
      checkNotIsSet(propertyIsSet(), "property");
      this.property = Objects.requireNonNull(property, "property");
      optBits |= OPT_BIT_PROPERTY;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification#property() property} to property.
     * @param property The value for property
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("property")
    public final Builder property(Optional<? extends List<SubstanceSpecification_Property>> property) {
      checkNotIsSet(propertyIsSet(), "property");
      this.property = property.orElse(null);
      optBits |= OPT_BIT_PROPERTY;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification#nucleicAcid() nucleicAcid} to nucleicAcid.
     * @param nucleicAcid The value for nucleicAcid
     * @return {@code this} builder for chained invocation
     */
    public final Builder nucleicAcid(Reference nucleicAcid) {
      checkNotIsSet(nucleicAcidIsSet(), "nucleicAcid");
      this.nucleicAcid = Objects.requireNonNull(nucleicAcid, "nucleicAcid");
      optBits |= OPT_BIT_NUCLEIC_ACID;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification#nucleicAcid() nucleicAcid} to nucleicAcid.
     * @param nucleicAcid The value for nucleicAcid
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("nucleicAcid")
    public final Builder nucleicAcid(Optional<? extends Reference> nucleicAcid) {
      checkNotIsSet(nucleicAcidIsSet(), "nucleicAcid");
      this.nucleicAcid = nucleicAcid.orElse(null);
      optBits |= OPT_BIT_NUCLEIC_ACID;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification#domain() domain} to domain.
     * @param domain The value for domain
     * @return {@code this} builder for chained invocation
     */
    public final Builder domain(CodeableConcept domain) {
      checkNotIsSet(domainIsSet(), "domain");
      this.domain = Objects.requireNonNull(domain, "domain");
      optBits |= OPT_BIT_DOMAIN;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification#domain() domain} to domain.
     * @param domain The value for domain
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("domain")
    public final Builder domain(Optional<? extends CodeableConcept> domain) {
      checkNotIsSet(domainIsSet(), "domain");
      this.domain = domain.orElse(null);
      optBits |= OPT_BIT_DOMAIN;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link SubstanceSpecification#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link SubstanceSpecification#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link SubstanceSpecification#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link SubstanceSpecification#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for chained invocation
     */
    public final Builder name(List<SubstanceSpecification_Name> name) {
      checkNotIsSet(nameIsSet(), "name");
      this.name = Objects.requireNonNull(name, "name");
      optBits |= OPT_BIT_NAME;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("name")
    public final Builder name(Optional<? extends List<SubstanceSpecification_Name>> name) {
      checkNotIsSet(nameIsSet(), "name");
      this.name = name.orElse(null);
      optBits |= OPT_BIT_NAME;
      return this;
    }

    /**
     * Initializes the value for the {@link SubstanceSpecification#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link SubstanceSpecification#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for chained invocation
     */
    public final Builder description(String description) {
      checkNotIsSet(descriptionIsSet(), "description");
      this.description = Objects.requireNonNull(description, "description");
      optBits |= OPT_BIT_DESCRIPTION;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("description")
    public final Builder description(Optional<String> description) {
      checkNotIsSet(descriptionIsSet(), "description");
      this.description = description.orElse(null);
      optBits |= OPT_BIT_DESCRIPTION;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification#referenceInformation() referenceInformation} to referenceInformation.
     * @param referenceInformation The value for referenceInformation
     * @return {@code this} builder for chained invocation
     */
    public final Builder referenceInformation(Reference referenceInformation) {
      checkNotIsSet(referenceInformationIsSet(), "referenceInformation");
      this.referenceInformation = Objects.requireNonNull(referenceInformation, "referenceInformation");
      optBits |= OPT_BIT_REFERENCE_INFORMATION;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification#referenceInformation() referenceInformation} to referenceInformation.
     * @param referenceInformation The value for referenceInformation
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("referenceInformation")
    public final Builder referenceInformation(Optional<? extends Reference> referenceInformation) {
      checkNotIsSet(referenceInformationIsSet(), "referenceInformation");
      this.referenceInformation = referenceInformation.orElse(null);
      optBits |= OPT_BIT_REFERENCE_INFORMATION;
      return this;
    }

    /**
     * Builds a new {@link SubstanceSpecification SubstanceSpecification}.
     * @return An immutable instance of SubstanceSpecification
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public SubstanceSpecification build() {
      checkRequiredAttributes();
      return new ImmutableSubstanceSpecification(
          sourceMaterial,
          relationship,
          identifier,
          comment,
          contained,
          extension,
          source,
          moiety,
          structure,
          code,
          status,
          polymer,
          protein,
          text,
          meta,
          id,
          type,
          molecularWeight,
          language,
          property,
          nucleicAcid,
          domain,
          implicitRules,
          modifierExtension,
          name,
          resourceType,
          description,
          referenceInformation);
    }

    private boolean sourceMaterialIsSet() {
      return (optBits & OPT_BIT_SOURCE_MATERIAL) != 0;
    }

    private boolean relationshipIsSet() {
      return (optBits & OPT_BIT_RELATIONSHIP) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean commentIsSet() {
      return (optBits & OPT_BIT_COMMENT) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean sourceIsSet() {
      return (optBits & OPT_BIT_SOURCE) != 0;
    }

    private boolean moietyIsSet() {
      return (optBits & OPT_BIT_MOIETY) != 0;
    }

    private boolean structureIsSet() {
      return (optBits & OPT_BIT_STRUCTURE) != 0;
    }

    private boolean codeIsSet() {
      return (optBits & OPT_BIT_CODE) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean polymerIsSet() {
      return (optBits & OPT_BIT_POLYMER) != 0;
    }

    private boolean proteinIsSet() {
      return (optBits & OPT_BIT_PROTEIN) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean molecularWeightIsSet() {
      return (optBits & OPT_BIT_MOLECULAR_WEIGHT) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean propertyIsSet() {
      return (optBits & OPT_BIT_PROPERTY) != 0;
    }

    private boolean nucleicAcidIsSet() {
      return (optBits & OPT_BIT_NUCLEIC_ACID) != 0;
    }

    private boolean domainIsSet() {
      return (optBits & OPT_BIT_DOMAIN) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean nameIsSet() {
      return (optBits & OPT_BIT_NAME) != 0;
    }

    private boolean descriptionIsSet() {
      return (optBits & OPT_BIT_DESCRIPTION) != 0;
    }

    private boolean referenceInformationIsSet() {
      return (optBits & OPT_BIT_REFERENCE_INFORMATION) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of SubstanceSpecification is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build SubstanceSpecification, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "SubstanceSpecification", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link SubstanceSpecification#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(String resourceType);
  }

  @Generated(from = "SubstanceSpecification", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link SubstanceSpecification#sourceMaterial() sourceMaterial} to sourceMaterial.
     * @param sourceMaterial The value for sourceMaterial
     * @return {@code this} builder for chained invocation
     */
    BuildFinal sourceMaterial(Reference sourceMaterial);

    /**
     * Initializes the optional value {@link SubstanceSpecification#sourceMaterial() sourceMaterial} to sourceMaterial.
     * @param sourceMaterial The value for sourceMaterial
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal sourceMaterial(Optional<? extends Reference> sourceMaterial);

    /**
     * Initializes the optional value {@link SubstanceSpecification#relationship() relationship} to relationship.
     * @param relationship The value for relationship
     * @return {@code this} builder for chained invocation
     */
    BuildFinal relationship(List<SubstanceSpecification_Relationship> relationship);

    /**
     * Initializes the optional value {@link SubstanceSpecification#relationship() relationship} to relationship.
     * @param relationship The value for relationship
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal relationship(Optional<? extends List<SubstanceSpecification_Relationship>> relationship);

    /**
     * Initializes the optional value {@link SubstanceSpecification#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(Identifier identifier);

    /**
     * Initializes the optional value {@link SubstanceSpecification#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(Optional<? extends Identifier> identifier);

    /**
     * Initializes the optional value {@link SubstanceSpecification#comment() comment} to comment.
     * @param comment The value for comment
     * @return {@code this} builder for chained invocation
     */
    BuildFinal comment(String comment);

    /**
     * Initializes the optional value {@link SubstanceSpecification#comment() comment} to comment.
     * @param comment The value for comment
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal comment(Optional<String> comment);

    /**
     * Initializes the optional value {@link SubstanceSpecification#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(List<ResourceList> contained);

    /**
     * Initializes the optional value {@link SubstanceSpecification#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(Optional<? extends List<ResourceList>> contained);

    /**
     * Initializes the optional value {@link SubstanceSpecification#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link SubstanceSpecification#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link SubstanceSpecification#source() source} to source.
     * @param source The value for source
     * @return {@code this} builder for chained invocation
     */
    BuildFinal source(List<Reference> source);

    /**
     * Initializes the optional value {@link SubstanceSpecification#source() source} to source.
     * @param source The value for source
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal source(Optional<? extends List<Reference>> source);

    /**
     * Initializes the optional value {@link SubstanceSpecification#moiety() moiety} to moiety.
     * @param moiety The value for moiety
     * @return {@code this} builder for chained invocation
     */
    BuildFinal moiety(List<SubstanceSpecification_Moiety> moiety);

    /**
     * Initializes the optional value {@link SubstanceSpecification#moiety() moiety} to moiety.
     * @param moiety The value for moiety
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal moiety(Optional<? extends List<SubstanceSpecification_Moiety>> moiety);

    /**
     * Initializes the optional value {@link SubstanceSpecification#structure() structure} to structure.
     * @param structure The value for structure
     * @return {@code this} builder for chained invocation
     */
    BuildFinal structure(SubstanceSpecification_Structure structure);

    /**
     * Initializes the optional value {@link SubstanceSpecification#structure() structure} to structure.
     * @param structure The value for structure
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal structure(Optional<? extends SubstanceSpecification_Structure> structure);

    /**
     * Initializes the optional value {@link SubstanceSpecification#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for chained invocation
     */
    BuildFinal code(List<SubstanceSpecification_Code> code);

    /**
     * Initializes the optional value {@link SubstanceSpecification#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal code(Optional<? extends List<SubstanceSpecification_Code>> code);

    /**
     * Initializes the optional value {@link SubstanceSpecification#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(CodeableConcept status);

    /**
     * Initializes the optional value {@link SubstanceSpecification#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(Optional<? extends CodeableConcept> status);

    /**
     * Initializes the optional value {@link SubstanceSpecification#polymer() polymer} to polymer.
     * @param polymer The value for polymer
     * @return {@code this} builder for chained invocation
     */
    BuildFinal polymer(Reference polymer);

    /**
     * Initializes the optional value {@link SubstanceSpecification#polymer() polymer} to polymer.
     * @param polymer The value for polymer
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal polymer(Optional<? extends Reference> polymer);

    /**
     * Initializes the optional value {@link SubstanceSpecification#protein() protein} to protein.
     * @param protein The value for protein
     * @return {@code this} builder for chained invocation
     */
    BuildFinal protein(Reference protein);

    /**
     * Initializes the optional value {@link SubstanceSpecification#protein() protein} to protein.
     * @param protein The value for protein
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal protein(Optional<? extends Reference> protein);

    /**
     * Initializes the optional value {@link SubstanceSpecification#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(Narrative text);

    /**
     * Initializes the optional value {@link SubstanceSpecification#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(Optional<? extends Narrative> text);

    /**
     * Initializes the optional value {@link SubstanceSpecification#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(Meta meta);

    /**
     * Initializes the optional value {@link SubstanceSpecification#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(Optional<? extends Meta> meta);

    /**
     * Initializes the optional value {@link SubstanceSpecification#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(Id id);

    /**
     * Initializes the optional value {@link SubstanceSpecification#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<? extends Id> id);

    /**
     * Initializes the optional value {@link SubstanceSpecification#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    BuildFinal type(CodeableConcept type);

    /**
     * Initializes the optional value {@link SubstanceSpecification#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal type(Optional<? extends CodeableConcept> type);

    /**
     * Initializes the optional value {@link SubstanceSpecification#molecularWeight() molecularWeight} to molecularWeight.
     * @param molecularWeight The value for molecularWeight
     * @return {@code this} builder for chained invocation
     */
    BuildFinal molecularWeight(List<SubstanceSpecification_MolecularWeight> molecularWeight);

    /**
     * Initializes the optional value {@link SubstanceSpecification#molecularWeight() molecularWeight} to molecularWeight.
     * @param molecularWeight The value for molecularWeight
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal molecularWeight(Optional<? extends List<SubstanceSpecification_MolecularWeight>> molecularWeight);

    /**
     * Initializes the optional value {@link SubstanceSpecification#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(Code language);

    /**
     * Initializes the optional value {@link SubstanceSpecification#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(Optional<? extends Code> language);

    /**
     * Initializes the optional value {@link SubstanceSpecification#property() property} to property.
     * @param property The value for property
     * @return {@code this} builder for chained invocation
     */
    BuildFinal property(List<SubstanceSpecification_Property> property);

    /**
     * Initializes the optional value {@link SubstanceSpecification#property() property} to property.
     * @param property The value for property
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal property(Optional<? extends List<SubstanceSpecification_Property>> property);

    /**
     * Initializes the optional value {@link SubstanceSpecification#nucleicAcid() nucleicAcid} to nucleicAcid.
     * @param nucleicAcid The value for nucleicAcid
     * @return {@code this} builder for chained invocation
     */
    BuildFinal nucleicAcid(Reference nucleicAcid);

    /**
     * Initializes the optional value {@link SubstanceSpecification#nucleicAcid() nucleicAcid} to nucleicAcid.
     * @param nucleicAcid The value for nucleicAcid
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal nucleicAcid(Optional<? extends Reference> nucleicAcid);

    /**
     * Initializes the optional value {@link SubstanceSpecification#domain() domain} to domain.
     * @param domain The value for domain
     * @return {@code this} builder for chained invocation
     */
    BuildFinal domain(CodeableConcept domain);

    /**
     * Initializes the optional value {@link SubstanceSpecification#domain() domain} to domain.
     * @param domain The value for domain
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal domain(Optional<? extends CodeableConcept> domain);

    /**
     * Initializes the optional value {@link SubstanceSpecification#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(Uri implicitRules);

    /**
     * Initializes the optional value {@link SubstanceSpecification#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(Optional<? extends Uri> implicitRules);

    /**
     * Initializes the optional value {@link SubstanceSpecification#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link SubstanceSpecification#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link SubstanceSpecification#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for chained invocation
     */
    BuildFinal name(List<SubstanceSpecification_Name> name);

    /**
     * Initializes the optional value {@link SubstanceSpecification#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal name(Optional<? extends List<SubstanceSpecification_Name>> name);

    /**
     * Initializes the optional value {@link SubstanceSpecification#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for chained invocation
     */
    BuildFinal description(String description);

    /**
     * Initializes the optional value {@link SubstanceSpecification#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal description(Optional<String> description);

    /**
     * Initializes the optional value {@link SubstanceSpecification#referenceInformation() referenceInformation} to referenceInformation.
     * @param referenceInformation The value for referenceInformation
     * @return {@code this} builder for chained invocation
     */
    BuildFinal referenceInformation(Reference referenceInformation);

    /**
     * Initializes the optional value {@link SubstanceSpecification#referenceInformation() referenceInformation} to referenceInformation.
     * @param referenceInformation The value for referenceInformation
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal referenceInformation(Optional<? extends Reference> referenceInformation);

    /**
     * Builds a new {@link SubstanceSpecification SubstanceSpecification}.
     * @return An immutable instance of SubstanceSpecification
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    SubstanceSpecification build();
  }
}