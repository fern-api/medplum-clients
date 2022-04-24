//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link CarePlan}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableCarePlan.builder()}.
 */
@org.immutables.value.Generated(from = "CarePlan", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableCarePlan implements com.fhir.CarePlan {
  private final @javax.annotation.Nullable com.fhir.Meta meta;
  private final @javax.annotation.Nullable com.fhir.uri implicitRules;
  private final @javax.annotation.Nullable com.fhir.Period period;
  private final @javax.annotation.Nullable com.fhir.code status;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Annotation> note;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> addresses;
  private final @javax.annotation.Nullable com.fhir.Narrative text;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> replaces;
  private final @javax.annotation.Nullable java.lang.String title;
  private final com.fhir.Reference subject;
  private final @javax.annotation.Nullable java.lang.String description;
  private final @javax.annotation.Nullable com.fhir.Reference author;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable com.fhir.dateTime created;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> basedOn;
  private final java.lang.String resourceType;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> supportingInfo;
  private final @javax.annotation.Nullable com.fhir.code language;
  private final @javax.annotation.Nullable java.util.List<com.fhir.uri> instantiatesUri;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> careTeam;
  private final @javax.annotation.Nullable java.util.List<com.fhir.canonical> instantiatesCanonical;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CarePlan_Activity> activity;
  private final @javax.annotation.Nullable com.fhir.Reference encounter;
  private final @javax.annotation.Nullable com.fhir.code intent;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> contributor;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> goal;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> partOf;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> category;
  private final @javax.annotation.Nullable com.fhir.id id;

  private ImmutableCarePlan(
      @javax.annotation.Nullable com.fhir.Meta meta,
      @javax.annotation.Nullable com.fhir.uri implicitRules,
      @javax.annotation.Nullable com.fhir.Period period,
      @javax.annotation.Nullable com.fhir.code status,
      @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier,
      @javax.annotation.Nullable java.util.List<com.fhir.Annotation> note,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> addresses,
      @javax.annotation.Nullable com.fhir.Narrative text,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> replaces,
      @javax.annotation.Nullable java.lang.String title,
      com.fhir.Reference subject,
      @javax.annotation.Nullable java.lang.String description,
      @javax.annotation.Nullable com.fhir.Reference author,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable com.fhir.dateTime created,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> basedOn,
      java.lang.String resourceType,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> supportingInfo,
      @javax.annotation.Nullable com.fhir.code language,
      @javax.annotation.Nullable java.util.List<com.fhir.uri> instantiatesUri,
      @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> careTeam,
      @javax.annotation.Nullable java.util.List<com.fhir.canonical> instantiatesCanonical,
      @javax.annotation.Nullable java.util.List<com.fhir.CarePlan_Activity> activity,
      @javax.annotation.Nullable com.fhir.Reference encounter,
      @javax.annotation.Nullable com.fhir.code intent,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> contributor,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> goal,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> partOf,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> category,
      @javax.annotation.Nullable com.fhir.id id) {
    this.meta = meta;
    this.implicitRules = implicitRules;
    this.period = period;
    this.status = status;
    this.identifier = identifier;
    this.note = note;
    this.modifierExtension = modifierExtension;
    this.addresses = addresses;
    this.text = text;
    this.replaces = replaces;
    this.title = title;
    this.subject = subject;
    this.description = description;
    this.author = author;
    this.extension = extension;
    this.created = created;
    this.basedOn = basedOn;
    this.resourceType = resourceType;
    this.supportingInfo = supportingInfo;
    this.language = language;
    this.instantiatesUri = instantiatesUri;
    this.contained = contained;
    this.careTeam = careTeam;
    this.instantiatesCanonical = instantiatesCanonical;
    this.activity = activity;
    this.encounter = encounter;
    this.intent = intent;
    this.contributor = contributor;
    this.goal = goal;
    this.partOf = partOf;
    this.category = category;
    this.id = id;
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
   * @return The value of the {@code implicitRules} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
  @Override
  public java.util.Optional<com.fhir.uri> implicitRules() {
    return java.util.Optional.ofNullable(implicitRules);
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
   * @return The value of the {@code status} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("status")
  @Override
  public java.util.Optional<com.fhir.code> status() {
    return java.util.Optional.ofNullable(status);
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
   * @return The value of the {@code note} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("note")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Annotation>> note() {
    return java.util.Optional.ofNullable(note);
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
   * @return The value of the {@code addresses} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("addresses")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> addresses() {
    return java.util.Optional.ofNullable(addresses);
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
   * @return The value of the {@code replaces} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("replaces")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> replaces() {
    return java.util.Optional.ofNullable(replaces);
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
   * @return The value of the {@code subject} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("subject")
  @Override
  public com.fhir.Reference subject() {
    return subject;
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
   * @return The value of the {@code author} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("author")
  @Override
  public java.util.Optional<com.fhir.Reference> author() {
    return java.util.Optional.ofNullable(author);
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
   * @return The value of the {@code created} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("created")
  @Override
  public java.util.Optional<com.fhir.dateTime> created() {
    return java.util.Optional.ofNullable(created);
  }

  /**
   * @return The value of the {@code basedOn} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("basedOn")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> basedOn() {
    return java.util.Optional.ofNullable(basedOn);
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
   * @return The value of the {@code supportingInfo} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("supportingInfo")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> supportingInfo() {
    return java.util.Optional.ofNullable(supportingInfo);
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
   * @return The value of the {@code instantiatesUri} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("instantiatesUri")
  @Override
  public java.util.Optional<java.util.List<com.fhir.uri>> instantiatesUri() {
    return java.util.Optional.ofNullable(instantiatesUri);
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
   * @return The value of the {@code careTeam} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("careTeam")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> careTeam() {
    return java.util.Optional.ofNullable(careTeam);
  }

  /**
   * @return The value of the {@code instantiatesCanonical} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("instantiatesCanonical")
  @Override
  public java.util.Optional<java.util.List<com.fhir.canonical>> instantiatesCanonical() {
    return java.util.Optional.ofNullable(instantiatesCanonical);
  }

  /**
   * @return The value of the {@code activity} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("activity")
  @Override
  public java.util.Optional<java.util.List<com.fhir.CarePlan_Activity>> activity() {
    return java.util.Optional.ofNullable(activity);
  }

  /**
   * @return The value of the {@code encounter} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("encounter")
  @Override
  public java.util.Optional<com.fhir.Reference> encounter() {
    return java.util.Optional.ofNullable(encounter);
  }

  /**
   * @return The value of the {@code intent} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("intent")
  @Override
  public java.util.Optional<com.fhir.code> intent() {
    return java.util.Optional.ofNullable(intent);
  }

  /**
   * @return The value of the {@code contributor} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("contributor")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> contributor() {
    return java.util.Optional.ofNullable(contributor);
  }

  /**
   * @return The value of the {@code goal} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("goal")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> goal() {
    return java.util.Optional.ofNullable(goal);
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
   * @return The value of the {@code category} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("category")
  @Override
  public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> category() {
    return java.util.Optional.ofNullable(category);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CarePlan#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCarePlan withMeta(com.fhir.Meta value) {
    @javax.annotation.Nullable com.fhir.Meta newValue = java.util.Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableCarePlan(
        newValue,
        this.implicitRules,
        this.period,
        this.status,
        this.identifier,
        this.note,
        this.modifierExtension,
        this.addresses,
        this.text,
        this.replaces,
        this.title,
        this.subject,
        this.description,
        this.author,
        this.extension,
        this.created,
        this.basedOn,
        this.resourceType,
        this.supportingInfo,
        this.language,
        this.instantiatesUri,
        this.contained,
        this.careTeam,
        this.instantiatesCanonical,
        this.activity,
        this.encounter,
        this.intent,
        this.contributor,
        this.goal,
        this.partOf,
        this.category,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CarePlan#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCarePlan withMeta(java.util.Optional<? extends com.fhir.Meta> optional) {
    @javax.annotation.Nullable com.fhir.Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableCarePlan(
        value,
        this.implicitRules,
        this.period,
        this.status,
        this.identifier,
        this.note,
        this.modifierExtension,
        this.addresses,
        this.text,
        this.replaces,
        this.title,
        this.subject,
        this.description,
        this.author,
        this.extension,
        this.created,
        this.basedOn,
        this.resourceType,
        this.supportingInfo,
        this.language,
        this.instantiatesUri,
        this.contained,
        this.careTeam,
        this.instantiatesCanonical,
        this.activity,
        this.encounter,
        this.intent,
        this.contributor,
        this.goal,
        this.partOf,
        this.category,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CarePlan#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCarePlan withImplicitRules(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableCarePlan(
        this.meta,
        newValue,
        this.period,
        this.status,
        this.identifier,
        this.note,
        this.modifierExtension,
        this.addresses,
        this.text,
        this.replaces,
        this.title,
        this.subject,
        this.description,
        this.author,
        this.extension,
        this.created,
        this.basedOn,
        this.resourceType,
        this.supportingInfo,
        this.language,
        this.instantiatesUri,
        this.contained,
        this.careTeam,
        this.instantiatesCanonical,
        this.activity,
        this.encounter,
        this.intent,
        this.contributor,
        this.goal,
        this.partOf,
        this.category,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CarePlan#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCarePlan withImplicitRules(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableCarePlan(
        this.meta,
        value,
        this.period,
        this.status,
        this.identifier,
        this.note,
        this.modifierExtension,
        this.addresses,
        this.text,
        this.replaces,
        this.title,
        this.subject,
        this.description,
        this.author,
        this.extension,
        this.created,
        this.basedOn,
        this.resourceType,
        this.supportingInfo,
        this.language,
        this.instantiatesUri,
        this.contained,
        this.careTeam,
        this.instantiatesCanonical,
        this.activity,
        this.encounter,
        this.intent,
        this.contributor,
        this.goal,
        this.partOf,
        this.category,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CarePlan#period() period} attribute.
   * @param value The value for period
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCarePlan withPeriod(com.fhir.Period value) {
    @javax.annotation.Nullable com.fhir.Period newValue = java.util.Objects.requireNonNull(value, "period");
    if (this.period == newValue) return this;
    return new ImmutableCarePlan(
        this.meta,
        this.implicitRules,
        newValue,
        this.status,
        this.identifier,
        this.note,
        this.modifierExtension,
        this.addresses,
        this.text,
        this.replaces,
        this.title,
        this.subject,
        this.description,
        this.author,
        this.extension,
        this.created,
        this.basedOn,
        this.resourceType,
        this.supportingInfo,
        this.language,
        this.instantiatesUri,
        this.contained,
        this.careTeam,
        this.instantiatesCanonical,
        this.activity,
        this.encounter,
        this.intent,
        this.contributor,
        this.goal,
        this.partOf,
        this.category,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CarePlan#period() period} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for period
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCarePlan withPeriod(java.util.Optional<? extends com.fhir.Period> optional) {
    @javax.annotation.Nullable com.fhir.Period value = optional.orElse(null);
    if (this.period == value) return this;
    return new ImmutableCarePlan(
        this.meta,
        this.implicitRules,
        value,
        this.status,
        this.identifier,
        this.note,
        this.modifierExtension,
        this.addresses,
        this.text,
        this.replaces,
        this.title,
        this.subject,
        this.description,
        this.author,
        this.extension,
        this.created,
        this.basedOn,
        this.resourceType,
        this.supportingInfo,
        this.language,
        this.instantiatesUri,
        this.contained,
        this.careTeam,
        this.instantiatesCanonical,
        this.activity,
        this.encounter,
        this.intent,
        this.contributor,
        this.goal,
        this.partOf,
        this.category,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CarePlan#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCarePlan withStatus(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableCarePlan(
        this.meta,
        this.implicitRules,
        this.period,
        newValue,
        this.identifier,
        this.note,
        this.modifierExtension,
        this.addresses,
        this.text,
        this.replaces,
        this.title,
        this.subject,
        this.description,
        this.author,
        this.extension,
        this.created,
        this.basedOn,
        this.resourceType,
        this.supportingInfo,
        this.language,
        this.instantiatesUri,
        this.contained,
        this.careTeam,
        this.instantiatesCanonical,
        this.activity,
        this.encounter,
        this.intent,
        this.contributor,
        this.goal,
        this.partOf,
        this.category,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CarePlan#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCarePlan withStatus(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableCarePlan(
        this.meta,
        this.implicitRules,
        this.period,
        value,
        this.identifier,
        this.note,
        this.modifierExtension,
        this.addresses,
        this.text,
        this.replaces,
        this.title,
        this.subject,
        this.description,
        this.author,
        this.extension,
        this.created,
        this.basedOn,
        this.resourceType,
        this.supportingInfo,
        this.language,
        this.instantiatesUri,
        this.contained,
        this.careTeam,
        this.instantiatesCanonical,
        this.activity,
        this.encounter,
        this.intent,
        this.contributor,
        this.goal,
        this.partOf,
        this.category,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CarePlan#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCarePlan withIdentifier(java.util.List<com.fhir.Identifier> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> newValue = java.util.Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableCarePlan(
        this.meta,
        this.implicitRules,
        this.period,
        this.status,
        newValue,
        this.note,
        this.modifierExtension,
        this.addresses,
        this.text,
        this.replaces,
        this.title,
        this.subject,
        this.description,
        this.author,
        this.extension,
        this.created,
        this.basedOn,
        this.resourceType,
        this.supportingInfo,
        this.language,
        this.instantiatesUri,
        this.contained,
        this.careTeam,
        this.instantiatesCanonical,
        this.activity,
        this.encounter,
        this.intent,
        this.contributor,
        this.goal,
        this.partOf,
        this.category,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CarePlan#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCarePlan withIdentifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableCarePlan(
        this.meta,
        this.implicitRules,
        this.period,
        this.status,
        value,
        this.note,
        this.modifierExtension,
        this.addresses,
        this.text,
        this.replaces,
        this.title,
        this.subject,
        this.description,
        this.author,
        this.extension,
        this.created,
        this.basedOn,
        this.resourceType,
        this.supportingInfo,
        this.language,
        this.instantiatesUri,
        this.contained,
        this.careTeam,
        this.instantiatesCanonical,
        this.activity,
        this.encounter,
        this.intent,
        this.contributor,
        this.goal,
        this.partOf,
        this.category,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CarePlan#note() note} attribute.
   * @param value The value for note
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCarePlan withNote(java.util.List<com.fhir.Annotation> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Annotation> newValue = java.util.Objects.requireNonNull(value, "note");
    if (this.note == newValue) return this;
    return new ImmutableCarePlan(
        this.meta,
        this.implicitRules,
        this.period,
        this.status,
        this.identifier,
        newValue,
        this.modifierExtension,
        this.addresses,
        this.text,
        this.replaces,
        this.title,
        this.subject,
        this.description,
        this.author,
        this.extension,
        this.created,
        this.basedOn,
        this.resourceType,
        this.supportingInfo,
        this.language,
        this.instantiatesUri,
        this.contained,
        this.careTeam,
        this.instantiatesCanonical,
        this.activity,
        this.encounter,
        this.intent,
        this.contributor,
        this.goal,
        this.partOf,
        this.category,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CarePlan#note() note} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for note
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCarePlan withNote(java.util.Optional<? extends java.util.List<com.fhir.Annotation>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Annotation> value = optional.orElse(null);
    if (this.note == value) return this;
    return new ImmutableCarePlan(
        this.meta,
        this.implicitRules,
        this.period,
        this.status,
        this.identifier,
        value,
        this.modifierExtension,
        this.addresses,
        this.text,
        this.replaces,
        this.title,
        this.subject,
        this.description,
        this.author,
        this.extension,
        this.created,
        this.basedOn,
        this.resourceType,
        this.supportingInfo,
        this.language,
        this.instantiatesUri,
        this.contained,
        this.careTeam,
        this.instantiatesCanonical,
        this.activity,
        this.encounter,
        this.intent,
        this.contributor,
        this.goal,
        this.partOf,
        this.category,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CarePlan#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCarePlan withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableCarePlan(
        this.meta,
        this.implicitRules,
        this.period,
        this.status,
        this.identifier,
        this.note,
        newValue,
        this.addresses,
        this.text,
        this.replaces,
        this.title,
        this.subject,
        this.description,
        this.author,
        this.extension,
        this.created,
        this.basedOn,
        this.resourceType,
        this.supportingInfo,
        this.language,
        this.instantiatesUri,
        this.contained,
        this.careTeam,
        this.instantiatesCanonical,
        this.activity,
        this.encounter,
        this.intent,
        this.contributor,
        this.goal,
        this.partOf,
        this.category,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CarePlan#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCarePlan withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableCarePlan(
        this.meta,
        this.implicitRules,
        this.period,
        this.status,
        this.identifier,
        this.note,
        value,
        this.addresses,
        this.text,
        this.replaces,
        this.title,
        this.subject,
        this.description,
        this.author,
        this.extension,
        this.created,
        this.basedOn,
        this.resourceType,
        this.supportingInfo,
        this.language,
        this.instantiatesUri,
        this.contained,
        this.careTeam,
        this.instantiatesCanonical,
        this.activity,
        this.encounter,
        this.intent,
        this.contributor,
        this.goal,
        this.partOf,
        this.category,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CarePlan#addresses() addresses} attribute.
   * @param value The value for addresses
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCarePlan withAddresses(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "addresses");
    if (this.addresses == newValue) return this;
    return new ImmutableCarePlan(
        this.meta,
        this.implicitRules,
        this.period,
        this.status,
        this.identifier,
        this.note,
        this.modifierExtension,
        newValue,
        this.text,
        this.replaces,
        this.title,
        this.subject,
        this.description,
        this.author,
        this.extension,
        this.created,
        this.basedOn,
        this.resourceType,
        this.supportingInfo,
        this.language,
        this.instantiatesUri,
        this.contained,
        this.careTeam,
        this.instantiatesCanonical,
        this.activity,
        this.encounter,
        this.intent,
        this.contributor,
        this.goal,
        this.partOf,
        this.category,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CarePlan#addresses() addresses} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for addresses
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCarePlan withAddresses(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.addresses == value) return this;
    return new ImmutableCarePlan(
        this.meta,
        this.implicitRules,
        this.period,
        this.status,
        this.identifier,
        this.note,
        this.modifierExtension,
        value,
        this.text,
        this.replaces,
        this.title,
        this.subject,
        this.description,
        this.author,
        this.extension,
        this.created,
        this.basedOn,
        this.resourceType,
        this.supportingInfo,
        this.language,
        this.instantiatesUri,
        this.contained,
        this.careTeam,
        this.instantiatesCanonical,
        this.activity,
        this.encounter,
        this.intent,
        this.contributor,
        this.goal,
        this.partOf,
        this.category,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CarePlan#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCarePlan withText(com.fhir.Narrative value) {
    @javax.annotation.Nullable com.fhir.Narrative newValue = java.util.Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableCarePlan(
        this.meta,
        this.implicitRules,
        this.period,
        this.status,
        this.identifier,
        this.note,
        this.modifierExtension,
        this.addresses,
        newValue,
        this.replaces,
        this.title,
        this.subject,
        this.description,
        this.author,
        this.extension,
        this.created,
        this.basedOn,
        this.resourceType,
        this.supportingInfo,
        this.language,
        this.instantiatesUri,
        this.contained,
        this.careTeam,
        this.instantiatesCanonical,
        this.activity,
        this.encounter,
        this.intent,
        this.contributor,
        this.goal,
        this.partOf,
        this.category,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CarePlan#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCarePlan withText(java.util.Optional<? extends com.fhir.Narrative> optional) {
    @javax.annotation.Nullable com.fhir.Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableCarePlan(
        this.meta,
        this.implicitRules,
        this.period,
        this.status,
        this.identifier,
        this.note,
        this.modifierExtension,
        this.addresses,
        value,
        this.replaces,
        this.title,
        this.subject,
        this.description,
        this.author,
        this.extension,
        this.created,
        this.basedOn,
        this.resourceType,
        this.supportingInfo,
        this.language,
        this.instantiatesUri,
        this.contained,
        this.careTeam,
        this.instantiatesCanonical,
        this.activity,
        this.encounter,
        this.intent,
        this.contributor,
        this.goal,
        this.partOf,
        this.category,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CarePlan#replaces() replaces} attribute.
   * @param value The value for replaces
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCarePlan withReplaces(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "replaces");
    if (this.replaces == newValue) return this;
    return new ImmutableCarePlan(
        this.meta,
        this.implicitRules,
        this.period,
        this.status,
        this.identifier,
        this.note,
        this.modifierExtension,
        this.addresses,
        this.text,
        newValue,
        this.title,
        this.subject,
        this.description,
        this.author,
        this.extension,
        this.created,
        this.basedOn,
        this.resourceType,
        this.supportingInfo,
        this.language,
        this.instantiatesUri,
        this.contained,
        this.careTeam,
        this.instantiatesCanonical,
        this.activity,
        this.encounter,
        this.intent,
        this.contributor,
        this.goal,
        this.partOf,
        this.category,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CarePlan#replaces() replaces} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for replaces
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCarePlan withReplaces(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.replaces == value) return this;
    return new ImmutableCarePlan(
        this.meta,
        this.implicitRules,
        this.period,
        this.status,
        this.identifier,
        this.note,
        this.modifierExtension,
        this.addresses,
        this.text,
        value,
        this.title,
        this.subject,
        this.description,
        this.author,
        this.extension,
        this.created,
        this.basedOn,
        this.resourceType,
        this.supportingInfo,
        this.language,
        this.instantiatesUri,
        this.contained,
        this.careTeam,
        this.instantiatesCanonical,
        this.activity,
        this.encounter,
        this.intent,
        this.contributor,
        this.goal,
        this.partOf,
        this.category,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CarePlan#title() title} attribute.
   * @param value The value for title
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCarePlan withTitle(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "title");
    if (java.util.Objects.equals(this.title, newValue)) return this;
    return new ImmutableCarePlan(
        this.meta,
        this.implicitRules,
        this.period,
        this.status,
        this.identifier,
        this.note,
        this.modifierExtension,
        this.addresses,
        this.text,
        this.replaces,
        newValue,
        this.subject,
        this.description,
        this.author,
        this.extension,
        this.created,
        this.basedOn,
        this.resourceType,
        this.supportingInfo,
        this.language,
        this.instantiatesUri,
        this.contained,
        this.careTeam,
        this.instantiatesCanonical,
        this.activity,
        this.encounter,
        this.intent,
        this.contributor,
        this.goal,
        this.partOf,
        this.category,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CarePlan#title() title} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for title
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCarePlan withTitle(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.title, value)) return this;
    return new ImmutableCarePlan(
        this.meta,
        this.implicitRules,
        this.period,
        this.status,
        this.identifier,
        this.note,
        this.modifierExtension,
        this.addresses,
        this.text,
        this.replaces,
        value,
        this.subject,
        this.description,
        this.author,
        this.extension,
        this.created,
        this.basedOn,
        this.resourceType,
        this.supportingInfo,
        this.language,
        this.instantiatesUri,
        this.contained,
        this.careTeam,
        this.instantiatesCanonical,
        this.activity,
        this.encounter,
        this.intent,
        this.contributor,
        this.goal,
        this.partOf,
        this.category,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link CarePlan#subject() subject} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for subject
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCarePlan withSubject(com.fhir.Reference value) {
    if (this.subject == value) return this;
    com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "subject");
    return new ImmutableCarePlan(
        this.meta,
        this.implicitRules,
        this.period,
        this.status,
        this.identifier,
        this.note,
        this.modifierExtension,
        this.addresses,
        this.text,
        this.replaces,
        this.title,
        newValue,
        this.description,
        this.author,
        this.extension,
        this.created,
        this.basedOn,
        this.resourceType,
        this.supportingInfo,
        this.language,
        this.instantiatesUri,
        this.contained,
        this.careTeam,
        this.instantiatesCanonical,
        this.activity,
        this.encounter,
        this.intent,
        this.contributor,
        this.goal,
        this.partOf,
        this.category,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CarePlan#description() description} attribute.
   * @param value The value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCarePlan withDescription(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "description");
    if (java.util.Objects.equals(this.description, newValue)) return this;
    return new ImmutableCarePlan(
        this.meta,
        this.implicitRules,
        this.period,
        this.status,
        this.identifier,
        this.note,
        this.modifierExtension,
        this.addresses,
        this.text,
        this.replaces,
        this.title,
        this.subject,
        newValue,
        this.author,
        this.extension,
        this.created,
        this.basedOn,
        this.resourceType,
        this.supportingInfo,
        this.language,
        this.instantiatesUri,
        this.contained,
        this.careTeam,
        this.instantiatesCanonical,
        this.activity,
        this.encounter,
        this.intent,
        this.contributor,
        this.goal,
        this.partOf,
        this.category,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CarePlan#description() description} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCarePlan withDescription(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.description, value)) return this;
    return new ImmutableCarePlan(
        this.meta,
        this.implicitRules,
        this.period,
        this.status,
        this.identifier,
        this.note,
        this.modifierExtension,
        this.addresses,
        this.text,
        this.replaces,
        this.title,
        this.subject,
        value,
        this.author,
        this.extension,
        this.created,
        this.basedOn,
        this.resourceType,
        this.supportingInfo,
        this.language,
        this.instantiatesUri,
        this.contained,
        this.careTeam,
        this.instantiatesCanonical,
        this.activity,
        this.encounter,
        this.intent,
        this.contributor,
        this.goal,
        this.partOf,
        this.category,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CarePlan#author() author} attribute.
   * @param value The value for author
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCarePlan withAuthor(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "author");
    if (this.author == newValue) return this;
    return new ImmutableCarePlan(
        this.meta,
        this.implicitRules,
        this.period,
        this.status,
        this.identifier,
        this.note,
        this.modifierExtension,
        this.addresses,
        this.text,
        this.replaces,
        this.title,
        this.subject,
        this.description,
        newValue,
        this.extension,
        this.created,
        this.basedOn,
        this.resourceType,
        this.supportingInfo,
        this.language,
        this.instantiatesUri,
        this.contained,
        this.careTeam,
        this.instantiatesCanonical,
        this.activity,
        this.encounter,
        this.intent,
        this.contributor,
        this.goal,
        this.partOf,
        this.category,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CarePlan#author() author} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for author
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCarePlan withAuthor(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.author == value) return this;
    return new ImmutableCarePlan(
        this.meta,
        this.implicitRules,
        this.period,
        this.status,
        this.identifier,
        this.note,
        this.modifierExtension,
        this.addresses,
        this.text,
        this.replaces,
        this.title,
        this.subject,
        this.description,
        value,
        this.extension,
        this.created,
        this.basedOn,
        this.resourceType,
        this.supportingInfo,
        this.language,
        this.instantiatesUri,
        this.contained,
        this.careTeam,
        this.instantiatesCanonical,
        this.activity,
        this.encounter,
        this.intent,
        this.contributor,
        this.goal,
        this.partOf,
        this.category,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CarePlan#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCarePlan withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableCarePlan(
        this.meta,
        this.implicitRules,
        this.period,
        this.status,
        this.identifier,
        this.note,
        this.modifierExtension,
        this.addresses,
        this.text,
        this.replaces,
        this.title,
        this.subject,
        this.description,
        this.author,
        newValue,
        this.created,
        this.basedOn,
        this.resourceType,
        this.supportingInfo,
        this.language,
        this.instantiatesUri,
        this.contained,
        this.careTeam,
        this.instantiatesCanonical,
        this.activity,
        this.encounter,
        this.intent,
        this.contributor,
        this.goal,
        this.partOf,
        this.category,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CarePlan#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCarePlan withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableCarePlan(
        this.meta,
        this.implicitRules,
        this.period,
        this.status,
        this.identifier,
        this.note,
        this.modifierExtension,
        this.addresses,
        this.text,
        this.replaces,
        this.title,
        this.subject,
        this.description,
        this.author,
        value,
        this.created,
        this.basedOn,
        this.resourceType,
        this.supportingInfo,
        this.language,
        this.instantiatesUri,
        this.contained,
        this.careTeam,
        this.instantiatesCanonical,
        this.activity,
        this.encounter,
        this.intent,
        this.contributor,
        this.goal,
        this.partOf,
        this.category,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CarePlan#created() created} attribute.
   * @param value The value for created
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCarePlan withCreated(com.fhir.dateTime value) {
    @javax.annotation.Nullable com.fhir.dateTime newValue = java.util.Objects.requireNonNull(value, "created");
    if (this.created == newValue) return this;
    return new ImmutableCarePlan(
        this.meta,
        this.implicitRules,
        this.period,
        this.status,
        this.identifier,
        this.note,
        this.modifierExtension,
        this.addresses,
        this.text,
        this.replaces,
        this.title,
        this.subject,
        this.description,
        this.author,
        this.extension,
        newValue,
        this.basedOn,
        this.resourceType,
        this.supportingInfo,
        this.language,
        this.instantiatesUri,
        this.contained,
        this.careTeam,
        this.instantiatesCanonical,
        this.activity,
        this.encounter,
        this.intent,
        this.contributor,
        this.goal,
        this.partOf,
        this.category,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CarePlan#created() created} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for created
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCarePlan withCreated(java.util.Optional<? extends com.fhir.dateTime> optional) {
    @javax.annotation.Nullable com.fhir.dateTime value = optional.orElse(null);
    if (this.created == value) return this;
    return new ImmutableCarePlan(
        this.meta,
        this.implicitRules,
        this.period,
        this.status,
        this.identifier,
        this.note,
        this.modifierExtension,
        this.addresses,
        this.text,
        this.replaces,
        this.title,
        this.subject,
        this.description,
        this.author,
        this.extension,
        value,
        this.basedOn,
        this.resourceType,
        this.supportingInfo,
        this.language,
        this.instantiatesUri,
        this.contained,
        this.careTeam,
        this.instantiatesCanonical,
        this.activity,
        this.encounter,
        this.intent,
        this.contributor,
        this.goal,
        this.partOf,
        this.category,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CarePlan#basedOn() basedOn} attribute.
   * @param value The value for basedOn
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCarePlan withBasedOn(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "basedOn");
    if (this.basedOn == newValue) return this;
    return new ImmutableCarePlan(
        this.meta,
        this.implicitRules,
        this.period,
        this.status,
        this.identifier,
        this.note,
        this.modifierExtension,
        this.addresses,
        this.text,
        this.replaces,
        this.title,
        this.subject,
        this.description,
        this.author,
        this.extension,
        this.created,
        newValue,
        this.resourceType,
        this.supportingInfo,
        this.language,
        this.instantiatesUri,
        this.contained,
        this.careTeam,
        this.instantiatesCanonical,
        this.activity,
        this.encounter,
        this.intent,
        this.contributor,
        this.goal,
        this.partOf,
        this.category,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CarePlan#basedOn() basedOn} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for basedOn
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCarePlan withBasedOn(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.basedOn == value) return this;
    return new ImmutableCarePlan(
        this.meta,
        this.implicitRules,
        this.period,
        this.status,
        this.identifier,
        this.note,
        this.modifierExtension,
        this.addresses,
        this.text,
        this.replaces,
        this.title,
        this.subject,
        this.description,
        this.author,
        this.extension,
        this.created,
        value,
        this.resourceType,
        this.supportingInfo,
        this.language,
        this.instantiatesUri,
        this.contained,
        this.careTeam,
        this.instantiatesCanonical,
        this.activity,
        this.encounter,
        this.intent,
        this.contributor,
        this.goal,
        this.partOf,
        this.category,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link CarePlan#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCarePlan withResourceType(java.lang.String value) {
    java.lang.String newValue = java.util.Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableCarePlan(
        this.meta,
        this.implicitRules,
        this.period,
        this.status,
        this.identifier,
        this.note,
        this.modifierExtension,
        this.addresses,
        this.text,
        this.replaces,
        this.title,
        this.subject,
        this.description,
        this.author,
        this.extension,
        this.created,
        this.basedOn,
        newValue,
        this.supportingInfo,
        this.language,
        this.instantiatesUri,
        this.contained,
        this.careTeam,
        this.instantiatesCanonical,
        this.activity,
        this.encounter,
        this.intent,
        this.contributor,
        this.goal,
        this.partOf,
        this.category,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CarePlan#supportingInfo() supportingInfo} attribute.
   * @param value The value for supportingInfo
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCarePlan withSupportingInfo(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "supportingInfo");
    if (this.supportingInfo == newValue) return this;
    return new ImmutableCarePlan(
        this.meta,
        this.implicitRules,
        this.period,
        this.status,
        this.identifier,
        this.note,
        this.modifierExtension,
        this.addresses,
        this.text,
        this.replaces,
        this.title,
        this.subject,
        this.description,
        this.author,
        this.extension,
        this.created,
        this.basedOn,
        this.resourceType,
        newValue,
        this.language,
        this.instantiatesUri,
        this.contained,
        this.careTeam,
        this.instantiatesCanonical,
        this.activity,
        this.encounter,
        this.intent,
        this.contributor,
        this.goal,
        this.partOf,
        this.category,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CarePlan#supportingInfo() supportingInfo} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for supportingInfo
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCarePlan withSupportingInfo(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.supportingInfo == value) return this;
    return new ImmutableCarePlan(
        this.meta,
        this.implicitRules,
        this.period,
        this.status,
        this.identifier,
        this.note,
        this.modifierExtension,
        this.addresses,
        this.text,
        this.replaces,
        this.title,
        this.subject,
        this.description,
        this.author,
        this.extension,
        this.created,
        this.basedOn,
        this.resourceType,
        value,
        this.language,
        this.instantiatesUri,
        this.contained,
        this.careTeam,
        this.instantiatesCanonical,
        this.activity,
        this.encounter,
        this.intent,
        this.contributor,
        this.goal,
        this.partOf,
        this.category,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CarePlan#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCarePlan withLanguage(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableCarePlan(
        this.meta,
        this.implicitRules,
        this.period,
        this.status,
        this.identifier,
        this.note,
        this.modifierExtension,
        this.addresses,
        this.text,
        this.replaces,
        this.title,
        this.subject,
        this.description,
        this.author,
        this.extension,
        this.created,
        this.basedOn,
        this.resourceType,
        this.supportingInfo,
        newValue,
        this.instantiatesUri,
        this.contained,
        this.careTeam,
        this.instantiatesCanonical,
        this.activity,
        this.encounter,
        this.intent,
        this.contributor,
        this.goal,
        this.partOf,
        this.category,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CarePlan#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCarePlan withLanguage(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableCarePlan(
        this.meta,
        this.implicitRules,
        this.period,
        this.status,
        this.identifier,
        this.note,
        this.modifierExtension,
        this.addresses,
        this.text,
        this.replaces,
        this.title,
        this.subject,
        this.description,
        this.author,
        this.extension,
        this.created,
        this.basedOn,
        this.resourceType,
        this.supportingInfo,
        value,
        this.instantiatesUri,
        this.contained,
        this.careTeam,
        this.instantiatesCanonical,
        this.activity,
        this.encounter,
        this.intent,
        this.contributor,
        this.goal,
        this.partOf,
        this.category,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CarePlan#instantiatesUri() instantiatesUri} attribute.
   * @param value The value for instantiatesUri
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCarePlan withInstantiatesUri(java.util.List<com.fhir.uri> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.uri> newValue = java.util.Objects.requireNonNull(value, "instantiatesUri");
    if (this.instantiatesUri == newValue) return this;
    return new ImmutableCarePlan(
        this.meta,
        this.implicitRules,
        this.period,
        this.status,
        this.identifier,
        this.note,
        this.modifierExtension,
        this.addresses,
        this.text,
        this.replaces,
        this.title,
        this.subject,
        this.description,
        this.author,
        this.extension,
        this.created,
        this.basedOn,
        this.resourceType,
        this.supportingInfo,
        this.language,
        newValue,
        this.contained,
        this.careTeam,
        this.instantiatesCanonical,
        this.activity,
        this.encounter,
        this.intent,
        this.contributor,
        this.goal,
        this.partOf,
        this.category,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CarePlan#instantiatesUri() instantiatesUri} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for instantiatesUri
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCarePlan withInstantiatesUri(java.util.Optional<? extends java.util.List<com.fhir.uri>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.uri> value = optional.orElse(null);
    if (this.instantiatesUri == value) return this;
    return new ImmutableCarePlan(
        this.meta,
        this.implicitRules,
        this.period,
        this.status,
        this.identifier,
        this.note,
        this.modifierExtension,
        this.addresses,
        this.text,
        this.replaces,
        this.title,
        this.subject,
        this.description,
        this.author,
        this.extension,
        this.created,
        this.basedOn,
        this.resourceType,
        this.supportingInfo,
        this.language,
        value,
        this.contained,
        this.careTeam,
        this.instantiatesCanonical,
        this.activity,
        this.encounter,
        this.intent,
        this.contributor,
        this.goal,
        this.partOf,
        this.category,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CarePlan#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCarePlan withContained(java.util.List<com.fhir.ResourceList> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> newValue = java.util.Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableCarePlan(
        this.meta,
        this.implicitRules,
        this.period,
        this.status,
        this.identifier,
        this.note,
        this.modifierExtension,
        this.addresses,
        this.text,
        this.replaces,
        this.title,
        this.subject,
        this.description,
        this.author,
        this.extension,
        this.created,
        this.basedOn,
        this.resourceType,
        this.supportingInfo,
        this.language,
        this.instantiatesUri,
        newValue,
        this.careTeam,
        this.instantiatesCanonical,
        this.activity,
        this.encounter,
        this.intent,
        this.contributor,
        this.goal,
        this.partOf,
        this.category,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CarePlan#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCarePlan withContained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableCarePlan(
        this.meta,
        this.implicitRules,
        this.period,
        this.status,
        this.identifier,
        this.note,
        this.modifierExtension,
        this.addresses,
        this.text,
        this.replaces,
        this.title,
        this.subject,
        this.description,
        this.author,
        this.extension,
        this.created,
        this.basedOn,
        this.resourceType,
        this.supportingInfo,
        this.language,
        this.instantiatesUri,
        value,
        this.careTeam,
        this.instantiatesCanonical,
        this.activity,
        this.encounter,
        this.intent,
        this.contributor,
        this.goal,
        this.partOf,
        this.category,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CarePlan#careTeam() careTeam} attribute.
   * @param value The value for careTeam
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCarePlan withCareTeam(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "careTeam");
    if (this.careTeam == newValue) return this;
    return new ImmutableCarePlan(
        this.meta,
        this.implicitRules,
        this.period,
        this.status,
        this.identifier,
        this.note,
        this.modifierExtension,
        this.addresses,
        this.text,
        this.replaces,
        this.title,
        this.subject,
        this.description,
        this.author,
        this.extension,
        this.created,
        this.basedOn,
        this.resourceType,
        this.supportingInfo,
        this.language,
        this.instantiatesUri,
        this.contained,
        newValue,
        this.instantiatesCanonical,
        this.activity,
        this.encounter,
        this.intent,
        this.contributor,
        this.goal,
        this.partOf,
        this.category,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CarePlan#careTeam() careTeam} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for careTeam
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCarePlan withCareTeam(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.careTeam == value) return this;
    return new ImmutableCarePlan(
        this.meta,
        this.implicitRules,
        this.period,
        this.status,
        this.identifier,
        this.note,
        this.modifierExtension,
        this.addresses,
        this.text,
        this.replaces,
        this.title,
        this.subject,
        this.description,
        this.author,
        this.extension,
        this.created,
        this.basedOn,
        this.resourceType,
        this.supportingInfo,
        this.language,
        this.instantiatesUri,
        this.contained,
        value,
        this.instantiatesCanonical,
        this.activity,
        this.encounter,
        this.intent,
        this.contributor,
        this.goal,
        this.partOf,
        this.category,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CarePlan#instantiatesCanonical() instantiatesCanonical} attribute.
   * @param value The value for instantiatesCanonical
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCarePlan withInstantiatesCanonical(java.util.List<com.fhir.canonical> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.canonical> newValue = java.util.Objects.requireNonNull(value, "instantiatesCanonical");
    if (this.instantiatesCanonical == newValue) return this;
    return new ImmutableCarePlan(
        this.meta,
        this.implicitRules,
        this.period,
        this.status,
        this.identifier,
        this.note,
        this.modifierExtension,
        this.addresses,
        this.text,
        this.replaces,
        this.title,
        this.subject,
        this.description,
        this.author,
        this.extension,
        this.created,
        this.basedOn,
        this.resourceType,
        this.supportingInfo,
        this.language,
        this.instantiatesUri,
        this.contained,
        this.careTeam,
        newValue,
        this.activity,
        this.encounter,
        this.intent,
        this.contributor,
        this.goal,
        this.partOf,
        this.category,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CarePlan#instantiatesCanonical() instantiatesCanonical} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for instantiatesCanonical
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCarePlan withInstantiatesCanonical(java.util.Optional<? extends java.util.List<com.fhir.canonical>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.canonical> value = optional.orElse(null);
    if (this.instantiatesCanonical == value) return this;
    return new ImmutableCarePlan(
        this.meta,
        this.implicitRules,
        this.period,
        this.status,
        this.identifier,
        this.note,
        this.modifierExtension,
        this.addresses,
        this.text,
        this.replaces,
        this.title,
        this.subject,
        this.description,
        this.author,
        this.extension,
        this.created,
        this.basedOn,
        this.resourceType,
        this.supportingInfo,
        this.language,
        this.instantiatesUri,
        this.contained,
        this.careTeam,
        value,
        this.activity,
        this.encounter,
        this.intent,
        this.contributor,
        this.goal,
        this.partOf,
        this.category,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CarePlan#activity() activity} attribute.
   * @param value The value for activity
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCarePlan withActivity(java.util.List<com.fhir.CarePlan_Activity> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CarePlan_Activity> newValue = java.util.Objects.requireNonNull(value, "activity");
    if (this.activity == newValue) return this;
    return new ImmutableCarePlan(
        this.meta,
        this.implicitRules,
        this.period,
        this.status,
        this.identifier,
        this.note,
        this.modifierExtension,
        this.addresses,
        this.text,
        this.replaces,
        this.title,
        this.subject,
        this.description,
        this.author,
        this.extension,
        this.created,
        this.basedOn,
        this.resourceType,
        this.supportingInfo,
        this.language,
        this.instantiatesUri,
        this.contained,
        this.careTeam,
        this.instantiatesCanonical,
        newValue,
        this.encounter,
        this.intent,
        this.contributor,
        this.goal,
        this.partOf,
        this.category,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CarePlan#activity() activity} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for activity
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCarePlan withActivity(java.util.Optional<? extends java.util.List<com.fhir.CarePlan_Activity>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CarePlan_Activity> value = optional.orElse(null);
    if (this.activity == value) return this;
    return new ImmutableCarePlan(
        this.meta,
        this.implicitRules,
        this.period,
        this.status,
        this.identifier,
        this.note,
        this.modifierExtension,
        this.addresses,
        this.text,
        this.replaces,
        this.title,
        this.subject,
        this.description,
        this.author,
        this.extension,
        this.created,
        this.basedOn,
        this.resourceType,
        this.supportingInfo,
        this.language,
        this.instantiatesUri,
        this.contained,
        this.careTeam,
        this.instantiatesCanonical,
        value,
        this.encounter,
        this.intent,
        this.contributor,
        this.goal,
        this.partOf,
        this.category,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CarePlan#encounter() encounter} attribute.
   * @param value The value for encounter
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCarePlan withEncounter(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "encounter");
    if (this.encounter == newValue) return this;
    return new ImmutableCarePlan(
        this.meta,
        this.implicitRules,
        this.period,
        this.status,
        this.identifier,
        this.note,
        this.modifierExtension,
        this.addresses,
        this.text,
        this.replaces,
        this.title,
        this.subject,
        this.description,
        this.author,
        this.extension,
        this.created,
        this.basedOn,
        this.resourceType,
        this.supportingInfo,
        this.language,
        this.instantiatesUri,
        this.contained,
        this.careTeam,
        this.instantiatesCanonical,
        this.activity,
        newValue,
        this.intent,
        this.contributor,
        this.goal,
        this.partOf,
        this.category,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CarePlan#encounter() encounter} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for encounter
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCarePlan withEncounter(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.encounter == value) return this;
    return new ImmutableCarePlan(
        this.meta,
        this.implicitRules,
        this.period,
        this.status,
        this.identifier,
        this.note,
        this.modifierExtension,
        this.addresses,
        this.text,
        this.replaces,
        this.title,
        this.subject,
        this.description,
        this.author,
        this.extension,
        this.created,
        this.basedOn,
        this.resourceType,
        this.supportingInfo,
        this.language,
        this.instantiatesUri,
        this.contained,
        this.careTeam,
        this.instantiatesCanonical,
        this.activity,
        value,
        this.intent,
        this.contributor,
        this.goal,
        this.partOf,
        this.category,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CarePlan#intent() intent} attribute.
   * @param value The value for intent
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCarePlan withIntent(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "intent");
    if (this.intent == newValue) return this;
    return new ImmutableCarePlan(
        this.meta,
        this.implicitRules,
        this.period,
        this.status,
        this.identifier,
        this.note,
        this.modifierExtension,
        this.addresses,
        this.text,
        this.replaces,
        this.title,
        this.subject,
        this.description,
        this.author,
        this.extension,
        this.created,
        this.basedOn,
        this.resourceType,
        this.supportingInfo,
        this.language,
        this.instantiatesUri,
        this.contained,
        this.careTeam,
        this.instantiatesCanonical,
        this.activity,
        this.encounter,
        newValue,
        this.contributor,
        this.goal,
        this.partOf,
        this.category,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CarePlan#intent() intent} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for intent
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCarePlan withIntent(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.intent == value) return this;
    return new ImmutableCarePlan(
        this.meta,
        this.implicitRules,
        this.period,
        this.status,
        this.identifier,
        this.note,
        this.modifierExtension,
        this.addresses,
        this.text,
        this.replaces,
        this.title,
        this.subject,
        this.description,
        this.author,
        this.extension,
        this.created,
        this.basedOn,
        this.resourceType,
        this.supportingInfo,
        this.language,
        this.instantiatesUri,
        this.contained,
        this.careTeam,
        this.instantiatesCanonical,
        this.activity,
        this.encounter,
        value,
        this.contributor,
        this.goal,
        this.partOf,
        this.category,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CarePlan#contributor() contributor} attribute.
   * @param value The value for contributor
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCarePlan withContributor(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "contributor");
    if (this.contributor == newValue) return this;
    return new ImmutableCarePlan(
        this.meta,
        this.implicitRules,
        this.period,
        this.status,
        this.identifier,
        this.note,
        this.modifierExtension,
        this.addresses,
        this.text,
        this.replaces,
        this.title,
        this.subject,
        this.description,
        this.author,
        this.extension,
        this.created,
        this.basedOn,
        this.resourceType,
        this.supportingInfo,
        this.language,
        this.instantiatesUri,
        this.contained,
        this.careTeam,
        this.instantiatesCanonical,
        this.activity,
        this.encounter,
        this.intent,
        newValue,
        this.goal,
        this.partOf,
        this.category,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CarePlan#contributor() contributor} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contributor
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCarePlan withContributor(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.contributor == value) return this;
    return new ImmutableCarePlan(
        this.meta,
        this.implicitRules,
        this.period,
        this.status,
        this.identifier,
        this.note,
        this.modifierExtension,
        this.addresses,
        this.text,
        this.replaces,
        this.title,
        this.subject,
        this.description,
        this.author,
        this.extension,
        this.created,
        this.basedOn,
        this.resourceType,
        this.supportingInfo,
        this.language,
        this.instantiatesUri,
        this.contained,
        this.careTeam,
        this.instantiatesCanonical,
        this.activity,
        this.encounter,
        this.intent,
        value,
        this.goal,
        this.partOf,
        this.category,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CarePlan#goal() goal} attribute.
   * @param value The value for goal
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCarePlan withGoal(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "goal");
    if (this.goal == newValue) return this;
    return new ImmutableCarePlan(
        this.meta,
        this.implicitRules,
        this.period,
        this.status,
        this.identifier,
        this.note,
        this.modifierExtension,
        this.addresses,
        this.text,
        this.replaces,
        this.title,
        this.subject,
        this.description,
        this.author,
        this.extension,
        this.created,
        this.basedOn,
        this.resourceType,
        this.supportingInfo,
        this.language,
        this.instantiatesUri,
        this.contained,
        this.careTeam,
        this.instantiatesCanonical,
        this.activity,
        this.encounter,
        this.intent,
        this.contributor,
        newValue,
        this.partOf,
        this.category,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CarePlan#goal() goal} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for goal
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCarePlan withGoal(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.goal == value) return this;
    return new ImmutableCarePlan(
        this.meta,
        this.implicitRules,
        this.period,
        this.status,
        this.identifier,
        this.note,
        this.modifierExtension,
        this.addresses,
        this.text,
        this.replaces,
        this.title,
        this.subject,
        this.description,
        this.author,
        this.extension,
        this.created,
        this.basedOn,
        this.resourceType,
        this.supportingInfo,
        this.language,
        this.instantiatesUri,
        this.contained,
        this.careTeam,
        this.instantiatesCanonical,
        this.activity,
        this.encounter,
        this.intent,
        this.contributor,
        value,
        this.partOf,
        this.category,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CarePlan#partOf() partOf} attribute.
   * @param value The value for partOf
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCarePlan withPartOf(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "partOf");
    if (this.partOf == newValue) return this;
    return new ImmutableCarePlan(
        this.meta,
        this.implicitRules,
        this.period,
        this.status,
        this.identifier,
        this.note,
        this.modifierExtension,
        this.addresses,
        this.text,
        this.replaces,
        this.title,
        this.subject,
        this.description,
        this.author,
        this.extension,
        this.created,
        this.basedOn,
        this.resourceType,
        this.supportingInfo,
        this.language,
        this.instantiatesUri,
        this.contained,
        this.careTeam,
        this.instantiatesCanonical,
        this.activity,
        this.encounter,
        this.intent,
        this.contributor,
        this.goal,
        newValue,
        this.category,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CarePlan#partOf() partOf} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for partOf
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCarePlan withPartOf(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.partOf == value) return this;
    return new ImmutableCarePlan(
        this.meta,
        this.implicitRules,
        this.period,
        this.status,
        this.identifier,
        this.note,
        this.modifierExtension,
        this.addresses,
        this.text,
        this.replaces,
        this.title,
        this.subject,
        this.description,
        this.author,
        this.extension,
        this.created,
        this.basedOn,
        this.resourceType,
        this.supportingInfo,
        this.language,
        this.instantiatesUri,
        this.contained,
        this.careTeam,
        this.instantiatesCanonical,
        this.activity,
        this.encounter,
        this.intent,
        this.contributor,
        this.goal,
        value,
        this.category,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CarePlan#category() category} attribute.
   * @param value The value for category
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCarePlan withCategory(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "category");
    if (this.category == newValue) return this;
    return new ImmutableCarePlan(
        this.meta,
        this.implicitRules,
        this.period,
        this.status,
        this.identifier,
        this.note,
        this.modifierExtension,
        this.addresses,
        this.text,
        this.replaces,
        this.title,
        this.subject,
        this.description,
        this.author,
        this.extension,
        this.created,
        this.basedOn,
        this.resourceType,
        this.supportingInfo,
        this.language,
        this.instantiatesUri,
        this.contained,
        this.careTeam,
        this.instantiatesCanonical,
        this.activity,
        this.encounter,
        this.intent,
        this.contributor,
        this.goal,
        this.partOf,
        newValue,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CarePlan#category() category} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for category
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCarePlan withCategory(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.category == value) return this;
    return new ImmutableCarePlan(
        this.meta,
        this.implicitRules,
        this.period,
        this.status,
        this.identifier,
        this.note,
        this.modifierExtension,
        this.addresses,
        this.text,
        this.replaces,
        this.title,
        this.subject,
        this.description,
        this.author,
        this.extension,
        this.created,
        this.basedOn,
        this.resourceType,
        this.supportingInfo,
        this.language,
        this.instantiatesUri,
        this.contained,
        this.careTeam,
        this.instantiatesCanonical,
        this.activity,
        this.encounter,
        this.intent,
        this.contributor,
        this.goal,
        this.partOf,
        value,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CarePlan#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCarePlan withId(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableCarePlan(
        this.meta,
        this.implicitRules,
        this.period,
        this.status,
        this.identifier,
        this.note,
        this.modifierExtension,
        this.addresses,
        this.text,
        this.replaces,
        this.title,
        this.subject,
        this.description,
        this.author,
        this.extension,
        this.created,
        this.basedOn,
        this.resourceType,
        this.supportingInfo,
        this.language,
        this.instantiatesUri,
        this.contained,
        this.careTeam,
        this.instantiatesCanonical,
        this.activity,
        this.encounter,
        this.intent,
        this.contributor,
        this.goal,
        this.partOf,
        this.category,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CarePlan#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCarePlan withId(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableCarePlan(
        this.meta,
        this.implicitRules,
        this.period,
        this.status,
        this.identifier,
        this.note,
        this.modifierExtension,
        this.addresses,
        this.text,
        this.replaces,
        this.title,
        this.subject,
        this.description,
        this.author,
        this.extension,
        this.created,
        this.basedOn,
        this.resourceType,
        this.supportingInfo,
        this.language,
        this.instantiatesUri,
        this.contained,
        this.careTeam,
        this.instantiatesCanonical,
        this.activity,
        this.encounter,
        this.intent,
        this.contributor,
        this.goal,
        this.partOf,
        this.category,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableCarePlan} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableCarePlan
        && equalTo((ImmutableCarePlan) another);
  }

  private boolean equalTo(ImmutableCarePlan another) {
    return java.util.Objects.equals(meta, another.meta)
        && java.util.Objects.equals(implicitRules, another.implicitRules)
        && java.util.Objects.equals(period, another.period)
        && java.util.Objects.equals(status, another.status)
        && java.util.Objects.equals(identifier, another.identifier)
        && java.util.Objects.equals(note, another.note)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(addresses, another.addresses)
        && java.util.Objects.equals(text, another.text)
        && java.util.Objects.equals(replaces, another.replaces)
        && java.util.Objects.equals(title, another.title)
        && subject.equals(another.subject)
        && java.util.Objects.equals(description, another.description)
        && java.util.Objects.equals(author, another.author)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(created, another.created)
        && java.util.Objects.equals(basedOn, another.basedOn)
        && resourceType.equals(another.resourceType)
        && java.util.Objects.equals(supportingInfo, another.supportingInfo)
        && java.util.Objects.equals(language, another.language)
        && java.util.Objects.equals(instantiatesUri, another.instantiatesUri)
        && java.util.Objects.equals(contained, another.contained)
        && java.util.Objects.equals(careTeam, another.careTeam)
        && java.util.Objects.equals(instantiatesCanonical, another.instantiatesCanonical)
        && java.util.Objects.equals(activity, another.activity)
        && java.util.Objects.equals(encounter, another.encounter)
        && java.util.Objects.equals(intent, another.intent)
        && java.util.Objects.equals(contributor, another.contributor)
        && java.util.Objects.equals(goal, another.goal)
        && java.util.Objects.equals(partOf, another.partOf)
        && java.util.Objects.equals(category, another.category)
        && java.util.Objects.equals(id, another.id);
  }

  /**
   * Computes a hash code from attributes: {@code meta}, {@code implicitRules}, {@code period}, {@code status}, {@code identifier}, {@code note}, {@code modifierExtension}, {@code addresses}, {@code text}, {@code replaces}, {@code title}, {@code subject}, {@code description}, {@code author}, {@code extension}, {@code created}, {@code basedOn}, {@code resourceType}, {@code supportingInfo}, {@code language}, {@code instantiatesUri}, {@code contained}, {@code careTeam}, {@code instantiatesCanonical}, {@code activity}, {@code encounter}, {@code intent}, {@code contributor}, {@code goal}, {@code partOf}, {@code category}, {@code id}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(meta);
    h += (h << 5) + java.util.Objects.hashCode(implicitRules);
    h += (h << 5) + java.util.Objects.hashCode(period);
    h += (h << 5) + java.util.Objects.hashCode(status);
    h += (h << 5) + java.util.Objects.hashCode(identifier);
    h += (h << 5) + java.util.Objects.hashCode(note);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(addresses);
    h += (h << 5) + java.util.Objects.hashCode(text);
    h += (h << 5) + java.util.Objects.hashCode(replaces);
    h += (h << 5) + java.util.Objects.hashCode(title);
    h += (h << 5) + subject.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(description);
    h += (h << 5) + java.util.Objects.hashCode(author);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(created);
    h += (h << 5) + java.util.Objects.hashCode(basedOn);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(supportingInfo);
    h += (h << 5) + java.util.Objects.hashCode(language);
    h += (h << 5) + java.util.Objects.hashCode(instantiatesUri);
    h += (h << 5) + java.util.Objects.hashCode(contained);
    h += (h << 5) + java.util.Objects.hashCode(careTeam);
    h += (h << 5) + java.util.Objects.hashCode(instantiatesCanonical);
    h += (h << 5) + java.util.Objects.hashCode(activity);
    h += (h << 5) + java.util.Objects.hashCode(encounter);
    h += (h << 5) + java.util.Objects.hashCode(intent);
    h += (h << 5) + java.util.Objects.hashCode(contributor);
    h += (h << 5) + java.util.Objects.hashCode(goal);
    h += (h << 5) + java.util.Objects.hashCode(partOf);
    h += (h << 5) + java.util.Objects.hashCode(category);
    h += (h << 5) + java.util.Objects.hashCode(id);
    return h;
  }

  /**
   * Prints the immutable value {@code CarePlan} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("CarePlan{");
    if (meta != null) {
      builder.append("meta=").append(meta);
    }
    if (implicitRules != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (period != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("period=").append(period);
    }
    if (status != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("status=").append(status);
    }
    if (identifier != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (note != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("note=").append(note);
    }
    if (modifierExtension != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (addresses != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("addresses=").append(addresses);
    }
    if (text != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("text=").append(text);
    }
    if (replaces != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("replaces=").append(replaces);
    }
    if (title != null) {
      if (builder.length() > 9) builder.append(", ");
      builder.append("title=").append(title);
    }
    if (builder.length() > 9) builder.append(", ");
    builder.append("subject=").append(subject);
    if (description != null) {
      builder.append(", ");
      builder.append("description=").append(description);
    }
    if (author != null) {
      builder.append(", ");
      builder.append("author=").append(author);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (created != null) {
      builder.append(", ");
      builder.append("created=").append(created);
    }
    if (basedOn != null) {
      builder.append(", ");
      builder.append("basedOn=").append(basedOn);
    }
    builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (supportingInfo != null) {
      builder.append(", ");
      builder.append("supportingInfo=").append(supportingInfo);
    }
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (instantiatesUri != null) {
      builder.append(", ");
      builder.append("instantiatesUri=").append(instantiatesUri);
    }
    if (contained != null) {
      builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (careTeam != null) {
      builder.append(", ");
      builder.append("careTeam=").append(careTeam);
    }
    if (instantiatesCanonical != null) {
      builder.append(", ");
      builder.append("instantiatesCanonical=").append(instantiatesCanonical);
    }
    if (activity != null) {
      builder.append(", ");
      builder.append("activity=").append(activity);
    }
    if (encounter != null) {
      builder.append(", ");
      builder.append("encounter=").append(encounter);
    }
    if (intent != null) {
      builder.append(", ");
      builder.append("intent=").append(intent);
    }
    if (contributor != null) {
      builder.append(", ");
      builder.append("contributor=").append(contributor);
    }
    if (goal != null) {
      builder.append(", ");
      builder.append("goal=").append(goal);
    }
    if (partOf != null) {
      builder.append(", ");
      builder.append("partOf=").append(partOf);
    }
    if (category != null) {
      builder.append(", ");
      builder.append("category=").append(category);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "CarePlan", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.CarePlan {
    @javax.annotation.Nullable java.util.Optional<com.fhir.Meta> meta = java.util.Optional.empty();
    boolean metaIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> implicitRules = java.util.Optional.empty();
    boolean implicitRulesIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Period> period = java.util.Optional.empty();
    boolean periodIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> status = java.util.Optional.empty();
    boolean statusIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Identifier>> identifier = java.util.Optional.empty();
    boolean identifierIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Annotation>> note = java.util.Optional.empty();
    boolean noteIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> addresses = java.util.Optional.empty();
    boolean addressesIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Narrative> text = java.util.Optional.empty();
    boolean textIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> replaces = java.util.Optional.empty();
    boolean replacesIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> title = java.util.Optional.empty();
    boolean titleIsSet;
    @javax.annotation.Nullable com.fhir.Reference subject;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> description = java.util.Optional.empty();
    boolean descriptionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> author = java.util.Optional.empty();
    boolean authorIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.dateTime> created = java.util.Optional.empty();
    boolean createdIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> basedOn = java.util.Optional.empty();
    boolean basedOnIsSet;
    @javax.annotation.Nullable java.lang.String resourceType;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> supportingInfo = java.util.Optional.empty();
    boolean supportingInfoIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> language = java.util.Optional.empty();
    boolean languageIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.uri>> instantiatesUri = java.util.Optional.empty();
    boolean instantiatesUriIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ResourceList>> contained = java.util.Optional.empty();
    boolean containedIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> careTeam = java.util.Optional.empty();
    boolean careTeamIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.canonical>> instantiatesCanonical = java.util.Optional.empty();
    boolean instantiatesCanonicalIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CarePlan_Activity>> activity = java.util.Optional.empty();
    boolean activityIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> encounter = java.util.Optional.empty();
    boolean encounterIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> intent = java.util.Optional.empty();
    boolean intentIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> contributor = java.util.Optional.empty();
    boolean contributorIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> goal = java.util.Optional.empty();
    boolean goalIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> partOf = java.util.Optional.empty();
    boolean partOfIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> category = java.util.Optional.empty();
    boolean categoryIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> id = java.util.Optional.empty();
    boolean idIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("meta")
    public void setMeta(java.util.Optional<com.fhir.Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
    public void setImplicitRules(java.util.Optional<com.fhir.uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("period")
    public void setPeriod(java.util.Optional<com.fhir.Period> period) {
      this.period = period;
      this.periodIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public void setStatus(java.util.Optional<com.fhir.code> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    public void setIdentifier(java.util.Optional<java.util.List<com.fhir.Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("note")
    public void setNote(java.util.Optional<java.util.List<com.fhir.Annotation>> note) {
      this.note = note;
      this.noteIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("addresses")
    public void setAddresses(java.util.Optional<java.util.List<com.fhir.Reference>> addresses) {
      this.addresses = addresses;
      this.addressesIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    public void setText(java.util.Optional<com.fhir.Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("replaces")
    public void setReplaces(java.util.Optional<java.util.List<com.fhir.Reference>> replaces) {
      this.replaces = replaces;
      this.replacesIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("title")
    public void setTitle(java.util.Optional<java.lang.String> title) {
      this.title = title;
      this.titleIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("subject")
    public void setSubject(com.fhir.Reference subject) {
      this.subject = subject;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    public void setDescription(java.util.Optional<java.lang.String> description) {
      this.description = description;
      this.descriptionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("author")
    public void setAuthor(java.util.Optional<com.fhir.Reference> author) {
      this.author = author;
      this.authorIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("created")
    public void setCreated(java.util.Optional<com.fhir.dateTime> created) {
      this.created = created;
      this.createdIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("basedOn")
    public void setBasedOn(java.util.Optional<java.util.List<com.fhir.Reference>> basedOn) {
      this.basedOn = basedOn;
      this.basedOnIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public void setResourceType(java.lang.String resourceType) {
      this.resourceType = resourceType;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("supportingInfo")
    public void setSupportingInfo(java.util.Optional<java.util.List<com.fhir.Reference>> supportingInfo) {
      this.supportingInfo = supportingInfo;
      this.supportingInfoIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    public void setLanguage(java.util.Optional<com.fhir.code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("instantiatesUri")
    public void setInstantiatesUri(java.util.Optional<java.util.List<com.fhir.uri>> instantiatesUri) {
      this.instantiatesUri = instantiatesUri;
      this.instantiatesUriIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("contained")
    public void setContained(java.util.Optional<java.util.List<com.fhir.ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("careTeam")
    public void setCareTeam(java.util.Optional<java.util.List<com.fhir.Reference>> careTeam) {
      this.careTeam = careTeam;
      this.careTeamIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("instantiatesCanonical")
    public void setInstantiatesCanonical(java.util.Optional<java.util.List<com.fhir.canonical>> instantiatesCanonical) {
      this.instantiatesCanonical = instantiatesCanonical;
      this.instantiatesCanonicalIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("activity")
    public void setActivity(java.util.Optional<java.util.List<com.fhir.CarePlan_Activity>> activity) {
      this.activity = activity;
      this.activityIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("encounter")
    public void setEncounter(java.util.Optional<com.fhir.Reference> encounter) {
      this.encounter = encounter;
      this.encounterIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("intent")
    public void setIntent(java.util.Optional<com.fhir.code> intent) {
      this.intent = intent;
      this.intentIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("contributor")
    public void setContributor(java.util.Optional<java.util.List<com.fhir.Reference>> contributor) {
      this.contributor = contributor;
      this.contributorIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("goal")
    public void setGoal(java.util.Optional<java.util.List<com.fhir.Reference>> goal) {
      this.goal = goal;
      this.goalIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("partOf")
    public void setPartOf(java.util.Optional<java.util.List<com.fhir.Reference>> partOf) {
      this.partOf = partOf;
      this.partOfIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("category")
    public void setCategory(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> category) {
      this.category = category;
      this.categoryIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<com.fhir.id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @Override
    public java.util.Optional<com.fhir.Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Period> period() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> status() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Annotation>> note() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> addresses() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> replaces() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> title() { throw new UnsupportedOperationException(); }
    @Override
    public com.fhir.Reference subject() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> description() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> author() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.dateTime> created() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> basedOn() { throw new UnsupportedOperationException(); }
    @Override
    public java.lang.String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> supportingInfo() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> language() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.uri>> instantiatesUri() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> careTeam() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.canonical>> instantiatesCanonical() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CarePlan_Activity>> activity() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> encounter() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> intent() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> contributor() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> goal() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> partOf() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> category() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.id> id() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableCarePlan fromJson(Json json) {
    ImmutableCarePlan.Builder builder = ((ImmutableCarePlan.Builder) ImmutableCarePlan.builder());
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.periodIsSet) {
      builder.period(json.period);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.noteIsSet) {
      builder.note(json.note);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.addressesIsSet) {
      builder.addresses(json.addresses);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.replacesIsSet) {
      builder.replaces(json.replaces);
    }
    if (json.titleIsSet) {
      builder.title(json.title);
    }
    if (json.subject != null) {
      builder.subject(json.subject);
    }
    if (json.descriptionIsSet) {
      builder.description(json.description);
    }
    if (json.authorIsSet) {
      builder.author(json.author);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.createdIsSet) {
      builder.created(json.created);
    }
    if (json.basedOnIsSet) {
      builder.basedOn(json.basedOn);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.supportingInfoIsSet) {
      builder.supportingInfo(json.supportingInfo);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.instantiatesUriIsSet) {
      builder.instantiatesUri(json.instantiatesUri);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.careTeamIsSet) {
      builder.careTeam(json.careTeam);
    }
    if (json.instantiatesCanonicalIsSet) {
      builder.instantiatesCanonical(json.instantiatesCanonical);
    }
    if (json.activityIsSet) {
      builder.activity(json.activity);
    }
    if (json.encounterIsSet) {
      builder.encounter(json.encounter);
    }
    if (json.intentIsSet) {
      builder.intent(json.intent);
    }
    if (json.contributorIsSet) {
      builder.contributor(json.contributor);
    }
    if (json.goalIsSet) {
      builder.goal(json.goal);
    }
    if (json.partOfIsSet) {
      builder.partOf(json.partOf);
    }
    if (json.categoryIsSet) {
      builder.category(json.category);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    return (ImmutableCarePlan) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link CarePlan} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable CarePlan instance
   */
  public static CarePlan copyOf(CarePlan instance) {
    if (instance instanceof ImmutableCarePlan) {
      return (ImmutableCarePlan) instance;
    }
    return ((ImmutableCarePlan.Builder) ImmutableCarePlan.builder())
        .meta(instance.meta())
        .implicitRules(instance.implicitRules())
        .period(instance.period())
        .status(instance.status())
        .identifier(instance.identifier())
        .note(instance.note())
        .modifierExtension(instance.modifierExtension())
        .addresses(instance.addresses())
        .text(instance.text())
        .replaces(instance.replaces())
        .title(instance.title())
        .subject(instance.subject())
        .description(instance.description())
        .author(instance.author())
        .extension(instance.extension())
        .created(instance.created())
        .basedOn(instance.basedOn())
        .resourceType(instance.resourceType())
        .supportingInfo(instance.supportingInfo())
        .language(instance.language())
        .instantiatesUri(instance.instantiatesUri())
        .contained(instance.contained())
        .careTeam(instance.careTeam())
        .instantiatesCanonical(instance.instantiatesCanonical())
        .activity(instance.activity())
        .encounter(instance.encounter())
        .intent(instance.intent())
        .contributor(instance.contributor())
        .goal(instance.goal())
        .partOf(instance.partOf())
        .category(instance.category())
        .id(instance.id())
        .build();
  }

  /**
   * Creates a builder for {@link CarePlan CarePlan}.
   * <pre>
   * ImmutableCarePlan.builder()
   *    .meta(com.fhir.Meta) // optional {@link CarePlan#meta() meta}
   *    .implicitRules(com.fhir.uri) // optional {@link CarePlan#implicitRules() implicitRules}
   *    .period(com.fhir.Period) // optional {@link CarePlan#period() period}
   *    .status(com.fhir.code) // optional {@link CarePlan#status() status}
   *    .identifier(List&amp;lt;com.fhir.Identifier&amp;gt;) // optional {@link CarePlan#identifier() identifier}
   *    .note(List&amp;lt;com.fhir.Annotation&amp;gt;) // optional {@link CarePlan#note() note}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link CarePlan#modifierExtension() modifierExtension}
   *    .addresses(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link CarePlan#addresses() addresses}
   *    .text(com.fhir.Narrative) // optional {@link CarePlan#text() text}
   *    .replaces(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link CarePlan#replaces() replaces}
   *    .title(String) // optional {@link CarePlan#title() title}
   *    .subject(com.fhir.Reference) // required {@link CarePlan#subject() subject}
   *    .description(String) // optional {@link CarePlan#description() description}
   *    .author(com.fhir.Reference) // optional {@link CarePlan#author() author}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link CarePlan#extension() extension}
   *    .created(com.fhir.dateTime) // optional {@link CarePlan#created() created}
   *    .basedOn(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link CarePlan#basedOn() basedOn}
   *    .resourceType(String) // required {@link CarePlan#resourceType() resourceType}
   *    .supportingInfo(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link CarePlan#supportingInfo() supportingInfo}
   *    .language(com.fhir.code) // optional {@link CarePlan#language() language}
   *    .instantiatesUri(List&amp;lt;com.fhir.uri&amp;gt;) // optional {@link CarePlan#instantiatesUri() instantiatesUri}
   *    .contained(List&amp;lt;com.fhir.ResourceList&amp;gt;) // optional {@link CarePlan#contained() contained}
   *    .careTeam(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link CarePlan#careTeam() careTeam}
   *    .instantiatesCanonical(List&amp;lt;com.fhir.canonical&amp;gt;) // optional {@link CarePlan#instantiatesCanonical() instantiatesCanonical}
   *    .activity(List&amp;lt;com.fhir.CarePlan_Activity&amp;gt;) // optional {@link CarePlan#activity() activity}
   *    .encounter(com.fhir.Reference) // optional {@link CarePlan#encounter() encounter}
   *    .intent(com.fhir.code) // optional {@link CarePlan#intent() intent}
   *    .contributor(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link CarePlan#contributor() contributor}
   *    .goal(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link CarePlan#goal() goal}
   *    .partOf(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link CarePlan#partOf() partOf}
   *    .category(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link CarePlan#category() category}
   *    .id(com.fhir.id) // optional {@link CarePlan#id() id}
   *    .build();
   * </pre>
   * @return A new CarePlan builder
   */
  public static SubjectBuildStage builder() {
    return new ImmutableCarePlan.Builder();
  }

  /**
   * Builds instances of type {@link CarePlan CarePlan}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "CarePlan", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements SubjectBuildStage, ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_SUBJECT = 0x1L;
    private static final long INIT_BIT_RESOURCE_TYPE = 0x2L;
    private static final long OPT_BIT_META = 0x1L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x2L;
    private static final long OPT_BIT_PERIOD = 0x4L;
    private static final long OPT_BIT_STATUS = 0x8L;
    private static final long OPT_BIT_IDENTIFIER = 0x10L;
    private static final long OPT_BIT_NOTE = 0x20L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x40L;
    private static final long OPT_BIT_ADDRESSES = 0x80L;
    private static final long OPT_BIT_TEXT = 0x100L;
    private static final long OPT_BIT_REPLACES = 0x200L;
    private static final long OPT_BIT_TITLE = 0x400L;
    private static final long OPT_BIT_DESCRIPTION = 0x800L;
    private static final long OPT_BIT_AUTHOR = 0x1000L;
    private static final long OPT_BIT_EXTENSION = 0x2000L;
    private static final long OPT_BIT_CREATED = 0x4000L;
    private static final long OPT_BIT_BASED_ON = 0x8000L;
    private static final long OPT_BIT_SUPPORTING_INFO = 0x10000L;
    private static final long OPT_BIT_LANGUAGE = 0x20000L;
    private static final long OPT_BIT_INSTANTIATES_URI = 0x40000L;
    private static final long OPT_BIT_CONTAINED = 0x80000L;
    private static final long OPT_BIT_CARE_TEAM = 0x100000L;
    private static final long OPT_BIT_INSTANTIATES_CANONICAL = 0x200000L;
    private static final long OPT_BIT_ACTIVITY = 0x400000L;
    private static final long OPT_BIT_ENCOUNTER = 0x800000L;
    private static final long OPT_BIT_INTENT = 0x1000000L;
    private static final long OPT_BIT_CONTRIBUTOR = 0x2000000L;
    private static final long OPT_BIT_GOAL = 0x4000000L;
    private static final long OPT_BIT_PART_OF = 0x8000000L;
    private static final long OPT_BIT_CATEGORY = 0x10000000L;
    private static final long OPT_BIT_ID = 0x20000000L;
    private long initBits = 0x3L;
    private long optBits;

    private @javax.annotation.Nullable com.fhir.Meta meta;
    private @javax.annotation.Nullable com.fhir.uri implicitRules;
    private @javax.annotation.Nullable com.fhir.Period period;
    private @javax.annotation.Nullable com.fhir.code status;
    private @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
    private @javax.annotation.Nullable java.util.List<com.fhir.Annotation> note;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> addresses;
    private @javax.annotation.Nullable com.fhir.Narrative text;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> replaces;
    private @javax.annotation.Nullable java.lang.String title;
    private @javax.annotation.Nullable com.fhir.Reference subject;
    private @javax.annotation.Nullable java.lang.String description;
    private @javax.annotation.Nullable com.fhir.Reference author;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable com.fhir.dateTime created;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> basedOn;
    private @javax.annotation.Nullable java.lang.String resourceType;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> supportingInfo;
    private @javax.annotation.Nullable com.fhir.code language;
    private @javax.annotation.Nullable java.util.List<com.fhir.uri> instantiatesUri;
    private @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> careTeam;
    private @javax.annotation.Nullable java.util.List<com.fhir.canonical> instantiatesCanonical;
    private @javax.annotation.Nullable java.util.List<com.fhir.CarePlan_Activity> activity;
    private @javax.annotation.Nullable com.fhir.Reference encounter;
    private @javax.annotation.Nullable com.fhir.code intent;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> contributor;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> goal;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> partOf;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> category;
    private @javax.annotation.Nullable com.fhir.id id;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link CarePlan#meta() meta} to meta.
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
     * Initializes the optional value {@link CarePlan#meta() meta} to meta.
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
     * Initializes the optional value {@link CarePlan#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link CarePlan#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link CarePlan#period() period} to period.
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
     * Initializes the optional value {@link CarePlan#period() period} to period.
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
     * Initializes the optional value {@link CarePlan#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(com.fhir.code status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = java.util.Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link CarePlan#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public final Builder status(java.util.Optional<? extends com.fhir.code> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link CarePlan#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link CarePlan#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link CarePlan#note() note} to note.
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
     * Initializes the optional value {@link CarePlan#note() note} to note.
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
     * Initializes the optional value {@link CarePlan#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link CarePlan#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link CarePlan#addresses() addresses} to addresses.
     * @param addresses The value for addresses
     * @return {@code this} builder for chained invocation
     */
    public final Builder addresses(java.util.List<com.fhir.Reference> addresses) {
      checkNotIsSet(addressesIsSet(), "addresses");
      this.addresses = java.util.Objects.requireNonNull(addresses, "addresses");
      optBits |= OPT_BIT_ADDRESSES;
      return this;
    }

    /**
     * Initializes the optional value {@link CarePlan#addresses() addresses} to addresses.
     * @param addresses The value for addresses
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("addresses")
    public final Builder addresses(java.util.Optional<? extends java.util.List<com.fhir.Reference>> addresses) {
      checkNotIsSet(addressesIsSet(), "addresses");
      this.addresses = addresses.orElse(null);
      optBits |= OPT_BIT_ADDRESSES;
      return this;
    }

    /**
     * Initializes the optional value {@link CarePlan#text() text} to text.
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
     * Initializes the optional value {@link CarePlan#text() text} to text.
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
     * Initializes the optional value {@link CarePlan#replaces() replaces} to replaces.
     * @param replaces The value for replaces
     * @return {@code this} builder for chained invocation
     */
    public final Builder replaces(java.util.List<com.fhir.Reference> replaces) {
      checkNotIsSet(replacesIsSet(), "replaces");
      this.replaces = java.util.Objects.requireNonNull(replaces, "replaces");
      optBits |= OPT_BIT_REPLACES;
      return this;
    }

    /**
     * Initializes the optional value {@link CarePlan#replaces() replaces} to replaces.
     * @param replaces The value for replaces
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("replaces")
    public final Builder replaces(java.util.Optional<? extends java.util.List<com.fhir.Reference>> replaces) {
      checkNotIsSet(replacesIsSet(), "replaces");
      this.replaces = replaces.orElse(null);
      optBits |= OPT_BIT_REPLACES;
      return this;
    }

    /**
     * Initializes the optional value {@link CarePlan#title() title} to title.
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
     * Initializes the optional value {@link CarePlan#title() title} to title.
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
     * Initializes the value for the {@link CarePlan#subject() subject} attribute.
     * @param subject The value for subject 
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("subject")
    public final Builder subject(com.fhir.Reference subject) {
      checkNotIsSet(subjectIsSet(), "subject");
      this.subject = java.util.Objects.requireNonNull(subject, "subject");
      initBits &= ~INIT_BIT_SUBJECT;
      return this;
    }

    /**
     * Initializes the optional value {@link CarePlan#description() description} to description.
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
     * Initializes the optional value {@link CarePlan#description() description} to description.
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
     * Initializes the optional value {@link CarePlan#author() author} to author.
     * @param author The value for author
     * @return {@code this} builder for chained invocation
     */
    public final Builder author(com.fhir.Reference author) {
      checkNotIsSet(authorIsSet(), "author");
      this.author = java.util.Objects.requireNonNull(author, "author");
      optBits |= OPT_BIT_AUTHOR;
      return this;
    }

    /**
     * Initializes the optional value {@link CarePlan#author() author} to author.
     * @param author The value for author
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("author")
    public final Builder author(java.util.Optional<? extends com.fhir.Reference> author) {
      checkNotIsSet(authorIsSet(), "author");
      this.author = author.orElse(null);
      optBits |= OPT_BIT_AUTHOR;
      return this;
    }

    /**
     * Initializes the optional value {@link CarePlan#extension() extension} to extension.
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
     * Initializes the optional value {@link CarePlan#extension() extension} to extension.
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
     * Initializes the optional value {@link CarePlan#created() created} to created.
     * @param created The value for created
     * @return {@code this} builder for chained invocation
     */
    public final Builder created(com.fhir.dateTime created) {
      checkNotIsSet(createdIsSet(), "created");
      this.created = java.util.Objects.requireNonNull(created, "created");
      optBits |= OPT_BIT_CREATED;
      return this;
    }

    /**
     * Initializes the optional value {@link CarePlan#created() created} to created.
     * @param created The value for created
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("created")
    public final Builder created(java.util.Optional<? extends com.fhir.dateTime> created) {
      checkNotIsSet(createdIsSet(), "created");
      this.created = created.orElse(null);
      optBits |= OPT_BIT_CREATED;
      return this;
    }

    /**
     * Initializes the optional value {@link CarePlan#basedOn() basedOn} to basedOn.
     * @param basedOn The value for basedOn
     * @return {@code this} builder for chained invocation
     */
    public final Builder basedOn(java.util.List<com.fhir.Reference> basedOn) {
      checkNotIsSet(basedOnIsSet(), "basedOn");
      this.basedOn = java.util.Objects.requireNonNull(basedOn, "basedOn");
      optBits |= OPT_BIT_BASED_ON;
      return this;
    }

    /**
     * Initializes the optional value {@link CarePlan#basedOn() basedOn} to basedOn.
     * @param basedOn The value for basedOn
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("basedOn")
    public final Builder basedOn(java.util.Optional<? extends java.util.List<com.fhir.Reference>> basedOn) {
      checkNotIsSet(basedOnIsSet(), "basedOn");
      this.basedOn = basedOn.orElse(null);
      optBits |= OPT_BIT_BASED_ON;
      return this;
    }

    /**
     * Initializes the value for the {@link CarePlan#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link CarePlan#supportingInfo() supportingInfo} to supportingInfo.
     * @param supportingInfo The value for supportingInfo
     * @return {@code this} builder for chained invocation
     */
    public final Builder supportingInfo(java.util.List<com.fhir.Reference> supportingInfo) {
      checkNotIsSet(supportingInfoIsSet(), "supportingInfo");
      this.supportingInfo = java.util.Objects.requireNonNull(supportingInfo, "supportingInfo");
      optBits |= OPT_BIT_SUPPORTING_INFO;
      return this;
    }

    /**
     * Initializes the optional value {@link CarePlan#supportingInfo() supportingInfo} to supportingInfo.
     * @param supportingInfo The value for supportingInfo
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("supportingInfo")
    public final Builder supportingInfo(java.util.Optional<? extends java.util.List<com.fhir.Reference>> supportingInfo) {
      checkNotIsSet(supportingInfoIsSet(), "supportingInfo");
      this.supportingInfo = supportingInfo.orElse(null);
      optBits |= OPT_BIT_SUPPORTING_INFO;
      return this;
    }

    /**
     * Initializes the optional value {@link CarePlan#language() language} to language.
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
     * Initializes the optional value {@link CarePlan#language() language} to language.
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
     * Initializes the optional value {@link CarePlan#instantiatesUri() instantiatesUri} to instantiatesUri.
     * @param instantiatesUri The value for instantiatesUri
     * @return {@code this} builder for chained invocation
     */
    public final Builder instantiatesUri(java.util.List<com.fhir.uri> instantiatesUri) {
      checkNotIsSet(instantiatesUriIsSet(), "instantiatesUri");
      this.instantiatesUri = java.util.Objects.requireNonNull(instantiatesUri, "instantiatesUri");
      optBits |= OPT_BIT_INSTANTIATES_URI;
      return this;
    }

    /**
     * Initializes the optional value {@link CarePlan#instantiatesUri() instantiatesUri} to instantiatesUri.
     * @param instantiatesUri The value for instantiatesUri
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("instantiatesUri")
    public final Builder instantiatesUri(java.util.Optional<? extends java.util.List<com.fhir.uri>> instantiatesUri) {
      checkNotIsSet(instantiatesUriIsSet(), "instantiatesUri");
      this.instantiatesUri = instantiatesUri.orElse(null);
      optBits |= OPT_BIT_INSTANTIATES_URI;
      return this;
    }

    /**
     * Initializes the optional value {@link CarePlan#contained() contained} to contained.
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
     * Initializes the optional value {@link CarePlan#contained() contained} to contained.
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
     * Initializes the optional value {@link CarePlan#careTeam() careTeam} to careTeam.
     * @param careTeam The value for careTeam
     * @return {@code this} builder for chained invocation
     */
    public final Builder careTeam(java.util.List<com.fhir.Reference> careTeam) {
      checkNotIsSet(careTeamIsSet(), "careTeam");
      this.careTeam = java.util.Objects.requireNonNull(careTeam, "careTeam");
      optBits |= OPT_BIT_CARE_TEAM;
      return this;
    }

    /**
     * Initializes the optional value {@link CarePlan#careTeam() careTeam} to careTeam.
     * @param careTeam The value for careTeam
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("careTeam")
    public final Builder careTeam(java.util.Optional<? extends java.util.List<com.fhir.Reference>> careTeam) {
      checkNotIsSet(careTeamIsSet(), "careTeam");
      this.careTeam = careTeam.orElse(null);
      optBits |= OPT_BIT_CARE_TEAM;
      return this;
    }

    /**
     * Initializes the optional value {@link CarePlan#instantiatesCanonical() instantiatesCanonical} to instantiatesCanonical.
     * @param instantiatesCanonical The value for instantiatesCanonical
     * @return {@code this} builder for chained invocation
     */
    public final Builder instantiatesCanonical(java.util.List<com.fhir.canonical> instantiatesCanonical) {
      checkNotIsSet(instantiatesCanonicalIsSet(), "instantiatesCanonical");
      this.instantiatesCanonical = java.util.Objects.requireNonNull(instantiatesCanonical, "instantiatesCanonical");
      optBits |= OPT_BIT_INSTANTIATES_CANONICAL;
      return this;
    }

    /**
     * Initializes the optional value {@link CarePlan#instantiatesCanonical() instantiatesCanonical} to instantiatesCanonical.
     * @param instantiatesCanonical The value for instantiatesCanonical
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("instantiatesCanonical")
    public final Builder instantiatesCanonical(java.util.Optional<? extends java.util.List<com.fhir.canonical>> instantiatesCanonical) {
      checkNotIsSet(instantiatesCanonicalIsSet(), "instantiatesCanonical");
      this.instantiatesCanonical = instantiatesCanonical.orElse(null);
      optBits |= OPT_BIT_INSTANTIATES_CANONICAL;
      return this;
    }

    /**
     * Initializes the optional value {@link CarePlan#activity() activity} to activity.
     * @param activity The value for activity
     * @return {@code this} builder for chained invocation
     */
    public final Builder activity(java.util.List<com.fhir.CarePlan_Activity> activity) {
      checkNotIsSet(activityIsSet(), "activity");
      this.activity = java.util.Objects.requireNonNull(activity, "activity");
      optBits |= OPT_BIT_ACTIVITY;
      return this;
    }

    /**
     * Initializes the optional value {@link CarePlan#activity() activity} to activity.
     * @param activity The value for activity
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("activity")
    public final Builder activity(java.util.Optional<? extends java.util.List<com.fhir.CarePlan_Activity>> activity) {
      checkNotIsSet(activityIsSet(), "activity");
      this.activity = activity.orElse(null);
      optBits |= OPT_BIT_ACTIVITY;
      return this;
    }

    /**
     * Initializes the optional value {@link CarePlan#encounter() encounter} to encounter.
     * @param encounter The value for encounter
     * @return {@code this} builder for chained invocation
     */
    public final Builder encounter(com.fhir.Reference encounter) {
      checkNotIsSet(encounterIsSet(), "encounter");
      this.encounter = java.util.Objects.requireNonNull(encounter, "encounter");
      optBits |= OPT_BIT_ENCOUNTER;
      return this;
    }

    /**
     * Initializes the optional value {@link CarePlan#encounter() encounter} to encounter.
     * @param encounter The value for encounter
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("encounter")
    public final Builder encounter(java.util.Optional<? extends com.fhir.Reference> encounter) {
      checkNotIsSet(encounterIsSet(), "encounter");
      this.encounter = encounter.orElse(null);
      optBits |= OPT_BIT_ENCOUNTER;
      return this;
    }

    /**
     * Initializes the optional value {@link CarePlan#intent() intent} to intent.
     * @param intent The value for intent
     * @return {@code this} builder for chained invocation
     */
    public final Builder intent(com.fhir.code intent) {
      checkNotIsSet(intentIsSet(), "intent");
      this.intent = java.util.Objects.requireNonNull(intent, "intent");
      optBits |= OPT_BIT_INTENT;
      return this;
    }

    /**
     * Initializes the optional value {@link CarePlan#intent() intent} to intent.
     * @param intent The value for intent
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("intent")
    public final Builder intent(java.util.Optional<? extends com.fhir.code> intent) {
      checkNotIsSet(intentIsSet(), "intent");
      this.intent = intent.orElse(null);
      optBits |= OPT_BIT_INTENT;
      return this;
    }

    /**
     * Initializes the optional value {@link CarePlan#contributor() contributor} to contributor.
     * @param contributor The value for contributor
     * @return {@code this} builder for chained invocation
     */
    public final Builder contributor(java.util.List<com.fhir.Reference> contributor) {
      checkNotIsSet(contributorIsSet(), "contributor");
      this.contributor = java.util.Objects.requireNonNull(contributor, "contributor");
      optBits |= OPT_BIT_CONTRIBUTOR;
      return this;
    }

    /**
     * Initializes the optional value {@link CarePlan#contributor() contributor} to contributor.
     * @param contributor The value for contributor
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("contributor")
    public final Builder contributor(java.util.Optional<? extends java.util.List<com.fhir.Reference>> contributor) {
      checkNotIsSet(contributorIsSet(), "contributor");
      this.contributor = contributor.orElse(null);
      optBits |= OPT_BIT_CONTRIBUTOR;
      return this;
    }

    /**
     * Initializes the optional value {@link CarePlan#goal() goal} to goal.
     * @param goal The value for goal
     * @return {@code this} builder for chained invocation
     */
    public final Builder goal(java.util.List<com.fhir.Reference> goal) {
      checkNotIsSet(goalIsSet(), "goal");
      this.goal = java.util.Objects.requireNonNull(goal, "goal");
      optBits |= OPT_BIT_GOAL;
      return this;
    }

    /**
     * Initializes the optional value {@link CarePlan#goal() goal} to goal.
     * @param goal The value for goal
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("goal")
    public final Builder goal(java.util.Optional<? extends java.util.List<com.fhir.Reference>> goal) {
      checkNotIsSet(goalIsSet(), "goal");
      this.goal = goal.orElse(null);
      optBits |= OPT_BIT_GOAL;
      return this;
    }

    /**
     * Initializes the optional value {@link CarePlan#partOf() partOf} to partOf.
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
     * Initializes the optional value {@link CarePlan#partOf() partOf} to partOf.
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
     * Initializes the optional value {@link CarePlan#category() category} to category.
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
     * Initializes the optional value {@link CarePlan#category() category} to category.
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
     * Initializes the optional value {@link CarePlan#id() id} to id.
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
     * Initializes the optional value {@link CarePlan#id() id} to id.
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
     * Builds a new {@link CarePlan CarePlan}.
     * @return An immutable instance of CarePlan
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.CarePlan build() {
      checkRequiredAttributes();
      return new ImmutableCarePlan(
          meta,
          implicitRules,
          period,
          status,
          identifier,
          note,
          modifierExtension,
          addresses,
          text,
          replaces,
          title,
          subject,
          description,
          author,
          extension,
          created,
          basedOn,
          resourceType,
          supportingInfo,
          language,
          instantiatesUri,
          contained,
          careTeam,
          instantiatesCanonical,
          activity,
          encounter,
          intent,
          contributor,
          goal,
          partOf,
          category,
          id);
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean periodIsSet() {
      return (optBits & OPT_BIT_PERIOD) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean noteIsSet() {
      return (optBits & OPT_BIT_NOTE) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean addressesIsSet() {
      return (optBits & OPT_BIT_ADDRESSES) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean replacesIsSet() {
      return (optBits & OPT_BIT_REPLACES) != 0;
    }

    private boolean titleIsSet() {
      return (optBits & OPT_BIT_TITLE) != 0;
    }

    private boolean descriptionIsSet() {
      return (optBits & OPT_BIT_DESCRIPTION) != 0;
    }

    private boolean authorIsSet() {
      return (optBits & OPT_BIT_AUTHOR) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean createdIsSet() {
      return (optBits & OPT_BIT_CREATED) != 0;
    }

    private boolean basedOnIsSet() {
      return (optBits & OPT_BIT_BASED_ON) != 0;
    }

    private boolean supportingInfoIsSet() {
      return (optBits & OPT_BIT_SUPPORTING_INFO) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean instantiatesUriIsSet() {
      return (optBits & OPT_BIT_INSTANTIATES_URI) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean careTeamIsSet() {
      return (optBits & OPT_BIT_CARE_TEAM) != 0;
    }

    private boolean instantiatesCanonicalIsSet() {
      return (optBits & OPT_BIT_INSTANTIATES_CANONICAL) != 0;
    }

    private boolean activityIsSet() {
      return (optBits & OPT_BIT_ACTIVITY) != 0;
    }

    private boolean encounterIsSet() {
      return (optBits & OPT_BIT_ENCOUNTER) != 0;
    }

    private boolean intentIsSet() {
      return (optBits & OPT_BIT_INTENT) != 0;
    }

    private boolean contributorIsSet() {
      return (optBits & OPT_BIT_CONTRIBUTOR) != 0;
    }

    private boolean goalIsSet() {
      return (optBits & OPT_BIT_GOAL) != 0;
    }

    private boolean partOfIsSet() {
      return (optBits & OPT_BIT_PART_OF) != 0;
    }

    private boolean categoryIsSet() {
      return (optBits & OPT_BIT_CATEGORY) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean subjectIsSet() {
      return (initBits & INIT_BIT_SUBJECT) == 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of CarePlan is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!subjectIsSet()) attributes.add("subject");
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build CarePlan, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "CarePlan", generator = "Immutables")
  public interface SubjectBuildStage {
    /**
     * Initializes the value for the {@link CarePlan#subject() subject} attribute.
     * @param subject The value for subject 
     * @return {@code this} builder for use in a chained invocation
     */
    ResourceTypeBuildStage subject(com.fhir.Reference subject);
  }

  @org.immutables.value.Generated(from = "CarePlan", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link CarePlan#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(java.lang.String resourceType);
  }

  @org.immutables.value.Generated(from = "CarePlan", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link CarePlan#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(com.fhir.Meta meta);

    /**
     * Initializes the optional value {@link CarePlan#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(java.util.Optional<? extends com.fhir.Meta> meta);

    /**
     * Initializes the optional value {@link CarePlan#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(com.fhir.uri implicitRules);

    /**
     * Initializes the optional value {@link CarePlan#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(java.util.Optional<? extends com.fhir.uri> implicitRules);

    /**
     * Initializes the optional value {@link CarePlan#period() period} to period.
     * @param period The value for period
     * @return {@code this} builder for chained invocation
     */
    BuildFinal period(com.fhir.Period period);

    /**
     * Initializes the optional value {@link CarePlan#period() period} to period.
     * @param period The value for period
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal period(java.util.Optional<? extends com.fhir.Period> period);

    /**
     * Initializes the optional value {@link CarePlan#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(com.fhir.code status);

    /**
     * Initializes the optional value {@link CarePlan#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(java.util.Optional<? extends com.fhir.code> status);

    /**
     * Initializes the optional value {@link CarePlan#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(java.util.List<com.fhir.Identifier> identifier);

    /**
     * Initializes the optional value {@link CarePlan#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> identifier);

    /**
     * Initializes the optional value {@link CarePlan#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for chained invocation
     */
    BuildFinal note(java.util.List<com.fhir.Annotation> note);

    /**
     * Initializes the optional value {@link CarePlan#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal note(java.util.Optional<? extends java.util.List<com.fhir.Annotation>> note);

    /**
     * Initializes the optional value {@link CarePlan#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(java.util.List<com.fhir.Extension> modifierExtension);

    /**
     * Initializes the optional value {@link CarePlan#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link CarePlan#addresses() addresses} to addresses.
     * @param addresses The value for addresses
     * @return {@code this} builder for chained invocation
     */
    BuildFinal addresses(java.util.List<com.fhir.Reference> addresses);

    /**
     * Initializes the optional value {@link CarePlan#addresses() addresses} to addresses.
     * @param addresses The value for addresses
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addresses(java.util.Optional<? extends java.util.List<com.fhir.Reference>> addresses);

    /**
     * Initializes the optional value {@link CarePlan#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(com.fhir.Narrative text);

    /**
     * Initializes the optional value {@link CarePlan#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(java.util.Optional<? extends com.fhir.Narrative> text);

    /**
     * Initializes the optional value {@link CarePlan#replaces() replaces} to replaces.
     * @param replaces The value for replaces
     * @return {@code this} builder for chained invocation
     */
    BuildFinal replaces(java.util.List<com.fhir.Reference> replaces);

    /**
     * Initializes the optional value {@link CarePlan#replaces() replaces} to replaces.
     * @param replaces The value for replaces
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal replaces(java.util.Optional<? extends java.util.List<com.fhir.Reference>> replaces);

    /**
     * Initializes the optional value {@link CarePlan#title() title} to title.
     * @param title The value for title
     * @return {@code this} builder for chained invocation
     */
    BuildFinal title(java.lang.String title);

    /**
     * Initializes the optional value {@link CarePlan#title() title} to title.
     * @param title The value for title
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal title(java.util.Optional<java.lang.String> title);

    /**
     * Initializes the optional value {@link CarePlan#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for chained invocation
     */
    BuildFinal description(java.lang.String description);

    /**
     * Initializes the optional value {@link CarePlan#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal description(java.util.Optional<java.lang.String> description);

    /**
     * Initializes the optional value {@link CarePlan#author() author} to author.
     * @param author The value for author
     * @return {@code this} builder for chained invocation
     */
    BuildFinal author(com.fhir.Reference author);

    /**
     * Initializes the optional value {@link CarePlan#author() author} to author.
     * @param author The value for author
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal author(java.util.Optional<? extends com.fhir.Reference> author);

    /**
     * Initializes the optional value {@link CarePlan#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link CarePlan#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Initializes the optional value {@link CarePlan#created() created} to created.
     * @param created The value for created
     * @return {@code this} builder for chained invocation
     */
    BuildFinal created(com.fhir.dateTime created);

    /**
     * Initializes the optional value {@link CarePlan#created() created} to created.
     * @param created The value for created
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal created(java.util.Optional<? extends com.fhir.dateTime> created);

    /**
     * Initializes the optional value {@link CarePlan#basedOn() basedOn} to basedOn.
     * @param basedOn The value for basedOn
     * @return {@code this} builder for chained invocation
     */
    BuildFinal basedOn(java.util.List<com.fhir.Reference> basedOn);

    /**
     * Initializes the optional value {@link CarePlan#basedOn() basedOn} to basedOn.
     * @param basedOn The value for basedOn
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal basedOn(java.util.Optional<? extends java.util.List<com.fhir.Reference>> basedOn);

    /**
     * Initializes the optional value {@link CarePlan#supportingInfo() supportingInfo} to supportingInfo.
     * @param supportingInfo The value for supportingInfo
     * @return {@code this} builder for chained invocation
     */
    BuildFinal supportingInfo(java.util.List<com.fhir.Reference> supportingInfo);

    /**
     * Initializes the optional value {@link CarePlan#supportingInfo() supportingInfo} to supportingInfo.
     * @param supportingInfo The value for supportingInfo
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal supportingInfo(java.util.Optional<? extends java.util.List<com.fhir.Reference>> supportingInfo);

    /**
     * Initializes the optional value {@link CarePlan#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(com.fhir.code language);

    /**
     * Initializes the optional value {@link CarePlan#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(java.util.Optional<? extends com.fhir.code> language);

    /**
     * Initializes the optional value {@link CarePlan#instantiatesUri() instantiatesUri} to instantiatesUri.
     * @param instantiatesUri The value for instantiatesUri
     * @return {@code this} builder for chained invocation
     */
    BuildFinal instantiatesUri(java.util.List<com.fhir.uri> instantiatesUri);

    /**
     * Initializes the optional value {@link CarePlan#instantiatesUri() instantiatesUri} to instantiatesUri.
     * @param instantiatesUri The value for instantiatesUri
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal instantiatesUri(java.util.Optional<? extends java.util.List<com.fhir.uri>> instantiatesUri);

    /**
     * Initializes the optional value {@link CarePlan#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(java.util.List<com.fhir.ResourceList> contained);

    /**
     * Initializes the optional value {@link CarePlan#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> contained);

    /**
     * Initializes the optional value {@link CarePlan#careTeam() careTeam} to careTeam.
     * @param careTeam The value for careTeam
     * @return {@code this} builder for chained invocation
     */
    BuildFinal careTeam(java.util.List<com.fhir.Reference> careTeam);

    /**
     * Initializes the optional value {@link CarePlan#careTeam() careTeam} to careTeam.
     * @param careTeam The value for careTeam
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal careTeam(java.util.Optional<? extends java.util.List<com.fhir.Reference>> careTeam);

    /**
     * Initializes the optional value {@link CarePlan#instantiatesCanonical() instantiatesCanonical} to instantiatesCanonical.
     * @param instantiatesCanonical The value for instantiatesCanonical
     * @return {@code this} builder for chained invocation
     */
    BuildFinal instantiatesCanonical(java.util.List<com.fhir.canonical> instantiatesCanonical);

    /**
     * Initializes the optional value {@link CarePlan#instantiatesCanonical() instantiatesCanonical} to instantiatesCanonical.
     * @param instantiatesCanonical The value for instantiatesCanonical
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal instantiatesCanonical(java.util.Optional<? extends java.util.List<com.fhir.canonical>> instantiatesCanonical);

    /**
     * Initializes the optional value {@link CarePlan#activity() activity} to activity.
     * @param activity The value for activity
     * @return {@code this} builder for chained invocation
     */
    BuildFinal activity(java.util.List<com.fhir.CarePlan_Activity> activity);

    /**
     * Initializes the optional value {@link CarePlan#activity() activity} to activity.
     * @param activity The value for activity
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal activity(java.util.Optional<? extends java.util.List<com.fhir.CarePlan_Activity>> activity);

    /**
     * Initializes the optional value {@link CarePlan#encounter() encounter} to encounter.
     * @param encounter The value for encounter
     * @return {@code this} builder for chained invocation
     */
    BuildFinal encounter(com.fhir.Reference encounter);

    /**
     * Initializes the optional value {@link CarePlan#encounter() encounter} to encounter.
     * @param encounter The value for encounter
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal encounter(java.util.Optional<? extends com.fhir.Reference> encounter);

    /**
     * Initializes the optional value {@link CarePlan#intent() intent} to intent.
     * @param intent The value for intent
     * @return {@code this} builder for chained invocation
     */
    BuildFinal intent(com.fhir.code intent);

    /**
     * Initializes the optional value {@link CarePlan#intent() intent} to intent.
     * @param intent The value for intent
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal intent(java.util.Optional<? extends com.fhir.code> intent);

    /**
     * Initializes the optional value {@link CarePlan#contributor() contributor} to contributor.
     * @param contributor The value for contributor
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contributor(java.util.List<com.fhir.Reference> contributor);

    /**
     * Initializes the optional value {@link CarePlan#contributor() contributor} to contributor.
     * @param contributor The value for contributor
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contributor(java.util.Optional<? extends java.util.List<com.fhir.Reference>> contributor);

    /**
     * Initializes the optional value {@link CarePlan#goal() goal} to goal.
     * @param goal The value for goal
     * @return {@code this} builder for chained invocation
     */
    BuildFinal goal(java.util.List<com.fhir.Reference> goal);

    /**
     * Initializes the optional value {@link CarePlan#goal() goal} to goal.
     * @param goal The value for goal
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal goal(java.util.Optional<? extends java.util.List<com.fhir.Reference>> goal);

    /**
     * Initializes the optional value {@link CarePlan#partOf() partOf} to partOf.
     * @param partOf The value for partOf
     * @return {@code this} builder for chained invocation
     */
    BuildFinal partOf(java.util.List<com.fhir.Reference> partOf);

    /**
     * Initializes the optional value {@link CarePlan#partOf() partOf} to partOf.
     * @param partOf The value for partOf
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal partOf(java.util.Optional<? extends java.util.List<com.fhir.Reference>> partOf);

    /**
     * Initializes the optional value {@link CarePlan#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for chained invocation
     */
    BuildFinal category(java.util.List<com.fhir.CodeableConcept> category);

    /**
     * Initializes the optional value {@link CarePlan#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal category(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> category);

    /**
     * Initializes the optional value {@link CarePlan#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(com.fhir.id id);

    /**
     * Initializes the optional value {@link CarePlan#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<? extends com.fhir.id> id);

    /**
     * Builds a new {@link CarePlan CarePlan}.
     * @return An immutable instance of CarePlan
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    CarePlan build();
  }
}
