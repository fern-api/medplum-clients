//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link ResearchStudy}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableResearchStudy.builder()}.
 */
@org.immutables.value.Generated(from = "ResearchStudy", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableResearchStudy implements com.fhir.ResearchStudy {
  private final @javax.annotation.Nullable com.fhir.CodeableConcept phase;
  private final @javax.annotation.Nullable java.util.List<com.fhir.RelatedArtifact> relatedArtifact;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> contact;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> keyword;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> enrollment;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept primaryPurposeType;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> protocol;
  private final @javax.annotation.Nullable com.fhir.uri implicitRules;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> partOf;
  private final @javax.annotation.Nullable com.fhir.Period period;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
  private final @javax.annotation.Nullable java.lang.String title;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable com.fhir.markdown description;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ResearchStudy_Arm> arm;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> site;
  private final @javax.annotation.Nullable com.fhir.id id;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ResearchStudy_Objective> objective;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Annotation> note;
  private final @javax.annotation.Nullable com.fhir.Narrative text;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept reasonStopped;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> category;
  private final java.lang.String resourceType;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> focus;
  private final @javax.annotation.Nullable com.fhir.code language;
  private final @javax.annotation.Nullable com.fhir.Meta meta;
  private final @javax.annotation.Nullable com.fhir.ResearchstudyStatus status;
  private final @javax.annotation.Nullable com.fhir.Reference sponsor;
  private final @javax.annotation.Nullable com.fhir.Reference principalInvestigator;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> condition;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> location;

  private ImmutableResearchStudy(
      @javax.annotation.Nullable com.fhir.CodeableConcept phase,
      @javax.annotation.Nullable java.util.List<com.fhir.RelatedArtifact> relatedArtifact,
      @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> contact,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> keyword,
      @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> enrollment,
      @javax.annotation.Nullable com.fhir.CodeableConcept primaryPurposeType,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> protocol,
      @javax.annotation.Nullable com.fhir.uri implicitRules,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> partOf,
      @javax.annotation.Nullable com.fhir.Period period,
      @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier,
      @javax.annotation.Nullable java.lang.String title,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable com.fhir.markdown description,
      @javax.annotation.Nullable java.util.List<com.fhir.ResearchStudy_Arm> arm,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> site,
      @javax.annotation.Nullable com.fhir.id id,
      @javax.annotation.Nullable java.util.List<com.fhir.ResearchStudy_Objective> objective,
      @javax.annotation.Nullable java.util.List<com.fhir.Annotation> note,
      @javax.annotation.Nullable com.fhir.Narrative text,
      @javax.annotation.Nullable com.fhir.CodeableConcept reasonStopped,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> category,
      java.lang.String resourceType,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> focus,
      @javax.annotation.Nullable com.fhir.code language,
      @javax.annotation.Nullable com.fhir.Meta meta,
      @javax.annotation.Nullable com.fhir.ResearchstudyStatus status,
      @javax.annotation.Nullable com.fhir.Reference sponsor,
      @javax.annotation.Nullable com.fhir.Reference principalInvestigator,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> condition,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> location) {
    this.phase = phase;
    this.relatedArtifact = relatedArtifact;
    this.contact = contact;
    this.keyword = keyword;
    this.contained = contained;
    this.extension = extension;
    this.enrollment = enrollment;
    this.primaryPurposeType = primaryPurposeType;
    this.protocol = protocol;
    this.implicitRules = implicitRules;
    this.partOf = partOf;
    this.period = period;
    this.identifier = identifier;
    this.title = title;
    this.modifierExtension = modifierExtension;
    this.description = description;
    this.arm = arm;
    this.site = site;
    this.id = id;
    this.objective = objective;
    this.note = note;
    this.text = text;
    this.reasonStopped = reasonStopped;
    this.category = category;
    this.resourceType = resourceType;
    this.focus = focus;
    this.language = language;
    this.meta = meta;
    this.status = status;
    this.sponsor = sponsor;
    this.principalInvestigator = principalInvestigator;
    this.condition = condition;
    this.location = location;
  }

  /**
   * @return The value of the {@code phase} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("phase")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> phase() {
    return java.util.Optional.ofNullable(phase);
  }

  /**
   * @return The value of the {@code relatedArtifact} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("relatedArtifact")
  @Override
  public java.util.Optional<java.util.List<com.fhir.RelatedArtifact>> relatedArtifact() {
    return java.util.Optional.ofNullable(relatedArtifact);
  }

  /**
   * @return The value of the {@code contact} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("contact")
  @Override
  public java.util.Optional<java.util.List<com.fhir.ContactDetail>> contact() {
    return java.util.Optional.ofNullable(contact);
  }

  /**
   * @return The value of the {@code keyword} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("keyword")
  @Override
  public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> keyword() {
    return java.util.Optional.ofNullable(keyword);
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
   * @return The value of the {@code extension} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("extension")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Extension>> extension() {
    return java.util.Optional.ofNullable(extension);
  }

  /**
   * @return The value of the {@code enrollment} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("enrollment")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> enrollment() {
    return java.util.Optional.ofNullable(enrollment);
  }

  /**
   * @return The value of the {@code primaryPurposeType} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("primaryPurposeType")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> primaryPurposeType() {
    return java.util.Optional.ofNullable(primaryPurposeType);
  }

  /**
   * @return The value of the {@code protocol} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("protocol")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> protocol() {
    return java.util.Optional.ofNullable(protocol);
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
   * @return The value of the {@code partOf} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("partOf")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> partOf() {
    return java.util.Optional.ofNullable(partOf);
  }

  /**
   * @return The value of the {@code period} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("period")
  @Override
  public java.util.Optional<com.fhir.Period> period() {
    return java.util.Optional.ofNullable(period);
  }

  /**
   * @return The value of the {@code identifier} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("identifier")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Identifier>> identifier() {
    return java.util.Optional.ofNullable(identifier);
  }

  /**
   * @return The value of the {@code title} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("title")
  @Override
  public java.util.Optional<java.lang.String> title() {
    return java.util.Optional.ofNullable(title);
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
   * @return The value of the {@code description} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("description")
  @Override
  public java.util.Optional<com.fhir.markdown> description() {
    return java.util.Optional.ofNullable(description);
  }

  /**
   * @return The value of the {@code arm} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("arm")
  @Override
  public java.util.Optional<java.util.List<com.fhir.ResearchStudy_Arm>> arm() {
    return java.util.Optional.ofNullable(arm);
  }

  /**
   * @return The value of the {@code site} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("site")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> site() {
    return java.util.Optional.ofNullable(site);
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
   * @return The value of the {@code objective} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("objective")
  @Override
  public java.util.Optional<java.util.List<com.fhir.ResearchStudy_Objective>> objective() {
    return java.util.Optional.ofNullable(objective);
  }

  /**
   * @return The value of the {@code note} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("note")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Annotation>> note() {
    return java.util.Optional.ofNullable(note);
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
   * @return The value of the {@code reasonStopped} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("reasonStopped")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> reasonStopped() {
    return java.util.Optional.ofNullable(reasonStopped);
  }

  /**
   * @return The value of the {@code category} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("category")
  @Override
  public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> category() {
    return java.util.Optional.ofNullable(category);
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
   * @return The value of the {@code focus} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("focus")
  @Override
  public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> focus() {
    return java.util.Optional.ofNullable(focus);
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
   * @return The value of the {@code meta} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("meta")
  @Override
  public java.util.Optional<com.fhir.Meta> meta() {
    return java.util.Optional.ofNullable(meta);
  }

  /**
   * @return The value of the {@code status} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("status")
  @Override
  public java.util.Optional<com.fhir.ResearchstudyStatus> status() {
    return java.util.Optional.ofNullable(status);
  }

  /**
   * @return The value of the {@code sponsor} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("sponsor")
  @Override
  public java.util.Optional<com.fhir.Reference> sponsor() {
    return java.util.Optional.ofNullable(sponsor);
  }

  /**
   * @return The value of the {@code principalInvestigator} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("principalInvestigator")
  @Override
  public java.util.Optional<com.fhir.Reference> principalInvestigator() {
    return java.util.Optional.ofNullable(principalInvestigator);
  }

  /**
   * @return The value of the {@code condition} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("condition")
  @Override
  public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> condition() {
    return java.util.Optional.ofNullable(condition);
  }

  /**
   * @return The value of the {@code location} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("location")
  @Override
  public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> location() {
    return java.util.Optional.ofNullable(location);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchStudy#phase() phase} attribute.
   * @param value The value for phase
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchStudy withPhase(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "phase");
    if (this.phase == newValue) return this;
    return new ImmutableResearchStudy(
        newValue,
        this.relatedArtifact,
        this.contact,
        this.keyword,
        this.contained,
        this.extension,
        this.enrollment,
        this.primaryPurposeType,
        this.protocol,
        this.implicitRules,
        this.partOf,
        this.period,
        this.identifier,
        this.title,
        this.modifierExtension,
        this.description,
        this.arm,
        this.site,
        this.id,
        this.objective,
        this.note,
        this.text,
        this.reasonStopped,
        this.category,
        this.resourceType,
        this.focus,
        this.language,
        this.meta,
        this.status,
        this.sponsor,
        this.principalInvestigator,
        this.condition,
        this.location);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchStudy#phase() phase} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for phase
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchStudy withPhase(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.phase == value) return this;
    return new ImmutableResearchStudy(
        value,
        this.relatedArtifact,
        this.contact,
        this.keyword,
        this.contained,
        this.extension,
        this.enrollment,
        this.primaryPurposeType,
        this.protocol,
        this.implicitRules,
        this.partOf,
        this.period,
        this.identifier,
        this.title,
        this.modifierExtension,
        this.description,
        this.arm,
        this.site,
        this.id,
        this.objective,
        this.note,
        this.text,
        this.reasonStopped,
        this.category,
        this.resourceType,
        this.focus,
        this.language,
        this.meta,
        this.status,
        this.sponsor,
        this.principalInvestigator,
        this.condition,
        this.location);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchStudy#relatedArtifact() relatedArtifact} attribute.
   * @param value The value for relatedArtifact
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchStudy withRelatedArtifact(java.util.List<com.fhir.RelatedArtifact> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.RelatedArtifact> newValue = java.util.Objects.requireNonNull(value, "relatedArtifact");
    if (this.relatedArtifact == newValue) return this;
    return new ImmutableResearchStudy(
        this.phase,
        newValue,
        this.contact,
        this.keyword,
        this.contained,
        this.extension,
        this.enrollment,
        this.primaryPurposeType,
        this.protocol,
        this.implicitRules,
        this.partOf,
        this.period,
        this.identifier,
        this.title,
        this.modifierExtension,
        this.description,
        this.arm,
        this.site,
        this.id,
        this.objective,
        this.note,
        this.text,
        this.reasonStopped,
        this.category,
        this.resourceType,
        this.focus,
        this.language,
        this.meta,
        this.status,
        this.sponsor,
        this.principalInvestigator,
        this.condition,
        this.location);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchStudy#relatedArtifact() relatedArtifact} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for relatedArtifact
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchStudy withRelatedArtifact(java.util.Optional<? extends java.util.List<com.fhir.RelatedArtifact>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.RelatedArtifact> value = optional.orElse(null);
    if (this.relatedArtifact == value) return this;
    return new ImmutableResearchStudy(
        this.phase,
        value,
        this.contact,
        this.keyword,
        this.contained,
        this.extension,
        this.enrollment,
        this.primaryPurposeType,
        this.protocol,
        this.implicitRules,
        this.partOf,
        this.period,
        this.identifier,
        this.title,
        this.modifierExtension,
        this.description,
        this.arm,
        this.site,
        this.id,
        this.objective,
        this.note,
        this.text,
        this.reasonStopped,
        this.category,
        this.resourceType,
        this.focus,
        this.language,
        this.meta,
        this.status,
        this.sponsor,
        this.principalInvestigator,
        this.condition,
        this.location);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchStudy#contact() contact} attribute.
   * @param value The value for contact
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchStudy withContact(java.util.List<com.fhir.ContactDetail> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> newValue = java.util.Objects.requireNonNull(value, "contact");
    if (this.contact == newValue) return this;
    return new ImmutableResearchStudy(
        this.phase,
        this.relatedArtifact,
        newValue,
        this.keyword,
        this.contained,
        this.extension,
        this.enrollment,
        this.primaryPurposeType,
        this.protocol,
        this.implicitRules,
        this.partOf,
        this.period,
        this.identifier,
        this.title,
        this.modifierExtension,
        this.description,
        this.arm,
        this.site,
        this.id,
        this.objective,
        this.note,
        this.text,
        this.reasonStopped,
        this.category,
        this.resourceType,
        this.focus,
        this.language,
        this.meta,
        this.status,
        this.sponsor,
        this.principalInvestigator,
        this.condition,
        this.location);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchStudy#contact() contact} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contact
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchStudy withContact(java.util.Optional<? extends java.util.List<com.fhir.ContactDetail>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> value = optional.orElse(null);
    if (this.contact == value) return this;
    return new ImmutableResearchStudy(
        this.phase,
        this.relatedArtifact,
        value,
        this.keyword,
        this.contained,
        this.extension,
        this.enrollment,
        this.primaryPurposeType,
        this.protocol,
        this.implicitRules,
        this.partOf,
        this.period,
        this.identifier,
        this.title,
        this.modifierExtension,
        this.description,
        this.arm,
        this.site,
        this.id,
        this.objective,
        this.note,
        this.text,
        this.reasonStopped,
        this.category,
        this.resourceType,
        this.focus,
        this.language,
        this.meta,
        this.status,
        this.sponsor,
        this.principalInvestigator,
        this.condition,
        this.location);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchStudy#keyword() keyword} attribute.
   * @param value The value for keyword
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchStudy withKeyword(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "keyword");
    if (this.keyword == newValue) return this;
    return new ImmutableResearchStudy(
        this.phase,
        this.relatedArtifact,
        this.contact,
        newValue,
        this.contained,
        this.extension,
        this.enrollment,
        this.primaryPurposeType,
        this.protocol,
        this.implicitRules,
        this.partOf,
        this.period,
        this.identifier,
        this.title,
        this.modifierExtension,
        this.description,
        this.arm,
        this.site,
        this.id,
        this.objective,
        this.note,
        this.text,
        this.reasonStopped,
        this.category,
        this.resourceType,
        this.focus,
        this.language,
        this.meta,
        this.status,
        this.sponsor,
        this.principalInvestigator,
        this.condition,
        this.location);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchStudy#keyword() keyword} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for keyword
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchStudy withKeyword(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.keyword == value) return this;
    return new ImmutableResearchStudy(
        this.phase,
        this.relatedArtifact,
        this.contact,
        value,
        this.contained,
        this.extension,
        this.enrollment,
        this.primaryPurposeType,
        this.protocol,
        this.implicitRules,
        this.partOf,
        this.period,
        this.identifier,
        this.title,
        this.modifierExtension,
        this.description,
        this.arm,
        this.site,
        this.id,
        this.objective,
        this.note,
        this.text,
        this.reasonStopped,
        this.category,
        this.resourceType,
        this.focus,
        this.language,
        this.meta,
        this.status,
        this.sponsor,
        this.principalInvestigator,
        this.condition,
        this.location);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchStudy#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchStudy withContained(java.util.List<com.fhir.ResourceList> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> newValue = java.util.Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableResearchStudy(
        this.phase,
        this.relatedArtifact,
        this.contact,
        this.keyword,
        newValue,
        this.extension,
        this.enrollment,
        this.primaryPurposeType,
        this.protocol,
        this.implicitRules,
        this.partOf,
        this.period,
        this.identifier,
        this.title,
        this.modifierExtension,
        this.description,
        this.arm,
        this.site,
        this.id,
        this.objective,
        this.note,
        this.text,
        this.reasonStopped,
        this.category,
        this.resourceType,
        this.focus,
        this.language,
        this.meta,
        this.status,
        this.sponsor,
        this.principalInvestigator,
        this.condition,
        this.location);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchStudy#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchStudy withContained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableResearchStudy(
        this.phase,
        this.relatedArtifact,
        this.contact,
        this.keyword,
        value,
        this.extension,
        this.enrollment,
        this.primaryPurposeType,
        this.protocol,
        this.implicitRules,
        this.partOf,
        this.period,
        this.identifier,
        this.title,
        this.modifierExtension,
        this.description,
        this.arm,
        this.site,
        this.id,
        this.objective,
        this.note,
        this.text,
        this.reasonStopped,
        this.category,
        this.resourceType,
        this.focus,
        this.language,
        this.meta,
        this.status,
        this.sponsor,
        this.principalInvestigator,
        this.condition,
        this.location);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchStudy#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchStudy withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableResearchStudy(
        this.phase,
        this.relatedArtifact,
        this.contact,
        this.keyword,
        this.contained,
        newValue,
        this.enrollment,
        this.primaryPurposeType,
        this.protocol,
        this.implicitRules,
        this.partOf,
        this.period,
        this.identifier,
        this.title,
        this.modifierExtension,
        this.description,
        this.arm,
        this.site,
        this.id,
        this.objective,
        this.note,
        this.text,
        this.reasonStopped,
        this.category,
        this.resourceType,
        this.focus,
        this.language,
        this.meta,
        this.status,
        this.sponsor,
        this.principalInvestigator,
        this.condition,
        this.location);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchStudy#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchStudy withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableResearchStudy(
        this.phase,
        this.relatedArtifact,
        this.contact,
        this.keyword,
        this.contained,
        value,
        this.enrollment,
        this.primaryPurposeType,
        this.protocol,
        this.implicitRules,
        this.partOf,
        this.period,
        this.identifier,
        this.title,
        this.modifierExtension,
        this.description,
        this.arm,
        this.site,
        this.id,
        this.objective,
        this.note,
        this.text,
        this.reasonStopped,
        this.category,
        this.resourceType,
        this.focus,
        this.language,
        this.meta,
        this.status,
        this.sponsor,
        this.principalInvestigator,
        this.condition,
        this.location);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchStudy#enrollment() enrollment} attribute.
   * @param value The value for enrollment
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchStudy withEnrollment(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "enrollment");
    if (this.enrollment == newValue) return this;
    return new ImmutableResearchStudy(
        this.phase,
        this.relatedArtifact,
        this.contact,
        this.keyword,
        this.contained,
        this.extension,
        newValue,
        this.primaryPurposeType,
        this.protocol,
        this.implicitRules,
        this.partOf,
        this.period,
        this.identifier,
        this.title,
        this.modifierExtension,
        this.description,
        this.arm,
        this.site,
        this.id,
        this.objective,
        this.note,
        this.text,
        this.reasonStopped,
        this.category,
        this.resourceType,
        this.focus,
        this.language,
        this.meta,
        this.status,
        this.sponsor,
        this.principalInvestigator,
        this.condition,
        this.location);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchStudy#enrollment() enrollment} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for enrollment
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchStudy withEnrollment(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.enrollment == value) return this;
    return new ImmutableResearchStudy(
        this.phase,
        this.relatedArtifact,
        this.contact,
        this.keyword,
        this.contained,
        this.extension,
        value,
        this.primaryPurposeType,
        this.protocol,
        this.implicitRules,
        this.partOf,
        this.period,
        this.identifier,
        this.title,
        this.modifierExtension,
        this.description,
        this.arm,
        this.site,
        this.id,
        this.objective,
        this.note,
        this.text,
        this.reasonStopped,
        this.category,
        this.resourceType,
        this.focus,
        this.language,
        this.meta,
        this.status,
        this.sponsor,
        this.principalInvestigator,
        this.condition,
        this.location);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchStudy#primaryPurposeType() primaryPurposeType} attribute.
   * @param value The value for primaryPurposeType
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchStudy withPrimaryPurposeType(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "primaryPurposeType");
    if (this.primaryPurposeType == newValue) return this;
    return new ImmutableResearchStudy(
        this.phase,
        this.relatedArtifact,
        this.contact,
        this.keyword,
        this.contained,
        this.extension,
        this.enrollment,
        newValue,
        this.protocol,
        this.implicitRules,
        this.partOf,
        this.period,
        this.identifier,
        this.title,
        this.modifierExtension,
        this.description,
        this.arm,
        this.site,
        this.id,
        this.objective,
        this.note,
        this.text,
        this.reasonStopped,
        this.category,
        this.resourceType,
        this.focus,
        this.language,
        this.meta,
        this.status,
        this.sponsor,
        this.principalInvestigator,
        this.condition,
        this.location);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchStudy#primaryPurposeType() primaryPurposeType} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for primaryPurposeType
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchStudy withPrimaryPurposeType(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.primaryPurposeType == value) return this;
    return new ImmutableResearchStudy(
        this.phase,
        this.relatedArtifact,
        this.contact,
        this.keyword,
        this.contained,
        this.extension,
        this.enrollment,
        value,
        this.protocol,
        this.implicitRules,
        this.partOf,
        this.period,
        this.identifier,
        this.title,
        this.modifierExtension,
        this.description,
        this.arm,
        this.site,
        this.id,
        this.objective,
        this.note,
        this.text,
        this.reasonStopped,
        this.category,
        this.resourceType,
        this.focus,
        this.language,
        this.meta,
        this.status,
        this.sponsor,
        this.principalInvestigator,
        this.condition,
        this.location);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchStudy#protocol() protocol} attribute.
   * @param value The value for protocol
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchStudy withProtocol(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "protocol");
    if (this.protocol == newValue) return this;
    return new ImmutableResearchStudy(
        this.phase,
        this.relatedArtifact,
        this.contact,
        this.keyword,
        this.contained,
        this.extension,
        this.enrollment,
        this.primaryPurposeType,
        newValue,
        this.implicitRules,
        this.partOf,
        this.period,
        this.identifier,
        this.title,
        this.modifierExtension,
        this.description,
        this.arm,
        this.site,
        this.id,
        this.objective,
        this.note,
        this.text,
        this.reasonStopped,
        this.category,
        this.resourceType,
        this.focus,
        this.language,
        this.meta,
        this.status,
        this.sponsor,
        this.principalInvestigator,
        this.condition,
        this.location);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchStudy#protocol() protocol} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for protocol
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchStudy withProtocol(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.protocol == value) return this;
    return new ImmutableResearchStudy(
        this.phase,
        this.relatedArtifact,
        this.contact,
        this.keyword,
        this.contained,
        this.extension,
        this.enrollment,
        this.primaryPurposeType,
        value,
        this.implicitRules,
        this.partOf,
        this.period,
        this.identifier,
        this.title,
        this.modifierExtension,
        this.description,
        this.arm,
        this.site,
        this.id,
        this.objective,
        this.note,
        this.text,
        this.reasonStopped,
        this.category,
        this.resourceType,
        this.focus,
        this.language,
        this.meta,
        this.status,
        this.sponsor,
        this.principalInvestigator,
        this.condition,
        this.location);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchStudy#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchStudy withImplicitRules(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableResearchStudy(
        this.phase,
        this.relatedArtifact,
        this.contact,
        this.keyword,
        this.contained,
        this.extension,
        this.enrollment,
        this.primaryPurposeType,
        this.protocol,
        newValue,
        this.partOf,
        this.period,
        this.identifier,
        this.title,
        this.modifierExtension,
        this.description,
        this.arm,
        this.site,
        this.id,
        this.objective,
        this.note,
        this.text,
        this.reasonStopped,
        this.category,
        this.resourceType,
        this.focus,
        this.language,
        this.meta,
        this.status,
        this.sponsor,
        this.principalInvestigator,
        this.condition,
        this.location);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchStudy#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchStudy withImplicitRules(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableResearchStudy(
        this.phase,
        this.relatedArtifact,
        this.contact,
        this.keyword,
        this.contained,
        this.extension,
        this.enrollment,
        this.primaryPurposeType,
        this.protocol,
        value,
        this.partOf,
        this.period,
        this.identifier,
        this.title,
        this.modifierExtension,
        this.description,
        this.arm,
        this.site,
        this.id,
        this.objective,
        this.note,
        this.text,
        this.reasonStopped,
        this.category,
        this.resourceType,
        this.focus,
        this.language,
        this.meta,
        this.status,
        this.sponsor,
        this.principalInvestigator,
        this.condition,
        this.location);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchStudy#partOf() partOf} attribute.
   * @param value The value for partOf
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchStudy withPartOf(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "partOf");
    if (this.partOf == newValue) return this;
    return new ImmutableResearchStudy(
        this.phase,
        this.relatedArtifact,
        this.contact,
        this.keyword,
        this.contained,
        this.extension,
        this.enrollment,
        this.primaryPurposeType,
        this.protocol,
        this.implicitRules,
        newValue,
        this.period,
        this.identifier,
        this.title,
        this.modifierExtension,
        this.description,
        this.arm,
        this.site,
        this.id,
        this.objective,
        this.note,
        this.text,
        this.reasonStopped,
        this.category,
        this.resourceType,
        this.focus,
        this.language,
        this.meta,
        this.status,
        this.sponsor,
        this.principalInvestigator,
        this.condition,
        this.location);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchStudy#partOf() partOf} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for partOf
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchStudy withPartOf(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.partOf == value) return this;
    return new ImmutableResearchStudy(
        this.phase,
        this.relatedArtifact,
        this.contact,
        this.keyword,
        this.contained,
        this.extension,
        this.enrollment,
        this.primaryPurposeType,
        this.protocol,
        this.implicitRules,
        value,
        this.period,
        this.identifier,
        this.title,
        this.modifierExtension,
        this.description,
        this.arm,
        this.site,
        this.id,
        this.objective,
        this.note,
        this.text,
        this.reasonStopped,
        this.category,
        this.resourceType,
        this.focus,
        this.language,
        this.meta,
        this.status,
        this.sponsor,
        this.principalInvestigator,
        this.condition,
        this.location);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchStudy#period() period} attribute.
   * @param value The value for period
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchStudy withPeriod(com.fhir.Period value) {
    @javax.annotation.Nullable com.fhir.Period newValue = java.util.Objects.requireNonNull(value, "period");
    if (this.period == newValue) return this;
    return new ImmutableResearchStudy(
        this.phase,
        this.relatedArtifact,
        this.contact,
        this.keyword,
        this.contained,
        this.extension,
        this.enrollment,
        this.primaryPurposeType,
        this.protocol,
        this.implicitRules,
        this.partOf,
        newValue,
        this.identifier,
        this.title,
        this.modifierExtension,
        this.description,
        this.arm,
        this.site,
        this.id,
        this.objective,
        this.note,
        this.text,
        this.reasonStopped,
        this.category,
        this.resourceType,
        this.focus,
        this.language,
        this.meta,
        this.status,
        this.sponsor,
        this.principalInvestigator,
        this.condition,
        this.location);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchStudy#period() period} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for period
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchStudy withPeriod(java.util.Optional<? extends com.fhir.Period> optional) {
    @javax.annotation.Nullable com.fhir.Period value = optional.orElse(null);
    if (this.period == value) return this;
    return new ImmutableResearchStudy(
        this.phase,
        this.relatedArtifact,
        this.contact,
        this.keyword,
        this.contained,
        this.extension,
        this.enrollment,
        this.primaryPurposeType,
        this.protocol,
        this.implicitRules,
        this.partOf,
        value,
        this.identifier,
        this.title,
        this.modifierExtension,
        this.description,
        this.arm,
        this.site,
        this.id,
        this.objective,
        this.note,
        this.text,
        this.reasonStopped,
        this.category,
        this.resourceType,
        this.focus,
        this.language,
        this.meta,
        this.status,
        this.sponsor,
        this.principalInvestigator,
        this.condition,
        this.location);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchStudy#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchStudy withIdentifier(java.util.List<com.fhir.Identifier> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> newValue = java.util.Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableResearchStudy(
        this.phase,
        this.relatedArtifact,
        this.contact,
        this.keyword,
        this.contained,
        this.extension,
        this.enrollment,
        this.primaryPurposeType,
        this.protocol,
        this.implicitRules,
        this.partOf,
        this.period,
        newValue,
        this.title,
        this.modifierExtension,
        this.description,
        this.arm,
        this.site,
        this.id,
        this.objective,
        this.note,
        this.text,
        this.reasonStopped,
        this.category,
        this.resourceType,
        this.focus,
        this.language,
        this.meta,
        this.status,
        this.sponsor,
        this.principalInvestigator,
        this.condition,
        this.location);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchStudy#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchStudy withIdentifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableResearchStudy(
        this.phase,
        this.relatedArtifact,
        this.contact,
        this.keyword,
        this.contained,
        this.extension,
        this.enrollment,
        this.primaryPurposeType,
        this.protocol,
        this.implicitRules,
        this.partOf,
        this.period,
        value,
        this.title,
        this.modifierExtension,
        this.description,
        this.arm,
        this.site,
        this.id,
        this.objective,
        this.note,
        this.text,
        this.reasonStopped,
        this.category,
        this.resourceType,
        this.focus,
        this.language,
        this.meta,
        this.status,
        this.sponsor,
        this.principalInvestigator,
        this.condition,
        this.location);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchStudy#title() title} attribute.
   * @param value The value for title
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchStudy withTitle(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "title");
    if (java.util.Objects.equals(this.title, newValue)) return this;
    return new ImmutableResearchStudy(
        this.phase,
        this.relatedArtifact,
        this.contact,
        this.keyword,
        this.contained,
        this.extension,
        this.enrollment,
        this.primaryPurposeType,
        this.protocol,
        this.implicitRules,
        this.partOf,
        this.period,
        this.identifier,
        newValue,
        this.modifierExtension,
        this.description,
        this.arm,
        this.site,
        this.id,
        this.objective,
        this.note,
        this.text,
        this.reasonStopped,
        this.category,
        this.resourceType,
        this.focus,
        this.language,
        this.meta,
        this.status,
        this.sponsor,
        this.principalInvestigator,
        this.condition,
        this.location);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchStudy#title() title} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for title
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchStudy withTitle(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.title, value)) return this;
    return new ImmutableResearchStudy(
        this.phase,
        this.relatedArtifact,
        this.contact,
        this.keyword,
        this.contained,
        this.extension,
        this.enrollment,
        this.primaryPurposeType,
        this.protocol,
        this.implicitRules,
        this.partOf,
        this.period,
        this.identifier,
        value,
        this.modifierExtension,
        this.description,
        this.arm,
        this.site,
        this.id,
        this.objective,
        this.note,
        this.text,
        this.reasonStopped,
        this.category,
        this.resourceType,
        this.focus,
        this.language,
        this.meta,
        this.status,
        this.sponsor,
        this.principalInvestigator,
        this.condition,
        this.location);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchStudy#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchStudy withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableResearchStudy(
        this.phase,
        this.relatedArtifact,
        this.contact,
        this.keyword,
        this.contained,
        this.extension,
        this.enrollment,
        this.primaryPurposeType,
        this.protocol,
        this.implicitRules,
        this.partOf,
        this.period,
        this.identifier,
        this.title,
        newValue,
        this.description,
        this.arm,
        this.site,
        this.id,
        this.objective,
        this.note,
        this.text,
        this.reasonStopped,
        this.category,
        this.resourceType,
        this.focus,
        this.language,
        this.meta,
        this.status,
        this.sponsor,
        this.principalInvestigator,
        this.condition,
        this.location);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchStudy#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchStudy withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableResearchStudy(
        this.phase,
        this.relatedArtifact,
        this.contact,
        this.keyword,
        this.contained,
        this.extension,
        this.enrollment,
        this.primaryPurposeType,
        this.protocol,
        this.implicitRules,
        this.partOf,
        this.period,
        this.identifier,
        this.title,
        value,
        this.description,
        this.arm,
        this.site,
        this.id,
        this.objective,
        this.note,
        this.text,
        this.reasonStopped,
        this.category,
        this.resourceType,
        this.focus,
        this.language,
        this.meta,
        this.status,
        this.sponsor,
        this.principalInvestigator,
        this.condition,
        this.location);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchStudy#description() description} attribute.
   * @param value The value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchStudy withDescription(com.fhir.markdown value) {
    @javax.annotation.Nullable com.fhir.markdown newValue = java.util.Objects.requireNonNull(value, "description");
    if (this.description == newValue) return this;
    return new ImmutableResearchStudy(
        this.phase,
        this.relatedArtifact,
        this.contact,
        this.keyword,
        this.contained,
        this.extension,
        this.enrollment,
        this.primaryPurposeType,
        this.protocol,
        this.implicitRules,
        this.partOf,
        this.period,
        this.identifier,
        this.title,
        this.modifierExtension,
        newValue,
        this.arm,
        this.site,
        this.id,
        this.objective,
        this.note,
        this.text,
        this.reasonStopped,
        this.category,
        this.resourceType,
        this.focus,
        this.language,
        this.meta,
        this.status,
        this.sponsor,
        this.principalInvestigator,
        this.condition,
        this.location);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchStudy#description() description} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for description
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchStudy withDescription(java.util.Optional<? extends com.fhir.markdown> optional) {
    @javax.annotation.Nullable com.fhir.markdown value = optional.orElse(null);
    if (this.description == value) return this;
    return new ImmutableResearchStudy(
        this.phase,
        this.relatedArtifact,
        this.contact,
        this.keyword,
        this.contained,
        this.extension,
        this.enrollment,
        this.primaryPurposeType,
        this.protocol,
        this.implicitRules,
        this.partOf,
        this.period,
        this.identifier,
        this.title,
        this.modifierExtension,
        value,
        this.arm,
        this.site,
        this.id,
        this.objective,
        this.note,
        this.text,
        this.reasonStopped,
        this.category,
        this.resourceType,
        this.focus,
        this.language,
        this.meta,
        this.status,
        this.sponsor,
        this.principalInvestigator,
        this.condition,
        this.location);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchStudy#arm() arm} attribute.
   * @param value The value for arm
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchStudy withArm(java.util.List<com.fhir.ResearchStudy_Arm> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResearchStudy_Arm> newValue = java.util.Objects.requireNonNull(value, "arm");
    if (this.arm == newValue) return this;
    return new ImmutableResearchStudy(
        this.phase,
        this.relatedArtifact,
        this.contact,
        this.keyword,
        this.contained,
        this.extension,
        this.enrollment,
        this.primaryPurposeType,
        this.protocol,
        this.implicitRules,
        this.partOf,
        this.period,
        this.identifier,
        this.title,
        this.modifierExtension,
        this.description,
        newValue,
        this.site,
        this.id,
        this.objective,
        this.note,
        this.text,
        this.reasonStopped,
        this.category,
        this.resourceType,
        this.focus,
        this.language,
        this.meta,
        this.status,
        this.sponsor,
        this.principalInvestigator,
        this.condition,
        this.location);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchStudy#arm() arm} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for arm
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchStudy withArm(java.util.Optional<? extends java.util.List<com.fhir.ResearchStudy_Arm>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResearchStudy_Arm> value = optional.orElse(null);
    if (this.arm == value) return this;
    return new ImmutableResearchStudy(
        this.phase,
        this.relatedArtifact,
        this.contact,
        this.keyword,
        this.contained,
        this.extension,
        this.enrollment,
        this.primaryPurposeType,
        this.protocol,
        this.implicitRules,
        this.partOf,
        this.period,
        this.identifier,
        this.title,
        this.modifierExtension,
        this.description,
        value,
        this.site,
        this.id,
        this.objective,
        this.note,
        this.text,
        this.reasonStopped,
        this.category,
        this.resourceType,
        this.focus,
        this.language,
        this.meta,
        this.status,
        this.sponsor,
        this.principalInvestigator,
        this.condition,
        this.location);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchStudy#site() site} attribute.
   * @param value The value for site
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchStudy withSite(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "site");
    if (this.site == newValue) return this;
    return new ImmutableResearchStudy(
        this.phase,
        this.relatedArtifact,
        this.contact,
        this.keyword,
        this.contained,
        this.extension,
        this.enrollment,
        this.primaryPurposeType,
        this.protocol,
        this.implicitRules,
        this.partOf,
        this.period,
        this.identifier,
        this.title,
        this.modifierExtension,
        this.description,
        this.arm,
        newValue,
        this.id,
        this.objective,
        this.note,
        this.text,
        this.reasonStopped,
        this.category,
        this.resourceType,
        this.focus,
        this.language,
        this.meta,
        this.status,
        this.sponsor,
        this.principalInvestigator,
        this.condition,
        this.location);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchStudy#site() site} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for site
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchStudy withSite(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.site == value) return this;
    return new ImmutableResearchStudy(
        this.phase,
        this.relatedArtifact,
        this.contact,
        this.keyword,
        this.contained,
        this.extension,
        this.enrollment,
        this.primaryPurposeType,
        this.protocol,
        this.implicitRules,
        this.partOf,
        this.period,
        this.identifier,
        this.title,
        this.modifierExtension,
        this.description,
        this.arm,
        value,
        this.id,
        this.objective,
        this.note,
        this.text,
        this.reasonStopped,
        this.category,
        this.resourceType,
        this.focus,
        this.language,
        this.meta,
        this.status,
        this.sponsor,
        this.principalInvestigator,
        this.condition,
        this.location);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchStudy#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchStudy withId(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableResearchStudy(
        this.phase,
        this.relatedArtifact,
        this.contact,
        this.keyword,
        this.contained,
        this.extension,
        this.enrollment,
        this.primaryPurposeType,
        this.protocol,
        this.implicitRules,
        this.partOf,
        this.period,
        this.identifier,
        this.title,
        this.modifierExtension,
        this.description,
        this.arm,
        this.site,
        newValue,
        this.objective,
        this.note,
        this.text,
        this.reasonStopped,
        this.category,
        this.resourceType,
        this.focus,
        this.language,
        this.meta,
        this.status,
        this.sponsor,
        this.principalInvestigator,
        this.condition,
        this.location);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchStudy#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchStudy withId(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableResearchStudy(
        this.phase,
        this.relatedArtifact,
        this.contact,
        this.keyword,
        this.contained,
        this.extension,
        this.enrollment,
        this.primaryPurposeType,
        this.protocol,
        this.implicitRules,
        this.partOf,
        this.period,
        this.identifier,
        this.title,
        this.modifierExtension,
        this.description,
        this.arm,
        this.site,
        value,
        this.objective,
        this.note,
        this.text,
        this.reasonStopped,
        this.category,
        this.resourceType,
        this.focus,
        this.language,
        this.meta,
        this.status,
        this.sponsor,
        this.principalInvestigator,
        this.condition,
        this.location);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchStudy#objective() objective} attribute.
   * @param value The value for objective
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchStudy withObjective(java.util.List<com.fhir.ResearchStudy_Objective> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResearchStudy_Objective> newValue = java.util.Objects.requireNonNull(value, "objective");
    if (this.objective == newValue) return this;
    return new ImmutableResearchStudy(
        this.phase,
        this.relatedArtifact,
        this.contact,
        this.keyword,
        this.contained,
        this.extension,
        this.enrollment,
        this.primaryPurposeType,
        this.protocol,
        this.implicitRules,
        this.partOf,
        this.period,
        this.identifier,
        this.title,
        this.modifierExtension,
        this.description,
        this.arm,
        this.site,
        this.id,
        newValue,
        this.note,
        this.text,
        this.reasonStopped,
        this.category,
        this.resourceType,
        this.focus,
        this.language,
        this.meta,
        this.status,
        this.sponsor,
        this.principalInvestigator,
        this.condition,
        this.location);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchStudy#objective() objective} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for objective
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchStudy withObjective(java.util.Optional<? extends java.util.List<com.fhir.ResearchStudy_Objective>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResearchStudy_Objective> value = optional.orElse(null);
    if (this.objective == value) return this;
    return new ImmutableResearchStudy(
        this.phase,
        this.relatedArtifact,
        this.contact,
        this.keyword,
        this.contained,
        this.extension,
        this.enrollment,
        this.primaryPurposeType,
        this.protocol,
        this.implicitRules,
        this.partOf,
        this.period,
        this.identifier,
        this.title,
        this.modifierExtension,
        this.description,
        this.arm,
        this.site,
        this.id,
        value,
        this.note,
        this.text,
        this.reasonStopped,
        this.category,
        this.resourceType,
        this.focus,
        this.language,
        this.meta,
        this.status,
        this.sponsor,
        this.principalInvestigator,
        this.condition,
        this.location);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchStudy#note() note} attribute.
   * @param value The value for note
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchStudy withNote(java.util.List<com.fhir.Annotation> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Annotation> newValue = java.util.Objects.requireNonNull(value, "note");
    if (this.note == newValue) return this;
    return new ImmutableResearchStudy(
        this.phase,
        this.relatedArtifact,
        this.contact,
        this.keyword,
        this.contained,
        this.extension,
        this.enrollment,
        this.primaryPurposeType,
        this.protocol,
        this.implicitRules,
        this.partOf,
        this.period,
        this.identifier,
        this.title,
        this.modifierExtension,
        this.description,
        this.arm,
        this.site,
        this.id,
        this.objective,
        newValue,
        this.text,
        this.reasonStopped,
        this.category,
        this.resourceType,
        this.focus,
        this.language,
        this.meta,
        this.status,
        this.sponsor,
        this.principalInvestigator,
        this.condition,
        this.location);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchStudy#note() note} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for note
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchStudy withNote(java.util.Optional<? extends java.util.List<com.fhir.Annotation>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Annotation> value = optional.orElse(null);
    if (this.note == value) return this;
    return new ImmutableResearchStudy(
        this.phase,
        this.relatedArtifact,
        this.contact,
        this.keyword,
        this.contained,
        this.extension,
        this.enrollment,
        this.primaryPurposeType,
        this.protocol,
        this.implicitRules,
        this.partOf,
        this.period,
        this.identifier,
        this.title,
        this.modifierExtension,
        this.description,
        this.arm,
        this.site,
        this.id,
        this.objective,
        value,
        this.text,
        this.reasonStopped,
        this.category,
        this.resourceType,
        this.focus,
        this.language,
        this.meta,
        this.status,
        this.sponsor,
        this.principalInvestigator,
        this.condition,
        this.location);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchStudy#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchStudy withText(com.fhir.Narrative value) {
    @javax.annotation.Nullable com.fhir.Narrative newValue = java.util.Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableResearchStudy(
        this.phase,
        this.relatedArtifact,
        this.contact,
        this.keyword,
        this.contained,
        this.extension,
        this.enrollment,
        this.primaryPurposeType,
        this.protocol,
        this.implicitRules,
        this.partOf,
        this.period,
        this.identifier,
        this.title,
        this.modifierExtension,
        this.description,
        this.arm,
        this.site,
        this.id,
        this.objective,
        this.note,
        newValue,
        this.reasonStopped,
        this.category,
        this.resourceType,
        this.focus,
        this.language,
        this.meta,
        this.status,
        this.sponsor,
        this.principalInvestigator,
        this.condition,
        this.location);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchStudy#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchStudy withText(java.util.Optional<? extends com.fhir.Narrative> optional) {
    @javax.annotation.Nullable com.fhir.Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableResearchStudy(
        this.phase,
        this.relatedArtifact,
        this.contact,
        this.keyword,
        this.contained,
        this.extension,
        this.enrollment,
        this.primaryPurposeType,
        this.protocol,
        this.implicitRules,
        this.partOf,
        this.period,
        this.identifier,
        this.title,
        this.modifierExtension,
        this.description,
        this.arm,
        this.site,
        this.id,
        this.objective,
        this.note,
        value,
        this.reasonStopped,
        this.category,
        this.resourceType,
        this.focus,
        this.language,
        this.meta,
        this.status,
        this.sponsor,
        this.principalInvestigator,
        this.condition,
        this.location);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchStudy#reasonStopped() reasonStopped} attribute.
   * @param value The value for reasonStopped
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchStudy withReasonStopped(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "reasonStopped");
    if (this.reasonStopped == newValue) return this;
    return new ImmutableResearchStudy(
        this.phase,
        this.relatedArtifact,
        this.contact,
        this.keyword,
        this.contained,
        this.extension,
        this.enrollment,
        this.primaryPurposeType,
        this.protocol,
        this.implicitRules,
        this.partOf,
        this.period,
        this.identifier,
        this.title,
        this.modifierExtension,
        this.description,
        this.arm,
        this.site,
        this.id,
        this.objective,
        this.note,
        this.text,
        newValue,
        this.category,
        this.resourceType,
        this.focus,
        this.language,
        this.meta,
        this.status,
        this.sponsor,
        this.principalInvestigator,
        this.condition,
        this.location);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchStudy#reasonStopped() reasonStopped} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for reasonStopped
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchStudy withReasonStopped(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.reasonStopped == value) return this;
    return new ImmutableResearchStudy(
        this.phase,
        this.relatedArtifact,
        this.contact,
        this.keyword,
        this.contained,
        this.extension,
        this.enrollment,
        this.primaryPurposeType,
        this.protocol,
        this.implicitRules,
        this.partOf,
        this.period,
        this.identifier,
        this.title,
        this.modifierExtension,
        this.description,
        this.arm,
        this.site,
        this.id,
        this.objective,
        this.note,
        this.text,
        value,
        this.category,
        this.resourceType,
        this.focus,
        this.language,
        this.meta,
        this.status,
        this.sponsor,
        this.principalInvestigator,
        this.condition,
        this.location);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchStudy#category() category} attribute.
   * @param value The value for category
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchStudy withCategory(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "category");
    if (this.category == newValue) return this;
    return new ImmutableResearchStudy(
        this.phase,
        this.relatedArtifact,
        this.contact,
        this.keyword,
        this.contained,
        this.extension,
        this.enrollment,
        this.primaryPurposeType,
        this.protocol,
        this.implicitRules,
        this.partOf,
        this.period,
        this.identifier,
        this.title,
        this.modifierExtension,
        this.description,
        this.arm,
        this.site,
        this.id,
        this.objective,
        this.note,
        this.text,
        this.reasonStopped,
        newValue,
        this.resourceType,
        this.focus,
        this.language,
        this.meta,
        this.status,
        this.sponsor,
        this.principalInvestigator,
        this.condition,
        this.location);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchStudy#category() category} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for category
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchStudy withCategory(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.category == value) return this;
    return new ImmutableResearchStudy(
        this.phase,
        this.relatedArtifact,
        this.contact,
        this.keyword,
        this.contained,
        this.extension,
        this.enrollment,
        this.primaryPurposeType,
        this.protocol,
        this.implicitRules,
        this.partOf,
        this.period,
        this.identifier,
        this.title,
        this.modifierExtension,
        this.description,
        this.arm,
        this.site,
        this.id,
        this.objective,
        this.note,
        this.text,
        this.reasonStopped,
        value,
        this.resourceType,
        this.focus,
        this.language,
        this.meta,
        this.status,
        this.sponsor,
        this.principalInvestigator,
        this.condition,
        this.location);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ResearchStudy#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableResearchStudy withResourceType(java.lang.String value) {
    java.lang.String newValue = java.util.Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableResearchStudy(
        this.phase,
        this.relatedArtifact,
        this.contact,
        this.keyword,
        this.contained,
        this.extension,
        this.enrollment,
        this.primaryPurposeType,
        this.protocol,
        this.implicitRules,
        this.partOf,
        this.period,
        this.identifier,
        this.title,
        this.modifierExtension,
        this.description,
        this.arm,
        this.site,
        this.id,
        this.objective,
        this.note,
        this.text,
        this.reasonStopped,
        this.category,
        newValue,
        this.focus,
        this.language,
        this.meta,
        this.status,
        this.sponsor,
        this.principalInvestigator,
        this.condition,
        this.location);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchStudy#focus() focus} attribute.
   * @param value The value for focus
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchStudy withFocus(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "focus");
    if (this.focus == newValue) return this;
    return new ImmutableResearchStudy(
        this.phase,
        this.relatedArtifact,
        this.contact,
        this.keyword,
        this.contained,
        this.extension,
        this.enrollment,
        this.primaryPurposeType,
        this.protocol,
        this.implicitRules,
        this.partOf,
        this.period,
        this.identifier,
        this.title,
        this.modifierExtension,
        this.description,
        this.arm,
        this.site,
        this.id,
        this.objective,
        this.note,
        this.text,
        this.reasonStopped,
        this.category,
        this.resourceType,
        newValue,
        this.language,
        this.meta,
        this.status,
        this.sponsor,
        this.principalInvestigator,
        this.condition,
        this.location);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchStudy#focus() focus} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for focus
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchStudy withFocus(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.focus == value) return this;
    return new ImmutableResearchStudy(
        this.phase,
        this.relatedArtifact,
        this.contact,
        this.keyword,
        this.contained,
        this.extension,
        this.enrollment,
        this.primaryPurposeType,
        this.protocol,
        this.implicitRules,
        this.partOf,
        this.period,
        this.identifier,
        this.title,
        this.modifierExtension,
        this.description,
        this.arm,
        this.site,
        this.id,
        this.objective,
        this.note,
        this.text,
        this.reasonStopped,
        this.category,
        this.resourceType,
        value,
        this.language,
        this.meta,
        this.status,
        this.sponsor,
        this.principalInvestigator,
        this.condition,
        this.location);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchStudy#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchStudy withLanguage(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableResearchStudy(
        this.phase,
        this.relatedArtifact,
        this.contact,
        this.keyword,
        this.contained,
        this.extension,
        this.enrollment,
        this.primaryPurposeType,
        this.protocol,
        this.implicitRules,
        this.partOf,
        this.period,
        this.identifier,
        this.title,
        this.modifierExtension,
        this.description,
        this.arm,
        this.site,
        this.id,
        this.objective,
        this.note,
        this.text,
        this.reasonStopped,
        this.category,
        this.resourceType,
        this.focus,
        newValue,
        this.meta,
        this.status,
        this.sponsor,
        this.principalInvestigator,
        this.condition,
        this.location);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchStudy#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchStudy withLanguage(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableResearchStudy(
        this.phase,
        this.relatedArtifact,
        this.contact,
        this.keyword,
        this.contained,
        this.extension,
        this.enrollment,
        this.primaryPurposeType,
        this.protocol,
        this.implicitRules,
        this.partOf,
        this.period,
        this.identifier,
        this.title,
        this.modifierExtension,
        this.description,
        this.arm,
        this.site,
        this.id,
        this.objective,
        this.note,
        this.text,
        this.reasonStopped,
        this.category,
        this.resourceType,
        this.focus,
        value,
        this.meta,
        this.status,
        this.sponsor,
        this.principalInvestigator,
        this.condition,
        this.location);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchStudy#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchStudy withMeta(com.fhir.Meta value) {
    @javax.annotation.Nullable com.fhir.Meta newValue = java.util.Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableResearchStudy(
        this.phase,
        this.relatedArtifact,
        this.contact,
        this.keyword,
        this.contained,
        this.extension,
        this.enrollment,
        this.primaryPurposeType,
        this.protocol,
        this.implicitRules,
        this.partOf,
        this.period,
        this.identifier,
        this.title,
        this.modifierExtension,
        this.description,
        this.arm,
        this.site,
        this.id,
        this.objective,
        this.note,
        this.text,
        this.reasonStopped,
        this.category,
        this.resourceType,
        this.focus,
        this.language,
        newValue,
        this.status,
        this.sponsor,
        this.principalInvestigator,
        this.condition,
        this.location);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchStudy#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchStudy withMeta(java.util.Optional<? extends com.fhir.Meta> optional) {
    @javax.annotation.Nullable com.fhir.Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableResearchStudy(
        this.phase,
        this.relatedArtifact,
        this.contact,
        this.keyword,
        this.contained,
        this.extension,
        this.enrollment,
        this.primaryPurposeType,
        this.protocol,
        this.implicitRules,
        this.partOf,
        this.period,
        this.identifier,
        this.title,
        this.modifierExtension,
        this.description,
        this.arm,
        this.site,
        this.id,
        this.objective,
        this.note,
        this.text,
        this.reasonStopped,
        this.category,
        this.resourceType,
        this.focus,
        this.language,
        value,
        this.status,
        this.sponsor,
        this.principalInvestigator,
        this.condition,
        this.location);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchStudy#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchStudy withStatus(com.fhir.ResearchstudyStatus value) {
    @javax.annotation.Nullable com.fhir.ResearchstudyStatus newValue = java.util.Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableResearchStudy(
        this.phase,
        this.relatedArtifact,
        this.contact,
        this.keyword,
        this.contained,
        this.extension,
        this.enrollment,
        this.primaryPurposeType,
        this.protocol,
        this.implicitRules,
        this.partOf,
        this.period,
        this.identifier,
        this.title,
        this.modifierExtension,
        this.description,
        this.arm,
        this.site,
        this.id,
        this.objective,
        this.note,
        this.text,
        this.reasonStopped,
        this.category,
        this.resourceType,
        this.focus,
        this.language,
        this.meta,
        newValue,
        this.sponsor,
        this.principalInvestigator,
        this.condition,
        this.location);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchStudy#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchStudy withStatus(java.util.Optional<? extends com.fhir.ResearchstudyStatus> optional) {
    @javax.annotation.Nullable com.fhir.ResearchstudyStatus value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableResearchStudy(
        this.phase,
        this.relatedArtifact,
        this.contact,
        this.keyword,
        this.contained,
        this.extension,
        this.enrollment,
        this.primaryPurposeType,
        this.protocol,
        this.implicitRules,
        this.partOf,
        this.period,
        this.identifier,
        this.title,
        this.modifierExtension,
        this.description,
        this.arm,
        this.site,
        this.id,
        this.objective,
        this.note,
        this.text,
        this.reasonStopped,
        this.category,
        this.resourceType,
        this.focus,
        this.language,
        this.meta,
        value,
        this.sponsor,
        this.principalInvestigator,
        this.condition,
        this.location);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchStudy#sponsor() sponsor} attribute.
   * @param value The value for sponsor
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchStudy withSponsor(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "sponsor");
    if (this.sponsor == newValue) return this;
    return new ImmutableResearchStudy(
        this.phase,
        this.relatedArtifact,
        this.contact,
        this.keyword,
        this.contained,
        this.extension,
        this.enrollment,
        this.primaryPurposeType,
        this.protocol,
        this.implicitRules,
        this.partOf,
        this.period,
        this.identifier,
        this.title,
        this.modifierExtension,
        this.description,
        this.arm,
        this.site,
        this.id,
        this.objective,
        this.note,
        this.text,
        this.reasonStopped,
        this.category,
        this.resourceType,
        this.focus,
        this.language,
        this.meta,
        this.status,
        newValue,
        this.principalInvestigator,
        this.condition,
        this.location);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchStudy#sponsor() sponsor} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for sponsor
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchStudy withSponsor(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.sponsor == value) return this;
    return new ImmutableResearchStudy(
        this.phase,
        this.relatedArtifact,
        this.contact,
        this.keyword,
        this.contained,
        this.extension,
        this.enrollment,
        this.primaryPurposeType,
        this.protocol,
        this.implicitRules,
        this.partOf,
        this.period,
        this.identifier,
        this.title,
        this.modifierExtension,
        this.description,
        this.arm,
        this.site,
        this.id,
        this.objective,
        this.note,
        this.text,
        this.reasonStopped,
        this.category,
        this.resourceType,
        this.focus,
        this.language,
        this.meta,
        this.status,
        value,
        this.principalInvestigator,
        this.condition,
        this.location);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchStudy#principalInvestigator() principalInvestigator} attribute.
   * @param value The value for principalInvestigator
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchStudy withPrincipalInvestigator(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "principalInvestigator");
    if (this.principalInvestigator == newValue) return this;
    return new ImmutableResearchStudy(
        this.phase,
        this.relatedArtifact,
        this.contact,
        this.keyword,
        this.contained,
        this.extension,
        this.enrollment,
        this.primaryPurposeType,
        this.protocol,
        this.implicitRules,
        this.partOf,
        this.period,
        this.identifier,
        this.title,
        this.modifierExtension,
        this.description,
        this.arm,
        this.site,
        this.id,
        this.objective,
        this.note,
        this.text,
        this.reasonStopped,
        this.category,
        this.resourceType,
        this.focus,
        this.language,
        this.meta,
        this.status,
        this.sponsor,
        newValue,
        this.condition,
        this.location);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchStudy#principalInvestigator() principalInvestigator} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for principalInvestigator
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchStudy withPrincipalInvestigator(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.principalInvestigator == value) return this;
    return new ImmutableResearchStudy(
        this.phase,
        this.relatedArtifact,
        this.contact,
        this.keyword,
        this.contained,
        this.extension,
        this.enrollment,
        this.primaryPurposeType,
        this.protocol,
        this.implicitRules,
        this.partOf,
        this.period,
        this.identifier,
        this.title,
        this.modifierExtension,
        this.description,
        this.arm,
        this.site,
        this.id,
        this.objective,
        this.note,
        this.text,
        this.reasonStopped,
        this.category,
        this.resourceType,
        this.focus,
        this.language,
        this.meta,
        this.status,
        this.sponsor,
        value,
        this.condition,
        this.location);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchStudy#condition() condition} attribute.
   * @param value The value for condition
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchStudy withCondition(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "condition");
    if (this.condition == newValue) return this;
    return new ImmutableResearchStudy(
        this.phase,
        this.relatedArtifact,
        this.contact,
        this.keyword,
        this.contained,
        this.extension,
        this.enrollment,
        this.primaryPurposeType,
        this.protocol,
        this.implicitRules,
        this.partOf,
        this.period,
        this.identifier,
        this.title,
        this.modifierExtension,
        this.description,
        this.arm,
        this.site,
        this.id,
        this.objective,
        this.note,
        this.text,
        this.reasonStopped,
        this.category,
        this.resourceType,
        this.focus,
        this.language,
        this.meta,
        this.status,
        this.sponsor,
        this.principalInvestigator,
        newValue,
        this.location);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchStudy#condition() condition} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for condition
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchStudy withCondition(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.condition == value) return this;
    return new ImmutableResearchStudy(
        this.phase,
        this.relatedArtifact,
        this.contact,
        this.keyword,
        this.contained,
        this.extension,
        this.enrollment,
        this.primaryPurposeType,
        this.protocol,
        this.implicitRules,
        this.partOf,
        this.period,
        this.identifier,
        this.title,
        this.modifierExtension,
        this.description,
        this.arm,
        this.site,
        this.id,
        this.objective,
        this.note,
        this.text,
        this.reasonStopped,
        this.category,
        this.resourceType,
        this.focus,
        this.language,
        this.meta,
        this.status,
        this.sponsor,
        this.principalInvestigator,
        value,
        this.location);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchStudy#location() location} attribute.
   * @param value The value for location
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchStudy withLocation(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "location");
    if (this.location == newValue) return this;
    return new ImmutableResearchStudy(
        this.phase,
        this.relatedArtifact,
        this.contact,
        this.keyword,
        this.contained,
        this.extension,
        this.enrollment,
        this.primaryPurposeType,
        this.protocol,
        this.implicitRules,
        this.partOf,
        this.period,
        this.identifier,
        this.title,
        this.modifierExtension,
        this.description,
        this.arm,
        this.site,
        this.id,
        this.objective,
        this.note,
        this.text,
        this.reasonStopped,
        this.category,
        this.resourceType,
        this.focus,
        this.language,
        this.meta,
        this.status,
        this.sponsor,
        this.principalInvestigator,
        this.condition,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchStudy#location() location} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for location
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchStudy withLocation(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.location == value) return this;
    return new ImmutableResearchStudy(
        this.phase,
        this.relatedArtifact,
        this.contact,
        this.keyword,
        this.contained,
        this.extension,
        this.enrollment,
        this.primaryPurposeType,
        this.protocol,
        this.implicitRules,
        this.partOf,
        this.period,
        this.identifier,
        this.title,
        this.modifierExtension,
        this.description,
        this.arm,
        this.site,
        this.id,
        this.objective,
        this.note,
        this.text,
        this.reasonStopped,
        this.category,
        this.resourceType,
        this.focus,
        this.language,
        this.meta,
        this.status,
        this.sponsor,
        this.principalInvestigator,
        this.condition,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableResearchStudy} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableResearchStudy
        && equalTo((ImmutableResearchStudy) another);
  }

  private boolean equalTo(ImmutableResearchStudy another) {
    return java.util.Objects.equals(phase, another.phase)
        && java.util.Objects.equals(relatedArtifact, another.relatedArtifact)
        && java.util.Objects.equals(contact, another.contact)
        && java.util.Objects.equals(keyword, another.keyword)
        && java.util.Objects.equals(contained, another.contained)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(enrollment, another.enrollment)
        && java.util.Objects.equals(primaryPurposeType, another.primaryPurposeType)
        && java.util.Objects.equals(protocol, another.protocol)
        && java.util.Objects.equals(implicitRules, another.implicitRules)
        && java.util.Objects.equals(partOf, another.partOf)
        && java.util.Objects.equals(period, another.period)
        && java.util.Objects.equals(identifier, another.identifier)
        && java.util.Objects.equals(title, another.title)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(description, another.description)
        && java.util.Objects.equals(arm, another.arm)
        && java.util.Objects.equals(site, another.site)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(objective, another.objective)
        && java.util.Objects.equals(note, another.note)
        && java.util.Objects.equals(text, another.text)
        && java.util.Objects.equals(reasonStopped, another.reasonStopped)
        && java.util.Objects.equals(category, another.category)
        && resourceType.equals(another.resourceType)
        && java.util.Objects.equals(focus, another.focus)
        && java.util.Objects.equals(language, another.language)
        && java.util.Objects.equals(meta, another.meta)
        && java.util.Objects.equals(status, another.status)
        && java.util.Objects.equals(sponsor, another.sponsor)
        && java.util.Objects.equals(principalInvestigator, another.principalInvestigator)
        && java.util.Objects.equals(condition, another.condition)
        && java.util.Objects.equals(location, another.location);
  }

  /**
   * Computes a hash code from attributes: {@code phase}, {@code relatedArtifact}, {@code contact}, {@code keyword}, {@code contained}, {@code extension}, {@code enrollment}, {@code primaryPurposeType}, {@code protocol}, {@code implicitRules}, {@code partOf}, {@code period}, {@code identifier}, {@code title}, {@code modifierExtension}, {@code description}, {@code arm}, {@code site}, {@code id}, {@code objective}, {@code note}, {@code text}, {@code reasonStopped}, {@code category}, {@code resourceType}, {@code focus}, {@code language}, {@code meta}, {@code status}, {@code sponsor}, {@code principalInvestigator}, {@code condition}, {@code location}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(phase);
    h += (h << 5) + java.util.Objects.hashCode(relatedArtifact);
    h += (h << 5) + java.util.Objects.hashCode(contact);
    h += (h << 5) + java.util.Objects.hashCode(keyword);
    h += (h << 5) + java.util.Objects.hashCode(contained);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(enrollment);
    h += (h << 5) + java.util.Objects.hashCode(primaryPurposeType);
    h += (h << 5) + java.util.Objects.hashCode(protocol);
    h += (h << 5) + java.util.Objects.hashCode(implicitRules);
    h += (h << 5) + java.util.Objects.hashCode(partOf);
    h += (h << 5) + java.util.Objects.hashCode(period);
    h += (h << 5) + java.util.Objects.hashCode(identifier);
    h += (h << 5) + java.util.Objects.hashCode(title);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(description);
    h += (h << 5) + java.util.Objects.hashCode(arm);
    h += (h << 5) + java.util.Objects.hashCode(site);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(objective);
    h += (h << 5) + java.util.Objects.hashCode(note);
    h += (h << 5) + java.util.Objects.hashCode(text);
    h += (h << 5) + java.util.Objects.hashCode(reasonStopped);
    h += (h << 5) + java.util.Objects.hashCode(category);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(focus);
    h += (h << 5) + java.util.Objects.hashCode(language);
    h += (h << 5) + java.util.Objects.hashCode(meta);
    h += (h << 5) + java.util.Objects.hashCode(status);
    h += (h << 5) + java.util.Objects.hashCode(sponsor);
    h += (h << 5) + java.util.Objects.hashCode(principalInvestigator);
    h += (h << 5) + java.util.Objects.hashCode(condition);
    h += (h << 5) + java.util.Objects.hashCode(location);
    return h;
  }

  /**
   * Prints the immutable value {@code ResearchStudy} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("ResearchStudy{");
    if (phase != null) {
      builder.append("phase=").append(phase);
    }
    if (relatedArtifact != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("relatedArtifact=").append(relatedArtifact);
    }
    if (contact != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("contact=").append(contact);
    }
    if (keyword != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("keyword=").append(keyword);
    }
    if (contained != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (extension != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (enrollment != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("enrollment=").append(enrollment);
    }
    if (primaryPurposeType != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("primaryPurposeType=").append(primaryPurposeType);
    }
    if (protocol != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("protocol=").append(protocol);
    }
    if (implicitRules != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (partOf != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("partOf=").append(partOf);
    }
    if (period != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("period=").append(period);
    }
    if (identifier != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (title != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("title=").append(title);
    }
    if (modifierExtension != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (description != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("description=").append(description);
    }
    if (arm != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("arm=").append(arm);
    }
    if (site != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("site=").append(site);
    }
    if (id != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (objective != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("objective=").append(objective);
    }
    if (note != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("note=").append(note);
    }
    if (text != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("text=").append(text);
    }
    if (reasonStopped != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("reasonStopped=").append(reasonStopped);
    }
    if (category != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("category=").append(category);
    }
    if (builder.length() > 14) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (focus != null) {
      builder.append(", ");
      builder.append("focus=").append(focus);
    }
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (status != null) {
      builder.append(", ");
      builder.append("status=").append(status);
    }
    if (sponsor != null) {
      builder.append(", ");
      builder.append("sponsor=").append(sponsor);
    }
    if (principalInvestigator != null) {
      builder.append(", ");
      builder.append("principalInvestigator=").append(principalInvestigator);
    }
    if (condition != null) {
      builder.append(", ");
      builder.append("condition=").append(condition);
    }
    if (location != null) {
      builder.append(", ");
      builder.append("location=").append(location);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "ResearchStudy", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.ResearchStudy {
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> phase = java.util.Optional.empty();
    boolean phaseIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.RelatedArtifact>> relatedArtifact = java.util.Optional.empty();
    boolean relatedArtifactIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ContactDetail>> contact = java.util.Optional.empty();
    boolean contactIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> keyword = java.util.Optional.empty();
    boolean keywordIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ResourceList>> contained = java.util.Optional.empty();
    boolean containedIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> enrollment = java.util.Optional.empty();
    boolean enrollmentIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> primaryPurposeType = java.util.Optional.empty();
    boolean primaryPurposeTypeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> protocol = java.util.Optional.empty();
    boolean protocolIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> implicitRules = java.util.Optional.empty();
    boolean implicitRulesIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> partOf = java.util.Optional.empty();
    boolean partOfIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Period> period = java.util.Optional.empty();
    boolean periodIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Identifier>> identifier = java.util.Optional.empty();
    boolean identifierIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> title = java.util.Optional.empty();
    boolean titleIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.markdown> description = java.util.Optional.empty();
    boolean descriptionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ResearchStudy_Arm>> arm = java.util.Optional.empty();
    boolean armIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> site = java.util.Optional.empty();
    boolean siteIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ResearchStudy_Objective>> objective = java.util.Optional.empty();
    boolean objectiveIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Annotation>> note = java.util.Optional.empty();
    boolean noteIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Narrative> text = java.util.Optional.empty();
    boolean textIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> reasonStopped = java.util.Optional.empty();
    boolean reasonStoppedIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> category = java.util.Optional.empty();
    boolean categoryIsSet;
    @javax.annotation.Nullable java.lang.String resourceType;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> focus = java.util.Optional.empty();
    boolean focusIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> language = java.util.Optional.empty();
    boolean languageIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Meta> meta = java.util.Optional.empty();
    boolean metaIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.ResearchstudyStatus> status = java.util.Optional.empty();
    boolean statusIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> sponsor = java.util.Optional.empty();
    boolean sponsorIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> principalInvestigator = java.util.Optional.empty();
    boolean principalInvestigatorIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> condition = java.util.Optional.empty();
    boolean conditionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> location = java.util.Optional.empty();
    boolean locationIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("phase")
    public void setPhase(java.util.Optional<com.fhir.CodeableConcept> phase) {
      this.phase = phase;
      this.phaseIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("relatedArtifact")
    public void setRelatedArtifact(java.util.Optional<java.util.List<com.fhir.RelatedArtifact>> relatedArtifact) {
      this.relatedArtifact = relatedArtifact;
      this.relatedArtifactIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("contact")
    public void setContact(java.util.Optional<java.util.List<com.fhir.ContactDetail>> contact) {
      this.contact = contact;
      this.contactIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("keyword")
    public void setKeyword(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> keyword) {
      this.keyword = keyword;
      this.keywordIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("contained")
    public void setContained(java.util.Optional<java.util.List<com.fhir.ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("enrollment")
    public void setEnrollment(java.util.Optional<java.util.List<com.fhir.Reference>> enrollment) {
      this.enrollment = enrollment;
      this.enrollmentIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("primaryPurposeType")
    public void setPrimaryPurposeType(java.util.Optional<com.fhir.CodeableConcept> primaryPurposeType) {
      this.primaryPurposeType = primaryPurposeType;
      this.primaryPurposeTypeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("protocol")
    public void setProtocol(java.util.Optional<java.util.List<com.fhir.Reference>> protocol) {
      this.protocol = protocol;
      this.protocolIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
    public void setImplicitRules(java.util.Optional<com.fhir.uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("partOf")
    public void setPartOf(java.util.Optional<java.util.List<com.fhir.Reference>> partOf) {
      this.partOf = partOf;
      this.partOfIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("period")
    public void setPeriod(java.util.Optional<com.fhir.Period> period) {
      this.period = period;
      this.periodIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    public void setIdentifier(java.util.Optional<java.util.List<com.fhir.Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("title")
    public void setTitle(java.util.Optional<java.lang.String> title) {
      this.title = title;
      this.titleIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    public void setDescription(java.util.Optional<com.fhir.markdown> description) {
      this.description = description;
      this.descriptionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("arm")
    public void setArm(java.util.Optional<java.util.List<com.fhir.ResearchStudy_Arm>> arm) {
      this.arm = arm;
      this.armIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("site")
    public void setSite(java.util.Optional<java.util.List<com.fhir.Reference>> site) {
      this.site = site;
      this.siteIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<com.fhir.id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("objective")
    public void setObjective(java.util.Optional<java.util.List<com.fhir.ResearchStudy_Objective>> objective) {
      this.objective = objective;
      this.objectiveIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("note")
    public void setNote(java.util.Optional<java.util.List<com.fhir.Annotation>> note) {
      this.note = note;
      this.noteIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    public void setText(java.util.Optional<com.fhir.Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("reasonStopped")
    public void setReasonStopped(java.util.Optional<com.fhir.CodeableConcept> reasonStopped) {
      this.reasonStopped = reasonStopped;
      this.reasonStoppedIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("category")
    public void setCategory(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> category) {
      this.category = category;
      this.categoryIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public void setResourceType(java.lang.String resourceType) {
      this.resourceType = resourceType;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("focus")
    public void setFocus(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> focus) {
      this.focus = focus;
      this.focusIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    public void setLanguage(java.util.Optional<com.fhir.code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("meta")
    public void setMeta(java.util.Optional<com.fhir.Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public void setStatus(java.util.Optional<com.fhir.ResearchstudyStatus> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("sponsor")
    public void setSponsor(java.util.Optional<com.fhir.Reference> sponsor) {
      this.sponsor = sponsor;
      this.sponsorIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("principalInvestigator")
    public void setPrincipalInvestigator(java.util.Optional<com.fhir.Reference> principalInvestigator) {
      this.principalInvestigator = principalInvestigator;
      this.principalInvestigatorIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("condition")
    public void setCondition(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> condition) {
      this.condition = condition;
      this.conditionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("location")
    public void setLocation(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> location) {
      this.location = location;
      this.locationIsSet = true;
    }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> phase() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.RelatedArtifact>> relatedArtifact() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ContactDetail>> contact() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> keyword() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> enrollment() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> primaryPurposeType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> protocol() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> partOf() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Period> period() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> title() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.markdown> description() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ResearchStudy_Arm>> arm() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> site() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.id> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ResearchStudy_Objective>> objective() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Annotation>> note() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> reasonStopped() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> category() { throw new UnsupportedOperationException(); }
    @Override
    public java.lang.String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> focus() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> language() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.ResearchstudyStatus> status() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> sponsor() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> principalInvestigator() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> condition() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> location() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableResearchStudy fromJson(Json json) {
    ImmutableResearchStudy.Builder builder = ((ImmutableResearchStudy.Builder) ImmutableResearchStudy.builder());
    if (json.phaseIsSet) {
      builder.phase(json.phase);
    }
    if (json.relatedArtifactIsSet) {
      builder.relatedArtifact(json.relatedArtifact);
    }
    if (json.contactIsSet) {
      builder.contact(json.contact);
    }
    if (json.keywordIsSet) {
      builder.keyword(json.keyword);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.enrollmentIsSet) {
      builder.enrollment(json.enrollment);
    }
    if (json.primaryPurposeTypeIsSet) {
      builder.primaryPurposeType(json.primaryPurposeType);
    }
    if (json.protocolIsSet) {
      builder.protocol(json.protocol);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.partOfIsSet) {
      builder.partOf(json.partOf);
    }
    if (json.periodIsSet) {
      builder.period(json.period);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.titleIsSet) {
      builder.title(json.title);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.descriptionIsSet) {
      builder.description(json.description);
    }
    if (json.armIsSet) {
      builder.arm(json.arm);
    }
    if (json.siteIsSet) {
      builder.site(json.site);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.objectiveIsSet) {
      builder.objective(json.objective);
    }
    if (json.noteIsSet) {
      builder.note(json.note);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.reasonStoppedIsSet) {
      builder.reasonStopped(json.reasonStopped);
    }
    if (json.categoryIsSet) {
      builder.category(json.category);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.focusIsSet) {
      builder.focus(json.focus);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.sponsorIsSet) {
      builder.sponsor(json.sponsor);
    }
    if (json.principalInvestigatorIsSet) {
      builder.principalInvestigator(json.principalInvestigator);
    }
    if (json.conditionIsSet) {
      builder.condition(json.condition);
    }
    if (json.locationIsSet) {
      builder.location(json.location);
    }
    return (ImmutableResearchStudy) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ResearchStudy} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ResearchStudy instance
   */
  public static ResearchStudy copyOf(ResearchStudy instance) {
    if (instance instanceof ImmutableResearchStudy) {
      return (ImmutableResearchStudy) instance;
    }
    return ((ImmutableResearchStudy.Builder) ImmutableResearchStudy.builder())
        .phase(instance.phase())
        .relatedArtifact(instance.relatedArtifact())
        .contact(instance.contact())
        .keyword(instance.keyword())
        .contained(instance.contained())
        .extension(instance.extension())
        .enrollment(instance.enrollment())
        .primaryPurposeType(instance.primaryPurposeType())
        .protocol(instance.protocol())
        .implicitRules(instance.implicitRules())
        .partOf(instance.partOf())
        .period(instance.period())
        .identifier(instance.identifier())
        .title(instance.title())
        .modifierExtension(instance.modifierExtension())
        .description(instance.description())
        .arm(instance.arm())
        .site(instance.site())
        .id(instance.id())
        .objective(instance.objective())
        .note(instance.note())
        .text(instance.text())
        .reasonStopped(instance.reasonStopped())
        .category(instance.category())
        .resourceType(instance.resourceType())
        .focus(instance.focus())
        .language(instance.language())
        .meta(instance.meta())
        .status(instance.status())
        .sponsor(instance.sponsor())
        .principalInvestigator(instance.principalInvestigator())
        .condition(instance.condition())
        .location(instance.location())
        .build();
  }

  /**
   * Creates a builder for {@link ResearchStudy ResearchStudy}.
   * <pre>
   * ImmutableResearchStudy.builder()
   *    .phase(com.fhir.CodeableConcept) // optional {@link ResearchStudy#phase() phase}
   *    .relatedArtifact(List&amp;lt;com.fhir.RelatedArtifact&amp;gt;) // optional {@link ResearchStudy#relatedArtifact() relatedArtifact}
   *    .contact(List&amp;lt;com.fhir.ContactDetail&amp;gt;) // optional {@link ResearchStudy#contact() contact}
   *    .keyword(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link ResearchStudy#keyword() keyword}
   *    .contained(List&amp;lt;com.fhir.ResourceList&amp;gt;) // optional {@link ResearchStudy#contained() contained}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link ResearchStudy#extension() extension}
   *    .enrollment(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link ResearchStudy#enrollment() enrollment}
   *    .primaryPurposeType(com.fhir.CodeableConcept) // optional {@link ResearchStudy#primaryPurposeType() primaryPurposeType}
   *    .protocol(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link ResearchStudy#protocol() protocol}
   *    .implicitRules(com.fhir.uri) // optional {@link ResearchStudy#implicitRules() implicitRules}
   *    .partOf(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link ResearchStudy#partOf() partOf}
   *    .period(com.fhir.Period) // optional {@link ResearchStudy#period() period}
   *    .identifier(List&amp;lt;com.fhir.Identifier&amp;gt;) // optional {@link ResearchStudy#identifier() identifier}
   *    .title(String) // optional {@link ResearchStudy#title() title}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link ResearchStudy#modifierExtension() modifierExtension}
   *    .description(com.fhir.markdown) // optional {@link ResearchStudy#description() description}
   *    .arm(List&amp;lt;com.fhir.ResearchStudy_Arm&amp;gt;) // optional {@link ResearchStudy#arm() arm}
   *    .site(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link ResearchStudy#site() site}
   *    .id(com.fhir.id) // optional {@link ResearchStudy#id() id}
   *    .objective(List&amp;lt;com.fhir.ResearchStudy_Objective&amp;gt;) // optional {@link ResearchStudy#objective() objective}
   *    .note(List&amp;lt;com.fhir.Annotation&amp;gt;) // optional {@link ResearchStudy#note() note}
   *    .text(com.fhir.Narrative) // optional {@link ResearchStudy#text() text}
   *    .reasonStopped(com.fhir.CodeableConcept) // optional {@link ResearchStudy#reasonStopped() reasonStopped}
   *    .category(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link ResearchStudy#category() category}
   *    .resourceType(String) // required {@link ResearchStudy#resourceType() resourceType}
   *    .focus(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link ResearchStudy#focus() focus}
   *    .language(com.fhir.code) // optional {@link ResearchStudy#language() language}
   *    .meta(com.fhir.Meta) // optional {@link ResearchStudy#meta() meta}
   *    .status(com.fhir.ResearchstudyStatus) // optional {@link ResearchStudy#status() status}
   *    .sponsor(com.fhir.Reference) // optional {@link ResearchStudy#sponsor() sponsor}
   *    .principalInvestigator(com.fhir.Reference) // optional {@link ResearchStudy#principalInvestigator() principalInvestigator}
   *    .condition(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link ResearchStudy#condition() condition}
   *    .location(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link ResearchStudy#location() location}
   *    .build();
   * </pre>
   * @return A new ResearchStudy builder
   */
  public static ResourceTypeBuildStage builder() {
    return new ImmutableResearchStudy.Builder();
  }

  /**
   * Builds instances of type {@link ResearchStudy ResearchStudy}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "ResearchStudy", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long OPT_BIT_PHASE = 0x1L;
    private static final long OPT_BIT_RELATED_ARTIFACT = 0x2L;
    private static final long OPT_BIT_CONTACT = 0x4L;
    private static final long OPT_BIT_KEYWORD = 0x8L;
    private static final long OPT_BIT_CONTAINED = 0x10L;
    private static final long OPT_BIT_EXTENSION = 0x20L;
    private static final long OPT_BIT_ENROLLMENT = 0x40L;
    private static final long OPT_BIT_PRIMARY_PURPOSE_TYPE = 0x80L;
    private static final long OPT_BIT_PROTOCOL = 0x100L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x200L;
    private static final long OPT_BIT_PART_OF = 0x400L;
    private static final long OPT_BIT_PERIOD = 0x800L;
    private static final long OPT_BIT_IDENTIFIER = 0x1000L;
    private static final long OPT_BIT_TITLE = 0x2000L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x4000L;
    private static final long OPT_BIT_DESCRIPTION = 0x8000L;
    private static final long OPT_BIT_ARM = 0x10000L;
    private static final long OPT_BIT_SITE = 0x20000L;
    private static final long OPT_BIT_ID = 0x40000L;
    private static final long OPT_BIT_OBJECTIVE = 0x80000L;
    private static final long OPT_BIT_NOTE = 0x100000L;
    private static final long OPT_BIT_TEXT = 0x200000L;
    private static final long OPT_BIT_REASON_STOPPED = 0x400000L;
    private static final long OPT_BIT_CATEGORY = 0x800000L;
    private static final long OPT_BIT_FOCUS = 0x1000000L;
    private static final long OPT_BIT_LANGUAGE = 0x2000000L;
    private static final long OPT_BIT_META = 0x4000000L;
    private static final long OPT_BIT_STATUS = 0x8000000L;
    private static final long OPT_BIT_SPONSOR = 0x10000000L;
    private static final long OPT_BIT_PRINCIPAL_INVESTIGATOR = 0x20000000L;
    private static final long OPT_BIT_CONDITION = 0x40000000L;
    private static final long OPT_BIT_LOCATION = 0x80000000L;
    private long initBits = 0x1L;
    private long optBits;

    private @javax.annotation.Nullable com.fhir.CodeableConcept phase;
    private @javax.annotation.Nullable java.util.List<com.fhir.RelatedArtifact> relatedArtifact;
    private @javax.annotation.Nullable java.util.List<com.fhir.ContactDetail> contact;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> keyword;
    private @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> enrollment;
    private @javax.annotation.Nullable com.fhir.CodeableConcept primaryPurposeType;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> protocol;
    private @javax.annotation.Nullable com.fhir.uri implicitRules;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> partOf;
    private @javax.annotation.Nullable com.fhir.Period period;
    private @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
    private @javax.annotation.Nullable java.lang.String title;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable com.fhir.markdown description;
    private @javax.annotation.Nullable java.util.List<com.fhir.ResearchStudy_Arm> arm;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> site;
    private @javax.annotation.Nullable com.fhir.id id;
    private @javax.annotation.Nullable java.util.List<com.fhir.ResearchStudy_Objective> objective;
    private @javax.annotation.Nullable java.util.List<com.fhir.Annotation> note;
    private @javax.annotation.Nullable com.fhir.Narrative text;
    private @javax.annotation.Nullable com.fhir.CodeableConcept reasonStopped;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> category;
    private @javax.annotation.Nullable java.lang.String resourceType;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> focus;
    private @javax.annotation.Nullable com.fhir.code language;
    private @javax.annotation.Nullable com.fhir.Meta meta;
    private @javax.annotation.Nullable com.fhir.ResearchstudyStatus status;
    private @javax.annotation.Nullable com.fhir.Reference sponsor;
    private @javax.annotation.Nullable com.fhir.Reference principalInvestigator;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> condition;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> location;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link ResearchStudy#phase() phase} to phase.
     * @param phase The value for phase
     * @return {@code this} builder for chained invocation
     */
    public final Builder phase(com.fhir.CodeableConcept phase) {
      checkNotIsSet(phaseIsSet(), "phase");
      this.phase = java.util.Objects.requireNonNull(phase, "phase");
      optBits |= OPT_BIT_PHASE;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchStudy#phase() phase} to phase.
     * @param phase The value for phase
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("phase")
    public final Builder phase(java.util.Optional<? extends com.fhir.CodeableConcept> phase) {
      checkNotIsSet(phaseIsSet(), "phase");
      this.phase = phase.orElse(null);
      optBits |= OPT_BIT_PHASE;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchStudy#relatedArtifact() relatedArtifact} to relatedArtifact.
     * @param relatedArtifact The value for relatedArtifact
     * @return {@code this} builder for chained invocation
     */
    public final Builder relatedArtifact(java.util.List<com.fhir.RelatedArtifact> relatedArtifact) {
      checkNotIsSet(relatedArtifactIsSet(), "relatedArtifact");
      this.relatedArtifact = java.util.Objects.requireNonNull(relatedArtifact, "relatedArtifact");
      optBits |= OPT_BIT_RELATED_ARTIFACT;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchStudy#relatedArtifact() relatedArtifact} to relatedArtifact.
     * @param relatedArtifact The value for relatedArtifact
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("relatedArtifact")
    public final Builder relatedArtifact(java.util.Optional<? extends java.util.List<com.fhir.RelatedArtifact>> relatedArtifact) {
      checkNotIsSet(relatedArtifactIsSet(), "relatedArtifact");
      this.relatedArtifact = relatedArtifact.orElse(null);
      optBits |= OPT_BIT_RELATED_ARTIFACT;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchStudy#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for chained invocation
     */
    public final Builder contact(java.util.List<com.fhir.ContactDetail> contact) {
      checkNotIsSet(contactIsSet(), "contact");
      this.contact = java.util.Objects.requireNonNull(contact, "contact");
      optBits |= OPT_BIT_CONTACT;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchStudy#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("contact")
    public final Builder contact(java.util.Optional<? extends java.util.List<com.fhir.ContactDetail>> contact) {
      checkNotIsSet(contactIsSet(), "contact");
      this.contact = contact.orElse(null);
      optBits |= OPT_BIT_CONTACT;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchStudy#keyword() keyword} to keyword.
     * @param keyword The value for keyword
     * @return {@code this} builder for chained invocation
     */
    public final Builder keyword(java.util.List<com.fhir.CodeableConcept> keyword) {
      checkNotIsSet(keywordIsSet(), "keyword");
      this.keyword = java.util.Objects.requireNonNull(keyword, "keyword");
      optBits |= OPT_BIT_KEYWORD;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchStudy#keyword() keyword} to keyword.
     * @param keyword The value for keyword
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("keyword")
    public final Builder keyword(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> keyword) {
      checkNotIsSet(keywordIsSet(), "keyword");
      this.keyword = keyword.orElse(null);
      optBits |= OPT_BIT_KEYWORD;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchStudy#contained() contained} to contained.
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
     * Initializes the optional value {@link ResearchStudy#contained() contained} to contained.
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
     * Initializes the optional value {@link ResearchStudy#extension() extension} to extension.
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
     * Initializes the optional value {@link ResearchStudy#extension() extension} to extension.
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
     * Initializes the optional value {@link ResearchStudy#enrollment() enrollment} to enrollment.
     * @param enrollment The value for enrollment
     * @return {@code this} builder for chained invocation
     */
    public final Builder enrollment(java.util.List<com.fhir.Reference> enrollment) {
      checkNotIsSet(enrollmentIsSet(), "enrollment");
      this.enrollment = java.util.Objects.requireNonNull(enrollment, "enrollment");
      optBits |= OPT_BIT_ENROLLMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchStudy#enrollment() enrollment} to enrollment.
     * @param enrollment The value for enrollment
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("enrollment")
    public final Builder enrollment(java.util.Optional<? extends java.util.List<com.fhir.Reference>> enrollment) {
      checkNotIsSet(enrollmentIsSet(), "enrollment");
      this.enrollment = enrollment.orElse(null);
      optBits |= OPT_BIT_ENROLLMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchStudy#primaryPurposeType() primaryPurposeType} to primaryPurposeType.
     * @param primaryPurposeType The value for primaryPurposeType
     * @return {@code this} builder for chained invocation
     */
    public final Builder primaryPurposeType(com.fhir.CodeableConcept primaryPurposeType) {
      checkNotIsSet(primaryPurposeTypeIsSet(), "primaryPurposeType");
      this.primaryPurposeType = java.util.Objects.requireNonNull(primaryPurposeType, "primaryPurposeType");
      optBits |= OPT_BIT_PRIMARY_PURPOSE_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchStudy#primaryPurposeType() primaryPurposeType} to primaryPurposeType.
     * @param primaryPurposeType The value for primaryPurposeType
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("primaryPurposeType")
    public final Builder primaryPurposeType(java.util.Optional<? extends com.fhir.CodeableConcept> primaryPurposeType) {
      checkNotIsSet(primaryPurposeTypeIsSet(), "primaryPurposeType");
      this.primaryPurposeType = primaryPurposeType.orElse(null);
      optBits |= OPT_BIT_PRIMARY_PURPOSE_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchStudy#protocol() protocol} to protocol.
     * @param protocol The value for protocol
     * @return {@code this} builder for chained invocation
     */
    public final Builder protocol(java.util.List<com.fhir.Reference> protocol) {
      checkNotIsSet(protocolIsSet(), "protocol");
      this.protocol = java.util.Objects.requireNonNull(protocol, "protocol");
      optBits |= OPT_BIT_PROTOCOL;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchStudy#protocol() protocol} to protocol.
     * @param protocol The value for protocol
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("protocol")
    public final Builder protocol(java.util.Optional<? extends java.util.List<com.fhir.Reference>> protocol) {
      checkNotIsSet(protocolIsSet(), "protocol");
      this.protocol = protocol.orElse(null);
      optBits |= OPT_BIT_PROTOCOL;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchStudy#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link ResearchStudy#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link ResearchStudy#partOf() partOf} to partOf.
     * @param partOf The value for partOf
     * @return {@code this} builder for chained invocation
     */
    public final Builder partOf(java.util.List<com.fhir.Reference> partOf) {
      checkNotIsSet(partOfIsSet(), "partOf");
      this.partOf = java.util.Objects.requireNonNull(partOf, "partOf");
      optBits |= OPT_BIT_PART_OF;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchStudy#partOf() partOf} to partOf.
     * @param partOf The value for partOf
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("partOf")
    public final Builder partOf(java.util.Optional<? extends java.util.List<com.fhir.Reference>> partOf) {
      checkNotIsSet(partOfIsSet(), "partOf");
      this.partOf = partOf.orElse(null);
      optBits |= OPT_BIT_PART_OF;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchStudy#period() period} to period.
     * @param period The value for period
     * @return {@code this} builder for chained invocation
     */
    public final Builder period(com.fhir.Period period) {
      checkNotIsSet(periodIsSet(), "period");
      this.period = java.util.Objects.requireNonNull(period, "period");
      optBits |= OPT_BIT_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchStudy#period() period} to period.
     * @param period The value for period
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("period")
    public final Builder period(java.util.Optional<? extends com.fhir.Period> period) {
      checkNotIsSet(periodIsSet(), "period");
      this.period = period.orElse(null);
      optBits |= OPT_BIT_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchStudy#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    public final Builder identifier(java.util.List<com.fhir.Identifier> identifier) {
      checkNotIsSet(identifierIsSet(), "identifier");
      this.identifier = java.util.Objects.requireNonNull(identifier, "identifier");
      optBits |= OPT_BIT_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchStudy#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    public final Builder identifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> identifier) {
      checkNotIsSet(identifierIsSet(), "identifier");
      this.identifier = identifier.orElse(null);
      optBits |= OPT_BIT_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchStudy#title() title} to title.
     * @param title The value for title
     * @return {@code this} builder for chained invocation
     */
    public final Builder title(java.lang.String title) {
      checkNotIsSet(titleIsSet(), "title");
      this.title = java.util.Objects.requireNonNull(title, "title");
      optBits |= OPT_BIT_TITLE;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchStudy#title() title} to title.
     * @param title The value for title
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("title")
    public final Builder title(java.util.Optional<java.lang.String> title) {
      checkNotIsSet(titleIsSet(), "title");
      this.title = title.orElse(null);
      optBits |= OPT_BIT_TITLE;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchStudy#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ResearchStudy#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ResearchStudy#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for chained invocation
     */
    public final Builder description(com.fhir.markdown description) {
      checkNotIsSet(descriptionIsSet(), "description");
      this.description = java.util.Objects.requireNonNull(description, "description");
      optBits |= OPT_BIT_DESCRIPTION;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchStudy#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    public final Builder description(java.util.Optional<? extends com.fhir.markdown> description) {
      checkNotIsSet(descriptionIsSet(), "description");
      this.description = description.orElse(null);
      optBits |= OPT_BIT_DESCRIPTION;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchStudy#arm() arm} to arm.
     * @param arm The value for arm
     * @return {@code this} builder for chained invocation
     */
    public final Builder arm(java.util.List<com.fhir.ResearchStudy_Arm> arm) {
      checkNotIsSet(armIsSet(), "arm");
      this.arm = java.util.Objects.requireNonNull(arm, "arm");
      optBits |= OPT_BIT_ARM;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchStudy#arm() arm} to arm.
     * @param arm The value for arm
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("arm")
    public final Builder arm(java.util.Optional<? extends java.util.List<com.fhir.ResearchStudy_Arm>> arm) {
      checkNotIsSet(armIsSet(), "arm");
      this.arm = arm.orElse(null);
      optBits |= OPT_BIT_ARM;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchStudy#site() site} to site.
     * @param site The value for site
     * @return {@code this} builder for chained invocation
     */
    public final Builder site(java.util.List<com.fhir.Reference> site) {
      checkNotIsSet(siteIsSet(), "site");
      this.site = java.util.Objects.requireNonNull(site, "site");
      optBits |= OPT_BIT_SITE;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchStudy#site() site} to site.
     * @param site The value for site
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("site")
    public final Builder site(java.util.Optional<? extends java.util.List<com.fhir.Reference>> site) {
      checkNotIsSet(siteIsSet(), "site");
      this.site = site.orElse(null);
      optBits |= OPT_BIT_SITE;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchStudy#id() id} to id.
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
     * Initializes the optional value {@link ResearchStudy#id() id} to id.
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
     * Initializes the optional value {@link ResearchStudy#objective() objective} to objective.
     * @param objective The value for objective
     * @return {@code this} builder for chained invocation
     */
    public final Builder objective(java.util.List<com.fhir.ResearchStudy_Objective> objective) {
      checkNotIsSet(objectiveIsSet(), "objective");
      this.objective = java.util.Objects.requireNonNull(objective, "objective");
      optBits |= OPT_BIT_OBJECTIVE;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchStudy#objective() objective} to objective.
     * @param objective The value for objective
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("objective")
    public final Builder objective(java.util.Optional<? extends java.util.List<com.fhir.ResearchStudy_Objective>> objective) {
      checkNotIsSet(objectiveIsSet(), "objective");
      this.objective = objective.orElse(null);
      optBits |= OPT_BIT_OBJECTIVE;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchStudy#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for chained invocation
     */
    public final Builder note(java.util.List<com.fhir.Annotation> note) {
      checkNotIsSet(noteIsSet(), "note");
      this.note = java.util.Objects.requireNonNull(note, "note");
      optBits |= OPT_BIT_NOTE;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchStudy#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("note")
    public final Builder note(java.util.Optional<? extends java.util.List<com.fhir.Annotation>> note) {
      checkNotIsSet(noteIsSet(), "note");
      this.note = note.orElse(null);
      optBits |= OPT_BIT_NOTE;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchStudy#text() text} to text.
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
     * Initializes the optional value {@link ResearchStudy#text() text} to text.
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
     * Initializes the optional value {@link ResearchStudy#reasonStopped() reasonStopped} to reasonStopped.
     * @param reasonStopped The value for reasonStopped
     * @return {@code this} builder for chained invocation
     */
    public final Builder reasonStopped(com.fhir.CodeableConcept reasonStopped) {
      checkNotIsSet(reasonStoppedIsSet(), "reasonStopped");
      this.reasonStopped = java.util.Objects.requireNonNull(reasonStopped, "reasonStopped");
      optBits |= OPT_BIT_REASON_STOPPED;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchStudy#reasonStopped() reasonStopped} to reasonStopped.
     * @param reasonStopped The value for reasonStopped
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("reasonStopped")
    public final Builder reasonStopped(java.util.Optional<? extends com.fhir.CodeableConcept> reasonStopped) {
      checkNotIsSet(reasonStoppedIsSet(), "reasonStopped");
      this.reasonStopped = reasonStopped.orElse(null);
      optBits |= OPT_BIT_REASON_STOPPED;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchStudy#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for chained invocation
     */
    public final Builder category(java.util.List<com.fhir.CodeableConcept> category) {
      checkNotIsSet(categoryIsSet(), "category");
      this.category = java.util.Objects.requireNonNull(category, "category");
      optBits |= OPT_BIT_CATEGORY;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchStudy#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("category")
    public final Builder category(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> category) {
      checkNotIsSet(categoryIsSet(), "category");
      this.category = category.orElse(null);
      optBits |= OPT_BIT_CATEGORY;
      return this;
    }

    /**
     * Initializes the value for the {@link ResearchStudy#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link ResearchStudy#focus() focus} to focus.
     * @param focus The value for focus
     * @return {@code this} builder for chained invocation
     */
    public final Builder focus(java.util.List<com.fhir.CodeableConcept> focus) {
      checkNotIsSet(focusIsSet(), "focus");
      this.focus = java.util.Objects.requireNonNull(focus, "focus");
      optBits |= OPT_BIT_FOCUS;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchStudy#focus() focus} to focus.
     * @param focus The value for focus
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("focus")
    public final Builder focus(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> focus) {
      checkNotIsSet(focusIsSet(), "focus");
      this.focus = focus.orElse(null);
      optBits |= OPT_BIT_FOCUS;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchStudy#language() language} to language.
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
     * Initializes the optional value {@link ResearchStudy#language() language} to language.
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
     * Initializes the optional value {@link ResearchStudy#meta() meta} to meta.
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
     * Initializes the optional value {@link ResearchStudy#meta() meta} to meta.
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
     * Initializes the optional value {@link ResearchStudy#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(com.fhir.ResearchstudyStatus status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = java.util.Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchStudy#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public final Builder status(java.util.Optional<? extends com.fhir.ResearchstudyStatus> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchStudy#sponsor() sponsor} to sponsor.
     * @param sponsor The value for sponsor
     * @return {@code this} builder for chained invocation
     */
    public final Builder sponsor(com.fhir.Reference sponsor) {
      checkNotIsSet(sponsorIsSet(), "sponsor");
      this.sponsor = java.util.Objects.requireNonNull(sponsor, "sponsor");
      optBits |= OPT_BIT_SPONSOR;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchStudy#sponsor() sponsor} to sponsor.
     * @param sponsor The value for sponsor
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sponsor")
    public final Builder sponsor(java.util.Optional<? extends com.fhir.Reference> sponsor) {
      checkNotIsSet(sponsorIsSet(), "sponsor");
      this.sponsor = sponsor.orElse(null);
      optBits |= OPT_BIT_SPONSOR;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchStudy#principalInvestigator() principalInvestigator} to principalInvestigator.
     * @param principalInvestigator The value for principalInvestigator
     * @return {@code this} builder for chained invocation
     */
    public final Builder principalInvestigator(com.fhir.Reference principalInvestigator) {
      checkNotIsSet(principalInvestigatorIsSet(), "principalInvestigator");
      this.principalInvestigator = java.util.Objects.requireNonNull(principalInvestigator, "principalInvestigator");
      optBits |= OPT_BIT_PRINCIPAL_INVESTIGATOR;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchStudy#principalInvestigator() principalInvestigator} to principalInvestigator.
     * @param principalInvestigator The value for principalInvestigator
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("principalInvestigator")
    public final Builder principalInvestigator(java.util.Optional<? extends com.fhir.Reference> principalInvestigator) {
      checkNotIsSet(principalInvestigatorIsSet(), "principalInvestigator");
      this.principalInvestigator = principalInvestigator.orElse(null);
      optBits |= OPT_BIT_PRINCIPAL_INVESTIGATOR;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchStudy#condition() condition} to condition.
     * @param condition The value for condition
     * @return {@code this} builder for chained invocation
     */
    public final Builder condition(java.util.List<com.fhir.CodeableConcept> condition) {
      checkNotIsSet(conditionIsSet(), "condition");
      this.condition = java.util.Objects.requireNonNull(condition, "condition");
      optBits |= OPT_BIT_CONDITION;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchStudy#condition() condition} to condition.
     * @param condition The value for condition
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("condition")
    public final Builder condition(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> condition) {
      checkNotIsSet(conditionIsSet(), "condition");
      this.condition = condition.orElse(null);
      optBits |= OPT_BIT_CONDITION;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchStudy#location() location} to location.
     * @param location The value for location
     * @return {@code this} builder for chained invocation
     */
    public final Builder location(java.util.List<com.fhir.CodeableConcept> location) {
      checkNotIsSet(locationIsSet(), "location");
      this.location = java.util.Objects.requireNonNull(location, "location");
      optBits |= OPT_BIT_LOCATION;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchStudy#location() location} to location.
     * @param location The value for location
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("location")
    public final Builder location(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> location) {
      checkNotIsSet(locationIsSet(), "location");
      this.location = location.orElse(null);
      optBits |= OPT_BIT_LOCATION;
      return this;
    }

    /**
     * Builds a new {@link ResearchStudy ResearchStudy}.
     * @return An immutable instance of ResearchStudy
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.ResearchStudy build() {
      checkRequiredAttributes();
      return new ImmutableResearchStudy(
          phase,
          relatedArtifact,
          contact,
          keyword,
          contained,
          extension,
          enrollment,
          primaryPurposeType,
          protocol,
          implicitRules,
          partOf,
          period,
          identifier,
          title,
          modifierExtension,
          description,
          arm,
          site,
          id,
          objective,
          note,
          text,
          reasonStopped,
          category,
          resourceType,
          focus,
          language,
          meta,
          status,
          sponsor,
          principalInvestigator,
          condition,
          location);
    }

    private boolean phaseIsSet() {
      return (optBits & OPT_BIT_PHASE) != 0;
    }

    private boolean relatedArtifactIsSet() {
      return (optBits & OPT_BIT_RELATED_ARTIFACT) != 0;
    }

    private boolean contactIsSet() {
      return (optBits & OPT_BIT_CONTACT) != 0;
    }

    private boolean keywordIsSet() {
      return (optBits & OPT_BIT_KEYWORD) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean enrollmentIsSet() {
      return (optBits & OPT_BIT_ENROLLMENT) != 0;
    }

    private boolean primaryPurposeTypeIsSet() {
      return (optBits & OPT_BIT_PRIMARY_PURPOSE_TYPE) != 0;
    }

    private boolean protocolIsSet() {
      return (optBits & OPT_BIT_PROTOCOL) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean partOfIsSet() {
      return (optBits & OPT_BIT_PART_OF) != 0;
    }

    private boolean periodIsSet() {
      return (optBits & OPT_BIT_PERIOD) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean titleIsSet() {
      return (optBits & OPT_BIT_TITLE) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean descriptionIsSet() {
      return (optBits & OPT_BIT_DESCRIPTION) != 0;
    }

    private boolean armIsSet() {
      return (optBits & OPT_BIT_ARM) != 0;
    }

    private boolean siteIsSet() {
      return (optBits & OPT_BIT_SITE) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean objectiveIsSet() {
      return (optBits & OPT_BIT_OBJECTIVE) != 0;
    }

    private boolean noteIsSet() {
      return (optBits & OPT_BIT_NOTE) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean reasonStoppedIsSet() {
      return (optBits & OPT_BIT_REASON_STOPPED) != 0;
    }

    private boolean categoryIsSet() {
      return (optBits & OPT_BIT_CATEGORY) != 0;
    }

    private boolean focusIsSet() {
      return (optBits & OPT_BIT_FOCUS) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean sponsorIsSet() {
      return (optBits & OPT_BIT_SPONSOR) != 0;
    }

    private boolean principalInvestigatorIsSet() {
      return (optBits & OPT_BIT_PRINCIPAL_INVESTIGATOR) != 0;
    }

    private boolean conditionIsSet() {
      return (optBits & OPT_BIT_CONDITION) != 0;
    }

    private boolean locationIsSet() {
      return (optBits & OPT_BIT_LOCATION) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of ResearchStudy is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build ResearchStudy, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "ResearchStudy", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link ResearchStudy#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(java.lang.String resourceType);
  }

  @org.immutables.value.Generated(from = "ResearchStudy", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link ResearchStudy#phase() phase} to phase.
     * @param phase The value for phase
     * @return {@code this} builder for chained invocation
     */
    BuildFinal phase(com.fhir.CodeableConcept phase);

    /**
     * Initializes the optional value {@link ResearchStudy#phase() phase} to phase.
     * @param phase The value for phase
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal phase(java.util.Optional<? extends com.fhir.CodeableConcept> phase);

    /**
     * Initializes the optional value {@link ResearchStudy#relatedArtifact() relatedArtifact} to relatedArtifact.
     * @param relatedArtifact The value for relatedArtifact
     * @return {@code this} builder for chained invocation
     */
    BuildFinal relatedArtifact(java.util.List<com.fhir.RelatedArtifact> relatedArtifact);

    /**
     * Initializes the optional value {@link ResearchStudy#relatedArtifact() relatedArtifact} to relatedArtifact.
     * @param relatedArtifact The value for relatedArtifact
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal relatedArtifact(java.util.Optional<? extends java.util.List<com.fhir.RelatedArtifact>> relatedArtifact);

    /**
     * Initializes the optional value {@link ResearchStudy#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contact(java.util.List<com.fhir.ContactDetail> contact);

    /**
     * Initializes the optional value {@link ResearchStudy#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contact(java.util.Optional<? extends java.util.List<com.fhir.ContactDetail>> contact);

    /**
     * Initializes the optional value {@link ResearchStudy#keyword() keyword} to keyword.
     * @param keyword The value for keyword
     * @return {@code this} builder for chained invocation
     */
    BuildFinal keyword(java.util.List<com.fhir.CodeableConcept> keyword);

    /**
     * Initializes the optional value {@link ResearchStudy#keyword() keyword} to keyword.
     * @param keyword The value for keyword
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal keyword(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> keyword);

    /**
     * Initializes the optional value {@link ResearchStudy#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(java.util.List<com.fhir.ResourceList> contained);

    /**
     * Initializes the optional value {@link ResearchStudy#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> contained);

    /**
     * Initializes the optional value {@link ResearchStudy#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link ResearchStudy#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Initializes the optional value {@link ResearchStudy#enrollment() enrollment} to enrollment.
     * @param enrollment The value for enrollment
     * @return {@code this} builder for chained invocation
     */
    BuildFinal enrollment(java.util.List<com.fhir.Reference> enrollment);

    /**
     * Initializes the optional value {@link ResearchStudy#enrollment() enrollment} to enrollment.
     * @param enrollment The value for enrollment
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal enrollment(java.util.Optional<? extends java.util.List<com.fhir.Reference>> enrollment);

    /**
     * Initializes the optional value {@link ResearchStudy#primaryPurposeType() primaryPurposeType} to primaryPurposeType.
     * @param primaryPurposeType The value for primaryPurposeType
     * @return {@code this} builder for chained invocation
     */
    BuildFinal primaryPurposeType(com.fhir.CodeableConcept primaryPurposeType);

    /**
     * Initializes the optional value {@link ResearchStudy#primaryPurposeType() primaryPurposeType} to primaryPurposeType.
     * @param primaryPurposeType The value for primaryPurposeType
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal primaryPurposeType(java.util.Optional<? extends com.fhir.CodeableConcept> primaryPurposeType);

    /**
     * Initializes the optional value {@link ResearchStudy#protocol() protocol} to protocol.
     * @param protocol The value for protocol
     * @return {@code this} builder for chained invocation
     */
    BuildFinal protocol(java.util.List<com.fhir.Reference> protocol);

    /**
     * Initializes the optional value {@link ResearchStudy#protocol() protocol} to protocol.
     * @param protocol The value for protocol
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal protocol(java.util.Optional<? extends java.util.List<com.fhir.Reference>> protocol);

    /**
     * Initializes the optional value {@link ResearchStudy#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(com.fhir.uri implicitRules);

    /**
     * Initializes the optional value {@link ResearchStudy#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(java.util.Optional<? extends com.fhir.uri> implicitRules);

    /**
     * Initializes the optional value {@link ResearchStudy#partOf() partOf} to partOf.
     * @param partOf The value for partOf
     * @return {@code this} builder for chained invocation
     */
    BuildFinal partOf(java.util.List<com.fhir.Reference> partOf);

    /**
     * Initializes the optional value {@link ResearchStudy#partOf() partOf} to partOf.
     * @param partOf The value for partOf
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal partOf(java.util.Optional<? extends java.util.List<com.fhir.Reference>> partOf);

    /**
     * Initializes the optional value {@link ResearchStudy#period() period} to period.
     * @param period The value for period
     * @return {@code this} builder for chained invocation
     */
    BuildFinal period(com.fhir.Period period);

    /**
     * Initializes the optional value {@link ResearchStudy#period() period} to period.
     * @param period The value for period
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal period(java.util.Optional<? extends com.fhir.Period> period);

    /**
     * Initializes the optional value {@link ResearchStudy#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(java.util.List<com.fhir.Identifier> identifier);

    /**
     * Initializes the optional value {@link ResearchStudy#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> identifier);

    /**
     * Initializes the optional value {@link ResearchStudy#title() title} to title.
     * @param title The value for title
     * @return {@code this} builder for chained invocation
     */
    BuildFinal title(java.lang.String title);

    /**
     * Initializes the optional value {@link ResearchStudy#title() title} to title.
     * @param title The value for title
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal title(java.util.Optional<java.lang.String> title);

    /**
     * Initializes the optional value {@link ResearchStudy#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(java.util.List<com.fhir.Extension> modifierExtension);

    /**
     * Initializes the optional value {@link ResearchStudy#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link ResearchStudy#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for chained invocation
     */
    BuildFinal description(com.fhir.markdown description);

    /**
     * Initializes the optional value {@link ResearchStudy#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal description(java.util.Optional<? extends com.fhir.markdown> description);

    /**
     * Initializes the optional value {@link ResearchStudy#arm() arm} to arm.
     * @param arm The value for arm
     * @return {@code this} builder for chained invocation
     */
    BuildFinal arm(java.util.List<com.fhir.ResearchStudy_Arm> arm);

    /**
     * Initializes the optional value {@link ResearchStudy#arm() arm} to arm.
     * @param arm The value for arm
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal arm(java.util.Optional<? extends java.util.List<com.fhir.ResearchStudy_Arm>> arm);

    /**
     * Initializes the optional value {@link ResearchStudy#site() site} to site.
     * @param site The value for site
     * @return {@code this} builder for chained invocation
     */
    BuildFinal site(java.util.List<com.fhir.Reference> site);

    /**
     * Initializes the optional value {@link ResearchStudy#site() site} to site.
     * @param site The value for site
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal site(java.util.Optional<? extends java.util.List<com.fhir.Reference>> site);

    /**
     * Initializes the optional value {@link ResearchStudy#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(com.fhir.id id);

    /**
     * Initializes the optional value {@link ResearchStudy#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<? extends com.fhir.id> id);

    /**
     * Initializes the optional value {@link ResearchStudy#objective() objective} to objective.
     * @param objective The value for objective
     * @return {@code this} builder for chained invocation
     */
    BuildFinal objective(java.util.List<com.fhir.ResearchStudy_Objective> objective);

    /**
     * Initializes the optional value {@link ResearchStudy#objective() objective} to objective.
     * @param objective The value for objective
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal objective(java.util.Optional<? extends java.util.List<com.fhir.ResearchStudy_Objective>> objective);

    /**
     * Initializes the optional value {@link ResearchStudy#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for chained invocation
     */
    BuildFinal note(java.util.List<com.fhir.Annotation> note);

    /**
     * Initializes the optional value {@link ResearchStudy#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal note(java.util.Optional<? extends java.util.List<com.fhir.Annotation>> note);

    /**
     * Initializes the optional value {@link ResearchStudy#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(com.fhir.Narrative text);

    /**
     * Initializes the optional value {@link ResearchStudy#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(java.util.Optional<? extends com.fhir.Narrative> text);

    /**
     * Initializes the optional value {@link ResearchStudy#reasonStopped() reasonStopped} to reasonStopped.
     * @param reasonStopped The value for reasonStopped
     * @return {@code this} builder for chained invocation
     */
    BuildFinal reasonStopped(com.fhir.CodeableConcept reasonStopped);

    /**
     * Initializes the optional value {@link ResearchStudy#reasonStopped() reasonStopped} to reasonStopped.
     * @param reasonStopped The value for reasonStopped
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal reasonStopped(java.util.Optional<? extends com.fhir.CodeableConcept> reasonStopped);

    /**
     * Initializes the optional value {@link ResearchStudy#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for chained invocation
     */
    BuildFinal category(java.util.List<com.fhir.CodeableConcept> category);

    /**
     * Initializes the optional value {@link ResearchStudy#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal category(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> category);

    /**
     * Initializes the optional value {@link ResearchStudy#focus() focus} to focus.
     * @param focus The value for focus
     * @return {@code this} builder for chained invocation
     */
    BuildFinal focus(java.util.List<com.fhir.CodeableConcept> focus);

    /**
     * Initializes the optional value {@link ResearchStudy#focus() focus} to focus.
     * @param focus The value for focus
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal focus(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> focus);

    /**
     * Initializes the optional value {@link ResearchStudy#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(com.fhir.code language);

    /**
     * Initializes the optional value {@link ResearchStudy#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(java.util.Optional<? extends com.fhir.code> language);

    /**
     * Initializes the optional value {@link ResearchStudy#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(com.fhir.Meta meta);

    /**
     * Initializes the optional value {@link ResearchStudy#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(java.util.Optional<? extends com.fhir.Meta> meta);

    /**
     * Initializes the optional value {@link ResearchStudy#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(com.fhir.ResearchstudyStatus status);

    /**
     * Initializes the optional value {@link ResearchStudy#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(java.util.Optional<? extends com.fhir.ResearchstudyStatus> status);

    /**
     * Initializes the optional value {@link ResearchStudy#sponsor() sponsor} to sponsor.
     * @param sponsor The value for sponsor
     * @return {@code this} builder for chained invocation
     */
    BuildFinal sponsor(com.fhir.Reference sponsor);

    /**
     * Initializes the optional value {@link ResearchStudy#sponsor() sponsor} to sponsor.
     * @param sponsor The value for sponsor
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal sponsor(java.util.Optional<? extends com.fhir.Reference> sponsor);

    /**
     * Initializes the optional value {@link ResearchStudy#principalInvestigator() principalInvestigator} to principalInvestigator.
     * @param principalInvestigator The value for principalInvestigator
     * @return {@code this} builder for chained invocation
     */
    BuildFinal principalInvestigator(com.fhir.Reference principalInvestigator);

    /**
     * Initializes the optional value {@link ResearchStudy#principalInvestigator() principalInvestigator} to principalInvestigator.
     * @param principalInvestigator The value for principalInvestigator
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal principalInvestigator(java.util.Optional<? extends com.fhir.Reference> principalInvestigator);

    /**
     * Initializes the optional value {@link ResearchStudy#condition() condition} to condition.
     * @param condition The value for condition
     * @return {@code this} builder for chained invocation
     */
    BuildFinal condition(java.util.List<com.fhir.CodeableConcept> condition);

    /**
     * Initializes the optional value {@link ResearchStudy#condition() condition} to condition.
     * @param condition The value for condition
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal condition(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> condition);

    /**
     * Initializes the optional value {@link ResearchStudy#location() location} to location.
     * @param location The value for location
     * @return {@code this} builder for chained invocation
     */
    BuildFinal location(java.util.List<com.fhir.CodeableConcept> location);

    /**
     * Initializes the optional value {@link ResearchStudy#location() location} to location.
     * @param location The value for location
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal location(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> location);

    /**
     * Builds a new {@link ResearchStudy ResearchStudy}.
     * @return An immutable instance of ResearchStudy
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    ResearchStudy build();
  }
}
