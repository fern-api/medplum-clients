//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link Task}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableTask.builder()}.
 */
@org.immutables.value.Generated(from = "Task", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableTask implements com.fhir.Task {
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> basedOn;
  private final @javax.annotation.Nullable com.fhir.uri implicitRules;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept statusReason;
  private final @javax.annotation.Nullable com.fhir.Reference _for;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable com.fhir.uri instantiatesUri;
  private final @javax.annotation.Nullable com.fhir.TaskIntent intent;
  private final @javax.annotation.Nullable com.fhir.Identifier groupIdentifier;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Annotation> note;
  private final @javax.annotation.Nullable com.fhir.TaskStatus status;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Task_Output> output;
  private final @javax.annotation.Nullable com.fhir.Reference owner;
  private final @javax.annotation.Nullable com.fhir.id id;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept code;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Task_Input> input;
  private final @javax.annotation.Nullable com.fhir.Narrative text;
  private final @javax.annotation.Nullable com.fhir.Task_Restriction restriction;
  private final @javax.annotation.Nullable com.fhir.Reference encounter;
  private final @javax.annotation.Nullable com.fhir.Reference focus;
  private final @javax.annotation.Nullable com.fhir.Reference location;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
  private final @javax.annotation.Nullable com.fhir.Reference requester;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> performerType;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> insurance;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> relevantHistory;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable com.fhir.dateTime lastModified;
  private final @javax.annotation.Nullable com.fhir.canonical instantiatesCanonical;
  private final @javax.annotation.Nullable com.fhir.Period executionPeriod;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept businessStatus;
  private final @javax.annotation.Nullable com.fhir.Reference reasonReference;
  private final @javax.annotation.Nullable com.fhir.Meta meta;
  private final @javax.annotation.Nullable java.lang.String description;
  private final @javax.annotation.Nullable com.fhir.dateTime authoredOn;
  private final java.lang.String resourceType;
  private final @javax.annotation.Nullable com.fhir.code language;
  private final @javax.annotation.Nullable com.fhir.code priority;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> partOf;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept reasonCode;

  private ImmutableTask(
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> basedOn,
      @javax.annotation.Nullable com.fhir.uri implicitRules,
      @javax.annotation.Nullable com.fhir.CodeableConcept statusReason,
      @javax.annotation.Nullable com.fhir.Reference _for,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable com.fhir.uri instantiatesUri,
      @javax.annotation.Nullable com.fhir.TaskIntent intent,
      @javax.annotation.Nullable com.fhir.Identifier groupIdentifier,
      @javax.annotation.Nullable java.util.List<com.fhir.Annotation> note,
      @javax.annotation.Nullable com.fhir.TaskStatus status,
      @javax.annotation.Nullable java.util.List<com.fhir.Task_Output> output,
      @javax.annotation.Nullable com.fhir.Reference owner,
      @javax.annotation.Nullable com.fhir.id id,
      @javax.annotation.Nullable com.fhir.CodeableConcept code,
      @javax.annotation.Nullable java.util.List<com.fhir.Task_Input> input,
      @javax.annotation.Nullable com.fhir.Narrative text,
      @javax.annotation.Nullable com.fhir.Task_Restriction restriction,
      @javax.annotation.Nullable com.fhir.Reference encounter,
      @javax.annotation.Nullable com.fhir.Reference focus,
      @javax.annotation.Nullable com.fhir.Reference location,
      @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier,
      @javax.annotation.Nullable com.fhir.Reference requester,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> performerType,
      @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> insurance,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> relevantHistory,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable com.fhir.dateTime lastModified,
      @javax.annotation.Nullable com.fhir.canonical instantiatesCanonical,
      @javax.annotation.Nullable com.fhir.Period executionPeriod,
      @javax.annotation.Nullable com.fhir.CodeableConcept businessStatus,
      @javax.annotation.Nullable com.fhir.Reference reasonReference,
      @javax.annotation.Nullable com.fhir.Meta meta,
      @javax.annotation.Nullable java.lang.String description,
      @javax.annotation.Nullable com.fhir.dateTime authoredOn,
      java.lang.String resourceType,
      @javax.annotation.Nullable com.fhir.code language,
      @javax.annotation.Nullable com.fhir.code priority,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> partOf,
      @javax.annotation.Nullable com.fhir.CodeableConcept reasonCode) {
    this.basedOn = basedOn;
    this.implicitRules = implicitRules;
    this.statusReason = statusReason;
    this._for = _for;
    this.extension = extension;
    this.instantiatesUri = instantiatesUri;
    this.intent = intent;
    this.groupIdentifier = groupIdentifier;
    this.note = note;
    this.status = status;
    this.output = output;
    this.owner = owner;
    this.id = id;
    this.code = code;
    this.input = input;
    this.text = text;
    this.restriction = restriction;
    this.encounter = encounter;
    this.focus = focus;
    this.location = location;
    this.identifier = identifier;
    this.requester = requester;
    this.performerType = performerType;
    this.contained = contained;
    this.insurance = insurance;
    this.relevantHistory = relevantHistory;
    this.modifierExtension = modifierExtension;
    this.lastModified = lastModified;
    this.instantiatesCanonical = instantiatesCanonical;
    this.executionPeriod = executionPeriod;
    this.businessStatus = businessStatus;
    this.reasonReference = reasonReference;
    this.meta = meta;
    this.description = description;
    this.authoredOn = authoredOn;
    this.resourceType = resourceType;
    this.language = language;
    this.priority = priority;
    this.partOf = partOf;
    this.reasonCode = reasonCode;
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
   * @return The value of the {@code implicitRules} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
  @Override
  public java.util.Optional<com.fhir.uri> implicitRules() {
    return java.util.Optional.ofNullable(implicitRules);
  }

  /**
   * @return The value of the {@code statusReason} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("statusReason")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> statusReason() {
    return java.util.Optional.ofNullable(statusReason);
  }

  /**
   * @return The value of the {@code _for} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("for")
  @Override
  public java.util.Optional<com.fhir.Reference> _for() {
    return java.util.Optional.ofNullable(_for);
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
   * @return The value of the {@code instantiatesUri} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("instantiatesUri")
  @Override
  public java.util.Optional<com.fhir.uri> instantiatesUri() {
    return java.util.Optional.ofNullable(instantiatesUri);
  }

  /**
   * @return The value of the {@code intent} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("intent")
  @Override
  public java.util.Optional<com.fhir.TaskIntent> intent() {
    return java.util.Optional.ofNullable(intent);
  }

  /**
   * @return The value of the {@code groupIdentifier} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("groupIdentifier")
  @Override
  public java.util.Optional<com.fhir.Identifier> groupIdentifier() {
    return java.util.Optional.ofNullable(groupIdentifier);
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
   * @return The value of the {@code status} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("status")
  @Override
  public java.util.Optional<com.fhir.TaskStatus> status() {
    return java.util.Optional.ofNullable(status);
  }

  /**
   * @return The value of the {@code output} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("output")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Task_Output>> output() {
    return java.util.Optional.ofNullable(output);
  }

  /**
   * @return The value of the {@code owner} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("owner")
  @Override
  public java.util.Optional<com.fhir.Reference> owner() {
    return java.util.Optional.ofNullable(owner);
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
   * @return The value of the {@code code} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("code")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> code() {
    return java.util.Optional.ofNullable(code);
  }

  /**
   * @return The value of the {@code input} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("input")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Task_Input>> input() {
    return java.util.Optional.ofNullable(input);
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
   * @return The value of the {@code restriction} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("restriction")
  @Override
  public java.util.Optional<com.fhir.Task_Restriction> restriction() {
    return java.util.Optional.ofNullable(restriction);
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
   * @return The value of the {@code focus} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("focus")
  @Override
  public java.util.Optional<com.fhir.Reference> focus() {
    return java.util.Optional.ofNullable(focus);
  }

  /**
   * @return The value of the {@code location} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("location")
  @Override
  public java.util.Optional<com.fhir.Reference> location() {
    return java.util.Optional.ofNullable(location);
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
   * @return The value of the {@code requester} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("requester")
  @Override
  public java.util.Optional<com.fhir.Reference> requester() {
    return java.util.Optional.ofNullable(requester);
  }

  /**
   * @return The value of the {@code performerType} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("performerType")
  @Override
  public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> performerType() {
    return java.util.Optional.ofNullable(performerType);
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
   * @return The value of the {@code insurance} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("insurance")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> insurance() {
    return java.util.Optional.ofNullable(insurance);
  }

  /**
   * @return The value of the {@code relevantHistory} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("relevantHistory")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> relevantHistory() {
    return java.util.Optional.ofNullable(relevantHistory);
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
   * @return The value of the {@code lastModified} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("lastModified")
  @Override
  public java.util.Optional<com.fhir.dateTime> lastModified() {
    return java.util.Optional.ofNullable(lastModified);
  }

  /**
   * @return The value of the {@code instantiatesCanonical} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("instantiatesCanonical")
  @Override
  public java.util.Optional<com.fhir.canonical> instantiatesCanonical() {
    return java.util.Optional.ofNullable(instantiatesCanonical);
  }

  /**
   * @return The value of the {@code executionPeriod} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("executionPeriod")
  @Override
  public java.util.Optional<com.fhir.Period> executionPeriod() {
    return java.util.Optional.ofNullable(executionPeriod);
  }

  /**
   * @return The value of the {@code businessStatus} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("businessStatus")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> businessStatus() {
    return java.util.Optional.ofNullable(businessStatus);
  }

  /**
   * @return The value of the {@code reasonReference} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("reasonReference")
  @Override
  public java.util.Optional<com.fhir.Reference> reasonReference() {
    return java.util.Optional.ofNullable(reasonReference);
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
   * @return The value of the {@code description} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("description")
  @Override
  public java.util.Optional<java.lang.String> description() {
    return java.util.Optional.ofNullable(description);
  }

  /**
   * @return The value of the {@code authoredOn} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("authoredOn")
  @Override
  public java.util.Optional<com.fhir.dateTime> authoredOn() {
    return java.util.Optional.ofNullable(authoredOn);
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
   * @return The value of the {@code language} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("language")
  @Override
  public java.util.Optional<com.fhir.code> language() {
    return java.util.Optional.ofNullable(language);
  }

  /**
   * @return The value of the {@code priority} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("priority")
  @Override
  public java.util.Optional<com.fhir.code> priority() {
    return java.util.Optional.ofNullable(priority);
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
   * @return The value of the {@code reasonCode} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("reasonCode")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> reasonCode() {
    return java.util.Optional.ofNullable(reasonCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Task#basedOn() basedOn} attribute.
   * @param value The value for basedOn
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTask withBasedOn(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "basedOn");
    if (this.basedOn == newValue) return this;
    return new ImmutableTask(
        newValue,
        this.implicitRules,
        this.statusReason,
        this._for,
        this.extension,
        this.instantiatesUri,
        this.intent,
        this.groupIdentifier,
        this.note,
        this.status,
        this.output,
        this.owner,
        this.id,
        this.code,
        this.input,
        this.text,
        this.restriction,
        this.encounter,
        this.focus,
        this.location,
        this.identifier,
        this.requester,
        this.performerType,
        this.contained,
        this.insurance,
        this.relevantHistory,
        this.modifierExtension,
        this.lastModified,
        this.instantiatesCanonical,
        this.executionPeriod,
        this.businessStatus,
        this.reasonReference,
        this.meta,
        this.description,
        this.authoredOn,
        this.resourceType,
        this.language,
        this.priority,
        this.partOf,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Task#basedOn() basedOn} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for basedOn
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTask withBasedOn(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.basedOn == value) return this;
    return new ImmutableTask(
        value,
        this.implicitRules,
        this.statusReason,
        this._for,
        this.extension,
        this.instantiatesUri,
        this.intent,
        this.groupIdentifier,
        this.note,
        this.status,
        this.output,
        this.owner,
        this.id,
        this.code,
        this.input,
        this.text,
        this.restriction,
        this.encounter,
        this.focus,
        this.location,
        this.identifier,
        this.requester,
        this.performerType,
        this.contained,
        this.insurance,
        this.relevantHistory,
        this.modifierExtension,
        this.lastModified,
        this.instantiatesCanonical,
        this.executionPeriod,
        this.businessStatus,
        this.reasonReference,
        this.meta,
        this.description,
        this.authoredOn,
        this.resourceType,
        this.language,
        this.priority,
        this.partOf,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Task#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTask withImplicitRules(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableTask(
        this.basedOn,
        newValue,
        this.statusReason,
        this._for,
        this.extension,
        this.instantiatesUri,
        this.intent,
        this.groupIdentifier,
        this.note,
        this.status,
        this.output,
        this.owner,
        this.id,
        this.code,
        this.input,
        this.text,
        this.restriction,
        this.encounter,
        this.focus,
        this.location,
        this.identifier,
        this.requester,
        this.performerType,
        this.contained,
        this.insurance,
        this.relevantHistory,
        this.modifierExtension,
        this.lastModified,
        this.instantiatesCanonical,
        this.executionPeriod,
        this.businessStatus,
        this.reasonReference,
        this.meta,
        this.description,
        this.authoredOn,
        this.resourceType,
        this.language,
        this.priority,
        this.partOf,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Task#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTask withImplicitRules(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableTask(
        this.basedOn,
        value,
        this.statusReason,
        this._for,
        this.extension,
        this.instantiatesUri,
        this.intent,
        this.groupIdentifier,
        this.note,
        this.status,
        this.output,
        this.owner,
        this.id,
        this.code,
        this.input,
        this.text,
        this.restriction,
        this.encounter,
        this.focus,
        this.location,
        this.identifier,
        this.requester,
        this.performerType,
        this.contained,
        this.insurance,
        this.relevantHistory,
        this.modifierExtension,
        this.lastModified,
        this.instantiatesCanonical,
        this.executionPeriod,
        this.businessStatus,
        this.reasonReference,
        this.meta,
        this.description,
        this.authoredOn,
        this.resourceType,
        this.language,
        this.priority,
        this.partOf,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Task#statusReason() statusReason} attribute.
   * @param value The value for statusReason
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTask withStatusReason(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "statusReason");
    if (this.statusReason == newValue) return this;
    return new ImmutableTask(
        this.basedOn,
        this.implicitRules,
        newValue,
        this._for,
        this.extension,
        this.instantiatesUri,
        this.intent,
        this.groupIdentifier,
        this.note,
        this.status,
        this.output,
        this.owner,
        this.id,
        this.code,
        this.input,
        this.text,
        this.restriction,
        this.encounter,
        this.focus,
        this.location,
        this.identifier,
        this.requester,
        this.performerType,
        this.contained,
        this.insurance,
        this.relevantHistory,
        this.modifierExtension,
        this.lastModified,
        this.instantiatesCanonical,
        this.executionPeriod,
        this.businessStatus,
        this.reasonReference,
        this.meta,
        this.description,
        this.authoredOn,
        this.resourceType,
        this.language,
        this.priority,
        this.partOf,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Task#statusReason() statusReason} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for statusReason
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTask withStatusReason(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.statusReason == value) return this;
    return new ImmutableTask(
        this.basedOn,
        this.implicitRules,
        value,
        this._for,
        this.extension,
        this.instantiatesUri,
        this.intent,
        this.groupIdentifier,
        this.note,
        this.status,
        this.output,
        this.owner,
        this.id,
        this.code,
        this.input,
        this.text,
        this.restriction,
        this.encounter,
        this.focus,
        this.location,
        this.identifier,
        this.requester,
        this.performerType,
        this.contained,
        this.insurance,
        this.relevantHistory,
        this.modifierExtension,
        this.lastModified,
        this.instantiatesCanonical,
        this.executionPeriod,
        this.businessStatus,
        this.reasonReference,
        this.meta,
        this.description,
        this.authoredOn,
        this.resourceType,
        this.language,
        this.priority,
        this.partOf,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Task#_for() _for} attribute.
   * @param value The value for _for
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTask with_for(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "_for");
    if (this._for == newValue) return this;
    return new ImmutableTask(
        this.basedOn,
        this.implicitRules,
        this.statusReason,
        newValue,
        this.extension,
        this.instantiatesUri,
        this.intent,
        this.groupIdentifier,
        this.note,
        this.status,
        this.output,
        this.owner,
        this.id,
        this.code,
        this.input,
        this.text,
        this.restriction,
        this.encounter,
        this.focus,
        this.location,
        this.identifier,
        this.requester,
        this.performerType,
        this.contained,
        this.insurance,
        this.relevantHistory,
        this.modifierExtension,
        this.lastModified,
        this.instantiatesCanonical,
        this.executionPeriod,
        this.businessStatus,
        this.reasonReference,
        this.meta,
        this.description,
        this.authoredOn,
        this.resourceType,
        this.language,
        this.priority,
        this.partOf,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Task#_for() _for} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for _for
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTask with_for(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this._for == value) return this;
    return new ImmutableTask(
        this.basedOn,
        this.implicitRules,
        this.statusReason,
        value,
        this.extension,
        this.instantiatesUri,
        this.intent,
        this.groupIdentifier,
        this.note,
        this.status,
        this.output,
        this.owner,
        this.id,
        this.code,
        this.input,
        this.text,
        this.restriction,
        this.encounter,
        this.focus,
        this.location,
        this.identifier,
        this.requester,
        this.performerType,
        this.contained,
        this.insurance,
        this.relevantHistory,
        this.modifierExtension,
        this.lastModified,
        this.instantiatesCanonical,
        this.executionPeriod,
        this.businessStatus,
        this.reasonReference,
        this.meta,
        this.description,
        this.authoredOn,
        this.resourceType,
        this.language,
        this.priority,
        this.partOf,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Task#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTask withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableTask(
        this.basedOn,
        this.implicitRules,
        this.statusReason,
        this._for,
        newValue,
        this.instantiatesUri,
        this.intent,
        this.groupIdentifier,
        this.note,
        this.status,
        this.output,
        this.owner,
        this.id,
        this.code,
        this.input,
        this.text,
        this.restriction,
        this.encounter,
        this.focus,
        this.location,
        this.identifier,
        this.requester,
        this.performerType,
        this.contained,
        this.insurance,
        this.relevantHistory,
        this.modifierExtension,
        this.lastModified,
        this.instantiatesCanonical,
        this.executionPeriod,
        this.businessStatus,
        this.reasonReference,
        this.meta,
        this.description,
        this.authoredOn,
        this.resourceType,
        this.language,
        this.priority,
        this.partOf,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Task#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTask withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableTask(
        this.basedOn,
        this.implicitRules,
        this.statusReason,
        this._for,
        value,
        this.instantiatesUri,
        this.intent,
        this.groupIdentifier,
        this.note,
        this.status,
        this.output,
        this.owner,
        this.id,
        this.code,
        this.input,
        this.text,
        this.restriction,
        this.encounter,
        this.focus,
        this.location,
        this.identifier,
        this.requester,
        this.performerType,
        this.contained,
        this.insurance,
        this.relevantHistory,
        this.modifierExtension,
        this.lastModified,
        this.instantiatesCanonical,
        this.executionPeriod,
        this.businessStatus,
        this.reasonReference,
        this.meta,
        this.description,
        this.authoredOn,
        this.resourceType,
        this.language,
        this.priority,
        this.partOf,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Task#instantiatesUri() instantiatesUri} attribute.
   * @param value The value for instantiatesUri
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTask withInstantiatesUri(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "instantiatesUri");
    if (this.instantiatesUri == newValue) return this;
    return new ImmutableTask(
        this.basedOn,
        this.implicitRules,
        this.statusReason,
        this._for,
        this.extension,
        newValue,
        this.intent,
        this.groupIdentifier,
        this.note,
        this.status,
        this.output,
        this.owner,
        this.id,
        this.code,
        this.input,
        this.text,
        this.restriction,
        this.encounter,
        this.focus,
        this.location,
        this.identifier,
        this.requester,
        this.performerType,
        this.contained,
        this.insurance,
        this.relevantHistory,
        this.modifierExtension,
        this.lastModified,
        this.instantiatesCanonical,
        this.executionPeriod,
        this.businessStatus,
        this.reasonReference,
        this.meta,
        this.description,
        this.authoredOn,
        this.resourceType,
        this.language,
        this.priority,
        this.partOf,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Task#instantiatesUri() instantiatesUri} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for instantiatesUri
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTask withInstantiatesUri(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.instantiatesUri == value) return this;
    return new ImmutableTask(
        this.basedOn,
        this.implicitRules,
        this.statusReason,
        this._for,
        this.extension,
        value,
        this.intent,
        this.groupIdentifier,
        this.note,
        this.status,
        this.output,
        this.owner,
        this.id,
        this.code,
        this.input,
        this.text,
        this.restriction,
        this.encounter,
        this.focus,
        this.location,
        this.identifier,
        this.requester,
        this.performerType,
        this.contained,
        this.insurance,
        this.relevantHistory,
        this.modifierExtension,
        this.lastModified,
        this.instantiatesCanonical,
        this.executionPeriod,
        this.businessStatus,
        this.reasonReference,
        this.meta,
        this.description,
        this.authoredOn,
        this.resourceType,
        this.language,
        this.priority,
        this.partOf,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Task#intent() intent} attribute.
   * @param value The value for intent
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTask withIntent(com.fhir.TaskIntent value) {
    @javax.annotation.Nullable com.fhir.TaskIntent newValue = java.util.Objects.requireNonNull(value, "intent");
    if (this.intent == newValue) return this;
    return new ImmutableTask(
        this.basedOn,
        this.implicitRules,
        this.statusReason,
        this._for,
        this.extension,
        this.instantiatesUri,
        newValue,
        this.groupIdentifier,
        this.note,
        this.status,
        this.output,
        this.owner,
        this.id,
        this.code,
        this.input,
        this.text,
        this.restriction,
        this.encounter,
        this.focus,
        this.location,
        this.identifier,
        this.requester,
        this.performerType,
        this.contained,
        this.insurance,
        this.relevantHistory,
        this.modifierExtension,
        this.lastModified,
        this.instantiatesCanonical,
        this.executionPeriod,
        this.businessStatus,
        this.reasonReference,
        this.meta,
        this.description,
        this.authoredOn,
        this.resourceType,
        this.language,
        this.priority,
        this.partOf,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Task#intent() intent} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for intent
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTask withIntent(java.util.Optional<? extends com.fhir.TaskIntent> optional) {
    @javax.annotation.Nullable com.fhir.TaskIntent value = optional.orElse(null);
    if (this.intent == value) return this;
    return new ImmutableTask(
        this.basedOn,
        this.implicitRules,
        this.statusReason,
        this._for,
        this.extension,
        this.instantiatesUri,
        value,
        this.groupIdentifier,
        this.note,
        this.status,
        this.output,
        this.owner,
        this.id,
        this.code,
        this.input,
        this.text,
        this.restriction,
        this.encounter,
        this.focus,
        this.location,
        this.identifier,
        this.requester,
        this.performerType,
        this.contained,
        this.insurance,
        this.relevantHistory,
        this.modifierExtension,
        this.lastModified,
        this.instantiatesCanonical,
        this.executionPeriod,
        this.businessStatus,
        this.reasonReference,
        this.meta,
        this.description,
        this.authoredOn,
        this.resourceType,
        this.language,
        this.priority,
        this.partOf,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Task#groupIdentifier() groupIdentifier} attribute.
   * @param value The value for groupIdentifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTask withGroupIdentifier(com.fhir.Identifier value) {
    @javax.annotation.Nullable com.fhir.Identifier newValue = java.util.Objects.requireNonNull(value, "groupIdentifier");
    if (this.groupIdentifier == newValue) return this;
    return new ImmutableTask(
        this.basedOn,
        this.implicitRules,
        this.statusReason,
        this._for,
        this.extension,
        this.instantiatesUri,
        this.intent,
        newValue,
        this.note,
        this.status,
        this.output,
        this.owner,
        this.id,
        this.code,
        this.input,
        this.text,
        this.restriction,
        this.encounter,
        this.focus,
        this.location,
        this.identifier,
        this.requester,
        this.performerType,
        this.contained,
        this.insurance,
        this.relevantHistory,
        this.modifierExtension,
        this.lastModified,
        this.instantiatesCanonical,
        this.executionPeriod,
        this.businessStatus,
        this.reasonReference,
        this.meta,
        this.description,
        this.authoredOn,
        this.resourceType,
        this.language,
        this.priority,
        this.partOf,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Task#groupIdentifier() groupIdentifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for groupIdentifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTask withGroupIdentifier(java.util.Optional<? extends com.fhir.Identifier> optional) {
    @javax.annotation.Nullable com.fhir.Identifier value = optional.orElse(null);
    if (this.groupIdentifier == value) return this;
    return new ImmutableTask(
        this.basedOn,
        this.implicitRules,
        this.statusReason,
        this._for,
        this.extension,
        this.instantiatesUri,
        this.intent,
        value,
        this.note,
        this.status,
        this.output,
        this.owner,
        this.id,
        this.code,
        this.input,
        this.text,
        this.restriction,
        this.encounter,
        this.focus,
        this.location,
        this.identifier,
        this.requester,
        this.performerType,
        this.contained,
        this.insurance,
        this.relevantHistory,
        this.modifierExtension,
        this.lastModified,
        this.instantiatesCanonical,
        this.executionPeriod,
        this.businessStatus,
        this.reasonReference,
        this.meta,
        this.description,
        this.authoredOn,
        this.resourceType,
        this.language,
        this.priority,
        this.partOf,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Task#note() note} attribute.
   * @param value The value for note
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTask withNote(java.util.List<com.fhir.Annotation> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Annotation> newValue = java.util.Objects.requireNonNull(value, "note");
    if (this.note == newValue) return this;
    return new ImmutableTask(
        this.basedOn,
        this.implicitRules,
        this.statusReason,
        this._for,
        this.extension,
        this.instantiatesUri,
        this.intent,
        this.groupIdentifier,
        newValue,
        this.status,
        this.output,
        this.owner,
        this.id,
        this.code,
        this.input,
        this.text,
        this.restriction,
        this.encounter,
        this.focus,
        this.location,
        this.identifier,
        this.requester,
        this.performerType,
        this.contained,
        this.insurance,
        this.relevantHistory,
        this.modifierExtension,
        this.lastModified,
        this.instantiatesCanonical,
        this.executionPeriod,
        this.businessStatus,
        this.reasonReference,
        this.meta,
        this.description,
        this.authoredOn,
        this.resourceType,
        this.language,
        this.priority,
        this.partOf,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Task#note() note} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for note
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTask withNote(java.util.Optional<? extends java.util.List<com.fhir.Annotation>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Annotation> value = optional.orElse(null);
    if (this.note == value) return this;
    return new ImmutableTask(
        this.basedOn,
        this.implicitRules,
        this.statusReason,
        this._for,
        this.extension,
        this.instantiatesUri,
        this.intent,
        this.groupIdentifier,
        value,
        this.status,
        this.output,
        this.owner,
        this.id,
        this.code,
        this.input,
        this.text,
        this.restriction,
        this.encounter,
        this.focus,
        this.location,
        this.identifier,
        this.requester,
        this.performerType,
        this.contained,
        this.insurance,
        this.relevantHistory,
        this.modifierExtension,
        this.lastModified,
        this.instantiatesCanonical,
        this.executionPeriod,
        this.businessStatus,
        this.reasonReference,
        this.meta,
        this.description,
        this.authoredOn,
        this.resourceType,
        this.language,
        this.priority,
        this.partOf,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Task#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTask withStatus(com.fhir.TaskStatus value) {
    @javax.annotation.Nullable com.fhir.TaskStatus newValue = java.util.Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableTask(
        this.basedOn,
        this.implicitRules,
        this.statusReason,
        this._for,
        this.extension,
        this.instantiatesUri,
        this.intent,
        this.groupIdentifier,
        this.note,
        newValue,
        this.output,
        this.owner,
        this.id,
        this.code,
        this.input,
        this.text,
        this.restriction,
        this.encounter,
        this.focus,
        this.location,
        this.identifier,
        this.requester,
        this.performerType,
        this.contained,
        this.insurance,
        this.relevantHistory,
        this.modifierExtension,
        this.lastModified,
        this.instantiatesCanonical,
        this.executionPeriod,
        this.businessStatus,
        this.reasonReference,
        this.meta,
        this.description,
        this.authoredOn,
        this.resourceType,
        this.language,
        this.priority,
        this.partOf,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Task#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTask withStatus(java.util.Optional<? extends com.fhir.TaskStatus> optional) {
    @javax.annotation.Nullable com.fhir.TaskStatus value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableTask(
        this.basedOn,
        this.implicitRules,
        this.statusReason,
        this._for,
        this.extension,
        this.instantiatesUri,
        this.intent,
        this.groupIdentifier,
        this.note,
        value,
        this.output,
        this.owner,
        this.id,
        this.code,
        this.input,
        this.text,
        this.restriction,
        this.encounter,
        this.focus,
        this.location,
        this.identifier,
        this.requester,
        this.performerType,
        this.contained,
        this.insurance,
        this.relevantHistory,
        this.modifierExtension,
        this.lastModified,
        this.instantiatesCanonical,
        this.executionPeriod,
        this.businessStatus,
        this.reasonReference,
        this.meta,
        this.description,
        this.authoredOn,
        this.resourceType,
        this.language,
        this.priority,
        this.partOf,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Task#output() output} attribute.
   * @param value The value for output
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTask withOutput(java.util.List<com.fhir.Task_Output> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Task_Output> newValue = java.util.Objects.requireNonNull(value, "output");
    if (this.output == newValue) return this;
    return new ImmutableTask(
        this.basedOn,
        this.implicitRules,
        this.statusReason,
        this._for,
        this.extension,
        this.instantiatesUri,
        this.intent,
        this.groupIdentifier,
        this.note,
        this.status,
        newValue,
        this.owner,
        this.id,
        this.code,
        this.input,
        this.text,
        this.restriction,
        this.encounter,
        this.focus,
        this.location,
        this.identifier,
        this.requester,
        this.performerType,
        this.contained,
        this.insurance,
        this.relevantHistory,
        this.modifierExtension,
        this.lastModified,
        this.instantiatesCanonical,
        this.executionPeriod,
        this.businessStatus,
        this.reasonReference,
        this.meta,
        this.description,
        this.authoredOn,
        this.resourceType,
        this.language,
        this.priority,
        this.partOf,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Task#output() output} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for output
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTask withOutput(java.util.Optional<? extends java.util.List<com.fhir.Task_Output>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Task_Output> value = optional.orElse(null);
    if (this.output == value) return this;
    return new ImmutableTask(
        this.basedOn,
        this.implicitRules,
        this.statusReason,
        this._for,
        this.extension,
        this.instantiatesUri,
        this.intent,
        this.groupIdentifier,
        this.note,
        this.status,
        value,
        this.owner,
        this.id,
        this.code,
        this.input,
        this.text,
        this.restriction,
        this.encounter,
        this.focus,
        this.location,
        this.identifier,
        this.requester,
        this.performerType,
        this.contained,
        this.insurance,
        this.relevantHistory,
        this.modifierExtension,
        this.lastModified,
        this.instantiatesCanonical,
        this.executionPeriod,
        this.businessStatus,
        this.reasonReference,
        this.meta,
        this.description,
        this.authoredOn,
        this.resourceType,
        this.language,
        this.priority,
        this.partOf,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Task#owner() owner} attribute.
   * @param value The value for owner
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTask withOwner(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "owner");
    if (this.owner == newValue) return this;
    return new ImmutableTask(
        this.basedOn,
        this.implicitRules,
        this.statusReason,
        this._for,
        this.extension,
        this.instantiatesUri,
        this.intent,
        this.groupIdentifier,
        this.note,
        this.status,
        this.output,
        newValue,
        this.id,
        this.code,
        this.input,
        this.text,
        this.restriction,
        this.encounter,
        this.focus,
        this.location,
        this.identifier,
        this.requester,
        this.performerType,
        this.contained,
        this.insurance,
        this.relevantHistory,
        this.modifierExtension,
        this.lastModified,
        this.instantiatesCanonical,
        this.executionPeriod,
        this.businessStatus,
        this.reasonReference,
        this.meta,
        this.description,
        this.authoredOn,
        this.resourceType,
        this.language,
        this.priority,
        this.partOf,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Task#owner() owner} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for owner
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTask withOwner(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.owner == value) return this;
    return new ImmutableTask(
        this.basedOn,
        this.implicitRules,
        this.statusReason,
        this._for,
        this.extension,
        this.instantiatesUri,
        this.intent,
        this.groupIdentifier,
        this.note,
        this.status,
        this.output,
        value,
        this.id,
        this.code,
        this.input,
        this.text,
        this.restriction,
        this.encounter,
        this.focus,
        this.location,
        this.identifier,
        this.requester,
        this.performerType,
        this.contained,
        this.insurance,
        this.relevantHistory,
        this.modifierExtension,
        this.lastModified,
        this.instantiatesCanonical,
        this.executionPeriod,
        this.businessStatus,
        this.reasonReference,
        this.meta,
        this.description,
        this.authoredOn,
        this.resourceType,
        this.language,
        this.priority,
        this.partOf,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Task#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTask withId(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableTask(
        this.basedOn,
        this.implicitRules,
        this.statusReason,
        this._for,
        this.extension,
        this.instantiatesUri,
        this.intent,
        this.groupIdentifier,
        this.note,
        this.status,
        this.output,
        this.owner,
        newValue,
        this.code,
        this.input,
        this.text,
        this.restriction,
        this.encounter,
        this.focus,
        this.location,
        this.identifier,
        this.requester,
        this.performerType,
        this.contained,
        this.insurance,
        this.relevantHistory,
        this.modifierExtension,
        this.lastModified,
        this.instantiatesCanonical,
        this.executionPeriod,
        this.businessStatus,
        this.reasonReference,
        this.meta,
        this.description,
        this.authoredOn,
        this.resourceType,
        this.language,
        this.priority,
        this.partOf,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Task#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTask withId(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableTask(
        this.basedOn,
        this.implicitRules,
        this.statusReason,
        this._for,
        this.extension,
        this.instantiatesUri,
        this.intent,
        this.groupIdentifier,
        this.note,
        this.status,
        this.output,
        this.owner,
        value,
        this.code,
        this.input,
        this.text,
        this.restriction,
        this.encounter,
        this.focus,
        this.location,
        this.identifier,
        this.requester,
        this.performerType,
        this.contained,
        this.insurance,
        this.relevantHistory,
        this.modifierExtension,
        this.lastModified,
        this.instantiatesCanonical,
        this.executionPeriod,
        this.businessStatus,
        this.reasonReference,
        this.meta,
        this.description,
        this.authoredOn,
        this.resourceType,
        this.language,
        this.priority,
        this.partOf,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Task#code() code} attribute.
   * @param value The value for code
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTask withCode(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "code");
    if (this.code == newValue) return this;
    return new ImmutableTask(
        this.basedOn,
        this.implicitRules,
        this.statusReason,
        this._for,
        this.extension,
        this.instantiatesUri,
        this.intent,
        this.groupIdentifier,
        this.note,
        this.status,
        this.output,
        this.owner,
        this.id,
        newValue,
        this.input,
        this.text,
        this.restriction,
        this.encounter,
        this.focus,
        this.location,
        this.identifier,
        this.requester,
        this.performerType,
        this.contained,
        this.insurance,
        this.relevantHistory,
        this.modifierExtension,
        this.lastModified,
        this.instantiatesCanonical,
        this.executionPeriod,
        this.businessStatus,
        this.reasonReference,
        this.meta,
        this.description,
        this.authoredOn,
        this.resourceType,
        this.language,
        this.priority,
        this.partOf,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Task#code() code} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for code
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTask withCode(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.code == value) return this;
    return new ImmutableTask(
        this.basedOn,
        this.implicitRules,
        this.statusReason,
        this._for,
        this.extension,
        this.instantiatesUri,
        this.intent,
        this.groupIdentifier,
        this.note,
        this.status,
        this.output,
        this.owner,
        this.id,
        value,
        this.input,
        this.text,
        this.restriction,
        this.encounter,
        this.focus,
        this.location,
        this.identifier,
        this.requester,
        this.performerType,
        this.contained,
        this.insurance,
        this.relevantHistory,
        this.modifierExtension,
        this.lastModified,
        this.instantiatesCanonical,
        this.executionPeriod,
        this.businessStatus,
        this.reasonReference,
        this.meta,
        this.description,
        this.authoredOn,
        this.resourceType,
        this.language,
        this.priority,
        this.partOf,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Task#input() input} attribute.
   * @param value The value for input
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTask withInput(java.util.List<com.fhir.Task_Input> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Task_Input> newValue = java.util.Objects.requireNonNull(value, "input");
    if (this.input == newValue) return this;
    return new ImmutableTask(
        this.basedOn,
        this.implicitRules,
        this.statusReason,
        this._for,
        this.extension,
        this.instantiatesUri,
        this.intent,
        this.groupIdentifier,
        this.note,
        this.status,
        this.output,
        this.owner,
        this.id,
        this.code,
        newValue,
        this.text,
        this.restriction,
        this.encounter,
        this.focus,
        this.location,
        this.identifier,
        this.requester,
        this.performerType,
        this.contained,
        this.insurance,
        this.relevantHistory,
        this.modifierExtension,
        this.lastModified,
        this.instantiatesCanonical,
        this.executionPeriod,
        this.businessStatus,
        this.reasonReference,
        this.meta,
        this.description,
        this.authoredOn,
        this.resourceType,
        this.language,
        this.priority,
        this.partOf,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Task#input() input} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for input
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTask withInput(java.util.Optional<? extends java.util.List<com.fhir.Task_Input>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Task_Input> value = optional.orElse(null);
    if (this.input == value) return this;
    return new ImmutableTask(
        this.basedOn,
        this.implicitRules,
        this.statusReason,
        this._for,
        this.extension,
        this.instantiatesUri,
        this.intent,
        this.groupIdentifier,
        this.note,
        this.status,
        this.output,
        this.owner,
        this.id,
        this.code,
        value,
        this.text,
        this.restriction,
        this.encounter,
        this.focus,
        this.location,
        this.identifier,
        this.requester,
        this.performerType,
        this.contained,
        this.insurance,
        this.relevantHistory,
        this.modifierExtension,
        this.lastModified,
        this.instantiatesCanonical,
        this.executionPeriod,
        this.businessStatus,
        this.reasonReference,
        this.meta,
        this.description,
        this.authoredOn,
        this.resourceType,
        this.language,
        this.priority,
        this.partOf,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Task#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTask withText(com.fhir.Narrative value) {
    @javax.annotation.Nullable com.fhir.Narrative newValue = java.util.Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableTask(
        this.basedOn,
        this.implicitRules,
        this.statusReason,
        this._for,
        this.extension,
        this.instantiatesUri,
        this.intent,
        this.groupIdentifier,
        this.note,
        this.status,
        this.output,
        this.owner,
        this.id,
        this.code,
        this.input,
        newValue,
        this.restriction,
        this.encounter,
        this.focus,
        this.location,
        this.identifier,
        this.requester,
        this.performerType,
        this.contained,
        this.insurance,
        this.relevantHistory,
        this.modifierExtension,
        this.lastModified,
        this.instantiatesCanonical,
        this.executionPeriod,
        this.businessStatus,
        this.reasonReference,
        this.meta,
        this.description,
        this.authoredOn,
        this.resourceType,
        this.language,
        this.priority,
        this.partOf,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Task#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTask withText(java.util.Optional<? extends com.fhir.Narrative> optional) {
    @javax.annotation.Nullable com.fhir.Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableTask(
        this.basedOn,
        this.implicitRules,
        this.statusReason,
        this._for,
        this.extension,
        this.instantiatesUri,
        this.intent,
        this.groupIdentifier,
        this.note,
        this.status,
        this.output,
        this.owner,
        this.id,
        this.code,
        this.input,
        value,
        this.restriction,
        this.encounter,
        this.focus,
        this.location,
        this.identifier,
        this.requester,
        this.performerType,
        this.contained,
        this.insurance,
        this.relevantHistory,
        this.modifierExtension,
        this.lastModified,
        this.instantiatesCanonical,
        this.executionPeriod,
        this.businessStatus,
        this.reasonReference,
        this.meta,
        this.description,
        this.authoredOn,
        this.resourceType,
        this.language,
        this.priority,
        this.partOf,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Task#restriction() restriction} attribute.
   * @param value The value for restriction
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTask withRestriction(com.fhir.Task_Restriction value) {
    @javax.annotation.Nullable com.fhir.Task_Restriction newValue = java.util.Objects.requireNonNull(value, "restriction");
    if (this.restriction == newValue) return this;
    return new ImmutableTask(
        this.basedOn,
        this.implicitRules,
        this.statusReason,
        this._for,
        this.extension,
        this.instantiatesUri,
        this.intent,
        this.groupIdentifier,
        this.note,
        this.status,
        this.output,
        this.owner,
        this.id,
        this.code,
        this.input,
        this.text,
        newValue,
        this.encounter,
        this.focus,
        this.location,
        this.identifier,
        this.requester,
        this.performerType,
        this.contained,
        this.insurance,
        this.relevantHistory,
        this.modifierExtension,
        this.lastModified,
        this.instantiatesCanonical,
        this.executionPeriod,
        this.businessStatus,
        this.reasonReference,
        this.meta,
        this.description,
        this.authoredOn,
        this.resourceType,
        this.language,
        this.priority,
        this.partOf,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Task#restriction() restriction} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for restriction
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTask withRestriction(java.util.Optional<? extends com.fhir.Task_Restriction> optional) {
    @javax.annotation.Nullable com.fhir.Task_Restriction value = optional.orElse(null);
    if (this.restriction == value) return this;
    return new ImmutableTask(
        this.basedOn,
        this.implicitRules,
        this.statusReason,
        this._for,
        this.extension,
        this.instantiatesUri,
        this.intent,
        this.groupIdentifier,
        this.note,
        this.status,
        this.output,
        this.owner,
        this.id,
        this.code,
        this.input,
        this.text,
        value,
        this.encounter,
        this.focus,
        this.location,
        this.identifier,
        this.requester,
        this.performerType,
        this.contained,
        this.insurance,
        this.relevantHistory,
        this.modifierExtension,
        this.lastModified,
        this.instantiatesCanonical,
        this.executionPeriod,
        this.businessStatus,
        this.reasonReference,
        this.meta,
        this.description,
        this.authoredOn,
        this.resourceType,
        this.language,
        this.priority,
        this.partOf,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Task#encounter() encounter} attribute.
   * @param value The value for encounter
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTask withEncounter(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "encounter");
    if (this.encounter == newValue) return this;
    return new ImmutableTask(
        this.basedOn,
        this.implicitRules,
        this.statusReason,
        this._for,
        this.extension,
        this.instantiatesUri,
        this.intent,
        this.groupIdentifier,
        this.note,
        this.status,
        this.output,
        this.owner,
        this.id,
        this.code,
        this.input,
        this.text,
        this.restriction,
        newValue,
        this.focus,
        this.location,
        this.identifier,
        this.requester,
        this.performerType,
        this.contained,
        this.insurance,
        this.relevantHistory,
        this.modifierExtension,
        this.lastModified,
        this.instantiatesCanonical,
        this.executionPeriod,
        this.businessStatus,
        this.reasonReference,
        this.meta,
        this.description,
        this.authoredOn,
        this.resourceType,
        this.language,
        this.priority,
        this.partOf,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Task#encounter() encounter} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for encounter
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTask withEncounter(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.encounter == value) return this;
    return new ImmutableTask(
        this.basedOn,
        this.implicitRules,
        this.statusReason,
        this._for,
        this.extension,
        this.instantiatesUri,
        this.intent,
        this.groupIdentifier,
        this.note,
        this.status,
        this.output,
        this.owner,
        this.id,
        this.code,
        this.input,
        this.text,
        this.restriction,
        value,
        this.focus,
        this.location,
        this.identifier,
        this.requester,
        this.performerType,
        this.contained,
        this.insurance,
        this.relevantHistory,
        this.modifierExtension,
        this.lastModified,
        this.instantiatesCanonical,
        this.executionPeriod,
        this.businessStatus,
        this.reasonReference,
        this.meta,
        this.description,
        this.authoredOn,
        this.resourceType,
        this.language,
        this.priority,
        this.partOf,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Task#focus() focus} attribute.
   * @param value The value for focus
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTask withFocus(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "focus");
    if (this.focus == newValue) return this;
    return new ImmutableTask(
        this.basedOn,
        this.implicitRules,
        this.statusReason,
        this._for,
        this.extension,
        this.instantiatesUri,
        this.intent,
        this.groupIdentifier,
        this.note,
        this.status,
        this.output,
        this.owner,
        this.id,
        this.code,
        this.input,
        this.text,
        this.restriction,
        this.encounter,
        newValue,
        this.location,
        this.identifier,
        this.requester,
        this.performerType,
        this.contained,
        this.insurance,
        this.relevantHistory,
        this.modifierExtension,
        this.lastModified,
        this.instantiatesCanonical,
        this.executionPeriod,
        this.businessStatus,
        this.reasonReference,
        this.meta,
        this.description,
        this.authoredOn,
        this.resourceType,
        this.language,
        this.priority,
        this.partOf,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Task#focus() focus} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for focus
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTask withFocus(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.focus == value) return this;
    return new ImmutableTask(
        this.basedOn,
        this.implicitRules,
        this.statusReason,
        this._for,
        this.extension,
        this.instantiatesUri,
        this.intent,
        this.groupIdentifier,
        this.note,
        this.status,
        this.output,
        this.owner,
        this.id,
        this.code,
        this.input,
        this.text,
        this.restriction,
        this.encounter,
        value,
        this.location,
        this.identifier,
        this.requester,
        this.performerType,
        this.contained,
        this.insurance,
        this.relevantHistory,
        this.modifierExtension,
        this.lastModified,
        this.instantiatesCanonical,
        this.executionPeriod,
        this.businessStatus,
        this.reasonReference,
        this.meta,
        this.description,
        this.authoredOn,
        this.resourceType,
        this.language,
        this.priority,
        this.partOf,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Task#location() location} attribute.
   * @param value The value for location
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTask withLocation(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "location");
    if (this.location == newValue) return this;
    return new ImmutableTask(
        this.basedOn,
        this.implicitRules,
        this.statusReason,
        this._for,
        this.extension,
        this.instantiatesUri,
        this.intent,
        this.groupIdentifier,
        this.note,
        this.status,
        this.output,
        this.owner,
        this.id,
        this.code,
        this.input,
        this.text,
        this.restriction,
        this.encounter,
        this.focus,
        newValue,
        this.identifier,
        this.requester,
        this.performerType,
        this.contained,
        this.insurance,
        this.relevantHistory,
        this.modifierExtension,
        this.lastModified,
        this.instantiatesCanonical,
        this.executionPeriod,
        this.businessStatus,
        this.reasonReference,
        this.meta,
        this.description,
        this.authoredOn,
        this.resourceType,
        this.language,
        this.priority,
        this.partOf,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Task#location() location} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for location
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTask withLocation(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.location == value) return this;
    return new ImmutableTask(
        this.basedOn,
        this.implicitRules,
        this.statusReason,
        this._for,
        this.extension,
        this.instantiatesUri,
        this.intent,
        this.groupIdentifier,
        this.note,
        this.status,
        this.output,
        this.owner,
        this.id,
        this.code,
        this.input,
        this.text,
        this.restriction,
        this.encounter,
        this.focus,
        value,
        this.identifier,
        this.requester,
        this.performerType,
        this.contained,
        this.insurance,
        this.relevantHistory,
        this.modifierExtension,
        this.lastModified,
        this.instantiatesCanonical,
        this.executionPeriod,
        this.businessStatus,
        this.reasonReference,
        this.meta,
        this.description,
        this.authoredOn,
        this.resourceType,
        this.language,
        this.priority,
        this.partOf,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Task#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTask withIdentifier(java.util.List<com.fhir.Identifier> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> newValue = java.util.Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableTask(
        this.basedOn,
        this.implicitRules,
        this.statusReason,
        this._for,
        this.extension,
        this.instantiatesUri,
        this.intent,
        this.groupIdentifier,
        this.note,
        this.status,
        this.output,
        this.owner,
        this.id,
        this.code,
        this.input,
        this.text,
        this.restriction,
        this.encounter,
        this.focus,
        this.location,
        newValue,
        this.requester,
        this.performerType,
        this.contained,
        this.insurance,
        this.relevantHistory,
        this.modifierExtension,
        this.lastModified,
        this.instantiatesCanonical,
        this.executionPeriod,
        this.businessStatus,
        this.reasonReference,
        this.meta,
        this.description,
        this.authoredOn,
        this.resourceType,
        this.language,
        this.priority,
        this.partOf,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Task#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTask withIdentifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableTask(
        this.basedOn,
        this.implicitRules,
        this.statusReason,
        this._for,
        this.extension,
        this.instantiatesUri,
        this.intent,
        this.groupIdentifier,
        this.note,
        this.status,
        this.output,
        this.owner,
        this.id,
        this.code,
        this.input,
        this.text,
        this.restriction,
        this.encounter,
        this.focus,
        this.location,
        value,
        this.requester,
        this.performerType,
        this.contained,
        this.insurance,
        this.relevantHistory,
        this.modifierExtension,
        this.lastModified,
        this.instantiatesCanonical,
        this.executionPeriod,
        this.businessStatus,
        this.reasonReference,
        this.meta,
        this.description,
        this.authoredOn,
        this.resourceType,
        this.language,
        this.priority,
        this.partOf,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Task#requester() requester} attribute.
   * @param value The value for requester
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTask withRequester(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "requester");
    if (this.requester == newValue) return this;
    return new ImmutableTask(
        this.basedOn,
        this.implicitRules,
        this.statusReason,
        this._for,
        this.extension,
        this.instantiatesUri,
        this.intent,
        this.groupIdentifier,
        this.note,
        this.status,
        this.output,
        this.owner,
        this.id,
        this.code,
        this.input,
        this.text,
        this.restriction,
        this.encounter,
        this.focus,
        this.location,
        this.identifier,
        newValue,
        this.performerType,
        this.contained,
        this.insurance,
        this.relevantHistory,
        this.modifierExtension,
        this.lastModified,
        this.instantiatesCanonical,
        this.executionPeriod,
        this.businessStatus,
        this.reasonReference,
        this.meta,
        this.description,
        this.authoredOn,
        this.resourceType,
        this.language,
        this.priority,
        this.partOf,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Task#requester() requester} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for requester
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTask withRequester(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.requester == value) return this;
    return new ImmutableTask(
        this.basedOn,
        this.implicitRules,
        this.statusReason,
        this._for,
        this.extension,
        this.instantiatesUri,
        this.intent,
        this.groupIdentifier,
        this.note,
        this.status,
        this.output,
        this.owner,
        this.id,
        this.code,
        this.input,
        this.text,
        this.restriction,
        this.encounter,
        this.focus,
        this.location,
        this.identifier,
        value,
        this.performerType,
        this.contained,
        this.insurance,
        this.relevantHistory,
        this.modifierExtension,
        this.lastModified,
        this.instantiatesCanonical,
        this.executionPeriod,
        this.businessStatus,
        this.reasonReference,
        this.meta,
        this.description,
        this.authoredOn,
        this.resourceType,
        this.language,
        this.priority,
        this.partOf,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Task#performerType() performerType} attribute.
   * @param value The value for performerType
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTask withPerformerType(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "performerType");
    if (this.performerType == newValue) return this;
    return new ImmutableTask(
        this.basedOn,
        this.implicitRules,
        this.statusReason,
        this._for,
        this.extension,
        this.instantiatesUri,
        this.intent,
        this.groupIdentifier,
        this.note,
        this.status,
        this.output,
        this.owner,
        this.id,
        this.code,
        this.input,
        this.text,
        this.restriction,
        this.encounter,
        this.focus,
        this.location,
        this.identifier,
        this.requester,
        newValue,
        this.contained,
        this.insurance,
        this.relevantHistory,
        this.modifierExtension,
        this.lastModified,
        this.instantiatesCanonical,
        this.executionPeriod,
        this.businessStatus,
        this.reasonReference,
        this.meta,
        this.description,
        this.authoredOn,
        this.resourceType,
        this.language,
        this.priority,
        this.partOf,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Task#performerType() performerType} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for performerType
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTask withPerformerType(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.performerType == value) return this;
    return new ImmutableTask(
        this.basedOn,
        this.implicitRules,
        this.statusReason,
        this._for,
        this.extension,
        this.instantiatesUri,
        this.intent,
        this.groupIdentifier,
        this.note,
        this.status,
        this.output,
        this.owner,
        this.id,
        this.code,
        this.input,
        this.text,
        this.restriction,
        this.encounter,
        this.focus,
        this.location,
        this.identifier,
        this.requester,
        value,
        this.contained,
        this.insurance,
        this.relevantHistory,
        this.modifierExtension,
        this.lastModified,
        this.instantiatesCanonical,
        this.executionPeriod,
        this.businessStatus,
        this.reasonReference,
        this.meta,
        this.description,
        this.authoredOn,
        this.resourceType,
        this.language,
        this.priority,
        this.partOf,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Task#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTask withContained(java.util.List<com.fhir.ResourceList> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> newValue = java.util.Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableTask(
        this.basedOn,
        this.implicitRules,
        this.statusReason,
        this._for,
        this.extension,
        this.instantiatesUri,
        this.intent,
        this.groupIdentifier,
        this.note,
        this.status,
        this.output,
        this.owner,
        this.id,
        this.code,
        this.input,
        this.text,
        this.restriction,
        this.encounter,
        this.focus,
        this.location,
        this.identifier,
        this.requester,
        this.performerType,
        newValue,
        this.insurance,
        this.relevantHistory,
        this.modifierExtension,
        this.lastModified,
        this.instantiatesCanonical,
        this.executionPeriod,
        this.businessStatus,
        this.reasonReference,
        this.meta,
        this.description,
        this.authoredOn,
        this.resourceType,
        this.language,
        this.priority,
        this.partOf,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Task#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTask withContained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableTask(
        this.basedOn,
        this.implicitRules,
        this.statusReason,
        this._for,
        this.extension,
        this.instantiatesUri,
        this.intent,
        this.groupIdentifier,
        this.note,
        this.status,
        this.output,
        this.owner,
        this.id,
        this.code,
        this.input,
        this.text,
        this.restriction,
        this.encounter,
        this.focus,
        this.location,
        this.identifier,
        this.requester,
        this.performerType,
        value,
        this.insurance,
        this.relevantHistory,
        this.modifierExtension,
        this.lastModified,
        this.instantiatesCanonical,
        this.executionPeriod,
        this.businessStatus,
        this.reasonReference,
        this.meta,
        this.description,
        this.authoredOn,
        this.resourceType,
        this.language,
        this.priority,
        this.partOf,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Task#insurance() insurance} attribute.
   * @param value The value for insurance
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTask withInsurance(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "insurance");
    if (this.insurance == newValue) return this;
    return new ImmutableTask(
        this.basedOn,
        this.implicitRules,
        this.statusReason,
        this._for,
        this.extension,
        this.instantiatesUri,
        this.intent,
        this.groupIdentifier,
        this.note,
        this.status,
        this.output,
        this.owner,
        this.id,
        this.code,
        this.input,
        this.text,
        this.restriction,
        this.encounter,
        this.focus,
        this.location,
        this.identifier,
        this.requester,
        this.performerType,
        this.contained,
        newValue,
        this.relevantHistory,
        this.modifierExtension,
        this.lastModified,
        this.instantiatesCanonical,
        this.executionPeriod,
        this.businessStatus,
        this.reasonReference,
        this.meta,
        this.description,
        this.authoredOn,
        this.resourceType,
        this.language,
        this.priority,
        this.partOf,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Task#insurance() insurance} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for insurance
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTask withInsurance(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.insurance == value) return this;
    return new ImmutableTask(
        this.basedOn,
        this.implicitRules,
        this.statusReason,
        this._for,
        this.extension,
        this.instantiatesUri,
        this.intent,
        this.groupIdentifier,
        this.note,
        this.status,
        this.output,
        this.owner,
        this.id,
        this.code,
        this.input,
        this.text,
        this.restriction,
        this.encounter,
        this.focus,
        this.location,
        this.identifier,
        this.requester,
        this.performerType,
        this.contained,
        value,
        this.relevantHistory,
        this.modifierExtension,
        this.lastModified,
        this.instantiatesCanonical,
        this.executionPeriod,
        this.businessStatus,
        this.reasonReference,
        this.meta,
        this.description,
        this.authoredOn,
        this.resourceType,
        this.language,
        this.priority,
        this.partOf,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Task#relevantHistory() relevantHistory} attribute.
   * @param value The value for relevantHistory
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTask withRelevantHistory(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "relevantHistory");
    if (this.relevantHistory == newValue) return this;
    return new ImmutableTask(
        this.basedOn,
        this.implicitRules,
        this.statusReason,
        this._for,
        this.extension,
        this.instantiatesUri,
        this.intent,
        this.groupIdentifier,
        this.note,
        this.status,
        this.output,
        this.owner,
        this.id,
        this.code,
        this.input,
        this.text,
        this.restriction,
        this.encounter,
        this.focus,
        this.location,
        this.identifier,
        this.requester,
        this.performerType,
        this.contained,
        this.insurance,
        newValue,
        this.modifierExtension,
        this.lastModified,
        this.instantiatesCanonical,
        this.executionPeriod,
        this.businessStatus,
        this.reasonReference,
        this.meta,
        this.description,
        this.authoredOn,
        this.resourceType,
        this.language,
        this.priority,
        this.partOf,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Task#relevantHistory() relevantHistory} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for relevantHistory
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTask withRelevantHistory(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.relevantHistory == value) return this;
    return new ImmutableTask(
        this.basedOn,
        this.implicitRules,
        this.statusReason,
        this._for,
        this.extension,
        this.instantiatesUri,
        this.intent,
        this.groupIdentifier,
        this.note,
        this.status,
        this.output,
        this.owner,
        this.id,
        this.code,
        this.input,
        this.text,
        this.restriction,
        this.encounter,
        this.focus,
        this.location,
        this.identifier,
        this.requester,
        this.performerType,
        this.contained,
        this.insurance,
        value,
        this.modifierExtension,
        this.lastModified,
        this.instantiatesCanonical,
        this.executionPeriod,
        this.businessStatus,
        this.reasonReference,
        this.meta,
        this.description,
        this.authoredOn,
        this.resourceType,
        this.language,
        this.priority,
        this.partOf,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Task#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTask withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableTask(
        this.basedOn,
        this.implicitRules,
        this.statusReason,
        this._for,
        this.extension,
        this.instantiatesUri,
        this.intent,
        this.groupIdentifier,
        this.note,
        this.status,
        this.output,
        this.owner,
        this.id,
        this.code,
        this.input,
        this.text,
        this.restriction,
        this.encounter,
        this.focus,
        this.location,
        this.identifier,
        this.requester,
        this.performerType,
        this.contained,
        this.insurance,
        this.relevantHistory,
        newValue,
        this.lastModified,
        this.instantiatesCanonical,
        this.executionPeriod,
        this.businessStatus,
        this.reasonReference,
        this.meta,
        this.description,
        this.authoredOn,
        this.resourceType,
        this.language,
        this.priority,
        this.partOf,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Task#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTask withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableTask(
        this.basedOn,
        this.implicitRules,
        this.statusReason,
        this._for,
        this.extension,
        this.instantiatesUri,
        this.intent,
        this.groupIdentifier,
        this.note,
        this.status,
        this.output,
        this.owner,
        this.id,
        this.code,
        this.input,
        this.text,
        this.restriction,
        this.encounter,
        this.focus,
        this.location,
        this.identifier,
        this.requester,
        this.performerType,
        this.contained,
        this.insurance,
        this.relevantHistory,
        value,
        this.lastModified,
        this.instantiatesCanonical,
        this.executionPeriod,
        this.businessStatus,
        this.reasonReference,
        this.meta,
        this.description,
        this.authoredOn,
        this.resourceType,
        this.language,
        this.priority,
        this.partOf,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Task#lastModified() lastModified} attribute.
   * @param value The value for lastModified
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTask withLastModified(com.fhir.dateTime value) {
    @javax.annotation.Nullable com.fhir.dateTime newValue = java.util.Objects.requireNonNull(value, "lastModified");
    if (this.lastModified == newValue) return this;
    return new ImmutableTask(
        this.basedOn,
        this.implicitRules,
        this.statusReason,
        this._for,
        this.extension,
        this.instantiatesUri,
        this.intent,
        this.groupIdentifier,
        this.note,
        this.status,
        this.output,
        this.owner,
        this.id,
        this.code,
        this.input,
        this.text,
        this.restriction,
        this.encounter,
        this.focus,
        this.location,
        this.identifier,
        this.requester,
        this.performerType,
        this.contained,
        this.insurance,
        this.relevantHistory,
        this.modifierExtension,
        newValue,
        this.instantiatesCanonical,
        this.executionPeriod,
        this.businessStatus,
        this.reasonReference,
        this.meta,
        this.description,
        this.authoredOn,
        this.resourceType,
        this.language,
        this.priority,
        this.partOf,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Task#lastModified() lastModified} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for lastModified
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTask withLastModified(java.util.Optional<? extends com.fhir.dateTime> optional) {
    @javax.annotation.Nullable com.fhir.dateTime value = optional.orElse(null);
    if (this.lastModified == value) return this;
    return new ImmutableTask(
        this.basedOn,
        this.implicitRules,
        this.statusReason,
        this._for,
        this.extension,
        this.instantiatesUri,
        this.intent,
        this.groupIdentifier,
        this.note,
        this.status,
        this.output,
        this.owner,
        this.id,
        this.code,
        this.input,
        this.text,
        this.restriction,
        this.encounter,
        this.focus,
        this.location,
        this.identifier,
        this.requester,
        this.performerType,
        this.contained,
        this.insurance,
        this.relevantHistory,
        this.modifierExtension,
        value,
        this.instantiatesCanonical,
        this.executionPeriod,
        this.businessStatus,
        this.reasonReference,
        this.meta,
        this.description,
        this.authoredOn,
        this.resourceType,
        this.language,
        this.priority,
        this.partOf,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Task#instantiatesCanonical() instantiatesCanonical} attribute.
   * @param value The value for instantiatesCanonical
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTask withInstantiatesCanonical(com.fhir.canonical value) {
    @javax.annotation.Nullable com.fhir.canonical newValue = java.util.Objects.requireNonNull(value, "instantiatesCanonical");
    if (this.instantiatesCanonical == newValue) return this;
    return new ImmutableTask(
        this.basedOn,
        this.implicitRules,
        this.statusReason,
        this._for,
        this.extension,
        this.instantiatesUri,
        this.intent,
        this.groupIdentifier,
        this.note,
        this.status,
        this.output,
        this.owner,
        this.id,
        this.code,
        this.input,
        this.text,
        this.restriction,
        this.encounter,
        this.focus,
        this.location,
        this.identifier,
        this.requester,
        this.performerType,
        this.contained,
        this.insurance,
        this.relevantHistory,
        this.modifierExtension,
        this.lastModified,
        newValue,
        this.executionPeriod,
        this.businessStatus,
        this.reasonReference,
        this.meta,
        this.description,
        this.authoredOn,
        this.resourceType,
        this.language,
        this.priority,
        this.partOf,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Task#instantiatesCanonical() instantiatesCanonical} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for instantiatesCanonical
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTask withInstantiatesCanonical(java.util.Optional<? extends com.fhir.canonical> optional) {
    @javax.annotation.Nullable com.fhir.canonical value = optional.orElse(null);
    if (this.instantiatesCanonical == value) return this;
    return new ImmutableTask(
        this.basedOn,
        this.implicitRules,
        this.statusReason,
        this._for,
        this.extension,
        this.instantiatesUri,
        this.intent,
        this.groupIdentifier,
        this.note,
        this.status,
        this.output,
        this.owner,
        this.id,
        this.code,
        this.input,
        this.text,
        this.restriction,
        this.encounter,
        this.focus,
        this.location,
        this.identifier,
        this.requester,
        this.performerType,
        this.contained,
        this.insurance,
        this.relevantHistory,
        this.modifierExtension,
        this.lastModified,
        value,
        this.executionPeriod,
        this.businessStatus,
        this.reasonReference,
        this.meta,
        this.description,
        this.authoredOn,
        this.resourceType,
        this.language,
        this.priority,
        this.partOf,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Task#executionPeriod() executionPeriod} attribute.
   * @param value The value for executionPeriod
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTask withExecutionPeriod(com.fhir.Period value) {
    @javax.annotation.Nullable com.fhir.Period newValue = java.util.Objects.requireNonNull(value, "executionPeriod");
    if (this.executionPeriod == newValue) return this;
    return new ImmutableTask(
        this.basedOn,
        this.implicitRules,
        this.statusReason,
        this._for,
        this.extension,
        this.instantiatesUri,
        this.intent,
        this.groupIdentifier,
        this.note,
        this.status,
        this.output,
        this.owner,
        this.id,
        this.code,
        this.input,
        this.text,
        this.restriction,
        this.encounter,
        this.focus,
        this.location,
        this.identifier,
        this.requester,
        this.performerType,
        this.contained,
        this.insurance,
        this.relevantHistory,
        this.modifierExtension,
        this.lastModified,
        this.instantiatesCanonical,
        newValue,
        this.businessStatus,
        this.reasonReference,
        this.meta,
        this.description,
        this.authoredOn,
        this.resourceType,
        this.language,
        this.priority,
        this.partOf,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Task#executionPeriod() executionPeriod} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for executionPeriod
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTask withExecutionPeriod(java.util.Optional<? extends com.fhir.Period> optional) {
    @javax.annotation.Nullable com.fhir.Period value = optional.orElse(null);
    if (this.executionPeriod == value) return this;
    return new ImmutableTask(
        this.basedOn,
        this.implicitRules,
        this.statusReason,
        this._for,
        this.extension,
        this.instantiatesUri,
        this.intent,
        this.groupIdentifier,
        this.note,
        this.status,
        this.output,
        this.owner,
        this.id,
        this.code,
        this.input,
        this.text,
        this.restriction,
        this.encounter,
        this.focus,
        this.location,
        this.identifier,
        this.requester,
        this.performerType,
        this.contained,
        this.insurance,
        this.relevantHistory,
        this.modifierExtension,
        this.lastModified,
        this.instantiatesCanonical,
        value,
        this.businessStatus,
        this.reasonReference,
        this.meta,
        this.description,
        this.authoredOn,
        this.resourceType,
        this.language,
        this.priority,
        this.partOf,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Task#businessStatus() businessStatus} attribute.
   * @param value The value for businessStatus
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTask withBusinessStatus(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "businessStatus");
    if (this.businessStatus == newValue) return this;
    return new ImmutableTask(
        this.basedOn,
        this.implicitRules,
        this.statusReason,
        this._for,
        this.extension,
        this.instantiatesUri,
        this.intent,
        this.groupIdentifier,
        this.note,
        this.status,
        this.output,
        this.owner,
        this.id,
        this.code,
        this.input,
        this.text,
        this.restriction,
        this.encounter,
        this.focus,
        this.location,
        this.identifier,
        this.requester,
        this.performerType,
        this.contained,
        this.insurance,
        this.relevantHistory,
        this.modifierExtension,
        this.lastModified,
        this.instantiatesCanonical,
        this.executionPeriod,
        newValue,
        this.reasonReference,
        this.meta,
        this.description,
        this.authoredOn,
        this.resourceType,
        this.language,
        this.priority,
        this.partOf,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Task#businessStatus() businessStatus} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for businessStatus
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTask withBusinessStatus(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.businessStatus == value) return this;
    return new ImmutableTask(
        this.basedOn,
        this.implicitRules,
        this.statusReason,
        this._for,
        this.extension,
        this.instantiatesUri,
        this.intent,
        this.groupIdentifier,
        this.note,
        this.status,
        this.output,
        this.owner,
        this.id,
        this.code,
        this.input,
        this.text,
        this.restriction,
        this.encounter,
        this.focus,
        this.location,
        this.identifier,
        this.requester,
        this.performerType,
        this.contained,
        this.insurance,
        this.relevantHistory,
        this.modifierExtension,
        this.lastModified,
        this.instantiatesCanonical,
        this.executionPeriod,
        value,
        this.reasonReference,
        this.meta,
        this.description,
        this.authoredOn,
        this.resourceType,
        this.language,
        this.priority,
        this.partOf,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Task#reasonReference() reasonReference} attribute.
   * @param value The value for reasonReference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTask withReasonReference(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "reasonReference");
    if (this.reasonReference == newValue) return this;
    return new ImmutableTask(
        this.basedOn,
        this.implicitRules,
        this.statusReason,
        this._for,
        this.extension,
        this.instantiatesUri,
        this.intent,
        this.groupIdentifier,
        this.note,
        this.status,
        this.output,
        this.owner,
        this.id,
        this.code,
        this.input,
        this.text,
        this.restriction,
        this.encounter,
        this.focus,
        this.location,
        this.identifier,
        this.requester,
        this.performerType,
        this.contained,
        this.insurance,
        this.relevantHistory,
        this.modifierExtension,
        this.lastModified,
        this.instantiatesCanonical,
        this.executionPeriod,
        this.businessStatus,
        newValue,
        this.meta,
        this.description,
        this.authoredOn,
        this.resourceType,
        this.language,
        this.priority,
        this.partOf,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Task#reasonReference() reasonReference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for reasonReference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTask withReasonReference(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.reasonReference == value) return this;
    return new ImmutableTask(
        this.basedOn,
        this.implicitRules,
        this.statusReason,
        this._for,
        this.extension,
        this.instantiatesUri,
        this.intent,
        this.groupIdentifier,
        this.note,
        this.status,
        this.output,
        this.owner,
        this.id,
        this.code,
        this.input,
        this.text,
        this.restriction,
        this.encounter,
        this.focus,
        this.location,
        this.identifier,
        this.requester,
        this.performerType,
        this.contained,
        this.insurance,
        this.relevantHistory,
        this.modifierExtension,
        this.lastModified,
        this.instantiatesCanonical,
        this.executionPeriod,
        this.businessStatus,
        value,
        this.meta,
        this.description,
        this.authoredOn,
        this.resourceType,
        this.language,
        this.priority,
        this.partOf,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Task#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTask withMeta(com.fhir.Meta value) {
    @javax.annotation.Nullable com.fhir.Meta newValue = java.util.Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableTask(
        this.basedOn,
        this.implicitRules,
        this.statusReason,
        this._for,
        this.extension,
        this.instantiatesUri,
        this.intent,
        this.groupIdentifier,
        this.note,
        this.status,
        this.output,
        this.owner,
        this.id,
        this.code,
        this.input,
        this.text,
        this.restriction,
        this.encounter,
        this.focus,
        this.location,
        this.identifier,
        this.requester,
        this.performerType,
        this.contained,
        this.insurance,
        this.relevantHistory,
        this.modifierExtension,
        this.lastModified,
        this.instantiatesCanonical,
        this.executionPeriod,
        this.businessStatus,
        this.reasonReference,
        newValue,
        this.description,
        this.authoredOn,
        this.resourceType,
        this.language,
        this.priority,
        this.partOf,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Task#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTask withMeta(java.util.Optional<? extends com.fhir.Meta> optional) {
    @javax.annotation.Nullable com.fhir.Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableTask(
        this.basedOn,
        this.implicitRules,
        this.statusReason,
        this._for,
        this.extension,
        this.instantiatesUri,
        this.intent,
        this.groupIdentifier,
        this.note,
        this.status,
        this.output,
        this.owner,
        this.id,
        this.code,
        this.input,
        this.text,
        this.restriction,
        this.encounter,
        this.focus,
        this.location,
        this.identifier,
        this.requester,
        this.performerType,
        this.contained,
        this.insurance,
        this.relevantHistory,
        this.modifierExtension,
        this.lastModified,
        this.instantiatesCanonical,
        this.executionPeriod,
        this.businessStatus,
        this.reasonReference,
        value,
        this.description,
        this.authoredOn,
        this.resourceType,
        this.language,
        this.priority,
        this.partOf,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Task#description() description} attribute.
   * @param value The value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTask withDescription(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "description");
    if (java.util.Objects.equals(this.description, newValue)) return this;
    return new ImmutableTask(
        this.basedOn,
        this.implicitRules,
        this.statusReason,
        this._for,
        this.extension,
        this.instantiatesUri,
        this.intent,
        this.groupIdentifier,
        this.note,
        this.status,
        this.output,
        this.owner,
        this.id,
        this.code,
        this.input,
        this.text,
        this.restriction,
        this.encounter,
        this.focus,
        this.location,
        this.identifier,
        this.requester,
        this.performerType,
        this.contained,
        this.insurance,
        this.relevantHistory,
        this.modifierExtension,
        this.lastModified,
        this.instantiatesCanonical,
        this.executionPeriod,
        this.businessStatus,
        this.reasonReference,
        this.meta,
        newValue,
        this.authoredOn,
        this.resourceType,
        this.language,
        this.priority,
        this.partOf,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Task#description() description} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTask withDescription(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.description, value)) return this;
    return new ImmutableTask(
        this.basedOn,
        this.implicitRules,
        this.statusReason,
        this._for,
        this.extension,
        this.instantiatesUri,
        this.intent,
        this.groupIdentifier,
        this.note,
        this.status,
        this.output,
        this.owner,
        this.id,
        this.code,
        this.input,
        this.text,
        this.restriction,
        this.encounter,
        this.focus,
        this.location,
        this.identifier,
        this.requester,
        this.performerType,
        this.contained,
        this.insurance,
        this.relevantHistory,
        this.modifierExtension,
        this.lastModified,
        this.instantiatesCanonical,
        this.executionPeriod,
        this.businessStatus,
        this.reasonReference,
        this.meta,
        value,
        this.authoredOn,
        this.resourceType,
        this.language,
        this.priority,
        this.partOf,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Task#authoredOn() authoredOn} attribute.
   * @param value The value for authoredOn
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTask withAuthoredOn(com.fhir.dateTime value) {
    @javax.annotation.Nullable com.fhir.dateTime newValue = java.util.Objects.requireNonNull(value, "authoredOn");
    if (this.authoredOn == newValue) return this;
    return new ImmutableTask(
        this.basedOn,
        this.implicitRules,
        this.statusReason,
        this._for,
        this.extension,
        this.instantiatesUri,
        this.intent,
        this.groupIdentifier,
        this.note,
        this.status,
        this.output,
        this.owner,
        this.id,
        this.code,
        this.input,
        this.text,
        this.restriction,
        this.encounter,
        this.focus,
        this.location,
        this.identifier,
        this.requester,
        this.performerType,
        this.contained,
        this.insurance,
        this.relevantHistory,
        this.modifierExtension,
        this.lastModified,
        this.instantiatesCanonical,
        this.executionPeriod,
        this.businessStatus,
        this.reasonReference,
        this.meta,
        this.description,
        newValue,
        this.resourceType,
        this.language,
        this.priority,
        this.partOf,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Task#authoredOn() authoredOn} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for authoredOn
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTask withAuthoredOn(java.util.Optional<? extends com.fhir.dateTime> optional) {
    @javax.annotation.Nullable com.fhir.dateTime value = optional.orElse(null);
    if (this.authoredOn == value) return this;
    return new ImmutableTask(
        this.basedOn,
        this.implicitRules,
        this.statusReason,
        this._for,
        this.extension,
        this.instantiatesUri,
        this.intent,
        this.groupIdentifier,
        this.note,
        this.status,
        this.output,
        this.owner,
        this.id,
        this.code,
        this.input,
        this.text,
        this.restriction,
        this.encounter,
        this.focus,
        this.location,
        this.identifier,
        this.requester,
        this.performerType,
        this.contained,
        this.insurance,
        this.relevantHistory,
        this.modifierExtension,
        this.lastModified,
        this.instantiatesCanonical,
        this.executionPeriod,
        this.businessStatus,
        this.reasonReference,
        this.meta,
        this.description,
        value,
        this.resourceType,
        this.language,
        this.priority,
        this.partOf,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Task#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTask withResourceType(java.lang.String value) {
    java.lang.String newValue = java.util.Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableTask(
        this.basedOn,
        this.implicitRules,
        this.statusReason,
        this._for,
        this.extension,
        this.instantiatesUri,
        this.intent,
        this.groupIdentifier,
        this.note,
        this.status,
        this.output,
        this.owner,
        this.id,
        this.code,
        this.input,
        this.text,
        this.restriction,
        this.encounter,
        this.focus,
        this.location,
        this.identifier,
        this.requester,
        this.performerType,
        this.contained,
        this.insurance,
        this.relevantHistory,
        this.modifierExtension,
        this.lastModified,
        this.instantiatesCanonical,
        this.executionPeriod,
        this.businessStatus,
        this.reasonReference,
        this.meta,
        this.description,
        this.authoredOn,
        newValue,
        this.language,
        this.priority,
        this.partOf,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Task#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTask withLanguage(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableTask(
        this.basedOn,
        this.implicitRules,
        this.statusReason,
        this._for,
        this.extension,
        this.instantiatesUri,
        this.intent,
        this.groupIdentifier,
        this.note,
        this.status,
        this.output,
        this.owner,
        this.id,
        this.code,
        this.input,
        this.text,
        this.restriction,
        this.encounter,
        this.focus,
        this.location,
        this.identifier,
        this.requester,
        this.performerType,
        this.contained,
        this.insurance,
        this.relevantHistory,
        this.modifierExtension,
        this.lastModified,
        this.instantiatesCanonical,
        this.executionPeriod,
        this.businessStatus,
        this.reasonReference,
        this.meta,
        this.description,
        this.authoredOn,
        this.resourceType,
        newValue,
        this.priority,
        this.partOf,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Task#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTask withLanguage(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableTask(
        this.basedOn,
        this.implicitRules,
        this.statusReason,
        this._for,
        this.extension,
        this.instantiatesUri,
        this.intent,
        this.groupIdentifier,
        this.note,
        this.status,
        this.output,
        this.owner,
        this.id,
        this.code,
        this.input,
        this.text,
        this.restriction,
        this.encounter,
        this.focus,
        this.location,
        this.identifier,
        this.requester,
        this.performerType,
        this.contained,
        this.insurance,
        this.relevantHistory,
        this.modifierExtension,
        this.lastModified,
        this.instantiatesCanonical,
        this.executionPeriod,
        this.businessStatus,
        this.reasonReference,
        this.meta,
        this.description,
        this.authoredOn,
        this.resourceType,
        value,
        this.priority,
        this.partOf,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Task#priority() priority} attribute.
   * @param value The value for priority
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTask withPriority(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "priority");
    if (this.priority == newValue) return this;
    return new ImmutableTask(
        this.basedOn,
        this.implicitRules,
        this.statusReason,
        this._for,
        this.extension,
        this.instantiatesUri,
        this.intent,
        this.groupIdentifier,
        this.note,
        this.status,
        this.output,
        this.owner,
        this.id,
        this.code,
        this.input,
        this.text,
        this.restriction,
        this.encounter,
        this.focus,
        this.location,
        this.identifier,
        this.requester,
        this.performerType,
        this.contained,
        this.insurance,
        this.relevantHistory,
        this.modifierExtension,
        this.lastModified,
        this.instantiatesCanonical,
        this.executionPeriod,
        this.businessStatus,
        this.reasonReference,
        this.meta,
        this.description,
        this.authoredOn,
        this.resourceType,
        this.language,
        newValue,
        this.partOf,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Task#priority() priority} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for priority
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTask withPriority(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.priority == value) return this;
    return new ImmutableTask(
        this.basedOn,
        this.implicitRules,
        this.statusReason,
        this._for,
        this.extension,
        this.instantiatesUri,
        this.intent,
        this.groupIdentifier,
        this.note,
        this.status,
        this.output,
        this.owner,
        this.id,
        this.code,
        this.input,
        this.text,
        this.restriction,
        this.encounter,
        this.focus,
        this.location,
        this.identifier,
        this.requester,
        this.performerType,
        this.contained,
        this.insurance,
        this.relevantHistory,
        this.modifierExtension,
        this.lastModified,
        this.instantiatesCanonical,
        this.executionPeriod,
        this.businessStatus,
        this.reasonReference,
        this.meta,
        this.description,
        this.authoredOn,
        this.resourceType,
        this.language,
        value,
        this.partOf,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Task#partOf() partOf} attribute.
   * @param value The value for partOf
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTask withPartOf(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "partOf");
    if (this.partOf == newValue) return this;
    return new ImmutableTask(
        this.basedOn,
        this.implicitRules,
        this.statusReason,
        this._for,
        this.extension,
        this.instantiatesUri,
        this.intent,
        this.groupIdentifier,
        this.note,
        this.status,
        this.output,
        this.owner,
        this.id,
        this.code,
        this.input,
        this.text,
        this.restriction,
        this.encounter,
        this.focus,
        this.location,
        this.identifier,
        this.requester,
        this.performerType,
        this.contained,
        this.insurance,
        this.relevantHistory,
        this.modifierExtension,
        this.lastModified,
        this.instantiatesCanonical,
        this.executionPeriod,
        this.businessStatus,
        this.reasonReference,
        this.meta,
        this.description,
        this.authoredOn,
        this.resourceType,
        this.language,
        this.priority,
        newValue,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Task#partOf() partOf} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for partOf
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTask withPartOf(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.partOf == value) return this;
    return new ImmutableTask(
        this.basedOn,
        this.implicitRules,
        this.statusReason,
        this._for,
        this.extension,
        this.instantiatesUri,
        this.intent,
        this.groupIdentifier,
        this.note,
        this.status,
        this.output,
        this.owner,
        this.id,
        this.code,
        this.input,
        this.text,
        this.restriction,
        this.encounter,
        this.focus,
        this.location,
        this.identifier,
        this.requester,
        this.performerType,
        this.contained,
        this.insurance,
        this.relevantHistory,
        this.modifierExtension,
        this.lastModified,
        this.instantiatesCanonical,
        this.executionPeriod,
        this.businessStatus,
        this.reasonReference,
        this.meta,
        this.description,
        this.authoredOn,
        this.resourceType,
        this.language,
        this.priority,
        value,
        this.reasonCode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Task#reasonCode() reasonCode} attribute.
   * @param value The value for reasonCode
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTask withReasonCode(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "reasonCode");
    if (this.reasonCode == newValue) return this;
    return new ImmutableTask(
        this.basedOn,
        this.implicitRules,
        this.statusReason,
        this._for,
        this.extension,
        this.instantiatesUri,
        this.intent,
        this.groupIdentifier,
        this.note,
        this.status,
        this.output,
        this.owner,
        this.id,
        this.code,
        this.input,
        this.text,
        this.restriction,
        this.encounter,
        this.focus,
        this.location,
        this.identifier,
        this.requester,
        this.performerType,
        this.contained,
        this.insurance,
        this.relevantHistory,
        this.modifierExtension,
        this.lastModified,
        this.instantiatesCanonical,
        this.executionPeriod,
        this.businessStatus,
        this.reasonReference,
        this.meta,
        this.description,
        this.authoredOn,
        this.resourceType,
        this.language,
        this.priority,
        this.partOf,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Task#reasonCode() reasonCode} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for reasonCode
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTask withReasonCode(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.reasonCode == value) return this;
    return new ImmutableTask(
        this.basedOn,
        this.implicitRules,
        this.statusReason,
        this._for,
        this.extension,
        this.instantiatesUri,
        this.intent,
        this.groupIdentifier,
        this.note,
        this.status,
        this.output,
        this.owner,
        this.id,
        this.code,
        this.input,
        this.text,
        this.restriction,
        this.encounter,
        this.focus,
        this.location,
        this.identifier,
        this.requester,
        this.performerType,
        this.contained,
        this.insurance,
        this.relevantHistory,
        this.modifierExtension,
        this.lastModified,
        this.instantiatesCanonical,
        this.executionPeriod,
        this.businessStatus,
        this.reasonReference,
        this.meta,
        this.description,
        this.authoredOn,
        this.resourceType,
        this.language,
        this.priority,
        this.partOf,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableTask} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableTask
        && equalTo((ImmutableTask) another);
  }

  private boolean equalTo(ImmutableTask another) {
    return java.util.Objects.equals(basedOn, another.basedOn)
        && java.util.Objects.equals(implicitRules, another.implicitRules)
        && java.util.Objects.equals(statusReason, another.statusReason)
        && java.util.Objects.equals(_for, another._for)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(instantiatesUri, another.instantiatesUri)
        && java.util.Objects.equals(intent, another.intent)
        && java.util.Objects.equals(groupIdentifier, another.groupIdentifier)
        && java.util.Objects.equals(note, another.note)
        && java.util.Objects.equals(status, another.status)
        && java.util.Objects.equals(output, another.output)
        && java.util.Objects.equals(owner, another.owner)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(code, another.code)
        && java.util.Objects.equals(input, another.input)
        && java.util.Objects.equals(text, another.text)
        && java.util.Objects.equals(restriction, another.restriction)
        && java.util.Objects.equals(encounter, another.encounter)
        && java.util.Objects.equals(focus, another.focus)
        && java.util.Objects.equals(location, another.location)
        && java.util.Objects.equals(identifier, another.identifier)
        && java.util.Objects.equals(requester, another.requester)
        && java.util.Objects.equals(performerType, another.performerType)
        && java.util.Objects.equals(contained, another.contained)
        && java.util.Objects.equals(insurance, another.insurance)
        && java.util.Objects.equals(relevantHistory, another.relevantHistory)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(lastModified, another.lastModified)
        && java.util.Objects.equals(instantiatesCanonical, another.instantiatesCanonical)
        && java.util.Objects.equals(executionPeriod, another.executionPeriod)
        && java.util.Objects.equals(businessStatus, another.businessStatus)
        && java.util.Objects.equals(reasonReference, another.reasonReference)
        && java.util.Objects.equals(meta, another.meta)
        && java.util.Objects.equals(description, another.description)
        && java.util.Objects.equals(authoredOn, another.authoredOn)
        && resourceType.equals(another.resourceType)
        && java.util.Objects.equals(language, another.language)
        && java.util.Objects.equals(priority, another.priority)
        && java.util.Objects.equals(partOf, another.partOf)
        && java.util.Objects.equals(reasonCode, another.reasonCode);
  }

  /**
   * Computes a hash code from attributes: {@code basedOn}, {@code implicitRules}, {@code statusReason}, {@code _for}, {@code extension}, {@code instantiatesUri}, {@code intent}, {@code groupIdentifier}, {@code note}, {@code status}, {@code output}, {@code owner}, {@code id}, {@code code}, {@code input}, {@code text}, {@code restriction}, {@code encounter}, {@code focus}, {@code location}, {@code identifier}, {@code requester}, {@code performerType}, {@code contained}, {@code insurance}, {@code relevantHistory}, {@code modifierExtension}, {@code lastModified}, {@code instantiatesCanonical}, {@code executionPeriod}, {@code businessStatus}, {@code reasonReference}, {@code meta}, {@code description}, {@code authoredOn}, {@code resourceType}, {@code language}, {@code priority}, {@code partOf}, {@code reasonCode}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(basedOn);
    h += (h << 5) + java.util.Objects.hashCode(implicitRules);
    h += (h << 5) + java.util.Objects.hashCode(statusReason);
    h += (h << 5) + java.util.Objects.hashCode(_for);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(instantiatesUri);
    h += (h << 5) + java.util.Objects.hashCode(intent);
    h += (h << 5) + java.util.Objects.hashCode(groupIdentifier);
    h += (h << 5) + java.util.Objects.hashCode(note);
    h += (h << 5) + java.util.Objects.hashCode(status);
    h += (h << 5) + java.util.Objects.hashCode(output);
    h += (h << 5) + java.util.Objects.hashCode(owner);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(code);
    h += (h << 5) + java.util.Objects.hashCode(input);
    h += (h << 5) + java.util.Objects.hashCode(text);
    h += (h << 5) + java.util.Objects.hashCode(restriction);
    h += (h << 5) + java.util.Objects.hashCode(encounter);
    h += (h << 5) + java.util.Objects.hashCode(focus);
    h += (h << 5) + java.util.Objects.hashCode(location);
    h += (h << 5) + java.util.Objects.hashCode(identifier);
    h += (h << 5) + java.util.Objects.hashCode(requester);
    h += (h << 5) + java.util.Objects.hashCode(performerType);
    h += (h << 5) + java.util.Objects.hashCode(contained);
    h += (h << 5) + java.util.Objects.hashCode(insurance);
    h += (h << 5) + java.util.Objects.hashCode(relevantHistory);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(lastModified);
    h += (h << 5) + java.util.Objects.hashCode(instantiatesCanonical);
    h += (h << 5) + java.util.Objects.hashCode(executionPeriod);
    h += (h << 5) + java.util.Objects.hashCode(businessStatus);
    h += (h << 5) + java.util.Objects.hashCode(reasonReference);
    h += (h << 5) + java.util.Objects.hashCode(meta);
    h += (h << 5) + java.util.Objects.hashCode(description);
    h += (h << 5) + java.util.Objects.hashCode(authoredOn);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(language);
    h += (h << 5) + java.util.Objects.hashCode(priority);
    h += (h << 5) + java.util.Objects.hashCode(partOf);
    h += (h << 5) + java.util.Objects.hashCode(reasonCode);
    return h;
  }

  /**
   * Prints the immutable value {@code Task} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("Task{");
    if (basedOn != null) {
      builder.append("basedOn=").append(basedOn);
    }
    if (implicitRules != null) {
      if (builder.length() > 5) builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (statusReason != null) {
      if (builder.length() > 5) builder.append(", ");
      builder.append("statusReason=").append(statusReason);
    }
    if (_for != null) {
      if (builder.length() > 5) builder.append(", ");
      builder.append("_for=").append(_for);
    }
    if (extension != null) {
      if (builder.length() > 5) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (instantiatesUri != null) {
      if (builder.length() > 5) builder.append(", ");
      builder.append("instantiatesUri=").append(instantiatesUri);
    }
    if (intent != null) {
      if (builder.length() > 5) builder.append(", ");
      builder.append("intent=").append(intent);
    }
    if (groupIdentifier != null) {
      if (builder.length() > 5) builder.append(", ");
      builder.append("groupIdentifier=").append(groupIdentifier);
    }
    if (note != null) {
      if (builder.length() > 5) builder.append(", ");
      builder.append("note=").append(note);
    }
    if (status != null) {
      if (builder.length() > 5) builder.append(", ");
      builder.append("status=").append(status);
    }
    if (output != null) {
      if (builder.length() > 5) builder.append(", ");
      builder.append("output=").append(output);
    }
    if (owner != null) {
      if (builder.length() > 5) builder.append(", ");
      builder.append("owner=").append(owner);
    }
    if (id != null) {
      if (builder.length() > 5) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (code != null) {
      if (builder.length() > 5) builder.append(", ");
      builder.append("code=").append(code);
    }
    if (input != null) {
      if (builder.length() > 5) builder.append(", ");
      builder.append("input=").append(input);
    }
    if (text != null) {
      if (builder.length() > 5) builder.append(", ");
      builder.append("text=").append(text);
    }
    if (restriction != null) {
      if (builder.length() > 5) builder.append(", ");
      builder.append("restriction=").append(restriction);
    }
    if (encounter != null) {
      if (builder.length() > 5) builder.append(", ");
      builder.append("encounter=").append(encounter);
    }
    if (focus != null) {
      if (builder.length() > 5) builder.append(", ");
      builder.append("focus=").append(focus);
    }
    if (location != null) {
      if (builder.length() > 5) builder.append(", ");
      builder.append("location=").append(location);
    }
    if (identifier != null) {
      if (builder.length() > 5) builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (requester != null) {
      if (builder.length() > 5) builder.append(", ");
      builder.append("requester=").append(requester);
    }
    if (performerType != null) {
      if (builder.length() > 5) builder.append(", ");
      builder.append("performerType=").append(performerType);
    }
    if (contained != null) {
      if (builder.length() > 5) builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (insurance != null) {
      if (builder.length() > 5) builder.append(", ");
      builder.append("insurance=").append(insurance);
    }
    if (relevantHistory != null) {
      if (builder.length() > 5) builder.append(", ");
      builder.append("relevantHistory=").append(relevantHistory);
    }
    if (modifierExtension != null) {
      if (builder.length() > 5) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (lastModified != null) {
      if (builder.length() > 5) builder.append(", ");
      builder.append("lastModified=").append(lastModified);
    }
    if (instantiatesCanonical != null) {
      if (builder.length() > 5) builder.append(", ");
      builder.append("instantiatesCanonical=").append(instantiatesCanonical);
    }
    if (executionPeriod != null) {
      if (builder.length() > 5) builder.append(", ");
      builder.append("executionPeriod=").append(executionPeriod);
    }
    if (businessStatus != null) {
      if (builder.length() > 5) builder.append(", ");
      builder.append("businessStatus=").append(businessStatus);
    }
    if (reasonReference != null) {
      if (builder.length() > 5) builder.append(", ");
      builder.append("reasonReference=").append(reasonReference);
    }
    if (meta != null) {
      if (builder.length() > 5) builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (description != null) {
      if (builder.length() > 5) builder.append(", ");
      builder.append("description=").append(description);
    }
    if (authoredOn != null) {
      if (builder.length() > 5) builder.append(", ");
      builder.append("authoredOn=").append(authoredOn);
    }
    if (builder.length() > 5) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (priority != null) {
      builder.append(", ");
      builder.append("priority=").append(priority);
    }
    if (partOf != null) {
      builder.append(", ");
      builder.append("partOf=").append(partOf);
    }
    if (reasonCode != null) {
      builder.append(", ");
      builder.append("reasonCode=").append(reasonCode);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "Task", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.Task {
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> basedOn = java.util.Optional.empty();
    boolean basedOnIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> implicitRules = java.util.Optional.empty();
    boolean implicitRulesIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> statusReason = java.util.Optional.empty();
    boolean statusReasonIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> _for = java.util.Optional.empty();
    boolean _forIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> instantiatesUri = java.util.Optional.empty();
    boolean instantiatesUriIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.TaskIntent> intent = java.util.Optional.empty();
    boolean intentIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Identifier> groupIdentifier = java.util.Optional.empty();
    boolean groupIdentifierIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Annotation>> note = java.util.Optional.empty();
    boolean noteIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.TaskStatus> status = java.util.Optional.empty();
    boolean statusIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Task_Output>> output = java.util.Optional.empty();
    boolean outputIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> owner = java.util.Optional.empty();
    boolean ownerIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> code = java.util.Optional.empty();
    boolean codeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Task_Input>> input = java.util.Optional.empty();
    boolean inputIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Narrative> text = java.util.Optional.empty();
    boolean textIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Task_Restriction> restriction = java.util.Optional.empty();
    boolean restrictionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> encounter = java.util.Optional.empty();
    boolean encounterIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> focus = java.util.Optional.empty();
    boolean focusIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> location = java.util.Optional.empty();
    boolean locationIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Identifier>> identifier = java.util.Optional.empty();
    boolean identifierIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> requester = java.util.Optional.empty();
    boolean requesterIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> performerType = java.util.Optional.empty();
    boolean performerTypeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ResourceList>> contained = java.util.Optional.empty();
    boolean containedIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> insurance = java.util.Optional.empty();
    boolean insuranceIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> relevantHistory = java.util.Optional.empty();
    boolean relevantHistoryIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.dateTime> lastModified = java.util.Optional.empty();
    boolean lastModifiedIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.canonical> instantiatesCanonical = java.util.Optional.empty();
    boolean instantiatesCanonicalIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Period> executionPeriod = java.util.Optional.empty();
    boolean executionPeriodIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> businessStatus = java.util.Optional.empty();
    boolean businessStatusIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> reasonReference = java.util.Optional.empty();
    boolean reasonReferenceIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Meta> meta = java.util.Optional.empty();
    boolean metaIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> description = java.util.Optional.empty();
    boolean descriptionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.dateTime> authoredOn = java.util.Optional.empty();
    boolean authoredOnIsSet;
    @javax.annotation.Nullable java.lang.String resourceType;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> language = java.util.Optional.empty();
    boolean languageIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> priority = java.util.Optional.empty();
    boolean priorityIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> partOf = java.util.Optional.empty();
    boolean partOfIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> reasonCode = java.util.Optional.empty();
    boolean reasonCodeIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("basedOn")
    public void setBasedOn(java.util.Optional<java.util.List<com.fhir.Reference>> basedOn) {
      this.basedOn = basedOn;
      this.basedOnIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
    public void setImplicitRules(java.util.Optional<com.fhir.uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("statusReason")
    public void setStatusReason(java.util.Optional<com.fhir.CodeableConcept> statusReason) {
      this.statusReason = statusReason;
      this.statusReasonIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("for")
    public void set_for(java.util.Optional<com.fhir.Reference> _for) {
      this._for = _for;
      this._forIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("instantiatesUri")
    public void setInstantiatesUri(java.util.Optional<com.fhir.uri> instantiatesUri) {
      this.instantiatesUri = instantiatesUri;
      this.instantiatesUriIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("intent")
    public void setIntent(java.util.Optional<com.fhir.TaskIntent> intent) {
      this.intent = intent;
      this.intentIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("groupIdentifier")
    public void setGroupIdentifier(java.util.Optional<com.fhir.Identifier> groupIdentifier) {
      this.groupIdentifier = groupIdentifier;
      this.groupIdentifierIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("note")
    public void setNote(java.util.Optional<java.util.List<com.fhir.Annotation>> note) {
      this.note = note;
      this.noteIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public void setStatus(java.util.Optional<com.fhir.TaskStatus> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("output")
    public void setOutput(java.util.Optional<java.util.List<com.fhir.Task_Output>> output) {
      this.output = output;
      this.outputIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("owner")
    public void setOwner(java.util.Optional<com.fhir.Reference> owner) {
      this.owner = owner;
      this.ownerIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<com.fhir.id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("code")
    public void setCode(java.util.Optional<com.fhir.CodeableConcept> code) {
      this.code = code;
      this.codeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("input")
    public void setInput(java.util.Optional<java.util.List<com.fhir.Task_Input>> input) {
      this.input = input;
      this.inputIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    public void setText(java.util.Optional<com.fhir.Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("restriction")
    public void setRestriction(java.util.Optional<com.fhir.Task_Restriction> restriction) {
      this.restriction = restriction;
      this.restrictionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("encounter")
    public void setEncounter(java.util.Optional<com.fhir.Reference> encounter) {
      this.encounter = encounter;
      this.encounterIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("focus")
    public void setFocus(java.util.Optional<com.fhir.Reference> focus) {
      this.focus = focus;
      this.focusIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("location")
    public void setLocation(java.util.Optional<com.fhir.Reference> location) {
      this.location = location;
      this.locationIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    public void setIdentifier(java.util.Optional<java.util.List<com.fhir.Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("requester")
    public void setRequester(java.util.Optional<com.fhir.Reference> requester) {
      this.requester = requester;
      this.requesterIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("performerType")
    public void setPerformerType(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> performerType) {
      this.performerType = performerType;
      this.performerTypeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("contained")
    public void setContained(java.util.Optional<java.util.List<com.fhir.ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("insurance")
    public void setInsurance(java.util.Optional<java.util.List<com.fhir.Reference>> insurance) {
      this.insurance = insurance;
      this.insuranceIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("relevantHistory")
    public void setRelevantHistory(java.util.Optional<java.util.List<com.fhir.Reference>> relevantHistory) {
      this.relevantHistory = relevantHistory;
      this.relevantHistoryIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("lastModified")
    public void setLastModified(java.util.Optional<com.fhir.dateTime> lastModified) {
      this.lastModified = lastModified;
      this.lastModifiedIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("instantiatesCanonical")
    public void setInstantiatesCanonical(java.util.Optional<com.fhir.canonical> instantiatesCanonical) {
      this.instantiatesCanonical = instantiatesCanonical;
      this.instantiatesCanonicalIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("executionPeriod")
    public void setExecutionPeriod(java.util.Optional<com.fhir.Period> executionPeriod) {
      this.executionPeriod = executionPeriod;
      this.executionPeriodIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("businessStatus")
    public void setBusinessStatus(java.util.Optional<com.fhir.CodeableConcept> businessStatus) {
      this.businessStatus = businessStatus;
      this.businessStatusIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("reasonReference")
    public void setReasonReference(java.util.Optional<com.fhir.Reference> reasonReference) {
      this.reasonReference = reasonReference;
      this.reasonReferenceIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("meta")
    public void setMeta(java.util.Optional<com.fhir.Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    public void setDescription(java.util.Optional<java.lang.String> description) {
      this.description = description;
      this.descriptionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("authoredOn")
    public void setAuthoredOn(java.util.Optional<com.fhir.dateTime> authoredOn) {
      this.authoredOn = authoredOn;
      this.authoredOnIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public void setResourceType(java.lang.String resourceType) {
      this.resourceType = resourceType;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    public void setLanguage(java.util.Optional<com.fhir.code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("priority")
    public void setPriority(java.util.Optional<com.fhir.code> priority) {
      this.priority = priority;
      this.priorityIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("partOf")
    public void setPartOf(java.util.Optional<java.util.List<com.fhir.Reference>> partOf) {
      this.partOf = partOf;
      this.partOfIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("reasonCode")
    public void setReasonCode(java.util.Optional<com.fhir.CodeableConcept> reasonCode) {
      this.reasonCode = reasonCode;
      this.reasonCodeIsSet = true;
    }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> basedOn() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> statusReason() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> _for() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> instantiatesUri() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.TaskIntent> intent() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Identifier> groupIdentifier() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Annotation>> note() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.TaskStatus> status() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Task_Output>> output() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> owner() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.id> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> code() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Task_Input>> input() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Task_Restriction> restriction() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> encounter() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> focus() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> location() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> requester() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> performerType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> insurance() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> relevantHistory() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.dateTime> lastModified() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.canonical> instantiatesCanonical() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Period> executionPeriod() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> businessStatus() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> reasonReference() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> description() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.dateTime> authoredOn() { throw new UnsupportedOperationException(); }
    @Override
    public java.lang.String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> language() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> priority() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> partOf() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> reasonCode() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableTask fromJson(Json json) {
    ImmutableTask.Builder builder = ((ImmutableTask.Builder) ImmutableTask.builder());
    if (json.basedOnIsSet) {
      builder.basedOn(json.basedOn);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.statusReasonIsSet) {
      builder.statusReason(json.statusReason);
    }
    if (json._forIsSet) {
      builder._for(json._for);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.instantiatesUriIsSet) {
      builder.instantiatesUri(json.instantiatesUri);
    }
    if (json.intentIsSet) {
      builder.intent(json.intent);
    }
    if (json.groupIdentifierIsSet) {
      builder.groupIdentifier(json.groupIdentifier);
    }
    if (json.noteIsSet) {
      builder.note(json.note);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.outputIsSet) {
      builder.output(json.output);
    }
    if (json.ownerIsSet) {
      builder.owner(json.owner);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.codeIsSet) {
      builder.code(json.code);
    }
    if (json.inputIsSet) {
      builder.input(json.input);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.restrictionIsSet) {
      builder.restriction(json.restriction);
    }
    if (json.encounterIsSet) {
      builder.encounter(json.encounter);
    }
    if (json.focusIsSet) {
      builder.focus(json.focus);
    }
    if (json.locationIsSet) {
      builder.location(json.location);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.requesterIsSet) {
      builder.requester(json.requester);
    }
    if (json.performerTypeIsSet) {
      builder.performerType(json.performerType);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.insuranceIsSet) {
      builder.insurance(json.insurance);
    }
    if (json.relevantHistoryIsSet) {
      builder.relevantHistory(json.relevantHistory);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.lastModifiedIsSet) {
      builder.lastModified(json.lastModified);
    }
    if (json.instantiatesCanonicalIsSet) {
      builder.instantiatesCanonical(json.instantiatesCanonical);
    }
    if (json.executionPeriodIsSet) {
      builder.executionPeriod(json.executionPeriod);
    }
    if (json.businessStatusIsSet) {
      builder.businessStatus(json.businessStatus);
    }
    if (json.reasonReferenceIsSet) {
      builder.reasonReference(json.reasonReference);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.descriptionIsSet) {
      builder.description(json.description);
    }
    if (json.authoredOnIsSet) {
      builder.authoredOn(json.authoredOn);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.priorityIsSet) {
      builder.priority(json.priority);
    }
    if (json.partOfIsSet) {
      builder.partOf(json.partOf);
    }
    if (json.reasonCodeIsSet) {
      builder.reasonCode(json.reasonCode);
    }
    return (ImmutableTask) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Task} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Task instance
   */
  public static Task copyOf(Task instance) {
    if (instance instanceof ImmutableTask) {
      return (ImmutableTask) instance;
    }
    return ((ImmutableTask.Builder) ImmutableTask.builder())
        .basedOn(instance.basedOn())
        .implicitRules(instance.implicitRules())
        .statusReason(instance.statusReason())
        ._for(instance._for())
        .extension(instance.extension())
        .instantiatesUri(instance.instantiatesUri())
        .intent(instance.intent())
        .groupIdentifier(instance.groupIdentifier())
        .note(instance.note())
        .status(instance.status())
        .output(instance.output())
        .owner(instance.owner())
        .id(instance.id())
        .code(instance.code())
        .input(instance.input())
        .text(instance.text())
        .restriction(instance.restriction())
        .encounter(instance.encounter())
        .focus(instance.focus())
        .location(instance.location())
        .identifier(instance.identifier())
        .requester(instance.requester())
        .performerType(instance.performerType())
        .contained(instance.contained())
        .insurance(instance.insurance())
        .relevantHistory(instance.relevantHistory())
        .modifierExtension(instance.modifierExtension())
        .lastModified(instance.lastModified())
        .instantiatesCanonical(instance.instantiatesCanonical())
        .executionPeriod(instance.executionPeriod())
        .businessStatus(instance.businessStatus())
        .reasonReference(instance.reasonReference())
        .meta(instance.meta())
        .description(instance.description())
        .authoredOn(instance.authoredOn())
        .resourceType(instance.resourceType())
        .language(instance.language())
        .priority(instance.priority())
        .partOf(instance.partOf())
        .reasonCode(instance.reasonCode())
        .build();
  }

  /**
   * Creates a builder for {@link Task Task}.
   * <pre>
   * ImmutableTask.builder()
   *    .basedOn(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link Task#basedOn() basedOn}
   *    .implicitRules(com.fhir.uri) // optional {@link Task#implicitRules() implicitRules}
   *    .statusReason(com.fhir.CodeableConcept) // optional {@link Task#statusReason() statusReason}
   *    ._for(com.fhir.Reference) // optional {@link Task#_for() _for}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link Task#extension() extension}
   *    .instantiatesUri(com.fhir.uri) // optional {@link Task#instantiatesUri() instantiatesUri}
   *    .intent(com.fhir.TaskIntent) // optional {@link Task#intent() intent}
   *    .groupIdentifier(com.fhir.Identifier) // optional {@link Task#groupIdentifier() groupIdentifier}
   *    .note(List&amp;lt;com.fhir.Annotation&amp;gt;) // optional {@link Task#note() note}
   *    .status(com.fhir.TaskStatus) // optional {@link Task#status() status}
   *    .output(List&amp;lt;com.fhir.Task_Output&amp;gt;) // optional {@link Task#output() output}
   *    .owner(com.fhir.Reference) // optional {@link Task#owner() owner}
   *    .id(com.fhir.id) // optional {@link Task#id() id}
   *    .code(com.fhir.CodeableConcept) // optional {@link Task#code() code}
   *    .input(List&amp;lt;com.fhir.Task_Input&amp;gt;) // optional {@link Task#input() input}
   *    .text(com.fhir.Narrative) // optional {@link Task#text() text}
   *    .restriction(com.fhir.Task_Restriction) // optional {@link Task#restriction() restriction}
   *    .encounter(com.fhir.Reference) // optional {@link Task#encounter() encounter}
   *    .focus(com.fhir.Reference) // optional {@link Task#focus() focus}
   *    .location(com.fhir.Reference) // optional {@link Task#location() location}
   *    .identifier(List&amp;lt;com.fhir.Identifier&amp;gt;) // optional {@link Task#identifier() identifier}
   *    .requester(com.fhir.Reference) // optional {@link Task#requester() requester}
   *    .performerType(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link Task#performerType() performerType}
   *    .contained(List&amp;lt;com.fhir.ResourceList&amp;gt;) // optional {@link Task#contained() contained}
   *    .insurance(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link Task#insurance() insurance}
   *    .relevantHistory(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link Task#relevantHistory() relevantHistory}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link Task#modifierExtension() modifierExtension}
   *    .lastModified(com.fhir.dateTime) // optional {@link Task#lastModified() lastModified}
   *    .instantiatesCanonical(com.fhir.canonical) // optional {@link Task#instantiatesCanonical() instantiatesCanonical}
   *    .executionPeriod(com.fhir.Period) // optional {@link Task#executionPeriod() executionPeriod}
   *    .businessStatus(com.fhir.CodeableConcept) // optional {@link Task#businessStatus() businessStatus}
   *    .reasonReference(com.fhir.Reference) // optional {@link Task#reasonReference() reasonReference}
   *    .meta(com.fhir.Meta) // optional {@link Task#meta() meta}
   *    .description(String) // optional {@link Task#description() description}
   *    .authoredOn(com.fhir.dateTime) // optional {@link Task#authoredOn() authoredOn}
   *    .resourceType(String) // required {@link Task#resourceType() resourceType}
   *    .language(com.fhir.code) // optional {@link Task#language() language}
   *    .priority(com.fhir.code) // optional {@link Task#priority() priority}
   *    .partOf(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link Task#partOf() partOf}
   *    .reasonCode(com.fhir.CodeableConcept) // optional {@link Task#reasonCode() reasonCode}
   *    .build();
   * </pre>
   * @return A new Task builder
   */
  public static ResourceTypeBuildStage builder() {
    return new ImmutableTask.Builder();
  }

  /**
   * Builds instances of type {@link Task Task}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "Task", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long OPT_BIT_BASED_ON = 0x1L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x2L;
    private static final long OPT_BIT_STATUS_REASON = 0x4L;
    private static final long OPT_BIT__FOR = 0x8L;
    private static final long OPT_BIT_EXTENSION = 0x10L;
    private static final long OPT_BIT_INSTANTIATES_URI = 0x20L;
    private static final long OPT_BIT_INTENT = 0x40L;
    private static final long OPT_BIT_GROUP_IDENTIFIER = 0x80L;
    private static final long OPT_BIT_NOTE = 0x100L;
    private static final long OPT_BIT_STATUS = 0x200L;
    private static final long OPT_BIT_OUTPUT = 0x400L;
    private static final long OPT_BIT_OWNER = 0x800L;
    private static final long OPT_BIT_ID = 0x1000L;
    private static final long OPT_BIT_CODE = 0x2000L;
    private static final long OPT_BIT_INPUT = 0x4000L;
    private static final long OPT_BIT_TEXT = 0x8000L;
    private static final long OPT_BIT_RESTRICTION = 0x10000L;
    private static final long OPT_BIT_ENCOUNTER = 0x20000L;
    private static final long OPT_BIT_FOCUS = 0x40000L;
    private static final long OPT_BIT_LOCATION = 0x80000L;
    private static final long OPT_BIT_IDENTIFIER = 0x100000L;
    private static final long OPT_BIT_REQUESTER = 0x200000L;
    private static final long OPT_BIT_PERFORMER_TYPE = 0x400000L;
    private static final long OPT_BIT_CONTAINED = 0x800000L;
    private static final long OPT_BIT_INSURANCE = 0x1000000L;
    private static final long OPT_BIT_RELEVANT_HISTORY = 0x2000000L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x4000000L;
    private static final long OPT_BIT_LAST_MODIFIED = 0x8000000L;
    private static final long OPT_BIT_INSTANTIATES_CANONICAL = 0x10000000L;
    private static final long OPT_BIT_EXECUTION_PERIOD = 0x20000000L;
    private static final long OPT_BIT_BUSINESS_STATUS = 0x40000000L;
    private static final long OPT_BIT_REASON_REFERENCE = 0x80000000L;
    private static final long OPT_BIT_META = 0x100000000L;
    private static final long OPT_BIT_DESCRIPTION = 0x200000000L;
    private static final long OPT_BIT_AUTHORED_ON = 0x400000000L;
    private static final long OPT_BIT_LANGUAGE = 0x800000000L;
    private static final long OPT_BIT_PRIORITY = 0x1000000000L;
    private static final long OPT_BIT_PART_OF = 0x2000000000L;
    private static final long OPT_BIT_REASON_CODE = 0x4000000000L;
    private long initBits = 0x1L;
    private long optBits;

    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> basedOn;
    private @javax.annotation.Nullable com.fhir.uri implicitRules;
    private @javax.annotation.Nullable com.fhir.CodeableConcept statusReason;
    private @javax.annotation.Nullable com.fhir.Reference _for;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable com.fhir.uri instantiatesUri;
    private @javax.annotation.Nullable com.fhir.TaskIntent intent;
    private @javax.annotation.Nullable com.fhir.Identifier groupIdentifier;
    private @javax.annotation.Nullable java.util.List<com.fhir.Annotation> note;
    private @javax.annotation.Nullable com.fhir.TaskStatus status;
    private @javax.annotation.Nullable java.util.List<com.fhir.Task_Output> output;
    private @javax.annotation.Nullable com.fhir.Reference owner;
    private @javax.annotation.Nullable com.fhir.id id;
    private @javax.annotation.Nullable com.fhir.CodeableConcept code;
    private @javax.annotation.Nullable java.util.List<com.fhir.Task_Input> input;
    private @javax.annotation.Nullable com.fhir.Narrative text;
    private @javax.annotation.Nullable com.fhir.Task_Restriction restriction;
    private @javax.annotation.Nullable com.fhir.Reference encounter;
    private @javax.annotation.Nullable com.fhir.Reference focus;
    private @javax.annotation.Nullable com.fhir.Reference location;
    private @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
    private @javax.annotation.Nullable com.fhir.Reference requester;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> performerType;
    private @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> insurance;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> relevantHistory;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable com.fhir.dateTime lastModified;
    private @javax.annotation.Nullable com.fhir.canonical instantiatesCanonical;
    private @javax.annotation.Nullable com.fhir.Period executionPeriod;
    private @javax.annotation.Nullable com.fhir.CodeableConcept businessStatus;
    private @javax.annotation.Nullable com.fhir.Reference reasonReference;
    private @javax.annotation.Nullable com.fhir.Meta meta;
    private @javax.annotation.Nullable java.lang.String description;
    private @javax.annotation.Nullable com.fhir.dateTime authoredOn;
    private @javax.annotation.Nullable java.lang.String resourceType;
    private @javax.annotation.Nullable com.fhir.code language;
    private @javax.annotation.Nullable com.fhir.code priority;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> partOf;
    private @javax.annotation.Nullable com.fhir.CodeableConcept reasonCode;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Task#basedOn() basedOn} to basedOn.
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
     * Initializes the optional value {@link Task#basedOn() basedOn} to basedOn.
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
     * Initializes the optional value {@link Task#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link Task#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link Task#statusReason() statusReason} to statusReason.
     * @param statusReason The value for statusReason
     * @return {@code this} builder for chained invocation
     */
    public final Builder statusReason(com.fhir.CodeableConcept statusReason) {
      checkNotIsSet(statusReasonIsSet(), "statusReason");
      this.statusReason = java.util.Objects.requireNonNull(statusReason, "statusReason");
      optBits |= OPT_BIT_STATUS_REASON;
      return this;
    }

    /**
     * Initializes the optional value {@link Task#statusReason() statusReason} to statusReason.
     * @param statusReason The value for statusReason
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("statusReason")
    public final Builder statusReason(java.util.Optional<? extends com.fhir.CodeableConcept> statusReason) {
      checkNotIsSet(statusReasonIsSet(), "statusReason");
      this.statusReason = statusReason.orElse(null);
      optBits |= OPT_BIT_STATUS_REASON;
      return this;
    }

    /**
     * Initializes the optional value {@link Task#_for() _for} to _for.
     * @param _for The value for _for
     * @return {@code this} builder for chained invocation
     */
    public final Builder _for(com.fhir.Reference _for) {
      checkNotIsSet(_forIsSet(), "_for");
      this._for = java.util.Objects.requireNonNull(_for, "_for");
      optBits |= OPT_BIT__FOR;
      return this;
    }

    /**
     * Initializes the optional value {@link Task#_for() _for} to _for.
     * @param _for The value for _for
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("for")
    public final Builder _for(java.util.Optional<? extends com.fhir.Reference> _for) {
      checkNotIsSet(_forIsSet(), "_for");
      this._for = _for.orElse(null);
      optBits |= OPT_BIT__FOR;
      return this;
    }

    /**
     * Initializes the optional value {@link Task#extension() extension} to extension.
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
     * Initializes the optional value {@link Task#extension() extension} to extension.
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
     * Initializes the optional value {@link Task#instantiatesUri() instantiatesUri} to instantiatesUri.
     * @param instantiatesUri The value for instantiatesUri
     * @return {@code this} builder for chained invocation
     */
    public final Builder instantiatesUri(com.fhir.uri instantiatesUri) {
      checkNotIsSet(instantiatesUriIsSet(), "instantiatesUri");
      this.instantiatesUri = java.util.Objects.requireNonNull(instantiatesUri, "instantiatesUri");
      optBits |= OPT_BIT_INSTANTIATES_URI;
      return this;
    }

    /**
     * Initializes the optional value {@link Task#instantiatesUri() instantiatesUri} to instantiatesUri.
     * @param instantiatesUri The value for instantiatesUri
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("instantiatesUri")
    public final Builder instantiatesUri(java.util.Optional<? extends com.fhir.uri> instantiatesUri) {
      checkNotIsSet(instantiatesUriIsSet(), "instantiatesUri");
      this.instantiatesUri = instantiatesUri.orElse(null);
      optBits |= OPT_BIT_INSTANTIATES_URI;
      return this;
    }

    /**
     * Initializes the optional value {@link Task#intent() intent} to intent.
     * @param intent The value for intent
     * @return {@code this} builder for chained invocation
     */
    public final Builder intent(com.fhir.TaskIntent intent) {
      checkNotIsSet(intentIsSet(), "intent");
      this.intent = java.util.Objects.requireNonNull(intent, "intent");
      optBits |= OPT_BIT_INTENT;
      return this;
    }

    /**
     * Initializes the optional value {@link Task#intent() intent} to intent.
     * @param intent The value for intent
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("intent")
    public final Builder intent(java.util.Optional<? extends com.fhir.TaskIntent> intent) {
      checkNotIsSet(intentIsSet(), "intent");
      this.intent = intent.orElse(null);
      optBits |= OPT_BIT_INTENT;
      return this;
    }

    /**
     * Initializes the optional value {@link Task#groupIdentifier() groupIdentifier} to groupIdentifier.
     * @param groupIdentifier The value for groupIdentifier
     * @return {@code this} builder for chained invocation
     */
    public final Builder groupIdentifier(com.fhir.Identifier groupIdentifier) {
      checkNotIsSet(groupIdentifierIsSet(), "groupIdentifier");
      this.groupIdentifier = java.util.Objects.requireNonNull(groupIdentifier, "groupIdentifier");
      optBits |= OPT_BIT_GROUP_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link Task#groupIdentifier() groupIdentifier} to groupIdentifier.
     * @param groupIdentifier The value for groupIdentifier
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("groupIdentifier")
    public final Builder groupIdentifier(java.util.Optional<? extends com.fhir.Identifier> groupIdentifier) {
      checkNotIsSet(groupIdentifierIsSet(), "groupIdentifier");
      this.groupIdentifier = groupIdentifier.orElse(null);
      optBits |= OPT_BIT_GROUP_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link Task#note() note} to note.
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
     * Initializes the optional value {@link Task#note() note} to note.
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
     * Initializes the optional value {@link Task#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(com.fhir.TaskStatus status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = java.util.Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link Task#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public final Builder status(java.util.Optional<? extends com.fhir.TaskStatus> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link Task#output() output} to output.
     * @param output The value for output
     * @return {@code this} builder for chained invocation
     */
    public final Builder output(java.util.List<com.fhir.Task_Output> output) {
      checkNotIsSet(outputIsSet(), "output");
      this.output = java.util.Objects.requireNonNull(output, "output");
      optBits |= OPT_BIT_OUTPUT;
      return this;
    }

    /**
     * Initializes the optional value {@link Task#output() output} to output.
     * @param output The value for output
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("output")
    public final Builder output(java.util.Optional<? extends java.util.List<com.fhir.Task_Output>> output) {
      checkNotIsSet(outputIsSet(), "output");
      this.output = output.orElse(null);
      optBits |= OPT_BIT_OUTPUT;
      return this;
    }

    /**
     * Initializes the optional value {@link Task#owner() owner} to owner.
     * @param owner The value for owner
     * @return {@code this} builder for chained invocation
     */
    public final Builder owner(com.fhir.Reference owner) {
      checkNotIsSet(ownerIsSet(), "owner");
      this.owner = java.util.Objects.requireNonNull(owner, "owner");
      optBits |= OPT_BIT_OWNER;
      return this;
    }

    /**
     * Initializes the optional value {@link Task#owner() owner} to owner.
     * @param owner The value for owner
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("owner")
    public final Builder owner(java.util.Optional<? extends com.fhir.Reference> owner) {
      checkNotIsSet(ownerIsSet(), "owner");
      this.owner = owner.orElse(null);
      optBits |= OPT_BIT_OWNER;
      return this;
    }

    /**
     * Initializes the optional value {@link Task#id() id} to id.
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
     * Initializes the optional value {@link Task#id() id} to id.
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
     * Initializes the optional value {@link Task#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for chained invocation
     */
    public final Builder code(com.fhir.CodeableConcept code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = java.util.Objects.requireNonNull(code, "code");
      optBits |= OPT_BIT_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link Task#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("code")
    public final Builder code(java.util.Optional<? extends com.fhir.CodeableConcept> code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = code.orElse(null);
      optBits |= OPT_BIT_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link Task#input() input} to input.
     * @param input The value for input
     * @return {@code this} builder for chained invocation
     */
    public final Builder input(java.util.List<com.fhir.Task_Input> input) {
      checkNotIsSet(inputIsSet(), "input");
      this.input = java.util.Objects.requireNonNull(input, "input");
      optBits |= OPT_BIT_INPUT;
      return this;
    }

    /**
     * Initializes the optional value {@link Task#input() input} to input.
     * @param input The value for input
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("input")
    public final Builder input(java.util.Optional<? extends java.util.List<com.fhir.Task_Input>> input) {
      checkNotIsSet(inputIsSet(), "input");
      this.input = input.orElse(null);
      optBits |= OPT_BIT_INPUT;
      return this;
    }

    /**
     * Initializes the optional value {@link Task#text() text} to text.
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
     * Initializes the optional value {@link Task#text() text} to text.
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
     * Initializes the optional value {@link Task#restriction() restriction} to restriction.
     * @param restriction The value for restriction
     * @return {@code this} builder for chained invocation
     */
    public final Builder restriction(com.fhir.Task_Restriction restriction) {
      checkNotIsSet(restrictionIsSet(), "restriction");
      this.restriction = java.util.Objects.requireNonNull(restriction, "restriction");
      optBits |= OPT_BIT_RESTRICTION;
      return this;
    }

    /**
     * Initializes the optional value {@link Task#restriction() restriction} to restriction.
     * @param restriction The value for restriction
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("restriction")
    public final Builder restriction(java.util.Optional<? extends com.fhir.Task_Restriction> restriction) {
      checkNotIsSet(restrictionIsSet(), "restriction");
      this.restriction = restriction.orElse(null);
      optBits |= OPT_BIT_RESTRICTION;
      return this;
    }

    /**
     * Initializes the optional value {@link Task#encounter() encounter} to encounter.
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
     * Initializes the optional value {@link Task#encounter() encounter} to encounter.
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
     * Initializes the optional value {@link Task#focus() focus} to focus.
     * @param focus The value for focus
     * @return {@code this} builder for chained invocation
     */
    public final Builder focus(com.fhir.Reference focus) {
      checkNotIsSet(focusIsSet(), "focus");
      this.focus = java.util.Objects.requireNonNull(focus, "focus");
      optBits |= OPT_BIT_FOCUS;
      return this;
    }

    /**
     * Initializes the optional value {@link Task#focus() focus} to focus.
     * @param focus The value for focus
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("focus")
    public final Builder focus(java.util.Optional<? extends com.fhir.Reference> focus) {
      checkNotIsSet(focusIsSet(), "focus");
      this.focus = focus.orElse(null);
      optBits |= OPT_BIT_FOCUS;
      return this;
    }

    /**
     * Initializes the optional value {@link Task#location() location} to location.
     * @param location The value for location
     * @return {@code this} builder for chained invocation
     */
    public final Builder location(com.fhir.Reference location) {
      checkNotIsSet(locationIsSet(), "location");
      this.location = java.util.Objects.requireNonNull(location, "location");
      optBits |= OPT_BIT_LOCATION;
      return this;
    }

    /**
     * Initializes the optional value {@link Task#location() location} to location.
     * @param location The value for location
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("location")
    public final Builder location(java.util.Optional<? extends com.fhir.Reference> location) {
      checkNotIsSet(locationIsSet(), "location");
      this.location = location.orElse(null);
      optBits |= OPT_BIT_LOCATION;
      return this;
    }

    /**
     * Initializes the optional value {@link Task#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link Task#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link Task#requester() requester} to requester.
     * @param requester The value for requester
     * @return {@code this} builder for chained invocation
     */
    public final Builder requester(com.fhir.Reference requester) {
      checkNotIsSet(requesterIsSet(), "requester");
      this.requester = java.util.Objects.requireNonNull(requester, "requester");
      optBits |= OPT_BIT_REQUESTER;
      return this;
    }

    /**
     * Initializes the optional value {@link Task#requester() requester} to requester.
     * @param requester The value for requester
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("requester")
    public final Builder requester(java.util.Optional<? extends com.fhir.Reference> requester) {
      checkNotIsSet(requesterIsSet(), "requester");
      this.requester = requester.orElse(null);
      optBits |= OPT_BIT_REQUESTER;
      return this;
    }

    /**
     * Initializes the optional value {@link Task#performerType() performerType} to performerType.
     * @param performerType The value for performerType
     * @return {@code this} builder for chained invocation
     */
    public final Builder performerType(java.util.List<com.fhir.CodeableConcept> performerType) {
      checkNotIsSet(performerTypeIsSet(), "performerType");
      this.performerType = java.util.Objects.requireNonNull(performerType, "performerType");
      optBits |= OPT_BIT_PERFORMER_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Task#performerType() performerType} to performerType.
     * @param performerType The value for performerType
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("performerType")
    public final Builder performerType(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> performerType) {
      checkNotIsSet(performerTypeIsSet(), "performerType");
      this.performerType = performerType.orElse(null);
      optBits |= OPT_BIT_PERFORMER_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Task#contained() contained} to contained.
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
     * Initializes the optional value {@link Task#contained() contained} to contained.
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
     * Initializes the optional value {@link Task#insurance() insurance} to insurance.
     * @param insurance The value for insurance
     * @return {@code this} builder for chained invocation
     */
    public final Builder insurance(java.util.List<com.fhir.Reference> insurance) {
      checkNotIsSet(insuranceIsSet(), "insurance");
      this.insurance = java.util.Objects.requireNonNull(insurance, "insurance");
      optBits |= OPT_BIT_INSURANCE;
      return this;
    }

    /**
     * Initializes the optional value {@link Task#insurance() insurance} to insurance.
     * @param insurance The value for insurance
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("insurance")
    public final Builder insurance(java.util.Optional<? extends java.util.List<com.fhir.Reference>> insurance) {
      checkNotIsSet(insuranceIsSet(), "insurance");
      this.insurance = insurance.orElse(null);
      optBits |= OPT_BIT_INSURANCE;
      return this;
    }

    /**
     * Initializes the optional value {@link Task#relevantHistory() relevantHistory} to relevantHistory.
     * @param relevantHistory The value for relevantHistory
     * @return {@code this} builder for chained invocation
     */
    public final Builder relevantHistory(java.util.List<com.fhir.Reference> relevantHistory) {
      checkNotIsSet(relevantHistoryIsSet(), "relevantHistory");
      this.relevantHistory = java.util.Objects.requireNonNull(relevantHistory, "relevantHistory");
      optBits |= OPT_BIT_RELEVANT_HISTORY;
      return this;
    }

    /**
     * Initializes the optional value {@link Task#relevantHistory() relevantHistory} to relevantHistory.
     * @param relevantHistory The value for relevantHistory
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("relevantHistory")
    public final Builder relevantHistory(java.util.Optional<? extends java.util.List<com.fhir.Reference>> relevantHistory) {
      checkNotIsSet(relevantHistoryIsSet(), "relevantHistory");
      this.relevantHistory = relevantHistory.orElse(null);
      optBits |= OPT_BIT_RELEVANT_HISTORY;
      return this;
    }

    /**
     * Initializes the optional value {@link Task#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Task#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Task#lastModified() lastModified} to lastModified.
     * @param lastModified The value for lastModified
     * @return {@code this} builder for chained invocation
     */
    public final Builder lastModified(com.fhir.dateTime lastModified) {
      checkNotIsSet(lastModifiedIsSet(), "lastModified");
      this.lastModified = java.util.Objects.requireNonNull(lastModified, "lastModified");
      optBits |= OPT_BIT_LAST_MODIFIED;
      return this;
    }

    /**
     * Initializes the optional value {@link Task#lastModified() lastModified} to lastModified.
     * @param lastModified The value for lastModified
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lastModified")
    public final Builder lastModified(java.util.Optional<? extends com.fhir.dateTime> lastModified) {
      checkNotIsSet(lastModifiedIsSet(), "lastModified");
      this.lastModified = lastModified.orElse(null);
      optBits |= OPT_BIT_LAST_MODIFIED;
      return this;
    }

    /**
     * Initializes the optional value {@link Task#instantiatesCanonical() instantiatesCanonical} to instantiatesCanonical.
     * @param instantiatesCanonical The value for instantiatesCanonical
     * @return {@code this} builder for chained invocation
     */
    public final Builder instantiatesCanonical(com.fhir.canonical instantiatesCanonical) {
      checkNotIsSet(instantiatesCanonicalIsSet(), "instantiatesCanonical");
      this.instantiatesCanonical = java.util.Objects.requireNonNull(instantiatesCanonical, "instantiatesCanonical");
      optBits |= OPT_BIT_INSTANTIATES_CANONICAL;
      return this;
    }

    /**
     * Initializes the optional value {@link Task#instantiatesCanonical() instantiatesCanonical} to instantiatesCanonical.
     * @param instantiatesCanonical The value for instantiatesCanonical
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("instantiatesCanonical")
    public final Builder instantiatesCanonical(java.util.Optional<? extends com.fhir.canonical> instantiatesCanonical) {
      checkNotIsSet(instantiatesCanonicalIsSet(), "instantiatesCanonical");
      this.instantiatesCanonical = instantiatesCanonical.orElse(null);
      optBits |= OPT_BIT_INSTANTIATES_CANONICAL;
      return this;
    }

    /**
     * Initializes the optional value {@link Task#executionPeriod() executionPeriod} to executionPeriod.
     * @param executionPeriod The value for executionPeriod
     * @return {@code this} builder for chained invocation
     */
    public final Builder executionPeriod(com.fhir.Period executionPeriod) {
      checkNotIsSet(executionPeriodIsSet(), "executionPeriod");
      this.executionPeriod = java.util.Objects.requireNonNull(executionPeriod, "executionPeriod");
      optBits |= OPT_BIT_EXECUTION_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link Task#executionPeriod() executionPeriod} to executionPeriod.
     * @param executionPeriod The value for executionPeriod
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("executionPeriod")
    public final Builder executionPeriod(java.util.Optional<? extends com.fhir.Period> executionPeriod) {
      checkNotIsSet(executionPeriodIsSet(), "executionPeriod");
      this.executionPeriod = executionPeriod.orElse(null);
      optBits |= OPT_BIT_EXECUTION_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link Task#businessStatus() businessStatus} to businessStatus.
     * @param businessStatus The value for businessStatus
     * @return {@code this} builder for chained invocation
     */
    public final Builder businessStatus(com.fhir.CodeableConcept businessStatus) {
      checkNotIsSet(businessStatusIsSet(), "businessStatus");
      this.businessStatus = java.util.Objects.requireNonNull(businessStatus, "businessStatus");
      optBits |= OPT_BIT_BUSINESS_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link Task#businessStatus() businessStatus} to businessStatus.
     * @param businessStatus The value for businessStatus
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("businessStatus")
    public final Builder businessStatus(java.util.Optional<? extends com.fhir.CodeableConcept> businessStatus) {
      checkNotIsSet(businessStatusIsSet(), "businessStatus");
      this.businessStatus = businessStatus.orElse(null);
      optBits |= OPT_BIT_BUSINESS_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link Task#reasonReference() reasonReference} to reasonReference.
     * @param reasonReference The value for reasonReference
     * @return {@code this} builder for chained invocation
     */
    public final Builder reasonReference(com.fhir.Reference reasonReference) {
      checkNotIsSet(reasonReferenceIsSet(), "reasonReference");
      this.reasonReference = java.util.Objects.requireNonNull(reasonReference, "reasonReference");
      optBits |= OPT_BIT_REASON_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link Task#reasonReference() reasonReference} to reasonReference.
     * @param reasonReference The value for reasonReference
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("reasonReference")
    public final Builder reasonReference(java.util.Optional<? extends com.fhir.Reference> reasonReference) {
      checkNotIsSet(reasonReferenceIsSet(), "reasonReference");
      this.reasonReference = reasonReference.orElse(null);
      optBits |= OPT_BIT_REASON_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link Task#meta() meta} to meta.
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
     * Initializes the optional value {@link Task#meta() meta} to meta.
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
     * Initializes the optional value {@link Task#description() description} to description.
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
     * Initializes the optional value {@link Task#description() description} to description.
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
     * Initializes the optional value {@link Task#authoredOn() authoredOn} to authoredOn.
     * @param authoredOn The value for authoredOn
     * @return {@code this} builder for chained invocation
     */
    public final Builder authoredOn(com.fhir.dateTime authoredOn) {
      checkNotIsSet(authoredOnIsSet(), "authoredOn");
      this.authoredOn = java.util.Objects.requireNonNull(authoredOn, "authoredOn");
      optBits |= OPT_BIT_AUTHORED_ON;
      return this;
    }

    /**
     * Initializes the optional value {@link Task#authoredOn() authoredOn} to authoredOn.
     * @param authoredOn The value for authoredOn
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("authoredOn")
    public final Builder authoredOn(java.util.Optional<? extends com.fhir.dateTime> authoredOn) {
      checkNotIsSet(authoredOnIsSet(), "authoredOn");
      this.authoredOn = authoredOn.orElse(null);
      optBits |= OPT_BIT_AUTHORED_ON;
      return this;
    }

    /**
     * Initializes the value for the {@link Task#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link Task#language() language} to language.
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
     * Initializes the optional value {@link Task#language() language} to language.
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
     * Initializes the optional value {@link Task#priority() priority} to priority.
     * @param priority The value for priority
     * @return {@code this} builder for chained invocation
     */
    public final Builder priority(com.fhir.code priority) {
      checkNotIsSet(priorityIsSet(), "priority");
      this.priority = java.util.Objects.requireNonNull(priority, "priority");
      optBits |= OPT_BIT_PRIORITY;
      return this;
    }

    /**
     * Initializes the optional value {@link Task#priority() priority} to priority.
     * @param priority The value for priority
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("priority")
    public final Builder priority(java.util.Optional<? extends com.fhir.code> priority) {
      checkNotIsSet(priorityIsSet(), "priority");
      this.priority = priority.orElse(null);
      optBits |= OPT_BIT_PRIORITY;
      return this;
    }

    /**
     * Initializes the optional value {@link Task#partOf() partOf} to partOf.
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
     * Initializes the optional value {@link Task#partOf() partOf} to partOf.
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
     * Initializes the optional value {@link Task#reasonCode() reasonCode} to reasonCode.
     * @param reasonCode The value for reasonCode
     * @return {@code this} builder for chained invocation
     */
    public final Builder reasonCode(com.fhir.CodeableConcept reasonCode) {
      checkNotIsSet(reasonCodeIsSet(), "reasonCode");
      this.reasonCode = java.util.Objects.requireNonNull(reasonCode, "reasonCode");
      optBits |= OPT_BIT_REASON_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link Task#reasonCode() reasonCode} to reasonCode.
     * @param reasonCode The value for reasonCode
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("reasonCode")
    public final Builder reasonCode(java.util.Optional<? extends com.fhir.CodeableConcept> reasonCode) {
      checkNotIsSet(reasonCodeIsSet(), "reasonCode");
      this.reasonCode = reasonCode.orElse(null);
      optBits |= OPT_BIT_REASON_CODE;
      return this;
    }

    /**
     * Builds a new {@link Task Task}.
     * @return An immutable instance of Task
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.Task build() {
      checkRequiredAttributes();
      return new ImmutableTask(
          basedOn,
          implicitRules,
          statusReason,
          _for,
          extension,
          instantiatesUri,
          intent,
          groupIdentifier,
          note,
          status,
          output,
          owner,
          id,
          code,
          input,
          text,
          restriction,
          encounter,
          focus,
          location,
          identifier,
          requester,
          performerType,
          contained,
          insurance,
          relevantHistory,
          modifierExtension,
          lastModified,
          instantiatesCanonical,
          executionPeriod,
          businessStatus,
          reasonReference,
          meta,
          description,
          authoredOn,
          resourceType,
          language,
          priority,
          partOf,
          reasonCode);
    }

    private boolean basedOnIsSet() {
      return (optBits & OPT_BIT_BASED_ON) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean statusReasonIsSet() {
      return (optBits & OPT_BIT_STATUS_REASON) != 0;
    }

    private boolean _forIsSet() {
      return (optBits & OPT_BIT__FOR) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean instantiatesUriIsSet() {
      return (optBits & OPT_BIT_INSTANTIATES_URI) != 0;
    }

    private boolean intentIsSet() {
      return (optBits & OPT_BIT_INTENT) != 0;
    }

    private boolean groupIdentifierIsSet() {
      return (optBits & OPT_BIT_GROUP_IDENTIFIER) != 0;
    }

    private boolean noteIsSet() {
      return (optBits & OPT_BIT_NOTE) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean outputIsSet() {
      return (optBits & OPT_BIT_OUTPUT) != 0;
    }

    private boolean ownerIsSet() {
      return (optBits & OPT_BIT_OWNER) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean codeIsSet() {
      return (optBits & OPT_BIT_CODE) != 0;
    }

    private boolean inputIsSet() {
      return (optBits & OPT_BIT_INPUT) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean restrictionIsSet() {
      return (optBits & OPT_BIT_RESTRICTION) != 0;
    }

    private boolean encounterIsSet() {
      return (optBits & OPT_BIT_ENCOUNTER) != 0;
    }

    private boolean focusIsSet() {
      return (optBits & OPT_BIT_FOCUS) != 0;
    }

    private boolean locationIsSet() {
      return (optBits & OPT_BIT_LOCATION) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean requesterIsSet() {
      return (optBits & OPT_BIT_REQUESTER) != 0;
    }

    private boolean performerTypeIsSet() {
      return (optBits & OPT_BIT_PERFORMER_TYPE) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean insuranceIsSet() {
      return (optBits & OPT_BIT_INSURANCE) != 0;
    }

    private boolean relevantHistoryIsSet() {
      return (optBits & OPT_BIT_RELEVANT_HISTORY) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean lastModifiedIsSet() {
      return (optBits & OPT_BIT_LAST_MODIFIED) != 0;
    }

    private boolean instantiatesCanonicalIsSet() {
      return (optBits & OPT_BIT_INSTANTIATES_CANONICAL) != 0;
    }

    private boolean executionPeriodIsSet() {
      return (optBits & OPT_BIT_EXECUTION_PERIOD) != 0;
    }

    private boolean businessStatusIsSet() {
      return (optBits & OPT_BIT_BUSINESS_STATUS) != 0;
    }

    private boolean reasonReferenceIsSet() {
      return (optBits & OPT_BIT_REASON_REFERENCE) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean descriptionIsSet() {
      return (optBits & OPT_BIT_DESCRIPTION) != 0;
    }

    private boolean authoredOnIsSet() {
      return (optBits & OPT_BIT_AUTHORED_ON) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean priorityIsSet() {
      return (optBits & OPT_BIT_PRIORITY) != 0;
    }

    private boolean partOfIsSet() {
      return (optBits & OPT_BIT_PART_OF) != 0;
    }

    private boolean reasonCodeIsSet() {
      return (optBits & OPT_BIT_REASON_CODE) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of Task is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build Task, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "Task", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link Task#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(java.lang.String resourceType);
  }

  @org.immutables.value.Generated(from = "Task", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link Task#basedOn() basedOn} to basedOn.
     * @param basedOn The value for basedOn
     * @return {@code this} builder for chained invocation
     */
    BuildFinal basedOn(java.util.List<com.fhir.Reference> basedOn);

    /**
     * Initializes the optional value {@link Task#basedOn() basedOn} to basedOn.
     * @param basedOn The value for basedOn
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal basedOn(java.util.Optional<? extends java.util.List<com.fhir.Reference>> basedOn);

    /**
     * Initializes the optional value {@link Task#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(com.fhir.uri implicitRules);

    /**
     * Initializes the optional value {@link Task#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(java.util.Optional<? extends com.fhir.uri> implicitRules);

    /**
     * Initializes the optional value {@link Task#statusReason() statusReason} to statusReason.
     * @param statusReason The value for statusReason
     * @return {@code this} builder for chained invocation
     */
    BuildFinal statusReason(com.fhir.CodeableConcept statusReason);

    /**
     * Initializes the optional value {@link Task#statusReason() statusReason} to statusReason.
     * @param statusReason The value for statusReason
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal statusReason(java.util.Optional<? extends com.fhir.CodeableConcept> statusReason);

    /**
     * Initializes the optional value {@link Task#_for() _for} to _for.
     * @param _for The value for _for
     * @return {@code this} builder for chained invocation
     */
    BuildFinal _for(com.fhir.Reference _for);

    /**
     * Initializes the optional value {@link Task#_for() _for} to _for.
     * @param _for The value for _for
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal _for(java.util.Optional<? extends com.fhir.Reference> _for);

    /**
     * Initializes the optional value {@link Task#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link Task#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Initializes the optional value {@link Task#instantiatesUri() instantiatesUri} to instantiatesUri.
     * @param instantiatesUri The value for instantiatesUri
     * @return {@code this} builder for chained invocation
     */
    BuildFinal instantiatesUri(com.fhir.uri instantiatesUri);

    /**
     * Initializes the optional value {@link Task#instantiatesUri() instantiatesUri} to instantiatesUri.
     * @param instantiatesUri The value for instantiatesUri
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal instantiatesUri(java.util.Optional<? extends com.fhir.uri> instantiatesUri);

    /**
     * Initializes the optional value {@link Task#intent() intent} to intent.
     * @param intent The value for intent
     * @return {@code this} builder for chained invocation
     */
    BuildFinal intent(com.fhir.TaskIntent intent);

    /**
     * Initializes the optional value {@link Task#intent() intent} to intent.
     * @param intent The value for intent
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal intent(java.util.Optional<? extends com.fhir.TaskIntent> intent);

    /**
     * Initializes the optional value {@link Task#groupIdentifier() groupIdentifier} to groupIdentifier.
     * @param groupIdentifier The value for groupIdentifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal groupIdentifier(com.fhir.Identifier groupIdentifier);

    /**
     * Initializes the optional value {@link Task#groupIdentifier() groupIdentifier} to groupIdentifier.
     * @param groupIdentifier The value for groupIdentifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal groupIdentifier(java.util.Optional<? extends com.fhir.Identifier> groupIdentifier);

    /**
     * Initializes the optional value {@link Task#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for chained invocation
     */
    BuildFinal note(java.util.List<com.fhir.Annotation> note);

    /**
     * Initializes the optional value {@link Task#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal note(java.util.Optional<? extends java.util.List<com.fhir.Annotation>> note);

    /**
     * Initializes the optional value {@link Task#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(com.fhir.TaskStatus status);

    /**
     * Initializes the optional value {@link Task#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(java.util.Optional<? extends com.fhir.TaskStatus> status);

    /**
     * Initializes the optional value {@link Task#output() output} to output.
     * @param output The value for output
     * @return {@code this} builder for chained invocation
     */
    BuildFinal output(java.util.List<com.fhir.Task_Output> output);

    /**
     * Initializes the optional value {@link Task#output() output} to output.
     * @param output The value for output
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal output(java.util.Optional<? extends java.util.List<com.fhir.Task_Output>> output);

    /**
     * Initializes the optional value {@link Task#owner() owner} to owner.
     * @param owner The value for owner
     * @return {@code this} builder for chained invocation
     */
    BuildFinal owner(com.fhir.Reference owner);

    /**
     * Initializes the optional value {@link Task#owner() owner} to owner.
     * @param owner The value for owner
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal owner(java.util.Optional<? extends com.fhir.Reference> owner);

    /**
     * Initializes the optional value {@link Task#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(com.fhir.id id);

    /**
     * Initializes the optional value {@link Task#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<? extends com.fhir.id> id);

    /**
     * Initializes the optional value {@link Task#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for chained invocation
     */
    BuildFinal code(com.fhir.CodeableConcept code);

    /**
     * Initializes the optional value {@link Task#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal code(java.util.Optional<? extends com.fhir.CodeableConcept> code);

    /**
     * Initializes the optional value {@link Task#input() input} to input.
     * @param input The value for input
     * @return {@code this} builder for chained invocation
     */
    BuildFinal input(java.util.List<com.fhir.Task_Input> input);

    /**
     * Initializes the optional value {@link Task#input() input} to input.
     * @param input The value for input
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal input(java.util.Optional<? extends java.util.List<com.fhir.Task_Input>> input);

    /**
     * Initializes the optional value {@link Task#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(com.fhir.Narrative text);

    /**
     * Initializes the optional value {@link Task#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(java.util.Optional<? extends com.fhir.Narrative> text);

    /**
     * Initializes the optional value {@link Task#restriction() restriction} to restriction.
     * @param restriction The value for restriction
     * @return {@code this} builder for chained invocation
     */
    BuildFinal restriction(com.fhir.Task_Restriction restriction);

    /**
     * Initializes the optional value {@link Task#restriction() restriction} to restriction.
     * @param restriction The value for restriction
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal restriction(java.util.Optional<? extends com.fhir.Task_Restriction> restriction);

    /**
     * Initializes the optional value {@link Task#encounter() encounter} to encounter.
     * @param encounter The value for encounter
     * @return {@code this} builder for chained invocation
     */
    BuildFinal encounter(com.fhir.Reference encounter);

    /**
     * Initializes the optional value {@link Task#encounter() encounter} to encounter.
     * @param encounter The value for encounter
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal encounter(java.util.Optional<? extends com.fhir.Reference> encounter);

    /**
     * Initializes the optional value {@link Task#focus() focus} to focus.
     * @param focus The value for focus
     * @return {@code this} builder for chained invocation
     */
    BuildFinal focus(com.fhir.Reference focus);

    /**
     * Initializes the optional value {@link Task#focus() focus} to focus.
     * @param focus The value for focus
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal focus(java.util.Optional<? extends com.fhir.Reference> focus);

    /**
     * Initializes the optional value {@link Task#location() location} to location.
     * @param location The value for location
     * @return {@code this} builder for chained invocation
     */
    BuildFinal location(com.fhir.Reference location);

    /**
     * Initializes the optional value {@link Task#location() location} to location.
     * @param location The value for location
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal location(java.util.Optional<? extends com.fhir.Reference> location);

    /**
     * Initializes the optional value {@link Task#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(java.util.List<com.fhir.Identifier> identifier);

    /**
     * Initializes the optional value {@link Task#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> identifier);

    /**
     * Initializes the optional value {@link Task#requester() requester} to requester.
     * @param requester The value for requester
     * @return {@code this} builder for chained invocation
     */
    BuildFinal requester(com.fhir.Reference requester);

    /**
     * Initializes the optional value {@link Task#requester() requester} to requester.
     * @param requester The value for requester
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal requester(java.util.Optional<? extends com.fhir.Reference> requester);

    /**
     * Initializes the optional value {@link Task#performerType() performerType} to performerType.
     * @param performerType The value for performerType
     * @return {@code this} builder for chained invocation
     */
    BuildFinal performerType(java.util.List<com.fhir.CodeableConcept> performerType);

    /**
     * Initializes the optional value {@link Task#performerType() performerType} to performerType.
     * @param performerType The value for performerType
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal performerType(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> performerType);

    /**
     * Initializes the optional value {@link Task#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(java.util.List<com.fhir.ResourceList> contained);

    /**
     * Initializes the optional value {@link Task#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> contained);

    /**
     * Initializes the optional value {@link Task#insurance() insurance} to insurance.
     * @param insurance The value for insurance
     * @return {@code this} builder for chained invocation
     */
    BuildFinal insurance(java.util.List<com.fhir.Reference> insurance);

    /**
     * Initializes the optional value {@link Task#insurance() insurance} to insurance.
     * @param insurance The value for insurance
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal insurance(java.util.Optional<? extends java.util.List<com.fhir.Reference>> insurance);

    /**
     * Initializes the optional value {@link Task#relevantHistory() relevantHistory} to relevantHistory.
     * @param relevantHistory The value for relevantHistory
     * @return {@code this} builder for chained invocation
     */
    BuildFinal relevantHistory(java.util.List<com.fhir.Reference> relevantHistory);

    /**
     * Initializes the optional value {@link Task#relevantHistory() relevantHistory} to relevantHistory.
     * @param relevantHistory The value for relevantHistory
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal relevantHistory(java.util.Optional<? extends java.util.List<com.fhir.Reference>> relevantHistory);

    /**
     * Initializes the optional value {@link Task#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(java.util.List<com.fhir.Extension> modifierExtension);

    /**
     * Initializes the optional value {@link Task#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link Task#lastModified() lastModified} to lastModified.
     * @param lastModified The value for lastModified
     * @return {@code this} builder for chained invocation
     */
    BuildFinal lastModified(com.fhir.dateTime lastModified);

    /**
     * Initializes the optional value {@link Task#lastModified() lastModified} to lastModified.
     * @param lastModified The value for lastModified
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal lastModified(java.util.Optional<? extends com.fhir.dateTime> lastModified);

    /**
     * Initializes the optional value {@link Task#instantiatesCanonical() instantiatesCanonical} to instantiatesCanonical.
     * @param instantiatesCanonical The value for instantiatesCanonical
     * @return {@code this} builder for chained invocation
     */
    BuildFinal instantiatesCanonical(com.fhir.canonical instantiatesCanonical);

    /**
     * Initializes the optional value {@link Task#instantiatesCanonical() instantiatesCanonical} to instantiatesCanonical.
     * @param instantiatesCanonical The value for instantiatesCanonical
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal instantiatesCanonical(java.util.Optional<? extends com.fhir.canonical> instantiatesCanonical);

    /**
     * Initializes the optional value {@link Task#executionPeriod() executionPeriod} to executionPeriod.
     * @param executionPeriod The value for executionPeriod
     * @return {@code this} builder for chained invocation
     */
    BuildFinal executionPeriod(com.fhir.Period executionPeriod);

    /**
     * Initializes the optional value {@link Task#executionPeriod() executionPeriod} to executionPeriod.
     * @param executionPeriod The value for executionPeriod
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal executionPeriod(java.util.Optional<? extends com.fhir.Period> executionPeriod);

    /**
     * Initializes the optional value {@link Task#businessStatus() businessStatus} to businessStatus.
     * @param businessStatus The value for businessStatus
     * @return {@code this} builder for chained invocation
     */
    BuildFinal businessStatus(com.fhir.CodeableConcept businessStatus);

    /**
     * Initializes the optional value {@link Task#businessStatus() businessStatus} to businessStatus.
     * @param businessStatus The value for businessStatus
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal businessStatus(java.util.Optional<? extends com.fhir.CodeableConcept> businessStatus);

    /**
     * Initializes the optional value {@link Task#reasonReference() reasonReference} to reasonReference.
     * @param reasonReference The value for reasonReference
     * @return {@code this} builder for chained invocation
     */
    BuildFinal reasonReference(com.fhir.Reference reasonReference);

    /**
     * Initializes the optional value {@link Task#reasonReference() reasonReference} to reasonReference.
     * @param reasonReference The value for reasonReference
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal reasonReference(java.util.Optional<? extends com.fhir.Reference> reasonReference);

    /**
     * Initializes the optional value {@link Task#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(com.fhir.Meta meta);

    /**
     * Initializes the optional value {@link Task#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(java.util.Optional<? extends com.fhir.Meta> meta);

    /**
     * Initializes the optional value {@link Task#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for chained invocation
     */
    BuildFinal description(java.lang.String description);

    /**
     * Initializes the optional value {@link Task#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal description(java.util.Optional<java.lang.String> description);

    /**
     * Initializes the optional value {@link Task#authoredOn() authoredOn} to authoredOn.
     * @param authoredOn The value for authoredOn
     * @return {@code this} builder for chained invocation
     */
    BuildFinal authoredOn(com.fhir.dateTime authoredOn);

    /**
     * Initializes the optional value {@link Task#authoredOn() authoredOn} to authoredOn.
     * @param authoredOn The value for authoredOn
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal authoredOn(java.util.Optional<? extends com.fhir.dateTime> authoredOn);

    /**
     * Initializes the optional value {@link Task#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(com.fhir.code language);

    /**
     * Initializes the optional value {@link Task#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(java.util.Optional<? extends com.fhir.code> language);

    /**
     * Initializes the optional value {@link Task#priority() priority} to priority.
     * @param priority The value for priority
     * @return {@code this} builder for chained invocation
     */
    BuildFinal priority(com.fhir.code priority);

    /**
     * Initializes the optional value {@link Task#priority() priority} to priority.
     * @param priority The value for priority
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal priority(java.util.Optional<? extends com.fhir.code> priority);

    /**
     * Initializes the optional value {@link Task#partOf() partOf} to partOf.
     * @param partOf The value for partOf
     * @return {@code this} builder for chained invocation
     */
    BuildFinal partOf(java.util.List<com.fhir.Reference> partOf);

    /**
     * Initializes the optional value {@link Task#partOf() partOf} to partOf.
     * @param partOf The value for partOf
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal partOf(java.util.Optional<? extends java.util.List<com.fhir.Reference>> partOf);

    /**
     * Initializes the optional value {@link Task#reasonCode() reasonCode} to reasonCode.
     * @param reasonCode The value for reasonCode
     * @return {@code this} builder for chained invocation
     */
    BuildFinal reasonCode(com.fhir.CodeableConcept reasonCode);

    /**
     * Initializes the optional value {@link Task#reasonCode() reasonCode} to reasonCode.
     * @param reasonCode The value for reasonCode
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal reasonCode(java.util.Optional<? extends com.fhir.CodeableConcept> reasonCode);

    /**
     * Builds a new {@link Task Task}.
     * @return An immutable instance of Task
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    Task build();
  }
}
