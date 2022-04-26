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
 * Immutable implementation of {@link DeviceRequest}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableDeviceRequest.builder()}.
 */
@Generated(from = "DeviceRequest", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableDeviceRequest implements DeviceRequest {
  private final @Nullable Code status;
  private final @Nullable Code priority;
  private final @Nullable Id id;
  private final @Nullable Code intent;
  private final @Nullable Reference codeReference;
  private final @Nullable List<Extension> extension;
  private final @Nullable Period occurrencePeriod;
  private final @Nullable CodeableConcept performerType;
  private final @Nullable List<Canonical> instantiatesCanonical;
  private final @Nullable Reference requester;
  private final Reference subject;
  private final @Nullable Meta meta;
  private final @Nullable List<Uri> instantiatesUri;
  private final @Nullable List<Identifier> identifier;
  private final @Nullable List<Reference> supportingInfo;
  private final @Nullable CodeableConcept codeCodeableConcept;
  private final @Nullable List<Reference> reasonReference;
  private final String resourceType;
  private final @Nullable Timing occurrenceTiming;
  private final @Nullable Reference encounter;
  private final @Nullable List<Reference> relevantHistory;
  private final @Nullable List<ResourceList> contained;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable DateTime authoredOn;
  private final @Nullable Reference performer;
  private final @Nullable List<Reference> priorRequest;
  private final @Nullable Identifier groupIdentifier;
  private final @Nullable List<CodeableConcept> reasonCode;
  private final @Nullable List<Annotation> note;
  private final @Nullable List<Reference> basedOn;
  private final @Nullable String occurrenceDateTime;
  private final @Nullable Code language;
  private final @Nullable List<DeviceRequest_Parameter> parameter;
  private final @Nullable List<Reference> insurance;
  private final @Nullable Uri implicitRules;
  private final @Nullable Narrative text;

  private ImmutableDeviceRequest(
      @Nullable Code status,
      @Nullable Code priority,
      @Nullable Id id,
      @Nullable Code intent,
      @Nullable Reference codeReference,
      @Nullable List<Extension> extension,
      @Nullable Period occurrencePeriod,
      @Nullable CodeableConcept performerType,
      @Nullable List<Canonical> instantiatesCanonical,
      @Nullable Reference requester,
      Reference subject,
      @Nullable Meta meta,
      @Nullable List<Uri> instantiatesUri,
      @Nullable List<Identifier> identifier,
      @Nullable List<Reference> supportingInfo,
      @Nullable CodeableConcept codeCodeableConcept,
      @Nullable List<Reference> reasonReference,
      String resourceType,
      @Nullable Timing occurrenceTiming,
      @Nullable Reference encounter,
      @Nullable List<Reference> relevantHistory,
      @Nullable List<ResourceList> contained,
      @Nullable List<Extension> modifierExtension,
      @Nullable DateTime authoredOn,
      @Nullable Reference performer,
      @Nullable List<Reference> priorRequest,
      @Nullable Identifier groupIdentifier,
      @Nullable List<CodeableConcept> reasonCode,
      @Nullable List<Annotation> note,
      @Nullable List<Reference> basedOn,
      @Nullable String occurrenceDateTime,
      @Nullable Code language,
      @Nullable List<DeviceRequest_Parameter> parameter,
      @Nullable List<Reference> insurance,
      @Nullable Uri implicitRules,
      @Nullable Narrative text) {
    this.status = status;
    this.priority = priority;
    this.id = id;
    this.intent = intent;
    this.codeReference = codeReference;
    this.extension = extension;
    this.occurrencePeriod = occurrencePeriod;
    this.performerType = performerType;
    this.instantiatesCanonical = instantiatesCanonical;
    this.requester = requester;
    this.subject = subject;
    this.meta = meta;
    this.instantiatesUri = instantiatesUri;
    this.identifier = identifier;
    this.supportingInfo = supportingInfo;
    this.codeCodeableConcept = codeCodeableConcept;
    this.reasonReference = reasonReference;
    this.resourceType = resourceType;
    this.occurrenceTiming = occurrenceTiming;
    this.encounter = encounter;
    this.relevantHistory = relevantHistory;
    this.contained = contained;
    this.modifierExtension = modifierExtension;
    this.authoredOn = authoredOn;
    this.performer = performer;
    this.priorRequest = priorRequest;
    this.groupIdentifier = groupIdentifier;
    this.reasonCode = reasonCode;
    this.note = note;
    this.basedOn = basedOn;
    this.occurrenceDateTime = occurrenceDateTime;
    this.language = language;
    this.parameter = parameter;
    this.insurance = insurance;
    this.implicitRules = implicitRules;
    this.text = text;
  }

  /**
   * @return The value of the {@code status} attribute
   */
  @JsonProperty("status")
  @Override
  public Optional<Code> status() {
    return Optional.ofNullable(status);
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
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public Optional<Id> id() {
    return Optional.ofNullable(id);
  }

  /**
   * @return The value of the {@code intent} attribute
   */
  @JsonProperty("intent")
  @Override
  public Optional<Code> intent() {
    return Optional.ofNullable(intent);
  }

  /**
   * @return The value of the {@code codeReference} attribute
   */
  @JsonProperty("codeReference")
  @Override
  public Optional<Reference> codeReference() {
    return Optional.ofNullable(codeReference);
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
   * @return The value of the {@code occurrencePeriod} attribute
   */
  @JsonProperty("occurrencePeriod")
  @Override
  public Optional<Period> occurrencePeriod() {
    return Optional.ofNullable(occurrencePeriod);
  }

  /**
   * @return The value of the {@code performerType} attribute
   */
  @JsonProperty("performerType")
  @Override
  public Optional<CodeableConcept> performerType() {
    return Optional.ofNullable(performerType);
  }

  /**
   * @return The value of the {@code instantiatesCanonical} attribute
   */
  @JsonProperty("instantiatesCanonical")
  @Override
  public Optional<List<Canonical>> instantiatesCanonical() {
    return Optional.ofNullable(instantiatesCanonical);
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
   * @return The value of the {@code subject} attribute
   */
  @JsonProperty("subject")
  @Override
  public Reference subject() {
    return subject;
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
   * @return The value of the {@code instantiatesUri} attribute
   */
  @JsonProperty("instantiatesUri")
  @Override
  public Optional<List<Uri>> instantiatesUri() {
    return Optional.ofNullable(instantiatesUri);
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
   * @return The value of the {@code supportingInfo} attribute
   */
  @JsonProperty("supportingInfo")
  @Override
  public Optional<List<Reference>> supportingInfo() {
    return Optional.ofNullable(supportingInfo);
  }

  /**
   * @return The value of the {@code codeCodeableConcept} attribute
   */
  @JsonProperty("codeCodeableConcept")
  @Override
  public Optional<CodeableConcept> codeCodeableConcept() {
    return Optional.ofNullable(codeCodeableConcept);
  }

  /**
   * @return The value of the {@code reasonReference} attribute
   */
  @JsonProperty("reasonReference")
  @Override
  public Optional<List<Reference>> reasonReference() {
    return Optional.ofNullable(reasonReference);
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
   * @return The value of the {@code occurrenceTiming} attribute
   */
  @JsonProperty("occurrenceTiming")
  @Override
  public Optional<Timing> occurrenceTiming() {
    return Optional.ofNullable(occurrenceTiming);
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
   * @return The value of the {@code relevantHistory} attribute
   */
  @JsonProperty("relevantHistory")
  @Override
  public Optional<List<Reference>> relevantHistory() {
    return Optional.ofNullable(relevantHistory);
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @JsonProperty("modifierExtension")
  @Override
  public Optional<List<Extension>> modifierExtension() {
    return Optional.ofNullable(modifierExtension);
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
   * @return The value of the {@code performer} attribute
   */
  @JsonProperty("performer")
  @Override
  public Optional<Reference> performer() {
    return Optional.ofNullable(performer);
  }

  /**
   * @return The value of the {@code priorRequest} attribute
   */
  @JsonProperty("priorRequest")
  @Override
  public Optional<List<Reference>> priorRequest() {
    return Optional.ofNullable(priorRequest);
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
   * @return The value of the {@code reasonCode} attribute
   */
  @JsonProperty("reasonCode")
  @Override
  public Optional<List<CodeableConcept>> reasonCode() {
    return Optional.ofNullable(reasonCode);
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
   * @return The value of the {@code basedOn} attribute
   */
  @JsonProperty("basedOn")
  @Override
  public Optional<List<Reference>> basedOn() {
    return Optional.ofNullable(basedOn);
  }

  /**
   * @return The value of the {@code occurrenceDateTime} attribute
   */
  @JsonProperty("occurrenceDateTime")
  @Override
  public Optional<String> occurrenceDateTime() {
    return Optional.ofNullable(occurrenceDateTime);
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
   * @return The value of the {@code parameter} attribute
   */
  @JsonProperty("parameter")
  @Override
  public Optional<List<DeviceRequest_Parameter>> parameter() {
    return Optional.ofNullable(parameter);
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
   * @return The value of the {@code implicitRules} attribute
   */
  @JsonProperty("implicitRules")
  @Override
  public Optional<Uri> implicitRules() {
    return Optional.ofNullable(implicitRules);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceRequest#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceRequest withStatus(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableDeviceRequest(
        newValue,
        this.priority,
        this.id,
        this.intent,
        this.codeReference,
        this.extension,
        this.occurrencePeriod,
        this.performerType,
        this.instantiatesCanonical,
        this.requester,
        this.subject,
        this.meta,
        this.instantiatesUri,
        this.identifier,
        this.supportingInfo,
        this.codeCodeableConcept,
        this.reasonReference,
        this.resourceType,
        this.occurrenceTiming,
        this.encounter,
        this.relevantHistory,
        this.contained,
        this.modifierExtension,
        this.authoredOn,
        this.performer,
        this.priorRequest,
        this.groupIdentifier,
        this.reasonCode,
        this.note,
        this.basedOn,
        this.occurrenceDateTime,
        this.language,
        this.parameter,
        this.insurance,
        this.implicitRules,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceRequest#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceRequest withStatus(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableDeviceRequest(
        value,
        this.priority,
        this.id,
        this.intent,
        this.codeReference,
        this.extension,
        this.occurrencePeriod,
        this.performerType,
        this.instantiatesCanonical,
        this.requester,
        this.subject,
        this.meta,
        this.instantiatesUri,
        this.identifier,
        this.supportingInfo,
        this.codeCodeableConcept,
        this.reasonReference,
        this.resourceType,
        this.occurrenceTiming,
        this.encounter,
        this.relevantHistory,
        this.contained,
        this.modifierExtension,
        this.authoredOn,
        this.performer,
        this.priorRequest,
        this.groupIdentifier,
        this.reasonCode,
        this.note,
        this.basedOn,
        this.occurrenceDateTime,
        this.language,
        this.parameter,
        this.insurance,
        this.implicitRules,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceRequest#priority() priority} attribute.
   * @param value The value for priority
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceRequest withPriority(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "priority");
    if (this.priority == newValue) return this;
    return new ImmutableDeviceRequest(
        this.status,
        newValue,
        this.id,
        this.intent,
        this.codeReference,
        this.extension,
        this.occurrencePeriod,
        this.performerType,
        this.instantiatesCanonical,
        this.requester,
        this.subject,
        this.meta,
        this.instantiatesUri,
        this.identifier,
        this.supportingInfo,
        this.codeCodeableConcept,
        this.reasonReference,
        this.resourceType,
        this.occurrenceTiming,
        this.encounter,
        this.relevantHistory,
        this.contained,
        this.modifierExtension,
        this.authoredOn,
        this.performer,
        this.priorRequest,
        this.groupIdentifier,
        this.reasonCode,
        this.note,
        this.basedOn,
        this.occurrenceDateTime,
        this.language,
        this.parameter,
        this.insurance,
        this.implicitRules,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceRequest#priority() priority} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for priority
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceRequest withPriority(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.priority == value) return this;
    return new ImmutableDeviceRequest(
        this.status,
        value,
        this.id,
        this.intent,
        this.codeReference,
        this.extension,
        this.occurrencePeriod,
        this.performerType,
        this.instantiatesCanonical,
        this.requester,
        this.subject,
        this.meta,
        this.instantiatesUri,
        this.identifier,
        this.supportingInfo,
        this.codeCodeableConcept,
        this.reasonReference,
        this.resourceType,
        this.occurrenceTiming,
        this.encounter,
        this.relevantHistory,
        this.contained,
        this.modifierExtension,
        this.authoredOn,
        this.performer,
        this.priorRequest,
        this.groupIdentifier,
        this.reasonCode,
        this.note,
        this.basedOn,
        this.occurrenceDateTime,
        this.language,
        this.parameter,
        this.insurance,
        this.implicitRules,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceRequest#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceRequest withId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableDeviceRequest(
        this.status,
        this.priority,
        newValue,
        this.intent,
        this.codeReference,
        this.extension,
        this.occurrencePeriod,
        this.performerType,
        this.instantiatesCanonical,
        this.requester,
        this.subject,
        this.meta,
        this.instantiatesUri,
        this.identifier,
        this.supportingInfo,
        this.codeCodeableConcept,
        this.reasonReference,
        this.resourceType,
        this.occurrenceTiming,
        this.encounter,
        this.relevantHistory,
        this.contained,
        this.modifierExtension,
        this.authoredOn,
        this.performer,
        this.priorRequest,
        this.groupIdentifier,
        this.reasonCode,
        this.note,
        this.basedOn,
        this.occurrenceDateTime,
        this.language,
        this.parameter,
        this.insurance,
        this.implicitRules,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceRequest#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceRequest withId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableDeviceRequest(
        this.status,
        this.priority,
        value,
        this.intent,
        this.codeReference,
        this.extension,
        this.occurrencePeriod,
        this.performerType,
        this.instantiatesCanonical,
        this.requester,
        this.subject,
        this.meta,
        this.instantiatesUri,
        this.identifier,
        this.supportingInfo,
        this.codeCodeableConcept,
        this.reasonReference,
        this.resourceType,
        this.occurrenceTiming,
        this.encounter,
        this.relevantHistory,
        this.contained,
        this.modifierExtension,
        this.authoredOn,
        this.performer,
        this.priorRequest,
        this.groupIdentifier,
        this.reasonCode,
        this.note,
        this.basedOn,
        this.occurrenceDateTime,
        this.language,
        this.parameter,
        this.insurance,
        this.implicitRules,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceRequest#intent() intent} attribute.
   * @param value The value for intent
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceRequest withIntent(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "intent");
    if (this.intent == newValue) return this;
    return new ImmutableDeviceRequest(
        this.status,
        this.priority,
        this.id,
        newValue,
        this.codeReference,
        this.extension,
        this.occurrencePeriod,
        this.performerType,
        this.instantiatesCanonical,
        this.requester,
        this.subject,
        this.meta,
        this.instantiatesUri,
        this.identifier,
        this.supportingInfo,
        this.codeCodeableConcept,
        this.reasonReference,
        this.resourceType,
        this.occurrenceTiming,
        this.encounter,
        this.relevantHistory,
        this.contained,
        this.modifierExtension,
        this.authoredOn,
        this.performer,
        this.priorRequest,
        this.groupIdentifier,
        this.reasonCode,
        this.note,
        this.basedOn,
        this.occurrenceDateTime,
        this.language,
        this.parameter,
        this.insurance,
        this.implicitRules,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceRequest#intent() intent} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for intent
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceRequest withIntent(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.intent == value) return this;
    return new ImmutableDeviceRequest(
        this.status,
        this.priority,
        this.id,
        value,
        this.codeReference,
        this.extension,
        this.occurrencePeriod,
        this.performerType,
        this.instantiatesCanonical,
        this.requester,
        this.subject,
        this.meta,
        this.instantiatesUri,
        this.identifier,
        this.supportingInfo,
        this.codeCodeableConcept,
        this.reasonReference,
        this.resourceType,
        this.occurrenceTiming,
        this.encounter,
        this.relevantHistory,
        this.contained,
        this.modifierExtension,
        this.authoredOn,
        this.performer,
        this.priorRequest,
        this.groupIdentifier,
        this.reasonCode,
        this.note,
        this.basedOn,
        this.occurrenceDateTime,
        this.language,
        this.parameter,
        this.insurance,
        this.implicitRules,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceRequest#codeReference() codeReference} attribute.
   * @param value The value for codeReference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceRequest withCodeReference(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "codeReference");
    if (this.codeReference == newValue) return this;
    return new ImmutableDeviceRequest(
        this.status,
        this.priority,
        this.id,
        this.intent,
        newValue,
        this.extension,
        this.occurrencePeriod,
        this.performerType,
        this.instantiatesCanonical,
        this.requester,
        this.subject,
        this.meta,
        this.instantiatesUri,
        this.identifier,
        this.supportingInfo,
        this.codeCodeableConcept,
        this.reasonReference,
        this.resourceType,
        this.occurrenceTiming,
        this.encounter,
        this.relevantHistory,
        this.contained,
        this.modifierExtension,
        this.authoredOn,
        this.performer,
        this.priorRequest,
        this.groupIdentifier,
        this.reasonCode,
        this.note,
        this.basedOn,
        this.occurrenceDateTime,
        this.language,
        this.parameter,
        this.insurance,
        this.implicitRules,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceRequest#codeReference() codeReference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for codeReference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceRequest withCodeReference(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.codeReference == value) return this;
    return new ImmutableDeviceRequest(
        this.status,
        this.priority,
        this.id,
        this.intent,
        value,
        this.extension,
        this.occurrencePeriod,
        this.performerType,
        this.instantiatesCanonical,
        this.requester,
        this.subject,
        this.meta,
        this.instantiatesUri,
        this.identifier,
        this.supportingInfo,
        this.codeCodeableConcept,
        this.reasonReference,
        this.resourceType,
        this.occurrenceTiming,
        this.encounter,
        this.relevantHistory,
        this.contained,
        this.modifierExtension,
        this.authoredOn,
        this.performer,
        this.priorRequest,
        this.groupIdentifier,
        this.reasonCode,
        this.note,
        this.basedOn,
        this.occurrenceDateTime,
        this.language,
        this.parameter,
        this.insurance,
        this.implicitRules,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceRequest#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceRequest withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableDeviceRequest(
        this.status,
        this.priority,
        this.id,
        this.intent,
        this.codeReference,
        newValue,
        this.occurrencePeriod,
        this.performerType,
        this.instantiatesCanonical,
        this.requester,
        this.subject,
        this.meta,
        this.instantiatesUri,
        this.identifier,
        this.supportingInfo,
        this.codeCodeableConcept,
        this.reasonReference,
        this.resourceType,
        this.occurrenceTiming,
        this.encounter,
        this.relevantHistory,
        this.contained,
        this.modifierExtension,
        this.authoredOn,
        this.performer,
        this.priorRequest,
        this.groupIdentifier,
        this.reasonCode,
        this.note,
        this.basedOn,
        this.occurrenceDateTime,
        this.language,
        this.parameter,
        this.insurance,
        this.implicitRules,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceRequest#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceRequest withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableDeviceRequest(
        this.status,
        this.priority,
        this.id,
        this.intent,
        this.codeReference,
        value,
        this.occurrencePeriod,
        this.performerType,
        this.instantiatesCanonical,
        this.requester,
        this.subject,
        this.meta,
        this.instantiatesUri,
        this.identifier,
        this.supportingInfo,
        this.codeCodeableConcept,
        this.reasonReference,
        this.resourceType,
        this.occurrenceTiming,
        this.encounter,
        this.relevantHistory,
        this.contained,
        this.modifierExtension,
        this.authoredOn,
        this.performer,
        this.priorRequest,
        this.groupIdentifier,
        this.reasonCode,
        this.note,
        this.basedOn,
        this.occurrenceDateTime,
        this.language,
        this.parameter,
        this.insurance,
        this.implicitRules,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceRequest#occurrencePeriod() occurrencePeriod} attribute.
   * @param value The value for occurrencePeriod
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceRequest withOccurrencePeriod(Period value) {
    @Nullable Period newValue = Objects.requireNonNull(value, "occurrencePeriod");
    if (this.occurrencePeriod == newValue) return this;
    return new ImmutableDeviceRequest(
        this.status,
        this.priority,
        this.id,
        this.intent,
        this.codeReference,
        this.extension,
        newValue,
        this.performerType,
        this.instantiatesCanonical,
        this.requester,
        this.subject,
        this.meta,
        this.instantiatesUri,
        this.identifier,
        this.supportingInfo,
        this.codeCodeableConcept,
        this.reasonReference,
        this.resourceType,
        this.occurrenceTiming,
        this.encounter,
        this.relevantHistory,
        this.contained,
        this.modifierExtension,
        this.authoredOn,
        this.performer,
        this.priorRequest,
        this.groupIdentifier,
        this.reasonCode,
        this.note,
        this.basedOn,
        this.occurrenceDateTime,
        this.language,
        this.parameter,
        this.insurance,
        this.implicitRules,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceRequest#occurrencePeriod() occurrencePeriod} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for occurrencePeriod
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceRequest withOccurrencePeriod(Optional<? extends Period> optional) {
    @Nullable Period value = optional.orElse(null);
    if (this.occurrencePeriod == value) return this;
    return new ImmutableDeviceRequest(
        this.status,
        this.priority,
        this.id,
        this.intent,
        this.codeReference,
        this.extension,
        value,
        this.performerType,
        this.instantiatesCanonical,
        this.requester,
        this.subject,
        this.meta,
        this.instantiatesUri,
        this.identifier,
        this.supportingInfo,
        this.codeCodeableConcept,
        this.reasonReference,
        this.resourceType,
        this.occurrenceTiming,
        this.encounter,
        this.relevantHistory,
        this.contained,
        this.modifierExtension,
        this.authoredOn,
        this.performer,
        this.priorRequest,
        this.groupIdentifier,
        this.reasonCode,
        this.note,
        this.basedOn,
        this.occurrenceDateTime,
        this.language,
        this.parameter,
        this.insurance,
        this.implicitRules,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceRequest#performerType() performerType} attribute.
   * @param value The value for performerType
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceRequest withPerformerType(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "performerType");
    if (this.performerType == newValue) return this;
    return new ImmutableDeviceRequest(
        this.status,
        this.priority,
        this.id,
        this.intent,
        this.codeReference,
        this.extension,
        this.occurrencePeriod,
        newValue,
        this.instantiatesCanonical,
        this.requester,
        this.subject,
        this.meta,
        this.instantiatesUri,
        this.identifier,
        this.supportingInfo,
        this.codeCodeableConcept,
        this.reasonReference,
        this.resourceType,
        this.occurrenceTiming,
        this.encounter,
        this.relevantHistory,
        this.contained,
        this.modifierExtension,
        this.authoredOn,
        this.performer,
        this.priorRequest,
        this.groupIdentifier,
        this.reasonCode,
        this.note,
        this.basedOn,
        this.occurrenceDateTime,
        this.language,
        this.parameter,
        this.insurance,
        this.implicitRules,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceRequest#performerType() performerType} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for performerType
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceRequest withPerformerType(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.performerType == value) return this;
    return new ImmutableDeviceRequest(
        this.status,
        this.priority,
        this.id,
        this.intent,
        this.codeReference,
        this.extension,
        this.occurrencePeriod,
        value,
        this.instantiatesCanonical,
        this.requester,
        this.subject,
        this.meta,
        this.instantiatesUri,
        this.identifier,
        this.supportingInfo,
        this.codeCodeableConcept,
        this.reasonReference,
        this.resourceType,
        this.occurrenceTiming,
        this.encounter,
        this.relevantHistory,
        this.contained,
        this.modifierExtension,
        this.authoredOn,
        this.performer,
        this.priorRequest,
        this.groupIdentifier,
        this.reasonCode,
        this.note,
        this.basedOn,
        this.occurrenceDateTime,
        this.language,
        this.parameter,
        this.insurance,
        this.implicitRules,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceRequest#instantiatesCanonical() instantiatesCanonical} attribute.
   * @param value The value for instantiatesCanonical
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceRequest withInstantiatesCanonical(List<Canonical> value) {
    @Nullable List<Canonical> newValue = Objects.requireNonNull(value, "instantiatesCanonical");
    if (this.instantiatesCanonical == newValue) return this;
    return new ImmutableDeviceRequest(
        this.status,
        this.priority,
        this.id,
        this.intent,
        this.codeReference,
        this.extension,
        this.occurrencePeriod,
        this.performerType,
        newValue,
        this.requester,
        this.subject,
        this.meta,
        this.instantiatesUri,
        this.identifier,
        this.supportingInfo,
        this.codeCodeableConcept,
        this.reasonReference,
        this.resourceType,
        this.occurrenceTiming,
        this.encounter,
        this.relevantHistory,
        this.contained,
        this.modifierExtension,
        this.authoredOn,
        this.performer,
        this.priorRequest,
        this.groupIdentifier,
        this.reasonCode,
        this.note,
        this.basedOn,
        this.occurrenceDateTime,
        this.language,
        this.parameter,
        this.insurance,
        this.implicitRules,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceRequest#instantiatesCanonical() instantiatesCanonical} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for instantiatesCanonical
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceRequest withInstantiatesCanonical(Optional<? extends List<Canonical>> optional) {
    @Nullable List<Canonical> value = optional.orElse(null);
    if (this.instantiatesCanonical == value) return this;
    return new ImmutableDeviceRequest(
        this.status,
        this.priority,
        this.id,
        this.intent,
        this.codeReference,
        this.extension,
        this.occurrencePeriod,
        this.performerType,
        value,
        this.requester,
        this.subject,
        this.meta,
        this.instantiatesUri,
        this.identifier,
        this.supportingInfo,
        this.codeCodeableConcept,
        this.reasonReference,
        this.resourceType,
        this.occurrenceTiming,
        this.encounter,
        this.relevantHistory,
        this.contained,
        this.modifierExtension,
        this.authoredOn,
        this.performer,
        this.priorRequest,
        this.groupIdentifier,
        this.reasonCode,
        this.note,
        this.basedOn,
        this.occurrenceDateTime,
        this.language,
        this.parameter,
        this.insurance,
        this.implicitRules,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceRequest#requester() requester} attribute.
   * @param value The value for requester
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceRequest withRequester(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "requester");
    if (this.requester == newValue) return this;
    return new ImmutableDeviceRequest(
        this.status,
        this.priority,
        this.id,
        this.intent,
        this.codeReference,
        this.extension,
        this.occurrencePeriod,
        this.performerType,
        this.instantiatesCanonical,
        newValue,
        this.subject,
        this.meta,
        this.instantiatesUri,
        this.identifier,
        this.supportingInfo,
        this.codeCodeableConcept,
        this.reasonReference,
        this.resourceType,
        this.occurrenceTiming,
        this.encounter,
        this.relevantHistory,
        this.contained,
        this.modifierExtension,
        this.authoredOn,
        this.performer,
        this.priorRequest,
        this.groupIdentifier,
        this.reasonCode,
        this.note,
        this.basedOn,
        this.occurrenceDateTime,
        this.language,
        this.parameter,
        this.insurance,
        this.implicitRules,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceRequest#requester() requester} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for requester
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceRequest withRequester(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.requester == value) return this;
    return new ImmutableDeviceRequest(
        this.status,
        this.priority,
        this.id,
        this.intent,
        this.codeReference,
        this.extension,
        this.occurrencePeriod,
        this.performerType,
        this.instantiatesCanonical,
        value,
        this.subject,
        this.meta,
        this.instantiatesUri,
        this.identifier,
        this.supportingInfo,
        this.codeCodeableConcept,
        this.reasonReference,
        this.resourceType,
        this.occurrenceTiming,
        this.encounter,
        this.relevantHistory,
        this.contained,
        this.modifierExtension,
        this.authoredOn,
        this.performer,
        this.priorRequest,
        this.groupIdentifier,
        this.reasonCode,
        this.note,
        this.basedOn,
        this.occurrenceDateTime,
        this.language,
        this.parameter,
        this.insurance,
        this.implicitRules,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link DeviceRequest#subject() subject} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for subject
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableDeviceRequest withSubject(Reference value) {
    if (this.subject == value) return this;
    Reference newValue = Objects.requireNonNull(value, "subject");
    return new ImmutableDeviceRequest(
        this.status,
        this.priority,
        this.id,
        this.intent,
        this.codeReference,
        this.extension,
        this.occurrencePeriod,
        this.performerType,
        this.instantiatesCanonical,
        this.requester,
        newValue,
        this.meta,
        this.instantiatesUri,
        this.identifier,
        this.supportingInfo,
        this.codeCodeableConcept,
        this.reasonReference,
        this.resourceType,
        this.occurrenceTiming,
        this.encounter,
        this.relevantHistory,
        this.contained,
        this.modifierExtension,
        this.authoredOn,
        this.performer,
        this.priorRequest,
        this.groupIdentifier,
        this.reasonCode,
        this.note,
        this.basedOn,
        this.occurrenceDateTime,
        this.language,
        this.parameter,
        this.insurance,
        this.implicitRules,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceRequest#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceRequest withMeta(Meta value) {
    @Nullable Meta newValue = Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableDeviceRequest(
        this.status,
        this.priority,
        this.id,
        this.intent,
        this.codeReference,
        this.extension,
        this.occurrencePeriod,
        this.performerType,
        this.instantiatesCanonical,
        this.requester,
        this.subject,
        newValue,
        this.instantiatesUri,
        this.identifier,
        this.supportingInfo,
        this.codeCodeableConcept,
        this.reasonReference,
        this.resourceType,
        this.occurrenceTiming,
        this.encounter,
        this.relevantHistory,
        this.contained,
        this.modifierExtension,
        this.authoredOn,
        this.performer,
        this.priorRequest,
        this.groupIdentifier,
        this.reasonCode,
        this.note,
        this.basedOn,
        this.occurrenceDateTime,
        this.language,
        this.parameter,
        this.insurance,
        this.implicitRules,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceRequest#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceRequest withMeta(Optional<? extends Meta> optional) {
    @Nullable Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableDeviceRequest(
        this.status,
        this.priority,
        this.id,
        this.intent,
        this.codeReference,
        this.extension,
        this.occurrencePeriod,
        this.performerType,
        this.instantiatesCanonical,
        this.requester,
        this.subject,
        value,
        this.instantiatesUri,
        this.identifier,
        this.supportingInfo,
        this.codeCodeableConcept,
        this.reasonReference,
        this.resourceType,
        this.occurrenceTiming,
        this.encounter,
        this.relevantHistory,
        this.contained,
        this.modifierExtension,
        this.authoredOn,
        this.performer,
        this.priorRequest,
        this.groupIdentifier,
        this.reasonCode,
        this.note,
        this.basedOn,
        this.occurrenceDateTime,
        this.language,
        this.parameter,
        this.insurance,
        this.implicitRules,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceRequest#instantiatesUri() instantiatesUri} attribute.
   * @param value The value for instantiatesUri
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceRequest withInstantiatesUri(List<Uri> value) {
    @Nullable List<Uri> newValue = Objects.requireNonNull(value, "instantiatesUri");
    if (this.instantiatesUri == newValue) return this;
    return new ImmutableDeviceRequest(
        this.status,
        this.priority,
        this.id,
        this.intent,
        this.codeReference,
        this.extension,
        this.occurrencePeriod,
        this.performerType,
        this.instantiatesCanonical,
        this.requester,
        this.subject,
        this.meta,
        newValue,
        this.identifier,
        this.supportingInfo,
        this.codeCodeableConcept,
        this.reasonReference,
        this.resourceType,
        this.occurrenceTiming,
        this.encounter,
        this.relevantHistory,
        this.contained,
        this.modifierExtension,
        this.authoredOn,
        this.performer,
        this.priorRequest,
        this.groupIdentifier,
        this.reasonCode,
        this.note,
        this.basedOn,
        this.occurrenceDateTime,
        this.language,
        this.parameter,
        this.insurance,
        this.implicitRules,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceRequest#instantiatesUri() instantiatesUri} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for instantiatesUri
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceRequest withInstantiatesUri(Optional<? extends List<Uri>> optional) {
    @Nullable List<Uri> value = optional.orElse(null);
    if (this.instantiatesUri == value) return this;
    return new ImmutableDeviceRequest(
        this.status,
        this.priority,
        this.id,
        this.intent,
        this.codeReference,
        this.extension,
        this.occurrencePeriod,
        this.performerType,
        this.instantiatesCanonical,
        this.requester,
        this.subject,
        this.meta,
        value,
        this.identifier,
        this.supportingInfo,
        this.codeCodeableConcept,
        this.reasonReference,
        this.resourceType,
        this.occurrenceTiming,
        this.encounter,
        this.relevantHistory,
        this.contained,
        this.modifierExtension,
        this.authoredOn,
        this.performer,
        this.priorRequest,
        this.groupIdentifier,
        this.reasonCode,
        this.note,
        this.basedOn,
        this.occurrenceDateTime,
        this.language,
        this.parameter,
        this.insurance,
        this.implicitRules,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceRequest#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceRequest withIdentifier(List<Identifier> value) {
    @Nullable List<Identifier> newValue = Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableDeviceRequest(
        this.status,
        this.priority,
        this.id,
        this.intent,
        this.codeReference,
        this.extension,
        this.occurrencePeriod,
        this.performerType,
        this.instantiatesCanonical,
        this.requester,
        this.subject,
        this.meta,
        this.instantiatesUri,
        newValue,
        this.supportingInfo,
        this.codeCodeableConcept,
        this.reasonReference,
        this.resourceType,
        this.occurrenceTiming,
        this.encounter,
        this.relevantHistory,
        this.contained,
        this.modifierExtension,
        this.authoredOn,
        this.performer,
        this.priorRequest,
        this.groupIdentifier,
        this.reasonCode,
        this.note,
        this.basedOn,
        this.occurrenceDateTime,
        this.language,
        this.parameter,
        this.insurance,
        this.implicitRules,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceRequest#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceRequest withIdentifier(Optional<? extends List<Identifier>> optional) {
    @Nullable List<Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableDeviceRequest(
        this.status,
        this.priority,
        this.id,
        this.intent,
        this.codeReference,
        this.extension,
        this.occurrencePeriod,
        this.performerType,
        this.instantiatesCanonical,
        this.requester,
        this.subject,
        this.meta,
        this.instantiatesUri,
        value,
        this.supportingInfo,
        this.codeCodeableConcept,
        this.reasonReference,
        this.resourceType,
        this.occurrenceTiming,
        this.encounter,
        this.relevantHistory,
        this.contained,
        this.modifierExtension,
        this.authoredOn,
        this.performer,
        this.priorRequest,
        this.groupIdentifier,
        this.reasonCode,
        this.note,
        this.basedOn,
        this.occurrenceDateTime,
        this.language,
        this.parameter,
        this.insurance,
        this.implicitRules,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceRequest#supportingInfo() supportingInfo} attribute.
   * @param value The value for supportingInfo
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceRequest withSupportingInfo(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "supportingInfo");
    if (this.supportingInfo == newValue) return this;
    return new ImmutableDeviceRequest(
        this.status,
        this.priority,
        this.id,
        this.intent,
        this.codeReference,
        this.extension,
        this.occurrencePeriod,
        this.performerType,
        this.instantiatesCanonical,
        this.requester,
        this.subject,
        this.meta,
        this.instantiatesUri,
        this.identifier,
        newValue,
        this.codeCodeableConcept,
        this.reasonReference,
        this.resourceType,
        this.occurrenceTiming,
        this.encounter,
        this.relevantHistory,
        this.contained,
        this.modifierExtension,
        this.authoredOn,
        this.performer,
        this.priorRequest,
        this.groupIdentifier,
        this.reasonCode,
        this.note,
        this.basedOn,
        this.occurrenceDateTime,
        this.language,
        this.parameter,
        this.insurance,
        this.implicitRules,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceRequest#supportingInfo() supportingInfo} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for supportingInfo
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceRequest withSupportingInfo(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.supportingInfo == value) return this;
    return new ImmutableDeviceRequest(
        this.status,
        this.priority,
        this.id,
        this.intent,
        this.codeReference,
        this.extension,
        this.occurrencePeriod,
        this.performerType,
        this.instantiatesCanonical,
        this.requester,
        this.subject,
        this.meta,
        this.instantiatesUri,
        this.identifier,
        value,
        this.codeCodeableConcept,
        this.reasonReference,
        this.resourceType,
        this.occurrenceTiming,
        this.encounter,
        this.relevantHistory,
        this.contained,
        this.modifierExtension,
        this.authoredOn,
        this.performer,
        this.priorRequest,
        this.groupIdentifier,
        this.reasonCode,
        this.note,
        this.basedOn,
        this.occurrenceDateTime,
        this.language,
        this.parameter,
        this.insurance,
        this.implicitRules,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceRequest#codeCodeableConcept() codeCodeableConcept} attribute.
   * @param value The value for codeCodeableConcept
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceRequest withCodeCodeableConcept(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "codeCodeableConcept");
    if (this.codeCodeableConcept == newValue) return this;
    return new ImmutableDeviceRequest(
        this.status,
        this.priority,
        this.id,
        this.intent,
        this.codeReference,
        this.extension,
        this.occurrencePeriod,
        this.performerType,
        this.instantiatesCanonical,
        this.requester,
        this.subject,
        this.meta,
        this.instantiatesUri,
        this.identifier,
        this.supportingInfo,
        newValue,
        this.reasonReference,
        this.resourceType,
        this.occurrenceTiming,
        this.encounter,
        this.relevantHistory,
        this.contained,
        this.modifierExtension,
        this.authoredOn,
        this.performer,
        this.priorRequest,
        this.groupIdentifier,
        this.reasonCode,
        this.note,
        this.basedOn,
        this.occurrenceDateTime,
        this.language,
        this.parameter,
        this.insurance,
        this.implicitRules,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceRequest#codeCodeableConcept() codeCodeableConcept} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for codeCodeableConcept
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceRequest withCodeCodeableConcept(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.codeCodeableConcept == value) return this;
    return new ImmutableDeviceRequest(
        this.status,
        this.priority,
        this.id,
        this.intent,
        this.codeReference,
        this.extension,
        this.occurrencePeriod,
        this.performerType,
        this.instantiatesCanonical,
        this.requester,
        this.subject,
        this.meta,
        this.instantiatesUri,
        this.identifier,
        this.supportingInfo,
        value,
        this.reasonReference,
        this.resourceType,
        this.occurrenceTiming,
        this.encounter,
        this.relevantHistory,
        this.contained,
        this.modifierExtension,
        this.authoredOn,
        this.performer,
        this.priorRequest,
        this.groupIdentifier,
        this.reasonCode,
        this.note,
        this.basedOn,
        this.occurrenceDateTime,
        this.language,
        this.parameter,
        this.insurance,
        this.implicitRules,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceRequest#reasonReference() reasonReference} attribute.
   * @param value The value for reasonReference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceRequest withReasonReference(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "reasonReference");
    if (this.reasonReference == newValue) return this;
    return new ImmutableDeviceRequest(
        this.status,
        this.priority,
        this.id,
        this.intent,
        this.codeReference,
        this.extension,
        this.occurrencePeriod,
        this.performerType,
        this.instantiatesCanonical,
        this.requester,
        this.subject,
        this.meta,
        this.instantiatesUri,
        this.identifier,
        this.supportingInfo,
        this.codeCodeableConcept,
        newValue,
        this.resourceType,
        this.occurrenceTiming,
        this.encounter,
        this.relevantHistory,
        this.contained,
        this.modifierExtension,
        this.authoredOn,
        this.performer,
        this.priorRequest,
        this.groupIdentifier,
        this.reasonCode,
        this.note,
        this.basedOn,
        this.occurrenceDateTime,
        this.language,
        this.parameter,
        this.insurance,
        this.implicitRules,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceRequest#reasonReference() reasonReference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for reasonReference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceRequest withReasonReference(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.reasonReference == value) return this;
    return new ImmutableDeviceRequest(
        this.status,
        this.priority,
        this.id,
        this.intent,
        this.codeReference,
        this.extension,
        this.occurrencePeriod,
        this.performerType,
        this.instantiatesCanonical,
        this.requester,
        this.subject,
        this.meta,
        this.instantiatesUri,
        this.identifier,
        this.supportingInfo,
        this.codeCodeableConcept,
        value,
        this.resourceType,
        this.occurrenceTiming,
        this.encounter,
        this.relevantHistory,
        this.contained,
        this.modifierExtension,
        this.authoredOn,
        this.performer,
        this.priorRequest,
        this.groupIdentifier,
        this.reasonCode,
        this.note,
        this.basedOn,
        this.occurrenceDateTime,
        this.language,
        this.parameter,
        this.insurance,
        this.implicitRules,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link DeviceRequest#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableDeviceRequest withResourceType(String value) {
    String newValue = Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableDeviceRequest(
        this.status,
        this.priority,
        this.id,
        this.intent,
        this.codeReference,
        this.extension,
        this.occurrencePeriod,
        this.performerType,
        this.instantiatesCanonical,
        this.requester,
        this.subject,
        this.meta,
        this.instantiatesUri,
        this.identifier,
        this.supportingInfo,
        this.codeCodeableConcept,
        this.reasonReference,
        newValue,
        this.occurrenceTiming,
        this.encounter,
        this.relevantHistory,
        this.contained,
        this.modifierExtension,
        this.authoredOn,
        this.performer,
        this.priorRequest,
        this.groupIdentifier,
        this.reasonCode,
        this.note,
        this.basedOn,
        this.occurrenceDateTime,
        this.language,
        this.parameter,
        this.insurance,
        this.implicitRules,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceRequest#occurrenceTiming() occurrenceTiming} attribute.
   * @param value The value for occurrenceTiming
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceRequest withOccurrenceTiming(Timing value) {
    @Nullable Timing newValue = Objects.requireNonNull(value, "occurrenceTiming");
    if (this.occurrenceTiming == newValue) return this;
    return new ImmutableDeviceRequest(
        this.status,
        this.priority,
        this.id,
        this.intent,
        this.codeReference,
        this.extension,
        this.occurrencePeriod,
        this.performerType,
        this.instantiatesCanonical,
        this.requester,
        this.subject,
        this.meta,
        this.instantiatesUri,
        this.identifier,
        this.supportingInfo,
        this.codeCodeableConcept,
        this.reasonReference,
        this.resourceType,
        newValue,
        this.encounter,
        this.relevantHistory,
        this.contained,
        this.modifierExtension,
        this.authoredOn,
        this.performer,
        this.priorRequest,
        this.groupIdentifier,
        this.reasonCode,
        this.note,
        this.basedOn,
        this.occurrenceDateTime,
        this.language,
        this.parameter,
        this.insurance,
        this.implicitRules,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceRequest#occurrenceTiming() occurrenceTiming} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for occurrenceTiming
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceRequest withOccurrenceTiming(Optional<? extends Timing> optional) {
    @Nullable Timing value = optional.orElse(null);
    if (this.occurrenceTiming == value) return this;
    return new ImmutableDeviceRequest(
        this.status,
        this.priority,
        this.id,
        this.intent,
        this.codeReference,
        this.extension,
        this.occurrencePeriod,
        this.performerType,
        this.instantiatesCanonical,
        this.requester,
        this.subject,
        this.meta,
        this.instantiatesUri,
        this.identifier,
        this.supportingInfo,
        this.codeCodeableConcept,
        this.reasonReference,
        this.resourceType,
        value,
        this.encounter,
        this.relevantHistory,
        this.contained,
        this.modifierExtension,
        this.authoredOn,
        this.performer,
        this.priorRequest,
        this.groupIdentifier,
        this.reasonCode,
        this.note,
        this.basedOn,
        this.occurrenceDateTime,
        this.language,
        this.parameter,
        this.insurance,
        this.implicitRules,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceRequest#encounter() encounter} attribute.
   * @param value The value for encounter
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceRequest withEncounter(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "encounter");
    if (this.encounter == newValue) return this;
    return new ImmutableDeviceRequest(
        this.status,
        this.priority,
        this.id,
        this.intent,
        this.codeReference,
        this.extension,
        this.occurrencePeriod,
        this.performerType,
        this.instantiatesCanonical,
        this.requester,
        this.subject,
        this.meta,
        this.instantiatesUri,
        this.identifier,
        this.supportingInfo,
        this.codeCodeableConcept,
        this.reasonReference,
        this.resourceType,
        this.occurrenceTiming,
        newValue,
        this.relevantHistory,
        this.contained,
        this.modifierExtension,
        this.authoredOn,
        this.performer,
        this.priorRequest,
        this.groupIdentifier,
        this.reasonCode,
        this.note,
        this.basedOn,
        this.occurrenceDateTime,
        this.language,
        this.parameter,
        this.insurance,
        this.implicitRules,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceRequest#encounter() encounter} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for encounter
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceRequest withEncounter(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.encounter == value) return this;
    return new ImmutableDeviceRequest(
        this.status,
        this.priority,
        this.id,
        this.intent,
        this.codeReference,
        this.extension,
        this.occurrencePeriod,
        this.performerType,
        this.instantiatesCanonical,
        this.requester,
        this.subject,
        this.meta,
        this.instantiatesUri,
        this.identifier,
        this.supportingInfo,
        this.codeCodeableConcept,
        this.reasonReference,
        this.resourceType,
        this.occurrenceTiming,
        value,
        this.relevantHistory,
        this.contained,
        this.modifierExtension,
        this.authoredOn,
        this.performer,
        this.priorRequest,
        this.groupIdentifier,
        this.reasonCode,
        this.note,
        this.basedOn,
        this.occurrenceDateTime,
        this.language,
        this.parameter,
        this.insurance,
        this.implicitRules,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceRequest#relevantHistory() relevantHistory} attribute.
   * @param value The value for relevantHistory
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceRequest withRelevantHistory(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "relevantHistory");
    if (this.relevantHistory == newValue) return this;
    return new ImmutableDeviceRequest(
        this.status,
        this.priority,
        this.id,
        this.intent,
        this.codeReference,
        this.extension,
        this.occurrencePeriod,
        this.performerType,
        this.instantiatesCanonical,
        this.requester,
        this.subject,
        this.meta,
        this.instantiatesUri,
        this.identifier,
        this.supportingInfo,
        this.codeCodeableConcept,
        this.reasonReference,
        this.resourceType,
        this.occurrenceTiming,
        this.encounter,
        newValue,
        this.contained,
        this.modifierExtension,
        this.authoredOn,
        this.performer,
        this.priorRequest,
        this.groupIdentifier,
        this.reasonCode,
        this.note,
        this.basedOn,
        this.occurrenceDateTime,
        this.language,
        this.parameter,
        this.insurance,
        this.implicitRules,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceRequest#relevantHistory() relevantHistory} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for relevantHistory
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceRequest withRelevantHistory(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.relevantHistory == value) return this;
    return new ImmutableDeviceRequest(
        this.status,
        this.priority,
        this.id,
        this.intent,
        this.codeReference,
        this.extension,
        this.occurrencePeriod,
        this.performerType,
        this.instantiatesCanonical,
        this.requester,
        this.subject,
        this.meta,
        this.instantiatesUri,
        this.identifier,
        this.supportingInfo,
        this.codeCodeableConcept,
        this.reasonReference,
        this.resourceType,
        this.occurrenceTiming,
        this.encounter,
        value,
        this.contained,
        this.modifierExtension,
        this.authoredOn,
        this.performer,
        this.priorRequest,
        this.groupIdentifier,
        this.reasonCode,
        this.note,
        this.basedOn,
        this.occurrenceDateTime,
        this.language,
        this.parameter,
        this.insurance,
        this.implicitRules,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceRequest#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceRequest withContained(List<ResourceList> value) {
    @Nullable List<ResourceList> newValue = Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableDeviceRequest(
        this.status,
        this.priority,
        this.id,
        this.intent,
        this.codeReference,
        this.extension,
        this.occurrencePeriod,
        this.performerType,
        this.instantiatesCanonical,
        this.requester,
        this.subject,
        this.meta,
        this.instantiatesUri,
        this.identifier,
        this.supportingInfo,
        this.codeCodeableConcept,
        this.reasonReference,
        this.resourceType,
        this.occurrenceTiming,
        this.encounter,
        this.relevantHistory,
        newValue,
        this.modifierExtension,
        this.authoredOn,
        this.performer,
        this.priorRequest,
        this.groupIdentifier,
        this.reasonCode,
        this.note,
        this.basedOn,
        this.occurrenceDateTime,
        this.language,
        this.parameter,
        this.insurance,
        this.implicitRules,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceRequest#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceRequest withContained(Optional<? extends List<ResourceList>> optional) {
    @Nullable List<ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableDeviceRequest(
        this.status,
        this.priority,
        this.id,
        this.intent,
        this.codeReference,
        this.extension,
        this.occurrencePeriod,
        this.performerType,
        this.instantiatesCanonical,
        this.requester,
        this.subject,
        this.meta,
        this.instantiatesUri,
        this.identifier,
        this.supportingInfo,
        this.codeCodeableConcept,
        this.reasonReference,
        this.resourceType,
        this.occurrenceTiming,
        this.encounter,
        this.relevantHistory,
        value,
        this.modifierExtension,
        this.authoredOn,
        this.performer,
        this.priorRequest,
        this.groupIdentifier,
        this.reasonCode,
        this.note,
        this.basedOn,
        this.occurrenceDateTime,
        this.language,
        this.parameter,
        this.insurance,
        this.implicitRules,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceRequest#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceRequest withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableDeviceRequest(
        this.status,
        this.priority,
        this.id,
        this.intent,
        this.codeReference,
        this.extension,
        this.occurrencePeriod,
        this.performerType,
        this.instantiatesCanonical,
        this.requester,
        this.subject,
        this.meta,
        this.instantiatesUri,
        this.identifier,
        this.supportingInfo,
        this.codeCodeableConcept,
        this.reasonReference,
        this.resourceType,
        this.occurrenceTiming,
        this.encounter,
        this.relevantHistory,
        this.contained,
        newValue,
        this.authoredOn,
        this.performer,
        this.priorRequest,
        this.groupIdentifier,
        this.reasonCode,
        this.note,
        this.basedOn,
        this.occurrenceDateTime,
        this.language,
        this.parameter,
        this.insurance,
        this.implicitRules,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceRequest#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceRequest withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableDeviceRequest(
        this.status,
        this.priority,
        this.id,
        this.intent,
        this.codeReference,
        this.extension,
        this.occurrencePeriod,
        this.performerType,
        this.instantiatesCanonical,
        this.requester,
        this.subject,
        this.meta,
        this.instantiatesUri,
        this.identifier,
        this.supportingInfo,
        this.codeCodeableConcept,
        this.reasonReference,
        this.resourceType,
        this.occurrenceTiming,
        this.encounter,
        this.relevantHistory,
        this.contained,
        value,
        this.authoredOn,
        this.performer,
        this.priorRequest,
        this.groupIdentifier,
        this.reasonCode,
        this.note,
        this.basedOn,
        this.occurrenceDateTime,
        this.language,
        this.parameter,
        this.insurance,
        this.implicitRules,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceRequest#authoredOn() authoredOn} attribute.
   * @param value The value for authoredOn
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceRequest withAuthoredOn(DateTime value) {
    @Nullable DateTime newValue = Objects.requireNonNull(value, "authoredOn");
    if (this.authoredOn == newValue) return this;
    return new ImmutableDeviceRequest(
        this.status,
        this.priority,
        this.id,
        this.intent,
        this.codeReference,
        this.extension,
        this.occurrencePeriod,
        this.performerType,
        this.instantiatesCanonical,
        this.requester,
        this.subject,
        this.meta,
        this.instantiatesUri,
        this.identifier,
        this.supportingInfo,
        this.codeCodeableConcept,
        this.reasonReference,
        this.resourceType,
        this.occurrenceTiming,
        this.encounter,
        this.relevantHistory,
        this.contained,
        this.modifierExtension,
        newValue,
        this.performer,
        this.priorRequest,
        this.groupIdentifier,
        this.reasonCode,
        this.note,
        this.basedOn,
        this.occurrenceDateTime,
        this.language,
        this.parameter,
        this.insurance,
        this.implicitRules,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceRequest#authoredOn() authoredOn} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for authoredOn
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceRequest withAuthoredOn(Optional<? extends DateTime> optional) {
    @Nullable DateTime value = optional.orElse(null);
    if (this.authoredOn == value) return this;
    return new ImmutableDeviceRequest(
        this.status,
        this.priority,
        this.id,
        this.intent,
        this.codeReference,
        this.extension,
        this.occurrencePeriod,
        this.performerType,
        this.instantiatesCanonical,
        this.requester,
        this.subject,
        this.meta,
        this.instantiatesUri,
        this.identifier,
        this.supportingInfo,
        this.codeCodeableConcept,
        this.reasonReference,
        this.resourceType,
        this.occurrenceTiming,
        this.encounter,
        this.relevantHistory,
        this.contained,
        this.modifierExtension,
        value,
        this.performer,
        this.priorRequest,
        this.groupIdentifier,
        this.reasonCode,
        this.note,
        this.basedOn,
        this.occurrenceDateTime,
        this.language,
        this.parameter,
        this.insurance,
        this.implicitRules,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceRequest#performer() performer} attribute.
   * @param value The value for performer
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceRequest withPerformer(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "performer");
    if (this.performer == newValue) return this;
    return new ImmutableDeviceRequest(
        this.status,
        this.priority,
        this.id,
        this.intent,
        this.codeReference,
        this.extension,
        this.occurrencePeriod,
        this.performerType,
        this.instantiatesCanonical,
        this.requester,
        this.subject,
        this.meta,
        this.instantiatesUri,
        this.identifier,
        this.supportingInfo,
        this.codeCodeableConcept,
        this.reasonReference,
        this.resourceType,
        this.occurrenceTiming,
        this.encounter,
        this.relevantHistory,
        this.contained,
        this.modifierExtension,
        this.authoredOn,
        newValue,
        this.priorRequest,
        this.groupIdentifier,
        this.reasonCode,
        this.note,
        this.basedOn,
        this.occurrenceDateTime,
        this.language,
        this.parameter,
        this.insurance,
        this.implicitRules,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceRequest#performer() performer} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for performer
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceRequest withPerformer(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.performer == value) return this;
    return new ImmutableDeviceRequest(
        this.status,
        this.priority,
        this.id,
        this.intent,
        this.codeReference,
        this.extension,
        this.occurrencePeriod,
        this.performerType,
        this.instantiatesCanonical,
        this.requester,
        this.subject,
        this.meta,
        this.instantiatesUri,
        this.identifier,
        this.supportingInfo,
        this.codeCodeableConcept,
        this.reasonReference,
        this.resourceType,
        this.occurrenceTiming,
        this.encounter,
        this.relevantHistory,
        this.contained,
        this.modifierExtension,
        this.authoredOn,
        value,
        this.priorRequest,
        this.groupIdentifier,
        this.reasonCode,
        this.note,
        this.basedOn,
        this.occurrenceDateTime,
        this.language,
        this.parameter,
        this.insurance,
        this.implicitRules,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceRequest#priorRequest() priorRequest} attribute.
   * @param value The value for priorRequest
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceRequest withPriorRequest(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "priorRequest");
    if (this.priorRequest == newValue) return this;
    return new ImmutableDeviceRequest(
        this.status,
        this.priority,
        this.id,
        this.intent,
        this.codeReference,
        this.extension,
        this.occurrencePeriod,
        this.performerType,
        this.instantiatesCanonical,
        this.requester,
        this.subject,
        this.meta,
        this.instantiatesUri,
        this.identifier,
        this.supportingInfo,
        this.codeCodeableConcept,
        this.reasonReference,
        this.resourceType,
        this.occurrenceTiming,
        this.encounter,
        this.relevantHistory,
        this.contained,
        this.modifierExtension,
        this.authoredOn,
        this.performer,
        newValue,
        this.groupIdentifier,
        this.reasonCode,
        this.note,
        this.basedOn,
        this.occurrenceDateTime,
        this.language,
        this.parameter,
        this.insurance,
        this.implicitRules,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceRequest#priorRequest() priorRequest} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for priorRequest
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceRequest withPriorRequest(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.priorRequest == value) return this;
    return new ImmutableDeviceRequest(
        this.status,
        this.priority,
        this.id,
        this.intent,
        this.codeReference,
        this.extension,
        this.occurrencePeriod,
        this.performerType,
        this.instantiatesCanonical,
        this.requester,
        this.subject,
        this.meta,
        this.instantiatesUri,
        this.identifier,
        this.supportingInfo,
        this.codeCodeableConcept,
        this.reasonReference,
        this.resourceType,
        this.occurrenceTiming,
        this.encounter,
        this.relevantHistory,
        this.contained,
        this.modifierExtension,
        this.authoredOn,
        this.performer,
        value,
        this.groupIdentifier,
        this.reasonCode,
        this.note,
        this.basedOn,
        this.occurrenceDateTime,
        this.language,
        this.parameter,
        this.insurance,
        this.implicitRules,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceRequest#groupIdentifier() groupIdentifier} attribute.
   * @param value The value for groupIdentifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceRequest withGroupIdentifier(Identifier value) {
    @Nullable Identifier newValue = Objects.requireNonNull(value, "groupIdentifier");
    if (this.groupIdentifier == newValue) return this;
    return new ImmutableDeviceRequest(
        this.status,
        this.priority,
        this.id,
        this.intent,
        this.codeReference,
        this.extension,
        this.occurrencePeriod,
        this.performerType,
        this.instantiatesCanonical,
        this.requester,
        this.subject,
        this.meta,
        this.instantiatesUri,
        this.identifier,
        this.supportingInfo,
        this.codeCodeableConcept,
        this.reasonReference,
        this.resourceType,
        this.occurrenceTiming,
        this.encounter,
        this.relevantHistory,
        this.contained,
        this.modifierExtension,
        this.authoredOn,
        this.performer,
        this.priorRequest,
        newValue,
        this.reasonCode,
        this.note,
        this.basedOn,
        this.occurrenceDateTime,
        this.language,
        this.parameter,
        this.insurance,
        this.implicitRules,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceRequest#groupIdentifier() groupIdentifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for groupIdentifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceRequest withGroupIdentifier(Optional<? extends Identifier> optional) {
    @Nullable Identifier value = optional.orElse(null);
    if (this.groupIdentifier == value) return this;
    return new ImmutableDeviceRequest(
        this.status,
        this.priority,
        this.id,
        this.intent,
        this.codeReference,
        this.extension,
        this.occurrencePeriod,
        this.performerType,
        this.instantiatesCanonical,
        this.requester,
        this.subject,
        this.meta,
        this.instantiatesUri,
        this.identifier,
        this.supportingInfo,
        this.codeCodeableConcept,
        this.reasonReference,
        this.resourceType,
        this.occurrenceTiming,
        this.encounter,
        this.relevantHistory,
        this.contained,
        this.modifierExtension,
        this.authoredOn,
        this.performer,
        this.priorRequest,
        value,
        this.reasonCode,
        this.note,
        this.basedOn,
        this.occurrenceDateTime,
        this.language,
        this.parameter,
        this.insurance,
        this.implicitRules,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceRequest#reasonCode() reasonCode} attribute.
   * @param value The value for reasonCode
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceRequest withReasonCode(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "reasonCode");
    if (this.reasonCode == newValue) return this;
    return new ImmutableDeviceRequest(
        this.status,
        this.priority,
        this.id,
        this.intent,
        this.codeReference,
        this.extension,
        this.occurrencePeriod,
        this.performerType,
        this.instantiatesCanonical,
        this.requester,
        this.subject,
        this.meta,
        this.instantiatesUri,
        this.identifier,
        this.supportingInfo,
        this.codeCodeableConcept,
        this.reasonReference,
        this.resourceType,
        this.occurrenceTiming,
        this.encounter,
        this.relevantHistory,
        this.contained,
        this.modifierExtension,
        this.authoredOn,
        this.performer,
        this.priorRequest,
        this.groupIdentifier,
        newValue,
        this.note,
        this.basedOn,
        this.occurrenceDateTime,
        this.language,
        this.parameter,
        this.insurance,
        this.implicitRules,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceRequest#reasonCode() reasonCode} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for reasonCode
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceRequest withReasonCode(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.reasonCode == value) return this;
    return new ImmutableDeviceRequest(
        this.status,
        this.priority,
        this.id,
        this.intent,
        this.codeReference,
        this.extension,
        this.occurrencePeriod,
        this.performerType,
        this.instantiatesCanonical,
        this.requester,
        this.subject,
        this.meta,
        this.instantiatesUri,
        this.identifier,
        this.supportingInfo,
        this.codeCodeableConcept,
        this.reasonReference,
        this.resourceType,
        this.occurrenceTiming,
        this.encounter,
        this.relevantHistory,
        this.contained,
        this.modifierExtension,
        this.authoredOn,
        this.performer,
        this.priorRequest,
        this.groupIdentifier,
        value,
        this.note,
        this.basedOn,
        this.occurrenceDateTime,
        this.language,
        this.parameter,
        this.insurance,
        this.implicitRules,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceRequest#note() note} attribute.
   * @param value The value for note
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceRequest withNote(List<Annotation> value) {
    @Nullable List<Annotation> newValue = Objects.requireNonNull(value, "note");
    if (this.note == newValue) return this;
    return new ImmutableDeviceRequest(
        this.status,
        this.priority,
        this.id,
        this.intent,
        this.codeReference,
        this.extension,
        this.occurrencePeriod,
        this.performerType,
        this.instantiatesCanonical,
        this.requester,
        this.subject,
        this.meta,
        this.instantiatesUri,
        this.identifier,
        this.supportingInfo,
        this.codeCodeableConcept,
        this.reasonReference,
        this.resourceType,
        this.occurrenceTiming,
        this.encounter,
        this.relevantHistory,
        this.contained,
        this.modifierExtension,
        this.authoredOn,
        this.performer,
        this.priorRequest,
        this.groupIdentifier,
        this.reasonCode,
        newValue,
        this.basedOn,
        this.occurrenceDateTime,
        this.language,
        this.parameter,
        this.insurance,
        this.implicitRules,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceRequest#note() note} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for note
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceRequest withNote(Optional<? extends List<Annotation>> optional) {
    @Nullable List<Annotation> value = optional.orElse(null);
    if (this.note == value) return this;
    return new ImmutableDeviceRequest(
        this.status,
        this.priority,
        this.id,
        this.intent,
        this.codeReference,
        this.extension,
        this.occurrencePeriod,
        this.performerType,
        this.instantiatesCanonical,
        this.requester,
        this.subject,
        this.meta,
        this.instantiatesUri,
        this.identifier,
        this.supportingInfo,
        this.codeCodeableConcept,
        this.reasonReference,
        this.resourceType,
        this.occurrenceTiming,
        this.encounter,
        this.relevantHistory,
        this.contained,
        this.modifierExtension,
        this.authoredOn,
        this.performer,
        this.priorRequest,
        this.groupIdentifier,
        this.reasonCode,
        value,
        this.basedOn,
        this.occurrenceDateTime,
        this.language,
        this.parameter,
        this.insurance,
        this.implicitRules,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceRequest#basedOn() basedOn} attribute.
   * @param value The value for basedOn
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceRequest withBasedOn(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "basedOn");
    if (this.basedOn == newValue) return this;
    return new ImmutableDeviceRequest(
        this.status,
        this.priority,
        this.id,
        this.intent,
        this.codeReference,
        this.extension,
        this.occurrencePeriod,
        this.performerType,
        this.instantiatesCanonical,
        this.requester,
        this.subject,
        this.meta,
        this.instantiatesUri,
        this.identifier,
        this.supportingInfo,
        this.codeCodeableConcept,
        this.reasonReference,
        this.resourceType,
        this.occurrenceTiming,
        this.encounter,
        this.relevantHistory,
        this.contained,
        this.modifierExtension,
        this.authoredOn,
        this.performer,
        this.priorRequest,
        this.groupIdentifier,
        this.reasonCode,
        this.note,
        newValue,
        this.occurrenceDateTime,
        this.language,
        this.parameter,
        this.insurance,
        this.implicitRules,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceRequest#basedOn() basedOn} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for basedOn
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceRequest withBasedOn(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.basedOn == value) return this;
    return new ImmutableDeviceRequest(
        this.status,
        this.priority,
        this.id,
        this.intent,
        this.codeReference,
        this.extension,
        this.occurrencePeriod,
        this.performerType,
        this.instantiatesCanonical,
        this.requester,
        this.subject,
        this.meta,
        this.instantiatesUri,
        this.identifier,
        this.supportingInfo,
        this.codeCodeableConcept,
        this.reasonReference,
        this.resourceType,
        this.occurrenceTiming,
        this.encounter,
        this.relevantHistory,
        this.contained,
        this.modifierExtension,
        this.authoredOn,
        this.performer,
        this.priorRequest,
        this.groupIdentifier,
        this.reasonCode,
        this.note,
        value,
        this.occurrenceDateTime,
        this.language,
        this.parameter,
        this.insurance,
        this.implicitRules,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceRequest#occurrenceDateTime() occurrenceDateTime} attribute.
   * @param value The value for occurrenceDateTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceRequest withOccurrenceDateTime(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "occurrenceDateTime");
    if (Objects.equals(this.occurrenceDateTime, newValue)) return this;
    return new ImmutableDeviceRequest(
        this.status,
        this.priority,
        this.id,
        this.intent,
        this.codeReference,
        this.extension,
        this.occurrencePeriod,
        this.performerType,
        this.instantiatesCanonical,
        this.requester,
        this.subject,
        this.meta,
        this.instantiatesUri,
        this.identifier,
        this.supportingInfo,
        this.codeCodeableConcept,
        this.reasonReference,
        this.resourceType,
        this.occurrenceTiming,
        this.encounter,
        this.relevantHistory,
        this.contained,
        this.modifierExtension,
        this.authoredOn,
        this.performer,
        this.priorRequest,
        this.groupIdentifier,
        this.reasonCode,
        this.note,
        this.basedOn,
        newValue,
        this.language,
        this.parameter,
        this.insurance,
        this.implicitRules,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceRequest#occurrenceDateTime() occurrenceDateTime} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for occurrenceDateTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceRequest withOccurrenceDateTime(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.occurrenceDateTime, value)) return this;
    return new ImmutableDeviceRequest(
        this.status,
        this.priority,
        this.id,
        this.intent,
        this.codeReference,
        this.extension,
        this.occurrencePeriod,
        this.performerType,
        this.instantiatesCanonical,
        this.requester,
        this.subject,
        this.meta,
        this.instantiatesUri,
        this.identifier,
        this.supportingInfo,
        this.codeCodeableConcept,
        this.reasonReference,
        this.resourceType,
        this.occurrenceTiming,
        this.encounter,
        this.relevantHistory,
        this.contained,
        this.modifierExtension,
        this.authoredOn,
        this.performer,
        this.priorRequest,
        this.groupIdentifier,
        this.reasonCode,
        this.note,
        this.basedOn,
        value,
        this.language,
        this.parameter,
        this.insurance,
        this.implicitRules,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceRequest#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceRequest withLanguage(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableDeviceRequest(
        this.status,
        this.priority,
        this.id,
        this.intent,
        this.codeReference,
        this.extension,
        this.occurrencePeriod,
        this.performerType,
        this.instantiatesCanonical,
        this.requester,
        this.subject,
        this.meta,
        this.instantiatesUri,
        this.identifier,
        this.supportingInfo,
        this.codeCodeableConcept,
        this.reasonReference,
        this.resourceType,
        this.occurrenceTiming,
        this.encounter,
        this.relevantHistory,
        this.contained,
        this.modifierExtension,
        this.authoredOn,
        this.performer,
        this.priorRequest,
        this.groupIdentifier,
        this.reasonCode,
        this.note,
        this.basedOn,
        this.occurrenceDateTime,
        newValue,
        this.parameter,
        this.insurance,
        this.implicitRules,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceRequest#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceRequest withLanguage(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableDeviceRequest(
        this.status,
        this.priority,
        this.id,
        this.intent,
        this.codeReference,
        this.extension,
        this.occurrencePeriod,
        this.performerType,
        this.instantiatesCanonical,
        this.requester,
        this.subject,
        this.meta,
        this.instantiatesUri,
        this.identifier,
        this.supportingInfo,
        this.codeCodeableConcept,
        this.reasonReference,
        this.resourceType,
        this.occurrenceTiming,
        this.encounter,
        this.relevantHistory,
        this.contained,
        this.modifierExtension,
        this.authoredOn,
        this.performer,
        this.priorRequest,
        this.groupIdentifier,
        this.reasonCode,
        this.note,
        this.basedOn,
        this.occurrenceDateTime,
        value,
        this.parameter,
        this.insurance,
        this.implicitRules,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceRequest#parameter() parameter} attribute.
   * @param value The value for parameter
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceRequest withParameter(List<DeviceRequest_Parameter> value) {
    @Nullable List<DeviceRequest_Parameter> newValue = Objects.requireNonNull(value, "parameter");
    if (this.parameter == newValue) return this;
    return new ImmutableDeviceRequest(
        this.status,
        this.priority,
        this.id,
        this.intent,
        this.codeReference,
        this.extension,
        this.occurrencePeriod,
        this.performerType,
        this.instantiatesCanonical,
        this.requester,
        this.subject,
        this.meta,
        this.instantiatesUri,
        this.identifier,
        this.supportingInfo,
        this.codeCodeableConcept,
        this.reasonReference,
        this.resourceType,
        this.occurrenceTiming,
        this.encounter,
        this.relevantHistory,
        this.contained,
        this.modifierExtension,
        this.authoredOn,
        this.performer,
        this.priorRequest,
        this.groupIdentifier,
        this.reasonCode,
        this.note,
        this.basedOn,
        this.occurrenceDateTime,
        this.language,
        newValue,
        this.insurance,
        this.implicitRules,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceRequest#parameter() parameter} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for parameter
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceRequest withParameter(Optional<? extends List<DeviceRequest_Parameter>> optional) {
    @Nullable List<DeviceRequest_Parameter> value = optional.orElse(null);
    if (this.parameter == value) return this;
    return new ImmutableDeviceRequest(
        this.status,
        this.priority,
        this.id,
        this.intent,
        this.codeReference,
        this.extension,
        this.occurrencePeriod,
        this.performerType,
        this.instantiatesCanonical,
        this.requester,
        this.subject,
        this.meta,
        this.instantiatesUri,
        this.identifier,
        this.supportingInfo,
        this.codeCodeableConcept,
        this.reasonReference,
        this.resourceType,
        this.occurrenceTiming,
        this.encounter,
        this.relevantHistory,
        this.contained,
        this.modifierExtension,
        this.authoredOn,
        this.performer,
        this.priorRequest,
        this.groupIdentifier,
        this.reasonCode,
        this.note,
        this.basedOn,
        this.occurrenceDateTime,
        this.language,
        value,
        this.insurance,
        this.implicitRules,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceRequest#insurance() insurance} attribute.
   * @param value The value for insurance
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceRequest withInsurance(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "insurance");
    if (this.insurance == newValue) return this;
    return new ImmutableDeviceRequest(
        this.status,
        this.priority,
        this.id,
        this.intent,
        this.codeReference,
        this.extension,
        this.occurrencePeriod,
        this.performerType,
        this.instantiatesCanonical,
        this.requester,
        this.subject,
        this.meta,
        this.instantiatesUri,
        this.identifier,
        this.supportingInfo,
        this.codeCodeableConcept,
        this.reasonReference,
        this.resourceType,
        this.occurrenceTiming,
        this.encounter,
        this.relevantHistory,
        this.contained,
        this.modifierExtension,
        this.authoredOn,
        this.performer,
        this.priorRequest,
        this.groupIdentifier,
        this.reasonCode,
        this.note,
        this.basedOn,
        this.occurrenceDateTime,
        this.language,
        this.parameter,
        newValue,
        this.implicitRules,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceRequest#insurance() insurance} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for insurance
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceRequest withInsurance(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.insurance == value) return this;
    return new ImmutableDeviceRequest(
        this.status,
        this.priority,
        this.id,
        this.intent,
        this.codeReference,
        this.extension,
        this.occurrencePeriod,
        this.performerType,
        this.instantiatesCanonical,
        this.requester,
        this.subject,
        this.meta,
        this.instantiatesUri,
        this.identifier,
        this.supportingInfo,
        this.codeCodeableConcept,
        this.reasonReference,
        this.resourceType,
        this.occurrenceTiming,
        this.encounter,
        this.relevantHistory,
        this.contained,
        this.modifierExtension,
        this.authoredOn,
        this.performer,
        this.priorRequest,
        this.groupIdentifier,
        this.reasonCode,
        this.note,
        this.basedOn,
        this.occurrenceDateTime,
        this.language,
        this.parameter,
        value,
        this.implicitRules,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceRequest#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceRequest withImplicitRules(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableDeviceRequest(
        this.status,
        this.priority,
        this.id,
        this.intent,
        this.codeReference,
        this.extension,
        this.occurrencePeriod,
        this.performerType,
        this.instantiatesCanonical,
        this.requester,
        this.subject,
        this.meta,
        this.instantiatesUri,
        this.identifier,
        this.supportingInfo,
        this.codeCodeableConcept,
        this.reasonReference,
        this.resourceType,
        this.occurrenceTiming,
        this.encounter,
        this.relevantHistory,
        this.contained,
        this.modifierExtension,
        this.authoredOn,
        this.performer,
        this.priorRequest,
        this.groupIdentifier,
        this.reasonCode,
        this.note,
        this.basedOn,
        this.occurrenceDateTime,
        this.language,
        this.parameter,
        this.insurance,
        newValue,
        this.text);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceRequest#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceRequest withImplicitRules(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableDeviceRequest(
        this.status,
        this.priority,
        this.id,
        this.intent,
        this.codeReference,
        this.extension,
        this.occurrencePeriod,
        this.performerType,
        this.instantiatesCanonical,
        this.requester,
        this.subject,
        this.meta,
        this.instantiatesUri,
        this.identifier,
        this.supportingInfo,
        this.codeCodeableConcept,
        this.reasonReference,
        this.resourceType,
        this.occurrenceTiming,
        this.encounter,
        this.relevantHistory,
        this.contained,
        this.modifierExtension,
        this.authoredOn,
        this.performer,
        this.priorRequest,
        this.groupIdentifier,
        this.reasonCode,
        this.note,
        this.basedOn,
        this.occurrenceDateTime,
        this.language,
        this.parameter,
        this.insurance,
        value,
        this.text);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DeviceRequest#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDeviceRequest withText(Narrative value) {
    @Nullable Narrative newValue = Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableDeviceRequest(
        this.status,
        this.priority,
        this.id,
        this.intent,
        this.codeReference,
        this.extension,
        this.occurrencePeriod,
        this.performerType,
        this.instantiatesCanonical,
        this.requester,
        this.subject,
        this.meta,
        this.instantiatesUri,
        this.identifier,
        this.supportingInfo,
        this.codeCodeableConcept,
        this.reasonReference,
        this.resourceType,
        this.occurrenceTiming,
        this.encounter,
        this.relevantHistory,
        this.contained,
        this.modifierExtension,
        this.authoredOn,
        this.performer,
        this.priorRequest,
        this.groupIdentifier,
        this.reasonCode,
        this.note,
        this.basedOn,
        this.occurrenceDateTime,
        this.language,
        this.parameter,
        this.insurance,
        this.implicitRules,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DeviceRequest#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDeviceRequest withText(Optional<? extends Narrative> optional) {
    @Nullable Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableDeviceRequest(
        this.status,
        this.priority,
        this.id,
        this.intent,
        this.codeReference,
        this.extension,
        this.occurrencePeriod,
        this.performerType,
        this.instantiatesCanonical,
        this.requester,
        this.subject,
        this.meta,
        this.instantiatesUri,
        this.identifier,
        this.supportingInfo,
        this.codeCodeableConcept,
        this.reasonReference,
        this.resourceType,
        this.occurrenceTiming,
        this.encounter,
        this.relevantHistory,
        this.contained,
        this.modifierExtension,
        this.authoredOn,
        this.performer,
        this.priorRequest,
        this.groupIdentifier,
        this.reasonCode,
        this.note,
        this.basedOn,
        this.occurrenceDateTime,
        this.language,
        this.parameter,
        this.insurance,
        this.implicitRules,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableDeviceRequest} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableDeviceRequest
        && equalTo((ImmutableDeviceRequest) another);
  }

  private boolean equalTo(ImmutableDeviceRequest another) {
    return Objects.equals(status, another.status)
        && Objects.equals(priority, another.priority)
        && Objects.equals(id, another.id)
        && Objects.equals(intent, another.intent)
        && Objects.equals(codeReference, another.codeReference)
        && Objects.equals(extension, another.extension)
        && Objects.equals(occurrencePeriod, another.occurrencePeriod)
        && Objects.equals(performerType, another.performerType)
        && Objects.equals(instantiatesCanonical, another.instantiatesCanonical)
        && Objects.equals(requester, another.requester)
        && subject.equals(another.subject)
        && Objects.equals(meta, another.meta)
        && Objects.equals(instantiatesUri, another.instantiatesUri)
        && Objects.equals(identifier, another.identifier)
        && Objects.equals(supportingInfo, another.supportingInfo)
        && Objects.equals(codeCodeableConcept, another.codeCodeableConcept)
        && Objects.equals(reasonReference, another.reasonReference)
        && resourceType.equals(another.resourceType)
        && Objects.equals(occurrenceTiming, another.occurrenceTiming)
        && Objects.equals(encounter, another.encounter)
        && Objects.equals(relevantHistory, another.relevantHistory)
        && Objects.equals(contained, another.contained)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(authoredOn, another.authoredOn)
        && Objects.equals(performer, another.performer)
        && Objects.equals(priorRequest, another.priorRequest)
        && Objects.equals(groupIdentifier, another.groupIdentifier)
        && Objects.equals(reasonCode, another.reasonCode)
        && Objects.equals(note, another.note)
        && Objects.equals(basedOn, another.basedOn)
        && Objects.equals(occurrenceDateTime, another.occurrenceDateTime)
        && Objects.equals(language, another.language)
        && Objects.equals(parameter, another.parameter)
        && Objects.equals(insurance, another.insurance)
        && Objects.equals(implicitRules, another.implicitRules)
        && Objects.equals(text, another.text);
  }

  /**
   * Computes a hash code from attributes: {@code status}, {@code priority}, {@code id}, {@code intent}, {@code codeReference}, {@code extension}, {@code occurrencePeriod}, {@code performerType}, {@code instantiatesCanonical}, {@code requester}, {@code subject}, {@code meta}, {@code instantiatesUri}, {@code identifier}, {@code supportingInfo}, {@code codeCodeableConcept}, {@code reasonReference}, {@code resourceType}, {@code occurrenceTiming}, {@code encounter}, {@code relevantHistory}, {@code contained}, {@code modifierExtension}, {@code authoredOn}, {@code performer}, {@code priorRequest}, {@code groupIdentifier}, {@code reasonCode}, {@code note}, {@code basedOn}, {@code occurrenceDateTime}, {@code language}, {@code parameter}, {@code insurance}, {@code implicitRules}, {@code text}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(status);
    h += (h << 5) + Objects.hashCode(priority);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(intent);
    h += (h << 5) + Objects.hashCode(codeReference);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(occurrencePeriod);
    h += (h << 5) + Objects.hashCode(performerType);
    h += (h << 5) + Objects.hashCode(instantiatesCanonical);
    h += (h << 5) + Objects.hashCode(requester);
    h += (h << 5) + subject.hashCode();
    h += (h << 5) + Objects.hashCode(meta);
    h += (h << 5) + Objects.hashCode(instantiatesUri);
    h += (h << 5) + Objects.hashCode(identifier);
    h += (h << 5) + Objects.hashCode(supportingInfo);
    h += (h << 5) + Objects.hashCode(codeCodeableConcept);
    h += (h << 5) + Objects.hashCode(reasonReference);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + Objects.hashCode(occurrenceTiming);
    h += (h << 5) + Objects.hashCode(encounter);
    h += (h << 5) + Objects.hashCode(relevantHistory);
    h += (h << 5) + Objects.hashCode(contained);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(authoredOn);
    h += (h << 5) + Objects.hashCode(performer);
    h += (h << 5) + Objects.hashCode(priorRequest);
    h += (h << 5) + Objects.hashCode(groupIdentifier);
    h += (h << 5) + Objects.hashCode(reasonCode);
    h += (h << 5) + Objects.hashCode(note);
    h += (h << 5) + Objects.hashCode(basedOn);
    h += (h << 5) + Objects.hashCode(occurrenceDateTime);
    h += (h << 5) + Objects.hashCode(language);
    h += (h << 5) + Objects.hashCode(parameter);
    h += (h << 5) + Objects.hashCode(insurance);
    h += (h << 5) + Objects.hashCode(implicitRules);
    h += (h << 5) + Objects.hashCode(text);
    return h;
  }

  /**
   * Prints the immutable value {@code DeviceRequest} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("DeviceRequest{");
    if (status != null) {
      builder.append("status=").append(status);
    }
    if (priority != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("priority=").append(priority);
    }
    if (id != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (intent != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("intent=").append(intent);
    }
    if (codeReference != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("codeReference=").append(codeReference);
    }
    if (extension != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (occurrencePeriod != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("occurrencePeriod=").append(occurrencePeriod);
    }
    if (performerType != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("performerType=").append(performerType);
    }
    if (instantiatesCanonical != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("instantiatesCanonical=").append(instantiatesCanonical);
    }
    if (requester != null) {
      if (builder.length() > 14) builder.append(", ");
      builder.append("requester=").append(requester);
    }
    if (builder.length() > 14) builder.append(", ");
    builder.append("subject=").append(subject);
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (instantiatesUri != null) {
      builder.append(", ");
      builder.append("instantiatesUri=").append(instantiatesUri);
    }
    if (identifier != null) {
      builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (supportingInfo != null) {
      builder.append(", ");
      builder.append("supportingInfo=").append(supportingInfo);
    }
    if (codeCodeableConcept != null) {
      builder.append(", ");
      builder.append("codeCodeableConcept=").append(codeCodeableConcept);
    }
    if (reasonReference != null) {
      builder.append(", ");
      builder.append("reasonReference=").append(reasonReference);
    }
    builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (occurrenceTiming != null) {
      builder.append(", ");
      builder.append("occurrenceTiming=").append(occurrenceTiming);
    }
    if (encounter != null) {
      builder.append(", ");
      builder.append("encounter=").append(encounter);
    }
    if (relevantHistory != null) {
      builder.append(", ");
      builder.append("relevantHistory=").append(relevantHistory);
    }
    if (contained != null) {
      builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (authoredOn != null) {
      builder.append(", ");
      builder.append("authoredOn=").append(authoredOn);
    }
    if (performer != null) {
      builder.append(", ");
      builder.append("performer=").append(performer);
    }
    if (priorRequest != null) {
      builder.append(", ");
      builder.append("priorRequest=").append(priorRequest);
    }
    if (groupIdentifier != null) {
      builder.append(", ");
      builder.append("groupIdentifier=").append(groupIdentifier);
    }
    if (reasonCode != null) {
      builder.append(", ");
      builder.append("reasonCode=").append(reasonCode);
    }
    if (note != null) {
      builder.append(", ");
      builder.append("note=").append(note);
    }
    if (basedOn != null) {
      builder.append(", ");
      builder.append("basedOn=").append(basedOn);
    }
    if (occurrenceDateTime != null) {
      builder.append(", ");
      builder.append("occurrenceDateTime=").append(occurrenceDateTime);
    }
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (parameter != null) {
      builder.append(", ");
      builder.append("parameter=").append(parameter);
    }
    if (insurance != null) {
      builder.append(", ");
      builder.append("insurance=").append(insurance);
    }
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (text != null) {
      builder.append(", ");
      builder.append("text=").append(text);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "DeviceRequest", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements DeviceRequest {
    @Nullable Optional<Code> status = Optional.empty();
    boolean statusIsSet;
    @Nullable Optional<Code> priority = Optional.empty();
    boolean priorityIsSet;
    @Nullable Optional<Id> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<Code> intent = Optional.empty();
    boolean intentIsSet;
    @Nullable Optional<Reference> codeReference = Optional.empty();
    boolean codeReferenceIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<Period> occurrencePeriod = Optional.empty();
    boolean occurrencePeriodIsSet;
    @Nullable Optional<CodeableConcept> performerType = Optional.empty();
    boolean performerTypeIsSet;
    @Nullable Optional<List<Canonical>> instantiatesCanonical = Optional.empty();
    boolean instantiatesCanonicalIsSet;
    @Nullable Optional<Reference> requester = Optional.empty();
    boolean requesterIsSet;
    @Nullable Reference subject;
    @Nullable Optional<Meta> meta = Optional.empty();
    boolean metaIsSet;
    @Nullable Optional<List<Uri>> instantiatesUri = Optional.empty();
    boolean instantiatesUriIsSet;
    @Nullable Optional<List<Identifier>> identifier = Optional.empty();
    boolean identifierIsSet;
    @Nullable Optional<List<Reference>> supportingInfo = Optional.empty();
    boolean supportingInfoIsSet;
    @Nullable Optional<CodeableConcept> codeCodeableConcept = Optional.empty();
    boolean codeCodeableConceptIsSet;
    @Nullable Optional<List<Reference>> reasonReference = Optional.empty();
    boolean reasonReferenceIsSet;
    @Nullable String resourceType;
    @Nullable Optional<Timing> occurrenceTiming = Optional.empty();
    boolean occurrenceTimingIsSet;
    @Nullable Optional<Reference> encounter = Optional.empty();
    boolean encounterIsSet;
    @Nullable Optional<List<Reference>> relevantHistory = Optional.empty();
    boolean relevantHistoryIsSet;
    @Nullable Optional<List<ResourceList>> contained = Optional.empty();
    boolean containedIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<DateTime> authoredOn = Optional.empty();
    boolean authoredOnIsSet;
    @Nullable Optional<Reference> performer = Optional.empty();
    boolean performerIsSet;
    @Nullable Optional<List<Reference>> priorRequest = Optional.empty();
    boolean priorRequestIsSet;
    @Nullable Optional<Identifier> groupIdentifier = Optional.empty();
    boolean groupIdentifierIsSet;
    @Nullable Optional<List<CodeableConcept>> reasonCode = Optional.empty();
    boolean reasonCodeIsSet;
    @Nullable Optional<List<Annotation>> note = Optional.empty();
    boolean noteIsSet;
    @Nullable Optional<List<Reference>> basedOn = Optional.empty();
    boolean basedOnIsSet;
    @Nullable Optional<String> occurrenceDateTime = Optional.empty();
    boolean occurrenceDateTimeIsSet;
    @Nullable Optional<Code> language = Optional.empty();
    boolean languageIsSet;
    @Nullable Optional<List<DeviceRequest_Parameter>> parameter = Optional.empty();
    boolean parameterIsSet;
    @Nullable Optional<List<Reference>> insurance = Optional.empty();
    boolean insuranceIsSet;
    @Nullable Optional<Uri> implicitRules = Optional.empty();
    boolean implicitRulesIsSet;
    @Nullable Optional<Narrative> text = Optional.empty();
    boolean textIsSet;
    @JsonProperty("status")
    public void setStatus(Optional<Code> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @JsonProperty("priority")
    public void setPriority(Optional<Code> priority) {
      this.priority = priority;
      this.priorityIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<Id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("intent")
    public void setIntent(Optional<Code> intent) {
      this.intent = intent;
      this.intentIsSet = true;
    }
    @JsonProperty("codeReference")
    public void setCodeReference(Optional<Reference> codeReference) {
      this.codeReference = codeReference;
      this.codeReferenceIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("occurrencePeriod")
    public void setOccurrencePeriod(Optional<Period> occurrencePeriod) {
      this.occurrencePeriod = occurrencePeriod;
      this.occurrencePeriodIsSet = true;
    }
    @JsonProperty("performerType")
    public void setPerformerType(Optional<CodeableConcept> performerType) {
      this.performerType = performerType;
      this.performerTypeIsSet = true;
    }
    @JsonProperty("instantiatesCanonical")
    public void setInstantiatesCanonical(Optional<List<Canonical>> instantiatesCanonical) {
      this.instantiatesCanonical = instantiatesCanonical;
      this.instantiatesCanonicalIsSet = true;
    }
    @JsonProperty("requester")
    public void setRequester(Optional<Reference> requester) {
      this.requester = requester;
      this.requesterIsSet = true;
    }
    @JsonProperty("subject")
    public void setSubject(Reference subject) {
      this.subject = subject;
    }
    @JsonProperty("meta")
    public void setMeta(Optional<Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @JsonProperty("instantiatesUri")
    public void setInstantiatesUri(Optional<List<Uri>> instantiatesUri) {
      this.instantiatesUri = instantiatesUri;
      this.instantiatesUriIsSet = true;
    }
    @JsonProperty("identifier")
    public void setIdentifier(Optional<List<Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @JsonProperty("supportingInfo")
    public void setSupportingInfo(Optional<List<Reference>> supportingInfo) {
      this.supportingInfo = supportingInfo;
      this.supportingInfoIsSet = true;
    }
    @JsonProperty("codeCodeableConcept")
    public void setCodeCodeableConcept(Optional<CodeableConcept> codeCodeableConcept) {
      this.codeCodeableConcept = codeCodeableConcept;
      this.codeCodeableConceptIsSet = true;
    }
    @JsonProperty("reasonReference")
    public void setReasonReference(Optional<List<Reference>> reasonReference) {
      this.reasonReference = reasonReference;
      this.reasonReferenceIsSet = true;
    }
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
      this.resourceType = resourceType;
    }
    @JsonProperty("occurrenceTiming")
    public void setOccurrenceTiming(Optional<Timing> occurrenceTiming) {
      this.occurrenceTiming = occurrenceTiming;
      this.occurrenceTimingIsSet = true;
    }
    @JsonProperty("encounter")
    public void setEncounter(Optional<Reference> encounter) {
      this.encounter = encounter;
      this.encounterIsSet = true;
    }
    @JsonProperty("relevantHistory")
    public void setRelevantHistory(Optional<List<Reference>> relevantHistory) {
      this.relevantHistory = relevantHistory;
      this.relevantHistoryIsSet = true;
    }
    @JsonProperty("contained")
    public void setContained(Optional<List<ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("authoredOn")
    public void setAuthoredOn(Optional<DateTime> authoredOn) {
      this.authoredOn = authoredOn;
      this.authoredOnIsSet = true;
    }
    @JsonProperty("performer")
    public void setPerformer(Optional<Reference> performer) {
      this.performer = performer;
      this.performerIsSet = true;
    }
    @JsonProperty("priorRequest")
    public void setPriorRequest(Optional<List<Reference>> priorRequest) {
      this.priorRequest = priorRequest;
      this.priorRequestIsSet = true;
    }
    @JsonProperty("groupIdentifier")
    public void setGroupIdentifier(Optional<Identifier> groupIdentifier) {
      this.groupIdentifier = groupIdentifier;
      this.groupIdentifierIsSet = true;
    }
    @JsonProperty("reasonCode")
    public void setReasonCode(Optional<List<CodeableConcept>> reasonCode) {
      this.reasonCode = reasonCode;
      this.reasonCodeIsSet = true;
    }
    @JsonProperty("note")
    public void setNote(Optional<List<Annotation>> note) {
      this.note = note;
      this.noteIsSet = true;
    }
    @JsonProperty("basedOn")
    public void setBasedOn(Optional<List<Reference>> basedOn) {
      this.basedOn = basedOn;
      this.basedOnIsSet = true;
    }
    @JsonProperty("occurrenceDateTime")
    public void setOccurrenceDateTime(Optional<String> occurrenceDateTime) {
      this.occurrenceDateTime = occurrenceDateTime;
      this.occurrenceDateTimeIsSet = true;
    }
    @JsonProperty("language")
    public void setLanguage(Optional<Code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @JsonProperty("parameter")
    public void setParameter(Optional<List<DeviceRequest_Parameter>> parameter) {
      this.parameter = parameter;
      this.parameterIsSet = true;
    }
    @JsonProperty("insurance")
    public void setInsurance(Optional<List<Reference>> insurance) {
      this.insurance = insurance;
      this.insuranceIsSet = true;
    }
    @JsonProperty("implicitRules")
    public void setImplicitRules(Optional<Uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @JsonProperty("text")
    public void setText(Optional<Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @Override
    public Optional<Code> status() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> priority() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> intent() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> codeReference() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Period> occurrencePeriod() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> performerType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Canonical>> instantiatesCanonical() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> requester() { throw new UnsupportedOperationException(); }
    @Override
    public Reference subject() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Uri>> instantiatesUri() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> supportingInfo() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> codeCodeableConcept() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> reasonReference() { throw new UnsupportedOperationException(); }
    @Override
    public String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Timing> occurrenceTiming() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> encounter() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> relevantHistory() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<DateTime> authoredOn() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> performer() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> priorRequest() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Identifier> groupIdentifier() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> reasonCode() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Annotation>> note() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> basedOn() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> occurrenceDateTime() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> language() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<DeviceRequest_Parameter>> parameter() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> insurance() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Narrative> text() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableDeviceRequest fromJson(Json json) {
    ImmutableDeviceRequest.Builder builder = ((ImmutableDeviceRequest.Builder) ImmutableDeviceRequest.builder());
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.priorityIsSet) {
      builder.priority(json.priority);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.intentIsSet) {
      builder.intent(json.intent);
    }
    if (json.codeReferenceIsSet) {
      builder.codeReference(json.codeReference);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.occurrencePeriodIsSet) {
      builder.occurrencePeriod(json.occurrencePeriod);
    }
    if (json.performerTypeIsSet) {
      builder.performerType(json.performerType);
    }
    if (json.instantiatesCanonicalIsSet) {
      builder.instantiatesCanonical(json.instantiatesCanonical);
    }
    if (json.requesterIsSet) {
      builder.requester(json.requester);
    }
    if (json.subject != null) {
      builder.subject(json.subject);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.instantiatesUriIsSet) {
      builder.instantiatesUri(json.instantiatesUri);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.supportingInfoIsSet) {
      builder.supportingInfo(json.supportingInfo);
    }
    if (json.codeCodeableConceptIsSet) {
      builder.codeCodeableConcept(json.codeCodeableConcept);
    }
    if (json.reasonReferenceIsSet) {
      builder.reasonReference(json.reasonReference);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.occurrenceTimingIsSet) {
      builder.occurrenceTiming(json.occurrenceTiming);
    }
    if (json.encounterIsSet) {
      builder.encounter(json.encounter);
    }
    if (json.relevantHistoryIsSet) {
      builder.relevantHistory(json.relevantHistory);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.authoredOnIsSet) {
      builder.authoredOn(json.authoredOn);
    }
    if (json.performerIsSet) {
      builder.performer(json.performer);
    }
    if (json.priorRequestIsSet) {
      builder.priorRequest(json.priorRequest);
    }
    if (json.groupIdentifierIsSet) {
      builder.groupIdentifier(json.groupIdentifier);
    }
    if (json.reasonCodeIsSet) {
      builder.reasonCode(json.reasonCode);
    }
    if (json.noteIsSet) {
      builder.note(json.note);
    }
    if (json.basedOnIsSet) {
      builder.basedOn(json.basedOn);
    }
    if (json.occurrenceDateTimeIsSet) {
      builder.occurrenceDateTime(json.occurrenceDateTime);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.parameterIsSet) {
      builder.parameter(json.parameter);
    }
    if (json.insuranceIsSet) {
      builder.insurance(json.insurance);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    return (ImmutableDeviceRequest) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link DeviceRequest} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable DeviceRequest instance
   */
  public static DeviceRequest copyOf(DeviceRequest instance) {
    if (instance instanceof ImmutableDeviceRequest) {
      return (ImmutableDeviceRequest) instance;
    }
    return ((ImmutableDeviceRequest.Builder) ImmutableDeviceRequest.builder())
        .status(instance.status())
        .priority(instance.priority())
        .id(instance.id())
        .intent(instance.intent())
        .codeReference(instance.codeReference())
        .extension(instance.extension())
        .occurrencePeriod(instance.occurrencePeriod())
        .performerType(instance.performerType())
        .instantiatesCanonical(instance.instantiatesCanonical())
        .requester(instance.requester())
        .subject(instance.subject())
        .meta(instance.meta())
        .instantiatesUri(instance.instantiatesUri())
        .identifier(instance.identifier())
        .supportingInfo(instance.supportingInfo())
        .codeCodeableConcept(instance.codeCodeableConcept())
        .reasonReference(instance.reasonReference())
        .resourceType(instance.resourceType())
        .occurrenceTiming(instance.occurrenceTiming())
        .encounter(instance.encounter())
        .relevantHistory(instance.relevantHistory())
        .contained(instance.contained())
        .modifierExtension(instance.modifierExtension())
        .authoredOn(instance.authoredOn())
        .performer(instance.performer())
        .priorRequest(instance.priorRequest())
        .groupIdentifier(instance.groupIdentifier())
        .reasonCode(instance.reasonCode())
        .note(instance.note())
        .basedOn(instance.basedOn())
        .occurrenceDateTime(instance.occurrenceDateTime())
        .language(instance.language())
        .parameter(instance.parameter())
        .insurance(instance.insurance())
        .implicitRules(instance.implicitRules())
        .text(instance.text())
        .build();
  }

  /**
   * Creates a builder for {@link DeviceRequest DeviceRequest}.
   * <pre>
   * ImmutableDeviceRequest.builder()
   *    .status(com.fhir.types.fhir.Code) // optional {@link DeviceRequest#status() status}
   *    .priority(com.fhir.types.fhir.Code) // optional {@link DeviceRequest#priority() priority}
   *    .id(com.fhir.types.fhir.Id) // optional {@link DeviceRequest#id() id}
   *    .intent(com.fhir.types.fhir.Code) // optional {@link DeviceRequest#intent() intent}
   *    .codeReference(com.fhir.types.fhir.Reference) // optional {@link DeviceRequest#codeReference() codeReference}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link DeviceRequest#extension() extension}
   *    .occurrencePeriod(com.fhir.types.fhir.Period) // optional {@link DeviceRequest#occurrencePeriod() occurrencePeriod}
   *    .performerType(com.fhir.types.fhir.CodeableConcept) // optional {@link DeviceRequest#performerType() performerType}
   *    .instantiatesCanonical(List&amp;lt;com.fhir.types.fhir.Canonical&amp;gt;) // optional {@link DeviceRequest#instantiatesCanonical() instantiatesCanonical}
   *    .requester(com.fhir.types.fhir.Reference) // optional {@link DeviceRequest#requester() requester}
   *    .subject(com.fhir.types.fhir.Reference) // required {@link DeviceRequest#subject() subject}
   *    .meta(com.fhir.types.fhir.Meta) // optional {@link DeviceRequest#meta() meta}
   *    .instantiatesUri(List&amp;lt;com.fhir.types.fhir.Uri&amp;gt;) // optional {@link DeviceRequest#instantiatesUri() instantiatesUri}
   *    .identifier(List&amp;lt;com.fhir.types.fhir.Identifier&amp;gt;) // optional {@link DeviceRequest#identifier() identifier}
   *    .supportingInfo(List&amp;lt;com.fhir.types.fhir.Reference&amp;gt;) // optional {@link DeviceRequest#supportingInfo() supportingInfo}
   *    .codeCodeableConcept(com.fhir.types.fhir.CodeableConcept) // optional {@link DeviceRequest#codeCodeableConcept() codeCodeableConcept}
   *    .reasonReference(List&amp;lt;com.fhir.types.fhir.Reference&amp;gt;) // optional {@link DeviceRequest#reasonReference() reasonReference}
   *    .resourceType(String) // required {@link DeviceRequest#resourceType() resourceType}
   *    .occurrenceTiming(com.fhir.types.fhir.Timing) // optional {@link DeviceRequest#occurrenceTiming() occurrenceTiming}
   *    .encounter(com.fhir.types.fhir.Reference) // optional {@link DeviceRequest#encounter() encounter}
   *    .relevantHistory(List&amp;lt;com.fhir.types.fhir.Reference&amp;gt;) // optional {@link DeviceRequest#relevantHistory() relevantHistory}
   *    .contained(List&amp;lt;com.fhir.types.fhir.ResourceList&amp;gt;) // optional {@link DeviceRequest#contained() contained}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link DeviceRequest#modifierExtension() modifierExtension}
   *    .authoredOn(com.fhir.types.fhir.DateTime) // optional {@link DeviceRequest#authoredOn() authoredOn}
   *    .performer(com.fhir.types.fhir.Reference) // optional {@link DeviceRequest#performer() performer}
   *    .priorRequest(List&amp;lt;com.fhir.types.fhir.Reference&amp;gt;) // optional {@link DeviceRequest#priorRequest() priorRequest}
   *    .groupIdentifier(com.fhir.types.fhir.Identifier) // optional {@link DeviceRequest#groupIdentifier() groupIdentifier}
   *    .reasonCode(List&amp;lt;com.fhir.types.fhir.CodeableConcept&amp;gt;) // optional {@link DeviceRequest#reasonCode() reasonCode}
   *    .note(List&amp;lt;com.fhir.types.fhir.Annotation&amp;gt;) // optional {@link DeviceRequest#note() note}
   *    .basedOn(List&amp;lt;com.fhir.types.fhir.Reference&amp;gt;) // optional {@link DeviceRequest#basedOn() basedOn}
   *    .occurrenceDateTime(String) // optional {@link DeviceRequest#occurrenceDateTime() occurrenceDateTime}
   *    .language(com.fhir.types.fhir.Code) // optional {@link DeviceRequest#language() language}
   *    .parameter(List&amp;lt;com.fhir.types.fhir.DeviceRequest_Parameter&amp;gt;) // optional {@link DeviceRequest#parameter() parameter}
   *    .insurance(List&amp;lt;com.fhir.types.fhir.Reference&amp;gt;) // optional {@link DeviceRequest#insurance() insurance}
   *    .implicitRules(com.fhir.types.fhir.Uri) // optional {@link DeviceRequest#implicitRules() implicitRules}
   *    .text(com.fhir.types.fhir.Narrative) // optional {@link DeviceRequest#text() text}
   *    .build();
   * </pre>
   * @return A new DeviceRequest builder
   */
  public static SubjectBuildStage builder() {
    return new ImmutableDeviceRequest.Builder();
  }

  /**
   * Builds instances of type {@link DeviceRequest DeviceRequest}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "DeviceRequest", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements SubjectBuildStage, ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_SUBJECT = 0x1L;
    private static final long INIT_BIT_RESOURCE_TYPE = 0x2L;
    private static final long OPT_BIT_STATUS = 0x1L;
    private static final long OPT_BIT_PRIORITY = 0x2L;
    private static final long OPT_BIT_ID = 0x4L;
    private static final long OPT_BIT_INTENT = 0x8L;
    private static final long OPT_BIT_CODE_REFERENCE = 0x10L;
    private static final long OPT_BIT_EXTENSION = 0x20L;
    private static final long OPT_BIT_OCCURRENCE_PERIOD = 0x40L;
    private static final long OPT_BIT_PERFORMER_TYPE = 0x80L;
    private static final long OPT_BIT_INSTANTIATES_CANONICAL = 0x100L;
    private static final long OPT_BIT_REQUESTER = 0x200L;
    private static final long OPT_BIT_META = 0x400L;
    private static final long OPT_BIT_INSTANTIATES_URI = 0x800L;
    private static final long OPT_BIT_IDENTIFIER = 0x1000L;
    private static final long OPT_BIT_SUPPORTING_INFO = 0x2000L;
    private static final long OPT_BIT_CODE_CODEABLE_CONCEPT = 0x4000L;
    private static final long OPT_BIT_REASON_REFERENCE = 0x8000L;
    private static final long OPT_BIT_OCCURRENCE_TIMING = 0x10000L;
    private static final long OPT_BIT_ENCOUNTER = 0x20000L;
    private static final long OPT_BIT_RELEVANT_HISTORY = 0x40000L;
    private static final long OPT_BIT_CONTAINED = 0x80000L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x100000L;
    private static final long OPT_BIT_AUTHORED_ON = 0x200000L;
    private static final long OPT_BIT_PERFORMER = 0x400000L;
    private static final long OPT_BIT_PRIOR_REQUEST = 0x800000L;
    private static final long OPT_BIT_GROUP_IDENTIFIER = 0x1000000L;
    private static final long OPT_BIT_REASON_CODE = 0x2000000L;
    private static final long OPT_BIT_NOTE = 0x4000000L;
    private static final long OPT_BIT_BASED_ON = 0x8000000L;
    private static final long OPT_BIT_OCCURRENCE_DATE_TIME = 0x10000000L;
    private static final long OPT_BIT_LANGUAGE = 0x20000000L;
    private static final long OPT_BIT_PARAMETER = 0x40000000L;
    private static final long OPT_BIT_INSURANCE = 0x80000000L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x100000000L;
    private static final long OPT_BIT_TEXT = 0x200000000L;
    private long initBits = 0x3L;
    private long optBits;

    private @Nullable Code status;
    private @Nullable Code priority;
    private @Nullable Id id;
    private @Nullable Code intent;
    private @Nullable Reference codeReference;
    private @Nullable List<Extension> extension;
    private @Nullable Period occurrencePeriod;
    private @Nullable CodeableConcept performerType;
    private @Nullable List<Canonical> instantiatesCanonical;
    private @Nullable Reference requester;
    private @Nullable Reference subject;
    private @Nullable Meta meta;
    private @Nullable List<Uri> instantiatesUri;
    private @Nullable List<Identifier> identifier;
    private @Nullable List<Reference> supportingInfo;
    private @Nullable CodeableConcept codeCodeableConcept;
    private @Nullable List<Reference> reasonReference;
    private @Nullable String resourceType;
    private @Nullable Timing occurrenceTiming;
    private @Nullable Reference encounter;
    private @Nullable List<Reference> relevantHistory;
    private @Nullable List<ResourceList> contained;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable DateTime authoredOn;
    private @Nullable Reference performer;
    private @Nullable List<Reference> priorRequest;
    private @Nullable Identifier groupIdentifier;
    private @Nullable List<CodeableConcept> reasonCode;
    private @Nullable List<Annotation> note;
    private @Nullable List<Reference> basedOn;
    private @Nullable String occurrenceDateTime;
    private @Nullable Code language;
    private @Nullable List<DeviceRequest_Parameter> parameter;
    private @Nullable List<Reference> insurance;
    private @Nullable Uri implicitRules;
    private @Nullable Narrative text;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link DeviceRequest#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(Code status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceRequest#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("status")
    public final Builder status(Optional<? extends Code> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceRequest#priority() priority} to priority.
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
     * Initializes the optional value {@link DeviceRequest#priority() priority} to priority.
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
     * Initializes the optional value {@link DeviceRequest#id() id} to id.
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
     * Initializes the optional value {@link DeviceRequest#id() id} to id.
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
     * Initializes the optional value {@link DeviceRequest#intent() intent} to intent.
     * @param intent The value for intent
     * @return {@code this} builder for chained invocation
     */
    public final Builder intent(Code intent) {
      checkNotIsSet(intentIsSet(), "intent");
      this.intent = Objects.requireNonNull(intent, "intent");
      optBits |= OPT_BIT_INTENT;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceRequest#intent() intent} to intent.
     * @param intent The value for intent
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("intent")
    public final Builder intent(Optional<? extends Code> intent) {
      checkNotIsSet(intentIsSet(), "intent");
      this.intent = intent.orElse(null);
      optBits |= OPT_BIT_INTENT;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceRequest#codeReference() codeReference} to codeReference.
     * @param codeReference The value for codeReference
     * @return {@code this} builder for chained invocation
     */
    public final Builder codeReference(Reference codeReference) {
      checkNotIsSet(codeReferenceIsSet(), "codeReference");
      this.codeReference = Objects.requireNonNull(codeReference, "codeReference");
      optBits |= OPT_BIT_CODE_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceRequest#codeReference() codeReference} to codeReference.
     * @param codeReference The value for codeReference
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("codeReference")
    public final Builder codeReference(Optional<? extends Reference> codeReference) {
      checkNotIsSet(codeReferenceIsSet(), "codeReference");
      this.codeReference = codeReference.orElse(null);
      optBits |= OPT_BIT_CODE_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceRequest#extension() extension} to extension.
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
     * Initializes the optional value {@link DeviceRequest#extension() extension} to extension.
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
     * Initializes the optional value {@link DeviceRequest#occurrencePeriod() occurrencePeriod} to occurrencePeriod.
     * @param occurrencePeriod The value for occurrencePeriod
     * @return {@code this} builder for chained invocation
     */
    public final Builder occurrencePeriod(Period occurrencePeriod) {
      checkNotIsSet(occurrencePeriodIsSet(), "occurrencePeriod");
      this.occurrencePeriod = Objects.requireNonNull(occurrencePeriod, "occurrencePeriod");
      optBits |= OPT_BIT_OCCURRENCE_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceRequest#occurrencePeriod() occurrencePeriod} to occurrencePeriod.
     * @param occurrencePeriod The value for occurrencePeriod
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("occurrencePeriod")
    public final Builder occurrencePeriod(Optional<? extends Period> occurrencePeriod) {
      checkNotIsSet(occurrencePeriodIsSet(), "occurrencePeriod");
      this.occurrencePeriod = occurrencePeriod.orElse(null);
      optBits |= OPT_BIT_OCCURRENCE_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceRequest#performerType() performerType} to performerType.
     * @param performerType The value for performerType
     * @return {@code this} builder for chained invocation
     */
    public final Builder performerType(CodeableConcept performerType) {
      checkNotIsSet(performerTypeIsSet(), "performerType");
      this.performerType = Objects.requireNonNull(performerType, "performerType");
      optBits |= OPT_BIT_PERFORMER_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceRequest#performerType() performerType} to performerType.
     * @param performerType The value for performerType
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("performerType")
    public final Builder performerType(Optional<? extends CodeableConcept> performerType) {
      checkNotIsSet(performerTypeIsSet(), "performerType");
      this.performerType = performerType.orElse(null);
      optBits |= OPT_BIT_PERFORMER_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceRequest#instantiatesCanonical() instantiatesCanonical} to instantiatesCanonical.
     * @param instantiatesCanonical The value for instantiatesCanonical
     * @return {@code this} builder for chained invocation
     */
    public final Builder instantiatesCanonical(List<Canonical> instantiatesCanonical) {
      checkNotIsSet(instantiatesCanonicalIsSet(), "instantiatesCanonical");
      this.instantiatesCanonical = Objects.requireNonNull(instantiatesCanonical, "instantiatesCanonical");
      optBits |= OPT_BIT_INSTANTIATES_CANONICAL;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceRequest#instantiatesCanonical() instantiatesCanonical} to instantiatesCanonical.
     * @param instantiatesCanonical The value for instantiatesCanonical
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("instantiatesCanonical")
    public final Builder instantiatesCanonical(Optional<? extends List<Canonical>> instantiatesCanonical) {
      checkNotIsSet(instantiatesCanonicalIsSet(), "instantiatesCanonical");
      this.instantiatesCanonical = instantiatesCanonical.orElse(null);
      optBits |= OPT_BIT_INSTANTIATES_CANONICAL;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceRequest#requester() requester} to requester.
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
     * Initializes the optional value {@link DeviceRequest#requester() requester} to requester.
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
     * Initializes the value for the {@link DeviceRequest#subject() subject} attribute.
     * @param subject The value for subject 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("subject")
    public final Builder subject(Reference subject) {
      checkNotIsSet(subjectIsSet(), "subject");
      this.subject = Objects.requireNonNull(subject, "subject");
      initBits &= ~INIT_BIT_SUBJECT;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceRequest#meta() meta} to meta.
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
     * Initializes the optional value {@link DeviceRequest#meta() meta} to meta.
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
     * Initializes the optional value {@link DeviceRequest#instantiatesUri() instantiatesUri} to instantiatesUri.
     * @param instantiatesUri The value for instantiatesUri
     * @return {@code this} builder for chained invocation
     */
    public final Builder instantiatesUri(List<Uri> instantiatesUri) {
      checkNotIsSet(instantiatesUriIsSet(), "instantiatesUri");
      this.instantiatesUri = Objects.requireNonNull(instantiatesUri, "instantiatesUri");
      optBits |= OPT_BIT_INSTANTIATES_URI;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceRequest#instantiatesUri() instantiatesUri} to instantiatesUri.
     * @param instantiatesUri The value for instantiatesUri
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("instantiatesUri")
    public final Builder instantiatesUri(Optional<? extends List<Uri>> instantiatesUri) {
      checkNotIsSet(instantiatesUriIsSet(), "instantiatesUri");
      this.instantiatesUri = instantiatesUri.orElse(null);
      optBits |= OPT_BIT_INSTANTIATES_URI;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceRequest#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link DeviceRequest#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link DeviceRequest#supportingInfo() supportingInfo} to supportingInfo.
     * @param supportingInfo The value for supportingInfo
     * @return {@code this} builder for chained invocation
     */
    public final Builder supportingInfo(List<Reference> supportingInfo) {
      checkNotIsSet(supportingInfoIsSet(), "supportingInfo");
      this.supportingInfo = Objects.requireNonNull(supportingInfo, "supportingInfo");
      optBits |= OPT_BIT_SUPPORTING_INFO;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceRequest#supportingInfo() supportingInfo} to supportingInfo.
     * @param supportingInfo The value for supportingInfo
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("supportingInfo")
    public final Builder supportingInfo(Optional<? extends List<Reference>> supportingInfo) {
      checkNotIsSet(supportingInfoIsSet(), "supportingInfo");
      this.supportingInfo = supportingInfo.orElse(null);
      optBits |= OPT_BIT_SUPPORTING_INFO;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceRequest#codeCodeableConcept() codeCodeableConcept} to codeCodeableConcept.
     * @param codeCodeableConcept The value for codeCodeableConcept
     * @return {@code this} builder for chained invocation
     */
    public final Builder codeCodeableConcept(CodeableConcept codeCodeableConcept) {
      checkNotIsSet(codeCodeableConceptIsSet(), "codeCodeableConcept");
      this.codeCodeableConcept = Objects.requireNonNull(codeCodeableConcept, "codeCodeableConcept");
      optBits |= OPT_BIT_CODE_CODEABLE_CONCEPT;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceRequest#codeCodeableConcept() codeCodeableConcept} to codeCodeableConcept.
     * @param codeCodeableConcept The value for codeCodeableConcept
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("codeCodeableConcept")
    public final Builder codeCodeableConcept(Optional<? extends CodeableConcept> codeCodeableConcept) {
      checkNotIsSet(codeCodeableConceptIsSet(), "codeCodeableConcept");
      this.codeCodeableConcept = codeCodeableConcept.orElse(null);
      optBits |= OPT_BIT_CODE_CODEABLE_CONCEPT;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceRequest#reasonReference() reasonReference} to reasonReference.
     * @param reasonReference The value for reasonReference
     * @return {@code this} builder for chained invocation
     */
    public final Builder reasonReference(List<Reference> reasonReference) {
      checkNotIsSet(reasonReferenceIsSet(), "reasonReference");
      this.reasonReference = Objects.requireNonNull(reasonReference, "reasonReference");
      optBits |= OPT_BIT_REASON_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceRequest#reasonReference() reasonReference} to reasonReference.
     * @param reasonReference The value for reasonReference
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("reasonReference")
    public final Builder reasonReference(Optional<? extends List<Reference>> reasonReference) {
      checkNotIsSet(reasonReferenceIsSet(), "reasonReference");
      this.reasonReference = reasonReference.orElse(null);
      optBits |= OPT_BIT_REASON_REFERENCE;
      return this;
    }

    /**
     * Initializes the value for the {@link DeviceRequest#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link DeviceRequest#occurrenceTiming() occurrenceTiming} to occurrenceTiming.
     * @param occurrenceTiming The value for occurrenceTiming
     * @return {@code this} builder for chained invocation
     */
    public final Builder occurrenceTiming(Timing occurrenceTiming) {
      checkNotIsSet(occurrenceTimingIsSet(), "occurrenceTiming");
      this.occurrenceTiming = Objects.requireNonNull(occurrenceTiming, "occurrenceTiming");
      optBits |= OPT_BIT_OCCURRENCE_TIMING;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceRequest#occurrenceTiming() occurrenceTiming} to occurrenceTiming.
     * @param occurrenceTiming The value for occurrenceTiming
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("occurrenceTiming")
    public final Builder occurrenceTiming(Optional<? extends Timing> occurrenceTiming) {
      checkNotIsSet(occurrenceTimingIsSet(), "occurrenceTiming");
      this.occurrenceTiming = occurrenceTiming.orElse(null);
      optBits |= OPT_BIT_OCCURRENCE_TIMING;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceRequest#encounter() encounter} to encounter.
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
     * Initializes the optional value {@link DeviceRequest#encounter() encounter} to encounter.
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
     * Initializes the optional value {@link DeviceRequest#relevantHistory() relevantHistory} to relevantHistory.
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
     * Initializes the optional value {@link DeviceRequest#relevantHistory() relevantHistory} to relevantHistory.
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
     * Initializes the optional value {@link DeviceRequest#contained() contained} to contained.
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
     * Initializes the optional value {@link DeviceRequest#contained() contained} to contained.
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
     * Initializes the optional value {@link DeviceRequest#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link DeviceRequest#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link DeviceRequest#authoredOn() authoredOn} to authoredOn.
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
     * Initializes the optional value {@link DeviceRequest#authoredOn() authoredOn} to authoredOn.
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
     * Initializes the optional value {@link DeviceRequest#performer() performer} to performer.
     * @param performer The value for performer
     * @return {@code this} builder for chained invocation
     */
    public final Builder performer(Reference performer) {
      checkNotIsSet(performerIsSet(), "performer");
      this.performer = Objects.requireNonNull(performer, "performer");
      optBits |= OPT_BIT_PERFORMER;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceRequest#performer() performer} to performer.
     * @param performer The value for performer
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("performer")
    public final Builder performer(Optional<? extends Reference> performer) {
      checkNotIsSet(performerIsSet(), "performer");
      this.performer = performer.orElse(null);
      optBits |= OPT_BIT_PERFORMER;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceRequest#priorRequest() priorRequest} to priorRequest.
     * @param priorRequest The value for priorRequest
     * @return {@code this} builder for chained invocation
     */
    public final Builder priorRequest(List<Reference> priorRequest) {
      checkNotIsSet(priorRequestIsSet(), "priorRequest");
      this.priorRequest = Objects.requireNonNull(priorRequest, "priorRequest");
      optBits |= OPT_BIT_PRIOR_REQUEST;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceRequest#priorRequest() priorRequest} to priorRequest.
     * @param priorRequest The value for priorRequest
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("priorRequest")
    public final Builder priorRequest(Optional<? extends List<Reference>> priorRequest) {
      checkNotIsSet(priorRequestIsSet(), "priorRequest");
      this.priorRequest = priorRequest.orElse(null);
      optBits |= OPT_BIT_PRIOR_REQUEST;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceRequest#groupIdentifier() groupIdentifier} to groupIdentifier.
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
     * Initializes the optional value {@link DeviceRequest#groupIdentifier() groupIdentifier} to groupIdentifier.
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
     * Initializes the optional value {@link DeviceRequest#reasonCode() reasonCode} to reasonCode.
     * @param reasonCode The value for reasonCode
     * @return {@code this} builder for chained invocation
     */
    public final Builder reasonCode(List<CodeableConcept> reasonCode) {
      checkNotIsSet(reasonCodeIsSet(), "reasonCode");
      this.reasonCode = Objects.requireNonNull(reasonCode, "reasonCode");
      optBits |= OPT_BIT_REASON_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceRequest#reasonCode() reasonCode} to reasonCode.
     * @param reasonCode The value for reasonCode
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("reasonCode")
    public final Builder reasonCode(Optional<? extends List<CodeableConcept>> reasonCode) {
      checkNotIsSet(reasonCodeIsSet(), "reasonCode");
      this.reasonCode = reasonCode.orElse(null);
      optBits |= OPT_BIT_REASON_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceRequest#note() note} to note.
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
     * Initializes the optional value {@link DeviceRequest#note() note} to note.
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
     * Initializes the optional value {@link DeviceRequest#basedOn() basedOn} to basedOn.
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
     * Initializes the optional value {@link DeviceRequest#basedOn() basedOn} to basedOn.
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
     * Initializes the optional value {@link DeviceRequest#occurrenceDateTime() occurrenceDateTime} to occurrenceDateTime.
     * @param occurrenceDateTime The value for occurrenceDateTime
     * @return {@code this} builder for chained invocation
     */
    public final Builder occurrenceDateTime(String occurrenceDateTime) {
      checkNotIsSet(occurrenceDateTimeIsSet(), "occurrenceDateTime");
      this.occurrenceDateTime = Objects.requireNonNull(occurrenceDateTime, "occurrenceDateTime");
      optBits |= OPT_BIT_OCCURRENCE_DATE_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceRequest#occurrenceDateTime() occurrenceDateTime} to occurrenceDateTime.
     * @param occurrenceDateTime The value for occurrenceDateTime
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("occurrenceDateTime")
    public final Builder occurrenceDateTime(Optional<String> occurrenceDateTime) {
      checkNotIsSet(occurrenceDateTimeIsSet(), "occurrenceDateTime");
      this.occurrenceDateTime = occurrenceDateTime.orElse(null);
      optBits |= OPT_BIT_OCCURRENCE_DATE_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceRequest#language() language} to language.
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
     * Initializes the optional value {@link DeviceRequest#language() language} to language.
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
     * Initializes the optional value {@link DeviceRequest#parameter() parameter} to parameter.
     * @param parameter The value for parameter
     * @return {@code this} builder for chained invocation
     */
    public final Builder parameter(List<DeviceRequest_Parameter> parameter) {
      checkNotIsSet(parameterIsSet(), "parameter");
      this.parameter = Objects.requireNonNull(parameter, "parameter");
      optBits |= OPT_BIT_PARAMETER;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceRequest#parameter() parameter} to parameter.
     * @param parameter The value for parameter
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("parameter")
    public final Builder parameter(Optional<? extends List<DeviceRequest_Parameter>> parameter) {
      checkNotIsSet(parameterIsSet(), "parameter");
      this.parameter = parameter.orElse(null);
      optBits |= OPT_BIT_PARAMETER;
      return this;
    }

    /**
     * Initializes the optional value {@link DeviceRequest#insurance() insurance} to insurance.
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
     * Initializes the optional value {@link DeviceRequest#insurance() insurance} to insurance.
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
     * Initializes the optional value {@link DeviceRequest#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link DeviceRequest#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link DeviceRequest#text() text} to text.
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
     * Initializes the optional value {@link DeviceRequest#text() text} to text.
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
     * Builds a new {@link DeviceRequest DeviceRequest}.
     * @return An immutable instance of DeviceRequest
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public DeviceRequest build() {
      checkRequiredAttributes();
      return new ImmutableDeviceRequest(
          status,
          priority,
          id,
          intent,
          codeReference,
          extension,
          occurrencePeriod,
          performerType,
          instantiatesCanonical,
          requester,
          subject,
          meta,
          instantiatesUri,
          identifier,
          supportingInfo,
          codeCodeableConcept,
          reasonReference,
          resourceType,
          occurrenceTiming,
          encounter,
          relevantHistory,
          contained,
          modifierExtension,
          authoredOn,
          performer,
          priorRequest,
          groupIdentifier,
          reasonCode,
          note,
          basedOn,
          occurrenceDateTime,
          language,
          parameter,
          insurance,
          implicitRules,
          text);
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean priorityIsSet() {
      return (optBits & OPT_BIT_PRIORITY) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean intentIsSet() {
      return (optBits & OPT_BIT_INTENT) != 0;
    }

    private boolean codeReferenceIsSet() {
      return (optBits & OPT_BIT_CODE_REFERENCE) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean occurrencePeriodIsSet() {
      return (optBits & OPT_BIT_OCCURRENCE_PERIOD) != 0;
    }

    private boolean performerTypeIsSet() {
      return (optBits & OPT_BIT_PERFORMER_TYPE) != 0;
    }

    private boolean instantiatesCanonicalIsSet() {
      return (optBits & OPT_BIT_INSTANTIATES_CANONICAL) != 0;
    }

    private boolean requesterIsSet() {
      return (optBits & OPT_BIT_REQUESTER) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean instantiatesUriIsSet() {
      return (optBits & OPT_BIT_INSTANTIATES_URI) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean supportingInfoIsSet() {
      return (optBits & OPT_BIT_SUPPORTING_INFO) != 0;
    }

    private boolean codeCodeableConceptIsSet() {
      return (optBits & OPT_BIT_CODE_CODEABLE_CONCEPT) != 0;
    }

    private boolean reasonReferenceIsSet() {
      return (optBits & OPT_BIT_REASON_REFERENCE) != 0;
    }

    private boolean occurrenceTimingIsSet() {
      return (optBits & OPT_BIT_OCCURRENCE_TIMING) != 0;
    }

    private boolean encounterIsSet() {
      return (optBits & OPT_BIT_ENCOUNTER) != 0;
    }

    private boolean relevantHistoryIsSet() {
      return (optBits & OPT_BIT_RELEVANT_HISTORY) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean authoredOnIsSet() {
      return (optBits & OPT_BIT_AUTHORED_ON) != 0;
    }

    private boolean performerIsSet() {
      return (optBits & OPT_BIT_PERFORMER) != 0;
    }

    private boolean priorRequestIsSet() {
      return (optBits & OPT_BIT_PRIOR_REQUEST) != 0;
    }

    private boolean groupIdentifierIsSet() {
      return (optBits & OPT_BIT_GROUP_IDENTIFIER) != 0;
    }

    private boolean reasonCodeIsSet() {
      return (optBits & OPT_BIT_REASON_CODE) != 0;
    }

    private boolean noteIsSet() {
      return (optBits & OPT_BIT_NOTE) != 0;
    }

    private boolean basedOnIsSet() {
      return (optBits & OPT_BIT_BASED_ON) != 0;
    }

    private boolean occurrenceDateTimeIsSet() {
      return (optBits & OPT_BIT_OCCURRENCE_DATE_TIME) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean parameterIsSet() {
      return (optBits & OPT_BIT_PARAMETER) != 0;
    }

    private boolean insuranceIsSet() {
      return (optBits & OPT_BIT_INSURANCE) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean subjectIsSet() {
      return (initBits & INIT_BIT_SUBJECT) == 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of DeviceRequest is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!subjectIsSet()) attributes.add("subject");
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build DeviceRequest, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "DeviceRequest", generator = "Immutables")
  public interface SubjectBuildStage {
    /**
     * Initializes the value for the {@link DeviceRequest#subject() subject} attribute.
     * @param subject The value for subject 
     * @return {@code this} builder for use in a chained invocation
     */
    ResourceTypeBuildStage subject(Reference subject);
  }

  @Generated(from = "DeviceRequest", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link DeviceRequest#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(String resourceType);
  }

  @Generated(from = "DeviceRequest", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link DeviceRequest#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(Code status);

    /**
     * Initializes the optional value {@link DeviceRequest#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(Optional<? extends Code> status);

    /**
     * Initializes the optional value {@link DeviceRequest#priority() priority} to priority.
     * @param priority The value for priority
     * @return {@code this} builder for chained invocation
     */
    BuildFinal priority(Code priority);

    /**
     * Initializes the optional value {@link DeviceRequest#priority() priority} to priority.
     * @param priority The value for priority
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal priority(Optional<? extends Code> priority);

    /**
     * Initializes the optional value {@link DeviceRequest#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(Id id);

    /**
     * Initializes the optional value {@link DeviceRequest#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<? extends Id> id);

    /**
     * Initializes the optional value {@link DeviceRequest#intent() intent} to intent.
     * @param intent The value for intent
     * @return {@code this} builder for chained invocation
     */
    BuildFinal intent(Code intent);

    /**
     * Initializes the optional value {@link DeviceRequest#intent() intent} to intent.
     * @param intent The value for intent
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal intent(Optional<? extends Code> intent);

    /**
     * Initializes the optional value {@link DeviceRequest#codeReference() codeReference} to codeReference.
     * @param codeReference The value for codeReference
     * @return {@code this} builder for chained invocation
     */
    BuildFinal codeReference(Reference codeReference);

    /**
     * Initializes the optional value {@link DeviceRequest#codeReference() codeReference} to codeReference.
     * @param codeReference The value for codeReference
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal codeReference(Optional<? extends Reference> codeReference);

    /**
     * Initializes the optional value {@link DeviceRequest#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link DeviceRequest#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link DeviceRequest#occurrencePeriod() occurrencePeriod} to occurrencePeriod.
     * @param occurrencePeriod The value for occurrencePeriod
     * @return {@code this} builder for chained invocation
     */
    BuildFinal occurrencePeriod(Period occurrencePeriod);

    /**
     * Initializes the optional value {@link DeviceRequest#occurrencePeriod() occurrencePeriod} to occurrencePeriod.
     * @param occurrencePeriod The value for occurrencePeriod
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal occurrencePeriod(Optional<? extends Period> occurrencePeriod);

    /**
     * Initializes the optional value {@link DeviceRequest#performerType() performerType} to performerType.
     * @param performerType The value for performerType
     * @return {@code this} builder for chained invocation
     */
    BuildFinal performerType(CodeableConcept performerType);

    /**
     * Initializes the optional value {@link DeviceRequest#performerType() performerType} to performerType.
     * @param performerType The value for performerType
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal performerType(Optional<? extends CodeableConcept> performerType);

    /**
     * Initializes the optional value {@link DeviceRequest#instantiatesCanonical() instantiatesCanonical} to instantiatesCanonical.
     * @param instantiatesCanonical The value for instantiatesCanonical
     * @return {@code this} builder for chained invocation
     */
    BuildFinal instantiatesCanonical(List<Canonical> instantiatesCanonical);

    /**
     * Initializes the optional value {@link DeviceRequest#instantiatesCanonical() instantiatesCanonical} to instantiatesCanonical.
     * @param instantiatesCanonical The value for instantiatesCanonical
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal instantiatesCanonical(Optional<? extends List<Canonical>> instantiatesCanonical);

    /**
     * Initializes the optional value {@link DeviceRequest#requester() requester} to requester.
     * @param requester The value for requester
     * @return {@code this} builder for chained invocation
     */
    BuildFinal requester(Reference requester);

    /**
     * Initializes the optional value {@link DeviceRequest#requester() requester} to requester.
     * @param requester The value for requester
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal requester(Optional<? extends Reference> requester);

    /**
     * Initializes the optional value {@link DeviceRequest#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(Meta meta);

    /**
     * Initializes the optional value {@link DeviceRequest#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(Optional<? extends Meta> meta);

    /**
     * Initializes the optional value {@link DeviceRequest#instantiatesUri() instantiatesUri} to instantiatesUri.
     * @param instantiatesUri The value for instantiatesUri
     * @return {@code this} builder for chained invocation
     */
    BuildFinal instantiatesUri(List<Uri> instantiatesUri);

    /**
     * Initializes the optional value {@link DeviceRequest#instantiatesUri() instantiatesUri} to instantiatesUri.
     * @param instantiatesUri The value for instantiatesUri
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal instantiatesUri(Optional<? extends List<Uri>> instantiatesUri);

    /**
     * Initializes the optional value {@link DeviceRequest#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(List<Identifier> identifier);

    /**
     * Initializes the optional value {@link DeviceRequest#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(Optional<? extends List<Identifier>> identifier);

    /**
     * Initializes the optional value {@link DeviceRequest#supportingInfo() supportingInfo} to supportingInfo.
     * @param supportingInfo The value for supportingInfo
     * @return {@code this} builder for chained invocation
     */
    BuildFinal supportingInfo(List<Reference> supportingInfo);

    /**
     * Initializes the optional value {@link DeviceRequest#supportingInfo() supportingInfo} to supportingInfo.
     * @param supportingInfo The value for supportingInfo
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal supportingInfo(Optional<? extends List<Reference>> supportingInfo);

    /**
     * Initializes the optional value {@link DeviceRequest#codeCodeableConcept() codeCodeableConcept} to codeCodeableConcept.
     * @param codeCodeableConcept The value for codeCodeableConcept
     * @return {@code this} builder for chained invocation
     */
    BuildFinal codeCodeableConcept(CodeableConcept codeCodeableConcept);

    /**
     * Initializes the optional value {@link DeviceRequest#codeCodeableConcept() codeCodeableConcept} to codeCodeableConcept.
     * @param codeCodeableConcept The value for codeCodeableConcept
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal codeCodeableConcept(Optional<? extends CodeableConcept> codeCodeableConcept);

    /**
     * Initializes the optional value {@link DeviceRequest#reasonReference() reasonReference} to reasonReference.
     * @param reasonReference The value for reasonReference
     * @return {@code this} builder for chained invocation
     */
    BuildFinal reasonReference(List<Reference> reasonReference);

    /**
     * Initializes the optional value {@link DeviceRequest#reasonReference() reasonReference} to reasonReference.
     * @param reasonReference The value for reasonReference
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal reasonReference(Optional<? extends List<Reference>> reasonReference);

    /**
     * Initializes the optional value {@link DeviceRequest#occurrenceTiming() occurrenceTiming} to occurrenceTiming.
     * @param occurrenceTiming The value for occurrenceTiming
     * @return {@code this} builder for chained invocation
     */
    BuildFinal occurrenceTiming(Timing occurrenceTiming);

    /**
     * Initializes the optional value {@link DeviceRequest#occurrenceTiming() occurrenceTiming} to occurrenceTiming.
     * @param occurrenceTiming The value for occurrenceTiming
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal occurrenceTiming(Optional<? extends Timing> occurrenceTiming);

    /**
     * Initializes the optional value {@link DeviceRequest#encounter() encounter} to encounter.
     * @param encounter The value for encounter
     * @return {@code this} builder for chained invocation
     */
    BuildFinal encounter(Reference encounter);

    /**
     * Initializes the optional value {@link DeviceRequest#encounter() encounter} to encounter.
     * @param encounter The value for encounter
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal encounter(Optional<? extends Reference> encounter);

    /**
     * Initializes the optional value {@link DeviceRequest#relevantHistory() relevantHistory} to relevantHistory.
     * @param relevantHistory The value for relevantHistory
     * @return {@code this} builder for chained invocation
     */
    BuildFinal relevantHistory(List<Reference> relevantHistory);

    /**
     * Initializes the optional value {@link DeviceRequest#relevantHistory() relevantHistory} to relevantHistory.
     * @param relevantHistory The value for relevantHistory
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal relevantHistory(Optional<? extends List<Reference>> relevantHistory);

    /**
     * Initializes the optional value {@link DeviceRequest#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(List<ResourceList> contained);

    /**
     * Initializes the optional value {@link DeviceRequest#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(Optional<? extends List<ResourceList>> contained);

    /**
     * Initializes the optional value {@link DeviceRequest#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link DeviceRequest#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link DeviceRequest#authoredOn() authoredOn} to authoredOn.
     * @param authoredOn The value for authoredOn
     * @return {@code this} builder for chained invocation
     */
    BuildFinal authoredOn(DateTime authoredOn);

    /**
     * Initializes the optional value {@link DeviceRequest#authoredOn() authoredOn} to authoredOn.
     * @param authoredOn The value for authoredOn
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal authoredOn(Optional<? extends DateTime> authoredOn);

    /**
     * Initializes the optional value {@link DeviceRequest#performer() performer} to performer.
     * @param performer The value for performer
     * @return {@code this} builder for chained invocation
     */
    BuildFinal performer(Reference performer);

    /**
     * Initializes the optional value {@link DeviceRequest#performer() performer} to performer.
     * @param performer The value for performer
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal performer(Optional<? extends Reference> performer);

    /**
     * Initializes the optional value {@link DeviceRequest#priorRequest() priorRequest} to priorRequest.
     * @param priorRequest The value for priorRequest
     * @return {@code this} builder for chained invocation
     */
    BuildFinal priorRequest(List<Reference> priorRequest);

    /**
     * Initializes the optional value {@link DeviceRequest#priorRequest() priorRequest} to priorRequest.
     * @param priorRequest The value for priorRequest
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal priorRequest(Optional<? extends List<Reference>> priorRequest);

    /**
     * Initializes the optional value {@link DeviceRequest#groupIdentifier() groupIdentifier} to groupIdentifier.
     * @param groupIdentifier The value for groupIdentifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal groupIdentifier(Identifier groupIdentifier);

    /**
     * Initializes the optional value {@link DeviceRequest#groupIdentifier() groupIdentifier} to groupIdentifier.
     * @param groupIdentifier The value for groupIdentifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal groupIdentifier(Optional<? extends Identifier> groupIdentifier);

    /**
     * Initializes the optional value {@link DeviceRequest#reasonCode() reasonCode} to reasonCode.
     * @param reasonCode The value for reasonCode
     * @return {@code this} builder for chained invocation
     */
    BuildFinal reasonCode(List<CodeableConcept> reasonCode);

    /**
     * Initializes the optional value {@link DeviceRequest#reasonCode() reasonCode} to reasonCode.
     * @param reasonCode The value for reasonCode
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal reasonCode(Optional<? extends List<CodeableConcept>> reasonCode);

    /**
     * Initializes the optional value {@link DeviceRequest#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for chained invocation
     */
    BuildFinal note(List<Annotation> note);

    /**
     * Initializes the optional value {@link DeviceRequest#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal note(Optional<? extends List<Annotation>> note);

    /**
     * Initializes the optional value {@link DeviceRequest#basedOn() basedOn} to basedOn.
     * @param basedOn The value for basedOn
     * @return {@code this} builder for chained invocation
     */
    BuildFinal basedOn(List<Reference> basedOn);

    /**
     * Initializes the optional value {@link DeviceRequest#basedOn() basedOn} to basedOn.
     * @param basedOn The value for basedOn
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal basedOn(Optional<? extends List<Reference>> basedOn);

    /**
     * Initializes the optional value {@link DeviceRequest#occurrenceDateTime() occurrenceDateTime} to occurrenceDateTime.
     * @param occurrenceDateTime The value for occurrenceDateTime
     * @return {@code this} builder for chained invocation
     */
    BuildFinal occurrenceDateTime(String occurrenceDateTime);

    /**
     * Initializes the optional value {@link DeviceRequest#occurrenceDateTime() occurrenceDateTime} to occurrenceDateTime.
     * @param occurrenceDateTime The value for occurrenceDateTime
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal occurrenceDateTime(Optional<String> occurrenceDateTime);

    /**
     * Initializes the optional value {@link DeviceRequest#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(Code language);

    /**
     * Initializes the optional value {@link DeviceRequest#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(Optional<? extends Code> language);

    /**
     * Initializes the optional value {@link DeviceRequest#parameter() parameter} to parameter.
     * @param parameter The value for parameter
     * @return {@code this} builder for chained invocation
     */
    BuildFinal parameter(List<DeviceRequest_Parameter> parameter);

    /**
     * Initializes the optional value {@link DeviceRequest#parameter() parameter} to parameter.
     * @param parameter The value for parameter
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal parameter(Optional<? extends List<DeviceRequest_Parameter>> parameter);

    /**
     * Initializes the optional value {@link DeviceRequest#insurance() insurance} to insurance.
     * @param insurance The value for insurance
     * @return {@code this} builder for chained invocation
     */
    BuildFinal insurance(List<Reference> insurance);

    /**
     * Initializes the optional value {@link DeviceRequest#insurance() insurance} to insurance.
     * @param insurance The value for insurance
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal insurance(Optional<? extends List<Reference>> insurance);

    /**
     * Initializes the optional value {@link DeviceRequest#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(Uri implicitRules);

    /**
     * Initializes the optional value {@link DeviceRequest#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(Optional<? extends Uri> implicitRules);

    /**
     * Initializes the optional value {@link DeviceRequest#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(Narrative text);

    /**
     * Initializes the optional value {@link DeviceRequest#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(Optional<? extends Narrative> text);

    /**
     * Builds a new {@link DeviceRequest DeviceRequest}.
     * @return An immutable instance of DeviceRequest
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    DeviceRequest build();
  }
}
