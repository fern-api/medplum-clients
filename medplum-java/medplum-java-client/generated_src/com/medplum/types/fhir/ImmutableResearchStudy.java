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
 * Immutable implementation of {@link ResearchStudy}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableResearchStudy.builder()}.
 */
@Generated(from = "ResearchStudy", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableResearchStudy implements ResearchStudy {
  private final @Nullable Meta meta;
  private final @Nullable List<Extension> extension;
  private final @Nullable CodeableConcept phase;
  private final @Nullable Period period;
  private final @Nullable List<CodeableConcept> focus;
  private final @Nullable List<ResearchStudy_Objective> objective;
  private final @Nullable Id id;
  private final @Nullable Narrative text;
  private final @Nullable List<Identifier> identifier;
  private final @Nullable List<Reference> partOf;
  private final @Nullable List<ContactDetail> contact;
  private final @Nullable Code language;
  private final @Nullable List<ResourceList> contained;
  private final @Nullable List<ResearchStudy_Arm> arm;
  private final @Nullable Reference sponsor;
  private final @Nullable List<CodeableConcept> keyword;
  private final @Nullable CodeableConcept primaryPurposeType;
  private final @Nullable ResearchstudyStatus status;
  private final @Nullable CodeableConcept reasonStopped;
  private final @Nullable List<Reference> protocol;
  private final @Nullable String title;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable List<Reference> site;
  private final @Nullable Uri implicitRules;
  private final @Nullable List<CodeableConcept> location;
  private final @Nullable Markdown description;
  private final @Nullable List<Reference> enrollment;
  private final String resourceType;
  private final @Nullable List<RelatedArtifact> relatedArtifact;
  private final @Nullable Reference principalInvestigator;
  private final @Nullable List<CodeableConcept> condition;
  private final @Nullable List<Annotation> note;
  private final @Nullable List<CodeableConcept> category;

  private ImmutableResearchStudy(
      @Nullable Meta meta,
      @Nullable List<Extension> extension,
      @Nullable CodeableConcept phase,
      @Nullable Period period,
      @Nullable List<CodeableConcept> focus,
      @Nullable List<ResearchStudy_Objective> objective,
      @Nullable Id id,
      @Nullable Narrative text,
      @Nullable List<Identifier> identifier,
      @Nullable List<Reference> partOf,
      @Nullable List<ContactDetail> contact,
      @Nullable Code language,
      @Nullable List<ResourceList> contained,
      @Nullable List<ResearchStudy_Arm> arm,
      @Nullable Reference sponsor,
      @Nullable List<CodeableConcept> keyword,
      @Nullable CodeableConcept primaryPurposeType,
      @Nullable ResearchstudyStatus status,
      @Nullable CodeableConcept reasonStopped,
      @Nullable List<Reference> protocol,
      @Nullable String title,
      @Nullable List<Extension> modifierExtension,
      @Nullable List<Reference> site,
      @Nullable Uri implicitRules,
      @Nullable List<CodeableConcept> location,
      @Nullable Markdown description,
      @Nullable List<Reference> enrollment,
      String resourceType,
      @Nullable List<RelatedArtifact> relatedArtifact,
      @Nullable Reference principalInvestigator,
      @Nullable List<CodeableConcept> condition,
      @Nullable List<Annotation> note,
      @Nullable List<CodeableConcept> category) {
    this.meta = meta;
    this.extension = extension;
    this.phase = phase;
    this.period = period;
    this.focus = focus;
    this.objective = objective;
    this.id = id;
    this.text = text;
    this.identifier = identifier;
    this.partOf = partOf;
    this.contact = contact;
    this.language = language;
    this.contained = contained;
    this.arm = arm;
    this.sponsor = sponsor;
    this.keyword = keyword;
    this.primaryPurposeType = primaryPurposeType;
    this.status = status;
    this.reasonStopped = reasonStopped;
    this.protocol = protocol;
    this.title = title;
    this.modifierExtension = modifierExtension;
    this.site = site;
    this.implicitRules = implicitRules;
    this.location = location;
    this.description = description;
    this.enrollment = enrollment;
    this.resourceType = resourceType;
    this.relatedArtifact = relatedArtifact;
    this.principalInvestigator = principalInvestigator;
    this.condition = condition;
    this.note = note;
    this.category = category;
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
   * @return The value of the {@code extension} attribute
   */
  @JsonProperty("extension")
  @Override
  public Optional<List<Extension>> extension() {
    return Optional.ofNullable(extension);
  }

  /**
   * @return The value of the {@code phase} attribute
   */
  @JsonProperty("phase")
  @Override
  public Optional<CodeableConcept> phase() {
    return Optional.ofNullable(phase);
  }

  /**
   * @return The value of the {@code period} attribute
   */
  @JsonProperty("period")
  @Override
  public Optional<Period> period() {
    return Optional.ofNullable(period);
  }

  /**
   * @return The value of the {@code focus} attribute
   */
  @JsonProperty("focus")
  @Override
  public Optional<List<CodeableConcept>> focus() {
    return Optional.ofNullable(focus);
  }

  /**
   * @return The value of the {@code objective} attribute
   */
  @JsonProperty("objective")
  @Override
  public Optional<List<ResearchStudy_Objective>> objective() {
    return Optional.ofNullable(objective);
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
   * @return The value of the {@code text} attribute
   */
  @JsonProperty("text")
  @Override
  public Optional<Narrative> text() {
    return Optional.ofNullable(text);
  }

  /**
   * @return The value of the {@code identifier} attribute
   */
  @JsonProperty("identifier")
  @Override
  public Optional<List<Identifier>> identifier() {
    return Optional.ofNullable(identifier);
  }

  /**
   * @return The value of the {@code partOf} attribute
   */
  @JsonProperty("partOf")
  @Override
  public Optional<List<Reference>> partOf() {
    return Optional.ofNullable(partOf);
  }

  /**
   * @return The value of the {@code contact} attribute
   */
  @JsonProperty("contact")
  @Override
  public Optional<List<ContactDetail>> contact() {
    return Optional.ofNullable(contact);
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
   * @return The value of the {@code contained} attribute
   */
  @JsonProperty("contained")
  @Override
  public Optional<List<ResourceList>> contained() {
    return Optional.ofNullable(contained);
  }

  /**
   * @return The value of the {@code arm} attribute
   */
  @JsonProperty("arm")
  @Override
  public Optional<List<ResearchStudy_Arm>> arm() {
    return Optional.ofNullable(arm);
  }

  /**
   * @return The value of the {@code sponsor} attribute
   */
  @JsonProperty("sponsor")
  @Override
  public Optional<Reference> sponsor() {
    return Optional.ofNullable(sponsor);
  }

  /**
   * @return The value of the {@code keyword} attribute
   */
  @JsonProperty("keyword")
  @Override
  public Optional<List<CodeableConcept>> keyword() {
    return Optional.ofNullable(keyword);
  }

  /**
   * @return The value of the {@code primaryPurposeType} attribute
   */
  @JsonProperty("primaryPurposeType")
  @Override
  public Optional<CodeableConcept> primaryPurposeType() {
    return Optional.ofNullable(primaryPurposeType);
  }

  /**
   * @return The value of the {@code status} attribute
   */
  @JsonProperty("status")
  @Override
  public Optional<ResearchstudyStatus> status() {
    return Optional.ofNullable(status);
  }

  /**
   * @return The value of the {@code reasonStopped} attribute
   */
  @JsonProperty("reasonStopped")
  @Override
  public Optional<CodeableConcept> reasonStopped() {
    return Optional.ofNullable(reasonStopped);
  }

  /**
   * @return The value of the {@code protocol} attribute
   */
  @JsonProperty("protocol")
  @Override
  public Optional<List<Reference>> protocol() {
    return Optional.ofNullable(protocol);
  }

  /**
   * @return The value of the {@code title} attribute
   */
  @JsonProperty("title")
  @Override
  public Optional<String> title() {
    return Optional.ofNullable(title);
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
   * @return The value of the {@code site} attribute
   */
  @JsonProperty("site")
  @Override
  public Optional<List<Reference>> site() {
    return Optional.ofNullable(site);
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
   * @return The value of the {@code location} attribute
   */
  @JsonProperty("location")
  @Override
  public Optional<List<CodeableConcept>> location() {
    return Optional.ofNullable(location);
  }

  /**
   * @return The value of the {@code description} attribute
   */
  @JsonProperty("description")
  @Override
  public Optional<Markdown> description() {
    return Optional.ofNullable(description);
  }

  /**
   * @return The value of the {@code enrollment} attribute
   */
  @JsonProperty("enrollment")
  @Override
  public Optional<List<Reference>> enrollment() {
    return Optional.ofNullable(enrollment);
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
   * @return The value of the {@code relatedArtifact} attribute
   */
  @JsonProperty("relatedArtifact")
  @Override
  public Optional<List<RelatedArtifact>> relatedArtifact() {
    return Optional.ofNullable(relatedArtifact);
  }

  /**
   * @return The value of the {@code principalInvestigator} attribute
   */
  @JsonProperty("principalInvestigator")
  @Override
  public Optional<Reference> principalInvestigator() {
    return Optional.ofNullable(principalInvestigator);
  }

  /**
   * @return The value of the {@code condition} attribute
   */
  @JsonProperty("condition")
  @Override
  public Optional<List<CodeableConcept>> condition() {
    return Optional.ofNullable(condition);
  }

  /**
   * @return The value of the {@code note} attribute
   */
  @JsonProperty("note")
  @Override
  public Optional<List<Annotation>> note() {
    return Optional.ofNullable(note);
  }

  /**
   * @return The value of the {@code category} attribute
   */
  @JsonProperty("category")
  @Override
  public Optional<List<CodeableConcept>> category() {
    return Optional.ofNullable(category);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchStudy#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchStudy withMeta(Meta value) {
    @Nullable Meta newValue = Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableResearchStudy(
        newValue,
        this.extension,
        this.phase,
        this.period,
        this.focus,
        this.objective,
        this.id,
        this.text,
        this.identifier,
        this.partOf,
        this.contact,
        this.language,
        this.contained,
        this.arm,
        this.sponsor,
        this.keyword,
        this.primaryPurposeType,
        this.status,
        this.reasonStopped,
        this.protocol,
        this.title,
        this.modifierExtension,
        this.site,
        this.implicitRules,
        this.location,
        this.description,
        this.enrollment,
        this.resourceType,
        this.relatedArtifact,
        this.principalInvestigator,
        this.condition,
        this.note,
        this.category);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchStudy#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchStudy withMeta(Optional<? extends Meta> optional) {
    @Nullable Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableResearchStudy(
        value,
        this.extension,
        this.phase,
        this.period,
        this.focus,
        this.objective,
        this.id,
        this.text,
        this.identifier,
        this.partOf,
        this.contact,
        this.language,
        this.contained,
        this.arm,
        this.sponsor,
        this.keyword,
        this.primaryPurposeType,
        this.status,
        this.reasonStopped,
        this.protocol,
        this.title,
        this.modifierExtension,
        this.site,
        this.implicitRules,
        this.location,
        this.description,
        this.enrollment,
        this.resourceType,
        this.relatedArtifact,
        this.principalInvestigator,
        this.condition,
        this.note,
        this.category);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchStudy#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchStudy withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableResearchStudy(
        this.meta,
        newValue,
        this.phase,
        this.period,
        this.focus,
        this.objective,
        this.id,
        this.text,
        this.identifier,
        this.partOf,
        this.contact,
        this.language,
        this.contained,
        this.arm,
        this.sponsor,
        this.keyword,
        this.primaryPurposeType,
        this.status,
        this.reasonStopped,
        this.protocol,
        this.title,
        this.modifierExtension,
        this.site,
        this.implicitRules,
        this.location,
        this.description,
        this.enrollment,
        this.resourceType,
        this.relatedArtifact,
        this.principalInvestigator,
        this.condition,
        this.note,
        this.category);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchStudy#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchStudy withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableResearchStudy(
        this.meta,
        value,
        this.phase,
        this.period,
        this.focus,
        this.objective,
        this.id,
        this.text,
        this.identifier,
        this.partOf,
        this.contact,
        this.language,
        this.contained,
        this.arm,
        this.sponsor,
        this.keyword,
        this.primaryPurposeType,
        this.status,
        this.reasonStopped,
        this.protocol,
        this.title,
        this.modifierExtension,
        this.site,
        this.implicitRules,
        this.location,
        this.description,
        this.enrollment,
        this.resourceType,
        this.relatedArtifact,
        this.principalInvestigator,
        this.condition,
        this.note,
        this.category);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchStudy#phase() phase} attribute.
   * @param value The value for phase
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchStudy withPhase(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "phase");
    if (this.phase == newValue) return this;
    return new ImmutableResearchStudy(
        this.meta,
        this.extension,
        newValue,
        this.period,
        this.focus,
        this.objective,
        this.id,
        this.text,
        this.identifier,
        this.partOf,
        this.contact,
        this.language,
        this.contained,
        this.arm,
        this.sponsor,
        this.keyword,
        this.primaryPurposeType,
        this.status,
        this.reasonStopped,
        this.protocol,
        this.title,
        this.modifierExtension,
        this.site,
        this.implicitRules,
        this.location,
        this.description,
        this.enrollment,
        this.resourceType,
        this.relatedArtifact,
        this.principalInvestigator,
        this.condition,
        this.note,
        this.category);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchStudy#phase() phase} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for phase
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchStudy withPhase(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.phase == value) return this;
    return new ImmutableResearchStudy(
        this.meta,
        this.extension,
        value,
        this.period,
        this.focus,
        this.objective,
        this.id,
        this.text,
        this.identifier,
        this.partOf,
        this.contact,
        this.language,
        this.contained,
        this.arm,
        this.sponsor,
        this.keyword,
        this.primaryPurposeType,
        this.status,
        this.reasonStopped,
        this.protocol,
        this.title,
        this.modifierExtension,
        this.site,
        this.implicitRules,
        this.location,
        this.description,
        this.enrollment,
        this.resourceType,
        this.relatedArtifact,
        this.principalInvestigator,
        this.condition,
        this.note,
        this.category);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchStudy#period() period} attribute.
   * @param value The value for period
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchStudy withPeriod(Period value) {
    @Nullable Period newValue = Objects.requireNonNull(value, "period");
    if (this.period == newValue) return this;
    return new ImmutableResearchStudy(
        this.meta,
        this.extension,
        this.phase,
        newValue,
        this.focus,
        this.objective,
        this.id,
        this.text,
        this.identifier,
        this.partOf,
        this.contact,
        this.language,
        this.contained,
        this.arm,
        this.sponsor,
        this.keyword,
        this.primaryPurposeType,
        this.status,
        this.reasonStopped,
        this.protocol,
        this.title,
        this.modifierExtension,
        this.site,
        this.implicitRules,
        this.location,
        this.description,
        this.enrollment,
        this.resourceType,
        this.relatedArtifact,
        this.principalInvestigator,
        this.condition,
        this.note,
        this.category);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchStudy#period() period} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for period
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchStudy withPeriod(Optional<? extends Period> optional) {
    @Nullable Period value = optional.orElse(null);
    if (this.period == value) return this;
    return new ImmutableResearchStudy(
        this.meta,
        this.extension,
        this.phase,
        value,
        this.focus,
        this.objective,
        this.id,
        this.text,
        this.identifier,
        this.partOf,
        this.contact,
        this.language,
        this.contained,
        this.arm,
        this.sponsor,
        this.keyword,
        this.primaryPurposeType,
        this.status,
        this.reasonStopped,
        this.protocol,
        this.title,
        this.modifierExtension,
        this.site,
        this.implicitRules,
        this.location,
        this.description,
        this.enrollment,
        this.resourceType,
        this.relatedArtifact,
        this.principalInvestigator,
        this.condition,
        this.note,
        this.category);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchStudy#focus() focus} attribute.
   * @param value The value for focus
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchStudy withFocus(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "focus");
    if (this.focus == newValue) return this;
    return new ImmutableResearchStudy(
        this.meta,
        this.extension,
        this.phase,
        this.period,
        newValue,
        this.objective,
        this.id,
        this.text,
        this.identifier,
        this.partOf,
        this.contact,
        this.language,
        this.contained,
        this.arm,
        this.sponsor,
        this.keyword,
        this.primaryPurposeType,
        this.status,
        this.reasonStopped,
        this.protocol,
        this.title,
        this.modifierExtension,
        this.site,
        this.implicitRules,
        this.location,
        this.description,
        this.enrollment,
        this.resourceType,
        this.relatedArtifact,
        this.principalInvestigator,
        this.condition,
        this.note,
        this.category);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchStudy#focus() focus} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for focus
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchStudy withFocus(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.focus == value) return this;
    return new ImmutableResearchStudy(
        this.meta,
        this.extension,
        this.phase,
        this.period,
        value,
        this.objective,
        this.id,
        this.text,
        this.identifier,
        this.partOf,
        this.contact,
        this.language,
        this.contained,
        this.arm,
        this.sponsor,
        this.keyword,
        this.primaryPurposeType,
        this.status,
        this.reasonStopped,
        this.protocol,
        this.title,
        this.modifierExtension,
        this.site,
        this.implicitRules,
        this.location,
        this.description,
        this.enrollment,
        this.resourceType,
        this.relatedArtifact,
        this.principalInvestigator,
        this.condition,
        this.note,
        this.category);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchStudy#objective() objective} attribute.
   * @param value The value for objective
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchStudy withObjective(List<ResearchStudy_Objective> value) {
    @Nullable List<ResearchStudy_Objective> newValue = Objects.requireNonNull(value, "objective");
    if (this.objective == newValue) return this;
    return new ImmutableResearchStudy(
        this.meta,
        this.extension,
        this.phase,
        this.period,
        this.focus,
        newValue,
        this.id,
        this.text,
        this.identifier,
        this.partOf,
        this.contact,
        this.language,
        this.contained,
        this.arm,
        this.sponsor,
        this.keyword,
        this.primaryPurposeType,
        this.status,
        this.reasonStopped,
        this.protocol,
        this.title,
        this.modifierExtension,
        this.site,
        this.implicitRules,
        this.location,
        this.description,
        this.enrollment,
        this.resourceType,
        this.relatedArtifact,
        this.principalInvestigator,
        this.condition,
        this.note,
        this.category);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchStudy#objective() objective} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for objective
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchStudy withObjective(Optional<? extends List<ResearchStudy_Objective>> optional) {
    @Nullable List<ResearchStudy_Objective> value = optional.orElse(null);
    if (this.objective == value) return this;
    return new ImmutableResearchStudy(
        this.meta,
        this.extension,
        this.phase,
        this.period,
        this.focus,
        value,
        this.id,
        this.text,
        this.identifier,
        this.partOf,
        this.contact,
        this.language,
        this.contained,
        this.arm,
        this.sponsor,
        this.keyword,
        this.primaryPurposeType,
        this.status,
        this.reasonStopped,
        this.protocol,
        this.title,
        this.modifierExtension,
        this.site,
        this.implicitRules,
        this.location,
        this.description,
        this.enrollment,
        this.resourceType,
        this.relatedArtifact,
        this.principalInvestigator,
        this.condition,
        this.note,
        this.category);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchStudy#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchStudy withId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableResearchStudy(
        this.meta,
        this.extension,
        this.phase,
        this.period,
        this.focus,
        this.objective,
        newValue,
        this.text,
        this.identifier,
        this.partOf,
        this.contact,
        this.language,
        this.contained,
        this.arm,
        this.sponsor,
        this.keyword,
        this.primaryPurposeType,
        this.status,
        this.reasonStopped,
        this.protocol,
        this.title,
        this.modifierExtension,
        this.site,
        this.implicitRules,
        this.location,
        this.description,
        this.enrollment,
        this.resourceType,
        this.relatedArtifact,
        this.principalInvestigator,
        this.condition,
        this.note,
        this.category);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchStudy#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchStudy withId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableResearchStudy(
        this.meta,
        this.extension,
        this.phase,
        this.period,
        this.focus,
        this.objective,
        value,
        this.text,
        this.identifier,
        this.partOf,
        this.contact,
        this.language,
        this.contained,
        this.arm,
        this.sponsor,
        this.keyword,
        this.primaryPurposeType,
        this.status,
        this.reasonStopped,
        this.protocol,
        this.title,
        this.modifierExtension,
        this.site,
        this.implicitRules,
        this.location,
        this.description,
        this.enrollment,
        this.resourceType,
        this.relatedArtifact,
        this.principalInvestigator,
        this.condition,
        this.note,
        this.category);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchStudy#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchStudy withText(Narrative value) {
    @Nullable Narrative newValue = Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableResearchStudy(
        this.meta,
        this.extension,
        this.phase,
        this.period,
        this.focus,
        this.objective,
        this.id,
        newValue,
        this.identifier,
        this.partOf,
        this.contact,
        this.language,
        this.contained,
        this.arm,
        this.sponsor,
        this.keyword,
        this.primaryPurposeType,
        this.status,
        this.reasonStopped,
        this.protocol,
        this.title,
        this.modifierExtension,
        this.site,
        this.implicitRules,
        this.location,
        this.description,
        this.enrollment,
        this.resourceType,
        this.relatedArtifact,
        this.principalInvestigator,
        this.condition,
        this.note,
        this.category);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchStudy#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchStudy withText(Optional<? extends Narrative> optional) {
    @Nullable Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableResearchStudy(
        this.meta,
        this.extension,
        this.phase,
        this.period,
        this.focus,
        this.objective,
        this.id,
        value,
        this.identifier,
        this.partOf,
        this.contact,
        this.language,
        this.contained,
        this.arm,
        this.sponsor,
        this.keyword,
        this.primaryPurposeType,
        this.status,
        this.reasonStopped,
        this.protocol,
        this.title,
        this.modifierExtension,
        this.site,
        this.implicitRules,
        this.location,
        this.description,
        this.enrollment,
        this.resourceType,
        this.relatedArtifact,
        this.principalInvestigator,
        this.condition,
        this.note,
        this.category);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchStudy#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchStudy withIdentifier(List<Identifier> value) {
    @Nullable List<Identifier> newValue = Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableResearchStudy(
        this.meta,
        this.extension,
        this.phase,
        this.period,
        this.focus,
        this.objective,
        this.id,
        this.text,
        newValue,
        this.partOf,
        this.contact,
        this.language,
        this.contained,
        this.arm,
        this.sponsor,
        this.keyword,
        this.primaryPurposeType,
        this.status,
        this.reasonStopped,
        this.protocol,
        this.title,
        this.modifierExtension,
        this.site,
        this.implicitRules,
        this.location,
        this.description,
        this.enrollment,
        this.resourceType,
        this.relatedArtifact,
        this.principalInvestigator,
        this.condition,
        this.note,
        this.category);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchStudy#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchStudy withIdentifier(Optional<? extends List<Identifier>> optional) {
    @Nullable List<Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableResearchStudy(
        this.meta,
        this.extension,
        this.phase,
        this.period,
        this.focus,
        this.objective,
        this.id,
        this.text,
        value,
        this.partOf,
        this.contact,
        this.language,
        this.contained,
        this.arm,
        this.sponsor,
        this.keyword,
        this.primaryPurposeType,
        this.status,
        this.reasonStopped,
        this.protocol,
        this.title,
        this.modifierExtension,
        this.site,
        this.implicitRules,
        this.location,
        this.description,
        this.enrollment,
        this.resourceType,
        this.relatedArtifact,
        this.principalInvestigator,
        this.condition,
        this.note,
        this.category);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchStudy#partOf() partOf} attribute.
   * @param value The value for partOf
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchStudy withPartOf(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "partOf");
    if (this.partOf == newValue) return this;
    return new ImmutableResearchStudy(
        this.meta,
        this.extension,
        this.phase,
        this.period,
        this.focus,
        this.objective,
        this.id,
        this.text,
        this.identifier,
        newValue,
        this.contact,
        this.language,
        this.contained,
        this.arm,
        this.sponsor,
        this.keyword,
        this.primaryPurposeType,
        this.status,
        this.reasonStopped,
        this.protocol,
        this.title,
        this.modifierExtension,
        this.site,
        this.implicitRules,
        this.location,
        this.description,
        this.enrollment,
        this.resourceType,
        this.relatedArtifact,
        this.principalInvestigator,
        this.condition,
        this.note,
        this.category);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchStudy#partOf() partOf} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for partOf
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchStudy withPartOf(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.partOf == value) return this;
    return new ImmutableResearchStudy(
        this.meta,
        this.extension,
        this.phase,
        this.period,
        this.focus,
        this.objective,
        this.id,
        this.text,
        this.identifier,
        value,
        this.contact,
        this.language,
        this.contained,
        this.arm,
        this.sponsor,
        this.keyword,
        this.primaryPurposeType,
        this.status,
        this.reasonStopped,
        this.protocol,
        this.title,
        this.modifierExtension,
        this.site,
        this.implicitRules,
        this.location,
        this.description,
        this.enrollment,
        this.resourceType,
        this.relatedArtifact,
        this.principalInvestigator,
        this.condition,
        this.note,
        this.category);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchStudy#contact() contact} attribute.
   * @param value The value for contact
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchStudy withContact(List<ContactDetail> value) {
    @Nullable List<ContactDetail> newValue = Objects.requireNonNull(value, "contact");
    if (this.contact == newValue) return this;
    return new ImmutableResearchStudy(
        this.meta,
        this.extension,
        this.phase,
        this.period,
        this.focus,
        this.objective,
        this.id,
        this.text,
        this.identifier,
        this.partOf,
        newValue,
        this.language,
        this.contained,
        this.arm,
        this.sponsor,
        this.keyword,
        this.primaryPurposeType,
        this.status,
        this.reasonStopped,
        this.protocol,
        this.title,
        this.modifierExtension,
        this.site,
        this.implicitRules,
        this.location,
        this.description,
        this.enrollment,
        this.resourceType,
        this.relatedArtifact,
        this.principalInvestigator,
        this.condition,
        this.note,
        this.category);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchStudy#contact() contact} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contact
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchStudy withContact(Optional<? extends List<ContactDetail>> optional) {
    @Nullable List<ContactDetail> value = optional.orElse(null);
    if (this.contact == value) return this;
    return new ImmutableResearchStudy(
        this.meta,
        this.extension,
        this.phase,
        this.period,
        this.focus,
        this.objective,
        this.id,
        this.text,
        this.identifier,
        this.partOf,
        value,
        this.language,
        this.contained,
        this.arm,
        this.sponsor,
        this.keyword,
        this.primaryPurposeType,
        this.status,
        this.reasonStopped,
        this.protocol,
        this.title,
        this.modifierExtension,
        this.site,
        this.implicitRules,
        this.location,
        this.description,
        this.enrollment,
        this.resourceType,
        this.relatedArtifact,
        this.principalInvestigator,
        this.condition,
        this.note,
        this.category);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchStudy#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchStudy withLanguage(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableResearchStudy(
        this.meta,
        this.extension,
        this.phase,
        this.period,
        this.focus,
        this.objective,
        this.id,
        this.text,
        this.identifier,
        this.partOf,
        this.contact,
        newValue,
        this.contained,
        this.arm,
        this.sponsor,
        this.keyword,
        this.primaryPurposeType,
        this.status,
        this.reasonStopped,
        this.protocol,
        this.title,
        this.modifierExtension,
        this.site,
        this.implicitRules,
        this.location,
        this.description,
        this.enrollment,
        this.resourceType,
        this.relatedArtifact,
        this.principalInvestigator,
        this.condition,
        this.note,
        this.category);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchStudy#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchStudy withLanguage(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableResearchStudy(
        this.meta,
        this.extension,
        this.phase,
        this.period,
        this.focus,
        this.objective,
        this.id,
        this.text,
        this.identifier,
        this.partOf,
        this.contact,
        value,
        this.contained,
        this.arm,
        this.sponsor,
        this.keyword,
        this.primaryPurposeType,
        this.status,
        this.reasonStopped,
        this.protocol,
        this.title,
        this.modifierExtension,
        this.site,
        this.implicitRules,
        this.location,
        this.description,
        this.enrollment,
        this.resourceType,
        this.relatedArtifact,
        this.principalInvestigator,
        this.condition,
        this.note,
        this.category);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchStudy#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchStudy withContained(List<ResourceList> value) {
    @Nullable List<ResourceList> newValue = Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableResearchStudy(
        this.meta,
        this.extension,
        this.phase,
        this.period,
        this.focus,
        this.objective,
        this.id,
        this.text,
        this.identifier,
        this.partOf,
        this.contact,
        this.language,
        newValue,
        this.arm,
        this.sponsor,
        this.keyword,
        this.primaryPurposeType,
        this.status,
        this.reasonStopped,
        this.protocol,
        this.title,
        this.modifierExtension,
        this.site,
        this.implicitRules,
        this.location,
        this.description,
        this.enrollment,
        this.resourceType,
        this.relatedArtifact,
        this.principalInvestigator,
        this.condition,
        this.note,
        this.category);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchStudy#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchStudy withContained(Optional<? extends List<ResourceList>> optional) {
    @Nullable List<ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableResearchStudy(
        this.meta,
        this.extension,
        this.phase,
        this.period,
        this.focus,
        this.objective,
        this.id,
        this.text,
        this.identifier,
        this.partOf,
        this.contact,
        this.language,
        value,
        this.arm,
        this.sponsor,
        this.keyword,
        this.primaryPurposeType,
        this.status,
        this.reasonStopped,
        this.protocol,
        this.title,
        this.modifierExtension,
        this.site,
        this.implicitRules,
        this.location,
        this.description,
        this.enrollment,
        this.resourceType,
        this.relatedArtifact,
        this.principalInvestigator,
        this.condition,
        this.note,
        this.category);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchStudy#arm() arm} attribute.
   * @param value The value for arm
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchStudy withArm(List<ResearchStudy_Arm> value) {
    @Nullable List<ResearchStudy_Arm> newValue = Objects.requireNonNull(value, "arm");
    if (this.arm == newValue) return this;
    return new ImmutableResearchStudy(
        this.meta,
        this.extension,
        this.phase,
        this.period,
        this.focus,
        this.objective,
        this.id,
        this.text,
        this.identifier,
        this.partOf,
        this.contact,
        this.language,
        this.contained,
        newValue,
        this.sponsor,
        this.keyword,
        this.primaryPurposeType,
        this.status,
        this.reasonStopped,
        this.protocol,
        this.title,
        this.modifierExtension,
        this.site,
        this.implicitRules,
        this.location,
        this.description,
        this.enrollment,
        this.resourceType,
        this.relatedArtifact,
        this.principalInvestigator,
        this.condition,
        this.note,
        this.category);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchStudy#arm() arm} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for arm
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchStudy withArm(Optional<? extends List<ResearchStudy_Arm>> optional) {
    @Nullable List<ResearchStudy_Arm> value = optional.orElse(null);
    if (this.arm == value) return this;
    return new ImmutableResearchStudy(
        this.meta,
        this.extension,
        this.phase,
        this.period,
        this.focus,
        this.objective,
        this.id,
        this.text,
        this.identifier,
        this.partOf,
        this.contact,
        this.language,
        this.contained,
        value,
        this.sponsor,
        this.keyword,
        this.primaryPurposeType,
        this.status,
        this.reasonStopped,
        this.protocol,
        this.title,
        this.modifierExtension,
        this.site,
        this.implicitRules,
        this.location,
        this.description,
        this.enrollment,
        this.resourceType,
        this.relatedArtifact,
        this.principalInvestigator,
        this.condition,
        this.note,
        this.category);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchStudy#sponsor() sponsor} attribute.
   * @param value The value for sponsor
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchStudy withSponsor(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "sponsor");
    if (this.sponsor == newValue) return this;
    return new ImmutableResearchStudy(
        this.meta,
        this.extension,
        this.phase,
        this.period,
        this.focus,
        this.objective,
        this.id,
        this.text,
        this.identifier,
        this.partOf,
        this.contact,
        this.language,
        this.contained,
        this.arm,
        newValue,
        this.keyword,
        this.primaryPurposeType,
        this.status,
        this.reasonStopped,
        this.protocol,
        this.title,
        this.modifierExtension,
        this.site,
        this.implicitRules,
        this.location,
        this.description,
        this.enrollment,
        this.resourceType,
        this.relatedArtifact,
        this.principalInvestigator,
        this.condition,
        this.note,
        this.category);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchStudy#sponsor() sponsor} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for sponsor
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchStudy withSponsor(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.sponsor == value) return this;
    return new ImmutableResearchStudy(
        this.meta,
        this.extension,
        this.phase,
        this.period,
        this.focus,
        this.objective,
        this.id,
        this.text,
        this.identifier,
        this.partOf,
        this.contact,
        this.language,
        this.contained,
        this.arm,
        value,
        this.keyword,
        this.primaryPurposeType,
        this.status,
        this.reasonStopped,
        this.protocol,
        this.title,
        this.modifierExtension,
        this.site,
        this.implicitRules,
        this.location,
        this.description,
        this.enrollment,
        this.resourceType,
        this.relatedArtifact,
        this.principalInvestigator,
        this.condition,
        this.note,
        this.category);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchStudy#keyword() keyword} attribute.
   * @param value The value for keyword
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchStudy withKeyword(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "keyword");
    if (this.keyword == newValue) return this;
    return new ImmutableResearchStudy(
        this.meta,
        this.extension,
        this.phase,
        this.period,
        this.focus,
        this.objective,
        this.id,
        this.text,
        this.identifier,
        this.partOf,
        this.contact,
        this.language,
        this.contained,
        this.arm,
        this.sponsor,
        newValue,
        this.primaryPurposeType,
        this.status,
        this.reasonStopped,
        this.protocol,
        this.title,
        this.modifierExtension,
        this.site,
        this.implicitRules,
        this.location,
        this.description,
        this.enrollment,
        this.resourceType,
        this.relatedArtifact,
        this.principalInvestigator,
        this.condition,
        this.note,
        this.category);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchStudy#keyword() keyword} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for keyword
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchStudy withKeyword(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.keyword == value) return this;
    return new ImmutableResearchStudy(
        this.meta,
        this.extension,
        this.phase,
        this.period,
        this.focus,
        this.objective,
        this.id,
        this.text,
        this.identifier,
        this.partOf,
        this.contact,
        this.language,
        this.contained,
        this.arm,
        this.sponsor,
        value,
        this.primaryPurposeType,
        this.status,
        this.reasonStopped,
        this.protocol,
        this.title,
        this.modifierExtension,
        this.site,
        this.implicitRules,
        this.location,
        this.description,
        this.enrollment,
        this.resourceType,
        this.relatedArtifact,
        this.principalInvestigator,
        this.condition,
        this.note,
        this.category);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchStudy#primaryPurposeType() primaryPurposeType} attribute.
   * @param value The value for primaryPurposeType
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchStudy withPrimaryPurposeType(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "primaryPurposeType");
    if (this.primaryPurposeType == newValue) return this;
    return new ImmutableResearchStudy(
        this.meta,
        this.extension,
        this.phase,
        this.period,
        this.focus,
        this.objective,
        this.id,
        this.text,
        this.identifier,
        this.partOf,
        this.contact,
        this.language,
        this.contained,
        this.arm,
        this.sponsor,
        this.keyword,
        newValue,
        this.status,
        this.reasonStopped,
        this.protocol,
        this.title,
        this.modifierExtension,
        this.site,
        this.implicitRules,
        this.location,
        this.description,
        this.enrollment,
        this.resourceType,
        this.relatedArtifact,
        this.principalInvestigator,
        this.condition,
        this.note,
        this.category);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchStudy#primaryPurposeType() primaryPurposeType} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for primaryPurposeType
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchStudy withPrimaryPurposeType(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.primaryPurposeType == value) return this;
    return new ImmutableResearchStudy(
        this.meta,
        this.extension,
        this.phase,
        this.period,
        this.focus,
        this.objective,
        this.id,
        this.text,
        this.identifier,
        this.partOf,
        this.contact,
        this.language,
        this.contained,
        this.arm,
        this.sponsor,
        this.keyword,
        value,
        this.status,
        this.reasonStopped,
        this.protocol,
        this.title,
        this.modifierExtension,
        this.site,
        this.implicitRules,
        this.location,
        this.description,
        this.enrollment,
        this.resourceType,
        this.relatedArtifact,
        this.principalInvestigator,
        this.condition,
        this.note,
        this.category);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchStudy#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchStudy withStatus(ResearchstudyStatus value) {
    @Nullable ResearchstudyStatus newValue = Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableResearchStudy(
        this.meta,
        this.extension,
        this.phase,
        this.period,
        this.focus,
        this.objective,
        this.id,
        this.text,
        this.identifier,
        this.partOf,
        this.contact,
        this.language,
        this.contained,
        this.arm,
        this.sponsor,
        this.keyword,
        this.primaryPurposeType,
        newValue,
        this.reasonStopped,
        this.protocol,
        this.title,
        this.modifierExtension,
        this.site,
        this.implicitRules,
        this.location,
        this.description,
        this.enrollment,
        this.resourceType,
        this.relatedArtifact,
        this.principalInvestigator,
        this.condition,
        this.note,
        this.category);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchStudy#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchStudy withStatus(Optional<? extends ResearchstudyStatus> optional) {
    @Nullable ResearchstudyStatus value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableResearchStudy(
        this.meta,
        this.extension,
        this.phase,
        this.period,
        this.focus,
        this.objective,
        this.id,
        this.text,
        this.identifier,
        this.partOf,
        this.contact,
        this.language,
        this.contained,
        this.arm,
        this.sponsor,
        this.keyword,
        this.primaryPurposeType,
        value,
        this.reasonStopped,
        this.protocol,
        this.title,
        this.modifierExtension,
        this.site,
        this.implicitRules,
        this.location,
        this.description,
        this.enrollment,
        this.resourceType,
        this.relatedArtifact,
        this.principalInvestigator,
        this.condition,
        this.note,
        this.category);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchStudy#reasonStopped() reasonStopped} attribute.
   * @param value The value for reasonStopped
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchStudy withReasonStopped(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "reasonStopped");
    if (this.reasonStopped == newValue) return this;
    return new ImmutableResearchStudy(
        this.meta,
        this.extension,
        this.phase,
        this.period,
        this.focus,
        this.objective,
        this.id,
        this.text,
        this.identifier,
        this.partOf,
        this.contact,
        this.language,
        this.contained,
        this.arm,
        this.sponsor,
        this.keyword,
        this.primaryPurposeType,
        this.status,
        newValue,
        this.protocol,
        this.title,
        this.modifierExtension,
        this.site,
        this.implicitRules,
        this.location,
        this.description,
        this.enrollment,
        this.resourceType,
        this.relatedArtifact,
        this.principalInvestigator,
        this.condition,
        this.note,
        this.category);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchStudy#reasonStopped() reasonStopped} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for reasonStopped
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchStudy withReasonStopped(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.reasonStopped == value) return this;
    return new ImmutableResearchStudy(
        this.meta,
        this.extension,
        this.phase,
        this.period,
        this.focus,
        this.objective,
        this.id,
        this.text,
        this.identifier,
        this.partOf,
        this.contact,
        this.language,
        this.contained,
        this.arm,
        this.sponsor,
        this.keyword,
        this.primaryPurposeType,
        this.status,
        value,
        this.protocol,
        this.title,
        this.modifierExtension,
        this.site,
        this.implicitRules,
        this.location,
        this.description,
        this.enrollment,
        this.resourceType,
        this.relatedArtifact,
        this.principalInvestigator,
        this.condition,
        this.note,
        this.category);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchStudy#protocol() protocol} attribute.
   * @param value The value for protocol
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchStudy withProtocol(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "protocol");
    if (this.protocol == newValue) return this;
    return new ImmutableResearchStudy(
        this.meta,
        this.extension,
        this.phase,
        this.period,
        this.focus,
        this.objective,
        this.id,
        this.text,
        this.identifier,
        this.partOf,
        this.contact,
        this.language,
        this.contained,
        this.arm,
        this.sponsor,
        this.keyword,
        this.primaryPurposeType,
        this.status,
        this.reasonStopped,
        newValue,
        this.title,
        this.modifierExtension,
        this.site,
        this.implicitRules,
        this.location,
        this.description,
        this.enrollment,
        this.resourceType,
        this.relatedArtifact,
        this.principalInvestigator,
        this.condition,
        this.note,
        this.category);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchStudy#protocol() protocol} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for protocol
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchStudy withProtocol(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.protocol == value) return this;
    return new ImmutableResearchStudy(
        this.meta,
        this.extension,
        this.phase,
        this.period,
        this.focus,
        this.objective,
        this.id,
        this.text,
        this.identifier,
        this.partOf,
        this.contact,
        this.language,
        this.contained,
        this.arm,
        this.sponsor,
        this.keyword,
        this.primaryPurposeType,
        this.status,
        this.reasonStopped,
        value,
        this.title,
        this.modifierExtension,
        this.site,
        this.implicitRules,
        this.location,
        this.description,
        this.enrollment,
        this.resourceType,
        this.relatedArtifact,
        this.principalInvestigator,
        this.condition,
        this.note,
        this.category);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchStudy#title() title} attribute.
   * @param value The value for title
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchStudy withTitle(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "title");
    if (Objects.equals(this.title, newValue)) return this;
    return new ImmutableResearchStudy(
        this.meta,
        this.extension,
        this.phase,
        this.period,
        this.focus,
        this.objective,
        this.id,
        this.text,
        this.identifier,
        this.partOf,
        this.contact,
        this.language,
        this.contained,
        this.arm,
        this.sponsor,
        this.keyword,
        this.primaryPurposeType,
        this.status,
        this.reasonStopped,
        this.protocol,
        newValue,
        this.modifierExtension,
        this.site,
        this.implicitRules,
        this.location,
        this.description,
        this.enrollment,
        this.resourceType,
        this.relatedArtifact,
        this.principalInvestigator,
        this.condition,
        this.note,
        this.category);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchStudy#title() title} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for title
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchStudy withTitle(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.title, value)) return this;
    return new ImmutableResearchStudy(
        this.meta,
        this.extension,
        this.phase,
        this.period,
        this.focus,
        this.objective,
        this.id,
        this.text,
        this.identifier,
        this.partOf,
        this.contact,
        this.language,
        this.contained,
        this.arm,
        this.sponsor,
        this.keyword,
        this.primaryPurposeType,
        this.status,
        this.reasonStopped,
        this.protocol,
        value,
        this.modifierExtension,
        this.site,
        this.implicitRules,
        this.location,
        this.description,
        this.enrollment,
        this.resourceType,
        this.relatedArtifact,
        this.principalInvestigator,
        this.condition,
        this.note,
        this.category);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchStudy#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchStudy withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableResearchStudy(
        this.meta,
        this.extension,
        this.phase,
        this.period,
        this.focus,
        this.objective,
        this.id,
        this.text,
        this.identifier,
        this.partOf,
        this.contact,
        this.language,
        this.contained,
        this.arm,
        this.sponsor,
        this.keyword,
        this.primaryPurposeType,
        this.status,
        this.reasonStopped,
        this.protocol,
        this.title,
        newValue,
        this.site,
        this.implicitRules,
        this.location,
        this.description,
        this.enrollment,
        this.resourceType,
        this.relatedArtifact,
        this.principalInvestigator,
        this.condition,
        this.note,
        this.category);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchStudy#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchStudy withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableResearchStudy(
        this.meta,
        this.extension,
        this.phase,
        this.period,
        this.focus,
        this.objective,
        this.id,
        this.text,
        this.identifier,
        this.partOf,
        this.contact,
        this.language,
        this.contained,
        this.arm,
        this.sponsor,
        this.keyword,
        this.primaryPurposeType,
        this.status,
        this.reasonStopped,
        this.protocol,
        this.title,
        value,
        this.site,
        this.implicitRules,
        this.location,
        this.description,
        this.enrollment,
        this.resourceType,
        this.relatedArtifact,
        this.principalInvestigator,
        this.condition,
        this.note,
        this.category);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchStudy#site() site} attribute.
   * @param value The value for site
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchStudy withSite(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "site");
    if (this.site == newValue) return this;
    return new ImmutableResearchStudy(
        this.meta,
        this.extension,
        this.phase,
        this.period,
        this.focus,
        this.objective,
        this.id,
        this.text,
        this.identifier,
        this.partOf,
        this.contact,
        this.language,
        this.contained,
        this.arm,
        this.sponsor,
        this.keyword,
        this.primaryPurposeType,
        this.status,
        this.reasonStopped,
        this.protocol,
        this.title,
        this.modifierExtension,
        newValue,
        this.implicitRules,
        this.location,
        this.description,
        this.enrollment,
        this.resourceType,
        this.relatedArtifact,
        this.principalInvestigator,
        this.condition,
        this.note,
        this.category);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchStudy#site() site} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for site
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchStudy withSite(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.site == value) return this;
    return new ImmutableResearchStudy(
        this.meta,
        this.extension,
        this.phase,
        this.period,
        this.focus,
        this.objective,
        this.id,
        this.text,
        this.identifier,
        this.partOf,
        this.contact,
        this.language,
        this.contained,
        this.arm,
        this.sponsor,
        this.keyword,
        this.primaryPurposeType,
        this.status,
        this.reasonStopped,
        this.protocol,
        this.title,
        this.modifierExtension,
        value,
        this.implicitRules,
        this.location,
        this.description,
        this.enrollment,
        this.resourceType,
        this.relatedArtifact,
        this.principalInvestigator,
        this.condition,
        this.note,
        this.category);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchStudy#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchStudy withImplicitRules(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableResearchStudy(
        this.meta,
        this.extension,
        this.phase,
        this.period,
        this.focus,
        this.objective,
        this.id,
        this.text,
        this.identifier,
        this.partOf,
        this.contact,
        this.language,
        this.contained,
        this.arm,
        this.sponsor,
        this.keyword,
        this.primaryPurposeType,
        this.status,
        this.reasonStopped,
        this.protocol,
        this.title,
        this.modifierExtension,
        this.site,
        newValue,
        this.location,
        this.description,
        this.enrollment,
        this.resourceType,
        this.relatedArtifact,
        this.principalInvestigator,
        this.condition,
        this.note,
        this.category);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchStudy#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchStudy withImplicitRules(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableResearchStudy(
        this.meta,
        this.extension,
        this.phase,
        this.period,
        this.focus,
        this.objective,
        this.id,
        this.text,
        this.identifier,
        this.partOf,
        this.contact,
        this.language,
        this.contained,
        this.arm,
        this.sponsor,
        this.keyword,
        this.primaryPurposeType,
        this.status,
        this.reasonStopped,
        this.protocol,
        this.title,
        this.modifierExtension,
        this.site,
        value,
        this.location,
        this.description,
        this.enrollment,
        this.resourceType,
        this.relatedArtifact,
        this.principalInvestigator,
        this.condition,
        this.note,
        this.category);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchStudy#location() location} attribute.
   * @param value The value for location
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchStudy withLocation(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "location");
    if (this.location == newValue) return this;
    return new ImmutableResearchStudy(
        this.meta,
        this.extension,
        this.phase,
        this.period,
        this.focus,
        this.objective,
        this.id,
        this.text,
        this.identifier,
        this.partOf,
        this.contact,
        this.language,
        this.contained,
        this.arm,
        this.sponsor,
        this.keyword,
        this.primaryPurposeType,
        this.status,
        this.reasonStopped,
        this.protocol,
        this.title,
        this.modifierExtension,
        this.site,
        this.implicitRules,
        newValue,
        this.description,
        this.enrollment,
        this.resourceType,
        this.relatedArtifact,
        this.principalInvestigator,
        this.condition,
        this.note,
        this.category);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchStudy#location() location} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for location
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchStudy withLocation(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.location == value) return this;
    return new ImmutableResearchStudy(
        this.meta,
        this.extension,
        this.phase,
        this.period,
        this.focus,
        this.objective,
        this.id,
        this.text,
        this.identifier,
        this.partOf,
        this.contact,
        this.language,
        this.contained,
        this.arm,
        this.sponsor,
        this.keyword,
        this.primaryPurposeType,
        this.status,
        this.reasonStopped,
        this.protocol,
        this.title,
        this.modifierExtension,
        this.site,
        this.implicitRules,
        value,
        this.description,
        this.enrollment,
        this.resourceType,
        this.relatedArtifact,
        this.principalInvestigator,
        this.condition,
        this.note,
        this.category);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchStudy#description() description} attribute.
   * @param value The value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchStudy withDescription(Markdown value) {
    @Nullable Markdown newValue = Objects.requireNonNull(value, "description");
    if (this.description == newValue) return this;
    return new ImmutableResearchStudy(
        this.meta,
        this.extension,
        this.phase,
        this.period,
        this.focus,
        this.objective,
        this.id,
        this.text,
        this.identifier,
        this.partOf,
        this.contact,
        this.language,
        this.contained,
        this.arm,
        this.sponsor,
        this.keyword,
        this.primaryPurposeType,
        this.status,
        this.reasonStopped,
        this.protocol,
        this.title,
        this.modifierExtension,
        this.site,
        this.implicitRules,
        this.location,
        newValue,
        this.enrollment,
        this.resourceType,
        this.relatedArtifact,
        this.principalInvestigator,
        this.condition,
        this.note,
        this.category);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchStudy#description() description} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for description
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchStudy withDescription(Optional<? extends Markdown> optional) {
    @Nullable Markdown value = optional.orElse(null);
    if (this.description == value) return this;
    return new ImmutableResearchStudy(
        this.meta,
        this.extension,
        this.phase,
        this.period,
        this.focus,
        this.objective,
        this.id,
        this.text,
        this.identifier,
        this.partOf,
        this.contact,
        this.language,
        this.contained,
        this.arm,
        this.sponsor,
        this.keyword,
        this.primaryPurposeType,
        this.status,
        this.reasonStopped,
        this.protocol,
        this.title,
        this.modifierExtension,
        this.site,
        this.implicitRules,
        this.location,
        value,
        this.enrollment,
        this.resourceType,
        this.relatedArtifact,
        this.principalInvestigator,
        this.condition,
        this.note,
        this.category);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchStudy#enrollment() enrollment} attribute.
   * @param value The value for enrollment
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchStudy withEnrollment(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "enrollment");
    if (this.enrollment == newValue) return this;
    return new ImmutableResearchStudy(
        this.meta,
        this.extension,
        this.phase,
        this.period,
        this.focus,
        this.objective,
        this.id,
        this.text,
        this.identifier,
        this.partOf,
        this.contact,
        this.language,
        this.contained,
        this.arm,
        this.sponsor,
        this.keyword,
        this.primaryPurposeType,
        this.status,
        this.reasonStopped,
        this.protocol,
        this.title,
        this.modifierExtension,
        this.site,
        this.implicitRules,
        this.location,
        this.description,
        newValue,
        this.resourceType,
        this.relatedArtifact,
        this.principalInvestigator,
        this.condition,
        this.note,
        this.category);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchStudy#enrollment() enrollment} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for enrollment
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchStudy withEnrollment(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.enrollment == value) return this;
    return new ImmutableResearchStudy(
        this.meta,
        this.extension,
        this.phase,
        this.period,
        this.focus,
        this.objective,
        this.id,
        this.text,
        this.identifier,
        this.partOf,
        this.contact,
        this.language,
        this.contained,
        this.arm,
        this.sponsor,
        this.keyword,
        this.primaryPurposeType,
        this.status,
        this.reasonStopped,
        this.protocol,
        this.title,
        this.modifierExtension,
        this.site,
        this.implicitRules,
        this.location,
        this.description,
        value,
        this.resourceType,
        this.relatedArtifact,
        this.principalInvestigator,
        this.condition,
        this.note,
        this.category);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ResearchStudy#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableResearchStudy withResourceType(String value) {
    String newValue = Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableResearchStudy(
        this.meta,
        this.extension,
        this.phase,
        this.period,
        this.focus,
        this.objective,
        this.id,
        this.text,
        this.identifier,
        this.partOf,
        this.contact,
        this.language,
        this.contained,
        this.arm,
        this.sponsor,
        this.keyword,
        this.primaryPurposeType,
        this.status,
        this.reasonStopped,
        this.protocol,
        this.title,
        this.modifierExtension,
        this.site,
        this.implicitRules,
        this.location,
        this.description,
        this.enrollment,
        newValue,
        this.relatedArtifact,
        this.principalInvestigator,
        this.condition,
        this.note,
        this.category);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchStudy#relatedArtifact() relatedArtifact} attribute.
   * @param value The value for relatedArtifact
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchStudy withRelatedArtifact(List<RelatedArtifact> value) {
    @Nullable List<RelatedArtifact> newValue = Objects.requireNonNull(value, "relatedArtifact");
    if (this.relatedArtifact == newValue) return this;
    return new ImmutableResearchStudy(
        this.meta,
        this.extension,
        this.phase,
        this.period,
        this.focus,
        this.objective,
        this.id,
        this.text,
        this.identifier,
        this.partOf,
        this.contact,
        this.language,
        this.contained,
        this.arm,
        this.sponsor,
        this.keyword,
        this.primaryPurposeType,
        this.status,
        this.reasonStopped,
        this.protocol,
        this.title,
        this.modifierExtension,
        this.site,
        this.implicitRules,
        this.location,
        this.description,
        this.enrollment,
        this.resourceType,
        newValue,
        this.principalInvestigator,
        this.condition,
        this.note,
        this.category);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchStudy#relatedArtifact() relatedArtifact} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for relatedArtifact
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchStudy withRelatedArtifact(Optional<? extends List<RelatedArtifact>> optional) {
    @Nullable List<RelatedArtifact> value = optional.orElse(null);
    if (this.relatedArtifact == value) return this;
    return new ImmutableResearchStudy(
        this.meta,
        this.extension,
        this.phase,
        this.period,
        this.focus,
        this.objective,
        this.id,
        this.text,
        this.identifier,
        this.partOf,
        this.contact,
        this.language,
        this.contained,
        this.arm,
        this.sponsor,
        this.keyword,
        this.primaryPurposeType,
        this.status,
        this.reasonStopped,
        this.protocol,
        this.title,
        this.modifierExtension,
        this.site,
        this.implicitRules,
        this.location,
        this.description,
        this.enrollment,
        this.resourceType,
        value,
        this.principalInvestigator,
        this.condition,
        this.note,
        this.category);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchStudy#principalInvestigator() principalInvestigator} attribute.
   * @param value The value for principalInvestigator
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchStudy withPrincipalInvestigator(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "principalInvestigator");
    if (this.principalInvestigator == newValue) return this;
    return new ImmutableResearchStudy(
        this.meta,
        this.extension,
        this.phase,
        this.period,
        this.focus,
        this.objective,
        this.id,
        this.text,
        this.identifier,
        this.partOf,
        this.contact,
        this.language,
        this.contained,
        this.arm,
        this.sponsor,
        this.keyword,
        this.primaryPurposeType,
        this.status,
        this.reasonStopped,
        this.protocol,
        this.title,
        this.modifierExtension,
        this.site,
        this.implicitRules,
        this.location,
        this.description,
        this.enrollment,
        this.resourceType,
        this.relatedArtifact,
        newValue,
        this.condition,
        this.note,
        this.category);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchStudy#principalInvestigator() principalInvestigator} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for principalInvestigator
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchStudy withPrincipalInvestigator(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.principalInvestigator == value) return this;
    return new ImmutableResearchStudy(
        this.meta,
        this.extension,
        this.phase,
        this.period,
        this.focus,
        this.objective,
        this.id,
        this.text,
        this.identifier,
        this.partOf,
        this.contact,
        this.language,
        this.contained,
        this.arm,
        this.sponsor,
        this.keyword,
        this.primaryPurposeType,
        this.status,
        this.reasonStopped,
        this.protocol,
        this.title,
        this.modifierExtension,
        this.site,
        this.implicitRules,
        this.location,
        this.description,
        this.enrollment,
        this.resourceType,
        this.relatedArtifact,
        value,
        this.condition,
        this.note,
        this.category);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchStudy#condition() condition} attribute.
   * @param value The value for condition
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchStudy withCondition(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "condition");
    if (this.condition == newValue) return this;
    return new ImmutableResearchStudy(
        this.meta,
        this.extension,
        this.phase,
        this.period,
        this.focus,
        this.objective,
        this.id,
        this.text,
        this.identifier,
        this.partOf,
        this.contact,
        this.language,
        this.contained,
        this.arm,
        this.sponsor,
        this.keyword,
        this.primaryPurposeType,
        this.status,
        this.reasonStopped,
        this.protocol,
        this.title,
        this.modifierExtension,
        this.site,
        this.implicitRules,
        this.location,
        this.description,
        this.enrollment,
        this.resourceType,
        this.relatedArtifact,
        this.principalInvestigator,
        newValue,
        this.note,
        this.category);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchStudy#condition() condition} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for condition
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchStudy withCondition(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.condition == value) return this;
    return new ImmutableResearchStudy(
        this.meta,
        this.extension,
        this.phase,
        this.period,
        this.focus,
        this.objective,
        this.id,
        this.text,
        this.identifier,
        this.partOf,
        this.contact,
        this.language,
        this.contained,
        this.arm,
        this.sponsor,
        this.keyword,
        this.primaryPurposeType,
        this.status,
        this.reasonStopped,
        this.protocol,
        this.title,
        this.modifierExtension,
        this.site,
        this.implicitRules,
        this.location,
        this.description,
        this.enrollment,
        this.resourceType,
        this.relatedArtifact,
        this.principalInvestigator,
        value,
        this.note,
        this.category);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchStudy#note() note} attribute.
   * @param value The value for note
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchStudy withNote(List<Annotation> value) {
    @Nullable List<Annotation> newValue = Objects.requireNonNull(value, "note");
    if (this.note == newValue) return this;
    return new ImmutableResearchStudy(
        this.meta,
        this.extension,
        this.phase,
        this.period,
        this.focus,
        this.objective,
        this.id,
        this.text,
        this.identifier,
        this.partOf,
        this.contact,
        this.language,
        this.contained,
        this.arm,
        this.sponsor,
        this.keyword,
        this.primaryPurposeType,
        this.status,
        this.reasonStopped,
        this.protocol,
        this.title,
        this.modifierExtension,
        this.site,
        this.implicitRules,
        this.location,
        this.description,
        this.enrollment,
        this.resourceType,
        this.relatedArtifact,
        this.principalInvestigator,
        this.condition,
        newValue,
        this.category);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchStudy#note() note} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for note
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchStudy withNote(Optional<? extends List<Annotation>> optional) {
    @Nullable List<Annotation> value = optional.orElse(null);
    if (this.note == value) return this;
    return new ImmutableResearchStudy(
        this.meta,
        this.extension,
        this.phase,
        this.period,
        this.focus,
        this.objective,
        this.id,
        this.text,
        this.identifier,
        this.partOf,
        this.contact,
        this.language,
        this.contained,
        this.arm,
        this.sponsor,
        this.keyword,
        this.primaryPurposeType,
        this.status,
        this.reasonStopped,
        this.protocol,
        this.title,
        this.modifierExtension,
        this.site,
        this.implicitRules,
        this.location,
        this.description,
        this.enrollment,
        this.resourceType,
        this.relatedArtifact,
        this.principalInvestigator,
        this.condition,
        value,
        this.category);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ResearchStudy#category() category} attribute.
   * @param value The value for category
   * @return A modified copy of {@code this} object
   */
  public final ImmutableResearchStudy withCategory(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "category");
    if (this.category == newValue) return this;
    return new ImmutableResearchStudy(
        this.meta,
        this.extension,
        this.phase,
        this.period,
        this.focus,
        this.objective,
        this.id,
        this.text,
        this.identifier,
        this.partOf,
        this.contact,
        this.language,
        this.contained,
        this.arm,
        this.sponsor,
        this.keyword,
        this.primaryPurposeType,
        this.status,
        this.reasonStopped,
        this.protocol,
        this.title,
        this.modifierExtension,
        this.site,
        this.implicitRules,
        this.location,
        this.description,
        this.enrollment,
        this.resourceType,
        this.relatedArtifact,
        this.principalInvestigator,
        this.condition,
        this.note,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ResearchStudy#category() category} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for category
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableResearchStudy withCategory(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.category == value) return this;
    return new ImmutableResearchStudy(
        this.meta,
        this.extension,
        this.phase,
        this.period,
        this.focus,
        this.objective,
        this.id,
        this.text,
        this.identifier,
        this.partOf,
        this.contact,
        this.language,
        this.contained,
        this.arm,
        this.sponsor,
        this.keyword,
        this.primaryPurposeType,
        this.status,
        this.reasonStopped,
        this.protocol,
        this.title,
        this.modifierExtension,
        this.site,
        this.implicitRules,
        this.location,
        this.description,
        this.enrollment,
        this.resourceType,
        this.relatedArtifact,
        this.principalInvestigator,
        this.condition,
        this.note,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableResearchStudy} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableResearchStudy
        && equalTo((ImmutableResearchStudy) another);
  }

  private boolean equalTo(ImmutableResearchStudy another) {
    return Objects.equals(meta, another.meta)
        && Objects.equals(extension, another.extension)
        && Objects.equals(phase, another.phase)
        && Objects.equals(period, another.period)
        && Objects.equals(focus, another.focus)
        && Objects.equals(objective, another.objective)
        && Objects.equals(id, another.id)
        && Objects.equals(text, another.text)
        && Objects.equals(identifier, another.identifier)
        && Objects.equals(partOf, another.partOf)
        && Objects.equals(contact, another.contact)
        && Objects.equals(language, another.language)
        && Objects.equals(contained, another.contained)
        && Objects.equals(arm, another.arm)
        && Objects.equals(sponsor, another.sponsor)
        && Objects.equals(keyword, another.keyword)
        && Objects.equals(primaryPurposeType, another.primaryPurposeType)
        && Objects.equals(status, another.status)
        && Objects.equals(reasonStopped, another.reasonStopped)
        && Objects.equals(protocol, another.protocol)
        && Objects.equals(title, another.title)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(site, another.site)
        && Objects.equals(implicitRules, another.implicitRules)
        && Objects.equals(location, another.location)
        && Objects.equals(description, another.description)
        && Objects.equals(enrollment, another.enrollment)
        && resourceType.equals(another.resourceType)
        && Objects.equals(relatedArtifact, another.relatedArtifact)
        && Objects.equals(principalInvestigator, another.principalInvestigator)
        && Objects.equals(condition, another.condition)
        && Objects.equals(note, another.note)
        && Objects.equals(category, another.category);
  }

  /**
   * Computes a hash code from attributes: {@code meta}, {@code extension}, {@code phase}, {@code period}, {@code focus}, {@code objective}, {@code id}, {@code text}, {@code identifier}, {@code partOf}, {@code contact}, {@code language}, {@code contained}, {@code arm}, {@code sponsor}, {@code keyword}, {@code primaryPurposeType}, {@code status}, {@code reasonStopped}, {@code protocol}, {@code title}, {@code modifierExtension}, {@code site}, {@code implicitRules}, {@code location}, {@code description}, {@code enrollment}, {@code resourceType}, {@code relatedArtifact}, {@code principalInvestigator}, {@code condition}, {@code note}, {@code category}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(meta);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(phase);
    h += (h << 5) + Objects.hashCode(period);
    h += (h << 5) + Objects.hashCode(focus);
    h += (h << 5) + Objects.hashCode(objective);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(text);
    h += (h << 5) + Objects.hashCode(identifier);
    h += (h << 5) + Objects.hashCode(partOf);
    h += (h << 5) + Objects.hashCode(contact);
    h += (h << 5) + Objects.hashCode(language);
    h += (h << 5) + Objects.hashCode(contained);
    h += (h << 5) + Objects.hashCode(arm);
    h += (h << 5) + Objects.hashCode(sponsor);
    h += (h << 5) + Objects.hashCode(keyword);
    h += (h << 5) + Objects.hashCode(primaryPurposeType);
    h += (h << 5) + Objects.hashCode(status);
    h += (h << 5) + Objects.hashCode(reasonStopped);
    h += (h << 5) + Objects.hashCode(protocol);
    h += (h << 5) + Objects.hashCode(title);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(site);
    h += (h << 5) + Objects.hashCode(implicitRules);
    h += (h << 5) + Objects.hashCode(location);
    h += (h << 5) + Objects.hashCode(description);
    h += (h << 5) + Objects.hashCode(enrollment);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + Objects.hashCode(relatedArtifact);
    h += (h << 5) + Objects.hashCode(principalInvestigator);
    h += (h << 5) + Objects.hashCode(condition);
    h += (h << 5) + Objects.hashCode(note);
    h += (h << 5) + Objects.hashCode(category);
    return h;
  }

  /**
   * Prints the immutable value {@code ResearchStudy} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("ResearchStudy{");
    if (meta != null) {
      builder.append("meta=").append(meta);
    }
    if (extension != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (phase != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("phase=").append(phase);
    }
    if (period != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("period=").append(period);
    }
    if (focus != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("focus=").append(focus);
    }
    if (objective != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("objective=").append(objective);
    }
    if (id != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (text != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("text=").append(text);
    }
    if (identifier != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (partOf != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("partOf=").append(partOf);
    }
    if (contact != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("contact=").append(contact);
    }
    if (language != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("language=").append(language);
    }
    if (contained != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (arm != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("arm=").append(arm);
    }
    if (sponsor != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("sponsor=").append(sponsor);
    }
    if (keyword != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("keyword=").append(keyword);
    }
    if (primaryPurposeType != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("primaryPurposeType=").append(primaryPurposeType);
    }
    if (status != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("status=").append(status);
    }
    if (reasonStopped != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("reasonStopped=").append(reasonStopped);
    }
    if (protocol != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("protocol=").append(protocol);
    }
    if (title != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("title=").append(title);
    }
    if (modifierExtension != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (site != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("site=").append(site);
    }
    if (implicitRules != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (location != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("location=").append(location);
    }
    if (description != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("description=").append(description);
    }
    if (enrollment != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("enrollment=").append(enrollment);
    }
    if (builder.length() > 14) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (relatedArtifact != null) {
      builder.append(", ");
      builder.append("relatedArtifact=").append(relatedArtifact);
    }
    if (principalInvestigator != null) {
      builder.append(", ");
      builder.append("principalInvestigator=").append(principalInvestigator);
    }
    if (condition != null) {
      builder.append(", ");
      builder.append("condition=").append(condition);
    }
    if (note != null) {
      builder.append(", ");
      builder.append("note=").append(note);
    }
    if (category != null) {
      builder.append(", ");
      builder.append("category=").append(category);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "ResearchStudy", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements ResearchStudy {
    @Nullable Optional<Meta> meta = Optional.empty();
    boolean metaIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<CodeableConcept> phase = Optional.empty();
    boolean phaseIsSet;
    @Nullable Optional<Period> period = Optional.empty();
    boolean periodIsSet;
    @Nullable Optional<List<CodeableConcept>> focus = Optional.empty();
    boolean focusIsSet;
    @Nullable Optional<List<ResearchStudy_Objective>> objective = Optional.empty();
    boolean objectiveIsSet;
    @Nullable Optional<Id> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<Narrative> text = Optional.empty();
    boolean textIsSet;
    @Nullable Optional<List<Identifier>> identifier = Optional.empty();
    boolean identifierIsSet;
    @Nullable Optional<List<Reference>> partOf = Optional.empty();
    boolean partOfIsSet;
    @Nullable Optional<List<ContactDetail>> contact = Optional.empty();
    boolean contactIsSet;
    @Nullable Optional<Code> language = Optional.empty();
    boolean languageIsSet;
    @Nullable Optional<List<ResourceList>> contained = Optional.empty();
    boolean containedIsSet;
    @Nullable Optional<List<ResearchStudy_Arm>> arm = Optional.empty();
    boolean armIsSet;
    @Nullable Optional<Reference> sponsor = Optional.empty();
    boolean sponsorIsSet;
    @Nullable Optional<List<CodeableConcept>> keyword = Optional.empty();
    boolean keywordIsSet;
    @Nullable Optional<CodeableConcept> primaryPurposeType = Optional.empty();
    boolean primaryPurposeTypeIsSet;
    @Nullable Optional<ResearchstudyStatus> status = Optional.empty();
    boolean statusIsSet;
    @Nullable Optional<CodeableConcept> reasonStopped = Optional.empty();
    boolean reasonStoppedIsSet;
    @Nullable Optional<List<Reference>> protocol = Optional.empty();
    boolean protocolIsSet;
    @Nullable Optional<String> title = Optional.empty();
    boolean titleIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<List<Reference>> site = Optional.empty();
    boolean siteIsSet;
    @Nullable Optional<Uri> implicitRules = Optional.empty();
    boolean implicitRulesIsSet;
    @Nullable Optional<List<CodeableConcept>> location = Optional.empty();
    boolean locationIsSet;
    @Nullable Optional<Markdown> description = Optional.empty();
    boolean descriptionIsSet;
    @Nullable Optional<List<Reference>> enrollment = Optional.empty();
    boolean enrollmentIsSet;
    @Nullable String resourceType;
    @Nullable Optional<List<RelatedArtifact>> relatedArtifact = Optional.empty();
    boolean relatedArtifactIsSet;
    @Nullable Optional<Reference> principalInvestigator = Optional.empty();
    boolean principalInvestigatorIsSet;
    @Nullable Optional<List<CodeableConcept>> condition = Optional.empty();
    boolean conditionIsSet;
    @Nullable Optional<List<Annotation>> note = Optional.empty();
    boolean noteIsSet;
    @Nullable Optional<List<CodeableConcept>> category = Optional.empty();
    boolean categoryIsSet;
    @JsonProperty("meta")
    public void setMeta(Optional<Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("phase")
    public void setPhase(Optional<CodeableConcept> phase) {
      this.phase = phase;
      this.phaseIsSet = true;
    }
    @JsonProperty("period")
    public void setPeriod(Optional<Period> period) {
      this.period = period;
      this.periodIsSet = true;
    }
    @JsonProperty("focus")
    public void setFocus(Optional<List<CodeableConcept>> focus) {
      this.focus = focus;
      this.focusIsSet = true;
    }
    @JsonProperty("objective")
    public void setObjective(Optional<List<ResearchStudy_Objective>> objective) {
      this.objective = objective;
      this.objectiveIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<Id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("text")
    public void setText(Optional<Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @JsonProperty("identifier")
    public void setIdentifier(Optional<List<Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @JsonProperty("partOf")
    public void setPartOf(Optional<List<Reference>> partOf) {
      this.partOf = partOf;
      this.partOfIsSet = true;
    }
    @JsonProperty("contact")
    public void setContact(Optional<List<ContactDetail>> contact) {
      this.contact = contact;
      this.contactIsSet = true;
    }
    @JsonProperty("language")
    public void setLanguage(Optional<Code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @JsonProperty("contained")
    public void setContained(Optional<List<ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @JsonProperty("arm")
    public void setArm(Optional<List<ResearchStudy_Arm>> arm) {
      this.arm = arm;
      this.armIsSet = true;
    }
    @JsonProperty("sponsor")
    public void setSponsor(Optional<Reference> sponsor) {
      this.sponsor = sponsor;
      this.sponsorIsSet = true;
    }
    @JsonProperty("keyword")
    public void setKeyword(Optional<List<CodeableConcept>> keyword) {
      this.keyword = keyword;
      this.keywordIsSet = true;
    }
    @JsonProperty("primaryPurposeType")
    public void setPrimaryPurposeType(Optional<CodeableConcept> primaryPurposeType) {
      this.primaryPurposeType = primaryPurposeType;
      this.primaryPurposeTypeIsSet = true;
    }
    @JsonProperty("status")
    public void setStatus(Optional<ResearchstudyStatus> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @JsonProperty("reasonStopped")
    public void setReasonStopped(Optional<CodeableConcept> reasonStopped) {
      this.reasonStopped = reasonStopped;
      this.reasonStoppedIsSet = true;
    }
    @JsonProperty("protocol")
    public void setProtocol(Optional<List<Reference>> protocol) {
      this.protocol = protocol;
      this.protocolIsSet = true;
    }
    @JsonProperty("title")
    public void setTitle(Optional<String> title) {
      this.title = title;
      this.titleIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("site")
    public void setSite(Optional<List<Reference>> site) {
      this.site = site;
      this.siteIsSet = true;
    }
    @JsonProperty("implicitRules")
    public void setImplicitRules(Optional<Uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @JsonProperty("location")
    public void setLocation(Optional<List<CodeableConcept>> location) {
      this.location = location;
      this.locationIsSet = true;
    }
    @JsonProperty("description")
    public void setDescription(Optional<Markdown> description) {
      this.description = description;
      this.descriptionIsSet = true;
    }
    @JsonProperty("enrollment")
    public void setEnrollment(Optional<List<Reference>> enrollment) {
      this.enrollment = enrollment;
      this.enrollmentIsSet = true;
    }
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
      this.resourceType = resourceType;
    }
    @JsonProperty("relatedArtifact")
    public void setRelatedArtifact(Optional<List<RelatedArtifact>> relatedArtifact) {
      this.relatedArtifact = relatedArtifact;
      this.relatedArtifactIsSet = true;
    }
    @JsonProperty("principalInvestigator")
    public void setPrincipalInvestigator(Optional<Reference> principalInvestigator) {
      this.principalInvestigator = principalInvestigator;
      this.principalInvestigatorIsSet = true;
    }
    @JsonProperty("condition")
    public void setCondition(Optional<List<CodeableConcept>> condition) {
      this.condition = condition;
      this.conditionIsSet = true;
    }
    @JsonProperty("note")
    public void setNote(Optional<List<Annotation>> note) {
      this.note = note;
      this.noteIsSet = true;
    }
    @JsonProperty("category")
    public void setCategory(Optional<List<CodeableConcept>> category) {
      this.category = category;
      this.categoryIsSet = true;
    }
    @Override
    public Optional<Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> phase() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Period> period() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> focus() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ResearchStudy_Objective>> objective() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> partOf() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ContactDetail>> contact() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> language() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ResearchStudy_Arm>> arm() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> sponsor() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> keyword() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> primaryPurposeType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<ResearchstudyStatus> status() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> reasonStopped() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> protocol() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> title() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> site() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> location() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Markdown> description() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> enrollment() { throw new UnsupportedOperationException(); }
    @Override
    public String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<RelatedArtifact>> relatedArtifact() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> principalInvestigator() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> condition() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Annotation>> note() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> category() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableResearchStudy fromJson(Json json) {
    ImmutableResearchStudy.Builder builder = ((ImmutableResearchStudy.Builder) ImmutableResearchStudy.builder());
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.phaseIsSet) {
      builder.phase(json.phase);
    }
    if (json.periodIsSet) {
      builder.period(json.period);
    }
    if (json.focusIsSet) {
      builder.focus(json.focus);
    }
    if (json.objectiveIsSet) {
      builder.objective(json.objective);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.partOfIsSet) {
      builder.partOf(json.partOf);
    }
    if (json.contactIsSet) {
      builder.contact(json.contact);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.armIsSet) {
      builder.arm(json.arm);
    }
    if (json.sponsorIsSet) {
      builder.sponsor(json.sponsor);
    }
    if (json.keywordIsSet) {
      builder.keyword(json.keyword);
    }
    if (json.primaryPurposeTypeIsSet) {
      builder.primaryPurposeType(json.primaryPurposeType);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.reasonStoppedIsSet) {
      builder.reasonStopped(json.reasonStopped);
    }
    if (json.protocolIsSet) {
      builder.protocol(json.protocol);
    }
    if (json.titleIsSet) {
      builder.title(json.title);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.siteIsSet) {
      builder.site(json.site);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.locationIsSet) {
      builder.location(json.location);
    }
    if (json.descriptionIsSet) {
      builder.description(json.description);
    }
    if (json.enrollmentIsSet) {
      builder.enrollment(json.enrollment);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.relatedArtifactIsSet) {
      builder.relatedArtifact(json.relatedArtifact);
    }
    if (json.principalInvestigatorIsSet) {
      builder.principalInvestigator(json.principalInvestigator);
    }
    if (json.conditionIsSet) {
      builder.condition(json.condition);
    }
    if (json.noteIsSet) {
      builder.note(json.note);
    }
    if (json.categoryIsSet) {
      builder.category(json.category);
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
        .meta(instance.meta())
        .extension(instance.extension())
        .phase(instance.phase())
        .period(instance.period())
        .focus(instance.focus())
        .objective(instance.objective())
        .id(instance.id())
        .text(instance.text())
        .identifier(instance.identifier())
        .partOf(instance.partOf())
        .contact(instance.contact())
        .language(instance.language())
        .contained(instance.contained())
        .arm(instance.arm())
        .sponsor(instance.sponsor())
        .keyword(instance.keyword())
        .primaryPurposeType(instance.primaryPurposeType())
        .status(instance.status())
        .reasonStopped(instance.reasonStopped())
        .protocol(instance.protocol())
        .title(instance.title())
        .modifierExtension(instance.modifierExtension())
        .site(instance.site())
        .implicitRules(instance.implicitRules())
        .location(instance.location())
        .description(instance.description())
        .enrollment(instance.enrollment())
        .resourceType(instance.resourceType())
        .relatedArtifact(instance.relatedArtifact())
        .principalInvestigator(instance.principalInvestigator())
        .condition(instance.condition())
        .note(instance.note())
        .category(instance.category())
        .build();
  }

  /**
   * Creates a builder for {@link ResearchStudy ResearchStudy}.
   * <pre>
   * ImmutableResearchStudy.builder()
   *    .meta(com.medplum.types.fhir.Meta) // optional {@link ResearchStudy#meta() meta}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link ResearchStudy#extension() extension}
   *    .phase(com.medplum.types.fhir.CodeableConcept) // optional {@link ResearchStudy#phase() phase}
   *    .period(com.medplum.types.fhir.Period) // optional {@link ResearchStudy#period() period}
   *    .focus(List&amp;lt;com.medplum.types.fhir.CodeableConcept&amp;gt;) // optional {@link ResearchStudy#focus() focus}
   *    .objective(List&amp;lt;com.medplum.types.fhir.ResearchStudy_Objective&amp;gt;) // optional {@link ResearchStudy#objective() objective}
   *    .id(com.medplum.types.fhir.Id) // optional {@link ResearchStudy#id() id}
   *    .text(com.medplum.types.fhir.Narrative) // optional {@link ResearchStudy#text() text}
   *    .identifier(List&amp;lt;com.medplum.types.fhir.Identifier&amp;gt;) // optional {@link ResearchStudy#identifier() identifier}
   *    .partOf(List&amp;lt;com.medplum.types.fhir.Reference&amp;gt;) // optional {@link ResearchStudy#partOf() partOf}
   *    .contact(List&amp;lt;com.medplum.types.fhir.ContactDetail&amp;gt;) // optional {@link ResearchStudy#contact() contact}
   *    .language(com.medplum.types.fhir.Code) // optional {@link ResearchStudy#language() language}
   *    .contained(List&amp;lt;com.medplum.types.fhir.ResourceList&amp;gt;) // optional {@link ResearchStudy#contained() contained}
   *    .arm(List&amp;lt;com.medplum.types.fhir.ResearchStudy_Arm&amp;gt;) // optional {@link ResearchStudy#arm() arm}
   *    .sponsor(com.medplum.types.fhir.Reference) // optional {@link ResearchStudy#sponsor() sponsor}
   *    .keyword(List&amp;lt;com.medplum.types.fhir.CodeableConcept&amp;gt;) // optional {@link ResearchStudy#keyword() keyword}
   *    .primaryPurposeType(com.medplum.types.fhir.CodeableConcept) // optional {@link ResearchStudy#primaryPurposeType() primaryPurposeType}
   *    .status(com.medplum.types.fhir.ResearchstudyStatus) // optional {@link ResearchStudy#status() status}
   *    .reasonStopped(com.medplum.types.fhir.CodeableConcept) // optional {@link ResearchStudy#reasonStopped() reasonStopped}
   *    .protocol(List&amp;lt;com.medplum.types.fhir.Reference&amp;gt;) // optional {@link ResearchStudy#protocol() protocol}
   *    .title(String) // optional {@link ResearchStudy#title() title}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link ResearchStudy#modifierExtension() modifierExtension}
   *    .site(List&amp;lt;com.medplum.types.fhir.Reference&amp;gt;) // optional {@link ResearchStudy#site() site}
   *    .implicitRules(com.medplum.types.fhir.Uri) // optional {@link ResearchStudy#implicitRules() implicitRules}
   *    .location(List&amp;lt;com.medplum.types.fhir.CodeableConcept&amp;gt;) // optional {@link ResearchStudy#location() location}
   *    .description(com.medplum.types.fhir.Markdown) // optional {@link ResearchStudy#description() description}
   *    .enrollment(List&amp;lt;com.medplum.types.fhir.Reference&amp;gt;) // optional {@link ResearchStudy#enrollment() enrollment}
   *    .resourceType(String) // required {@link ResearchStudy#resourceType() resourceType}
   *    .relatedArtifact(List&amp;lt;com.medplum.types.fhir.RelatedArtifact&amp;gt;) // optional {@link ResearchStudy#relatedArtifact() relatedArtifact}
   *    .principalInvestigator(com.medplum.types.fhir.Reference) // optional {@link ResearchStudy#principalInvestigator() principalInvestigator}
   *    .condition(List&amp;lt;com.medplum.types.fhir.CodeableConcept&amp;gt;) // optional {@link ResearchStudy#condition() condition}
   *    .note(List&amp;lt;com.medplum.types.fhir.Annotation&amp;gt;) // optional {@link ResearchStudy#note() note}
   *    .category(List&amp;lt;com.medplum.types.fhir.CodeableConcept&amp;gt;) // optional {@link ResearchStudy#category() category}
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
  @Generated(from = "ResearchStudy", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long OPT_BIT_META = 0x1L;
    private static final long OPT_BIT_EXTENSION = 0x2L;
    private static final long OPT_BIT_PHASE = 0x4L;
    private static final long OPT_BIT_PERIOD = 0x8L;
    private static final long OPT_BIT_FOCUS = 0x10L;
    private static final long OPT_BIT_OBJECTIVE = 0x20L;
    private static final long OPT_BIT_ID = 0x40L;
    private static final long OPT_BIT_TEXT = 0x80L;
    private static final long OPT_BIT_IDENTIFIER = 0x100L;
    private static final long OPT_BIT_PART_OF = 0x200L;
    private static final long OPT_BIT_CONTACT = 0x400L;
    private static final long OPT_BIT_LANGUAGE = 0x800L;
    private static final long OPT_BIT_CONTAINED = 0x1000L;
    private static final long OPT_BIT_ARM = 0x2000L;
    private static final long OPT_BIT_SPONSOR = 0x4000L;
    private static final long OPT_BIT_KEYWORD = 0x8000L;
    private static final long OPT_BIT_PRIMARY_PURPOSE_TYPE = 0x10000L;
    private static final long OPT_BIT_STATUS = 0x20000L;
    private static final long OPT_BIT_REASON_STOPPED = 0x40000L;
    private static final long OPT_BIT_PROTOCOL = 0x80000L;
    private static final long OPT_BIT_TITLE = 0x100000L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x200000L;
    private static final long OPT_BIT_SITE = 0x400000L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x800000L;
    private static final long OPT_BIT_LOCATION = 0x1000000L;
    private static final long OPT_BIT_DESCRIPTION = 0x2000000L;
    private static final long OPT_BIT_ENROLLMENT = 0x4000000L;
    private static final long OPT_BIT_RELATED_ARTIFACT = 0x8000000L;
    private static final long OPT_BIT_PRINCIPAL_INVESTIGATOR = 0x10000000L;
    private static final long OPT_BIT_CONDITION = 0x20000000L;
    private static final long OPT_BIT_NOTE = 0x40000000L;
    private static final long OPT_BIT_CATEGORY = 0x80000000L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable Meta meta;
    private @Nullable List<Extension> extension;
    private @Nullable CodeableConcept phase;
    private @Nullable Period period;
    private @Nullable List<CodeableConcept> focus;
    private @Nullable List<ResearchStudy_Objective> objective;
    private @Nullable Id id;
    private @Nullable Narrative text;
    private @Nullable List<Identifier> identifier;
    private @Nullable List<Reference> partOf;
    private @Nullable List<ContactDetail> contact;
    private @Nullable Code language;
    private @Nullable List<ResourceList> contained;
    private @Nullable List<ResearchStudy_Arm> arm;
    private @Nullable Reference sponsor;
    private @Nullable List<CodeableConcept> keyword;
    private @Nullable CodeableConcept primaryPurposeType;
    private @Nullable ResearchstudyStatus status;
    private @Nullable CodeableConcept reasonStopped;
    private @Nullable List<Reference> protocol;
    private @Nullable String title;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable List<Reference> site;
    private @Nullable Uri implicitRules;
    private @Nullable List<CodeableConcept> location;
    private @Nullable Markdown description;
    private @Nullable List<Reference> enrollment;
    private @Nullable String resourceType;
    private @Nullable List<RelatedArtifact> relatedArtifact;
    private @Nullable Reference principalInvestigator;
    private @Nullable List<CodeableConcept> condition;
    private @Nullable List<Annotation> note;
    private @Nullable List<CodeableConcept> category;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link ResearchStudy#meta() meta} to meta.
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
     * Initializes the optional value {@link ResearchStudy#meta() meta} to meta.
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
     * Initializes the optional value {@link ResearchStudy#extension() extension} to extension.
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
     * Initializes the optional value {@link ResearchStudy#extension() extension} to extension.
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
     * Initializes the optional value {@link ResearchStudy#phase() phase} to phase.
     * @param phase The value for phase
     * @return {@code this} builder for chained invocation
     */
    public final Builder phase(CodeableConcept phase) {
      checkNotIsSet(phaseIsSet(), "phase");
      this.phase = Objects.requireNonNull(phase, "phase");
      optBits |= OPT_BIT_PHASE;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchStudy#phase() phase} to phase.
     * @param phase The value for phase
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("phase")
    public final Builder phase(Optional<? extends CodeableConcept> phase) {
      checkNotIsSet(phaseIsSet(), "phase");
      this.phase = phase.orElse(null);
      optBits |= OPT_BIT_PHASE;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchStudy#period() period} to period.
     * @param period The value for period
     * @return {@code this} builder for chained invocation
     */
    public final Builder period(Period period) {
      checkNotIsSet(periodIsSet(), "period");
      this.period = Objects.requireNonNull(period, "period");
      optBits |= OPT_BIT_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchStudy#period() period} to period.
     * @param period The value for period
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("period")
    public final Builder period(Optional<? extends Period> period) {
      checkNotIsSet(periodIsSet(), "period");
      this.period = period.orElse(null);
      optBits |= OPT_BIT_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchStudy#focus() focus} to focus.
     * @param focus The value for focus
     * @return {@code this} builder for chained invocation
     */
    public final Builder focus(List<CodeableConcept> focus) {
      checkNotIsSet(focusIsSet(), "focus");
      this.focus = Objects.requireNonNull(focus, "focus");
      optBits |= OPT_BIT_FOCUS;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchStudy#focus() focus} to focus.
     * @param focus The value for focus
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("focus")
    public final Builder focus(Optional<? extends List<CodeableConcept>> focus) {
      checkNotIsSet(focusIsSet(), "focus");
      this.focus = focus.orElse(null);
      optBits |= OPT_BIT_FOCUS;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchStudy#objective() objective} to objective.
     * @param objective The value for objective
     * @return {@code this} builder for chained invocation
     */
    public final Builder objective(List<ResearchStudy_Objective> objective) {
      checkNotIsSet(objectiveIsSet(), "objective");
      this.objective = Objects.requireNonNull(objective, "objective");
      optBits |= OPT_BIT_OBJECTIVE;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchStudy#objective() objective} to objective.
     * @param objective The value for objective
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("objective")
    public final Builder objective(Optional<? extends List<ResearchStudy_Objective>> objective) {
      checkNotIsSet(objectiveIsSet(), "objective");
      this.objective = objective.orElse(null);
      optBits |= OPT_BIT_OBJECTIVE;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchStudy#id() id} to id.
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
     * Initializes the optional value {@link ResearchStudy#id() id} to id.
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
     * Initializes the optional value {@link ResearchStudy#text() text} to text.
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
     * Initializes the optional value {@link ResearchStudy#text() text} to text.
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
     * Initializes the optional value {@link ResearchStudy#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    public final Builder identifier(List<Identifier> identifier) {
      checkNotIsSet(identifierIsSet(), "identifier");
      this.identifier = Objects.requireNonNull(identifier, "identifier");
      optBits |= OPT_BIT_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchStudy#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("identifier")
    public final Builder identifier(Optional<? extends List<Identifier>> identifier) {
      checkNotIsSet(identifierIsSet(), "identifier");
      this.identifier = identifier.orElse(null);
      optBits |= OPT_BIT_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchStudy#partOf() partOf} to partOf.
     * @param partOf The value for partOf
     * @return {@code this} builder for chained invocation
     */
    public final Builder partOf(List<Reference> partOf) {
      checkNotIsSet(partOfIsSet(), "partOf");
      this.partOf = Objects.requireNonNull(partOf, "partOf");
      optBits |= OPT_BIT_PART_OF;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchStudy#partOf() partOf} to partOf.
     * @param partOf The value for partOf
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("partOf")
    public final Builder partOf(Optional<? extends List<Reference>> partOf) {
      checkNotIsSet(partOfIsSet(), "partOf");
      this.partOf = partOf.orElse(null);
      optBits |= OPT_BIT_PART_OF;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchStudy#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for chained invocation
     */
    public final Builder contact(List<ContactDetail> contact) {
      checkNotIsSet(contactIsSet(), "contact");
      this.contact = Objects.requireNonNull(contact, "contact");
      optBits |= OPT_BIT_CONTACT;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchStudy#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("contact")
    public final Builder contact(Optional<? extends List<ContactDetail>> contact) {
      checkNotIsSet(contactIsSet(), "contact");
      this.contact = contact.orElse(null);
      optBits |= OPT_BIT_CONTACT;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchStudy#language() language} to language.
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
     * Initializes the optional value {@link ResearchStudy#language() language} to language.
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
     * Initializes the optional value {@link ResearchStudy#contained() contained} to contained.
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
     * Initializes the optional value {@link ResearchStudy#contained() contained} to contained.
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
     * Initializes the optional value {@link ResearchStudy#arm() arm} to arm.
     * @param arm The value for arm
     * @return {@code this} builder for chained invocation
     */
    public final Builder arm(List<ResearchStudy_Arm> arm) {
      checkNotIsSet(armIsSet(), "arm");
      this.arm = Objects.requireNonNull(arm, "arm");
      optBits |= OPT_BIT_ARM;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchStudy#arm() arm} to arm.
     * @param arm The value for arm
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("arm")
    public final Builder arm(Optional<? extends List<ResearchStudy_Arm>> arm) {
      checkNotIsSet(armIsSet(), "arm");
      this.arm = arm.orElse(null);
      optBits |= OPT_BIT_ARM;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchStudy#sponsor() sponsor} to sponsor.
     * @param sponsor The value for sponsor
     * @return {@code this} builder for chained invocation
     */
    public final Builder sponsor(Reference sponsor) {
      checkNotIsSet(sponsorIsSet(), "sponsor");
      this.sponsor = Objects.requireNonNull(sponsor, "sponsor");
      optBits |= OPT_BIT_SPONSOR;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchStudy#sponsor() sponsor} to sponsor.
     * @param sponsor The value for sponsor
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("sponsor")
    public final Builder sponsor(Optional<? extends Reference> sponsor) {
      checkNotIsSet(sponsorIsSet(), "sponsor");
      this.sponsor = sponsor.orElse(null);
      optBits |= OPT_BIT_SPONSOR;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchStudy#keyword() keyword} to keyword.
     * @param keyword The value for keyword
     * @return {@code this} builder for chained invocation
     */
    public final Builder keyword(List<CodeableConcept> keyword) {
      checkNotIsSet(keywordIsSet(), "keyword");
      this.keyword = Objects.requireNonNull(keyword, "keyword");
      optBits |= OPT_BIT_KEYWORD;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchStudy#keyword() keyword} to keyword.
     * @param keyword The value for keyword
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("keyword")
    public final Builder keyword(Optional<? extends List<CodeableConcept>> keyword) {
      checkNotIsSet(keywordIsSet(), "keyword");
      this.keyword = keyword.orElse(null);
      optBits |= OPT_BIT_KEYWORD;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchStudy#primaryPurposeType() primaryPurposeType} to primaryPurposeType.
     * @param primaryPurposeType The value for primaryPurposeType
     * @return {@code this} builder for chained invocation
     */
    public final Builder primaryPurposeType(CodeableConcept primaryPurposeType) {
      checkNotIsSet(primaryPurposeTypeIsSet(), "primaryPurposeType");
      this.primaryPurposeType = Objects.requireNonNull(primaryPurposeType, "primaryPurposeType");
      optBits |= OPT_BIT_PRIMARY_PURPOSE_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchStudy#primaryPurposeType() primaryPurposeType} to primaryPurposeType.
     * @param primaryPurposeType The value for primaryPurposeType
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("primaryPurposeType")
    public final Builder primaryPurposeType(Optional<? extends CodeableConcept> primaryPurposeType) {
      checkNotIsSet(primaryPurposeTypeIsSet(), "primaryPurposeType");
      this.primaryPurposeType = primaryPurposeType.orElse(null);
      optBits |= OPT_BIT_PRIMARY_PURPOSE_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchStudy#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(ResearchstudyStatus status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchStudy#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("status")
    public final Builder status(Optional<? extends ResearchstudyStatus> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchStudy#reasonStopped() reasonStopped} to reasonStopped.
     * @param reasonStopped The value for reasonStopped
     * @return {@code this} builder for chained invocation
     */
    public final Builder reasonStopped(CodeableConcept reasonStopped) {
      checkNotIsSet(reasonStoppedIsSet(), "reasonStopped");
      this.reasonStopped = Objects.requireNonNull(reasonStopped, "reasonStopped");
      optBits |= OPT_BIT_REASON_STOPPED;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchStudy#reasonStopped() reasonStopped} to reasonStopped.
     * @param reasonStopped The value for reasonStopped
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("reasonStopped")
    public final Builder reasonStopped(Optional<? extends CodeableConcept> reasonStopped) {
      checkNotIsSet(reasonStoppedIsSet(), "reasonStopped");
      this.reasonStopped = reasonStopped.orElse(null);
      optBits |= OPT_BIT_REASON_STOPPED;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchStudy#protocol() protocol} to protocol.
     * @param protocol The value for protocol
     * @return {@code this} builder for chained invocation
     */
    public final Builder protocol(List<Reference> protocol) {
      checkNotIsSet(protocolIsSet(), "protocol");
      this.protocol = Objects.requireNonNull(protocol, "protocol");
      optBits |= OPT_BIT_PROTOCOL;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchStudy#protocol() protocol} to protocol.
     * @param protocol The value for protocol
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("protocol")
    public final Builder protocol(Optional<? extends List<Reference>> protocol) {
      checkNotIsSet(protocolIsSet(), "protocol");
      this.protocol = protocol.orElse(null);
      optBits |= OPT_BIT_PROTOCOL;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchStudy#title() title} to title.
     * @param title The value for title
     * @return {@code this} builder for chained invocation
     */
    public final Builder title(String title) {
      checkNotIsSet(titleIsSet(), "title");
      this.title = Objects.requireNonNull(title, "title");
      optBits |= OPT_BIT_TITLE;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchStudy#title() title} to title.
     * @param title The value for title
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("title")
    public final Builder title(Optional<String> title) {
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
    public final Builder modifierExtension(List<Extension> modifierExtension) {
      checkNotIsSet(modifierExtensionIsSet(), "modifierExtension");
      this.modifierExtension = Objects.requireNonNull(modifierExtension, "modifierExtension");
      optBits |= OPT_BIT_MODIFIER_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchStudy#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ResearchStudy#site() site} to site.
     * @param site The value for site
     * @return {@code this} builder for chained invocation
     */
    public final Builder site(List<Reference> site) {
      checkNotIsSet(siteIsSet(), "site");
      this.site = Objects.requireNonNull(site, "site");
      optBits |= OPT_BIT_SITE;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchStudy#site() site} to site.
     * @param site The value for site
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("site")
    public final Builder site(Optional<? extends List<Reference>> site) {
      checkNotIsSet(siteIsSet(), "site");
      this.site = site.orElse(null);
      optBits |= OPT_BIT_SITE;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchStudy#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link ResearchStudy#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link ResearchStudy#location() location} to location.
     * @param location The value for location
     * @return {@code this} builder for chained invocation
     */
    public final Builder location(List<CodeableConcept> location) {
      checkNotIsSet(locationIsSet(), "location");
      this.location = Objects.requireNonNull(location, "location");
      optBits |= OPT_BIT_LOCATION;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchStudy#location() location} to location.
     * @param location The value for location
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("location")
    public final Builder location(Optional<? extends List<CodeableConcept>> location) {
      checkNotIsSet(locationIsSet(), "location");
      this.location = location.orElse(null);
      optBits |= OPT_BIT_LOCATION;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchStudy#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for chained invocation
     */
    public final Builder description(Markdown description) {
      checkNotIsSet(descriptionIsSet(), "description");
      this.description = Objects.requireNonNull(description, "description");
      optBits |= OPT_BIT_DESCRIPTION;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchStudy#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("description")
    public final Builder description(Optional<? extends Markdown> description) {
      checkNotIsSet(descriptionIsSet(), "description");
      this.description = description.orElse(null);
      optBits |= OPT_BIT_DESCRIPTION;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchStudy#enrollment() enrollment} to enrollment.
     * @param enrollment The value for enrollment
     * @return {@code this} builder for chained invocation
     */
    public final Builder enrollment(List<Reference> enrollment) {
      checkNotIsSet(enrollmentIsSet(), "enrollment");
      this.enrollment = Objects.requireNonNull(enrollment, "enrollment");
      optBits |= OPT_BIT_ENROLLMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchStudy#enrollment() enrollment} to enrollment.
     * @param enrollment The value for enrollment
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("enrollment")
    public final Builder enrollment(Optional<? extends List<Reference>> enrollment) {
      checkNotIsSet(enrollmentIsSet(), "enrollment");
      this.enrollment = enrollment.orElse(null);
      optBits |= OPT_BIT_ENROLLMENT;
      return this;
    }

    /**
     * Initializes the value for the {@link ResearchStudy#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link ResearchStudy#relatedArtifact() relatedArtifact} to relatedArtifact.
     * @param relatedArtifact The value for relatedArtifact
     * @return {@code this} builder for chained invocation
     */
    public final Builder relatedArtifact(List<RelatedArtifact> relatedArtifact) {
      checkNotIsSet(relatedArtifactIsSet(), "relatedArtifact");
      this.relatedArtifact = Objects.requireNonNull(relatedArtifact, "relatedArtifact");
      optBits |= OPT_BIT_RELATED_ARTIFACT;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchStudy#relatedArtifact() relatedArtifact} to relatedArtifact.
     * @param relatedArtifact The value for relatedArtifact
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("relatedArtifact")
    public final Builder relatedArtifact(Optional<? extends List<RelatedArtifact>> relatedArtifact) {
      checkNotIsSet(relatedArtifactIsSet(), "relatedArtifact");
      this.relatedArtifact = relatedArtifact.orElse(null);
      optBits |= OPT_BIT_RELATED_ARTIFACT;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchStudy#principalInvestigator() principalInvestigator} to principalInvestigator.
     * @param principalInvestigator The value for principalInvestigator
     * @return {@code this} builder for chained invocation
     */
    public final Builder principalInvestigator(Reference principalInvestigator) {
      checkNotIsSet(principalInvestigatorIsSet(), "principalInvestigator");
      this.principalInvestigator = Objects.requireNonNull(principalInvestigator, "principalInvestigator");
      optBits |= OPT_BIT_PRINCIPAL_INVESTIGATOR;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchStudy#principalInvestigator() principalInvestigator} to principalInvestigator.
     * @param principalInvestigator The value for principalInvestigator
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("principalInvestigator")
    public final Builder principalInvestigator(Optional<? extends Reference> principalInvestigator) {
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
    public final Builder condition(List<CodeableConcept> condition) {
      checkNotIsSet(conditionIsSet(), "condition");
      this.condition = Objects.requireNonNull(condition, "condition");
      optBits |= OPT_BIT_CONDITION;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchStudy#condition() condition} to condition.
     * @param condition The value for condition
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("condition")
    public final Builder condition(Optional<? extends List<CodeableConcept>> condition) {
      checkNotIsSet(conditionIsSet(), "condition");
      this.condition = condition.orElse(null);
      optBits |= OPT_BIT_CONDITION;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchStudy#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for chained invocation
     */
    public final Builder note(List<Annotation> note) {
      checkNotIsSet(noteIsSet(), "note");
      this.note = Objects.requireNonNull(note, "note");
      optBits |= OPT_BIT_NOTE;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchStudy#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("note")
    public final Builder note(Optional<? extends List<Annotation>> note) {
      checkNotIsSet(noteIsSet(), "note");
      this.note = note.orElse(null);
      optBits |= OPT_BIT_NOTE;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchStudy#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for chained invocation
     */
    public final Builder category(List<CodeableConcept> category) {
      checkNotIsSet(categoryIsSet(), "category");
      this.category = Objects.requireNonNull(category, "category");
      optBits |= OPT_BIT_CATEGORY;
      return this;
    }

    /**
     * Initializes the optional value {@link ResearchStudy#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("category")
    public final Builder category(Optional<? extends List<CodeableConcept>> category) {
      checkNotIsSet(categoryIsSet(), "category");
      this.category = category.orElse(null);
      optBits |= OPT_BIT_CATEGORY;
      return this;
    }

    /**
     * Builds a new {@link ResearchStudy ResearchStudy}.
     * @return An immutable instance of ResearchStudy
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ResearchStudy build() {
      checkRequiredAttributes();
      return new ImmutableResearchStudy(
          meta,
          extension,
          phase,
          period,
          focus,
          objective,
          id,
          text,
          identifier,
          partOf,
          contact,
          language,
          contained,
          arm,
          sponsor,
          keyword,
          primaryPurposeType,
          status,
          reasonStopped,
          protocol,
          title,
          modifierExtension,
          site,
          implicitRules,
          location,
          description,
          enrollment,
          resourceType,
          relatedArtifact,
          principalInvestigator,
          condition,
          note,
          category);
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean phaseIsSet() {
      return (optBits & OPT_BIT_PHASE) != 0;
    }

    private boolean periodIsSet() {
      return (optBits & OPT_BIT_PERIOD) != 0;
    }

    private boolean focusIsSet() {
      return (optBits & OPT_BIT_FOCUS) != 0;
    }

    private boolean objectiveIsSet() {
      return (optBits & OPT_BIT_OBJECTIVE) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean partOfIsSet() {
      return (optBits & OPT_BIT_PART_OF) != 0;
    }

    private boolean contactIsSet() {
      return (optBits & OPT_BIT_CONTACT) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean armIsSet() {
      return (optBits & OPT_BIT_ARM) != 0;
    }

    private boolean sponsorIsSet() {
      return (optBits & OPT_BIT_SPONSOR) != 0;
    }

    private boolean keywordIsSet() {
      return (optBits & OPT_BIT_KEYWORD) != 0;
    }

    private boolean primaryPurposeTypeIsSet() {
      return (optBits & OPT_BIT_PRIMARY_PURPOSE_TYPE) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean reasonStoppedIsSet() {
      return (optBits & OPT_BIT_REASON_STOPPED) != 0;
    }

    private boolean protocolIsSet() {
      return (optBits & OPT_BIT_PROTOCOL) != 0;
    }

    private boolean titleIsSet() {
      return (optBits & OPT_BIT_TITLE) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean siteIsSet() {
      return (optBits & OPT_BIT_SITE) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean locationIsSet() {
      return (optBits & OPT_BIT_LOCATION) != 0;
    }

    private boolean descriptionIsSet() {
      return (optBits & OPT_BIT_DESCRIPTION) != 0;
    }

    private boolean enrollmentIsSet() {
      return (optBits & OPT_BIT_ENROLLMENT) != 0;
    }

    private boolean relatedArtifactIsSet() {
      return (optBits & OPT_BIT_RELATED_ARTIFACT) != 0;
    }

    private boolean principalInvestigatorIsSet() {
      return (optBits & OPT_BIT_PRINCIPAL_INVESTIGATOR) != 0;
    }

    private boolean conditionIsSet() {
      return (optBits & OPT_BIT_CONDITION) != 0;
    }

    private boolean noteIsSet() {
      return (optBits & OPT_BIT_NOTE) != 0;
    }

    private boolean categoryIsSet() {
      return (optBits & OPT_BIT_CATEGORY) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of ResearchStudy is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build ResearchStudy, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "ResearchStudy", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link ResearchStudy#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(String resourceType);
  }

  @Generated(from = "ResearchStudy", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link ResearchStudy#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(Meta meta);

    /**
     * Initializes the optional value {@link ResearchStudy#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(Optional<? extends Meta> meta);

    /**
     * Initializes the optional value {@link ResearchStudy#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link ResearchStudy#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link ResearchStudy#phase() phase} to phase.
     * @param phase The value for phase
     * @return {@code this} builder for chained invocation
     */
    BuildFinal phase(CodeableConcept phase);

    /**
     * Initializes the optional value {@link ResearchStudy#phase() phase} to phase.
     * @param phase The value for phase
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal phase(Optional<? extends CodeableConcept> phase);

    /**
     * Initializes the optional value {@link ResearchStudy#period() period} to period.
     * @param period The value for period
     * @return {@code this} builder for chained invocation
     */
    BuildFinal period(Period period);

    /**
     * Initializes the optional value {@link ResearchStudy#period() period} to period.
     * @param period The value for period
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal period(Optional<? extends Period> period);

    /**
     * Initializes the optional value {@link ResearchStudy#focus() focus} to focus.
     * @param focus The value for focus
     * @return {@code this} builder for chained invocation
     */
    BuildFinal focus(List<CodeableConcept> focus);

    /**
     * Initializes the optional value {@link ResearchStudy#focus() focus} to focus.
     * @param focus The value for focus
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal focus(Optional<? extends List<CodeableConcept>> focus);

    /**
     * Initializes the optional value {@link ResearchStudy#objective() objective} to objective.
     * @param objective The value for objective
     * @return {@code this} builder for chained invocation
     */
    BuildFinal objective(List<ResearchStudy_Objective> objective);

    /**
     * Initializes the optional value {@link ResearchStudy#objective() objective} to objective.
     * @param objective The value for objective
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal objective(Optional<? extends List<ResearchStudy_Objective>> objective);

    /**
     * Initializes the optional value {@link ResearchStudy#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(Id id);

    /**
     * Initializes the optional value {@link ResearchStudy#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<? extends Id> id);

    /**
     * Initializes the optional value {@link ResearchStudy#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(Narrative text);

    /**
     * Initializes the optional value {@link ResearchStudy#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(Optional<? extends Narrative> text);

    /**
     * Initializes the optional value {@link ResearchStudy#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(List<Identifier> identifier);

    /**
     * Initializes the optional value {@link ResearchStudy#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(Optional<? extends List<Identifier>> identifier);

    /**
     * Initializes the optional value {@link ResearchStudy#partOf() partOf} to partOf.
     * @param partOf The value for partOf
     * @return {@code this} builder for chained invocation
     */
    BuildFinal partOf(List<Reference> partOf);

    /**
     * Initializes the optional value {@link ResearchStudy#partOf() partOf} to partOf.
     * @param partOf The value for partOf
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal partOf(Optional<? extends List<Reference>> partOf);

    /**
     * Initializes the optional value {@link ResearchStudy#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contact(List<ContactDetail> contact);

    /**
     * Initializes the optional value {@link ResearchStudy#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contact(Optional<? extends List<ContactDetail>> contact);

    /**
     * Initializes the optional value {@link ResearchStudy#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(Code language);

    /**
     * Initializes the optional value {@link ResearchStudy#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(Optional<? extends Code> language);

    /**
     * Initializes the optional value {@link ResearchStudy#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(List<ResourceList> contained);

    /**
     * Initializes the optional value {@link ResearchStudy#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(Optional<? extends List<ResourceList>> contained);

    /**
     * Initializes the optional value {@link ResearchStudy#arm() arm} to arm.
     * @param arm The value for arm
     * @return {@code this} builder for chained invocation
     */
    BuildFinal arm(List<ResearchStudy_Arm> arm);

    /**
     * Initializes the optional value {@link ResearchStudy#arm() arm} to arm.
     * @param arm The value for arm
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal arm(Optional<? extends List<ResearchStudy_Arm>> arm);

    /**
     * Initializes the optional value {@link ResearchStudy#sponsor() sponsor} to sponsor.
     * @param sponsor The value for sponsor
     * @return {@code this} builder for chained invocation
     */
    BuildFinal sponsor(Reference sponsor);

    /**
     * Initializes the optional value {@link ResearchStudy#sponsor() sponsor} to sponsor.
     * @param sponsor The value for sponsor
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal sponsor(Optional<? extends Reference> sponsor);

    /**
     * Initializes the optional value {@link ResearchStudy#keyword() keyword} to keyword.
     * @param keyword The value for keyword
     * @return {@code this} builder for chained invocation
     */
    BuildFinal keyword(List<CodeableConcept> keyword);

    /**
     * Initializes the optional value {@link ResearchStudy#keyword() keyword} to keyword.
     * @param keyword The value for keyword
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal keyword(Optional<? extends List<CodeableConcept>> keyword);

    /**
     * Initializes the optional value {@link ResearchStudy#primaryPurposeType() primaryPurposeType} to primaryPurposeType.
     * @param primaryPurposeType The value for primaryPurposeType
     * @return {@code this} builder for chained invocation
     */
    BuildFinal primaryPurposeType(CodeableConcept primaryPurposeType);

    /**
     * Initializes the optional value {@link ResearchStudy#primaryPurposeType() primaryPurposeType} to primaryPurposeType.
     * @param primaryPurposeType The value for primaryPurposeType
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal primaryPurposeType(Optional<? extends CodeableConcept> primaryPurposeType);

    /**
     * Initializes the optional value {@link ResearchStudy#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(ResearchstudyStatus status);

    /**
     * Initializes the optional value {@link ResearchStudy#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(Optional<? extends ResearchstudyStatus> status);

    /**
     * Initializes the optional value {@link ResearchStudy#reasonStopped() reasonStopped} to reasonStopped.
     * @param reasonStopped The value for reasonStopped
     * @return {@code this} builder for chained invocation
     */
    BuildFinal reasonStopped(CodeableConcept reasonStopped);

    /**
     * Initializes the optional value {@link ResearchStudy#reasonStopped() reasonStopped} to reasonStopped.
     * @param reasonStopped The value for reasonStopped
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal reasonStopped(Optional<? extends CodeableConcept> reasonStopped);

    /**
     * Initializes the optional value {@link ResearchStudy#protocol() protocol} to protocol.
     * @param protocol The value for protocol
     * @return {@code this} builder for chained invocation
     */
    BuildFinal protocol(List<Reference> protocol);

    /**
     * Initializes the optional value {@link ResearchStudy#protocol() protocol} to protocol.
     * @param protocol The value for protocol
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal protocol(Optional<? extends List<Reference>> protocol);

    /**
     * Initializes the optional value {@link ResearchStudy#title() title} to title.
     * @param title The value for title
     * @return {@code this} builder for chained invocation
     */
    BuildFinal title(String title);

    /**
     * Initializes the optional value {@link ResearchStudy#title() title} to title.
     * @param title The value for title
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal title(Optional<String> title);

    /**
     * Initializes the optional value {@link ResearchStudy#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link ResearchStudy#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link ResearchStudy#site() site} to site.
     * @param site The value for site
     * @return {@code this} builder for chained invocation
     */
    BuildFinal site(List<Reference> site);

    /**
     * Initializes the optional value {@link ResearchStudy#site() site} to site.
     * @param site The value for site
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal site(Optional<? extends List<Reference>> site);

    /**
     * Initializes the optional value {@link ResearchStudy#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(Uri implicitRules);

    /**
     * Initializes the optional value {@link ResearchStudy#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(Optional<? extends Uri> implicitRules);

    /**
     * Initializes the optional value {@link ResearchStudy#location() location} to location.
     * @param location The value for location
     * @return {@code this} builder for chained invocation
     */
    BuildFinal location(List<CodeableConcept> location);

    /**
     * Initializes the optional value {@link ResearchStudy#location() location} to location.
     * @param location The value for location
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal location(Optional<? extends List<CodeableConcept>> location);

    /**
     * Initializes the optional value {@link ResearchStudy#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for chained invocation
     */
    BuildFinal description(Markdown description);

    /**
     * Initializes the optional value {@link ResearchStudy#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal description(Optional<? extends Markdown> description);

    /**
     * Initializes the optional value {@link ResearchStudy#enrollment() enrollment} to enrollment.
     * @param enrollment The value for enrollment
     * @return {@code this} builder for chained invocation
     */
    BuildFinal enrollment(List<Reference> enrollment);

    /**
     * Initializes the optional value {@link ResearchStudy#enrollment() enrollment} to enrollment.
     * @param enrollment The value for enrollment
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal enrollment(Optional<? extends List<Reference>> enrollment);

    /**
     * Initializes the optional value {@link ResearchStudy#relatedArtifact() relatedArtifact} to relatedArtifact.
     * @param relatedArtifact The value for relatedArtifact
     * @return {@code this} builder for chained invocation
     */
    BuildFinal relatedArtifact(List<RelatedArtifact> relatedArtifact);

    /**
     * Initializes the optional value {@link ResearchStudy#relatedArtifact() relatedArtifact} to relatedArtifact.
     * @param relatedArtifact The value for relatedArtifact
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal relatedArtifact(Optional<? extends List<RelatedArtifact>> relatedArtifact);

    /**
     * Initializes the optional value {@link ResearchStudy#principalInvestigator() principalInvestigator} to principalInvestigator.
     * @param principalInvestigator The value for principalInvestigator
     * @return {@code this} builder for chained invocation
     */
    BuildFinal principalInvestigator(Reference principalInvestigator);

    /**
     * Initializes the optional value {@link ResearchStudy#principalInvestigator() principalInvestigator} to principalInvestigator.
     * @param principalInvestigator The value for principalInvestigator
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal principalInvestigator(Optional<? extends Reference> principalInvestigator);

    /**
     * Initializes the optional value {@link ResearchStudy#condition() condition} to condition.
     * @param condition The value for condition
     * @return {@code this} builder for chained invocation
     */
    BuildFinal condition(List<CodeableConcept> condition);

    /**
     * Initializes the optional value {@link ResearchStudy#condition() condition} to condition.
     * @param condition The value for condition
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal condition(Optional<? extends List<CodeableConcept>> condition);

    /**
     * Initializes the optional value {@link ResearchStudy#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for chained invocation
     */
    BuildFinal note(List<Annotation> note);

    /**
     * Initializes the optional value {@link ResearchStudy#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal note(Optional<? extends List<Annotation>> note);

    /**
     * Initializes the optional value {@link ResearchStudy#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for chained invocation
     */
    BuildFinal category(List<CodeableConcept> category);

    /**
     * Initializes the optional value {@link ResearchStudy#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal category(Optional<? extends List<CodeableConcept>> category);

    /**
     * Builds a new {@link ResearchStudy ResearchStudy}.
     * @return An immutable instance of ResearchStudy
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    ResearchStudy build();
  }
}
