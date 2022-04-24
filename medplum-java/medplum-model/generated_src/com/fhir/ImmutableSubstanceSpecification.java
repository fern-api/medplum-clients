//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link SubstanceSpecification}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableSubstanceSpecification.builder()}.
 */
@org.immutables.value.Generated(from = "SubstanceSpecification", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableSubstanceSpecification implements com.fhir.SubstanceSpecification {
  private final @javax.annotation.Nullable com.fhir.Identifier identifier;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> source;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept type;
  private final @javax.annotation.Nullable com.fhir.code language;
  private final @javax.annotation.Nullable com.fhir.Reference sourceMaterial;
  private final @javax.annotation.Nullable com.fhir.Reference polymer;
  private final @javax.annotation.Nullable java.util.List<com.fhir.SubstanceSpecification_Name> name;
  private final @javax.annotation.Nullable java.util.List<com.fhir.SubstanceSpecification_Relationship> relationship;
  private final @javax.annotation.Nullable com.fhir.Reference protein;
  private final @javax.annotation.Nullable com.fhir.uri implicitRules;
  private final @javax.annotation.Nullable java.lang.String comment;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
  private final @javax.annotation.Nullable java.lang.String description;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept domain;
  private final @javax.annotation.Nullable java.util.List<com.fhir.SubstanceSpecification_Code> code;
  private final @javax.annotation.Nullable java.util.List<com.fhir.SubstanceSpecification_MolecularWeight> molecularWeight;
  private final @javax.annotation.Nullable java.util.List<com.fhir.SubstanceSpecification_Property> property;
  private final @javax.annotation.Nullable com.fhir.SubstanceSpecification_Structure structure;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept status;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable com.fhir.Narrative text;
  private final @javax.annotation.Nullable com.fhir.id id;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final java.lang.String resourceType;
  private final @javax.annotation.Nullable com.fhir.Meta meta;
  private final @javax.annotation.Nullable com.fhir.Reference referenceInformation;
  private final @javax.annotation.Nullable com.fhir.Reference nucleicAcid;
  private final @javax.annotation.Nullable java.util.List<com.fhir.SubstanceSpecification_Moiety> moiety;

  private ImmutableSubstanceSpecification(
      @javax.annotation.Nullable com.fhir.Identifier identifier,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> source,
      @javax.annotation.Nullable com.fhir.CodeableConcept type,
      @javax.annotation.Nullable com.fhir.code language,
      @javax.annotation.Nullable com.fhir.Reference sourceMaterial,
      @javax.annotation.Nullable com.fhir.Reference polymer,
      @javax.annotation.Nullable java.util.List<com.fhir.SubstanceSpecification_Name> name,
      @javax.annotation.Nullable java.util.List<com.fhir.SubstanceSpecification_Relationship> relationship,
      @javax.annotation.Nullable com.fhir.Reference protein,
      @javax.annotation.Nullable com.fhir.uri implicitRules,
      @javax.annotation.Nullable java.lang.String comment,
      @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained,
      @javax.annotation.Nullable java.lang.String description,
      @javax.annotation.Nullable com.fhir.CodeableConcept domain,
      @javax.annotation.Nullable java.util.List<com.fhir.SubstanceSpecification_Code> code,
      @javax.annotation.Nullable java.util.List<com.fhir.SubstanceSpecification_MolecularWeight> molecularWeight,
      @javax.annotation.Nullable java.util.List<com.fhir.SubstanceSpecification_Property> property,
      @javax.annotation.Nullable com.fhir.SubstanceSpecification_Structure structure,
      @javax.annotation.Nullable com.fhir.CodeableConcept status,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable com.fhir.Narrative text,
      @javax.annotation.Nullable com.fhir.id id,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      java.lang.String resourceType,
      @javax.annotation.Nullable com.fhir.Meta meta,
      @javax.annotation.Nullable com.fhir.Reference referenceInformation,
      @javax.annotation.Nullable com.fhir.Reference nucleicAcid,
      @javax.annotation.Nullable java.util.List<com.fhir.SubstanceSpecification_Moiety> moiety) {
    this.identifier = identifier;
    this.source = source;
    this.type = type;
    this.language = language;
    this.sourceMaterial = sourceMaterial;
    this.polymer = polymer;
    this.name = name;
    this.relationship = relationship;
    this.protein = protein;
    this.implicitRules = implicitRules;
    this.comment = comment;
    this.contained = contained;
    this.description = description;
    this.domain = domain;
    this.code = code;
    this.molecularWeight = molecularWeight;
    this.property = property;
    this.structure = structure;
    this.status = status;
    this.modifierExtension = modifierExtension;
    this.text = text;
    this.id = id;
    this.extension = extension;
    this.resourceType = resourceType;
    this.meta = meta;
    this.referenceInformation = referenceInformation;
    this.nucleicAcid = nucleicAcid;
    this.moiety = moiety;
  }

  /**
   * @return The value of the {@code identifier} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("identifier")
  @Override
  public java.util.Optional<com.fhir.Identifier> identifier() {
    return java.util.Optional.ofNullable(identifier);
  }

  /**
   * @return The value of the {@code source} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("source")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> source() {
    return java.util.Optional.ofNullable(source);
  }

  /**
   * @return The value of the {@code type} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("type")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> type() {
    return java.util.Optional.ofNullable(type);
  }

  /**
   * @return The value of the {@code language} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("language")
  @Override
  public java.util.Optional<com.fhir.code> language() {
    return java.util.Optional.ofNullable(language);
  }

  /**
   * @return The value of the {@code sourceMaterial} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("sourceMaterial")
  @Override
  public java.util.Optional<com.fhir.Reference> sourceMaterial() {
    return java.util.Optional.ofNullable(sourceMaterial);
  }

  /**
   * @return The value of the {@code polymer} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("polymer")
  @Override
  public java.util.Optional<com.fhir.Reference> polymer() {
    return java.util.Optional.ofNullable(polymer);
  }

  /**
   * @return The value of the {@code name} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("name")
  @Override
  public java.util.Optional<java.util.List<com.fhir.SubstanceSpecification_Name>> name() {
    return java.util.Optional.ofNullable(name);
  }

  /**
   * @return The value of the {@code relationship} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("relationship")
  @Override
  public java.util.Optional<java.util.List<com.fhir.SubstanceSpecification_Relationship>> relationship() {
    return java.util.Optional.ofNullable(relationship);
  }

  /**
   * @return The value of the {@code protein} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("protein")
  @Override
  public java.util.Optional<com.fhir.Reference> protein() {
    return java.util.Optional.ofNullable(protein);
  }

  /**
   * @return The value of the {@code implicitRules} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
  @Override
  public java.util.Optional<com.fhir.uri> implicitRules() {
    return java.util.Optional.ofNullable(implicitRules);
  }

  /**
   * @return The value of the {@code comment} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("comment")
  @Override
  public java.util.Optional<java.lang.String> comment() {
    return java.util.Optional.ofNullable(comment);
  }

  /**
   * @return The value of the {@code contained} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("contained")
  @Override
  public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() {
    return java.util.Optional.ofNullable(contained);
  }

  /**
   * @return The value of the {@code description} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("description")
  @Override
  public java.util.Optional<java.lang.String> description() {
    return java.util.Optional.ofNullable(description);
  }

  /**
   * @return The value of the {@code domain} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("domain")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> domain() {
    return java.util.Optional.ofNullable(domain);
  }

  /**
   * @return The value of the {@code code} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("code")
  @Override
  public java.util.Optional<java.util.List<com.fhir.SubstanceSpecification_Code>> code() {
    return java.util.Optional.ofNullable(code);
  }

  /**
   * @return The value of the {@code molecularWeight} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("molecularWeight")
  @Override
  public java.util.Optional<java.util.List<com.fhir.SubstanceSpecification_MolecularWeight>> molecularWeight() {
    return java.util.Optional.ofNullable(molecularWeight);
  }

  /**
   * @return The value of the {@code property} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("property")
  @Override
  public java.util.Optional<java.util.List<com.fhir.SubstanceSpecification_Property>> property() {
    return java.util.Optional.ofNullable(property);
  }

  /**
   * @return The value of the {@code structure} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("structure")
  @Override
  public java.util.Optional<com.fhir.SubstanceSpecification_Structure> structure() {
    return java.util.Optional.ofNullable(structure);
  }

  /**
   * @return The value of the {@code status} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("status")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> status() {
    return java.util.Optional.ofNullable(status);
  }

  /**
   * @return The value of the {@code modifierExtension} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() {
    return java.util.Optional.ofNullable(modifierExtension);
  }

  /**
   * @return The value of the {@code text} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("text")
  @Override
  public java.util.Optional<com.fhir.Narrative> text() {
    return java.util.Optional.ofNullable(text);
  }

  /**
   * @return The value of the {@code id} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("id")
  @Override
  public java.util.Optional<com.fhir.id> id() {
    return java.util.Optional.ofNullable(id);
  }

  /**
   * @return The value of the {@code extension} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("extension")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Extension>> extension() {
    return java.util.Optional.ofNullable(extension);
  }

  /**
   * @return The value of the {@code resourceType} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
  @Override
  public java.lang.String resourceType() {
    return resourceType;
  }

  /**
   * @return The value of the {@code meta} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("meta")
  @Override
  public java.util.Optional<com.fhir.Meta> meta() {
    return java.util.Optional.ofNullable(meta);
  }

  /**
   * @return The value of the {@code referenceInformation} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("referenceInformation")
  @Override
  public java.util.Optional<com.fhir.Reference> referenceInformation() {
    return java.util.Optional.ofNullable(referenceInformation);
  }

  /**
   * @return The value of the {@code nucleicAcid} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("nucleicAcid")
  @Override
  public java.util.Optional<com.fhir.Reference> nucleicAcid() {
    return java.util.Optional.ofNullable(nucleicAcid);
  }

  /**
   * @return The value of the {@code moiety} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("moiety")
  @Override
  public java.util.Optional<java.util.List<com.fhir.SubstanceSpecification_Moiety>> moiety() {
    return java.util.Optional.ofNullable(moiety);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSpecification#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification withIdentifier(com.fhir.Identifier value) {
    @javax.annotation.Nullable com.fhir.Identifier newValue = java.util.Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableSubstanceSpecification(
        newValue,
        this.source,
        this.type,
        this.language,
        this.sourceMaterial,
        this.polymer,
        this.name,
        this.relationship,
        this.protein,
        this.implicitRules,
        this.comment,
        this.contained,
        this.description,
        this.domain,
        this.code,
        this.molecularWeight,
        this.property,
        this.structure,
        this.status,
        this.modifierExtension,
        this.text,
        this.id,
        this.extension,
        this.resourceType,
        this.meta,
        this.referenceInformation,
        this.nucleicAcid,
        this.moiety);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSpecification#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSpecification withIdentifier(java.util.Optional<? extends com.fhir.Identifier> optional) {
    @javax.annotation.Nullable com.fhir.Identifier value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableSubstanceSpecification(
        value,
        this.source,
        this.type,
        this.language,
        this.sourceMaterial,
        this.polymer,
        this.name,
        this.relationship,
        this.protein,
        this.implicitRules,
        this.comment,
        this.contained,
        this.description,
        this.domain,
        this.code,
        this.molecularWeight,
        this.property,
        this.structure,
        this.status,
        this.modifierExtension,
        this.text,
        this.id,
        this.extension,
        this.resourceType,
        this.meta,
        this.referenceInformation,
        this.nucleicAcid,
        this.moiety);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSpecification#source() source} attribute.
   * @param value The value for source
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification withSource(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "source");
    if (this.source == newValue) return this;
    return new ImmutableSubstanceSpecification(
        this.identifier,
        newValue,
        this.type,
        this.language,
        this.sourceMaterial,
        this.polymer,
        this.name,
        this.relationship,
        this.protein,
        this.implicitRules,
        this.comment,
        this.contained,
        this.description,
        this.domain,
        this.code,
        this.molecularWeight,
        this.property,
        this.structure,
        this.status,
        this.modifierExtension,
        this.text,
        this.id,
        this.extension,
        this.resourceType,
        this.meta,
        this.referenceInformation,
        this.nucleicAcid,
        this.moiety);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSpecification#source() source} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for source
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSpecification withSource(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.source == value) return this;
    return new ImmutableSubstanceSpecification(
        this.identifier,
        value,
        this.type,
        this.language,
        this.sourceMaterial,
        this.polymer,
        this.name,
        this.relationship,
        this.protein,
        this.implicitRules,
        this.comment,
        this.contained,
        this.description,
        this.domain,
        this.code,
        this.molecularWeight,
        this.property,
        this.structure,
        this.status,
        this.modifierExtension,
        this.text,
        this.id,
        this.extension,
        this.resourceType,
        this.meta,
        this.referenceInformation,
        this.nucleicAcid,
        this.moiety);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSpecification#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification withType(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutableSubstanceSpecification(
        this.identifier,
        this.source,
        newValue,
        this.language,
        this.sourceMaterial,
        this.polymer,
        this.name,
        this.relationship,
        this.protein,
        this.implicitRules,
        this.comment,
        this.contained,
        this.description,
        this.domain,
        this.code,
        this.molecularWeight,
        this.property,
        this.structure,
        this.status,
        this.modifierExtension,
        this.text,
        this.id,
        this.extension,
        this.resourceType,
        this.meta,
        this.referenceInformation,
        this.nucleicAcid,
        this.moiety);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSpecification#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSpecification withType(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutableSubstanceSpecification(
        this.identifier,
        this.source,
        value,
        this.language,
        this.sourceMaterial,
        this.polymer,
        this.name,
        this.relationship,
        this.protein,
        this.implicitRules,
        this.comment,
        this.contained,
        this.description,
        this.domain,
        this.code,
        this.molecularWeight,
        this.property,
        this.structure,
        this.status,
        this.modifierExtension,
        this.text,
        this.id,
        this.extension,
        this.resourceType,
        this.meta,
        this.referenceInformation,
        this.nucleicAcid,
        this.moiety);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSpecification#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification withLanguage(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableSubstanceSpecification(
        this.identifier,
        this.source,
        this.type,
        newValue,
        this.sourceMaterial,
        this.polymer,
        this.name,
        this.relationship,
        this.protein,
        this.implicitRules,
        this.comment,
        this.contained,
        this.description,
        this.domain,
        this.code,
        this.molecularWeight,
        this.property,
        this.structure,
        this.status,
        this.modifierExtension,
        this.text,
        this.id,
        this.extension,
        this.resourceType,
        this.meta,
        this.referenceInformation,
        this.nucleicAcid,
        this.moiety);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSpecification#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSpecification withLanguage(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableSubstanceSpecification(
        this.identifier,
        this.source,
        this.type,
        value,
        this.sourceMaterial,
        this.polymer,
        this.name,
        this.relationship,
        this.protein,
        this.implicitRules,
        this.comment,
        this.contained,
        this.description,
        this.domain,
        this.code,
        this.molecularWeight,
        this.property,
        this.structure,
        this.status,
        this.modifierExtension,
        this.text,
        this.id,
        this.extension,
        this.resourceType,
        this.meta,
        this.referenceInformation,
        this.nucleicAcid,
        this.moiety);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSpecification#sourceMaterial() sourceMaterial} attribute.
   * @param value The value for sourceMaterial
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification withSourceMaterial(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "sourceMaterial");
    if (this.sourceMaterial == newValue) return this;
    return new ImmutableSubstanceSpecification(
        this.identifier,
        this.source,
        this.type,
        this.language,
        newValue,
        this.polymer,
        this.name,
        this.relationship,
        this.protein,
        this.implicitRules,
        this.comment,
        this.contained,
        this.description,
        this.domain,
        this.code,
        this.molecularWeight,
        this.property,
        this.structure,
        this.status,
        this.modifierExtension,
        this.text,
        this.id,
        this.extension,
        this.resourceType,
        this.meta,
        this.referenceInformation,
        this.nucleicAcid,
        this.moiety);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSpecification#sourceMaterial() sourceMaterial} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for sourceMaterial
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSpecification withSourceMaterial(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.sourceMaterial == value) return this;
    return new ImmutableSubstanceSpecification(
        this.identifier,
        this.source,
        this.type,
        this.language,
        value,
        this.polymer,
        this.name,
        this.relationship,
        this.protein,
        this.implicitRules,
        this.comment,
        this.contained,
        this.description,
        this.domain,
        this.code,
        this.molecularWeight,
        this.property,
        this.structure,
        this.status,
        this.modifierExtension,
        this.text,
        this.id,
        this.extension,
        this.resourceType,
        this.meta,
        this.referenceInformation,
        this.nucleicAcid,
        this.moiety);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSpecification#polymer() polymer} attribute.
   * @param value The value for polymer
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification withPolymer(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "polymer");
    if (this.polymer == newValue) return this;
    return new ImmutableSubstanceSpecification(
        this.identifier,
        this.source,
        this.type,
        this.language,
        this.sourceMaterial,
        newValue,
        this.name,
        this.relationship,
        this.protein,
        this.implicitRules,
        this.comment,
        this.contained,
        this.description,
        this.domain,
        this.code,
        this.molecularWeight,
        this.property,
        this.structure,
        this.status,
        this.modifierExtension,
        this.text,
        this.id,
        this.extension,
        this.resourceType,
        this.meta,
        this.referenceInformation,
        this.nucleicAcid,
        this.moiety);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSpecification#polymer() polymer} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for polymer
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSpecification withPolymer(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.polymer == value) return this;
    return new ImmutableSubstanceSpecification(
        this.identifier,
        this.source,
        this.type,
        this.language,
        this.sourceMaterial,
        value,
        this.name,
        this.relationship,
        this.protein,
        this.implicitRules,
        this.comment,
        this.contained,
        this.description,
        this.domain,
        this.code,
        this.molecularWeight,
        this.property,
        this.structure,
        this.status,
        this.modifierExtension,
        this.text,
        this.id,
        this.extension,
        this.resourceType,
        this.meta,
        this.referenceInformation,
        this.nucleicAcid,
        this.moiety);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSpecification#name() name} attribute.
   * @param value The value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification withName(java.util.List<com.fhir.SubstanceSpecification_Name> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.SubstanceSpecification_Name> newValue = java.util.Objects.requireNonNull(value, "name");
    if (this.name == newValue) return this;
    return new ImmutableSubstanceSpecification(
        this.identifier,
        this.source,
        this.type,
        this.language,
        this.sourceMaterial,
        this.polymer,
        newValue,
        this.relationship,
        this.protein,
        this.implicitRules,
        this.comment,
        this.contained,
        this.description,
        this.domain,
        this.code,
        this.molecularWeight,
        this.property,
        this.structure,
        this.status,
        this.modifierExtension,
        this.text,
        this.id,
        this.extension,
        this.resourceType,
        this.meta,
        this.referenceInformation,
        this.nucleicAcid,
        this.moiety);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSpecification#name() name} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for name
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSpecification withName(java.util.Optional<? extends java.util.List<com.fhir.SubstanceSpecification_Name>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.SubstanceSpecification_Name> value = optional.orElse(null);
    if (this.name == value) return this;
    return new ImmutableSubstanceSpecification(
        this.identifier,
        this.source,
        this.type,
        this.language,
        this.sourceMaterial,
        this.polymer,
        value,
        this.relationship,
        this.protein,
        this.implicitRules,
        this.comment,
        this.contained,
        this.description,
        this.domain,
        this.code,
        this.molecularWeight,
        this.property,
        this.structure,
        this.status,
        this.modifierExtension,
        this.text,
        this.id,
        this.extension,
        this.resourceType,
        this.meta,
        this.referenceInformation,
        this.nucleicAcid,
        this.moiety);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSpecification#relationship() relationship} attribute.
   * @param value The value for relationship
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification withRelationship(java.util.List<com.fhir.SubstanceSpecification_Relationship> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.SubstanceSpecification_Relationship> newValue = java.util.Objects.requireNonNull(value, "relationship");
    if (this.relationship == newValue) return this;
    return new ImmutableSubstanceSpecification(
        this.identifier,
        this.source,
        this.type,
        this.language,
        this.sourceMaterial,
        this.polymer,
        this.name,
        newValue,
        this.protein,
        this.implicitRules,
        this.comment,
        this.contained,
        this.description,
        this.domain,
        this.code,
        this.molecularWeight,
        this.property,
        this.structure,
        this.status,
        this.modifierExtension,
        this.text,
        this.id,
        this.extension,
        this.resourceType,
        this.meta,
        this.referenceInformation,
        this.nucleicAcid,
        this.moiety);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSpecification#relationship() relationship} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for relationship
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSpecification withRelationship(java.util.Optional<? extends java.util.List<com.fhir.SubstanceSpecification_Relationship>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.SubstanceSpecification_Relationship> value = optional.orElse(null);
    if (this.relationship == value) return this;
    return new ImmutableSubstanceSpecification(
        this.identifier,
        this.source,
        this.type,
        this.language,
        this.sourceMaterial,
        this.polymer,
        this.name,
        value,
        this.protein,
        this.implicitRules,
        this.comment,
        this.contained,
        this.description,
        this.domain,
        this.code,
        this.molecularWeight,
        this.property,
        this.structure,
        this.status,
        this.modifierExtension,
        this.text,
        this.id,
        this.extension,
        this.resourceType,
        this.meta,
        this.referenceInformation,
        this.nucleicAcid,
        this.moiety);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSpecification#protein() protein} attribute.
   * @param value The value for protein
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification withProtein(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "protein");
    if (this.protein == newValue) return this;
    return new ImmutableSubstanceSpecification(
        this.identifier,
        this.source,
        this.type,
        this.language,
        this.sourceMaterial,
        this.polymer,
        this.name,
        this.relationship,
        newValue,
        this.implicitRules,
        this.comment,
        this.contained,
        this.description,
        this.domain,
        this.code,
        this.molecularWeight,
        this.property,
        this.structure,
        this.status,
        this.modifierExtension,
        this.text,
        this.id,
        this.extension,
        this.resourceType,
        this.meta,
        this.referenceInformation,
        this.nucleicAcid,
        this.moiety);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSpecification#protein() protein} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for protein
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSpecification withProtein(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.protein == value) return this;
    return new ImmutableSubstanceSpecification(
        this.identifier,
        this.source,
        this.type,
        this.language,
        this.sourceMaterial,
        this.polymer,
        this.name,
        this.relationship,
        value,
        this.implicitRules,
        this.comment,
        this.contained,
        this.description,
        this.domain,
        this.code,
        this.molecularWeight,
        this.property,
        this.structure,
        this.status,
        this.modifierExtension,
        this.text,
        this.id,
        this.extension,
        this.resourceType,
        this.meta,
        this.referenceInformation,
        this.nucleicAcid,
        this.moiety);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSpecification#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification withImplicitRules(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableSubstanceSpecification(
        this.identifier,
        this.source,
        this.type,
        this.language,
        this.sourceMaterial,
        this.polymer,
        this.name,
        this.relationship,
        this.protein,
        newValue,
        this.comment,
        this.contained,
        this.description,
        this.domain,
        this.code,
        this.molecularWeight,
        this.property,
        this.structure,
        this.status,
        this.modifierExtension,
        this.text,
        this.id,
        this.extension,
        this.resourceType,
        this.meta,
        this.referenceInformation,
        this.nucleicAcid,
        this.moiety);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSpecification#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSpecification withImplicitRules(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableSubstanceSpecification(
        this.identifier,
        this.source,
        this.type,
        this.language,
        this.sourceMaterial,
        this.polymer,
        this.name,
        this.relationship,
        this.protein,
        value,
        this.comment,
        this.contained,
        this.description,
        this.domain,
        this.code,
        this.molecularWeight,
        this.property,
        this.structure,
        this.status,
        this.modifierExtension,
        this.text,
        this.id,
        this.extension,
        this.resourceType,
        this.meta,
        this.referenceInformation,
        this.nucleicAcid,
        this.moiety);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSpecification#comment() comment} attribute.
   * @param value The value for comment
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification withComment(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "comment");
    if (java.util.Objects.equals(this.comment, newValue)) return this;
    return new ImmutableSubstanceSpecification(
        this.identifier,
        this.source,
        this.type,
        this.language,
        this.sourceMaterial,
        this.polymer,
        this.name,
        this.relationship,
        this.protein,
        this.implicitRules,
        newValue,
        this.contained,
        this.description,
        this.domain,
        this.code,
        this.molecularWeight,
        this.property,
        this.structure,
        this.status,
        this.modifierExtension,
        this.text,
        this.id,
        this.extension,
        this.resourceType,
        this.meta,
        this.referenceInformation,
        this.nucleicAcid,
        this.moiety);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSpecification#comment() comment} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for comment
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification withComment(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.comment, value)) return this;
    return new ImmutableSubstanceSpecification(
        this.identifier,
        this.source,
        this.type,
        this.language,
        this.sourceMaterial,
        this.polymer,
        this.name,
        this.relationship,
        this.protein,
        this.implicitRules,
        value,
        this.contained,
        this.description,
        this.domain,
        this.code,
        this.molecularWeight,
        this.property,
        this.structure,
        this.status,
        this.modifierExtension,
        this.text,
        this.id,
        this.extension,
        this.resourceType,
        this.meta,
        this.referenceInformation,
        this.nucleicAcid,
        this.moiety);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSpecification#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification withContained(java.util.List<com.fhir.ResourceList> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> newValue = java.util.Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableSubstanceSpecification(
        this.identifier,
        this.source,
        this.type,
        this.language,
        this.sourceMaterial,
        this.polymer,
        this.name,
        this.relationship,
        this.protein,
        this.implicitRules,
        this.comment,
        newValue,
        this.description,
        this.domain,
        this.code,
        this.molecularWeight,
        this.property,
        this.structure,
        this.status,
        this.modifierExtension,
        this.text,
        this.id,
        this.extension,
        this.resourceType,
        this.meta,
        this.referenceInformation,
        this.nucleicAcid,
        this.moiety);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSpecification#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSpecification withContained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableSubstanceSpecification(
        this.identifier,
        this.source,
        this.type,
        this.language,
        this.sourceMaterial,
        this.polymer,
        this.name,
        this.relationship,
        this.protein,
        this.implicitRules,
        this.comment,
        value,
        this.description,
        this.domain,
        this.code,
        this.molecularWeight,
        this.property,
        this.structure,
        this.status,
        this.modifierExtension,
        this.text,
        this.id,
        this.extension,
        this.resourceType,
        this.meta,
        this.referenceInformation,
        this.nucleicAcid,
        this.moiety);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSpecification#description() description} attribute.
   * @param value The value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification withDescription(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "description");
    if (java.util.Objects.equals(this.description, newValue)) return this;
    return new ImmutableSubstanceSpecification(
        this.identifier,
        this.source,
        this.type,
        this.language,
        this.sourceMaterial,
        this.polymer,
        this.name,
        this.relationship,
        this.protein,
        this.implicitRules,
        this.comment,
        this.contained,
        newValue,
        this.domain,
        this.code,
        this.molecularWeight,
        this.property,
        this.structure,
        this.status,
        this.modifierExtension,
        this.text,
        this.id,
        this.extension,
        this.resourceType,
        this.meta,
        this.referenceInformation,
        this.nucleicAcid,
        this.moiety);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSpecification#description() description} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification withDescription(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.description, value)) return this;
    return new ImmutableSubstanceSpecification(
        this.identifier,
        this.source,
        this.type,
        this.language,
        this.sourceMaterial,
        this.polymer,
        this.name,
        this.relationship,
        this.protein,
        this.implicitRules,
        this.comment,
        this.contained,
        value,
        this.domain,
        this.code,
        this.molecularWeight,
        this.property,
        this.structure,
        this.status,
        this.modifierExtension,
        this.text,
        this.id,
        this.extension,
        this.resourceType,
        this.meta,
        this.referenceInformation,
        this.nucleicAcid,
        this.moiety);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSpecification#domain() domain} attribute.
   * @param value The value for domain
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification withDomain(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "domain");
    if (this.domain == newValue) return this;
    return new ImmutableSubstanceSpecification(
        this.identifier,
        this.source,
        this.type,
        this.language,
        this.sourceMaterial,
        this.polymer,
        this.name,
        this.relationship,
        this.protein,
        this.implicitRules,
        this.comment,
        this.contained,
        this.description,
        newValue,
        this.code,
        this.molecularWeight,
        this.property,
        this.structure,
        this.status,
        this.modifierExtension,
        this.text,
        this.id,
        this.extension,
        this.resourceType,
        this.meta,
        this.referenceInformation,
        this.nucleicAcid,
        this.moiety);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSpecification#domain() domain} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for domain
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSpecification withDomain(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.domain == value) return this;
    return new ImmutableSubstanceSpecification(
        this.identifier,
        this.source,
        this.type,
        this.language,
        this.sourceMaterial,
        this.polymer,
        this.name,
        this.relationship,
        this.protein,
        this.implicitRules,
        this.comment,
        this.contained,
        this.description,
        value,
        this.code,
        this.molecularWeight,
        this.property,
        this.structure,
        this.status,
        this.modifierExtension,
        this.text,
        this.id,
        this.extension,
        this.resourceType,
        this.meta,
        this.referenceInformation,
        this.nucleicAcid,
        this.moiety);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSpecification#code() code} attribute.
   * @param value The value for code
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification withCode(java.util.List<com.fhir.SubstanceSpecification_Code> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.SubstanceSpecification_Code> newValue = java.util.Objects.requireNonNull(value, "code");
    if (this.code == newValue) return this;
    return new ImmutableSubstanceSpecification(
        this.identifier,
        this.source,
        this.type,
        this.language,
        this.sourceMaterial,
        this.polymer,
        this.name,
        this.relationship,
        this.protein,
        this.implicitRules,
        this.comment,
        this.contained,
        this.description,
        this.domain,
        newValue,
        this.molecularWeight,
        this.property,
        this.structure,
        this.status,
        this.modifierExtension,
        this.text,
        this.id,
        this.extension,
        this.resourceType,
        this.meta,
        this.referenceInformation,
        this.nucleicAcid,
        this.moiety);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSpecification#code() code} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for code
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSpecification withCode(java.util.Optional<? extends java.util.List<com.fhir.SubstanceSpecification_Code>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.SubstanceSpecification_Code> value = optional.orElse(null);
    if (this.code == value) return this;
    return new ImmutableSubstanceSpecification(
        this.identifier,
        this.source,
        this.type,
        this.language,
        this.sourceMaterial,
        this.polymer,
        this.name,
        this.relationship,
        this.protein,
        this.implicitRules,
        this.comment,
        this.contained,
        this.description,
        this.domain,
        value,
        this.molecularWeight,
        this.property,
        this.structure,
        this.status,
        this.modifierExtension,
        this.text,
        this.id,
        this.extension,
        this.resourceType,
        this.meta,
        this.referenceInformation,
        this.nucleicAcid,
        this.moiety);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSpecification#molecularWeight() molecularWeight} attribute.
   * @param value The value for molecularWeight
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification withMolecularWeight(java.util.List<com.fhir.SubstanceSpecification_MolecularWeight> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.SubstanceSpecification_MolecularWeight> newValue = java.util.Objects.requireNonNull(value, "molecularWeight");
    if (this.molecularWeight == newValue) return this;
    return new ImmutableSubstanceSpecification(
        this.identifier,
        this.source,
        this.type,
        this.language,
        this.sourceMaterial,
        this.polymer,
        this.name,
        this.relationship,
        this.protein,
        this.implicitRules,
        this.comment,
        this.contained,
        this.description,
        this.domain,
        this.code,
        newValue,
        this.property,
        this.structure,
        this.status,
        this.modifierExtension,
        this.text,
        this.id,
        this.extension,
        this.resourceType,
        this.meta,
        this.referenceInformation,
        this.nucleicAcid,
        this.moiety);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSpecification#molecularWeight() molecularWeight} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for molecularWeight
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSpecification withMolecularWeight(java.util.Optional<? extends java.util.List<com.fhir.SubstanceSpecification_MolecularWeight>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.SubstanceSpecification_MolecularWeight> value = optional.orElse(null);
    if (this.molecularWeight == value) return this;
    return new ImmutableSubstanceSpecification(
        this.identifier,
        this.source,
        this.type,
        this.language,
        this.sourceMaterial,
        this.polymer,
        this.name,
        this.relationship,
        this.protein,
        this.implicitRules,
        this.comment,
        this.contained,
        this.description,
        this.domain,
        this.code,
        value,
        this.property,
        this.structure,
        this.status,
        this.modifierExtension,
        this.text,
        this.id,
        this.extension,
        this.resourceType,
        this.meta,
        this.referenceInformation,
        this.nucleicAcid,
        this.moiety);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSpecification#property() property} attribute.
   * @param value The value for property
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification withProperty(java.util.List<com.fhir.SubstanceSpecification_Property> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.SubstanceSpecification_Property> newValue = java.util.Objects.requireNonNull(value, "property");
    if (this.property == newValue) return this;
    return new ImmutableSubstanceSpecification(
        this.identifier,
        this.source,
        this.type,
        this.language,
        this.sourceMaterial,
        this.polymer,
        this.name,
        this.relationship,
        this.protein,
        this.implicitRules,
        this.comment,
        this.contained,
        this.description,
        this.domain,
        this.code,
        this.molecularWeight,
        newValue,
        this.structure,
        this.status,
        this.modifierExtension,
        this.text,
        this.id,
        this.extension,
        this.resourceType,
        this.meta,
        this.referenceInformation,
        this.nucleicAcid,
        this.moiety);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSpecification#property() property} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for property
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSpecification withProperty(java.util.Optional<? extends java.util.List<com.fhir.SubstanceSpecification_Property>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.SubstanceSpecification_Property> value = optional.orElse(null);
    if (this.property == value) return this;
    return new ImmutableSubstanceSpecification(
        this.identifier,
        this.source,
        this.type,
        this.language,
        this.sourceMaterial,
        this.polymer,
        this.name,
        this.relationship,
        this.protein,
        this.implicitRules,
        this.comment,
        this.contained,
        this.description,
        this.domain,
        this.code,
        this.molecularWeight,
        value,
        this.structure,
        this.status,
        this.modifierExtension,
        this.text,
        this.id,
        this.extension,
        this.resourceType,
        this.meta,
        this.referenceInformation,
        this.nucleicAcid,
        this.moiety);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSpecification#structure() structure} attribute.
   * @param value The value for structure
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification withStructure(com.fhir.SubstanceSpecification_Structure value) {
    @javax.annotation.Nullable com.fhir.SubstanceSpecification_Structure newValue = java.util.Objects.requireNonNull(value, "structure");
    if (this.structure == newValue) return this;
    return new ImmutableSubstanceSpecification(
        this.identifier,
        this.source,
        this.type,
        this.language,
        this.sourceMaterial,
        this.polymer,
        this.name,
        this.relationship,
        this.protein,
        this.implicitRules,
        this.comment,
        this.contained,
        this.description,
        this.domain,
        this.code,
        this.molecularWeight,
        this.property,
        newValue,
        this.status,
        this.modifierExtension,
        this.text,
        this.id,
        this.extension,
        this.resourceType,
        this.meta,
        this.referenceInformation,
        this.nucleicAcid,
        this.moiety);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSpecification#structure() structure} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for structure
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSpecification withStructure(java.util.Optional<? extends com.fhir.SubstanceSpecification_Structure> optional) {
    @javax.annotation.Nullable com.fhir.SubstanceSpecification_Structure value = optional.orElse(null);
    if (this.structure == value) return this;
    return new ImmutableSubstanceSpecification(
        this.identifier,
        this.source,
        this.type,
        this.language,
        this.sourceMaterial,
        this.polymer,
        this.name,
        this.relationship,
        this.protein,
        this.implicitRules,
        this.comment,
        this.contained,
        this.description,
        this.domain,
        this.code,
        this.molecularWeight,
        this.property,
        value,
        this.status,
        this.modifierExtension,
        this.text,
        this.id,
        this.extension,
        this.resourceType,
        this.meta,
        this.referenceInformation,
        this.nucleicAcid,
        this.moiety);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSpecification#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification withStatus(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableSubstanceSpecification(
        this.identifier,
        this.source,
        this.type,
        this.language,
        this.sourceMaterial,
        this.polymer,
        this.name,
        this.relationship,
        this.protein,
        this.implicitRules,
        this.comment,
        this.contained,
        this.description,
        this.domain,
        this.code,
        this.molecularWeight,
        this.property,
        this.structure,
        newValue,
        this.modifierExtension,
        this.text,
        this.id,
        this.extension,
        this.resourceType,
        this.meta,
        this.referenceInformation,
        this.nucleicAcid,
        this.moiety);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSpecification#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSpecification withStatus(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableSubstanceSpecification(
        this.identifier,
        this.source,
        this.type,
        this.language,
        this.sourceMaterial,
        this.polymer,
        this.name,
        this.relationship,
        this.protein,
        this.implicitRules,
        this.comment,
        this.contained,
        this.description,
        this.domain,
        this.code,
        this.molecularWeight,
        this.property,
        this.structure,
        value,
        this.modifierExtension,
        this.text,
        this.id,
        this.extension,
        this.resourceType,
        this.meta,
        this.referenceInformation,
        this.nucleicAcid,
        this.moiety);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSpecification#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableSubstanceSpecification(
        this.identifier,
        this.source,
        this.type,
        this.language,
        this.sourceMaterial,
        this.polymer,
        this.name,
        this.relationship,
        this.protein,
        this.implicitRules,
        this.comment,
        this.contained,
        this.description,
        this.domain,
        this.code,
        this.molecularWeight,
        this.property,
        this.structure,
        this.status,
        newValue,
        this.text,
        this.id,
        this.extension,
        this.resourceType,
        this.meta,
        this.referenceInformation,
        this.nucleicAcid,
        this.moiety);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSpecification#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSpecification withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableSubstanceSpecification(
        this.identifier,
        this.source,
        this.type,
        this.language,
        this.sourceMaterial,
        this.polymer,
        this.name,
        this.relationship,
        this.protein,
        this.implicitRules,
        this.comment,
        this.contained,
        this.description,
        this.domain,
        this.code,
        this.molecularWeight,
        this.property,
        this.structure,
        this.status,
        value,
        this.text,
        this.id,
        this.extension,
        this.resourceType,
        this.meta,
        this.referenceInformation,
        this.nucleicAcid,
        this.moiety);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSpecification#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification withText(com.fhir.Narrative value) {
    @javax.annotation.Nullable com.fhir.Narrative newValue = java.util.Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableSubstanceSpecification(
        this.identifier,
        this.source,
        this.type,
        this.language,
        this.sourceMaterial,
        this.polymer,
        this.name,
        this.relationship,
        this.protein,
        this.implicitRules,
        this.comment,
        this.contained,
        this.description,
        this.domain,
        this.code,
        this.molecularWeight,
        this.property,
        this.structure,
        this.status,
        this.modifierExtension,
        newValue,
        this.id,
        this.extension,
        this.resourceType,
        this.meta,
        this.referenceInformation,
        this.nucleicAcid,
        this.moiety);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSpecification#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSpecification withText(java.util.Optional<? extends com.fhir.Narrative> optional) {
    @javax.annotation.Nullable com.fhir.Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableSubstanceSpecification(
        this.identifier,
        this.source,
        this.type,
        this.language,
        this.sourceMaterial,
        this.polymer,
        this.name,
        this.relationship,
        this.protein,
        this.implicitRules,
        this.comment,
        this.contained,
        this.description,
        this.domain,
        this.code,
        this.molecularWeight,
        this.property,
        this.structure,
        this.status,
        this.modifierExtension,
        value,
        this.id,
        this.extension,
        this.resourceType,
        this.meta,
        this.referenceInformation,
        this.nucleicAcid,
        this.moiety);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSpecification#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification withId(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableSubstanceSpecification(
        this.identifier,
        this.source,
        this.type,
        this.language,
        this.sourceMaterial,
        this.polymer,
        this.name,
        this.relationship,
        this.protein,
        this.implicitRules,
        this.comment,
        this.contained,
        this.description,
        this.domain,
        this.code,
        this.molecularWeight,
        this.property,
        this.structure,
        this.status,
        this.modifierExtension,
        this.text,
        newValue,
        this.extension,
        this.resourceType,
        this.meta,
        this.referenceInformation,
        this.nucleicAcid,
        this.moiety);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSpecification#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSpecification withId(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableSubstanceSpecification(
        this.identifier,
        this.source,
        this.type,
        this.language,
        this.sourceMaterial,
        this.polymer,
        this.name,
        this.relationship,
        this.protein,
        this.implicitRules,
        this.comment,
        this.contained,
        this.description,
        this.domain,
        this.code,
        this.molecularWeight,
        this.property,
        this.structure,
        this.status,
        this.modifierExtension,
        this.text,
        value,
        this.extension,
        this.resourceType,
        this.meta,
        this.referenceInformation,
        this.nucleicAcid,
        this.moiety);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSpecification#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableSubstanceSpecification(
        this.identifier,
        this.source,
        this.type,
        this.language,
        this.sourceMaterial,
        this.polymer,
        this.name,
        this.relationship,
        this.protein,
        this.implicitRules,
        this.comment,
        this.contained,
        this.description,
        this.domain,
        this.code,
        this.molecularWeight,
        this.property,
        this.structure,
        this.status,
        this.modifierExtension,
        this.text,
        this.id,
        newValue,
        this.resourceType,
        this.meta,
        this.referenceInformation,
        this.nucleicAcid,
        this.moiety);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSpecification#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSpecification withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableSubstanceSpecification(
        this.identifier,
        this.source,
        this.type,
        this.language,
        this.sourceMaterial,
        this.polymer,
        this.name,
        this.relationship,
        this.protein,
        this.implicitRules,
        this.comment,
        this.contained,
        this.description,
        this.domain,
        this.code,
        this.molecularWeight,
        this.property,
        this.structure,
        this.status,
        this.modifierExtension,
        this.text,
        this.id,
        value,
        this.resourceType,
        this.meta,
        this.referenceInformation,
        this.nucleicAcid,
        this.moiety);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link SubstanceSpecification#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableSubstanceSpecification withResourceType(java.lang.String value) {
    java.lang.String newValue = java.util.Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableSubstanceSpecification(
        this.identifier,
        this.source,
        this.type,
        this.language,
        this.sourceMaterial,
        this.polymer,
        this.name,
        this.relationship,
        this.protein,
        this.implicitRules,
        this.comment,
        this.contained,
        this.description,
        this.domain,
        this.code,
        this.molecularWeight,
        this.property,
        this.structure,
        this.status,
        this.modifierExtension,
        this.text,
        this.id,
        this.extension,
        newValue,
        this.meta,
        this.referenceInformation,
        this.nucleicAcid,
        this.moiety);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSpecification#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification withMeta(com.fhir.Meta value) {
    @javax.annotation.Nullable com.fhir.Meta newValue = java.util.Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableSubstanceSpecification(
        this.identifier,
        this.source,
        this.type,
        this.language,
        this.sourceMaterial,
        this.polymer,
        this.name,
        this.relationship,
        this.protein,
        this.implicitRules,
        this.comment,
        this.contained,
        this.description,
        this.domain,
        this.code,
        this.molecularWeight,
        this.property,
        this.structure,
        this.status,
        this.modifierExtension,
        this.text,
        this.id,
        this.extension,
        this.resourceType,
        newValue,
        this.referenceInformation,
        this.nucleicAcid,
        this.moiety);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSpecification#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSpecification withMeta(java.util.Optional<? extends com.fhir.Meta> optional) {
    @javax.annotation.Nullable com.fhir.Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableSubstanceSpecification(
        this.identifier,
        this.source,
        this.type,
        this.language,
        this.sourceMaterial,
        this.polymer,
        this.name,
        this.relationship,
        this.protein,
        this.implicitRules,
        this.comment,
        this.contained,
        this.description,
        this.domain,
        this.code,
        this.molecularWeight,
        this.property,
        this.structure,
        this.status,
        this.modifierExtension,
        this.text,
        this.id,
        this.extension,
        this.resourceType,
        value,
        this.referenceInformation,
        this.nucleicAcid,
        this.moiety);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSpecification#referenceInformation() referenceInformation} attribute.
   * @param value The value for referenceInformation
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification withReferenceInformation(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "referenceInformation");
    if (this.referenceInformation == newValue) return this;
    return new ImmutableSubstanceSpecification(
        this.identifier,
        this.source,
        this.type,
        this.language,
        this.sourceMaterial,
        this.polymer,
        this.name,
        this.relationship,
        this.protein,
        this.implicitRules,
        this.comment,
        this.contained,
        this.description,
        this.domain,
        this.code,
        this.molecularWeight,
        this.property,
        this.structure,
        this.status,
        this.modifierExtension,
        this.text,
        this.id,
        this.extension,
        this.resourceType,
        this.meta,
        newValue,
        this.nucleicAcid,
        this.moiety);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSpecification#referenceInformation() referenceInformation} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for referenceInformation
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSpecification withReferenceInformation(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.referenceInformation == value) return this;
    return new ImmutableSubstanceSpecification(
        this.identifier,
        this.source,
        this.type,
        this.language,
        this.sourceMaterial,
        this.polymer,
        this.name,
        this.relationship,
        this.protein,
        this.implicitRules,
        this.comment,
        this.contained,
        this.description,
        this.domain,
        this.code,
        this.molecularWeight,
        this.property,
        this.structure,
        this.status,
        this.modifierExtension,
        this.text,
        this.id,
        this.extension,
        this.resourceType,
        this.meta,
        value,
        this.nucleicAcid,
        this.moiety);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSpecification#nucleicAcid() nucleicAcid} attribute.
   * @param value The value for nucleicAcid
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification withNucleicAcid(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "nucleicAcid");
    if (this.nucleicAcid == newValue) return this;
    return new ImmutableSubstanceSpecification(
        this.identifier,
        this.source,
        this.type,
        this.language,
        this.sourceMaterial,
        this.polymer,
        this.name,
        this.relationship,
        this.protein,
        this.implicitRules,
        this.comment,
        this.contained,
        this.description,
        this.domain,
        this.code,
        this.molecularWeight,
        this.property,
        this.structure,
        this.status,
        this.modifierExtension,
        this.text,
        this.id,
        this.extension,
        this.resourceType,
        this.meta,
        this.referenceInformation,
        newValue,
        this.moiety);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSpecification#nucleicAcid() nucleicAcid} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for nucleicAcid
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSpecification withNucleicAcid(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.nucleicAcid == value) return this;
    return new ImmutableSubstanceSpecification(
        this.identifier,
        this.source,
        this.type,
        this.language,
        this.sourceMaterial,
        this.polymer,
        this.name,
        this.relationship,
        this.protein,
        this.implicitRules,
        this.comment,
        this.contained,
        this.description,
        this.domain,
        this.code,
        this.molecularWeight,
        this.property,
        this.structure,
        this.status,
        this.modifierExtension,
        this.text,
        this.id,
        this.extension,
        this.resourceType,
        this.meta,
        this.referenceInformation,
        value,
        this.moiety);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSpecification#moiety() moiety} attribute.
   * @param value The value for moiety
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification withMoiety(java.util.List<com.fhir.SubstanceSpecification_Moiety> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.SubstanceSpecification_Moiety> newValue = java.util.Objects.requireNonNull(value, "moiety");
    if (this.moiety == newValue) return this;
    return new ImmutableSubstanceSpecification(
        this.identifier,
        this.source,
        this.type,
        this.language,
        this.sourceMaterial,
        this.polymer,
        this.name,
        this.relationship,
        this.protein,
        this.implicitRules,
        this.comment,
        this.contained,
        this.description,
        this.domain,
        this.code,
        this.molecularWeight,
        this.property,
        this.structure,
        this.status,
        this.modifierExtension,
        this.text,
        this.id,
        this.extension,
        this.resourceType,
        this.meta,
        this.referenceInformation,
        this.nucleicAcid,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSpecification#moiety() moiety} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for moiety
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSpecification withMoiety(java.util.Optional<? extends java.util.List<com.fhir.SubstanceSpecification_Moiety>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.SubstanceSpecification_Moiety> value = optional.orElse(null);
    if (this.moiety == value) return this;
    return new ImmutableSubstanceSpecification(
        this.identifier,
        this.source,
        this.type,
        this.language,
        this.sourceMaterial,
        this.polymer,
        this.name,
        this.relationship,
        this.protein,
        this.implicitRules,
        this.comment,
        this.contained,
        this.description,
        this.domain,
        this.code,
        this.molecularWeight,
        this.property,
        this.structure,
        this.status,
        this.modifierExtension,
        this.text,
        this.id,
        this.extension,
        this.resourceType,
        this.meta,
        this.referenceInformation,
        this.nucleicAcid,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableSubstanceSpecification} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableSubstanceSpecification
        && equalTo((ImmutableSubstanceSpecification) another);
  }

  private boolean equalTo(ImmutableSubstanceSpecification another) {
    return java.util.Objects.equals(identifier, another.identifier)
        && java.util.Objects.equals(source, another.source)
        && java.util.Objects.equals(type, another.type)
        && java.util.Objects.equals(language, another.language)
        && java.util.Objects.equals(sourceMaterial, another.sourceMaterial)
        && java.util.Objects.equals(polymer, another.polymer)
        && java.util.Objects.equals(name, another.name)
        && java.util.Objects.equals(relationship, another.relationship)
        && java.util.Objects.equals(protein, another.protein)
        && java.util.Objects.equals(implicitRules, another.implicitRules)
        && java.util.Objects.equals(comment, another.comment)
        && java.util.Objects.equals(contained, another.contained)
        && java.util.Objects.equals(description, another.description)
        && java.util.Objects.equals(domain, another.domain)
        && java.util.Objects.equals(code, another.code)
        && java.util.Objects.equals(molecularWeight, another.molecularWeight)
        && java.util.Objects.equals(property, another.property)
        && java.util.Objects.equals(structure, another.structure)
        && java.util.Objects.equals(status, another.status)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(text, another.text)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(extension, another.extension)
        && resourceType.equals(another.resourceType)
        && java.util.Objects.equals(meta, another.meta)
        && java.util.Objects.equals(referenceInformation, another.referenceInformation)
        && java.util.Objects.equals(nucleicAcid, another.nucleicAcid)
        && java.util.Objects.equals(moiety, another.moiety);
  }

  /**
   * Computes a hash code from attributes: {@code identifier}, {@code source}, {@code type}, {@code language}, {@code sourceMaterial}, {@code polymer}, {@code name}, {@code relationship}, {@code protein}, {@code implicitRules}, {@code comment}, {@code contained}, {@code description}, {@code domain}, {@code code}, {@code molecularWeight}, {@code property}, {@code structure}, {@code status}, {@code modifierExtension}, {@code text}, {@code id}, {@code extension}, {@code resourceType}, {@code meta}, {@code referenceInformation}, {@code nucleicAcid}, {@code moiety}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(identifier);
    h += (h << 5) + java.util.Objects.hashCode(source);
    h += (h << 5) + java.util.Objects.hashCode(type);
    h += (h << 5) + java.util.Objects.hashCode(language);
    h += (h << 5) + java.util.Objects.hashCode(sourceMaterial);
    h += (h << 5) + java.util.Objects.hashCode(polymer);
    h += (h << 5) + java.util.Objects.hashCode(name);
    h += (h << 5) + java.util.Objects.hashCode(relationship);
    h += (h << 5) + java.util.Objects.hashCode(protein);
    h += (h << 5) + java.util.Objects.hashCode(implicitRules);
    h += (h << 5) + java.util.Objects.hashCode(comment);
    h += (h << 5) + java.util.Objects.hashCode(contained);
    h += (h << 5) + java.util.Objects.hashCode(description);
    h += (h << 5) + java.util.Objects.hashCode(domain);
    h += (h << 5) + java.util.Objects.hashCode(code);
    h += (h << 5) + java.util.Objects.hashCode(molecularWeight);
    h += (h << 5) + java.util.Objects.hashCode(property);
    h += (h << 5) + java.util.Objects.hashCode(structure);
    h += (h << 5) + java.util.Objects.hashCode(status);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(text);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(meta);
    h += (h << 5) + java.util.Objects.hashCode(referenceInformation);
    h += (h << 5) + java.util.Objects.hashCode(nucleicAcid);
    h += (h << 5) + java.util.Objects.hashCode(moiety);
    return h;
  }

  /**
   * Prints the immutable value {@code SubstanceSpecification} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("SubstanceSpecification{");
    if (identifier != null) {
      builder.append("identifier=").append(identifier);
    }
    if (source != null) {
      if (builder.length() > 23) builder.append(", ");
      builder.append("source=").append(source);
    }
    if (type != null) {
      if (builder.length() > 23) builder.append(", ");
      builder.append("type=").append(type);
    }
    if (language != null) {
      if (builder.length() > 23) builder.append(", ");
      builder.append("language=").append(language);
    }
    if (sourceMaterial != null) {
      if (builder.length() > 23) builder.append(", ");
      builder.append("sourceMaterial=").append(sourceMaterial);
    }
    if (polymer != null) {
      if (builder.length() > 23) builder.append(", ");
      builder.append("polymer=").append(polymer);
    }
    if (name != null) {
      if (builder.length() > 23) builder.append(", ");
      builder.append("name=").append(name);
    }
    if (relationship != null) {
      if (builder.length() > 23) builder.append(", ");
      builder.append("relationship=").append(relationship);
    }
    if (protein != null) {
      if (builder.length() > 23) builder.append(", ");
      builder.append("protein=").append(protein);
    }
    if (implicitRules != null) {
      if (builder.length() > 23) builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (comment != null) {
      if (builder.length() > 23) builder.append(", ");
      builder.append("comment=").append(comment);
    }
    if (contained != null) {
      if (builder.length() > 23) builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (description != null) {
      if (builder.length() > 23) builder.append(", ");
      builder.append("description=").append(description);
    }
    if (domain != null) {
      if (builder.length() > 23) builder.append(", ");
      builder.append("domain=").append(domain);
    }
    if (code != null) {
      if (builder.length() > 23) builder.append(", ");
      builder.append("code=").append(code);
    }
    if (molecularWeight != null) {
      if (builder.length() > 23) builder.append(", ");
      builder.append("molecularWeight=").append(molecularWeight);
    }
    if (property != null) {
      if (builder.length() > 23) builder.append(", ");
      builder.append("property=").append(property);
    }
    if (structure != null) {
      if (builder.length() > 23) builder.append(", ");
      builder.append("structure=").append(structure);
    }
    if (status != null) {
      if (builder.length() > 23) builder.append(", ");
      builder.append("status=").append(status);
    }
    if (modifierExtension != null) {
      if (builder.length() > 23) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (text != null) {
      if (builder.length() > 23) builder.append(", ");
      builder.append("text=").append(text);
    }
    if (id != null) {
      if (builder.length() > 23) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (extension != null) {
      if (builder.length() > 23) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (builder.length() > 23) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (referenceInformation != null) {
      builder.append(", ");
      builder.append("referenceInformation=").append(referenceInformation);
    }
    if (nucleicAcid != null) {
      builder.append(", ");
      builder.append("nucleicAcid=").append(nucleicAcid);
    }
    if (moiety != null) {
      builder.append(", ");
      builder.append("moiety=").append(moiety);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "SubstanceSpecification", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.SubstanceSpecification {
    @javax.annotation.Nullable java.util.Optional<com.fhir.Identifier> identifier = java.util.Optional.empty();
    boolean identifierIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> source = java.util.Optional.empty();
    boolean sourceIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> type = java.util.Optional.empty();
    boolean typeIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> language = java.util.Optional.empty();
    boolean languageIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> sourceMaterial = java.util.Optional.empty();
    boolean sourceMaterialIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> polymer = java.util.Optional.empty();
    boolean polymerIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.SubstanceSpecification_Name>> name = java.util.Optional.empty();
    boolean nameIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.SubstanceSpecification_Relationship>> relationship = java.util.Optional.empty();
    boolean relationshipIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> protein = java.util.Optional.empty();
    boolean proteinIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> implicitRules = java.util.Optional.empty();
    boolean implicitRulesIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> comment = java.util.Optional.empty();
    boolean commentIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ResourceList>> contained = java.util.Optional.empty();
    boolean containedIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> description = java.util.Optional.empty();
    boolean descriptionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> domain = java.util.Optional.empty();
    boolean domainIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.SubstanceSpecification_Code>> code = java.util.Optional.empty();
    boolean codeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.SubstanceSpecification_MolecularWeight>> molecularWeight = java.util.Optional.empty();
    boolean molecularWeightIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.SubstanceSpecification_Property>> property = java.util.Optional.empty();
    boolean propertyIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.SubstanceSpecification_Structure> structure = java.util.Optional.empty();
    boolean structureIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> status = java.util.Optional.empty();
    boolean statusIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Narrative> text = java.util.Optional.empty();
    boolean textIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.lang.String resourceType;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Meta> meta = java.util.Optional.empty();
    boolean metaIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> referenceInformation = java.util.Optional.empty();
    boolean referenceInformationIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> nucleicAcid = java.util.Optional.empty();
    boolean nucleicAcidIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.SubstanceSpecification_Moiety>> moiety = java.util.Optional.empty();
    boolean moietyIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    public void setIdentifier(java.util.Optional<com.fhir.Identifier> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("source")
    public void setSource(java.util.Optional<java.util.List<com.fhir.Reference>> source) {
      this.source = source;
      this.sourceIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    public void setType(java.util.Optional<com.fhir.CodeableConcept> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    public void setLanguage(java.util.Optional<com.fhir.code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("sourceMaterial")
    public void setSourceMaterial(java.util.Optional<com.fhir.Reference> sourceMaterial) {
      this.sourceMaterial = sourceMaterial;
      this.sourceMaterialIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("polymer")
    public void setPolymer(java.util.Optional<com.fhir.Reference> polymer) {
      this.polymer = polymer;
      this.polymerIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    public void setName(java.util.Optional<java.util.List<com.fhir.SubstanceSpecification_Name>> name) {
      this.name = name;
      this.nameIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("relationship")
    public void setRelationship(java.util.Optional<java.util.List<com.fhir.SubstanceSpecification_Relationship>> relationship) {
      this.relationship = relationship;
      this.relationshipIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("protein")
    public void setProtein(java.util.Optional<com.fhir.Reference> protein) {
      this.protein = protein;
      this.proteinIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
    public void setImplicitRules(java.util.Optional<com.fhir.uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("comment")
    public void setComment(java.util.Optional<java.lang.String> comment) {
      this.comment = comment;
      this.commentIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("contained")
    public void setContained(java.util.Optional<java.util.List<com.fhir.ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    public void setDescription(java.util.Optional<java.lang.String> description) {
      this.description = description;
      this.descriptionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("domain")
    public void setDomain(java.util.Optional<com.fhir.CodeableConcept> domain) {
      this.domain = domain;
      this.domainIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("code")
    public void setCode(java.util.Optional<java.util.List<com.fhir.SubstanceSpecification_Code>> code) {
      this.code = code;
      this.codeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("molecularWeight")
    public void setMolecularWeight(java.util.Optional<java.util.List<com.fhir.SubstanceSpecification_MolecularWeight>> molecularWeight) {
      this.molecularWeight = molecularWeight;
      this.molecularWeightIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("property")
    public void setProperty(java.util.Optional<java.util.List<com.fhir.SubstanceSpecification_Property>> property) {
      this.property = property;
      this.propertyIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("structure")
    public void setStructure(java.util.Optional<com.fhir.SubstanceSpecification_Structure> structure) {
      this.structure = structure;
      this.structureIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public void setStatus(java.util.Optional<com.fhir.CodeableConcept> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    public void setText(java.util.Optional<com.fhir.Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<com.fhir.id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public void setResourceType(java.lang.String resourceType) {
      this.resourceType = resourceType;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("meta")
    public void setMeta(java.util.Optional<com.fhir.Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("referenceInformation")
    public void setReferenceInformation(java.util.Optional<com.fhir.Reference> referenceInformation) {
      this.referenceInformation = referenceInformation;
      this.referenceInformationIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("nucleicAcid")
    public void setNucleicAcid(java.util.Optional<com.fhir.Reference> nucleicAcid) {
      this.nucleicAcid = nucleicAcid;
      this.nucleicAcidIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("moiety")
    public void setMoiety(java.util.Optional<java.util.List<com.fhir.SubstanceSpecification_Moiety>> moiety) {
      this.moiety = moiety;
      this.moietyIsSet = true;
    }
    @Override
    public java.util.Optional<com.fhir.Identifier> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> source() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> type() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> language() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> sourceMaterial() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> polymer() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.SubstanceSpecification_Name>> name() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.SubstanceSpecification_Relationship>> relationship() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> protein() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> comment() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> description() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> domain() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.SubstanceSpecification_Code>> code() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.SubstanceSpecification_MolecularWeight>> molecularWeight() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.SubstanceSpecification_Property>> property() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.SubstanceSpecification_Structure> structure() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> status() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.id> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.lang.String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> referenceInformation() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> nucleicAcid() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.SubstanceSpecification_Moiety>> moiety() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableSubstanceSpecification fromJson(Json json) {
    ImmutableSubstanceSpecification.Builder builder = ((ImmutableSubstanceSpecification.Builder) ImmutableSubstanceSpecification.builder());
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.sourceIsSet) {
      builder.source(json.source);
    }
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.sourceMaterialIsSet) {
      builder.sourceMaterial(json.sourceMaterial);
    }
    if (json.polymerIsSet) {
      builder.polymer(json.polymer);
    }
    if (json.nameIsSet) {
      builder.name(json.name);
    }
    if (json.relationshipIsSet) {
      builder.relationship(json.relationship);
    }
    if (json.proteinIsSet) {
      builder.protein(json.protein);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.commentIsSet) {
      builder.comment(json.comment);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.descriptionIsSet) {
      builder.description(json.description);
    }
    if (json.domainIsSet) {
      builder.domain(json.domain);
    }
    if (json.codeIsSet) {
      builder.code(json.code);
    }
    if (json.molecularWeightIsSet) {
      builder.molecularWeight(json.molecularWeight);
    }
    if (json.propertyIsSet) {
      builder.property(json.property);
    }
    if (json.structureIsSet) {
      builder.structure(json.structure);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.referenceInformationIsSet) {
      builder.referenceInformation(json.referenceInformation);
    }
    if (json.nucleicAcidIsSet) {
      builder.nucleicAcid(json.nucleicAcid);
    }
    if (json.moietyIsSet) {
      builder.moiety(json.moiety);
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
        .identifier(instance.identifier())
        .source(instance.source())
        .type(instance.type())
        .language(instance.language())
        .sourceMaterial(instance.sourceMaterial())
        .polymer(instance.polymer())
        .name(instance.name())
        .relationship(instance.relationship())
        .protein(instance.protein())
        .implicitRules(instance.implicitRules())
        .comment(instance.comment())
        .contained(instance.contained())
        .description(instance.description())
        .domain(instance.domain())
        .code(instance.code())
        .molecularWeight(instance.molecularWeight())
        .property(instance.property())
        .structure(instance.structure())
        .status(instance.status())
        .modifierExtension(instance.modifierExtension())
        .text(instance.text())
        .id(instance.id())
        .extension(instance.extension())
        .resourceType(instance.resourceType())
        .meta(instance.meta())
        .referenceInformation(instance.referenceInformation())
        .nucleicAcid(instance.nucleicAcid())
        .moiety(instance.moiety())
        .build();
  }

  /**
   * Creates a builder for {@link SubstanceSpecification SubstanceSpecification}.
   * <pre>
   * ImmutableSubstanceSpecification.builder()
   *    .identifier(com.fhir.Identifier) // optional {@link SubstanceSpecification#identifier() identifier}
   *    .source(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link SubstanceSpecification#source() source}
   *    .type(com.fhir.CodeableConcept) // optional {@link SubstanceSpecification#type() type}
   *    .language(com.fhir.code) // optional {@link SubstanceSpecification#language() language}
   *    .sourceMaterial(com.fhir.Reference) // optional {@link SubstanceSpecification#sourceMaterial() sourceMaterial}
   *    .polymer(com.fhir.Reference) // optional {@link SubstanceSpecification#polymer() polymer}
   *    .name(List&amp;lt;com.fhir.SubstanceSpecification_Name&amp;gt;) // optional {@link SubstanceSpecification#name() name}
   *    .relationship(List&amp;lt;com.fhir.SubstanceSpecification_Relationship&amp;gt;) // optional {@link SubstanceSpecification#relationship() relationship}
   *    .protein(com.fhir.Reference) // optional {@link SubstanceSpecification#protein() protein}
   *    .implicitRules(com.fhir.uri) // optional {@link SubstanceSpecification#implicitRules() implicitRules}
   *    .comment(String) // optional {@link SubstanceSpecification#comment() comment}
   *    .contained(List&amp;lt;com.fhir.ResourceList&amp;gt;) // optional {@link SubstanceSpecification#contained() contained}
   *    .description(String) // optional {@link SubstanceSpecification#description() description}
   *    .domain(com.fhir.CodeableConcept) // optional {@link SubstanceSpecification#domain() domain}
   *    .code(List&amp;lt;com.fhir.SubstanceSpecification_Code&amp;gt;) // optional {@link SubstanceSpecification#code() code}
   *    .molecularWeight(List&amp;lt;com.fhir.SubstanceSpecification_MolecularWeight&amp;gt;) // optional {@link SubstanceSpecification#molecularWeight() molecularWeight}
   *    .property(List&amp;lt;com.fhir.SubstanceSpecification_Property&amp;gt;) // optional {@link SubstanceSpecification#property() property}
   *    .structure(com.fhir.SubstanceSpecification_Structure) // optional {@link SubstanceSpecification#structure() structure}
   *    .status(com.fhir.CodeableConcept) // optional {@link SubstanceSpecification#status() status}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link SubstanceSpecification#modifierExtension() modifierExtension}
   *    .text(com.fhir.Narrative) // optional {@link SubstanceSpecification#text() text}
   *    .id(com.fhir.id) // optional {@link SubstanceSpecification#id() id}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link SubstanceSpecification#extension() extension}
   *    .resourceType(String) // required {@link SubstanceSpecification#resourceType() resourceType}
   *    .meta(com.fhir.Meta) // optional {@link SubstanceSpecification#meta() meta}
   *    .referenceInformation(com.fhir.Reference) // optional {@link SubstanceSpecification#referenceInformation() referenceInformation}
   *    .nucleicAcid(com.fhir.Reference) // optional {@link SubstanceSpecification#nucleicAcid() nucleicAcid}
   *    .moiety(List&amp;lt;com.fhir.SubstanceSpecification_Moiety&amp;gt;) // optional {@link SubstanceSpecification#moiety() moiety}
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
  @org.immutables.value.Generated(from = "SubstanceSpecification", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long OPT_BIT_IDENTIFIER = 0x1L;
    private static final long OPT_BIT_SOURCE = 0x2L;
    private static final long OPT_BIT_TYPE = 0x4L;
    private static final long OPT_BIT_LANGUAGE = 0x8L;
    private static final long OPT_BIT_SOURCE_MATERIAL = 0x10L;
    private static final long OPT_BIT_POLYMER = 0x20L;
    private static final long OPT_BIT_NAME = 0x40L;
    private static final long OPT_BIT_RELATIONSHIP = 0x80L;
    private static final long OPT_BIT_PROTEIN = 0x100L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x200L;
    private static final long OPT_BIT_COMMENT = 0x400L;
    private static final long OPT_BIT_CONTAINED = 0x800L;
    private static final long OPT_BIT_DESCRIPTION = 0x1000L;
    private static final long OPT_BIT_DOMAIN = 0x2000L;
    private static final long OPT_BIT_CODE = 0x4000L;
    private static final long OPT_BIT_MOLECULAR_WEIGHT = 0x8000L;
    private static final long OPT_BIT_PROPERTY = 0x10000L;
    private static final long OPT_BIT_STRUCTURE = 0x20000L;
    private static final long OPT_BIT_STATUS = 0x40000L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x80000L;
    private static final long OPT_BIT_TEXT = 0x100000L;
    private static final long OPT_BIT_ID = 0x200000L;
    private static final long OPT_BIT_EXTENSION = 0x400000L;
    private static final long OPT_BIT_META = 0x800000L;
    private static final long OPT_BIT_REFERENCE_INFORMATION = 0x1000000L;
    private static final long OPT_BIT_NUCLEIC_ACID = 0x2000000L;
    private static final long OPT_BIT_MOIETY = 0x4000000L;
    private long initBits = 0x1L;
    private long optBits;

    private @javax.annotation.Nullable com.fhir.Identifier identifier;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> source;
    private @javax.annotation.Nullable com.fhir.CodeableConcept type;
    private @javax.annotation.Nullable com.fhir.code language;
    private @javax.annotation.Nullable com.fhir.Reference sourceMaterial;
    private @javax.annotation.Nullable com.fhir.Reference polymer;
    private @javax.annotation.Nullable java.util.List<com.fhir.SubstanceSpecification_Name> name;
    private @javax.annotation.Nullable java.util.List<com.fhir.SubstanceSpecification_Relationship> relationship;
    private @javax.annotation.Nullable com.fhir.Reference protein;
    private @javax.annotation.Nullable com.fhir.uri implicitRules;
    private @javax.annotation.Nullable java.lang.String comment;
    private @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
    private @javax.annotation.Nullable java.lang.String description;
    private @javax.annotation.Nullable com.fhir.CodeableConcept domain;
    private @javax.annotation.Nullable java.util.List<com.fhir.SubstanceSpecification_Code> code;
    private @javax.annotation.Nullable java.util.List<com.fhir.SubstanceSpecification_MolecularWeight> molecularWeight;
    private @javax.annotation.Nullable java.util.List<com.fhir.SubstanceSpecification_Property> property;
    private @javax.annotation.Nullable com.fhir.SubstanceSpecification_Structure structure;
    private @javax.annotation.Nullable com.fhir.CodeableConcept status;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable com.fhir.Narrative text;
    private @javax.annotation.Nullable com.fhir.id id;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable java.lang.String resourceType;
    private @javax.annotation.Nullable com.fhir.Meta meta;
    private @javax.annotation.Nullable com.fhir.Reference referenceInformation;
    private @javax.annotation.Nullable com.fhir.Reference nucleicAcid;
    private @javax.annotation.Nullable java.util.List<com.fhir.SubstanceSpecification_Moiety> moiety;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    public final Builder identifier(com.fhir.Identifier identifier) {
      checkNotIsSet(identifierIsSet(), "identifier");
      this.identifier = java.util.Objects.requireNonNull(identifier, "identifier");
      optBits |= OPT_BIT_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    public final Builder identifier(java.util.Optional<? extends com.fhir.Identifier> identifier) {
      checkNotIsSet(identifierIsSet(), "identifier");
      this.identifier = identifier.orElse(null);
      optBits |= OPT_BIT_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification#source() source} to source.
     * @param source The value for source
     * @return {@code this} builder for chained invocation
     */
    public final Builder source(java.util.List<com.fhir.Reference> source) {
      checkNotIsSet(sourceIsSet(), "source");
      this.source = java.util.Objects.requireNonNull(source, "source");
      optBits |= OPT_BIT_SOURCE;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification#source() source} to source.
     * @param source The value for source
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("source")
    public final Builder source(java.util.Optional<? extends java.util.List<com.fhir.Reference>> source) {
      checkNotIsSet(sourceIsSet(), "source");
      this.source = source.orElse(null);
      optBits |= OPT_BIT_SOURCE;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    public final Builder type(com.fhir.CodeableConcept type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = java.util.Objects.requireNonNull(type, "type");
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    public final Builder type(java.util.Optional<? extends com.fhir.CodeableConcept> type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = type.orElse(null);
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    public final Builder language(com.fhir.code language) {
      checkNotIsSet(languageIsSet(), "language");
      this.language = java.util.Objects.requireNonNull(language, "language");
      optBits |= OPT_BIT_LANGUAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    public final Builder language(java.util.Optional<? extends com.fhir.code> language) {
      checkNotIsSet(languageIsSet(), "language");
      this.language = language.orElse(null);
      optBits |= OPT_BIT_LANGUAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification#sourceMaterial() sourceMaterial} to sourceMaterial.
     * @param sourceMaterial The value for sourceMaterial
     * @return {@code this} builder for chained invocation
     */
    public final Builder sourceMaterial(com.fhir.Reference sourceMaterial) {
      checkNotIsSet(sourceMaterialIsSet(), "sourceMaterial");
      this.sourceMaterial = java.util.Objects.requireNonNull(sourceMaterial, "sourceMaterial");
      optBits |= OPT_BIT_SOURCE_MATERIAL;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification#sourceMaterial() sourceMaterial} to sourceMaterial.
     * @param sourceMaterial The value for sourceMaterial
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceMaterial")
    public final Builder sourceMaterial(java.util.Optional<? extends com.fhir.Reference> sourceMaterial) {
      checkNotIsSet(sourceMaterialIsSet(), "sourceMaterial");
      this.sourceMaterial = sourceMaterial.orElse(null);
      optBits |= OPT_BIT_SOURCE_MATERIAL;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification#polymer() polymer} to polymer.
     * @param polymer The value for polymer
     * @return {@code this} builder for chained invocation
     */
    public final Builder polymer(com.fhir.Reference polymer) {
      checkNotIsSet(polymerIsSet(), "polymer");
      this.polymer = java.util.Objects.requireNonNull(polymer, "polymer");
      optBits |= OPT_BIT_POLYMER;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification#polymer() polymer} to polymer.
     * @param polymer The value for polymer
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("polymer")
    public final Builder polymer(java.util.Optional<? extends com.fhir.Reference> polymer) {
      checkNotIsSet(polymerIsSet(), "polymer");
      this.polymer = polymer.orElse(null);
      optBits |= OPT_BIT_POLYMER;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for chained invocation
     */
    public final Builder name(java.util.List<com.fhir.SubstanceSpecification_Name> name) {
      checkNotIsSet(nameIsSet(), "name");
      this.name = java.util.Objects.requireNonNull(name, "name");
      optBits |= OPT_BIT_NAME;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    public final Builder name(java.util.Optional<? extends java.util.List<com.fhir.SubstanceSpecification_Name>> name) {
      checkNotIsSet(nameIsSet(), "name");
      this.name = name.orElse(null);
      optBits |= OPT_BIT_NAME;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification#relationship() relationship} to relationship.
     * @param relationship The value for relationship
     * @return {@code this} builder for chained invocation
     */
    public final Builder relationship(java.util.List<com.fhir.SubstanceSpecification_Relationship> relationship) {
      checkNotIsSet(relationshipIsSet(), "relationship");
      this.relationship = java.util.Objects.requireNonNull(relationship, "relationship");
      optBits |= OPT_BIT_RELATIONSHIP;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification#relationship() relationship} to relationship.
     * @param relationship The value for relationship
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("relationship")
    public final Builder relationship(java.util.Optional<? extends java.util.List<com.fhir.SubstanceSpecification_Relationship>> relationship) {
      checkNotIsSet(relationshipIsSet(), "relationship");
      this.relationship = relationship.orElse(null);
      optBits |= OPT_BIT_RELATIONSHIP;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification#protein() protein} to protein.
     * @param protein The value for protein
     * @return {@code this} builder for chained invocation
     */
    public final Builder protein(com.fhir.Reference protein) {
      checkNotIsSet(proteinIsSet(), "protein");
      this.protein = java.util.Objects.requireNonNull(protein, "protein");
      optBits |= OPT_BIT_PROTEIN;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification#protein() protein} to protein.
     * @param protein The value for protein
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("protein")
    public final Builder protein(java.util.Optional<? extends com.fhir.Reference> protein) {
      checkNotIsSet(proteinIsSet(), "protein");
      this.protein = protein.orElse(null);
      optBits |= OPT_BIT_PROTEIN;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    public final Builder implicitRules(com.fhir.uri implicitRules) {
      checkNotIsSet(implicitRulesIsSet(), "implicitRules");
      this.implicitRules = java.util.Objects.requireNonNull(implicitRules, "implicitRules");
      optBits |= OPT_BIT_IMPLICIT_RULES;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
    public final Builder implicitRules(java.util.Optional<? extends com.fhir.uri> implicitRules) {
      checkNotIsSet(implicitRulesIsSet(), "implicitRules");
      this.implicitRules = implicitRules.orElse(null);
      optBits |= OPT_BIT_IMPLICIT_RULES;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification#comment() comment} to comment.
     * @param comment The value for comment
     * @return {@code this} builder for chained invocation
     */
    public final Builder comment(java.lang.String comment) {
      checkNotIsSet(commentIsSet(), "comment");
      this.comment = java.util.Objects.requireNonNull(comment, "comment");
      optBits |= OPT_BIT_COMMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification#comment() comment} to comment.
     * @param comment The value for comment
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("comment")
    public final Builder comment(java.util.Optional<java.lang.String> comment) {
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
    public final Builder contained(java.util.List<com.fhir.ResourceList> contained) {
      checkNotIsSet(containedIsSet(), "contained");
      this.contained = java.util.Objects.requireNonNull(contained, "contained");
      optBits |= OPT_BIT_CONTAINED;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("contained")
    public final Builder contained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> contained) {
      checkNotIsSet(containedIsSet(), "contained");
      this.contained = contained.orElse(null);
      optBits |= OPT_BIT_CONTAINED;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for chained invocation
     */
    public final Builder description(java.lang.String description) {
      checkNotIsSet(descriptionIsSet(), "description");
      this.description = java.util.Objects.requireNonNull(description, "description");
      optBits |= OPT_BIT_DESCRIPTION;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    public final Builder description(java.util.Optional<java.lang.String> description) {
      checkNotIsSet(descriptionIsSet(), "description");
      this.description = description.orElse(null);
      optBits |= OPT_BIT_DESCRIPTION;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification#domain() domain} to domain.
     * @param domain The value for domain
     * @return {@code this} builder for chained invocation
     */
    public final Builder domain(com.fhir.CodeableConcept domain) {
      checkNotIsSet(domainIsSet(), "domain");
      this.domain = java.util.Objects.requireNonNull(domain, "domain");
      optBits |= OPT_BIT_DOMAIN;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification#domain() domain} to domain.
     * @param domain The value for domain
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("domain")
    public final Builder domain(java.util.Optional<? extends com.fhir.CodeableConcept> domain) {
      checkNotIsSet(domainIsSet(), "domain");
      this.domain = domain.orElse(null);
      optBits |= OPT_BIT_DOMAIN;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for chained invocation
     */
    public final Builder code(java.util.List<com.fhir.SubstanceSpecification_Code> code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = java.util.Objects.requireNonNull(code, "code");
      optBits |= OPT_BIT_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("code")
    public final Builder code(java.util.Optional<? extends java.util.List<com.fhir.SubstanceSpecification_Code>> code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = code.orElse(null);
      optBits |= OPT_BIT_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification#molecularWeight() molecularWeight} to molecularWeight.
     * @param molecularWeight The value for molecularWeight
     * @return {@code this} builder for chained invocation
     */
    public final Builder molecularWeight(java.util.List<com.fhir.SubstanceSpecification_MolecularWeight> molecularWeight) {
      checkNotIsSet(molecularWeightIsSet(), "molecularWeight");
      this.molecularWeight = java.util.Objects.requireNonNull(molecularWeight, "molecularWeight");
      optBits |= OPT_BIT_MOLECULAR_WEIGHT;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification#molecularWeight() molecularWeight} to molecularWeight.
     * @param molecularWeight The value for molecularWeight
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("molecularWeight")
    public final Builder molecularWeight(java.util.Optional<? extends java.util.List<com.fhir.SubstanceSpecification_MolecularWeight>> molecularWeight) {
      checkNotIsSet(molecularWeightIsSet(), "molecularWeight");
      this.molecularWeight = molecularWeight.orElse(null);
      optBits |= OPT_BIT_MOLECULAR_WEIGHT;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification#property() property} to property.
     * @param property The value for property
     * @return {@code this} builder for chained invocation
     */
    public final Builder property(java.util.List<com.fhir.SubstanceSpecification_Property> property) {
      checkNotIsSet(propertyIsSet(), "property");
      this.property = java.util.Objects.requireNonNull(property, "property");
      optBits |= OPT_BIT_PROPERTY;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification#property() property} to property.
     * @param property The value for property
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("property")
    public final Builder property(java.util.Optional<? extends java.util.List<com.fhir.SubstanceSpecification_Property>> property) {
      checkNotIsSet(propertyIsSet(), "property");
      this.property = property.orElse(null);
      optBits |= OPT_BIT_PROPERTY;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification#structure() structure} to structure.
     * @param structure The value for structure
     * @return {@code this} builder for chained invocation
     */
    public final Builder structure(com.fhir.SubstanceSpecification_Structure structure) {
      checkNotIsSet(structureIsSet(), "structure");
      this.structure = java.util.Objects.requireNonNull(structure, "structure");
      optBits |= OPT_BIT_STRUCTURE;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification#structure() structure} to structure.
     * @param structure The value for structure
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("structure")
    public final Builder structure(java.util.Optional<? extends com.fhir.SubstanceSpecification_Structure> structure) {
      checkNotIsSet(structureIsSet(), "structure");
      this.structure = structure.orElse(null);
      optBits |= OPT_BIT_STRUCTURE;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(com.fhir.CodeableConcept status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = java.util.Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public final Builder status(java.util.Optional<? extends com.fhir.CodeableConcept> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    public final Builder modifierExtension(java.util.List<com.fhir.Extension> modifierExtension) {
      checkNotIsSet(modifierExtensionIsSet(), "modifierExtension");
      this.modifierExtension = java.util.Objects.requireNonNull(modifierExtension, "modifierExtension");
      optBits |= OPT_BIT_MODIFIER_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public final Builder modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension) {
      checkNotIsSet(modifierExtensionIsSet(), "modifierExtension");
      this.modifierExtension = modifierExtension.orElse(null);
      optBits |= OPT_BIT_MODIFIER_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    public final Builder text(com.fhir.Narrative text) {
      checkNotIsSet(textIsSet(), "text");
      this.text = java.util.Objects.requireNonNull(text, "text");
      optBits |= OPT_BIT_TEXT;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    public final Builder text(java.util.Optional<? extends com.fhir.Narrative> text) {
      checkNotIsSet(textIsSet(), "text");
      this.text = text.orElse(null);
      optBits |= OPT_BIT_TEXT;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    public final Builder id(com.fhir.id id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = java.util.Objects.requireNonNull(id, "id");
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public final Builder id(java.util.Optional<? extends com.fhir.id> id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = id.orElse(null);
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    public final Builder extension(java.util.List<com.fhir.Extension> extension) {
      checkNotIsSet(extensionIsSet(), "extension");
      this.extension = java.util.Objects.requireNonNull(extension, "extension");
      optBits |= OPT_BIT_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public final Builder extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension) {
      checkNotIsSet(extensionIsSet(), "extension");
      this.extension = extension.orElse(null);
      optBits |= OPT_BIT_EXTENSION;
      return this;
    }

    /**
     * Initializes the value for the {@link SubstanceSpecification#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public final Builder resourceType(java.lang.String resourceType) {
      checkNotIsSet(resourceTypeIsSet(), "resourceType");
      this.resourceType = java.util.Objects.requireNonNull(resourceType, "resourceType");
      initBits &= ~INIT_BIT_RESOURCE_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    public final Builder meta(com.fhir.Meta meta) {
      checkNotIsSet(metaIsSet(), "meta");
      this.meta = java.util.Objects.requireNonNull(meta, "meta");
      optBits |= OPT_BIT_META;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("meta")
    public final Builder meta(java.util.Optional<? extends com.fhir.Meta> meta) {
      checkNotIsSet(metaIsSet(), "meta");
      this.meta = meta.orElse(null);
      optBits |= OPT_BIT_META;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification#referenceInformation() referenceInformation} to referenceInformation.
     * @param referenceInformation The value for referenceInformation
     * @return {@code this} builder for chained invocation
     */
    public final Builder referenceInformation(com.fhir.Reference referenceInformation) {
      checkNotIsSet(referenceInformationIsSet(), "referenceInformation");
      this.referenceInformation = java.util.Objects.requireNonNull(referenceInformation, "referenceInformation");
      optBits |= OPT_BIT_REFERENCE_INFORMATION;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification#referenceInformation() referenceInformation} to referenceInformation.
     * @param referenceInformation The value for referenceInformation
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("referenceInformation")
    public final Builder referenceInformation(java.util.Optional<? extends com.fhir.Reference> referenceInformation) {
      checkNotIsSet(referenceInformationIsSet(), "referenceInformation");
      this.referenceInformation = referenceInformation.orElse(null);
      optBits |= OPT_BIT_REFERENCE_INFORMATION;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification#nucleicAcid() nucleicAcid} to nucleicAcid.
     * @param nucleicAcid The value for nucleicAcid
     * @return {@code this} builder for chained invocation
     */
    public final Builder nucleicAcid(com.fhir.Reference nucleicAcid) {
      checkNotIsSet(nucleicAcidIsSet(), "nucleicAcid");
      this.nucleicAcid = java.util.Objects.requireNonNull(nucleicAcid, "nucleicAcid");
      optBits |= OPT_BIT_NUCLEIC_ACID;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification#nucleicAcid() nucleicAcid} to nucleicAcid.
     * @param nucleicAcid The value for nucleicAcid
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("nucleicAcid")
    public final Builder nucleicAcid(java.util.Optional<? extends com.fhir.Reference> nucleicAcid) {
      checkNotIsSet(nucleicAcidIsSet(), "nucleicAcid");
      this.nucleicAcid = nucleicAcid.orElse(null);
      optBits |= OPT_BIT_NUCLEIC_ACID;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification#moiety() moiety} to moiety.
     * @param moiety The value for moiety
     * @return {@code this} builder for chained invocation
     */
    public final Builder moiety(java.util.List<com.fhir.SubstanceSpecification_Moiety> moiety) {
      checkNotIsSet(moietyIsSet(), "moiety");
      this.moiety = java.util.Objects.requireNonNull(moiety, "moiety");
      optBits |= OPT_BIT_MOIETY;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification#moiety() moiety} to moiety.
     * @param moiety The value for moiety
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("moiety")
    public final Builder moiety(java.util.Optional<? extends java.util.List<com.fhir.SubstanceSpecification_Moiety>> moiety) {
      checkNotIsSet(moietyIsSet(), "moiety");
      this.moiety = moiety.orElse(null);
      optBits |= OPT_BIT_MOIETY;
      return this;
    }

    /**
     * Builds a new {@link SubstanceSpecification SubstanceSpecification}.
     * @return An immutable instance of SubstanceSpecification
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.SubstanceSpecification build() {
      checkRequiredAttributes();
      return new ImmutableSubstanceSpecification(
          identifier,
          source,
          type,
          language,
          sourceMaterial,
          polymer,
          name,
          relationship,
          protein,
          implicitRules,
          comment,
          contained,
          description,
          domain,
          code,
          molecularWeight,
          property,
          structure,
          status,
          modifierExtension,
          text,
          id,
          extension,
          resourceType,
          meta,
          referenceInformation,
          nucleicAcid,
          moiety);
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean sourceIsSet() {
      return (optBits & OPT_BIT_SOURCE) != 0;
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean sourceMaterialIsSet() {
      return (optBits & OPT_BIT_SOURCE_MATERIAL) != 0;
    }

    private boolean polymerIsSet() {
      return (optBits & OPT_BIT_POLYMER) != 0;
    }

    private boolean nameIsSet() {
      return (optBits & OPT_BIT_NAME) != 0;
    }

    private boolean relationshipIsSet() {
      return (optBits & OPT_BIT_RELATIONSHIP) != 0;
    }

    private boolean proteinIsSet() {
      return (optBits & OPT_BIT_PROTEIN) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean commentIsSet() {
      return (optBits & OPT_BIT_COMMENT) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean descriptionIsSet() {
      return (optBits & OPT_BIT_DESCRIPTION) != 0;
    }

    private boolean domainIsSet() {
      return (optBits & OPT_BIT_DOMAIN) != 0;
    }

    private boolean codeIsSet() {
      return (optBits & OPT_BIT_CODE) != 0;
    }

    private boolean molecularWeightIsSet() {
      return (optBits & OPT_BIT_MOLECULAR_WEIGHT) != 0;
    }

    private boolean propertyIsSet() {
      return (optBits & OPT_BIT_PROPERTY) != 0;
    }

    private boolean structureIsSet() {
      return (optBits & OPT_BIT_STRUCTURE) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean referenceInformationIsSet() {
      return (optBits & OPT_BIT_REFERENCE_INFORMATION) != 0;
    }

    private boolean nucleicAcidIsSet() {
      return (optBits & OPT_BIT_NUCLEIC_ACID) != 0;
    }

    private boolean moietyIsSet() {
      return (optBits & OPT_BIT_MOIETY) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of SubstanceSpecification is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build SubstanceSpecification, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "SubstanceSpecification", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link SubstanceSpecification#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(java.lang.String resourceType);
  }

  @org.immutables.value.Generated(from = "SubstanceSpecification", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link SubstanceSpecification#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(com.fhir.Identifier identifier);

    /**
     * Initializes the optional value {@link SubstanceSpecification#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(java.util.Optional<? extends com.fhir.Identifier> identifier);

    /**
     * Initializes the optional value {@link SubstanceSpecification#source() source} to source.
     * @param source The value for source
     * @return {@code this} builder for chained invocation
     */
    BuildFinal source(java.util.List<com.fhir.Reference> source);

    /**
     * Initializes the optional value {@link SubstanceSpecification#source() source} to source.
     * @param source The value for source
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal source(java.util.Optional<? extends java.util.List<com.fhir.Reference>> source);

    /**
     * Initializes the optional value {@link SubstanceSpecification#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    BuildFinal type(com.fhir.CodeableConcept type);

    /**
     * Initializes the optional value {@link SubstanceSpecification#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal type(java.util.Optional<? extends com.fhir.CodeableConcept> type);

    /**
     * Initializes the optional value {@link SubstanceSpecification#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(com.fhir.code language);

    /**
     * Initializes the optional value {@link SubstanceSpecification#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(java.util.Optional<? extends com.fhir.code> language);

    /**
     * Initializes the optional value {@link SubstanceSpecification#sourceMaterial() sourceMaterial} to sourceMaterial.
     * @param sourceMaterial The value for sourceMaterial
     * @return {@code this} builder for chained invocation
     */
    BuildFinal sourceMaterial(com.fhir.Reference sourceMaterial);

    /**
     * Initializes the optional value {@link SubstanceSpecification#sourceMaterial() sourceMaterial} to sourceMaterial.
     * @param sourceMaterial The value for sourceMaterial
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal sourceMaterial(java.util.Optional<? extends com.fhir.Reference> sourceMaterial);

    /**
     * Initializes the optional value {@link SubstanceSpecification#polymer() polymer} to polymer.
     * @param polymer The value for polymer
     * @return {@code this} builder for chained invocation
     */
    BuildFinal polymer(com.fhir.Reference polymer);

    /**
     * Initializes the optional value {@link SubstanceSpecification#polymer() polymer} to polymer.
     * @param polymer The value for polymer
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal polymer(java.util.Optional<? extends com.fhir.Reference> polymer);

    /**
     * Initializes the optional value {@link SubstanceSpecification#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for chained invocation
     */
    BuildFinal name(java.util.List<com.fhir.SubstanceSpecification_Name> name);

    /**
     * Initializes the optional value {@link SubstanceSpecification#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal name(java.util.Optional<? extends java.util.List<com.fhir.SubstanceSpecification_Name>> name);

    /**
     * Initializes the optional value {@link SubstanceSpecification#relationship() relationship} to relationship.
     * @param relationship The value for relationship
     * @return {@code this} builder for chained invocation
     */
    BuildFinal relationship(java.util.List<com.fhir.SubstanceSpecification_Relationship> relationship);

    /**
     * Initializes the optional value {@link SubstanceSpecification#relationship() relationship} to relationship.
     * @param relationship The value for relationship
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal relationship(java.util.Optional<? extends java.util.List<com.fhir.SubstanceSpecification_Relationship>> relationship);

    /**
     * Initializes the optional value {@link SubstanceSpecification#protein() protein} to protein.
     * @param protein The value for protein
     * @return {@code this} builder for chained invocation
     */
    BuildFinal protein(com.fhir.Reference protein);

    /**
     * Initializes the optional value {@link SubstanceSpecification#protein() protein} to protein.
     * @param protein The value for protein
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal protein(java.util.Optional<? extends com.fhir.Reference> protein);

    /**
     * Initializes the optional value {@link SubstanceSpecification#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(com.fhir.uri implicitRules);

    /**
     * Initializes the optional value {@link SubstanceSpecification#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(java.util.Optional<? extends com.fhir.uri> implicitRules);

    /**
     * Initializes the optional value {@link SubstanceSpecification#comment() comment} to comment.
     * @param comment The value for comment
     * @return {@code this} builder for chained invocation
     */
    BuildFinal comment(java.lang.String comment);

    /**
     * Initializes the optional value {@link SubstanceSpecification#comment() comment} to comment.
     * @param comment The value for comment
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal comment(java.util.Optional<java.lang.String> comment);

    /**
     * Initializes the optional value {@link SubstanceSpecification#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(java.util.List<com.fhir.ResourceList> contained);

    /**
     * Initializes the optional value {@link SubstanceSpecification#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> contained);

    /**
     * Initializes the optional value {@link SubstanceSpecification#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for chained invocation
     */
    BuildFinal description(java.lang.String description);

    /**
     * Initializes the optional value {@link SubstanceSpecification#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal description(java.util.Optional<java.lang.String> description);

    /**
     * Initializes the optional value {@link SubstanceSpecification#domain() domain} to domain.
     * @param domain The value for domain
     * @return {@code this} builder for chained invocation
     */
    BuildFinal domain(com.fhir.CodeableConcept domain);

    /**
     * Initializes the optional value {@link SubstanceSpecification#domain() domain} to domain.
     * @param domain The value for domain
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal domain(java.util.Optional<? extends com.fhir.CodeableConcept> domain);

    /**
     * Initializes the optional value {@link SubstanceSpecification#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for chained invocation
     */
    BuildFinal code(java.util.List<com.fhir.SubstanceSpecification_Code> code);

    /**
     * Initializes the optional value {@link SubstanceSpecification#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal code(java.util.Optional<? extends java.util.List<com.fhir.SubstanceSpecification_Code>> code);

    /**
     * Initializes the optional value {@link SubstanceSpecification#molecularWeight() molecularWeight} to molecularWeight.
     * @param molecularWeight The value for molecularWeight
     * @return {@code this} builder for chained invocation
     */
    BuildFinal molecularWeight(java.util.List<com.fhir.SubstanceSpecification_MolecularWeight> molecularWeight);

    /**
     * Initializes the optional value {@link SubstanceSpecification#molecularWeight() molecularWeight} to molecularWeight.
     * @param molecularWeight The value for molecularWeight
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal molecularWeight(java.util.Optional<? extends java.util.List<com.fhir.SubstanceSpecification_MolecularWeight>> molecularWeight);

    /**
     * Initializes the optional value {@link SubstanceSpecification#property() property} to property.
     * @param property The value for property
     * @return {@code this} builder for chained invocation
     */
    BuildFinal property(java.util.List<com.fhir.SubstanceSpecification_Property> property);

    /**
     * Initializes the optional value {@link SubstanceSpecification#property() property} to property.
     * @param property The value for property
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal property(java.util.Optional<? extends java.util.List<com.fhir.SubstanceSpecification_Property>> property);

    /**
     * Initializes the optional value {@link SubstanceSpecification#structure() structure} to structure.
     * @param structure The value for structure
     * @return {@code this} builder for chained invocation
     */
    BuildFinal structure(com.fhir.SubstanceSpecification_Structure structure);

    /**
     * Initializes the optional value {@link SubstanceSpecification#structure() structure} to structure.
     * @param structure The value for structure
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal structure(java.util.Optional<? extends com.fhir.SubstanceSpecification_Structure> structure);

    /**
     * Initializes the optional value {@link SubstanceSpecification#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(com.fhir.CodeableConcept status);

    /**
     * Initializes the optional value {@link SubstanceSpecification#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(java.util.Optional<? extends com.fhir.CodeableConcept> status);

    /**
     * Initializes the optional value {@link SubstanceSpecification#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(java.util.List<com.fhir.Extension> modifierExtension);

    /**
     * Initializes the optional value {@link SubstanceSpecification#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link SubstanceSpecification#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(com.fhir.Narrative text);

    /**
     * Initializes the optional value {@link SubstanceSpecification#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(java.util.Optional<? extends com.fhir.Narrative> text);

    /**
     * Initializes the optional value {@link SubstanceSpecification#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(com.fhir.id id);

    /**
     * Initializes the optional value {@link SubstanceSpecification#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<? extends com.fhir.id> id);

    /**
     * Initializes the optional value {@link SubstanceSpecification#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link SubstanceSpecification#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Initializes the optional value {@link SubstanceSpecification#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(com.fhir.Meta meta);

    /**
     * Initializes the optional value {@link SubstanceSpecification#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(java.util.Optional<? extends com.fhir.Meta> meta);

    /**
     * Initializes the optional value {@link SubstanceSpecification#referenceInformation() referenceInformation} to referenceInformation.
     * @param referenceInformation The value for referenceInformation
     * @return {@code this} builder for chained invocation
     */
    BuildFinal referenceInformation(com.fhir.Reference referenceInformation);

    /**
     * Initializes the optional value {@link SubstanceSpecification#referenceInformation() referenceInformation} to referenceInformation.
     * @param referenceInformation The value for referenceInformation
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal referenceInformation(java.util.Optional<? extends com.fhir.Reference> referenceInformation);

    /**
     * Initializes the optional value {@link SubstanceSpecification#nucleicAcid() nucleicAcid} to nucleicAcid.
     * @param nucleicAcid The value for nucleicAcid
     * @return {@code this} builder for chained invocation
     */
    BuildFinal nucleicAcid(com.fhir.Reference nucleicAcid);

    /**
     * Initializes the optional value {@link SubstanceSpecification#nucleicAcid() nucleicAcid} to nucleicAcid.
     * @param nucleicAcid The value for nucleicAcid
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal nucleicAcid(java.util.Optional<? extends com.fhir.Reference> nucleicAcid);

    /**
     * Initializes the optional value {@link SubstanceSpecification#moiety() moiety} to moiety.
     * @param moiety The value for moiety
     * @return {@code this} builder for chained invocation
     */
    BuildFinal moiety(java.util.List<com.fhir.SubstanceSpecification_Moiety> moiety);

    /**
     * Initializes the optional value {@link SubstanceSpecification#moiety() moiety} to moiety.
     * @param moiety The value for moiety
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal moiety(java.util.Optional<? extends java.util.List<com.fhir.SubstanceSpecification_Moiety>> moiety);

    /**
     * Builds a new {@link SubstanceSpecification SubstanceSpecification}.
     * @return An immutable instance of SubstanceSpecification
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    SubstanceSpecification build();
  }
}
