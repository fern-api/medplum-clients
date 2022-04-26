package com.fhir.types.fhir;

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
 * Immutable implementation of {@link Task}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableTask.builder()}.
 */
@Generated(from = "Task", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableTask implements Task {
  private final @Nullable DateTime lastModified;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable Uri instantiatesUri;
  private final @Nullable CodeableConcept code;
  private final @Nullable List<Annotation> note;
  private final @Nullable Code priority;
  private final @Nullable Reference owner;
  private final @Nullable Meta meta;
  private final String resourceType;
  private final @Nullable Reference location;
  private final @Nullable CodeableConcept businessStatus;
  private final @Nullable Narrative text;
  private final @Nullable List<Extension> extension;
  private final @Nullable Reference encounter;
  private final @Nullable List<Identifier> identifier;
  private final @Nullable TaskIntent intent;
  private final @Nullable String description;
  private final @Nullable Code language;
  private final @Nullable List<Reference> partOf;
  private final @Nullable List<Reference> relevantHistory;
  private final @Nullable List<Task_Input> input;
  private final @Nullable Reference _for;
  private final @Nullable Uri implicitRules;
  private final @Nullable CodeableConcept statusReason;
  private final @Nullable CodeableConcept reasonCode;
  private final @Nullable Task_Restriction restriction;
  private final @Nullable Id id;
  private final @Nullable Reference focus;
  private final @Nullable List<Reference> insurance;
  private final @Nullable List<ResourceList> contained;
  private final @Nullable List<Reference> basedOn;
  private final @Nullable Reference requester;
  private final @Nullable Canonical instantiatesCanonical;
  private final @Nullable Period executionPeriod;
  private final @Nullable List<Task_Output> output;
  private final @Nullable DateTime authoredOn;
  private final @Nullable Reference reasonReference;
  private final @Nullable TaskStatus status;
  private final @Nullable Identifier groupIdentifier;
  private final @Nullable List<CodeableConcept> performerType;

  private ImmutableTask(
      @Nullable DateTime lastModified,
      @Nullable List<Extension> modifierExtension,
      @Nullable Uri instantiatesUri,
      @Nullable CodeableConcept code,
      @Nullable List<Annotation> note,
      @Nullable Code priority,
      @Nullable Reference owner,
      @Nullable Meta meta,
      String resourceType,
      @Nullable Reference location,
      @Nullable CodeableConcept businessStatus,
      @Nullable Narrative text,
      @Nullable List<Extension> extension,
      @Nullable Reference encounter,
      @Nullable List<Identifier> identifier,
      @Nullable TaskIntent intent,
      @Nullable String description,
      @Nullable Code language,
      @Nullable List<Reference> partOf,
      @Nullable List<Reference> relevantHistory,
      @Nullable List<Task_Input> input,
      @Nullable Reference _for,
      @Nullable Uri implicitRules,
      @Nullable CodeableConcept statusReason,
      @Nullable CodeableConcept reasonCode,
      @Nullable Task_Restriction restriction,
      @Nullable Id id,
      @Nullable Reference focus,
      @Nullable List<Reference> insurance,
      @Nullable List<ResourceList> contained,
      @Nullable List<Reference> basedOn,
      @Nullable Reference requester,
      @Nullable Canonical instantiatesCanonical,
      @Nullable Period executionPeriod,
      @Nullable List<Task_Output> output,
      @Nullable DateTime authoredOn,
      @Nullable Reference reasonReference,
      @Nullable TaskStatus status,
      @Nullable Identifier groupIdentifier,
      @Nullable List<CodeableConcept> performerType) {
    this.lastModified = lastModified;
    this.modifierExtension = modifierExtension;
    this.instantiatesUri = instantiatesUri;
    this.code = code;
    this.note = note;
    this.priority = priority;
    this.owner = owner;
    this.meta = meta;
    this.resourceType = resourceType;
    this.location = location;
    this.businessStatus = businessStatus;
    this.text = text;
    this.extension = extension;
    this.encounter = encounter;
    this.identifier = identifier;
    this.intent = intent;
    this.description = description;
    this.language = language;
    this.partOf = partOf;
    this.relevantHistory = relevantHistory;
    this.input = input;
    this._for = _for;
    this.implicitRules = implicitRules;
    this.statusReason = statusReason;
    this.reasonCode = reasonCode;
    this.restriction = restriction;
    this.id = id;
    this.focus = focus;
    this.insurance = insurance;
    this.contained = contained;
    this.basedOn = basedOn;
    this.requester = requester;
    this.instantiatesCanonical = instantiatesCanonical;
    this.executionPeriod = executionPeriod;
    this.output = output;
    this.authoredOn = authoredOn;
    this.reasonReference = reasonReference;
    this.status = status;
    this.groupIdentifier = groupIdentifier;
    this.performerType = performerType;
  }

  /**
   * @return The value of the {@code lastModified} attribute
   */
  @JsonProperty("lastModified")
  @Override
  public Optional<DateTime> lastModified() {
    return Optional.ofNullable(lastModified);
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
   * @return The value of the {@code instantiatesUri} attribute
   */
  @JsonProperty("instantiatesUri")
  @Override
  public Optional<Uri> instantiatesUri() {
    return Optional.ofNullable(instantiatesUri);
  }

  /**
   * @return The value of the {@code code} attribute
   */
  @JsonProperty("code")
  @Override
  public Optional<CodeableConcept> code() {
    return Optional.ofNullable(code);
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
   * @return The value of the {@code priority} attribute
   */
  @JsonProperty("priority")
  @Override
  public Optional<Code> priority() {
    return Optional.ofNullable(priority);
  }

  /**
   * @return The value of the {@code owner} attribute
   */
  @JsonProperty("owner")
  @Override
  public Optional<Reference> owner() {
    return Optional.ofNullable(owner);
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
   * @return The value of the {@code resourceType} attribute
   */
  @JsonProperty("resourceType")
  @Override
  public String resourceType() {
    return resourceType;
  }

  /**
   * @return The value of the {@code location} attribute
   */
  @JsonProperty("location")
  @Override
  public Optional<Reference> location() {
    return Optional.ofNullable(location);
  }

  /**
   * @return The value of the {@code businessStatus} attribute
   */
  @JsonProperty("businessStatus")
  @Override
  public Optional<CodeableConcept> businessStatus() {
    return Optional.ofNullable(businessStatus);
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
   * @return The value of the {@code extension} attribute
   */
  @JsonProperty("extension")
  @Override
  public Optional<List<Extension>> extension() {
    return Optional.ofNullable(extension);
  }

  /**
   * @return The value of the {@code encounter} attribute
   */
  @JsonProperty("encounter")
  @Override
  public Optional<Reference> encounter() {
    return Optional.ofNullable(encounter);
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
   * @return The value of the {@code intent} attribute
   */
  @JsonProperty("intent")
  @Override
  public Optional<TaskIntent> intent() {
    return Optional.ofNullable(intent);
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
   * @return The value of the {@code language} attribute
   */
  @JsonProperty("language")
  @Override
  public Optional<Code> language() {
    return Optional.ofNullable(language);
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
   * @return The value of the {@code relevantHistory} attribute
   */
  @JsonProperty("relevantHistory")
  @Override
  public Optional<List<Reference>> relevantHistory() {
    return Optional.ofNullable(relevantHistory);
  }

  /**
   * @return The value of the {@code input} attribute
   */
  @JsonProperty("input")
  @Override
  public Optional<List<Task_Input>> input() {
    return Optional.ofNullable(input);
  }

  /**
   * @return The value of the {@code _for} attribute
   */
  @JsonProperty("for")
  @Override
  public Optional<Reference> _for() {
    return Optional.ofNullable(_for);
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
   * @return The value of the {@code statusReason} attribute
   */
  @JsonProperty("statusReason")
  @Override
  public Optional<CodeableConcept> statusReason() {
    return Optional.ofNullable(statusReason);
  }

  /**
   * @return The value of the {@code reasonCode} attribute
   */
  @JsonProperty("reasonCode")
  @Override
  public Optional<CodeableConcept> reasonCode() {
    return Optional.ofNullable(reasonCode);
  }

  /**
   * @return The value of the {@code restriction} attribute
   */
  @JsonProperty("restriction")
  @Override
  public Optional<Task_Restriction> restriction() {
    return Optional.ofNullable(restriction);
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
   * @return The value of the {@code focus} attribute
   */
  @JsonProperty("focus")
  @Override
  public Optional<Reference> focus() {
    return Optional.ofNullable(focus);
  }

  /**
   * @return The value of the {@code insurance} attribute
   */
  @JsonProperty("insurance")
  @Override
  public Optional<List<Reference>> insurance() {
    return Optional.ofNullable(insurance);
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
   * @return The value of the {@code basedOn} attribute
   */
  @JsonProperty("basedOn")
  @Override
  public Optional<List<Reference>> basedOn() {
    return Optional.ofNullable(basedOn);
  }

  /**
   * @return The value of the {@code requester} attribute
   */
  @JsonProperty("requester")
  @Override
  public Optional<Reference> requester() {
    return Optional.ofNullable(requester);
  }

  /**
   * @return The value of the {@code instantiatesCanonical} attribute
   */
  @JsonProperty("instantiatesCanonical")
  @Override
  public Optional<Canonical> instantiatesCanonical() {
    return Optional.ofNullable(instantiatesCanonical);
  }

  /**
   * @return The value of the {@code executionPeriod} attribute
   */
  @JsonProperty("executionPeriod")
  @Override
  public Optional<Period> executionPeriod() {
    return Optional.ofNullable(executionPeriod);
  }

  /**
   * @return The value of the {@code output} attribute
   */
  @JsonProperty("output")
  @Override
  public Optional<List<Task_Output>> output() {
    return Optional.ofNullable(output);
  }

  /**
   * @return The value of the {@code authoredOn} attribute
   */
  @JsonProperty("authoredOn")
  @Override
  public Optional<DateTime> authoredOn() {
    return Optional.ofNullable(authoredOn);
  }

  /**
   * @return The value of the {@code reasonReference} attribute
   */
  @JsonProperty("reasonReference")
  @Override
  public Optional<Reference> reasonReference() {
    return Optional.ofNullable(reasonReference);
  }

  /**
   * @return The value of the {@code status} attribute
   */
  @JsonProperty("status")
  @Override
  public Optional<TaskStatus> status() {
    return Optional.ofNullable(status);
  }

  /**
   * @return The value of the {@code groupIdentifier} attribute
   */
  @JsonProperty("groupIdentifier")
  @Override
  public Optional<Identifier> groupIdentifier() {
    return Optional.ofNullable(groupIdentifier);
  }

  /**
   * @return The value of the {@code performerType} attribute
   */
  @JsonProperty("performerType")
  @Override
  public Optional<List<CodeableConcept>> performerType() {
    return Optional.ofNullable(performerType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Task#lastModified() lastModified} attribute.
   * @param value The value for lastModified
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTask withLastModified(DateTime value) {
    @Nullable DateTime newValue = Objects.requireNonNull(value, "lastModified");
    if (this.lastModified == newValue) return this;
    return new ImmutableTask(
        newValue,
        this.modifierExtension,
        this.instantiatesUri,
        this.code,
        this.note,
        this.priority,
        this.owner,
        this.meta,
        this.resourceType,
        this.location,
        this.businessStatus,
        this.text,
        this.extension,
        this.encounter,
        this.identifier,
        this.intent,
        this.description,
        this.language,
        this.partOf,
        this.relevantHistory,
        this.input,
        this._for,
        this.implicitRules,
        this.statusReason,
        this.reasonCode,
        this.restriction,
        this.id,
        this.focus,
        this.insurance,
        this.contained,
        this.basedOn,
        this.requester,
        this.instantiatesCanonical,
        this.executionPeriod,
        this.output,
        this.authoredOn,
        this.reasonReference,
        this.status,
        this.groupIdentifier,
        this.performerType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Task#lastModified() lastModified} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for lastModified
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTask withLastModified(Optional<? extends DateTime> optional) {
    @Nullable DateTime value = optional.orElse(null);
    if (this.lastModified == value) return this;
    return new ImmutableTask(
        value,
        this.modifierExtension,
        this.instantiatesUri,
        this.code,
        this.note,
        this.priority,
        this.owner,
        this.meta,
        this.resourceType,
        this.location,
        this.businessStatus,
        this.text,
        this.extension,
        this.encounter,
        this.identifier,
        this.intent,
        this.description,
        this.language,
        this.partOf,
        this.relevantHistory,
        this.input,
        this._for,
        this.implicitRules,
        this.statusReason,
        this.reasonCode,
        this.restriction,
        this.id,
        this.focus,
        this.insurance,
        this.contained,
        this.basedOn,
        this.requester,
        this.instantiatesCanonical,
        this.executionPeriod,
        this.output,
        this.authoredOn,
        this.reasonReference,
        this.status,
        this.groupIdentifier,
        this.performerType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Task#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTask withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableTask(
        this.lastModified,
        newValue,
        this.instantiatesUri,
        this.code,
        this.note,
        this.priority,
        this.owner,
        this.meta,
        this.resourceType,
        this.location,
        this.businessStatus,
        this.text,
        this.extension,
        this.encounter,
        this.identifier,
        this.intent,
        this.description,
        this.language,
        this.partOf,
        this.relevantHistory,
        this.input,
        this._for,
        this.implicitRules,
        this.statusReason,
        this.reasonCode,
        this.restriction,
        this.id,
        this.focus,
        this.insurance,
        this.contained,
        this.basedOn,
        this.requester,
        this.instantiatesCanonical,
        this.executionPeriod,
        this.output,
        this.authoredOn,
        this.reasonReference,
        this.status,
        this.groupIdentifier,
        this.performerType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Task#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTask withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableTask(
        this.lastModified,
        value,
        this.instantiatesUri,
        this.code,
        this.note,
        this.priority,
        this.owner,
        this.meta,
        this.resourceType,
        this.location,
        this.businessStatus,
        this.text,
        this.extension,
        this.encounter,
        this.identifier,
        this.intent,
        this.description,
        this.language,
        this.partOf,
        this.relevantHistory,
        this.input,
        this._for,
        this.implicitRules,
        this.statusReason,
        this.reasonCode,
        this.restriction,
        this.id,
        this.focus,
        this.insurance,
        this.contained,
        this.basedOn,
        this.requester,
        this.instantiatesCanonical,
        this.executionPeriod,
        this.output,
        this.authoredOn,
        this.reasonReference,
        this.status,
        this.groupIdentifier,
        this.performerType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Task#instantiatesUri() instantiatesUri} attribute.
   * @param value The value for instantiatesUri
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTask withInstantiatesUri(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "instantiatesUri");
    if (this.instantiatesUri == newValue) return this;
    return new ImmutableTask(
        this.lastModified,
        this.modifierExtension,
        newValue,
        this.code,
        this.note,
        this.priority,
        this.owner,
        this.meta,
        this.resourceType,
        this.location,
        this.businessStatus,
        this.text,
        this.extension,
        this.encounter,
        this.identifier,
        this.intent,
        this.description,
        this.language,
        this.partOf,
        this.relevantHistory,
        this.input,
        this._for,
        this.implicitRules,
        this.statusReason,
        this.reasonCode,
        this.restriction,
        this.id,
        this.focus,
        this.insurance,
        this.contained,
        this.basedOn,
        this.requester,
        this.instantiatesCanonical,
        this.executionPeriod,
        this.output,
        this.authoredOn,
        this.reasonReference,
        this.status,
        this.groupIdentifier,
        this.performerType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Task#instantiatesUri() instantiatesUri} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for instantiatesUri
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTask withInstantiatesUri(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.instantiatesUri == value) return this;
    return new ImmutableTask(
        this.lastModified,
        this.modifierExtension,
        value,
        this.code,
        this.note,
        this.priority,
        this.owner,
        this.meta,
        this.resourceType,
        this.location,
        this.businessStatus,
        this.text,
        this.extension,
        this.encounter,
        this.identifier,
        this.intent,
        this.description,
        this.language,
        this.partOf,
        this.relevantHistory,
        this.input,
        this._for,
        this.implicitRules,
        this.statusReason,
        this.reasonCode,
        this.restriction,
        this.id,
        this.focus,
        this.insurance,
        this.contained,
        this.basedOn,
        this.requester,
        this.instantiatesCanonical,
        this.executionPeriod,
        this.output,
        this.authoredOn,
        this.reasonReference,
        this.status,
        this.groupIdentifier,
        this.performerType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Task#code() code} attribute.
   * @param value The value for code
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTask withCode(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "code");
    if (this.code == newValue) return this;
    return new ImmutableTask(
        this.lastModified,
        this.modifierExtension,
        this.instantiatesUri,
        newValue,
        this.note,
        this.priority,
        this.owner,
        this.meta,
        this.resourceType,
        this.location,
        this.businessStatus,
        this.text,
        this.extension,
        this.encounter,
        this.identifier,
        this.intent,
        this.description,
        this.language,
        this.partOf,
        this.relevantHistory,
        this.input,
        this._for,
        this.implicitRules,
        this.statusReason,
        this.reasonCode,
        this.restriction,
        this.id,
        this.focus,
        this.insurance,
        this.contained,
        this.basedOn,
        this.requester,
        this.instantiatesCanonical,
        this.executionPeriod,
        this.output,
        this.authoredOn,
        this.reasonReference,
        this.status,
        this.groupIdentifier,
        this.performerType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Task#code() code} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for code
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTask withCode(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.code == value) return this;
    return new ImmutableTask(
        this.lastModified,
        this.modifierExtension,
        this.instantiatesUri,
        value,
        this.note,
        this.priority,
        this.owner,
        this.meta,
        this.resourceType,
        this.location,
        this.businessStatus,
        this.text,
        this.extension,
        this.encounter,
        this.identifier,
        this.intent,
        this.description,
        this.language,
        this.partOf,
        this.relevantHistory,
        this.input,
        this._for,
        this.implicitRules,
        this.statusReason,
        this.reasonCode,
        this.restriction,
        this.id,
        this.focus,
        this.insurance,
        this.contained,
        this.basedOn,
        this.requester,
        this.instantiatesCanonical,
        this.executionPeriod,
        this.output,
        this.authoredOn,
        this.reasonReference,
        this.status,
        this.groupIdentifier,
        this.performerType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Task#note() note} attribute.
   * @param value The value for note
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTask withNote(List<Annotation> value) {
    @Nullable List<Annotation> newValue = Objects.requireNonNull(value, "note");
    if (this.note == newValue) return this;
    return new ImmutableTask(
        this.lastModified,
        this.modifierExtension,
        this.instantiatesUri,
        this.code,
        newValue,
        this.priority,
        this.owner,
        this.meta,
        this.resourceType,
        this.location,
        this.businessStatus,
        this.text,
        this.extension,
        this.encounter,
        this.identifier,
        this.intent,
        this.description,
        this.language,
        this.partOf,
        this.relevantHistory,
        this.input,
        this._for,
        this.implicitRules,
        this.statusReason,
        this.reasonCode,
        this.restriction,
        this.id,
        this.focus,
        this.insurance,
        this.contained,
        this.basedOn,
        this.requester,
        this.instantiatesCanonical,
        this.executionPeriod,
        this.output,
        this.authoredOn,
        this.reasonReference,
        this.status,
        this.groupIdentifier,
        this.performerType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Task#note() note} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for note
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTask withNote(Optional<? extends List<Annotation>> optional) {
    @Nullable List<Annotation> value = optional.orElse(null);
    if (this.note == value) return this;
    return new ImmutableTask(
        this.lastModified,
        this.modifierExtension,
        this.instantiatesUri,
        this.code,
        value,
        this.priority,
        this.owner,
        this.meta,
        this.resourceType,
        this.location,
        this.businessStatus,
        this.text,
        this.extension,
        this.encounter,
        this.identifier,
        this.intent,
        this.description,
        this.language,
        this.partOf,
        this.relevantHistory,
        this.input,
        this._for,
        this.implicitRules,
        this.statusReason,
        this.reasonCode,
        this.restriction,
        this.id,
        this.focus,
        this.insurance,
        this.contained,
        this.basedOn,
        this.requester,
        this.instantiatesCanonical,
        this.executionPeriod,
        this.output,
        this.authoredOn,
        this.reasonReference,
        this.status,
        this.groupIdentifier,
        this.performerType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Task#priority() priority} attribute.
   * @param value The value for priority
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTask withPriority(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "priority");
    if (this.priority == newValue) return this;
    return new ImmutableTask(
        this.lastModified,
        this.modifierExtension,
        this.instantiatesUri,
        this.code,
        this.note,
        newValue,
        this.owner,
        this.meta,
        this.resourceType,
        this.location,
        this.businessStatus,
        this.text,
        this.extension,
        this.encounter,
        this.identifier,
        this.intent,
        this.description,
        this.language,
        this.partOf,
        this.relevantHistory,
        this.input,
        this._for,
        this.implicitRules,
        this.statusReason,
        this.reasonCode,
        this.restriction,
        this.id,
        this.focus,
        this.insurance,
        this.contained,
        this.basedOn,
        this.requester,
        this.instantiatesCanonical,
        this.executionPeriod,
        this.output,
        this.authoredOn,
        this.reasonReference,
        this.status,
        this.groupIdentifier,
        this.performerType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Task#priority() priority} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for priority
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTask withPriority(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.priority == value) return this;
    return new ImmutableTask(
        this.lastModified,
        this.modifierExtension,
        this.instantiatesUri,
        this.code,
        this.note,
        value,
        this.owner,
        this.meta,
        this.resourceType,
        this.location,
        this.businessStatus,
        this.text,
        this.extension,
        this.encounter,
        this.identifier,
        this.intent,
        this.description,
        this.language,
        this.partOf,
        this.relevantHistory,
        this.input,
        this._for,
        this.implicitRules,
        this.statusReason,
        this.reasonCode,
        this.restriction,
        this.id,
        this.focus,
        this.insurance,
        this.contained,
        this.basedOn,
        this.requester,
        this.instantiatesCanonical,
        this.executionPeriod,
        this.output,
        this.authoredOn,
        this.reasonReference,
        this.status,
        this.groupIdentifier,
        this.performerType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Task#owner() owner} attribute.
   * @param value The value for owner
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTask withOwner(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "owner");
    if (this.owner == newValue) return this;
    return new ImmutableTask(
        this.lastModified,
        this.modifierExtension,
        this.instantiatesUri,
        this.code,
        this.note,
        this.priority,
        newValue,
        this.meta,
        this.resourceType,
        this.location,
        this.businessStatus,
        this.text,
        this.extension,
        this.encounter,
        this.identifier,
        this.intent,
        this.description,
        this.language,
        this.partOf,
        this.relevantHistory,
        this.input,
        this._for,
        this.implicitRules,
        this.statusReason,
        this.reasonCode,
        this.restriction,
        this.id,
        this.focus,
        this.insurance,
        this.contained,
        this.basedOn,
        this.requester,
        this.instantiatesCanonical,
        this.executionPeriod,
        this.output,
        this.authoredOn,
        this.reasonReference,
        this.status,
        this.groupIdentifier,
        this.performerType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Task#owner() owner} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for owner
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTask withOwner(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.owner == value) return this;
    return new ImmutableTask(
        this.lastModified,
        this.modifierExtension,
        this.instantiatesUri,
        this.code,
        this.note,
        this.priority,
        value,
        this.meta,
        this.resourceType,
        this.location,
        this.businessStatus,
        this.text,
        this.extension,
        this.encounter,
        this.identifier,
        this.intent,
        this.description,
        this.language,
        this.partOf,
        this.relevantHistory,
        this.input,
        this._for,
        this.implicitRules,
        this.statusReason,
        this.reasonCode,
        this.restriction,
        this.id,
        this.focus,
        this.insurance,
        this.contained,
        this.basedOn,
        this.requester,
        this.instantiatesCanonical,
        this.executionPeriod,
        this.output,
        this.authoredOn,
        this.reasonReference,
        this.status,
        this.groupIdentifier,
        this.performerType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Task#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTask withMeta(Meta value) {
    @Nullable Meta newValue = Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableTask(
        this.lastModified,
        this.modifierExtension,
        this.instantiatesUri,
        this.code,
        this.note,
        this.priority,
        this.owner,
        newValue,
        this.resourceType,
        this.location,
        this.businessStatus,
        this.text,
        this.extension,
        this.encounter,
        this.identifier,
        this.intent,
        this.description,
        this.language,
        this.partOf,
        this.relevantHistory,
        this.input,
        this._for,
        this.implicitRules,
        this.statusReason,
        this.reasonCode,
        this.restriction,
        this.id,
        this.focus,
        this.insurance,
        this.contained,
        this.basedOn,
        this.requester,
        this.instantiatesCanonical,
        this.executionPeriod,
        this.output,
        this.authoredOn,
        this.reasonReference,
        this.status,
        this.groupIdentifier,
        this.performerType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Task#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTask withMeta(Optional<? extends Meta> optional) {
    @Nullable Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableTask(
        this.lastModified,
        this.modifierExtension,
        this.instantiatesUri,
        this.code,
        this.note,
        this.priority,
        this.owner,
        value,
        this.resourceType,
        this.location,
        this.businessStatus,
        this.text,
        this.extension,
        this.encounter,
        this.identifier,
        this.intent,
        this.description,
        this.language,
        this.partOf,
        this.relevantHistory,
        this.input,
        this._for,
        this.implicitRules,
        this.statusReason,
        this.reasonCode,
        this.restriction,
        this.id,
        this.focus,
        this.insurance,
        this.contained,
        this.basedOn,
        this.requester,
        this.instantiatesCanonical,
        this.executionPeriod,
        this.output,
        this.authoredOn,
        this.reasonReference,
        this.status,
        this.groupIdentifier,
        this.performerType);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Task#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableTask withResourceType(String value) {
    String newValue = Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableTask(
        this.lastModified,
        this.modifierExtension,
        this.instantiatesUri,
        this.code,
        this.note,
        this.priority,
        this.owner,
        this.meta,
        newValue,
        this.location,
        this.businessStatus,
        this.text,
        this.extension,
        this.encounter,
        this.identifier,
        this.intent,
        this.description,
        this.language,
        this.partOf,
        this.relevantHistory,
        this.input,
        this._for,
        this.implicitRules,
        this.statusReason,
        this.reasonCode,
        this.restriction,
        this.id,
        this.focus,
        this.insurance,
        this.contained,
        this.basedOn,
        this.requester,
        this.instantiatesCanonical,
        this.executionPeriod,
        this.output,
        this.authoredOn,
        this.reasonReference,
        this.status,
        this.groupIdentifier,
        this.performerType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Task#location() location} attribute.
   * @param value The value for location
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTask withLocation(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "location");
    if (this.location == newValue) return this;
    return new ImmutableTask(
        this.lastModified,
        this.modifierExtension,
        this.instantiatesUri,
        this.code,
        this.note,
        this.priority,
        this.owner,
        this.meta,
        this.resourceType,
        newValue,
        this.businessStatus,
        this.text,
        this.extension,
        this.encounter,
        this.identifier,
        this.intent,
        this.description,
        this.language,
        this.partOf,
        this.relevantHistory,
        this.input,
        this._for,
        this.implicitRules,
        this.statusReason,
        this.reasonCode,
        this.restriction,
        this.id,
        this.focus,
        this.insurance,
        this.contained,
        this.basedOn,
        this.requester,
        this.instantiatesCanonical,
        this.executionPeriod,
        this.output,
        this.authoredOn,
        this.reasonReference,
        this.status,
        this.groupIdentifier,
        this.performerType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Task#location() location} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for location
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTask withLocation(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.location == value) return this;
    return new ImmutableTask(
        this.lastModified,
        this.modifierExtension,
        this.instantiatesUri,
        this.code,
        this.note,
        this.priority,
        this.owner,
        this.meta,
        this.resourceType,
        value,
        this.businessStatus,
        this.text,
        this.extension,
        this.encounter,
        this.identifier,
        this.intent,
        this.description,
        this.language,
        this.partOf,
        this.relevantHistory,
        this.input,
        this._for,
        this.implicitRules,
        this.statusReason,
        this.reasonCode,
        this.restriction,
        this.id,
        this.focus,
        this.insurance,
        this.contained,
        this.basedOn,
        this.requester,
        this.instantiatesCanonical,
        this.executionPeriod,
        this.output,
        this.authoredOn,
        this.reasonReference,
        this.status,
        this.groupIdentifier,
        this.performerType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Task#businessStatus() businessStatus} attribute.
   * @param value The value for businessStatus
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTask withBusinessStatus(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "businessStatus");
    if (this.businessStatus == newValue) return this;
    return new ImmutableTask(
        this.lastModified,
        this.modifierExtension,
        this.instantiatesUri,
        this.code,
        this.note,
        this.priority,
        this.owner,
        this.meta,
        this.resourceType,
        this.location,
        newValue,
        this.text,
        this.extension,
        this.encounter,
        this.identifier,
        this.intent,
        this.description,
        this.language,
        this.partOf,
        this.relevantHistory,
        this.input,
        this._for,
        this.implicitRules,
        this.statusReason,
        this.reasonCode,
        this.restriction,
        this.id,
        this.focus,
        this.insurance,
        this.contained,
        this.basedOn,
        this.requester,
        this.instantiatesCanonical,
        this.executionPeriod,
        this.output,
        this.authoredOn,
        this.reasonReference,
        this.status,
        this.groupIdentifier,
        this.performerType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Task#businessStatus() businessStatus} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for businessStatus
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTask withBusinessStatus(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.businessStatus == value) return this;
    return new ImmutableTask(
        this.lastModified,
        this.modifierExtension,
        this.instantiatesUri,
        this.code,
        this.note,
        this.priority,
        this.owner,
        this.meta,
        this.resourceType,
        this.location,
        value,
        this.text,
        this.extension,
        this.encounter,
        this.identifier,
        this.intent,
        this.description,
        this.language,
        this.partOf,
        this.relevantHistory,
        this.input,
        this._for,
        this.implicitRules,
        this.statusReason,
        this.reasonCode,
        this.restriction,
        this.id,
        this.focus,
        this.insurance,
        this.contained,
        this.basedOn,
        this.requester,
        this.instantiatesCanonical,
        this.executionPeriod,
        this.output,
        this.authoredOn,
        this.reasonReference,
        this.status,
        this.groupIdentifier,
        this.performerType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Task#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTask withText(Narrative value) {
    @Nullable Narrative newValue = Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableTask(
        this.lastModified,
        this.modifierExtension,
        this.instantiatesUri,
        this.code,
        this.note,
        this.priority,
        this.owner,
        this.meta,
        this.resourceType,
        this.location,
        this.businessStatus,
        newValue,
        this.extension,
        this.encounter,
        this.identifier,
        this.intent,
        this.description,
        this.language,
        this.partOf,
        this.relevantHistory,
        this.input,
        this._for,
        this.implicitRules,
        this.statusReason,
        this.reasonCode,
        this.restriction,
        this.id,
        this.focus,
        this.insurance,
        this.contained,
        this.basedOn,
        this.requester,
        this.instantiatesCanonical,
        this.executionPeriod,
        this.output,
        this.authoredOn,
        this.reasonReference,
        this.status,
        this.groupIdentifier,
        this.performerType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Task#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTask withText(Optional<? extends Narrative> optional) {
    @Nullable Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableTask(
        this.lastModified,
        this.modifierExtension,
        this.instantiatesUri,
        this.code,
        this.note,
        this.priority,
        this.owner,
        this.meta,
        this.resourceType,
        this.location,
        this.businessStatus,
        value,
        this.extension,
        this.encounter,
        this.identifier,
        this.intent,
        this.description,
        this.language,
        this.partOf,
        this.relevantHistory,
        this.input,
        this._for,
        this.implicitRules,
        this.statusReason,
        this.reasonCode,
        this.restriction,
        this.id,
        this.focus,
        this.insurance,
        this.contained,
        this.basedOn,
        this.requester,
        this.instantiatesCanonical,
        this.executionPeriod,
        this.output,
        this.authoredOn,
        this.reasonReference,
        this.status,
        this.groupIdentifier,
        this.performerType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Task#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTask withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableTask(
        this.lastModified,
        this.modifierExtension,
        this.instantiatesUri,
        this.code,
        this.note,
        this.priority,
        this.owner,
        this.meta,
        this.resourceType,
        this.location,
        this.businessStatus,
        this.text,
        newValue,
        this.encounter,
        this.identifier,
        this.intent,
        this.description,
        this.language,
        this.partOf,
        this.relevantHistory,
        this.input,
        this._for,
        this.implicitRules,
        this.statusReason,
        this.reasonCode,
        this.restriction,
        this.id,
        this.focus,
        this.insurance,
        this.contained,
        this.basedOn,
        this.requester,
        this.instantiatesCanonical,
        this.executionPeriod,
        this.output,
        this.authoredOn,
        this.reasonReference,
        this.status,
        this.groupIdentifier,
        this.performerType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Task#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTask withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableTask(
        this.lastModified,
        this.modifierExtension,
        this.instantiatesUri,
        this.code,
        this.note,
        this.priority,
        this.owner,
        this.meta,
        this.resourceType,
        this.location,
        this.businessStatus,
        this.text,
        value,
        this.encounter,
        this.identifier,
        this.intent,
        this.description,
        this.language,
        this.partOf,
        this.relevantHistory,
        this.input,
        this._for,
        this.implicitRules,
        this.statusReason,
        this.reasonCode,
        this.restriction,
        this.id,
        this.focus,
        this.insurance,
        this.contained,
        this.basedOn,
        this.requester,
        this.instantiatesCanonical,
        this.executionPeriod,
        this.output,
        this.authoredOn,
        this.reasonReference,
        this.status,
        this.groupIdentifier,
        this.performerType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Task#encounter() encounter} attribute.
   * @param value The value for encounter
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTask withEncounter(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "encounter");
    if (this.encounter == newValue) return this;
    return new ImmutableTask(
        this.lastModified,
        this.modifierExtension,
        this.instantiatesUri,
        this.code,
        this.note,
        this.priority,
        this.owner,
        this.meta,
        this.resourceType,
        this.location,
        this.businessStatus,
        this.text,
        this.extension,
        newValue,
        this.identifier,
        this.intent,
        this.description,
        this.language,
        this.partOf,
        this.relevantHistory,
        this.input,
        this._for,
        this.implicitRules,
        this.statusReason,
        this.reasonCode,
        this.restriction,
        this.id,
        this.focus,
        this.insurance,
        this.contained,
        this.basedOn,
        this.requester,
        this.instantiatesCanonical,
        this.executionPeriod,
        this.output,
        this.authoredOn,
        this.reasonReference,
        this.status,
        this.groupIdentifier,
        this.performerType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Task#encounter() encounter} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for encounter
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTask withEncounter(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.encounter == value) return this;
    return new ImmutableTask(
        this.lastModified,
        this.modifierExtension,
        this.instantiatesUri,
        this.code,
        this.note,
        this.priority,
        this.owner,
        this.meta,
        this.resourceType,
        this.location,
        this.businessStatus,
        this.text,
        this.extension,
        value,
        this.identifier,
        this.intent,
        this.description,
        this.language,
        this.partOf,
        this.relevantHistory,
        this.input,
        this._for,
        this.implicitRules,
        this.statusReason,
        this.reasonCode,
        this.restriction,
        this.id,
        this.focus,
        this.insurance,
        this.contained,
        this.basedOn,
        this.requester,
        this.instantiatesCanonical,
        this.executionPeriod,
        this.output,
        this.authoredOn,
        this.reasonReference,
        this.status,
        this.groupIdentifier,
        this.performerType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Task#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTask withIdentifier(List<Identifier> value) {
    @Nullable List<Identifier> newValue = Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableTask(
        this.lastModified,
        this.modifierExtension,
        this.instantiatesUri,
        this.code,
        this.note,
        this.priority,
        this.owner,
        this.meta,
        this.resourceType,
        this.location,
        this.businessStatus,
        this.text,
        this.extension,
        this.encounter,
        newValue,
        this.intent,
        this.description,
        this.language,
        this.partOf,
        this.relevantHistory,
        this.input,
        this._for,
        this.implicitRules,
        this.statusReason,
        this.reasonCode,
        this.restriction,
        this.id,
        this.focus,
        this.insurance,
        this.contained,
        this.basedOn,
        this.requester,
        this.instantiatesCanonical,
        this.executionPeriod,
        this.output,
        this.authoredOn,
        this.reasonReference,
        this.status,
        this.groupIdentifier,
        this.performerType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Task#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTask withIdentifier(Optional<? extends List<Identifier>> optional) {
    @Nullable List<Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableTask(
        this.lastModified,
        this.modifierExtension,
        this.instantiatesUri,
        this.code,
        this.note,
        this.priority,
        this.owner,
        this.meta,
        this.resourceType,
        this.location,
        this.businessStatus,
        this.text,
        this.extension,
        this.encounter,
        value,
        this.intent,
        this.description,
        this.language,
        this.partOf,
        this.relevantHistory,
        this.input,
        this._for,
        this.implicitRules,
        this.statusReason,
        this.reasonCode,
        this.restriction,
        this.id,
        this.focus,
        this.insurance,
        this.contained,
        this.basedOn,
        this.requester,
        this.instantiatesCanonical,
        this.executionPeriod,
        this.output,
        this.authoredOn,
        this.reasonReference,
        this.status,
        this.groupIdentifier,
        this.performerType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Task#intent() intent} attribute.
   * @param value The value for intent
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTask withIntent(TaskIntent value) {
    @Nullable TaskIntent newValue = Objects.requireNonNull(value, "intent");
    if (this.intent == newValue) return this;
    return new ImmutableTask(
        this.lastModified,
        this.modifierExtension,
        this.instantiatesUri,
        this.code,
        this.note,
        this.priority,
        this.owner,
        this.meta,
        this.resourceType,
        this.location,
        this.businessStatus,
        this.text,
        this.extension,
        this.encounter,
        this.identifier,
        newValue,
        this.description,
        this.language,
        this.partOf,
        this.relevantHistory,
        this.input,
        this._for,
        this.implicitRules,
        this.statusReason,
        this.reasonCode,
        this.restriction,
        this.id,
        this.focus,
        this.insurance,
        this.contained,
        this.basedOn,
        this.requester,
        this.instantiatesCanonical,
        this.executionPeriod,
        this.output,
        this.authoredOn,
        this.reasonReference,
        this.status,
        this.groupIdentifier,
        this.performerType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Task#intent() intent} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for intent
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTask withIntent(Optional<? extends TaskIntent> optional) {
    @Nullable TaskIntent value = optional.orElse(null);
    if (this.intent == value) return this;
    return new ImmutableTask(
        this.lastModified,
        this.modifierExtension,
        this.instantiatesUri,
        this.code,
        this.note,
        this.priority,
        this.owner,
        this.meta,
        this.resourceType,
        this.location,
        this.businessStatus,
        this.text,
        this.extension,
        this.encounter,
        this.identifier,
        value,
        this.description,
        this.language,
        this.partOf,
        this.relevantHistory,
        this.input,
        this._for,
        this.implicitRules,
        this.statusReason,
        this.reasonCode,
        this.restriction,
        this.id,
        this.focus,
        this.insurance,
        this.contained,
        this.basedOn,
        this.requester,
        this.instantiatesCanonical,
        this.executionPeriod,
        this.output,
        this.authoredOn,
        this.reasonReference,
        this.status,
        this.groupIdentifier,
        this.performerType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Task#description() description} attribute.
   * @param value The value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTask withDescription(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "description");
    if (Objects.equals(this.description, newValue)) return this;
    return new ImmutableTask(
        this.lastModified,
        this.modifierExtension,
        this.instantiatesUri,
        this.code,
        this.note,
        this.priority,
        this.owner,
        this.meta,
        this.resourceType,
        this.location,
        this.businessStatus,
        this.text,
        this.extension,
        this.encounter,
        this.identifier,
        this.intent,
        newValue,
        this.language,
        this.partOf,
        this.relevantHistory,
        this.input,
        this._for,
        this.implicitRules,
        this.statusReason,
        this.reasonCode,
        this.restriction,
        this.id,
        this.focus,
        this.insurance,
        this.contained,
        this.basedOn,
        this.requester,
        this.instantiatesCanonical,
        this.executionPeriod,
        this.output,
        this.authoredOn,
        this.reasonReference,
        this.status,
        this.groupIdentifier,
        this.performerType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Task#description() description} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTask withDescription(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.description, value)) return this;
    return new ImmutableTask(
        this.lastModified,
        this.modifierExtension,
        this.instantiatesUri,
        this.code,
        this.note,
        this.priority,
        this.owner,
        this.meta,
        this.resourceType,
        this.location,
        this.businessStatus,
        this.text,
        this.extension,
        this.encounter,
        this.identifier,
        this.intent,
        value,
        this.language,
        this.partOf,
        this.relevantHistory,
        this.input,
        this._for,
        this.implicitRules,
        this.statusReason,
        this.reasonCode,
        this.restriction,
        this.id,
        this.focus,
        this.insurance,
        this.contained,
        this.basedOn,
        this.requester,
        this.instantiatesCanonical,
        this.executionPeriod,
        this.output,
        this.authoredOn,
        this.reasonReference,
        this.status,
        this.groupIdentifier,
        this.performerType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Task#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTask withLanguage(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableTask(
        this.lastModified,
        this.modifierExtension,
        this.instantiatesUri,
        this.code,
        this.note,
        this.priority,
        this.owner,
        this.meta,
        this.resourceType,
        this.location,
        this.businessStatus,
        this.text,
        this.extension,
        this.encounter,
        this.identifier,
        this.intent,
        this.description,
        newValue,
        this.partOf,
        this.relevantHistory,
        this.input,
        this._for,
        this.implicitRules,
        this.statusReason,
        this.reasonCode,
        this.restriction,
        this.id,
        this.focus,
        this.insurance,
        this.contained,
        this.basedOn,
        this.requester,
        this.instantiatesCanonical,
        this.executionPeriod,
        this.output,
        this.authoredOn,
        this.reasonReference,
        this.status,
        this.groupIdentifier,
        this.performerType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Task#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTask withLanguage(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableTask(
        this.lastModified,
        this.modifierExtension,
        this.instantiatesUri,
        this.code,
        this.note,
        this.priority,
        this.owner,
        this.meta,
        this.resourceType,
        this.location,
        this.businessStatus,
        this.text,
        this.extension,
        this.encounter,
        this.identifier,
        this.intent,
        this.description,
        value,
        this.partOf,
        this.relevantHistory,
        this.input,
        this._for,
        this.implicitRules,
        this.statusReason,
        this.reasonCode,
        this.restriction,
        this.id,
        this.focus,
        this.insurance,
        this.contained,
        this.basedOn,
        this.requester,
        this.instantiatesCanonical,
        this.executionPeriod,
        this.output,
        this.authoredOn,
        this.reasonReference,
        this.status,
        this.groupIdentifier,
        this.performerType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Task#partOf() partOf} attribute.
   * @param value The value for partOf
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTask withPartOf(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "partOf");
    if (this.partOf == newValue) return this;
    return new ImmutableTask(
        this.lastModified,
        this.modifierExtension,
        this.instantiatesUri,
        this.code,
        this.note,
        this.priority,
        this.owner,
        this.meta,
        this.resourceType,
        this.location,
        this.businessStatus,
        this.text,
        this.extension,
        this.encounter,
        this.identifier,
        this.intent,
        this.description,
        this.language,
        newValue,
        this.relevantHistory,
        this.input,
        this._for,
        this.implicitRules,
        this.statusReason,
        this.reasonCode,
        this.restriction,
        this.id,
        this.focus,
        this.insurance,
        this.contained,
        this.basedOn,
        this.requester,
        this.instantiatesCanonical,
        this.executionPeriod,
        this.output,
        this.authoredOn,
        this.reasonReference,
        this.status,
        this.groupIdentifier,
        this.performerType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Task#partOf() partOf} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for partOf
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTask withPartOf(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.partOf == value) return this;
    return new ImmutableTask(
        this.lastModified,
        this.modifierExtension,
        this.instantiatesUri,
        this.code,
        this.note,
        this.priority,
        this.owner,
        this.meta,
        this.resourceType,
        this.location,
        this.businessStatus,
        this.text,
        this.extension,
        this.encounter,
        this.identifier,
        this.intent,
        this.description,
        this.language,
        value,
        this.relevantHistory,
        this.input,
        this._for,
        this.implicitRules,
        this.statusReason,
        this.reasonCode,
        this.restriction,
        this.id,
        this.focus,
        this.insurance,
        this.contained,
        this.basedOn,
        this.requester,
        this.instantiatesCanonical,
        this.executionPeriod,
        this.output,
        this.authoredOn,
        this.reasonReference,
        this.status,
        this.groupIdentifier,
        this.performerType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Task#relevantHistory() relevantHistory} attribute.
   * @param value The value for relevantHistory
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTask withRelevantHistory(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "relevantHistory");
    if (this.relevantHistory == newValue) return this;
    return new ImmutableTask(
        this.lastModified,
        this.modifierExtension,
        this.instantiatesUri,
        this.code,
        this.note,
        this.priority,
        this.owner,
        this.meta,
        this.resourceType,
        this.location,
        this.businessStatus,
        this.text,
        this.extension,
        this.encounter,
        this.identifier,
        this.intent,
        this.description,
        this.language,
        this.partOf,
        newValue,
        this.input,
        this._for,
        this.implicitRules,
        this.statusReason,
        this.reasonCode,
        this.restriction,
        this.id,
        this.focus,
        this.insurance,
        this.contained,
        this.basedOn,
        this.requester,
        this.instantiatesCanonical,
        this.executionPeriod,
        this.output,
        this.authoredOn,
        this.reasonReference,
        this.status,
        this.groupIdentifier,
        this.performerType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Task#relevantHistory() relevantHistory} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for relevantHistory
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTask withRelevantHistory(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.relevantHistory == value) return this;
    return new ImmutableTask(
        this.lastModified,
        this.modifierExtension,
        this.instantiatesUri,
        this.code,
        this.note,
        this.priority,
        this.owner,
        this.meta,
        this.resourceType,
        this.location,
        this.businessStatus,
        this.text,
        this.extension,
        this.encounter,
        this.identifier,
        this.intent,
        this.description,
        this.language,
        this.partOf,
        value,
        this.input,
        this._for,
        this.implicitRules,
        this.statusReason,
        this.reasonCode,
        this.restriction,
        this.id,
        this.focus,
        this.insurance,
        this.contained,
        this.basedOn,
        this.requester,
        this.instantiatesCanonical,
        this.executionPeriod,
        this.output,
        this.authoredOn,
        this.reasonReference,
        this.status,
        this.groupIdentifier,
        this.performerType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Task#input() input} attribute.
   * @param value The value for input
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTask withInput(List<Task_Input> value) {
    @Nullable List<Task_Input> newValue = Objects.requireNonNull(value, "input");
    if (this.input == newValue) return this;
    return new ImmutableTask(
        this.lastModified,
        this.modifierExtension,
        this.instantiatesUri,
        this.code,
        this.note,
        this.priority,
        this.owner,
        this.meta,
        this.resourceType,
        this.location,
        this.businessStatus,
        this.text,
        this.extension,
        this.encounter,
        this.identifier,
        this.intent,
        this.description,
        this.language,
        this.partOf,
        this.relevantHistory,
        newValue,
        this._for,
        this.implicitRules,
        this.statusReason,
        this.reasonCode,
        this.restriction,
        this.id,
        this.focus,
        this.insurance,
        this.contained,
        this.basedOn,
        this.requester,
        this.instantiatesCanonical,
        this.executionPeriod,
        this.output,
        this.authoredOn,
        this.reasonReference,
        this.status,
        this.groupIdentifier,
        this.performerType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Task#input() input} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for input
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTask withInput(Optional<? extends List<Task_Input>> optional) {
    @Nullable List<Task_Input> value = optional.orElse(null);
    if (this.input == value) return this;
    return new ImmutableTask(
        this.lastModified,
        this.modifierExtension,
        this.instantiatesUri,
        this.code,
        this.note,
        this.priority,
        this.owner,
        this.meta,
        this.resourceType,
        this.location,
        this.businessStatus,
        this.text,
        this.extension,
        this.encounter,
        this.identifier,
        this.intent,
        this.description,
        this.language,
        this.partOf,
        this.relevantHistory,
        value,
        this._for,
        this.implicitRules,
        this.statusReason,
        this.reasonCode,
        this.restriction,
        this.id,
        this.focus,
        this.insurance,
        this.contained,
        this.basedOn,
        this.requester,
        this.instantiatesCanonical,
        this.executionPeriod,
        this.output,
        this.authoredOn,
        this.reasonReference,
        this.status,
        this.groupIdentifier,
        this.performerType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Task#_for() _for} attribute.
   * @param value The value for _for
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTask with_for(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "_for");
    if (this._for == newValue) return this;
    return new ImmutableTask(
        this.lastModified,
        this.modifierExtension,
        this.instantiatesUri,
        this.code,
        this.note,
        this.priority,
        this.owner,
        this.meta,
        this.resourceType,
        this.location,
        this.businessStatus,
        this.text,
        this.extension,
        this.encounter,
        this.identifier,
        this.intent,
        this.description,
        this.language,
        this.partOf,
        this.relevantHistory,
        this.input,
        newValue,
        this.implicitRules,
        this.statusReason,
        this.reasonCode,
        this.restriction,
        this.id,
        this.focus,
        this.insurance,
        this.contained,
        this.basedOn,
        this.requester,
        this.instantiatesCanonical,
        this.executionPeriod,
        this.output,
        this.authoredOn,
        this.reasonReference,
        this.status,
        this.groupIdentifier,
        this.performerType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Task#_for() _for} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for _for
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTask with_for(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this._for == value) return this;
    return new ImmutableTask(
        this.lastModified,
        this.modifierExtension,
        this.instantiatesUri,
        this.code,
        this.note,
        this.priority,
        this.owner,
        this.meta,
        this.resourceType,
        this.location,
        this.businessStatus,
        this.text,
        this.extension,
        this.encounter,
        this.identifier,
        this.intent,
        this.description,
        this.language,
        this.partOf,
        this.relevantHistory,
        this.input,
        value,
        this.implicitRules,
        this.statusReason,
        this.reasonCode,
        this.restriction,
        this.id,
        this.focus,
        this.insurance,
        this.contained,
        this.basedOn,
        this.requester,
        this.instantiatesCanonical,
        this.executionPeriod,
        this.output,
        this.authoredOn,
        this.reasonReference,
        this.status,
        this.groupIdentifier,
        this.performerType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Task#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTask withImplicitRules(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableTask(
        this.lastModified,
        this.modifierExtension,
        this.instantiatesUri,
        this.code,
        this.note,
        this.priority,
        this.owner,
        this.meta,
        this.resourceType,
        this.location,
        this.businessStatus,
        this.text,
        this.extension,
        this.encounter,
        this.identifier,
        this.intent,
        this.description,
        this.language,
        this.partOf,
        this.relevantHistory,
        this.input,
        this._for,
        newValue,
        this.statusReason,
        this.reasonCode,
        this.restriction,
        this.id,
        this.focus,
        this.insurance,
        this.contained,
        this.basedOn,
        this.requester,
        this.instantiatesCanonical,
        this.executionPeriod,
        this.output,
        this.authoredOn,
        this.reasonReference,
        this.status,
        this.groupIdentifier,
        this.performerType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Task#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTask withImplicitRules(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableTask(
        this.lastModified,
        this.modifierExtension,
        this.instantiatesUri,
        this.code,
        this.note,
        this.priority,
        this.owner,
        this.meta,
        this.resourceType,
        this.location,
        this.businessStatus,
        this.text,
        this.extension,
        this.encounter,
        this.identifier,
        this.intent,
        this.description,
        this.language,
        this.partOf,
        this.relevantHistory,
        this.input,
        this._for,
        value,
        this.statusReason,
        this.reasonCode,
        this.restriction,
        this.id,
        this.focus,
        this.insurance,
        this.contained,
        this.basedOn,
        this.requester,
        this.instantiatesCanonical,
        this.executionPeriod,
        this.output,
        this.authoredOn,
        this.reasonReference,
        this.status,
        this.groupIdentifier,
        this.performerType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Task#statusReason() statusReason} attribute.
   * @param value The value for statusReason
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTask withStatusReason(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "statusReason");
    if (this.statusReason == newValue) return this;
    return new ImmutableTask(
        this.lastModified,
        this.modifierExtension,
        this.instantiatesUri,
        this.code,
        this.note,
        this.priority,
        this.owner,
        this.meta,
        this.resourceType,
        this.location,
        this.businessStatus,
        this.text,
        this.extension,
        this.encounter,
        this.identifier,
        this.intent,
        this.description,
        this.language,
        this.partOf,
        this.relevantHistory,
        this.input,
        this._for,
        this.implicitRules,
        newValue,
        this.reasonCode,
        this.restriction,
        this.id,
        this.focus,
        this.insurance,
        this.contained,
        this.basedOn,
        this.requester,
        this.instantiatesCanonical,
        this.executionPeriod,
        this.output,
        this.authoredOn,
        this.reasonReference,
        this.status,
        this.groupIdentifier,
        this.performerType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Task#statusReason() statusReason} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for statusReason
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTask withStatusReason(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.statusReason == value) return this;
    return new ImmutableTask(
        this.lastModified,
        this.modifierExtension,
        this.instantiatesUri,
        this.code,
        this.note,
        this.priority,
        this.owner,
        this.meta,
        this.resourceType,
        this.location,
        this.businessStatus,
        this.text,
        this.extension,
        this.encounter,
        this.identifier,
        this.intent,
        this.description,
        this.language,
        this.partOf,
        this.relevantHistory,
        this.input,
        this._for,
        this.implicitRules,
        value,
        this.reasonCode,
        this.restriction,
        this.id,
        this.focus,
        this.insurance,
        this.contained,
        this.basedOn,
        this.requester,
        this.instantiatesCanonical,
        this.executionPeriod,
        this.output,
        this.authoredOn,
        this.reasonReference,
        this.status,
        this.groupIdentifier,
        this.performerType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Task#reasonCode() reasonCode} attribute.
   * @param value The value for reasonCode
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTask withReasonCode(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "reasonCode");
    if (this.reasonCode == newValue) return this;
    return new ImmutableTask(
        this.lastModified,
        this.modifierExtension,
        this.instantiatesUri,
        this.code,
        this.note,
        this.priority,
        this.owner,
        this.meta,
        this.resourceType,
        this.location,
        this.businessStatus,
        this.text,
        this.extension,
        this.encounter,
        this.identifier,
        this.intent,
        this.description,
        this.language,
        this.partOf,
        this.relevantHistory,
        this.input,
        this._for,
        this.implicitRules,
        this.statusReason,
        newValue,
        this.restriction,
        this.id,
        this.focus,
        this.insurance,
        this.contained,
        this.basedOn,
        this.requester,
        this.instantiatesCanonical,
        this.executionPeriod,
        this.output,
        this.authoredOn,
        this.reasonReference,
        this.status,
        this.groupIdentifier,
        this.performerType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Task#reasonCode() reasonCode} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for reasonCode
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTask withReasonCode(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.reasonCode == value) return this;
    return new ImmutableTask(
        this.lastModified,
        this.modifierExtension,
        this.instantiatesUri,
        this.code,
        this.note,
        this.priority,
        this.owner,
        this.meta,
        this.resourceType,
        this.location,
        this.businessStatus,
        this.text,
        this.extension,
        this.encounter,
        this.identifier,
        this.intent,
        this.description,
        this.language,
        this.partOf,
        this.relevantHistory,
        this.input,
        this._for,
        this.implicitRules,
        this.statusReason,
        value,
        this.restriction,
        this.id,
        this.focus,
        this.insurance,
        this.contained,
        this.basedOn,
        this.requester,
        this.instantiatesCanonical,
        this.executionPeriod,
        this.output,
        this.authoredOn,
        this.reasonReference,
        this.status,
        this.groupIdentifier,
        this.performerType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Task#restriction() restriction} attribute.
   * @param value The value for restriction
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTask withRestriction(Task_Restriction value) {
    @Nullable Task_Restriction newValue = Objects.requireNonNull(value, "restriction");
    if (this.restriction == newValue) return this;
    return new ImmutableTask(
        this.lastModified,
        this.modifierExtension,
        this.instantiatesUri,
        this.code,
        this.note,
        this.priority,
        this.owner,
        this.meta,
        this.resourceType,
        this.location,
        this.businessStatus,
        this.text,
        this.extension,
        this.encounter,
        this.identifier,
        this.intent,
        this.description,
        this.language,
        this.partOf,
        this.relevantHistory,
        this.input,
        this._for,
        this.implicitRules,
        this.statusReason,
        this.reasonCode,
        newValue,
        this.id,
        this.focus,
        this.insurance,
        this.contained,
        this.basedOn,
        this.requester,
        this.instantiatesCanonical,
        this.executionPeriod,
        this.output,
        this.authoredOn,
        this.reasonReference,
        this.status,
        this.groupIdentifier,
        this.performerType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Task#restriction() restriction} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for restriction
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTask withRestriction(Optional<? extends Task_Restriction> optional) {
    @Nullable Task_Restriction value = optional.orElse(null);
    if (this.restriction == value) return this;
    return new ImmutableTask(
        this.lastModified,
        this.modifierExtension,
        this.instantiatesUri,
        this.code,
        this.note,
        this.priority,
        this.owner,
        this.meta,
        this.resourceType,
        this.location,
        this.businessStatus,
        this.text,
        this.extension,
        this.encounter,
        this.identifier,
        this.intent,
        this.description,
        this.language,
        this.partOf,
        this.relevantHistory,
        this.input,
        this._for,
        this.implicitRules,
        this.statusReason,
        this.reasonCode,
        value,
        this.id,
        this.focus,
        this.insurance,
        this.contained,
        this.basedOn,
        this.requester,
        this.instantiatesCanonical,
        this.executionPeriod,
        this.output,
        this.authoredOn,
        this.reasonReference,
        this.status,
        this.groupIdentifier,
        this.performerType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Task#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTask withId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableTask(
        this.lastModified,
        this.modifierExtension,
        this.instantiatesUri,
        this.code,
        this.note,
        this.priority,
        this.owner,
        this.meta,
        this.resourceType,
        this.location,
        this.businessStatus,
        this.text,
        this.extension,
        this.encounter,
        this.identifier,
        this.intent,
        this.description,
        this.language,
        this.partOf,
        this.relevantHistory,
        this.input,
        this._for,
        this.implicitRules,
        this.statusReason,
        this.reasonCode,
        this.restriction,
        newValue,
        this.focus,
        this.insurance,
        this.contained,
        this.basedOn,
        this.requester,
        this.instantiatesCanonical,
        this.executionPeriod,
        this.output,
        this.authoredOn,
        this.reasonReference,
        this.status,
        this.groupIdentifier,
        this.performerType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Task#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTask withId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableTask(
        this.lastModified,
        this.modifierExtension,
        this.instantiatesUri,
        this.code,
        this.note,
        this.priority,
        this.owner,
        this.meta,
        this.resourceType,
        this.location,
        this.businessStatus,
        this.text,
        this.extension,
        this.encounter,
        this.identifier,
        this.intent,
        this.description,
        this.language,
        this.partOf,
        this.relevantHistory,
        this.input,
        this._for,
        this.implicitRules,
        this.statusReason,
        this.reasonCode,
        this.restriction,
        value,
        this.focus,
        this.insurance,
        this.contained,
        this.basedOn,
        this.requester,
        this.instantiatesCanonical,
        this.executionPeriod,
        this.output,
        this.authoredOn,
        this.reasonReference,
        this.status,
        this.groupIdentifier,
        this.performerType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Task#focus() focus} attribute.
   * @param value The value for focus
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTask withFocus(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "focus");
    if (this.focus == newValue) return this;
    return new ImmutableTask(
        this.lastModified,
        this.modifierExtension,
        this.instantiatesUri,
        this.code,
        this.note,
        this.priority,
        this.owner,
        this.meta,
        this.resourceType,
        this.location,
        this.businessStatus,
        this.text,
        this.extension,
        this.encounter,
        this.identifier,
        this.intent,
        this.description,
        this.language,
        this.partOf,
        this.relevantHistory,
        this.input,
        this._for,
        this.implicitRules,
        this.statusReason,
        this.reasonCode,
        this.restriction,
        this.id,
        newValue,
        this.insurance,
        this.contained,
        this.basedOn,
        this.requester,
        this.instantiatesCanonical,
        this.executionPeriod,
        this.output,
        this.authoredOn,
        this.reasonReference,
        this.status,
        this.groupIdentifier,
        this.performerType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Task#focus() focus} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for focus
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTask withFocus(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.focus == value) return this;
    return new ImmutableTask(
        this.lastModified,
        this.modifierExtension,
        this.instantiatesUri,
        this.code,
        this.note,
        this.priority,
        this.owner,
        this.meta,
        this.resourceType,
        this.location,
        this.businessStatus,
        this.text,
        this.extension,
        this.encounter,
        this.identifier,
        this.intent,
        this.description,
        this.language,
        this.partOf,
        this.relevantHistory,
        this.input,
        this._for,
        this.implicitRules,
        this.statusReason,
        this.reasonCode,
        this.restriction,
        this.id,
        value,
        this.insurance,
        this.contained,
        this.basedOn,
        this.requester,
        this.instantiatesCanonical,
        this.executionPeriod,
        this.output,
        this.authoredOn,
        this.reasonReference,
        this.status,
        this.groupIdentifier,
        this.performerType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Task#insurance() insurance} attribute.
   * @param value The value for insurance
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTask withInsurance(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "insurance");
    if (this.insurance == newValue) return this;
    return new ImmutableTask(
        this.lastModified,
        this.modifierExtension,
        this.instantiatesUri,
        this.code,
        this.note,
        this.priority,
        this.owner,
        this.meta,
        this.resourceType,
        this.location,
        this.businessStatus,
        this.text,
        this.extension,
        this.encounter,
        this.identifier,
        this.intent,
        this.description,
        this.language,
        this.partOf,
        this.relevantHistory,
        this.input,
        this._for,
        this.implicitRules,
        this.statusReason,
        this.reasonCode,
        this.restriction,
        this.id,
        this.focus,
        newValue,
        this.contained,
        this.basedOn,
        this.requester,
        this.instantiatesCanonical,
        this.executionPeriod,
        this.output,
        this.authoredOn,
        this.reasonReference,
        this.status,
        this.groupIdentifier,
        this.performerType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Task#insurance() insurance} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for insurance
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTask withInsurance(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.insurance == value) return this;
    return new ImmutableTask(
        this.lastModified,
        this.modifierExtension,
        this.instantiatesUri,
        this.code,
        this.note,
        this.priority,
        this.owner,
        this.meta,
        this.resourceType,
        this.location,
        this.businessStatus,
        this.text,
        this.extension,
        this.encounter,
        this.identifier,
        this.intent,
        this.description,
        this.language,
        this.partOf,
        this.relevantHistory,
        this.input,
        this._for,
        this.implicitRules,
        this.statusReason,
        this.reasonCode,
        this.restriction,
        this.id,
        this.focus,
        value,
        this.contained,
        this.basedOn,
        this.requester,
        this.instantiatesCanonical,
        this.executionPeriod,
        this.output,
        this.authoredOn,
        this.reasonReference,
        this.status,
        this.groupIdentifier,
        this.performerType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Task#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTask withContained(List<ResourceList> value) {
    @Nullable List<ResourceList> newValue = Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableTask(
        this.lastModified,
        this.modifierExtension,
        this.instantiatesUri,
        this.code,
        this.note,
        this.priority,
        this.owner,
        this.meta,
        this.resourceType,
        this.location,
        this.businessStatus,
        this.text,
        this.extension,
        this.encounter,
        this.identifier,
        this.intent,
        this.description,
        this.language,
        this.partOf,
        this.relevantHistory,
        this.input,
        this._for,
        this.implicitRules,
        this.statusReason,
        this.reasonCode,
        this.restriction,
        this.id,
        this.focus,
        this.insurance,
        newValue,
        this.basedOn,
        this.requester,
        this.instantiatesCanonical,
        this.executionPeriod,
        this.output,
        this.authoredOn,
        this.reasonReference,
        this.status,
        this.groupIdentifier,
        this.performerType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Task#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTask withContained(Optional<? extends List<ResourceList>> optional) {
    @Nullable List<ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableTask(
        this.lastModified,
        this.modifierExtension,
        this.instantiatesUri,
        this.code,
        this.note,
        this.priority,
        this.owner,
        this.meta,
        this.resourceType,
        this.location,
        this.businessStatus,
        this.text,
        this.extension,
        this.encounter,
        this.identifier,
        this.intent,
        this.description,
        this.language,
        this.partOf,
        this.relevantHistory,
        this.input,
        this._for,
        this.implicitRules,
        this.statusReason,
        this.reasonCode,
        this.restriction,
        this.id,
        this.focus,
        this.insurance,
        value,
        this.basedOn,
        this.requester,
        this.instantiatesCanonical,
        this.executionPeriod,
        this.output,
        this.authoredOn,
        this.reasonReference,
        this.status,
        this.groupIdentifier,
        this.performerType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Task#basedOn() basedOn} attribute.
   * @param value The value for basedOn
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTask withBasedOn(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "basedOn");
    if (this.basedOn == newValue) return this;
    return new ImmutableTask(
        this.lastModified,
        this.modifierExtension,
        this.instantiatesUri,
        this.code,
        this.note,
        this.priority,
        this.owner,
        this.meta,
        this.resourceType,
        this.location,
        this.businessStatus,
        this.text,
        this.extension,
        this.encounter,
        this.identifier,
        this.intent,
        this.description,
        this.language,
        this.partOf,
        this.relevantHistory,
        this.input,
        this._for,
        this.implicitRules,
        this.statusReason,
        this.reasonCode,
        this.restriction,
        this.id,
        this.focus,
        this.insurance,
        this.contained,
        newValue,
        this.requester,
        this.instantiatesCanonical,
        this.executionPeriod,
        this.output,
        this.authoredOn,
        this.reasonReference,
        this.status,
        this.groupIdentifier,
        this.performerType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Task#basedOn() basedOn} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for basedOn
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTask withBasedOn(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.basedOn == value) return this;
    return new ImmutableTask(
        this.lastModified,
        this.modifierExtension,
        this.instantiatesUri,
        this.code,
        this.note,
        this.priority,
        this.owner,
        this.meta,
        this.resourceType,
        this.location,
        this.businessStatus,
        this.text,
        this.extension,
        this.encounter,
        this.identifier,
        this.intent,
        this.description,
        this.language,
        this.partOf,
        this.relevantHistory,
        this.input,
        this._for,
        this.implicitRules,
        this.statusReason,
        this.reasonCode,
        this.restriction,
        this.id,
        this.focus,
        this.insurance,
        this.contained,
        value,
        this.requester,
        this.instantiatesCanonical,
        this.executionPeriod,
        this.output,
        this.authoredOn,
        this.reasonReference,
        this.status,
        this.groupIdentifier,
        this.performerType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Task#requester() requester} attribute.
   * @param value The value for requester
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTask withRequester(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "requester");
    if (this.requester == newValue) return this;
    return new ImmutableTask(
        this.lastModified,
        this.modifierExtension,
        this.instantiatesUri,
        this.code,
        this.note,
        this.priority,
        this.owner,
        this.meta,
        this.resourceType,
        this.location,
        this.businessStatus,
        this.text,
        this.extension,
        this.encounter,
        this.identifier,
        this.intent,
        this.description,
        this.language,
        this.partOf,
        this.relevantHistory,
        this.input,
        this._for,
        this.implicitRules,
        this.statusReason,
        this.reasonCode,
        this.restriction,
        this.id,
        this.focus,
        this.insurance,
        this.contained,
        this.basedOn,
        newValue,
        this.instantiatesCanonical,
        this.executionPeriod,
        this.output,
        this.authoredOn,
        this.reasonReference,
        this.status,
        this.groupIdentifier,
        this.performerType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Task#requester() requester} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for requester
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTask withRequester(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.requester == value) return this;
    return new ImmutableTask(
        this.lastModified,
        this.modifierExtension,
        this.instantiatesUri,
        this.code,
        this.note,
        this.priority,
        this.owner,
        this.meta,
        this.resourceType,
        this.location,
        this.businessStatus,
        this.text,
        this.extension,
        this.encounter,
        this.identifier,
        this.intent,
        this.description,
        this.language,
        this.partOf,
        this.relevantHistory,
        this.input,
        this._for,
        this.implicitRules,
        this.statusReason,
        this.reasonCode,
        this.restriction,
        this.id,
        this.focus,
        this.insurance,
        this.contained,
        this.basedOn,
        value,
        this.instantiatesCanonical,
        this.executionPeriod,
        this.output,
        this.authoredOn,
        this.reasonReference,
        this.status,
        this.groupIdentifier,
        this.performerType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Task#instantiatesCanonical() instantiatesCanonical} attribute.
   * @param value The value for instantiatesCanonical
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTask withInstantiatesCanonical(Canonical value) {
    @Nullable Canonical newValue = Objects.requireNonNull(value, "instantiatesCanonical");
    if (this.instantiatesCanonical == newValue) return this;
    return new ImmutableTask(
        this.lastModified,
        this.modifierExtension,
        this.instantiatesUri,
        this.code,
        this.note,
        this.priority,
        this.owner,
        this.meta,
        this.resourceType,
        this.location,
        this.businessStatus,
        this.text,
        this.extension,
        this.encounter,
        this.identifier,
        this.intent,
        this.description,
        this.language,
        this.partOf,
        this.relevantHistory,
        this.input,
        this._for,
        this.implicitRules,
        this.statusReason,
        this.reasonCode,
        this.restriction,
        this.id,
        this.focus,
        this.insurance,
        this.contained,
        this.basedOn,
        this.requester,
        newValue,
        this.executionPeriod,
        this.output,
        this.authoredOn,
        this.reasonReference,
        this.status,
        this.groupIdentifier,
        this.performerType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Task#instantiatesCanonical() instantiatesCanonical} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for instantiatesCanonical
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTask withInstantiatesCanonical(Optional<? extends Canonical> optional) {
    @Nullable Canonical value = optional.orElse(null);
    if (this.instantiatesCanonical == value) return this;
    return new ImmutableTask(
        this.lastModified,
        this.modifierExtension,
        this.instantiatesUri,
        this.code,
        this.note,
        this.priority,
        this.owner,
        this.meta,
        this.resourceType,
        this.location,
        this.businessStatus,
        this.text,
        this.extension,
        this.encounter,
        this.identifier,
        this.intent,
        this.description,
        this.language,
        this.partOf,
        this.relevantHistory,
        this.input,
        this._for,
        this.implicitRules,
        this.statusReason,
        this.reasonCode,
        this.restriction,
        this.id,
        this.focus,
        this.insurance,
        this.contained,
        this.basedOn,
        this.requester,
        value,
        this.executionPeriod,
        this.output,
        this.authoredOn,
        this.reasonReference,
        this.status,
        this.groupIdentifier,
        this.performerType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Task#executionPeriod() executionPeriod} attribute.
   * @param value The value for executionPeriod
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTask withExecutionPeriod(Period value) {
    @Nullable Period newValue = Objects.requireNonNull(value, "executionPeriod");
    if (this.executionPeriod == newValue) return this;
    return new ImmutableTask(
        this.lastModified,
        this.modifierExtension,
        this.instantiatesUri,
        this.code,
        this.note,
        this.priority,
        this.owner,
        this.meta,
        this.resourceType,
        this.location,
        this.businessStatus,
        this.text,
        this.extension,
        this.encounter,
        this.identifier,
        this.intent,
        this.description,
        this.language,
        this.partOf,
        this.relevantHistory,
        this.input,
        this._for,
        this.implicitRules,
        this.statusReason,
        this.reasonCode,
        this.restriction,
        this.id,
        this.focus,
        this.insurance,
        this.contained,
        this.basedOn,
        this.requester,
        this.instantiatesCanonical,
        newValue,
        this.output,
        this.authoredOn,
        this.reasonReference,
        this.status,
        this.groupIdentifier,
        this.performerType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Task#executionPeriod() executionPeriod} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for executionPeriod
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTask withExecutionPeriod(Optional<? extends Period> optional) {
    @Nullable Period value = optional.orElse(null);
    if (this.executionPeriod == value) return this;
    return new ImmutableTask(
        this.lastModified,
        this.modifierExtension,
        this.instantiatesUri,
        this.code,
        this.note,
        this.priority,
        this.owner,
        this.meta,
        this.resourceType,
        this.location,
        this.businessStatus,
        this.text,
        this.extension,
        this.encounter,
        this.identifier,
        this.intent,
        this.description,
        this.language,
        this.partOf,
        this.relevantHistory,
        this.input,
        this._for,
        this.implicitRules,
        this.statusReason,
        this.reasonCode,
        this.restriction,
        this.id,
        this.focus,
        this.insurance,
        this.contained,
        this.basedOn,
        this.requester,
        this.instantiatesCanonical,
        value,
        this.output,
        this.authoredOn,
        this.reasonReference,
        this.status,
        this.groupIdentifier,
        this.performerType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Task#output() output} attribute.
   * @param value The value for output
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTask withOutput(List<Task_Output> value) {
    @Nullable List<Task_Output> newValue = Objects.requireNonNull(value, "output");
    if (this.output == newValue) return this;
    return new ImmutableTask(
        this.lastModified,
        this.modifierExtension,
        this.instantiatesUri,
        this.code,
        this.note,
        this.priority,
        this.owner,
        this.meta,
        this.resourceType,
        this.location,
        this.businessStatus,
        this.text,
        this.extension,
        this.encounter,
        this.identifier,
        this.intent,
        this.description,
        this.language,
        this.partOf,
        this.relevantHistory,
        this.input,
        this._for,
        this.implicitRules,
        this.statusReason,
        this.reasonCode,
        this.restriction,
        this.id,
        this.focus,
        this.insurance,
        this.contained,
        this.basedOn,
        this.requester,
        this.instantiatesCanonical,
        this.executionPeriod,
        newValue,
        this.authoredOn,
        this.reasonReference,
        this.status,
        this.groupIdentifier,
        this.performerType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Task#output() output} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for output
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTask withOutput(Optional<? extends List<Task_Output>> optional) {
    @Nullable List<Task_Output> value = optional.orElse(null);
    if (this.output == value) return this;
    return new ImmutableTask(
        this.lastModified,
        this.modifierExtension,
        this.instantiatesUri,
        this.code,
        this.note,
        this.priority,
        this.owner,
        this.meta,
        this.resourceType,
        this.location,
        this.businessStatus,
        this.text,
        this.extension,
        this.encounter,
        this.identifier,
        this.intent,
        this.description,
        this.language,
        this.partOf,
        this.relevantHistory,
        this.input,
        this._for,
        this.implicitRules,
        this.statusReason,
        this.reasonCode,
        this.restriction,
        this.id,
        this.focus,
        this.insurance,
        this.contained,
        this.basedOn,
        this.requester,
        this.instantiatesCanonical,
        this.executionPeriod,
        value,
        this.authoredOn,
        this.reasonReference,
        this.status,
        this.groupIdentifier,
        this.performerType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Task#authoredOn() authoredOn} attribute.
   * @param value The value for authoredOn
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTask withAuthoredOn(DateTime value) {
    @Nullable DateTime newValue = Objects.requireNonNull(value, "authoredOn");
    if (this.authoredOn == newValue) return this;
    return new ImmutableTask(
        this.lastModified,
        this.modifierExtension,
        this.instantiatesUri,
        this.code,
        this.note,
        this.priority,
        this.owner,
        this.meta,
        this.resourceType,
        this.location,
        this.businessStatus,
        this.text,
        this.extension,
        this.encounter,
        this.identifier,
        this.intent,
        this.description,
        this.language,
        this.partOf,
        this.relevantHistory,
        this.input,
        this._for,
        this.implicitRules,
        this.statusReason,
        this.reasonCode,
        this.restriction,
        this.id,
        this.focus,
        this.insurance,
        this.contained,
        this.basedOn,
        this.requester,
        this.instantiatesCanonical,
        this.executionPeriod,
        this.output,
        newValue,
        this.reasonReference,
        this.status,
        this.groupIdentifier,
        this.performerType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Task#authoredOn() authoredOn} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for authoredOn
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTask withAuthoredOn(Optional<? extends DateTime> optional) {
    @Nullable DateTime value = optional.orElse(null);
    if (this.authoredOn == value) return this;
    return new ImmutableTask(
        this.lastModified,
        this.modifierExtension,
        this.instantiatesUri,
        this.code,
        this.note,
        this.priority,
        this.owner,
        this.meta,
        this.resourceType,
        this.location,
        this.businessStatus,
        this.text,
        this.extension,
        this.encounter,
        this.identifier,
        this.intent,
        this.description,
        this.language,
        this.partOf,
        this.relevantHistory,
        this.input,
        this._for,
        this.implicitRules,
        this.statusReason,
        this.reasonCode,
        this.restriction,
        this.id,
        this.focus,
        this.insurance,
        this.contained,
        this.basedOn,
        this.requester,
        this.instantiatesCanonical,
        this.executionPeriod,
        this.output,
        value,
        this.reasonReference,
        this.status,
        this.groupIdentifier,
        this.performerType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Task#reasonReference() reasonReference} attribute.
   * @param value The value for reasonReference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTask withReasonReference(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "reasonReference");
    if (this.reasonReference == newValue) return this;
    return new ImmutableTask(
        this.lastModified,
        this.modifierExtension,
        this.instantiatesUri,
        this.code,
        this.note,
        this.priority,
        this.owner,
        this.meta,
        this.resourceType,
        this.location,
        this.businessStatus,
        this.text,
        this.extension,
        this.encounter,
        this.identifier,
        this.intent,
        this.description,
        this.language,
        this.partOf,
        this.relevantHistory,
        this.input,
        this._for,
        this.implicitRules,
        this.statusReason,
        this.reasonCode,
        this.restriction,
        this.id,
        this.focus,
        this.insurance,
        this.contained,
        this.basedOn,
        this.requester,
        this.instantiatesCanonical,
        this.executionPeriod,
        this.output,
        this.authoredOn,
        newValue,
        this.status,
        this.groupIdentifier,
        this.performerType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Task#reasonReference() reasonReference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for reasonReference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTask withReasonReference(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.reasonReference == value) return this;
    return new ImmutableTask(
        this.lastModified,
        this.modifierExtension,
        this.instantiatesUri,
        this.code,
        this.note,
        this.priority,
        this.owner,
        this.meta,
        this.resourceType,
        this.location,
        this.businessStatus,
        this.text,
        this.extension,
        this.encounter,
        this.identifier,
        this.intent,
        this.description,
        this.language,
        this.partOf,
        this.relevantHistory,
        this.input,
        this._for,
        this.implicitRules,
        this.statusReason,
        this.reasonCode,
        this.restriction,
        this.id,
        this.focus,
        this.insurance,
        this.contained,
        this.basedOn,
        this.requester,
        this.instantiatesCanonical,
        this.executionPeriod,
        this.output,
        this.authoredOn,
        value,
        this.status,
        this.groupIdentifier,
        this.performerType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Task#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTask withStatus(TaskStatus value) {
    @Nullable TaskStatus newValue = Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableTask(
        this.lastModified,
        this.modifierExtension,
        this.instantiatesUri,
        this.code,
        this.note,
        this.priority,
        this.owner,
        this.meta,
        this.resourceType,
        this.location,
        this.businessStatus,
        this.text,
        this.extension,
        this.encounter,
        this.identifier,
        this.intent,
        this.description,
        this.language,
        this.partOf,
        this.relevantHistory,
        this.input,
        this._for,
        this.implicitRules,
        this.statusReason,
        this.reasonCode,
        this.restriction,
        this.id,
        this.focus,
        this.insurance,
        this.contained,
        this.basedOn,
        this.requester,
        this.instantiatesCanonical,
        this.executionPeriod,
        this.output,
        this.authoredOn,
        this.reasonReference,
        newValue,
        this.groupIdentifier,
        this.performerType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Task#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTask withStatus(Optional<? extends TaskStatus> optional) {
    @Nullable TaskStatus value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableTask(
        this.lastModified,
        this.modifierExtension,
        this.instantiatesUri,
        this.code,
        this.note,
        this.priority,
        this.owner,
        this.meta,
        this.resourceType,
        this.location,
        this.businessStatus,
        this.text,
        this.extension,
        this.encounter,
        this.identifier,
        this.intent,
        this.description,
        this.language,
        this.partOf,
        this.relevantHistory,
        this.input,
        this._for,
        this.implicitRules,
        this.statusReason,
        this.reasonCode,
        this.restriction,
        this.id,
        this.focus,
        this.insurance,
        this.contained,
        this.basedOn,
        this.requester,
        this.instantiatesCanonical,
        this.executionPeriod,
        this.output,
        this.authoredOn,
        this.reasonReference,
        value,
        this.groupIdentifier,
        this.performerType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Task#groupIdentifier() groupIdentifier} attribute.
   * @param value The value for groupIdentifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTask withGroupIdentifier(Identifier value) {
    @Nullable Identifier newValue = Objects.requireNonNull(value, "groupIdentifier");
    if (this.groupIdentifier == newValue) return this;
    return new ImmutableTask(
        this.lastModified,
        this.modifierExtension,
        this.instantiatesUri,
        this.code,
        this.note,
        this.priority,
        this.owner,
        this.meta,
        this.resourceType,
        this.location,
        this.businessStatus,
        this.text,
        this.extension,
        this.encounter,
        this.identifier,
        this.intent,
        this.description,
        this.language,
        this.partOf,
        this.relevantHistory,
        this.input,
        this._for,
        this.implicitRules,
        this.statusReason,
        this.reasonCode,
        this.restriction,
        this.id,
        this.focus,
        this.insurance,
        this.contained,
        this.basedOn,
        this.requester,
        this.instantiatesCanonical,
        this.executionPeriod,
        this.output,
        this.authoredOn,
        this.reasonReference,
        this.status,
        newValue,
        this.performerType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Task#groupIdentifier() groupIdentifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for groupIdentifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTask withGroupIdentifier(Optional<? extends Identifier> optional) {
    @Nullable Identifier value = optional.orElse(null);
    if (this.groupIdentifier == value) return this;
    return new ImmutableTask(
        this.lastModified,
        this.modifierExtension,
        this.instantiatesUri,
        this.code,
        this.note,
        this.priority,
        this.owner,
        this.meta,
        this.resourceType,
        this.location,
        this.businessStatus,
        this.text,
        this.extension,
        this.encounter,
        this.identifier,
        this.intent,
        this.description,
        this.language,
        this.partOf,
        this.relevantHistory,
        this.input,
        this._for,
        this.implicitRules,
        this.statusReason,
        this.reasonCode,
        this.restriction,
        this.id,
        this.focus,
        this.insurance,
        this.contained,
        this.basedOn,
        this.requester,
        this.instantiatesCanonical,
        this.executionPeriod,
        this.output,
        this.authoredOn,
        this.reasonReference,
        this.status,
        value,
        this.performerType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Task#performerType() performerType} attribute.
   * @param value The value for performerType
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTask withPerformerType(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "performerType");
    if (this.performerType == newValue) return this;
    return new ImmutableTask(
        this.lastModified,
        this.modifierExtension,
        this.instantiatesUri,
        this.code,
        this.note,
        this.priority,
        this.owner,
        this.meta,
        this.resourceType,
        this.location,
        this.businessStatus,
        this.text,
        this.extension,
        this.encounter,
        this.identifier,
        this.intent,
        this.description,
        this.language,
        this.partOf,
        this.relevantHistory,
        this.input,
        this._for,
        this.implicitRules,
        this.statusReason,
        this.reasonCode,
        this.restriction,
        this.id,
        this.focus,
        this.insurance,
        this.contained,
        this.basedOn,
        this.requester,
        this.instantiatesCanonical,
        this.executionPeriod,
        this.output,
        this.authoredOn,
        this.reasonReference,
        this.status,
        this.groupIdentifier,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Task#performerType() performerType} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for performerType
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTask withPerformerType(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.performerType == value) return this;
    return new ImmutableTask(
        this.lastModified,
        this.modifierExtension,
        this.instantiatesUri,
        this.code,
        this.note,
        this.priority,
        this.owner,
        this.meta,
        this.resourceType,
        this.location,
        this.businessStatus,
        this.text,
        this.extension,
        this.encounter,
        this.identifier,
        this.intent,
        this.description,
        this.language,
        this.partOf,
        this.relevantHistory,
        this.input,
        this._for,
        this.implicitRules,
        this.statusReason,
        this.reasonCode,
        this.restriction,
        this.id,
        this.focus,
        this.insurance,
        this.contained,
        this.basedOn,
        this.requester,
        this.instantiatesCanonical,
        this.executionPeriod,
        this.output,
        this.authoredOn,
        this.reasonReference,
        this.status,
        this.groupIdentifier,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableTask} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableTask
        && equalTo((ImmutableTask) another);
  }

  private boolean equalTo(ImmutableTask another) {
    return Objects.equals(lastModified, another.lastModified)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(instantiatesUri, another.instantiatesUri)
        && Objects.equals(code, another.code)
        && Objects.equals(note, another.note)
        && Objects.equals(priority, another.priority)
        && Objects.equals(owner, another.owner)
        && Objects.equals(meta, another.meta)
        && resourceType.equals(another.resourceType)
        && Objects.equals(location, another.location)
        && Objects.equals(businessStatus, another.businessStatus)
        && Objects.equals(text, another.text)
        && Objects.equals(extension, another.extension)
        && Objects.equals(encounter, another.encounter)
        && Objects.equals(identifier, another.identifier)
        && Objects.equals(intent, another.intent)
        && Objects.equals(description, another.description)
        && Objects.equals(language, another.language)
        && Objects.equals(partOf, another.partOf)
        && Objects.equals(relevantHistory, another.relevantHistory)
        && Objects.equals(input, another.input)
        && Objects.equals(_for, another._for)
        && Objects.equals(implicitRules, another.implicitRules)
        && Objects.equals(statusReason, another.statusReason)
        && Objects.equals(reasonCode, another.reasonCode)
        && Objects.equals(restriction, another.restriction)
        && Objects.equals(id, another.id)
        && Objects.equals(focus, another.focus)
        && Objects.equals(insurance, another.insurance)
        && Objects.equals(contained, another.contained)
        && Objects.equals(basedOn, another.basedOn)
        && Objects.equals(requester, another.requester)
        && Objects.equals(instantiatesCanonical, another.instantiatesCanonical)
        && Objects.equals(executionPeriod, another.executionPeriod)
        && Objects.equals(output, another.output)
        && Objects.equals(authoredOn, another.authoredOn)
        && Objects.equals(reasonReference, another.reasonReference)
        && Objects.equals(status, another.status)
        && Objects.equals(groupIdentifier, another.groupIdentifier)
        && Objects.equals(performerType, another.performerType);
  }

  /**
   * Computes a hash code from attributes: {@code lastModified}, {@code modifierExtension}, {@code instantiatesUri}, {@code code}, {@code note}, {@code priority}, {@code owner}, {@code meta}, {@code resourceType}, {@code location}, {@code businessStatus}, {@code text}, {@code extension}, {@code encounter}, {@code identifier}, {@code intent}, {@code description}, {@code language}, {@code partOf}, {@code relevantHistory}, {@code input}, {@code _for}, {@code implicitRules}, {@code statusReason}, {@code reasonCode}, {@code restriction}, {@code id}, {@code focus}, {@code insurance}, {@code contained}, {@code basedOn}, {@code requester}, {@code instantiatesCanonical}, {@code executionPeriod}, {@code output}, {@code authoredOn}, {@code reasonReference}, {@code status}, {@code groupIdentifier}, {@code performerType}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(lastModified);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(instantiatesUri);
    h += (h << 5) + Objects.hashCode(code);
    h += (h << 5) + Objects.hashCode(note);
    h += (h << 5) + Objects.hashCode(priority);
    h += (h << 5) + Objects.hashCode(owner);
    h += (h << 5) + Objects.hashCode(meta);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + Objects.hashCode(location);
    h += (h << 5) + Objects.hashCode(businessStatus);
    h += (h << 5) + Objects.hashCode(text);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(encounter);
    h += (h << 5) + Objects.hashCode(identifier);
    h += (h << 5) + Objects.hashCode(intent);
    h += (h << 5) + Objects.hashCode(description);
    h += (h << 5) + Objects.hashCode(language);
    h += (h << 5) + Objects.hashCode(partOf);
    h += (h << 5) + Objects.hashCode(relevantHistory);
    h += (h << 5) + Objects.hashCode(input);
    h += (h << 5) + Objects.hashCode(_for);
    h += (h << 5) + Objects.hashCode(implicitRules);
    h += (h << 5) + Objects.hashCode(statusReason);
    h += (h << 5) + Objects.hashCode(reasonCode);
    h += (h << 5) + Objects.hashCode(restriction);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(focus);
    h += (h << 5) + Objects.hashCode(insurance);
    h += (h << 5) + Objects.hashCode(contained);
    h += (h << 5) + Objects.hashCode(basedOn);
    h += (h << 5) + Objects.hashCode(requester);
    h += (h << 5) + Objects.hashCode(instantiatesCanonical);
    h += (h << 5) + Objects.hashCode(executionPeriod);
    h += (h << 5) + Objects.hashCode(output);
    h += (h << 5) + Objects.hashCode(authoredOn);
    h += (h << 5) + Objects.hashCode(reasonReference);
    h += (h << 5) + Objects.hashCode(status);
    h += (h << 5) + Objects.hashCode(groupIdentifier);
    h += (h << 5) + Objects.hashCode(performerType);
    return h;
  }

  /**
   * Prints the immutable value {@code Task} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Task{");
    if (lastModified != null) {
      builder.append("lastModified=").append(lastModified);
    }
    if (modifierExtension != null) {
      if (builder.length() > 5) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (instantiatesUri != null) {
      if (builder.length() > 5) builder.append(", ");
      builder.append("instantiatesUri=").append(instantiatesUri);
    }
    if (code != null) {
      if (builder.length() > 5) builder.append(", ");
      builder.append("code=").append(code);
    }
    if (note != null) {
      if (builder.length() > 5) builder.append(", ");
      builder.append("note=").append(note);
    }
    if (priority != null) {
      if (builder.length() > 5) builder.append(", ");
      builder.append("priority=").append(priority);
    }
    if (owner != null) {
      if (builder.length() > 5) builder.append(", ");
      builder.append("owner=").append(owner);
    }
    if (meta != null) {
      if (builder.length() > 5) builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (builder.length() > 5) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (location != null) {
      builder.append(", ");
      builder.append("location=").append(location);
    }
    if (businessStatus != null) {
      builder.append(", ");
      builder.append("businessStatus=").append(businessStatus);
    }
    if (text != null) {
      builder.append(", ");
      builder.append("text=").append(text);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (encounter != null) {
      builder.append(", ");
      builder.append("encounter=").append(encounter);
    }
    if (identifier != null) {
      builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (intent != null) {
      builder.append(", ");
      builder.append("intent=").append(intent);
    }
    if (description != null) {
      builder.append(", ");
      builder.append("description=").append(description);
    }
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (partOf != null) {
      builder.append(", ");
      builder.append("partOf=").append(partOf);
    }
    if (relevantHistory != null) {
      builder.append(", ");
      builder.append("relevantHistory=").append(relevantHistory);
    }
    if (input != null) {
      builder.append(", ");
      builder.append("input=").append(input);
    }
    if (_for != null) {
      builder.append(", ");
      builder.append("_for=").append(_for);
    }
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (statusReason != null) {
      builder.append(", ");
      builder.append("statusReason=").append(statusReason);
    }
    if (reasonCode != null) {
      builder.append(", ");
      builder.append("reasonCode=").append(reasonCode);
    }
    if (restriction != null) {
      builder.append(", ");
      builder.append("restriction=").append(restriction);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (focus != null) {
      builder.append(", ");
      builder.append("focus=").append(focus);
    }
    if (insurance != null) {
      builder.append(", ");
      builder.append("insurance=").append(insurance);
    }
    if (contained != null) {
      builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (basedOn != null) {
      builder.append(", ");
      builder.append("basedOn=").append(basedOn);
    }
    if (requester != null) {
      builder.append(", ");
      builder.append("requester=").append(requester);
    }
    if (instantiatesCanonical != null) {
      builder.append(", ");
      builder.append("instantiatesCanonical=").append(instantiatesCanonical);
    }
    if (executionPeriod != null) {
      builder.append(", ");
      builder.append("executionPeriod=").append(executionPeriod);
    }
    if (output != null) {
      builder.append(", ");
      builder.append("output=").append(output);
    }
    if (authoredOn != null) {
      builder.append(", ");
      builder.append("authoredOn=").append(authoredOn);
    }
    if (reasonReference != null) {
      builder.append(", ");
      builder.append("reasonReference=").append(reasonReference);
    }
    if (status != null) {
      builder.append(", ");
      builder.append("status=").append(status);
    }
    if (groupIdentifier != null) {
      builder.append(", ");
      builder.append("groupIdentifier=").append(groupIdentifier);
    }
    if (performerType != null) {
      builder.append(", ");
      builder.append("performerType=").append(performerType);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "Task", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Task {
    @Nullable Optional<DateTime> lastModified = Optional.empty();
    boolean lastModifiedIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<Uri> instantiatesUri = Optional.empty();
    boolean instantiatesUriIsSet;
    @Nullable Optional<CodeableConcept> code = Optional.empty();
    boolean codeIsSet;
    @Nullable Optional<List<Annotation>> note = Optional.empty();
    boolean noteIsSet;
    @Nullable Optional<Code> priority = Optional.empty();
    boolean priorityIsSet;
    @Nullable Optional<Reference> owner = Optional.empty();
    boolean ownerIsSet;
    @Nullable Optional<Meta> meta = Optional.empty();
    boolean metaIsSet;
    @Nullable String resourceType;
    @Nullable Optional<Reference> location = Optional.empty();
    boolean locationIsSet;
    @Nullable Optional<CodeableConcept> businessStatus = Optional.empty();
    boolean businessStatusIsSet;
    @Nullable Optional<Narrative> text = Optional.empty();
    boolean textIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<Reference> encounter = Optional.empty();
    boolean encounterIsSet;
    @Nullable Optional<List<Identifier>> identifier = Optional.empty();
    boolean identifierIsSet;
    @Nullable Optional<TaskIntent> intent = Optional.empty();
    boolean intentIsSet;
    @Nullable Optional<String> description = Optional.empty();
    boolean descriptionIsSet;
    @Nullable Optional<Code> language = Optional.empty();
    boolean languageIsSet;
    @Nullable Optional<List<Reference>> partOf = Optional.empty();
    boolean partOfIsSet;
    @Nullable Optional<List<Reference>> relevantHistory = Optional.empty();
    boolean relevantHistoryIsSet;
    @Nullable Optional<List<Task_Input>> input = Optional.empty();
    boolean inputIsSet;
    @Nullable Optional<Reference> _for = Optional.empty();
    boolean _forIsSet;
    @Nullable Optional<Uri> implicitRules = Optional.empty();
    boolean implicitRulesIsSet;
    @Nullable Optional<CodeableConcept> statusReason = Optional.empty();
    boolean statusReasonIsSet;
    @Nullable Optional<CodeableConcept> reasonCode = Optional.empty();
    boolean reasonCodeIsSet;
    @Nullable Optional<Task_Restriction> restriction = Optional.empty();
    boolean restrictionIsSet;
    @Nullable Optional<Id> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<Reference> focus = Optional.empty();
    boolean focusIsSet;
    @Nullable Optional<List<Reference>> insurance = Optional.empty();
    boolean insuranceIsSet;
    @Nullable Optional<List<ResourceList>> contained = Optional.empty();
    boolean containedIsSet;
    @Nullable Optional<List<Reference>> basedOn = Optional.empty();
    boolean basedOnIsSet;
    @Nullable Optional<Reference> requester = Optional.empty();
    boolean requesterIsSet;
    @Nullable Optional<Canonical> instantiatesCanonical = Optional.empty();
    boolean instantiatesCanonicalIsSet;
    @Nullable Optional<Period> executionPeriod = Optional.empty();
    boolean executionPeriodIsSet;
    @Nullable Optional<List<Task_Output>> output = Optional.empty();
    boolean outputIsSet;
    @Nullable Optional<DateTime> authoredOn = Optional.empty();
    boolean authoredOnIsSet;
    @Nullable Optional<Reference> reasonReference = Optional.empty();
    boolean reasonReferenceIsSet;
    @Nullable Optional<TaskStatus> status = Optional.empty();
    boolean statusIsSet;
    @Nullable Optional<Identifier> groupIdentifier = Optional.empty();
    boolean groupIdentifierIsSet;
    @Nullable Optional<List<CodeableConcept>> performerType = Optional.empty();
    boolean performerTypeIsSet;
    @JsonProperty("lastModified")
    public void setLastModified(Optional<DateTime> lastModified) {
      this.lastModified = lastModified;
      this.lastModifiedIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("instantiatesUri")
    public void setInstantiatesUri(Optional<Uri> instantiatesUri) {
      this.instantiatesUri = instantiatesUri;
      this.instantiatesUriIsSet = true;
    }
    @JsonProperty("code")
    public void setCode(Optional<CodeableConcept> code) {
      this.code = code;
      this.codeIsSet = true;
    }
    @JsonProperty("note")
    public void setNote(Optional<List<Annotation>> note) {
      this.note = note;
      this.noteIsSet = true;
    }
    @JsonProperty("priority")
    public void setPriority(Optional<Code> priority) {
      this.priority = priority;
      this.priorityIsSet = true;
    }
    @JsonProperty("owner")
    public void setOwner(Optional<Reference> owner) {
      this.owner = owner;
      this.ownerIsSet = true;
    }
    @JsonProperty("meta")
    public void setMeta(Optional<Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
      this.resourceType = resourceType;
    }
    @JsonProperty("location")
    public void setLocation(Optional<Reference> location) {
      this.location = location;
      this.locationIsSet = true;
    }
    @JsonProperty("businessStatus")
    public void setBusinessStatus(Optional<CodeableConcept> businessStatus) {
      this.businessStatus = businessStatus;
      this.businessStatusIsSet = true;
    }
    @JsonProperty("text")
    public void setText(Optional<Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("encounter")
    public void setEncounter(Optional<Reference> encounter) {
      this.encounter = encounter;
      this.encounterIsSet = true;
    }
    @JsonProperty("identifier")
    public void setIdentifier(Optional<List<Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @JsonProperty("intent")
    public void setIntent(Optional<TaskIntent> intent) {
      this.intent = intent;
      this.intentIsSet = true;
    }
    @JsonProperty("description")
    public void setDescription(Optional<String> description) {
      this.description = description;
      this.descriptionIsSet = true;
    }
    @JsonProperty("language")
    public void setLanguage(Optional<Code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @JsonProperty("partOf")
    public void setPartOf(Optional<List<Reference>> partOf) {
      this.partOf = partOf;
      this.partOfIsSet = true;
    }
    @JsonProperty("relevantHistory")
    public void setRelevantHistory(Optional<List<Reference>> relevantHistory) {
      this.relevantHistory = relevantHistory;
      this.relevantHistoryIsSet = true;
    }
    @JsonProperty("input")
    public void setInput(Optional<List<Task_Input>> input) {
      this.input = input;
      this.inputIsSet = true;
    }
    @JsonProperty("for")
    public void set_for(Optional<Reference> _for) {
      this._for = _for;
      this._forIsSet = true;
    }
    @JsonProperty("implicitRules")
    public void setImplicitRules(Optional<Uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @JsonProperty("statusReason")
    public void setStatusReason(Optional<CodeableConcept> statusReason) {
      this.statusReason = statusReason;
      this.statusReasonIsSet = true;
    }
    @JsonProperty("reasonCode")
    public void setReasonCode(Optional<CodeableConcept> reasonCode) {
      this.reasonCode = reasonCode;
      this.reasonCodeIsSet = true;
    }
    @JsonProperty("restriction")
    public void setRestriction(Optional<Task_Restriction> restriction) {
      this.restriction = restriction;
      this.restrictionIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<Id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("focus")
    public void setFocus(Optional<Reference> focus) {
      this.focus = focus;
      this.focusIsSet = true;
    }
    @JsonProperty("insurance")
    public void setInsurance(Optional<List<Reference>> insurance) {
      this.insurance = insurance;
      this.insuranceIsSet = true;
    }
    @JsonProperty("contained")
    public void setContained(Optional<List<ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @JsonProperty("basedOn")
    public void setBasedOn(Optional<List<Reference>> basedOn) {
      this.basedOn = basedOn;
      this.basedOnIsSet = true;
    }
    @JsonProperty("requester")
    public void setRequester(Optional<Reference> requester) {
      this.requester = requester;
      this.requesterIsSet = true;
    }
    @JsonProperty("instantiatesCanonical")
    public void setInstantiatesCanonical(Optional<Canonical> instantiatesCanonical) {
      this.instantiatesCanonical = instantiatesCanonical;
      this.instantiatesCanonicalIsSet = true;
    }
    @JsonProperty("executionPeriod")
    public void setExecutionPeriod(Optional<Period> executionPeriod) {
      this.executionPeriod = executionPeriod;
      this.executionPeriodIsSet = true;
    }
    @JsonProperty("output")
    public void setOutput(Optional<List<Task_Output>> output) {
      this.output = output;
      this.outputIsSet = true;
    }
    @JsonProperty("authoredOn")
    public void setAuthoredOn(Optional<DateTime> authoredOn) {
      this.authoredOn = authoredOn;
      this.authoredOnIsSet = true;
    }
    @JsonProperty("reasonReference")
    public void setReasonReference(Optional<Reference> reasonReference) {
      this.reasonReference = reasonReference;
      this.reasonReferenceIsSet = true;
    }
    @JsonProperty("status")
    public void setStatus(Optional<TaskStatus> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @JsonProperty("groupIdentifier")
    public void setGroupIdentifier(Optional<Identifier> groupIdentifier) {
      this.groupIdentifier = groupIdentifier;
      this.groupIdentifierIsSet = true;
    }
    @JsonProperty("performerType")
    public void setPerformerType(Optional<List<CodeableConcept>> performerType) {
      this.performerType = performerType;
      this.performerTypeIsSet = true;
    }
    @Override
    public Optional<DateTime> lastModified() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> instantiatesUri() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> code() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Annotation>> note() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> priority() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> owner() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> location() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> businessStatus() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> encounter() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<TaskIntent> intent() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> description() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> language() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> partOf() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> relevantHistory() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Task_Input>> input() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> _for() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> statusReason() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> reasonCode() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Task_Restriction> restriction() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> focus() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> insurance() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> basedOn() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> requester() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Canonical> instantiatesCanonical() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Period> executionPeriod() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Task_Output>> output() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<DateTime> authoredOn() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> reasonReference() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<TaskStatus> status() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Identifier> groupIdentifier() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> performerType() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableTask fromJson(Json json) {
    ImmutableTask.Builder builder = ((ImmutableTask.Builder) ImmutableTask.builder());
    if (json.lastModifiedIsSet) {
      builder.lastModified(json.lastModified);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.instantiatesUriIsSet) {
      builder.instantiatesUri(json.instantiatesUri);
    }
    if (json.codeIsSet) {
      builder.code(json.code);
    }
    if (json.noteIsSet) {
      builder.note(json.note);
    }
    if (json.priorityIsSet) {
      builder.priority(json.priority);
    }
    if (json.ownerIsSet) {
      builder.owner(json.owner);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.locationIsSet) {
      builder.location(json.location);
    }
    if (json.businessStatusIsSet) {
      builder.businessStatus(json.businessStatus);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.encounterIsSet) {
      builder.encounter(json.encounter);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.intentIsSet) {
      builder.intent(json.intent);
    }
    if (json.descriptionIsSet) {
      builder.description(json.description);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.partOfIsSet) {
      builder.partOf(json.partOf);
    }
    if (json.relevantHistoryIsSet) {
      builder.relevantHistory(json.relevantHistory);
    }
    if (json.inputIsSet) {
      builder.input(json.input);
    }
    if (json._forIsSet) {
      builder._for(json._for);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.statusReasonIsSet) {
      builder.statusReason(json.statusReason);
    }
    if (json.reasonCodeIsSet) {
      builder.reasonCode(json.reasonCode);
    }
    if (json.restrictionIsSet) {
      builder.restriction(json.restriction);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.focusIsSet) {
      builder.focus(json.focus);
    }
    if (json.insuranceIsSet) {
      builder.insurance(json.insurance);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.basedOnIsSet) {
      builder.basedOn(json.basedOn);
    }
    if (json.requesterIsSet) {
      builder.requester(json.requester);
    }
    if (json.instantiatesCanonicalIsSet) {
      builder.instantiatesCanonical(json.instantiatesCanonical);
    }
    if (json.executionPeriodIsSet) {
      builder.executionPeriod(json.executionPeriod);
    }
    if (json.outputIsSet) {
      builder.output(json.output);
    }
    if (json.authoredOnIsSet) {
      builder.authoredOn(json.authoredOn);
    }
    if (json.reasonReferenceIsSet) {
      builder.reasonReference(json.reasonReference);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.groupIdentifierIsSet) {
      builder.groupIdentifier(json.groupIdentifier);
    }
    if (json.performerTypeIsSet) {
      builder.performerType(json.performerType);
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
        .lastModified(instance.lastModified())
        .modifierExtension(instance.modifierExtension())
        .instantiatesUri(instance.instantiatesUri())
        .code(instance.code())
        .note(instance.note())
        .priority(instance.priority())
        .owner(instance.owner())
        .meta(instance.meta())
        .resourceType(instance.resourceType())
        .location(instance.location())
        .businessStatus(instance.businessStatus())
        .text(instance.text())
        .extension(instance.extension())
        .encounter(instance.encounter())
        .identifier(instance.identifier())
        .intent(instance.intent())
        .description(instance.description())
        .language(instance.language())
        .partOf(instance.partOf())
        .relevantHistory(instance.relevantHistory())
        .input(instance.input())
        ._for(instance._for())
        .implicitRules(instance.implicitRules())
        .statusReason(instance.statusReason())
        .reasonCode(instance.reasonCode())
        .restriction(instance.restriction())
        .id(instance.id())
        .focus(instance.focus())
        .insurance(instance.insurance())
        .contained(instance.contained())
        .basedOn(instance.basedOn())
        .requester(instance.requester())
        .instantiatesCanonical(instance.instantiatesCanonical())
        .executionPeriod(instance.executionPeriod())
        .output(instance.output())
        .authoredOn(instance.authoredOn())
        .reasonReference(instance.reasonReference())
        .status(instance.status())
        .groupIdentifier(instance.groupIdentifier())
        .performerType(instance.performerType())
        .build();
  }

  /**
   * Creates a builder for {@link Task Task}.
   * <pre>
   * ImmutableTask.builder()
   *    .lastModified(com.fhir.types.fhir.DateTime) // optional {@link Task#lastModified() lastModified}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link Task#modifierExtension() modifierExtension}
   *    .instantiatesUri(com.fhir.types.fhir.Uri) // optional {@link Task#instantiatesUri() instantiatesUri}
   *    .code(com.fhir.types.fhir.CodeableConcept) // optional {@link Task#code() code}
   *    .note(List&amp;lt;com.fhir.types.fhir.Annotation&amp;gt;) // optional {@link Task#note() note}
   *    .priority(com.fhir.types.fhir.Code) // optional {@link Task#priority() priority}
   *    .owner(com.fhir.types.fhir.Reference) // optional {@link Task#owner() owner}
   *    .meta(com.fhir.types.fhir.Meta) // optional {@link Task#meta() meta}
   *    .resourceType(String) // required {@link Task#resourceType() resourceType}
   *    .location(com.fhir.types.fhir.Reference) // optional {@link Task#location() location}
   *    .businessStatus(com.fhir.types.fhir.CodeableConcept) // optional {@link Task#businessStatus() businessStatus}
   *    .text(com.fhir.types.fhir.Narrative) // optional {@link Task#text() text}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link Task#extension() extension}
   *    .encounter(com.fhir.types.fhir.Reference) // optional {@link Task#encounter() encounter}
   *    .identifier(List&amp;lt;com.fhir.types.fhir.Identifier&amp;gt;) // optional {@link Task#identifier() identifier}
   *    .intent(com.fhir.types.fhir.TaskIntent) // optional {@link Task#intent() intent}
   *    .description(String) // optional {@link Task#description() description}
   *    .language(com.fhir.types.fhir.Code) // optional {@link Task#language() language}
   *    .partOf(List&amp;lt;com.fhir.types.fhir.Reference&amp;gt;) // optional {@link Task#partOf() partOf}
   *    .relevantHistory(List&amp;lt;com.fhir.types.fhir.Reference&amp;gt;) // optional {@link Task#relevantHistory() relevantHistory}
   *    .input(List&amp;lt;com.fhir.types.fhir.Task_Input&amp;gt;) // optional {@link Task#input() input}
   *    ._for(com.fhir.types.fhir.Reference) // optional {@link Task#_for() _for}
   *    .implicitRules(com.fhir.types.fhir.Uri) // optional {@link Task#implicitRules() implicitRules}
   *    .statusReason(com.fhir.types.fhir.CodeableConcept) // optional {@link Task#statusReason() statusReason}
   *    .reasonCode(com.fhir.types.fhir.CodeableConcept) // optional {@link Task#reasonCode() reasonCode}
   *    .restriction(com.fhir.types.fhir.Task_Restriction) // optional {@link Task#restriction() restriction}
   *    .id(com.fhir.types.fhir.Id) // optional {@link Task#id() id}
   *    .focus(com.fhir.types.fhir.Reference) // optional {@link Task#focus() focus}
   *    .insurance(List&amp;lt;com.fhir.types.fhir.Reference&amp;gt;) // optional {@link Task#insurance() insurance}
   *    .contained(List&amp;lt;com.fhir.types.fhir.ResourceList&amp;gt;) // optional {@link Task#contained() contained}
   *    .basedOn(List&amp;lt;com.fhir.types.fhir.Reference&amp;gt;) // optional {@link Task#basedOn() basedOn}
   *    .requester(com.fhir.types.fhir.Reference) // optional {@link Task#requester() requester}
   *    .instantiatesCanonical(com.fhir.types.fhir.Canonical) // optional {@link Task#instantiatesCanonical() instantiatesCanonical}
   *    .executionPeriod(com.fhir.types.fhir.Period) // optional {@link Task#executionPeriod() executionPeriod}
   *    .output(List&amp;lt;com.fhir.types.fhir.Task_Output&amp;gt;) // optional {@link Task#output() output}
   *    .authoredOn(com.fhir.types.fhir.DateTime) // optional {@link Task#authoredOn() authoredOn}
   *    .reasonReference(com.fhir.types.fhir.Reference) // optional {@link Task#reasonReference() reasonReference}
   *    .status(com.fhir.types.fhir.TaskStatus) // optional {@link Task#status() status}
   *    .groupIdentifier(com.fhir.types.fhir.Identifier) // optional {@link Task#groupIdentifier() groupIdentifier}
   *    .performerType(List&amp;lt;com.fhir.types.fhir.CodeableConcept&amp;gt;) // optional {@link Task#performerType() performerType}
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
  @Generated(from = "Task", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long OPT_BIT_LAST_MODIFIED = 0x1L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x2L;
    private static final long OPT_BIT_INSTANTIATES_URI = 0x4L;
    private static final long OPT_BIT_CODE = 0x8L;
    private static final long OPT_BIT_NOTE = 0x10L;
    private static final long OPT_BIT_PRIORITY = 0x20L;
    private static final long OPT_BIT_OWNER = 0x40L;
    private static final long OPT_BIT_META = 0x80L;
    private static final long OPT_BIT_LOCATION = 0x100L;
    private static final long OPT_BIT_BUSINESS_STATUS = 0x200L;
    private static final long OPT_BIT_TEXT = 0x400L;
    private static final long OPT_BIT_EXTENSION = 0x800L;
    private static final long OPT_BIT_ENCOUNTER = 0x1000L;
    private static final long OPT_BIT_IDENTIFIER = 0x2000L;
    private static final long OPT_BIT_INTENT = 0x4000L;
    private static final long OPT_BIT_DESCRIPTION = 0x8000L;
    private static final long OPT_BIT_LANGUAGE = 0x10000L;
    private static final long OPT_BIT_PART_OF = 0x20000L;
    private static final long OPT_BIT_RELEVANT_HISTORY = 0x40000L;
    private static final long OPT_BIT_INPUT = 0x80000L;
    private static final long OPT_BIT__FOR = 0x100000L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x200000L;
    private static final long OPT_BIT_STATUS_REASON = 0x400000L;
    private static final long OPT_BIT_REASON_CODE = 0x800000L;
    private static final long OPT_BIT_RESTRICTION = 0x1000000L;
    private static final long OPT_BIT_ID = 0x2000000L;
    private static final long OPT_BIT_FOCUS = 0x4000000L;
    private static final long OPT_BIT_INSURANCE = 0x8000000L;
    private static final long OPT_BIT_CONTAINED = 0x10000000L;
    private static final long OPT_BIT_BASED_ON = 0x20000000L;
    private static final long OPT_BIT_REQUESTER = 0x40000000L;
    private static final long OPT_BIT_INSTANTIATES_CANONICAL = 0x80000000L;
    private static final long OPT_BIT_EXECUTION_PERIOD = 0x100000000L;
    private static final long OPT_BIT_OUTPUT = 0x200000000L;
    private static final long OPT_BIT_AUTHORED_ON = 0x400000000L;
    private static final long OPT_BIT_REASON_REFERENCE = 0x800000000L;
    private static final long OPT_BIT_STATUS = 0x1000000000L;
    private static final long OPT_BIT_GROUP_IDENTIFIER = 0x2000000000L;
    private static final long OPT_BIT_PERFORMER_TYPE = 0x4000000000L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable DateTime lastModified;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable Uri instantiatesUri;
    private @Nullable CodeableConcept code;
    private @Nullable List<Annotation> note;
    private @Nullable Code priority;
    private @Nullable Reference owner;
    private @Nullable Meta meta;
    private @Nullable String resourceType;
    private @Nullable Reference location;
    private @Nullable CodeableConcept businessStatus;
    private @Nullable Narrative text;
    private @Nullable List<Extension> extension;
    private @Nullable Reference encounter;
    private @Nullable List<Identifier> identifier;
    private @Nullable TaskIntent intent;
    private @Nullable String description;
    private @Nullable Code language;
    private @Nullable List<Reference> partOf;
    private @Nullable List<Reference> relevantHistory;
    private @Nullable List<Task_Input> input;
    private @Nullable Reference _for;
    private @Nullable Uri implicitRules;
    private @Nullable CodeableConcept statusReason;
    private @Nullable CodeableConcept reasonCode;
    private @Nullable Task_Restriction restriction;
    private @Nullable Id id;
    private @Nullable Reference focus;
    private @Nullable List<Reference> insurance;
    private @Nullable List<ResourceList> contained;
    private @Nullable List<Reference> basedOn;
    private @Nullable Reference requester;
    private @Nullable Canonical instantiatesCanonical;
    private @Nullable Period executionPeriod;
    private @Nullable List<Task_Output> output;
    private @Nullable DateTime authoredOn;
    private @Nullable Reference reasonReference;
    private @Nullable TaskStatus status;
    private @Nullable Identifier groupIdentifier;
    private @Nullable List<CodeableConcept> performerType;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Task#lastModified() lastModified} to lastModified.
     * @param lastModified The value for lastModified
     * @return {@code this} builder for chained invocation
     */
    public final Builder lastModified(DateTime lastModified) {
      checkNotIsSet(lastModifiedIsSet(), "lastModified");
      this.lastModified = Objects.requireNonNull(lastModified, "lastModified");
      optBits |= OPT_BIT_LAST_MODIFIED;
      return this;
    }

    /**
     * Initializes the optional value {@link Task#lastModified() lastModified} to lastModified.
     * @param lastModified The value for lastModified
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("lastModified")
    public final Builder lastModified(Optional<? extends DateTime> lastModified) {
      checkNotIsSet(lastModifiedIsSet(), "lastModified");
      this.lastModified = lastModified.orElse(null);
      optBits |= OPT_BIT_LAST_MODIFIED;
      return this;
    }

    /**
     * Initializes the optional value {@link Task#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Task#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Task#instantiatesUri() instantiatesUri} to instantiatesUri.
     * @param instantiatesUri The value for instantiatesUri
     * @return {@code this} builder for chained invocation
     */
    public final Builder instantiatesUri(Uri instantiatesUri) {
      checkNotIsSet(instantiatesUriIsSet(), "instantiatesUri");
      this.instantiatesUri = Objects.requireNonNull(instantiatesUri, "instantiatesUri");
      optBits |= OPT_BIT_INSTANTIATES_URI;
      return this;
    }

    /**
     * Initializes the optional value {@link Task#instantiatesUri() instantiatesUri} to instantiatesUri.
     * @param instantiatesUri The value for instantiatesUri
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("instantiatesUri")
    public final Builder instantiatesUri(Optional<? extends Uri> instantiatesUri) {
      checkNotIsSet(instantiatesUriIsSet(), "instantiatesUri");
      this.instantiatesUri = instantiatesUri.orElse(null);
      optBits |= OPT_BIT_INSTANTIATES_URI;
      return this;
    }

    /**
     * Initializes the optional value {@link Task#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for chained invocation
     */
    public final Builder code(CodeableConcept code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = Objects.requireNonNull(code, "code");
      optBits |= OPT_BIT_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link Task#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("code")
    public final Builder code(Optional<? extends CodeableConcept> code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = code.orElse(null);
      optBits |= OPT_BIT_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link Task#note() note} to note.
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
     * Initializes the optional value {@link Task#note() note} to note.
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
     * Initializes the optional value {@link Task#priority() priority} to priority.
     * @param priority The value for priority
     * @return {@code this} builder for chained invocation
     */
    public final Builder priority(Code priority) {
      checkNotIsSet(priorityIsSet(), "priority");
      this.priority = Objects.requireNonNull(priority, "priority");
      optBits |= OPT_BIT_PRIORITY;
      return this;
    }

    /**
     * Initializes the optional value {@link Task#priority() priority} to priority.
     * @param priority The value for priority
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("priority")
    public final Builder priority(Optional<? extends Code> priority) {
      checkNotIsSet(priorityIsSet(), "priority");
      this.priority = priority.orElse(null);
      optBits |= OPT_BIT_PRIORITY;
      return this;
    }

    /**
     * Initializes the optional value {@link Task#owner() owner} to owner.
     * @param owner The value for owner
     * @return {@code this} builder for chained invocation
     */
    public final Builder owner(Reference owner) {
      checkNotIsSet(ownerIsSet(), "owner");
      this.owner = Objects.requireNonNull(owner, "owner");
      optBits |= OPT_BIT_OWNER;
      return this;
    }

    /**
     * Initializes the optional value {@link Task#owner() owner} to owner.
     * @param owner The value for owner
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("owner")
    public final Builder owner(Optional<? extends Reference> owner) {
      checkNotIsSet(ownerIsSet(), "owner");
      this.owner = owner.orElse(null);
      optBits |= OPT_BIT_OWNER;
      return this;
    }

    /**
     * Initializes the optional value {@link Task#meta() meta} to meta.
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
     * Initializes the optional value {@link Task#meta() meta} to meta.
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
     * Initializes the value for the {@link Task#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link Task#location() location} to location.
     * @param location The value for location
     * @return {@code this} builder for chained invocation
     */
    public final Builder location(Reference location) {
      checkNotIsSet(locationIsSet(), "location");
      this.location = Objects.requireNonNull(location, "location");
      optBits |= OPT_BIT_LOCATION;
      return this;
    }

    /**
     * Initializes the optional value {@link Task#location() location} to location.
     * @param location The value for location
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("location")
    public final Builder location(Optional<? extends Reference> location) {
      checkNotIsSet(locationIsSet(), "location");
      this.location = location.orElse(null);
      optBits |= OPT_BIT_LOCATION;
      return this;
    }

    /**
     * Initializes the optional value {@link Task#businessStatus() businessStatus} to businessStatus.
     * @param businessStatus The value for businessStatus
     * @return {@code this} builder for chained invocation
     */
    public final Builder businessStatus(CodeableConcept businessStatus) {
      checkNotIsSet(businessStatusIsSet(), "businessStatus");
      this.businessStatus = Objects.requireNonNull(businessStatus, "businessStatus");
      optBits |= OPT_BIT_BUSINESS_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link Task#businessStatus() businessStatus} to businessStatus.
     * @param businessStatus The value for businessStatus
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("businessStatus")
    public final Builder businessStatus(Optional<? extends CodeableConcept> businessStatus) {
      checkNotIsSet(businessStatusIsSet(), "businessStatus");
      this.businessStatus = businessStatus.orElse(null);
      optBits |= OPT_BIT_BUSINESS_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link Task#text() text} to text.
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
     * Initializes the optional value {@link Task#text() text} to text.
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
     * Initializes the optional value {@link Task#extension() extension} to extension.
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
     * Initializes the optional value {@link Task#extension() extension} to extension.
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
     * Initializes the optional value {@link Task#encounter() encounter} to encounter.
     * @param encounter The value for encounter
     * @return {@code this} builder for chained invocation
     */
    public final Builder encounter(Reference encounter) {
      checkNotIsSet(encounterIsSet(), "encounter");
      this.encounter = Objects.requireNonNull(encounter, "encounter");
      optBits |= OPT_BIT_ENCOUNTER;
      return this;
    }

    /**
     * Initializes the optional value {@link Task#encounter() encounter} to encounter.
     * @param encounter The value for encounter
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("encounter")
    public final Builder encounter(Optional<? extends Reference> encounter) {
      checkNotIsSet(encounterIsSet(), "encounter");
      this.encounter = encounter.orElse(null);
      optBits |= OPT_BIT_ENCOUNTER;
      return this;
    }

    /**
     * Initializes the optional value {@link Task#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link Task#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link Task#intent() intent} to intent.
     * @param intent The value for intent
     * @return {@code this} builder for chained invocation
     */
    public final Builder intent(TaskIntent intent) {
      checkNotIsSet(intentIsSet(), "intent");
      this.intent = Objects.requireNonNull(intent, "intent");
      optBits |= OPT_BIT_INTENT;
      return this;
    }

    /**
     * Initializes the optional value {@link Task#intent() intent} to intent.
     * @param intent The value for intent
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("intent")
    public final Builder intent(Optional<? extends TaskIntent> intent) {
      checkNotIsSet(intentIsSet(), "intent");
      this.intent = intent.orElse(null);
      optBits |= OPT_BIT_INTENT;
      return this;
    }

    /**
     * Initializes the optional value {@link Task#description() description} to description.
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
     * Initializes the optional value {@link Task#description() description} to description.
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
     * Initializes the optional value {@link Task#language() language} to language.
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
     * Initializes the optional value {@link Task#language() language} to language.
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
     * Initializes the optional value {@link Task#partOf() partOf} to partOf.
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
     * Initializes the optional value {@link Task#partOf() partOf} to partOf.
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
     * Initializes the optional value {@link Task#relevantHistory() relevantHistory} to relevantHistory.
     * @param relevantHistory The value for relevantHistory
     * @return {@code this} builder for chained invocation
     */
    public final Builder relevantHistory(List<Reference> relevantHistory) {
      checkNotIsSet(relevantHistoryIsSet(), "relevantHistory");
      this.relevantHistory = Objects.requireNonNull(relevantHistory, "relevantHistory");
      optBits |= OPT_BIT_RELEVANT_HISTORY;
      return this;
    }

    /**
     * Initializes the optional value {@link Task#relevantHistory() relevantHistory} to relevantHistory.
     * @param relevantHistory The value for relevantHistory
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("relevantHistory")
    public final Builder relevantHistory(Optional<? extends List<Reference>> relevantHistory) {
      checkNotIsSet(relevantHistoryIsSet(), "relevantHistory");
      this.relevantHistory = relevantHistory.orElse(null);
      optBits |= OPT_BIT_RELEVANT_HISTORY;
      return this;
    }

    /**
     * Initializes the optional value {@link Task#input() input} to input.
     * @param input The value for input
     * @return {@code this} builder for chained invocation
     */
    public final Builder input(List<Task_Input> input) {
      checkNotIsSet(inputIsSet(), "input");
      this.input = Objects.requireNonNull(input, "input");
      optBits |= OPT_BIT_INPUT;
      return this;
    }

    /**
     * Initializes the optional value {@link Task#input() input} to input.
     * @param input The value for input
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("input")
    public final Builder input(Optional<? extends List<Task_Input>> input) {
      checkNotIsSet(inputIsSet(), "input");
      this.input = input.orElse(null);
      optBits |= OPT_BIT_INPUT;
      return this;
    }

    /**
     * Initializes the optional value {@link Task#_for() _for} to _for.
     * @param _for The value for _for
     * @return {@code this} builder for chained invocation
     */
    public final Builder _for(Reference _for) {
      checkNotIsSet(_forIsSet(), "_for");
      this._for = Objects.requireNonNull(_for, "_for");
      optBits |= OPT_BIT__FOR;
      return this;
    }

    /**
     * Initializes the optional value {@link Task#_for() _for} to _for.
     * @param _for The value for _for
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("for")
    public final Builder _for(Optional<? extends Reference> _for) {
      checkNotIsSet(_forIsSet(), "_for");
      this._for = _for.orElse(null);
      optBits |= OPT_BIT__FOR;
      return this;
    }

    /**
     * Initializes the optional value {@link Task#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link Task#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link Task#statusReason() statusReason} to statusReason.
     * @param statusReason The value for statusReason
     * @return {@code this} builder for chained invocation
     */
    public final Builder statusReason(CodeableConcept statusReason) {
      checkNotIsSet(statusReasonIsSet(), "statusReason");
      this.statusReason = Objects.requireNonNull(statusReason, "statusReason");
      optBits |= OPT_BIT_STATUS_REASON;
      return this;
    }

    /**
     * Initializes the optional value {@link Task#statusReason() statusReason} to statusReason.
     * @param statusReason The value for statusReason
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("statusReason")
    public final Builder statusReason(Optional<? extends CodeableConcept> statusReason) {
      checkNotIsSet(statusReasonIsSet(), "statusReason");
      this.statusReason = statusReason.orElse(null);
      optBits |= OPT_BIT_STATUS_REASON;
      return this;
    }

    /**
     * Initializes the optional value {@link Task#reasonCode() reasonCode} to reasonCode.
     * @param reasonCode The value for reasonCode
     * @return {@code this} builder for chained invocation
     */
    public final Builder reasonCode(CodeableConcept reasonCode) {
      checkNotIsSet(reasonCodeIsSet(), "reasonCode");
      this.reasonCode = Objects.requireNonNull(reasonCode, "reasonCode");
      optBits |= OPT_BIT_REASON_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link Task#reasonCode() reasonCode} to reasonCode.
     * @param reasonCode The value for reasonCode
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("reasonCode")
    public final Builder reasonCode(Optional<? extends CodeableConcept> reasonCode) {
      checkNotIsSet(reasonCodeIsSet(), "reasonCode");
      this.reasonCode = reasonCode.orElse(null);
      optBits |= OPT_BIT_REASON_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link Task#restriction() restriction} to restriction.
     * @param restriction The value for restriction
     * @return {@code this} builder for chained invocation
     */
    public final Builder restriction(Task_Restriction restriction) {
      checkNotIsSet(restrictionIsSet(), "restriction");
      this.restriction = Objects.requireNonNull(restriction, "restriction");
      optBits |= OPT_BIT_RESTRICTION;
      return this;
    }

    /**
     * Initializes the optional value {@link Task#restriction() restriction} to restriction.
     * @param restriction The value for restriction
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("restriction")
    public final Builder restriction(Optional<? extends Task_Restriction> restriction) {
      checkNotIsSet(restrictionIsSet(), "restriction");
      this.restriction = restriction.orElse(null);
      optBits |= OPT_BIT_RESTRICTION;
      return this;
    }

    /**
     * Initializes the optional value {@link Task#id() id} to id.
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
     * Initializes the optional value {@link Task#id() id} to id.
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
     * Initializes the optional value {@link Task#focus() focus} to focus.
     * @param focus The value for focus
     * @return {@code this} builder for chained invocation
     */
    public final Builder focus(Reference focus) {
      checkNotIsSet(focusIsSet(), "focus");
      this.focus = Objects.requireNonNull(focus, "focus");
      optBits |= OPT_BIT_FOCUS;
      return this;
    }

    /**
     * Initializes the optional value {@link Task#focus() focus} to focus.
     * @param focus The value for focus
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("focus")
    public final Builder focus(Optional<? extends Reference> focus) {
      checkNotIsSet(focusIsSet(), "focus");
      this.focus = focus.orElse(null);
      optBits |= OPT_BIT_FOCUS;
      return this;
    }

    /**
     * Initializes the optional value {@link Task#insurance() insurance} to insurance.
     * @param insurance The value for insurance
     * @return {@code this} builder for chained invocation
     */
    public final Builder insurance(List<Reference> insurance) {
      checkNotIsSet(insuranceIsSet(), "insurance");
      this.insurance = Objects.requireNonNull(insurance, "insurance");
      optBits |= OPT_BIT_INSURANCE;
      return this;
    }

    /**
     * Initializes the optional value {@link Task#insurance() insurance} to insurance.
     * @param insurance The value for insurance
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("insurance")
    public final Builder insurance(Optional<? extends List<Reference>> insurance) {
      checkNotIsSet(insuranceIsSet(), "insurance");
      this.insurance = insurance.orElse(null);
      optBits |= OPT_BIT_INSURANCE;
      return this;
    }

    /**
     * Initializes the optional value {@link Task#contained() contained} to contained.
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
     * Initializes the optional value {@link Task#contained() contained} to contained.
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
     * Initializes the optional value {@link Task#basedOn() basedOn} to basedOn.
     * @param basedOn The value for basedOn
     * @return {@code this} builder for chained invocation
     */
    public final Builder basedOn(List<Reference> basedOn) {
      checkNotIsSet(basedOnIsSet(), "basedOn");
      this.basedOn = Objects.requireNonNull(basedOn, "basedOn");
      optBits |= OPT_BIT_BASED_ON;
      return this;
    }

    /**
     * Initializes the optional value {@link Task#basedOn() basedOn} to basedOn.
     * @param basedOn The value for basedOn
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("basedOn")
    public final Builder basedOn(Optional<? extends List<Reference>> basedOn) {
      checkNotIsSet(basedOnIsSet(), "basedOn");
      this.basedOn = basedOn.orElse(null);
      optBits |= OPT_BIT_BASED_ON;
      return this;
    }

    /**
     * Initializes the optional value {@link Task#requester() requester} to requester.
     * @param requester The value for requester
     * @return {@code this} builder for chained invocation
     */
    public final Builder requester(Reference requester) {
      checkNotIsSet(requesterIsSet(), "requester");
      this.requester = Objects.requireNonNull(requester, "requester");
      optBits |= OPT_BIT_REQUESTER;
      return this;
    }

    /**
     * Initializes the optional value {@link Task#requester() requester} to requester.
     * @param requester The value for requester
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("requester")
    public final Builder requester(Optional<? extends Reference> requester) {
      checkNotIsSet(requesterIsSet(), "requester");
      this.requester = requester.orElse(null);
      optBits |= OPT_BIT_REQUESTER;
      return this;
    }

    /**
     * Initializes the optional value {@link Task#instantiatesCanonical() instantiatesCanonical} to instantiatesCanonical.
     * @param instantiatesCanonical The value for instantiatesCanonical
     * @return {@code this} builder for chained invocation
     */
    public final Builder instantiatesCanonical(Canonical instantiatesCanonical) {
      checkNotIsSet(instantiatesCanonicalIsSet(), "instantiatesCanonical");
      this.instantiatesCanonical = Objects.requireNonNull(instantiatesCanonical, "instantiatesCanonical");
      optBits |= OPT_BIT_INSTANTIATES_CANONICAL;
      return this;
    }

    /**
     * Initializes the optional value {@link Task#instantiatesCanonical() instantiatesCanonical} to instantiatesCanonical.
     * @param instantiatesCanonical The value for instantiatesCanonical
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("instantiatesCanonical")
    public final Builder instantiatesCanonical(Optional<? extends Canonical> instantiatesCanonical) {
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
    public final Builder executionPeriod(Period executionPeriod) {
      checkNotIsSet(executionPeriodIsSet(), "executionPeriod");
      this.executionPeriod = Objects.requireNonNull(executionPeriod, "executionPeriod");
      optBits |= OPT_BIT_EXECUTION_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link Task#executionPeriod() executionPeriod} to executionPeriod.
     * @param executionPeriod The value for executionPeriod
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("executionPeriod")
    public final Builder executionPeriod(Optional<? extends Period> executionPeriod) {
      checkNotIsSet(executionPeriodIsSet(), "executionPeriod");
      this.executionPeriod = executionPeriod.orElse(null);
      optBits |= OPT_BIT_EXECUTION_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link Task#output() output} to output.
     * @param output The value for output
     * @return {@code this} builder for chained invocation
     */
    public final Builder output(List<Task_Output> output) {
      checkNotIsSet(outputIsSet(), "output");
      this.output = Objects.requireNonNull(output, "output");
      optBits |= OPT_BIT_OUTPUT;
      return this;
    }

    /**
     * Initializes the optional value {@link Task#output() output} to output.
     * @param output The value for output
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("output")
    public final Builder output(Optional<? extends List<Task_Output>> output) {
      checkNotIsSet(outputIsSet(), "output");
      this.output = output.orElse(null);
      optBits |= OPT_BIT_OUTPUT;
      return this;
    }

    /**
     * Initializes the optional value {@link Task#authoredOn() authoredOn} to authoredOn.
     * @param authoredOn The value for authoredOn
     * @return {@code this} builder for chained invocation
     */
    public final Builder authoredOn(DateTime authoredOn) {
      checkNotIsSet(authoredOnIsSet(), "authoredOn");
      this.authoredOn = Objects.requireNonNull(authoredOn, "authoredOn");
      optBits |= OPT_BIT_AUTHORED_ON;
      return this;
    }

    /**
     * Initializes the optional value {@link Task#authoredOn() authoredOn} to authoredOn.
     * @param authoredOn The value for authoredOn
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("authoredOn")
    public final Builder authoredOn(Optional<? extends DateTime> authoredOn) {
      checkNotIsSet(authoredOnIsSet(), "authoredOn");
      this.authoredOn = authoredOn.orElse(null);
      optBits |= OPT_BIT_AUTHORED_ON;
      return this;
    }

    /**
     * Initializes the optional value {@link Task#reasonReference() reasonReference} to reasonReference.
     * @param reasonReference The value for reasonReference
     * @return {@code this} builder for chained invocation
     */
    public final Builder reasonReference(Reference reasonReference) {
      checkNotIsSet(reasonReferenceIsSet(), "reasonReference");
      this.reasonReference = Objects.requireNonNull(reasonReference, "reasonReference");
      optBits |= OPT_BIT_REASON_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link Task#reasonReference() reasonReference} to reasonReference.
     * @param reasonReference The value for reasonReference
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("reasonReference")
    public final Builder reasonReference(Optional<? extends Reference> reasonReference) {
      checkNotIsSet(reasonReferenceIsSet(), "reasonReference");
      this.reasonReference = reasonReference.orElse(null);
      optBits |= OPT_BIT_REASON_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link Task#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(TaskStatus status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link Task#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("status")
    public final Builder status(Optional<? extends TaskStatus> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link Task#groupIdentifier() groupIdentifier} to groupIdentifier.
     * @param groupIdentifier The value for groupIdentifier
     * @return {@code this} builder for chained invocation
     */
    public final Builder groupIdentifier(Identifier groupIdentifier) {
      checkNotIsSet(groupIdentifierIsSet(), "groupIdentifier");
      this.groupIdentifier = Objects.requireNonNull(groupIdentifier, "groupIdentifier");
      optBits |= OPT_BIT_GROUP_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link Task#groupIdentifier() groupIdentifier} to groupIdentifier.
     * @param groupIdentifier The value for groupIdentifier
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("groupIdentifier")
    public final Builder groupIdentifier(Optional<? extends Identifier> groupIdentifier) {
      checkNotIsSet(groupIdentifierIsSet(), "groupIdentifier");
      this.groupIdentifier = groupIdentifier.orElse(null);
      optBits |= OPT_BIT_GROUP_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link Task#performerType() performerType} to performerType.
     * @param performerType The value for performerType
     * @return {@code this} builder for chained invocation
     */
    public final Builder performerType(List<CodeableConcept> performerType) {
      checkNotIsSet(performerTypeIsSet(), "performerType");
      this.performerType = Objects.requireNonNull(performerType, "performerType");
      optBits |= OPT_BIT_PERFORMER_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Task#performerType() performerType} to performerType.
     * @param performerType The value for performerType
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("performerType")
    public final Builder performerType(Optional<? extends List<CodeableConcept>> performerType) {
      checkNotIsSet(performerTypeIsSet(), "performerType");
      this.performerType = performerType.orElse(null);
      optBits |= OPT_BIT_PERFORMER_TYPE;
      return this;
    }

    /**
     * Builds a new {@link Task Task}.
     * @return An immutable instance of Task
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public Task build() {
      checkRequiredAttributes();
      return new ImmutableTask(
          lastModified,
          modifierExtension,
          instantiatesUri,
          code,
          note,
          priority,
          owner,
          meta,
          resourceType,
          location,
          businessStatus,
          text,
          extension,
          encounter,
          identifier,
          intent,
          description,
          language,
          partOf,
          relevantHistory,
          input,
          _for,
          implicitRules,
          statusReason,
          reasonCode,
          restriction,
          id,
          focus,
          insurance,
          contained,
          basedOn,
          requester,
          instantiatesCanonical,
          executionPeriod,
          output,
          authoredOn,
          reasonReference,
          status,
          groupIdentifier,
          performerType);
    }

    private boolean lastModifiedIsSet() {
      return (optBits & OPT_BIT_LAST_MODIFIED) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean instantiatesUriIsSet() {
      return (optBits & OPT_BIT_INSTANTIATES_URI) != 0;
    }

    private boolean codeIsSet() {
      return (optBits & OPT_BIT_CODE) != 0;
    }

    private boolean noteIsSet() {
      return (optBits & OPT_BIT_NOTE) != 0;
    }

    private boolean priorityIsSet() {
      return (optBits & OPT_BIT_PRIORITY) != 0;
    }

    private boolean ownerIsSet() {
      return (optBits & OPT_BIT_OWNER) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean locationIsSet() {
      return (optBits & OPT_BIT_LOCATION) != 0;
    }

    private boolean businessStatusIsSet() {
      return (optBits & OPT_BIT_BUSINESS_STATUS) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean encounterIsSet() {
      return (optBits & OPT_BIT_ENCOUNTER) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean intentIsSet() {
      return (optBits & OPT_BIT_INTENT) != 0;
    }

    private boolean descriptionIsSet() {
      return (optBits & OPT_BIT_DESCRIPTION) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean partOfIsSet() {
      return (optBits & OPT_BIT_PART_OF) != 0;
    }

    private boolean relevantHistoryIsSet() {
      return (optBits & OPT_BIT_RELEVANT_HISTORY) != 0;
    }

    private boolean inputIsSet() {
      return (optBits & OPT_BIT_INPUT) != 0;
    }

    private boolean _forIsSet() {
      return (optBits & OPT_BIT__FOR) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean statusReasonIsSet() {
      return (optBits & OPT_BIT_STATUS_REASON) != 0;
    }

    private boolean reasonCodeIsSet() {
      return (optBits & OPT_BIT_REASON_CODE) != 0;
    }

    private boolean restrictionIsSet() {
      return (optBits & OPT_BIT_RESTRICTION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean focusIsSet() {
      return (optBits & OPT_BIT_FOCUS) != 0;
    }

    private boolean insuranceIsSet() {
      return (optBits & OPT_BIT_INSURANCE) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean basedOnIsSet() {
      return (optBits & OPT_BIT_BASED_ON) != 0;
    }

    private boolean requesterIsSet() {
      return (optBits & OPT_BIT_REQUESTER) != 0;
    }

    private boolean instantiatesCanonicalIsSet() {
      return (optBits & OPT_BIT_INSTANTIATES_CANONICAL) != 0;
    }

    private boolean executionPeriodIsSet() {
      return (optBits & OPT_BIT_EXECUTION_PERIOD) != 0;
    }

    private boolean outputIsSet() {
      return (optBits & OPT_BIT_OUTPUT) != 0;
    }

    private boolean authoredOnIsSet() {
      return (optBits & OPT_BIT_AUTHORED_ON) != 0;
    }

    private boolean reasonReferenceIsSet() {
      return (optBits & OPT_BIT_REASON_REFERENCE) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean groupIdentifierIsSet() {
      return (optBits & OPT_BIT_GROUP_IDENTIFIER) != 0;
    }

    private boolean performerTypeIsSet() {
      return (optBits & OPT_BIT_PERFORMER_TYPE) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of Task is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build Task, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "Task", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link Task#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(String resourceType);
  }

  @Generated(from = "Task", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link Task#lastModified() lastModified} to lastModified.
     * @param lastModified The value for lastModified
     * @return {@code this} builder for chained invocation
     */
    BuildFinal lastModified(DateTime lastModified);

    /**
     * Initializes the optional value {@link Task#lastModified() lastModified} to lastModified.
     * @param lastModified The value for lastModified
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal lastModified(Optional<? extends DateTime> lastModified);

    /**
     * Initializes the optional value {@link Task#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link Task#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link Task#instantiatesUri() instantiatesUri} to instantiatesUri.
     * @param instantiatesUri The value for instantiatesUri
     * @return {@code this} builder for chained invocation
     */
    BuildFinal instantiatesUri(Uri instantiatesUri);

    /**
     * Initializes the optional value {@link Task#instantiatesUri() instantiatesUri} to instantiatesUri.
     * @param instantiatesUri The value for instantiatesUri
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal instantiatesUri(Optional<? extends Uri> instantiatesUri);

    /**
     * Initializes the optional value {@link Task#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for chained invocation
     */
    BuildFinal code(CodeableConcept code);

    /**
     * Initializes the optional value {@link Task#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal code(Optional<? extends CodeableConcept> code);

    /**
     * Initializes the optional value {@link Task#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for chained invocation
     */
    BuildFinal note(List<Annotation> note);

    /**
     * Initializes the optional value {@link Task#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal note(Optional<? extends List<Annotation>> note);

    /**
     * Initializes the optional value {@link Task#priority() priority} to priority.
     * @param priority The value for priority
     * @return {@code this} builder for chained invocation
     */
    BuildFinal priority(Code priority);

    /**
     * Initializes the optional value {@link Task#priority() priority} to priority.
     * @param priority The value for priority
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal priority(Optional<? extends Code> priority);

    /**
     * Initializes the optional value {@link Task#owner() owner} to owner.
     * @param owner The value for owner
     * @return {@code this} builder for chained invocation
     */
    BuildFinal owner(Reference owner);

    /**
     * Initializes the optional value {@link Task#owner() owner} to owner.
     * @param owner The value for owner
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal owner(Optional<? extends Reference> owner);

    /**
     * Initializes the optional value {@link Task#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(Meta meta);

    /**
     * Initializes the optional value {@link Task#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(Optional<? extends Meta> meta);

    /**
     * Initializes the optional value {@link Task#location() location} to location.
     * @param location The value for location
     * @return {@code this} builder for chained invocation
     */
    BuildFinal location(Reference location);

    /**
     * Initializes the optional value {@link Task#location() location} to location.
     * @param location The value for location
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal location(Optional<? extends Reference> location);

    /**
     * Initializes the optional value {@link Task#businessStatus() businessStatus} to businessStatus.
     * @param businessStatus The value for businessStatus
     * @return {@code this} builder for chained invocation
     */
    BuildFinal businessStatus(CodeableConcept businessStatus);

    /**
     * Initializes the optional value {@link Task#businessStatus() businessStatus} to businessStatus.
     * @param businessStatus The value for businessStatus
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal businessStatus(Optional<? extends CodeableConcept> businessStatus);

    /**
     * Initializes the optional value {@link Task#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(Narrative text);

    /**
     * Initializes the optional value {@link Task#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(Optional<? extends Narrative> text);

    /**
     * Initializes the optional value {@link Task#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link Task#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link Task#encounter() encounter} to encounter.
     * @param encounter The value for encounter
     * @return {@code this} builder for chained invocation
     */
    BuildFinal encounter(Reference encounter);

    /**
     * Initializes the optional value {@link Task#encounter() encounter} to encounter.
     * @param encounter The value for encounter
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal encounter(Optional<? extends Reference> encounter);

    /**
     * Initializes the optional value {@link Task#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(List<Identifier> identifier);

    /**
     * Initializes the optional value {@link Task#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(Optional<? extends List<Identifier>> identifier);

    /**
     * Initializes the optional value {@link Task#intent() intent} to intent.
     * @param intent The value for intent
     * @return {@code this} builder for chained invocation
     */
    BuildFinal intent(TaskIntent intent);

    /**
     * Initializes the optional value {@link Task#intent() intent} to intent.
     * @param intent The value for intent
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal intent(Optional<? extends TaskIntent> intent);

    /**
     * Initializes the optional value {@link Task#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for chained invocation
     */
    BuildFinal description(String description);

    /**
     * Initializes the optional value {@link Task#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal description(Optional<String> description);

    /**
     * Initializes the optional value {@link Task#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(Code language);

    /**
     * Initializes the optional value {@link Task#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(Optional<? extends Code> language);

    /**
     * Initializes the optional value {@link Task#partOf() partOf} to partOf.
     * @param partOf The value for partOf
     * @return {@code this} builder for chained invocation
     */
    BuildFinal partOf(List<Reference> partOf);

    /**
     * Initializes the optional value {@link Task#partOf() partOf} to partOf.
     * @param partOf The value for partOf
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal partOf(Optional<? extends List<Reference>> partOf);

    /**
     * Initializes the optional value {@link Task#relevantHistory() relevantHistory} to relevantHistory.
     * @param relevantHistory The value for relevantHistory
     * @return {@code this} builder for chained invocation
     */
    BuildFinal relevantHistory(List<Reference> relevantHistory);

    /**
     * Initializes the optional value {@link Task#relevantHistory() relevantHistory} to relevantHistory.
     * @param relevantHistory The value for relevantHistory
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal relevantHistory(Optional<? extends List<Reference>> relevantHistory);

    /**
     * Initializes the optional value {@link Task#input() input} to input.
     * @param input The value for input
     * @return {@code this} builder for chained invocation
     */
    BuildFinal input(List<Task_Input> input);

    /**
     * Initializes the optional value {@link Task#input() input} to input.
     * @param input The value for input
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal input(Optional<? extends List<Task_Input>> input);

    /**
     * Initializes the optional value {@link Task#_for() _for} to _for.
     * @param _for The value for _for
     * @return {@code this} builder for chained invocation
     */
    BuildFinal _for(Reference _for);

    /**
     * Initializes the optional value {@link Task#_for() _for} to _for.
     * @param _for The value for _for
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal _for(Optional<? extends Reference> _for);

    /**
     * Initializes the optional value {@link Task#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(Uri implicitRules);

    /**
     * Initializes the optional value {@link Task#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(Optional<? extends Uri> implicitRules);

    /**
     * Initializes the optional value {@link Task#statusReason() statusReason} to statusReason.
     * @param statusReason The value for statusReason
     * @return {@code this} builder for chained invocation
     */
    BuildFinal statusReason(CodeableConcept statusReason);

    /**
     * Initializes the optional value {@link Task#statusReason() statusReason} to statusReason.
     * @param statusReason The value for statusReason
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal statusReason(Optional<? extends CodeableConcept> statusReason);

    /**
     * Initializes the optional value {@link Task#reasonCode() reasonCode} to reasonCode.
     * @param reasonCode The value for reasonCode
     * @return {@code this} builder for chained invocation
     */
    BuildFinal reasonCode(CodeableConcept reasonCode);

    /**
     * Initializes the optional value {@link Task#reasonCode() reasonCode} to reasonCode.
     * @param reasonCode The value for reasonCode
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal reasonCode(Optional<? extends CodeableConcept> reasonCode);

    /**
     * Initializes the optional value {@link Task#restriction() restriction} to restriction.
     * @param restriction The value for restriction
     * @return {@code this} builder for chained invocation
     */
    BuildFinal restriction(Task_Restriction restriction);

    /**
     * Initializes the optional value {@link Task#restriction() restriction} to restriction.
     * @param restriction The value for restriction
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal restriction(Optional<? extends Task_Restriction> restriction);

    /**
     * Initializes the optional value {@link Task#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(Id id);

    /**
     * Initializes the optional value {@link Task#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<? extends Id> id);

    /**
     * Initializes the optional value {@link Task#focus() focus} to focus.
     * @param focus The value for focus
     * @return {@code this} builder for chained invocation
     */
    BuildFinal focus(Reference focus);

    /**
     * Initializes the optional value {@link Task#focus() focus} to focus.
     * @param focus The value for focus
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal focus(Optional<? extends Reference> focus);

    /**
     * Initializes the optional value {@link Task#insurance() insurance} to insurance.
     * @param insurance The value for insurance
     * @return {@code this} builder for chained invocation
     */
    BuildFinal insurance(List<Reference> insurance);

    /**
     * Initializes the optional value {@link Task#insurance() insurance} to insurance.
     * @param insurance The value for insurance
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal insurance(Optional<? extends List<Reference>> insurance);

    /**
     * Initializes the optional value {@link Task#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(List<ResourceList> contained);

    /**
     * Initializes the optional value {@link Task#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(Optional<? extends List<ResourceList>> contained);

    /**
     * Initializes the optional value {@link Task#basedOn() basedOn} to basedOn.
     * @param basedOn The value for basedOn
     * @return {@code this} builder for chained invocation
     */
    BuildFinal basedOn(List<Reference> basedOn);

    /**
     * Initializes the optional value {@link Task#basedOn() basedOn} to basedOn.
     * @param basedOn The value for basedOn
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal basedOn(Optional<? extends List<Reference>> basedOn);

    /**
     * Initializes the optional value {@link Task#requester() requester} to requester.
     * @param requester The value for requester
     * @return {@code this} builder for chained invocation
     */
    BuildFinal requester(Reference requester);

    /**
     * Initializes the optional value {@link Task#requester() requester} to requester.
     * @param requester The value for requester
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal requester(Optional<? extends Reference> requester);

    /**
     * Initializes the optional value {@link Task#instantiatesCanonical() instantiatesCanonical} to instantiatesCanonical.
     * @param instantiatesCanonical The value for instantiatesCanonical
     * @return {@code this} builder for chained invocation
     */
    BuildFinal instantiatesCanonical(Canonical instantiatesCanonical);

    /**
     * Initializes the optional value {@link Task#instantiatesCanonical() instantiatesCanonical} to instantiatesCanonical.
     * @param instantiatesCanonical The value for instantiatesCanonical
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal instantiatesCanonical(Optional<? extends Canonical> instantiatesCanonical);

    /**
     * Initializes the optional value {@link Task#executionPeriod() executionPeriod} to executionPeriod.
     * @param executionPeriod The value for executionPeriod
     * @return {@code this} builder for chained invocation
     */
    BuildFinal executionPeriod(Period executionPeriod);

    /**
     * Initializes the optional value {@link Task#executionPeriod() executionPeriod} to executionPeriod.
     * @param executionPeriod The value for executionPeriod
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal executionPeriod(Optional<? extends Period> executionPeriod);

    /**
     * Initializes the optional value {@link Task#output() output} to output.
     * @param output The value for output
     * @return {@code this} builder for chained invocation
     */
    BuildFinal output(List<Task_Output> output);

    /**
     * Initializes the optional value {@link Task#output() output} to output.
     * @param output The value for output
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal output(Optional<? extends List<Task_Output>> output);

    /**
     * Initializes the optional value {@link Task#authoredOn() authoredOn} to authoredOn.
     * @param authoredOn The value for authoredOn
     * @return {@code this} builder for chained invocation
     */
    BuildFinal authoredOn(DateTime authoredOn);

    /**
     * Initializes the optional value {@link Task#authoredOn() authoredOn} to authoredOn.
     * @param authoredOn The value for authoredOn
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal authoredOn(Optional<? extends DateTime> authoredOn);

    /**
     * Initializes the optional value {@link Task#reasonReference() reasonReference} to reasonReference.
     * @param reasonReference The value for reasonReference
     * @return {@code this} builder for chained invocation
     */
    BuildFinal reasonReference(Reference reasonReference);

    /**
     * Initializes the optional value {@link Task#reasonReference() reasonReference} to reasonReference.
     * @param reasonReference The value for reasonReference
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal reasonReference(Optional<? extends Reference> reasonReference);

    /**
     * Initializes the optional value {@link Task#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(TaskStatus status);

    /**
     * Initializes the optional value {@link Task#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(Optional<? extends TaskStatus> status);

    /**
     * Initializes the optional value {@link Task#groupIdentifier() groupIdentifier} to groupIdentifier.
     * @param groupIdentifier The value for groupIdentifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal groupIdentifier(Identifier groupIdentifier);

    /**
     * Initializes the optional value {@link Task#groupIdentifier() groupIdentifier} to groupIdentifier.
     * @param groupIdentifier The value for groupIdentifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal groupIdentifier(Optional<? extends Identifier> groupIdentifier);

    /**
     * Initializes the optional value {@link Task#performerType() performerType} to performerType.
     * @param performerType The value for performerType
     * @return {@code this} builder for chained invocation
     */
    BuildFinal performerType(List<CodeableConcept> performerType);

    /**
     * Initializes the optional value {@link Task#performerType() performerType} to performerType.
     * @param performerType The value for performerType
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal performerType(Optional<? extends List<CodeableConcept>> performerType);

    /**
     * Builds a new {@link Task Task}.
     * @return An immutable instance of Task
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    Task build();
  }
}
