//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link CommunicationRequest}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableCommunicationRequest.builder()}.
 */
@org.immutables.value.Generated(from = "CommunicationRequest", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableCommunicationRequest implements com.fhir.CommunicationRequest {
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> reasonReference;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
  private final @javax.annotation.Nullable com.fhir.code priority;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> replaces;
  private final @javax.annotation.Nullable com.fhir.code status;
  private final @javax.annotation.Nullable com.fhir.Reference subject;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable com.fhir.Identifier groupIdentifier;
  private final @javax.annotation.Nullable com.fhir.Meta meta;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> reasonCode;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> category;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> recipient;
  private final java.lang.String resourceType;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> medium;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept statusReason;
  private final @javax.annotation.Nullable java.lang.Boolean doNotPerform;
  private final @javax.annotation.Nullable com.fhir.dateTime authoredOn;
  private final @javax.annotation.Nullable com.fhir.code language;
  private final @javax.annotation.Nullable com.fhir.Reference sender;
  private final @javax.annotation.Nullable com.fhir.Period occurrencePeriod;
  private final @javax.annotation.Nullable com.fhir.Narrative text;
  private final @javax.annotation.Nullable com.fhir.Reference requester;
  private final @javax.annotation.Nullable com.fhir.uri implicitRules;
  private final @javax.annotation.Nullable com.fhir.Reference encounter;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Annotation> note;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> basedOn;
  private final @javax.annotation.Nullable com.fhir.id id;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CommunicationRequest_Payload> payload;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> about;
  private final @javax.annotation.Nullable java.lang.String occurrenceDateTime;

  private ImmutableCommunicationRequest(
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> reasonReference,
      @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier,
      @javax.annotation.Nullable com.fhir.code priority,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> replaces,
      @javax.annotation.Nullable com.fhir.code status,
      @javax.annotation.Nullable com.fhir.Reference subject,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable com.fhir.Identifier groupIdentifier,
      @javax.annotation.Nullable com.fhir.Meta meta,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> reasonCode,
      @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> category,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> recipient,
      java.lang.String resourceType,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> medium,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable com.fhir.CodeableConcept statusReason,
      @javax.annotation.Nullable java.lang.Boolean doNotPerform,
      @javax.annotation.Nullable com.fhir.dateTime authoredOn,
      @javax.annotation.Nullable com.fhir.code language,
      @javax.annotation.Nullable com.fhir.Reference sender,
      @javax.annotation.Nullable com.fhir.Period occurrencePeriod,
      @javax.annotation.Nullable com.fhir.Narrative text,
      @javax.annotation.Nullable com.fhir.Reference requester,
      @javax.annotation.Nullable com.fhir.uri implicitRules,
      @javax.annotation.Nullable com.fhir.Reference encounter,
      @javax.annotation.Nullable java.util.List<com.fhir.Annotation> note,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> basedOn,
      @javax.annotation.Nullable com.fhir.id id,
      @javax.annotation.Nullable java.util.List<com.fhir.CommunicationRequest_Payload> payload,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> about,
      @javax.annotation.Nullable java.lang.String occurrenceDateTime) {
    this.reasonReference = reasonReference;
    this.identifier = identifier;
    this.priority = priority;
    this.replaces = replaces;
    this.status = status;
    this.subject = subject;
    this.extension = extension;
    this.groupIdentifier = groupIdentifier;
    this.meta = meta;
    this.reasonCode = reasonCode;
    this.contained = contained;
    this.category = category;
    this.recipient = recipient;
    this.resourceType = resourceType;
    this.medium = medium;
    this.modifierExtension = modifierExtension;
    this.statusReason = statusReason;
    this.doNotPerform = doNotPerform;
    this.authoredOn = authoredOn;
    this.language = language;
    this.sender = sender;
    this.occurrencePeriod = occurrencePeriod;
    this.text = text;
    this.requester = requester;
    this.implicitRules = implicitRules;
    this.encounter = encounter;
    this.note = note;
    this.basedOn = basedOn;
    this.id = id;
    this.payload = payload;
    this.about = about;
    this.occurrenceDateTime = occurrenceDateTime;
  }

  /**
   * @return The value of the {@code reasonReference} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("reasonReference")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> reasonReference() {
    return java.util.Optional.ofNullable(reasonReference);
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
   * @return The value of the {@code priority} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("priority")
  @Override
  public java.util.Optional<com.fhir.code> priority() {
    return java.util.Optional.ofNullable(priority);
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
   * @return The value of the {@code status} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("status")
  @Override
  public java.util.Optional<com.fhir.code> status() {
    return java.util.Optional.ofNullable(status);
  }

  /**
   * @return The value of the {@code subject} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("subject")
  @Override
  public java.util.Optional<com.fhir.Reference> subject() {
    return java.util.Optional.ofNullable(subject);
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
   * @return The value of the {@code groupIdentifier} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("groupIdentifier")
  @Override
  public java.util.Optional<com.fhir.Identifier> groupIdentifier() {
    return java.util.Optional.ofNullable(groupIdentifier);
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
   * @return The value of the {@code reasonCode} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("reasonCode")
  @Override
  public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> reasonCode() {
    return java.util.Optional.ofNullable(reasonCode);
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
   * @return The value of the {@code category} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("category")
  @Override
  public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> category() {
    return java.util.Optional.ofNullable(category);
  }

  /**
   * @return The value of the {@code recipient} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("recipient")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> recipient() {
    return java.util.Optional.ofNullable(recipient);
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
   * @return The value of the {@code medium} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("medium")
  @Override
  public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> medium() {
    return java.util.Optional.ofNullable(medium);
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
   * @return The value of the {@code statusReason} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("statusReason")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> statusReason() {
    return java.util.Optional.ofNullable(statusReason);
  }

  /**
   * @return The value of the {@code doNotPerform} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("doNotPerform")
  @Override
  public java.util.Optional<java.lang.Boolean> doNotPerform() {
    return java.util.Optional.ofNullable(doNotPerform);
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
   * @return The value of the {@code language} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("language")
  @Override
  public java.util.Optional<com.fhir.code> language() {
    return java.util.Optional.ofNullable(language);
  }

  /**
   * @return The value of the {@code sender} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("sender")
  @Override
  public java.util.Optional<com.fhir.Reference> sender() {
    return java.util.Optional.ofNullable(sender);
  }

  /**
   * @return The value of the {@code occurrencePeriod} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("occurrencePeriod")
  @Override
  public java.util.Optional<com.fhir.Period> occurrencePeriod() {
    return java.util.Optional.ofNullable(occurrencePeriod);
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
   * @return The value of the {@code requester} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("requester")
  @Override
  public java.util.Optional<com.fhir.Reference> requester() {
    return java.util.Optional.ofNullable(requester);
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
   * @return The value of the {@code encounter} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("encounter")
  @Override
  public java.util.Optional<com.fhir.Reference> encounter() {
    return java.util.Optional.ofNullable(encounter);
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
   * @return The value of the {@code basedOn} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("basedOn")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> basedOn() {
    return java.util.Optional.ofNullable(basedOn);
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
   * @return The value of the {@code payload} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("payload")
  @Override
  public java.util.Optional<java.util.List<com.fhir.CommunicationRequest_Payload>> payload() {
    return java.util.Optional.ofNullable(payload);
  }

  /**
   * @return The value of the {@code about} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("about")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> about() {
    return java.util.Optional.ofNullable(about);
  }

  /**
   * @return The value of the {@code occurrenceDateTime} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("occurrenceDateTime")
  @Override
  public java.util.Optional<java.lang.String> occurrenceDateTime() {
    return java.util.Optional.ofNullable(occurrenceDateTime);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CommunicationRequest#reasonReference() reasonReference} attribute.
   * @param value The value for reasonReference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCommunicationRequest withReasonReference(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "reasonReference");
    if (this.reasonReference == newValue) return this;
    return new ImmutableCommunicationRequest(
        newValue,
        this.identifier,
        this.priority,
        this.replaces,
        this.status,
        this.subject,
        this.extension,
        this.groupIdentifier,
        this.meta,
        this.reasonCode,
        this.contained,
        this.category,
        this.recipient,
        this.resourceType,
        this.medium,
        this.modifierExtension,
        this.statusReason,
        this.doNotPerform,
        this.authoredOn,
        this.language,
        this.sender,
        this.occurrencePeriod,
        this.text,
        this.requester,
        this.implicitRules,
        this.encounter,
        this.note,
        this.basedOn,
        this.id,
        this.payload,
        this.about,
        this.occurrenceDateTime);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CommunicationRequest#reasonReference() reasonReference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for reasonReference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCommunicationRequest withReasonReference(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.reasonReference == value) return this;
    return new ImmutableCommunicationRequest(
        value,
        this.identifier,
        this.priority,
        this.replaces,
        this.status,
        this.subject,
        this.extension,
        this.groupIdentifier,
        this.meta,
        this.reasonCode,
        this.contained,
        this.category,
        this.recipient,
        this.resourceType,
        this.medium,
        this.modifierExtension,
        this.statusReason,
        this.doNotPerform,
        this.authoredOn,
        this.language,
        this.sender,
        this.occurrencePeriod,
        this.text,
        this.requester,
        this.implicitRules,
        this.encounter,
        this.note,
        this.basedOn,
        this.id,
        this.payload,
        this.about,
        this.occurrenceDateTime);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CommunicationRequest#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCommunicationRequest withIdentifier(java.util.List<com.fhir.Identifier> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> newValue = java.util.Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableCommunicationRequest(
        this.reasonReference,
        newValue,
        this.priority,
        this.replaces,
        this.status,
        this.subject,
        this.extension,
        this.groupIdentifier,
        this.meta,
        this.reasonCode,
        this.contained,
        this.category,
        this.recipient,
        this.resourceType,
        this.medium,
        this.modifierExtension,
        this.statusReason,
        this.doNotPerform,
        this.authoredOn,
        this.language,
        this.sender,
        this.occurrencePeriod,
        this.text,
        this.requester,
        this.implicitRules,
        this.encounter,
        this.note,
        this.basedOn,
        this.id,
        this.payload,
        this.about,
        this.occurrenceDateTime);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CommunicationRequest#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCommunicationRequest withIdentifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableCommunicationRequest(
        this.reasonReference,
        value,
        this.priority,
        this.replaces,
        this.status,
        this.subject,
        this.extension,
        this.groupIdentifier,
        this.meta,
        this.reasonCode,
        this.contained,
        this.category,
        this.recipient,
        this.resourceType,
        this.medium,
        this.modifierExtension,
        this.statusReason,
        this.doNotPerform,
        this.authoredOn,
        this.language,
        this.sender,
        this.occurrencePeriod,
        this.text,
        this.requester,
        this.implicitRules,
        this.encounter,
        this.note,
        this.basedOn,
        this.id,
        this.payload,
        this.about,
        this.occurrenceDateTime);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CommunicationRequest#priority() priority} attribute.
   * @param value The value for priority
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCommunicationRequest withPriority(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "priority");
    if (this.priority == newValue) return this;
    return new ImmutableCommunicationRequest(
        this.reasonReference,
        this.identifier,
        newValue,
        this.replaces,
        this.status,
        this.subject,
        this.extension,
        this.groupIdentifier,
        this.meta,
        this.reasonCode,
        this.contained,
        this.category,
        this.recipient,
        this.resourceType,
        this.medium,
        this.modifierExtension,
        this.statusReason,
        this.doNotPerform,
        this.authoredOn,
        this.language,
        this.sender,
        this.occurrencePeriod,
        this.text,
        this.requester,
        this.implicitRules,
        this.encounter,
        this.note,
        this.basedOn,
        this.id,
        this.payload,
        this.about,
        this.occurrenceDateTime);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CommunicationRequest#priority() priority} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for priority
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCommunicationRequest withPriority(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.priority == value) return this;
    return new ImmutableCommunicationRequest(
        this.reasonReference,
        this.identifier,
        value,
        this.replaces,
        this.status,
        this.subject,
        this.extension,
        this.groupIdentifier,
        this.meta,
        this.reasonCode,
        this.contained,
        this.category,
        this.recipient,
        this.resourceType,
        this.medium,
        this.modifierExtension,
        this.statusReason,
        this.doNotPerform,
        this.authoredOn,
        this.language,
        this.sender,
        this.occurrencePeriod,
        this.text,
        this.requester,
        this.implicitRules,
        this.encounter,
        this.note,
        this.basedOn,
        this.id,
        this.payload,
        this.about,
        this.occurrenceDateTime);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CommunicationRequest#replaces() replaces} attribute.
   * @param value The value for replaces
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCommunicationRequest withReplaces(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "replaces");
    if (this.replaces == newValue) return this;
    return new ImmutableCommunicationRequest(
        this.reasonReference,
        this.identifier,
        this.priority,
        newValue,
        this.status,
        this.subject,
        this.extension,
        this.groupIdentifier,
        this.meta,
        this.reasonCode,
        this.contained,
        this.category,
        this.recipient,
        this.resourceType,
        this.medium,
        this.modifierExtension,
        this.statusReason,
        this.doNotPerform,
        this.authoredOn,
        this.language,
        this.sender,
        this.occurrencePeriod,
        this.text,
        this.requester,
        this.implicitRules,
        this.encounter,
        this.note,
        this.basedOn,
        this.id,
        this.payload,
        this.about,
        this.occurrenceDateTime);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CommunicationRequest#replaces() replaces} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for replaces
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCommunicationRequest withReplaces(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.replaces == value) return this;
    return new ImmutableCommunicationRequest(
        this.reasonReference,
        this.identifier,
        this.priority,
        value,
        this.status,
        this.subject,
        this.extension,
        this.groupIdentifier,
        this.meta,
        this.reasonCode,
        this.contained,
        this.category,
        this.recipient,
        this.resourceType,
        this.medium,
        this.modifierExtension,
        this.statusReason,
        this.doNotPerform,
        this.authoredOn,
        this.language,
        this.sender,
        this.occurrencePeriod,
        this.text,
        this.requester,
        this.implicitRules,
        this.encounter,
        this.note,
        this.basedOn,
        this.id,
        this.payload,
        this.about,
        this.occurrenceDateTime);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CommunicationRequest#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCommunicationRequest withStatus(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableCommunicationRequest(
        this.reasonReference,
        this.identifier,
        this.priority,
        this.replaces,
        newValue,
        this.subject,
        this.extension,
        this.groupIdentifier,
        this.meta,
        this.reasonCode,
        this.contained,
        this.category,
        this.recipient,
        this.resourceType,
        this.medium,
        this.modifierExtension,
        this.statusReason,
        this.doNotPerform,
        this.authoredOn,
        this.language,
        this.sender,
        this.occurrencePeriod,
        this.text,
        this.requester,
        this.implicitRules,
        this.encounter,
        this.note,
        this.basedOn,
        this.id,
        this.payload,
        this.about,
        this.occurrenceDateTime);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CommunicationRequest#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCommunicationRequest withStatus(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableCommunicationRequest(
        this.reasonReference,
        this.identifier,
        this.priority,
        this.replaces,
        value,
        this.subject,
        this.extension,
        this.groupIdentifier,
        this.meta,
        this.reasonCode,
        this.contained,
        this.category,
        this.recipient,
        this.resourceType,
        this.medium,
        this.modifierExtension,
        this.statusReason,
        this.doNotPerform,
        this.authoredOn,
        this.language,
        this.sender,
        this.occurrencePeriod,
        this.text,
        this.requester,
        this.implicitRules,
        this.encounter,
        this.note,
        this.basedOn,
        this.id,
        this.payload,
        this.about,
        this.occurrenceDateTime);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CommunicationRequest#subject() subject} attribute.
   * @param value The value for subject
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCommunicationRequest withSubject(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "subject");
    if (this.subject == newValue) return this;
    return new ImmutableCommunicationRequest(
        this.reasonReference,
        this.identifier,
        this.priority,
        this.replaces,
        this.status,
        newValue,
        this.extension,
        this.groupIdentifier,
        this.meta,
        this.reasonCode,
        this.contained,
        this.category,
        this.recipient,
        this.resourceType,
        this.medium,
        this.modifierExtension,
        this.statusReason,
        this.doNotPerform,
        this.authoredOn,
        this.language,
        this.sender,
        this.occurrencePeriod,
        this.text,
        this.requester,
        this.implicitRules,
        this.encounter,
        this.note,
        this.basedOn,
        this.id,
        this.payload,
        this.about,
        this.occurrenceDateTime);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CommunicationRequest#subject() subject} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for subject
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCommunicationRequest withSubject(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.subject == value) return this;
    return new ImmutableCommunicationRequest(
        this.reasonReference,
        this.identifier,
        this.priority,
        this.replaces,
        this.status,
        value,
        this.extension,
        this.groupIdentifier,
        this.meta,
        this.reasonCode,
        this.contained,
        this.category,
        this.recipient,
        this.resourceType,
        this.medium,
        this.modifierExtension,
        this.statusReason,
        this.doNotPerform,
        this.authoredOn,
        this.language,
        this.sender,
        this.occurrencePeriod,
        this.text,
        this.requester,
        this.implicitRules,
        this.encounter,
        this.note,
        this.basedOn,
        this.id,
        this.payload,
        this.about,
        this.occurrenceDateTime);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CommunicationRequest#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCommunicationRequest withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableCommunicationRequest(
        this.reasonReference,
        this.identifier,
        this.priority,
        this.replaces,
        this.status,
        this.subject,
        newValue,
        this.groupIdentifier,
        this.meta,
        this.reasonCode,
        this.contained,
        this.category,
        this.recipient,
        this.resourceType,
        this.medium,
        this.modifierExtension,
        this.statusReason,
        this.doNotPerform,
        this.authoredOn,
        this.language,
        this.sender,
        this.occurrencePeriod,
        this.text,
        this.requester,
        this.implicitRules,
        this.encounter,
        this.note,
        this.basedOn,
        this.id,
        this.payload,
        this.about,
        this.occurrenceDateTime);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CommunicationRequest#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCommunicationRequest withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableCommunicationRequest(
        this.reasonReference,
        this.identifier,
        this.priority,
        this.replaces,
        this.status,
        this.subject,
        value,
        this.groupIdentifier,
        this.meta,
        this.reasonCode,
        this.contained,
        this.category,
        this.recipient,
        this.resourceType,
        this.medium,
        this.modifierExtension,
        this.statusReason,
        this.doNotPerform,
        this.authoredOn,
        this.language,
        this.sender,
        this.occurrencePeriod,
        this.text,
        this.requester,
        this.implicitRules,
        this.encounter,
        this.note,
        this.basedOn,
        this.id,
        this.payload,
        this.about,
        this.occurrenceDateTime);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CommunicationRequest#groupIdentifier() groupIdentifier} attribute.
   * @param value The value for groupIdentifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCommunicationRequest withGroupIdentifier(com.fhir.Identifier value) {
    @javax.annotation.Nullable com.fhir.Identifier newValue = java.util.Objects.requireNonNull(value, "groupIdentifier");
    if (this.groupIdentifier == newValue) return this;
    return new ImmutableCommunicationRequest(
        this.reasonReference,
        this.identifier,
        this.priority,
        this.replaces,
        this.status,
        this.subject,
        this.extension,
        newValue,
        this.meta,
        this.reasonCode,
        this.contained,
        this.category,
        this.recipient,
        this.resourceType,
        this.medium,
        this.modifierExtension,
        this.statusReason,
        this.doNotPerform,
        this.authoredOn,
        this.language,
        this.sender,
        this.occurrencePeriod,
        this.text,
        this.requester,
        this.implicitRules,
        this.encounter,
        this.note,
        this.basedOn,
        this.id,
        this.payload,
        this.about,
        this.occurrenceDateTime);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CommunicationRequest#groupIdentifier() groupIdentifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for groupIdentifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCommunicationRequest withGroupIdentifier(java.util.Optional<? extends com.fhir.Identifier> optional) {
    @javax.annotation.Nullable com.fhir.Identifier value = optional.orElse(null);
    if (this.groupIdentifier == value) return this;
    return new ImmutableCommunicationRequest(
        this.reasonReference,
        this.identifier,
        this.priority,
        this.replaces,
        this.status,
        this.subject,
        this.extension,
        value,
        this.meta,
        this.reasonCode,
        this.contained,
        this.category,
        this.recipient,
        this.resourceType,
        this.medium,
        this.modifierExtension,
        this.statusReason,
        this.doNotPerform,
        this.authoredOn,
        this.language,
        this.sender,
        this.occurrencePeriod,
        this.text,
        this.requester,
        this.implicitRules,
        this.encounter,
        this.note,
        this.basedOn,
        this.id,
        this.payload,
        this.about,
        this.occurrenceDateTime);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CommunicationRequest#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCommunicationRequest withMeta(com.fhir.Meta value) {
    @javax.annotation.Nullable com.fhir.Meta newValue = java.util.Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableCommunicationRequest(
        this.reasonReference,
        this.identifier,
        this.priority,
        this.replaces,
        this.status,
        this.subject,
        this.extension,
        this.groupIdentifier,
        newValue,
        this.reasonCode,
        this.contained,
        this.category,
        this.recipient,
        this.resourceType,
        this.medium,
        this.modifierExtension,
        this.statusReason,
        this.doNotPerform,
        this.authoredOn,
        this.language,
        this.sender,
        this.occurrencePeriod,
        this.text,
        this.requester,
        this.implicitRules,
        this.encounter,
        this.note,
        this.basedOn,
        this.id,
        this.payload,
        this.about,
        this.occurrenceDateTime);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CommunicationRequest#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCommunicationRequest withMeta(java.util.Optional<? extends com.fhir.Meta> optional) {
    @javax.annotation.Nullable com.fhir.Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableCommunicationRequest(
        this.reasonReference,
        this.identifier,
        this.priority,
        this.replaces,
        this.status,
        this.subject,
        this.extension,
        this.groupIdentifier,
        value,
        this.reasonCode,
        this.contained,
        this.category,
        this.recipient,
        this.resourceType,
        this.medium,
        this.modifierExtension,
        this.statusReason,
        this.doNotPerform,
        this.authoredOn,
        this.language,
        this.sender,
        this.occurrencePeriod,
        this.text,
        this.requester,
        this.implicitRules,
        this.encounter,
        this.note,
        this.basedOn,
        this.id,
        this.payload,
        this.about,
        this.occurrenceDateTime);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CommunicationRequest#reasonCode() reasonCode} attribute.
   * @param value The value for reasonCode
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCommunicationRequest withReasonCode(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "reasonCode");
    if (this.reasonCode == newValue) return this;
    return new ImmutableCommunicationRequest(
        this.reasonReference,
        this.identifier,
        this.priority,
        this.replaces,
        this.status,
        this.subject,
        this.extension,
        this.groupIdentifier,
        this.meta,
        newValue,
        this.contained,
        this.category,
        this.recipient,
        this.resourceType,
        this.medium,
        this.modifierExtension,
        this.statusReason,
        this.doNotPerform,
        this.authoredOn,
        this.language,
        this.sender,
        this.occurrencePeriod,
        this.text,
        this.requester,
        this.implicitRules,
        this.encounter,
        this.note,
        this.basedOn,
        this.id,
        this.payload,
        this.about,
        this.occurrenceDateTime);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CommunicationRequest#reasonCode() reasonCode} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for reasonCode
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCommunicationRequest withReasonCode(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.reasonCode == value) return this;
    return new ImmutableCommunicationRequest(
        this.reasonReference,
        this.identifier,
        this.priority,
        this.replaces,
        this.status,
        this.subject,
        this.extension,
        this.groupIdentifier,
        this.meta,
        value,
        this.contained,
        this.category,
        this.recipient,
        this.resourceType,
        this.medium,
        this.modifierExtension,
        this.statusReason,
        this.doNotPerform,
        this.authoredOn,
        this.language,
        this.sender,
        this.occurrencePeriod,
        this.text,
        this.requester,
        this.implicitRules,
        this.encounter,
        this.note,
        this.basedOn,
        this.id,
        this.payload,
        this.about,
        this.occurrenceDateTime);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CommunicationRequest#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCommunicationRequest withContained(java.util.List<com.fhir.ResourceList> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> newValue = java.util.Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableCommunicationRequest(
        this.reasonReference,
        this.identifier,
        this.priority,
        this.replaces,
        this.status,
        this.subject,
        this.extension,
        this.groupIdentifier,
        this.meta,
        this.reasonCode,
        newValue,
        this.category,
        this.recipient,
        this.resourceType,
        this.medium,
        this.modifierExtension,
        this.statusReason,
        this.doNotPerform,
        this.authoredOn,
        this.language,
        this.sender,
        this.occurrencePeriod,
        this.text,
        this.requester,
        this.implicitRules,
        this.encounter,
        this.note,
        this.basedOn,
        this.id,
        this.payload,
        this.about,
        this.occurrenceDateTime);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CommunicationRequest#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCommunicationRequest withContained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableCommunicationRequest(
        this.reasonReference,
        this.identifier,
        this.priority,
        this.replaces,
        this.status,
        this.subject,
        this.extension,
        this.groupIdentifier,
        this.meta,
        this.reasonCode,
        value,
        this.category,
        this.recipient,
        this.resourceType,
        this.medium,
        this.modifierExtension,
        this.statusReason,
        this.doNotPerform,
        this.authoredOn,
        this.language,
        this.sender,
        this.occurrencePeriod,
        this.text,
        this.requester,
        this.implicitRules,
        this.encounter,
        this.note,
        this.basedOn,
        this.id,
        this.payload,
        this.about,
        this.occurrenceDateTime);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CommunicationRequest#category() category} attribute.
   * @param value The value for category
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCommunicationRequest withCategory(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "category");
    if (this.category == newValue) return this;
    return new ImmutableCommunicationRequest(
        this.reasonReference,
        this.identifier,
        this.priority,
        this.replaces,
        this.status,
        this.subject,
        this.extension,
        this.groupIdentifier,
        this.meta,
        this.reasonCode,
        this.contained,
        newValue,
        this.recipient,
        this.resourceType,
        this.medium,
        this.modifierExtension,
        this.statusReason,
        this.doNotPerform,
        this.authoredOn,
        this.language,
        this.sender,
        this.occurrencePeriod,
        this.text,
        this.requester,
        this.implicitRules,
        this.encounter,
        this.note,
        this.basedOn,
        this.id,
        this.payload,
        this.about,
        this.occurrenceDateTime);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CommunicationRequest#category() category} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for category
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCommunicationRequest withCategory(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.category == value) return this;
    return new ImmutableCommunicationRequest(
        this.reasonReference,
        this.identifier,
        this.priority,
        this.replaces,
        this.status,
        this.subject,
        this.extension,
        this.groupIdentifier,
        this.meta,
        this.reasonCode,
        this.contained,
        value,
        this.recipient,
        this.resourceType,
        this.medium,
        this.modifierExtension,
        this.statusReason,
        this.doNotPerform,
        this.authoredOn,
        this.language,
        this.sender,
        this.occurrencePeriod,
        this.text,
        this.requester,
        this.implicitRules,
        this.encounter,
        this.note,
        this.basedOn,
        this.id,
        this.payload,
        this.about,
        this.occurrenceDateTime);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CommunicationRequest#recipient() recipient} attribute.
   * @param value The value for recipient
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCommunicationRequest withRecipient(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "recipient");
    if (this.recipient == newValue) return this;
    return new ImmutableCommunicationRequest(
        this.reasonReference,
        this.identifier,
        this.priority,
        this.replaces,
        this.status,
        this.subject,
        this.extension,
        this.groupIdentifier,
        this.meta,
        this.reasonCode,
        this.contained,
        this.category,
        newValue,
        this.resourceType,
        this.medium,
        this.modifierExtension,
        this.statusReason,
        this.doNotPerform,
        this.authoredOn,
        this.language,
        this.sender,
        this.occurrencePeriod,
        this.text,
        this.requester,
        this.implicitRules,
        this.encounter,
        this.note,
        this.basedOn,
        this.id,
        this.payload,
        this.about,
        this.occurrenceDateTime);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CommunicationRequest#recipient() recipient} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for recipient
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCommunicationRequest withRecipient(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.recipient == value) return this;
    return new ImmutableCommunicationRequest(
        this.reasonReference,
        this.identifier,
        this.priority,
        this.replaces,
        this.status,
        this.subject,
        this.extension,
        this.groupIdentifier,
        this.meta,
        this.reasonCode,
        this.contained,
        this.category,
        value,
        this.resourceType,
        this.medium,
        this.modifierExtension,
        this.statusReason,
        this.doNotPerform,
        this.authoredOn,
        this.language,
        this.sender,
        this.occurrencePeriod,
        this.text,
        this.requester,
        this.implicitRules,
        this.encounter,
        this.note,
        this.basedOn,
        this.id,
        this.payload,
        this.about,
        this.occurrenceDateTime);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link CommunicationRequest#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableCommunicationRequest withResourceType(java.lang.String value) {
    java.lang.String newValue = java.util.Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableCommunicationRequest(
        this.reasonReference,
        this.identifier,
        this.priority,
        this.replaces,
        this.status,
        this.subject,
        this.extension,
        this.groupIdentifier,
        this.meta,
        this.reasonCode,
        this.contained,
        this.category,
        this.recipient,
        newValue,
        this.medium,
        this.modifierExtension,
        this.statusReason,
        this.doNotPerform,
        this.authoredOn,
        this.language,
        this.sender,
        this.occurrencePeriod,
        this.text,
        this.requester,
        this.implicitRules,
        this.encounter,
        this.note,
        this.basedOn,
        this.id,
        this.payload,
        this.about,
        this.occurrenceDateTime);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CommunicationRequest#medium() medium} attribute.
   * @param value The value for medium
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCommunicationRequest withMedium(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "medium");
    if (this.medium == newValue) return this;
    return new ImmutableCommunicationRequest(
        this.reasonReference,
        this.identifier,
        this.priority,
        this.replaces,
        this.status,
        this.subject,
        this.extension,
        this.groupIdentifier,
        this.meta,
        this.reasonCode,
        this.contained,
        this.category,
        this.recipient,
        this.resourceType,
        newValue,
        this.modifierExtension,
        this.statusReason,
        this.doNotPerform,
        this.authoredOn,
        this.language,
        this.sender,
        this.occurrencePeriod,
        this.text,
        this.requester,
        this.implicitRules,
        this.encounter,
        this.note,
        this.basedOn,
        this.id,
        this.payload,
        this.about,
        this.occurrenceDateTime);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CommunicationRequest#medium() medium} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for medium
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCommunicationRequest withMedium(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.medium == value) return this;
    return new ImmutableCommunicationRequest(
        this.reasonReference,
        this.identifier,
        this.priority,
        this.replaces,
        this.status,
        this.subject,
        this.extension,
        this.groupIdentifier,
        this.meta,
        this.reasonCode,
        this.contained,
        this.category,
        this.recipient,
        this.resourceType,
        value,
        this.modifierExtension,
        this.statusReason,
        this.doNotPerform,
        this.authoredOn,
        this.language,
        this.sender,
        this.occurrencePeriod,
        this.text,
        this.requester,
        this.implicitRules,
        this.encounter,
        this.note,
        this.basedOn,
        this.id,
        this.payload,
        this.about,
        this.occurrenceDateTime);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CommunicationRequest#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCommunicationRequest withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableCommunicationRequest(
        this.reasonReference,
        this.identifier,
        this.priority,
        this.replaces,
        this.status,
        this.subject,
        this.extension,
        this.groupIdentifier,
        this.meta,
        this.reasonCode,
        this.contained,
        this.category,
        this.recipient,
        this.resourceType,
        this.medium,
        newValue,
        this.statusReason,
        this.doNotPerform,
        this.authoredOn,
        this.language,
        this.sender,
        this.occurrencePeriod,
        this.text,
        this.requester,
        this.implicitRules,
        this.encounter,
        this.note,
        this.basedOn,
        this.id,
        this.payload,
        this.about,
        this.occurrenceDateTime);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CommunicationRequest#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCommunicationRequest withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableCommunicationRequest(
        this.reasonReference,
        this.identifier,
        this.priority,
        this.replaces,
        this.status,
        this.subject,
        this.extension,
        this.groupIdentifier,
        this.meta,
        this.reasonCode,
        this.contained,
        this.category,
        this.recipient,
        this.resourceType,
        this.medium,
        value,
        this.statusReason,
        this.doNotPerform,
        this.authoredOn,
        this.language,
        this.sender,
        this.occurrencePeriod,
        this.text,
        this.requester,
        this.implicitRules,
        this.encounter,
        this.note,
        this.basedOn,
        this.id,
        this.payload,
        this.about,
        this.occurrenceDateTime);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CommunicationRequest#statusReason() statusReason} attribute.
   * @param value The value for statusReason
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCommunicationRequest withStatusReason(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "statusReason");
    if (this.statusReason == newValue) return this;
    return new ImmutableCommunicationRequest(
        this.reasonReference,
        this.identifier,
        this.priority,
        this.replaces,
        this.status,
        this.subject,
        this.extension,
        this.groupIdentifier,
        this.meta,
        this.reasonCode,
        this.contained,
        this.category,
        this.recipient,
        this.resourceType,
        this.medium,
        this.modifierExtension,
        newValue,
        this.doNotPerform,
        this.authoredOn,
        this.language,
        this.sender,
        this.occurrencePeriod,
        this.text,
        this.requester,
        this.implicitRules,
        this.encounter,
        this.note,
        this.basedOn,
        this.id,
        this.payload,
        this.about,
        this.occurrenceDateTime);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CommunicationRequest#statusReason() statusReason} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for statusReason
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCommunicationRequest withStatusReason(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.statusReason == value) return this;
    return new ImmutableCommunicationRequest(
        this.reasonReference,
        this.identifier,
        this.priority,
        this.replaces,
        this.status,
        this.subject,
        this.extension,
        this.groupIdentifier,
        this.meta,
        this.reasonCode,
        this.contained,
        this.category,
        this.recipient,
        this.resourceType,
        this.medium,
        this.modifierExtension,
        value,
        this.doNotPerform,
        this.authoredOn,
        this.language,
        this.sender,
        this.occurrencePeriod,
        this.text,
        this.requester,
        this.implicitRules,
        this.encounter,
        this.note,
        this.basedOn,
        this.id,
        this.payload,
        this.about,
        this.occurrenceDateTime);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CommunicationRequest#doNotPerform() doNotPerform} attribute.
   * @param value The value for doNotPerform
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCommunicationRequest withDoNotPerform(boolean value) {
    @javax.annotation.Nullable java.lang.Boolean newValue = value;
    if (java.util.Objects.equals(this.doNotPerform, newValue)) return this;
    return new ImmutableCommunicationRequest(
        this.reasonReference,
        this.identifier,
        this.priority,
        this.replaces,
        this.status,
        this.subject,
        this.extension,
        this.groupIdentifier,
        this.meta,
        this.reasonCode,
        this.contained,
        this.category,
        this.recipient,
        this.resourceType,
        this.medium,
        this.modifierExtension,
        this.statusReason,
        newValue,
        this.authoredOn,
        this.language,
        this.sender,
        this.occurrencePeriod,
        this.text,
        this.requester,
        this.implicitRules,
        this.encounter,
        this.note,
        this.basedOn,
        this.id,
        this.payload,
        this.about,
        this.occurrenceDateTime);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CommunicationRequest#doNotPerform() doNotPerform} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for doNotPerform
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCommunicationRequest withDoNotPerform(java.util.Optional<java.lang.Boolean> optional) {
    @javax.annotation.Nullable java.lang.Boolean value = optional.orElse(null);
    if (java.util.Objects.equals(this.doNotPerform, value)) return this;
    return new ImmutableCommunicationRequest(
        this.reasonReference,
        this.identifier,
        this.priority,
        this.replaces,
        this.status,
        this.subject,
        this.extension,
        this.groupIdentifier,
        this.meta,
        this.reasonCode,
        this.contained,
        this.category,
        this.recipient,
        this.resourceType,
        this.medium,
        this.modifierExtension,
        this.statusReason,
        value,
        this.authoredOn,
        this.language,
        this.sender,
        this.occurrencePeriod,
        this.text,
        this.requester,
        this.implicitRules,
        this.encounter,
        this.note,
        this.basedOn,
        this.id,
        this.payload,
        this.about,
        this.occurrenceDateTime);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CommunicationRequest#authoredOn() authoredOn} attribute.
   * @param value The value for authoredOn
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCommunicationRequest withAuthoredOn(com.fhir.dateTime value) {
    @javax.annotation.Nullable com.fhir.dateTime newValue = java.util.Objects.requireNonNull(value, "authoredOn");
    if (this.authoredOn == newValue) return this;
    return new ImmutableCommunicationRequest(
        this.reasonReference,
        this.identifier,
        this.priority,
        this.replaces,
        this.status,
        this.subject,
        this.extension,
        this.groupIdentifier,
        this.meta,
        this.reasonCode,
        this.contained,
        this.category,
        this.recipient,
        this.resourceType,
        this.medium,
        this.modifierExtension,
        this.statusReason,
        this.doNotPerform,
        newValue,
        this.language,
        this.sender,
        this.occurrencePeriod,
        this.text,
        this.requester,
        this.implicitRules,
        this.encounter,
        this.note,
        this.basedOn,
        this.id,
        this.payload,
        this.about,
        this.occurrenceDateTime);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CommunicationRequest#authoredOn() authoredOn} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for authoredOn
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCommunicationRequest withAuthoredOn(java.util.Optional<? extends com.fhir.dateTime> optional) {
    @javax.annotation.Nullable com.fhir.dateTime value = optional.orElse(null);
    if (this.authoredOn == value) return this;
    return new ImmutableCommunicationRequest(
        this.reasonReference,
        this.identifier,
        this.priority,
        this.replaces,
        this.status,
        this.subject,
        this.extension,
        this.groupIdentifier,
        this.meta,
        this.reasonCode,
        this.contained,
        this.category,
        this.recipient,
        this.resourceType,
        this.medium,
        this.modifierExtension,
        this.statusReason,
        this.doNotPerform,
        value,
        this.language,
        this.sender,
        this.occurrencePeriod,
        this.text,
        this.requester,
        this.implicitRules,
        this.encounter,
        this.note,
        this.basedOn,
        this.id,
        this.payload,
        this.about,
        this.occurrenceDateTime);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CommunicationRequest#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCommunicationRequest withLanguage(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableCommunicationRequest(
        this.reasonReference,
        this.identifier,
        this.priority,
        this.replaces,
        this.status,
        this.subject,
        this.extension,
        this.groupIdentifier,
        this.meta,
        this.reasonCode,
        this.contained,
        this.category,
        this.recipient,
        this.resourceType,
        this.medium,
        this.modifierExtension,
        this.statusReason,
        this.doNotPerform,
        this.authoredOn,
        newValue,
        this.sender,
        this.occurrencePeriod,
        this.text,
        this.requester,
        this.implicitRules,
        this.encounter,
        this.note,
        this.basedOn,
        this.id,
        this.payload,
        this.about,
        this.occurrenceDateTime);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CommunicationRequest#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCommunicationRequest withLanguage(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableCommunicationRequest(
        this.reasonReference,
        this.identifier,
        this.priority,
        this.replaces,
        this.status,
        this.subject,
        this.extension,
        this.groupIdentifier,
        this.meta,
        this.reasonCode,
        this.contained,
        this.category,
        this.recipient,
        this.resourceType,
        this.medium,
        this.modifierExtension,
        this.statusReason,
        this.doNotPerform,
        this.authoredOn,
        value,
        this.sender,
        this.occurrencePeriod,
        this.text,
        this.requester,
        this.implicitRules,
        this.encounter,
        this.note,
        this.basedOn,
        this.id,
        this.payload,
        this.about,
        this.occurrenceDateTime);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CommunicationRequest#sender() sender} attribute.
   * @param value The value for sender
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCommunicationRequest withSender(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "sender");
    if (this.sender == newValue) return this;
    return new ImmutableCommunicationRequest(
        this.reasonReference,
        this.identifier,
        this.priority,
        this.replaces,
        this.status,
        this.subject,
        this.extension,
        this.groupIdentifier,
        this.meta,
        this.reasonCode,
        this.contained,
        this.category,
        this.recipient,
        this.resourceType,
        this.medium,
        this.modifierExtension,
        this.statusReason,
        this.doNotPerform,
        this.authoredOn,
        this.language,
        newValue,
        this.occurrencePeriod,
        this.text,
        this.requester,
        this.implicitRules,
        this.encounter,
        this.note,
        this.basedOn,
        this.id,
        this.payload,
        this.about,
        this.occurrenceDateTime);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CommunicationRequest#sender() sender} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for sender
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCommunicationRequest withSender(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.sender == value) return this;
    return new ImmutableCommunicationRequest(
        this.reasonReference,
        this.identifier,
        this.priority,
        this.replaces,
        this.status,
        this.subject,
        this.extension,
        this.groupIdentifier,
        this.meta,
        this.reasonCode,
        this.contained,
        this.category,
        this.recipient,
        this.resourceType,
        this.medium,
        this.modifierExtension,
        this.statusReason,
        this.doNotPerform,
        this.authoredOn,
        this.language,
        value,
        this.occurrencePeriod,
        this.text,
        this.requester,
        this.implicitRules,
        this.encounter,
        this.note,
        this.basedOn,
        this.id,
        this.payload,
        this.about,
        this.occurrenceDateTime);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CommunicationRequest#occurrencePeriod() occurrencePeriod} attribute.
   * @param value The value for occurrencePeriod
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCommunicationRequest withOccurrencePeriod(com.fhir.Period value) {
    @javax.annotation.Nullable com.fhir.Period newValue = java.util.Objects.requireNonNull(value, "occurrencePeriod");
    if (this.occurrencePeriod == newValue) return this;
    return new ImmutableCommunicationRequest(
        this.reasonReference,
        this.identifier,
        this.priority,
        this.replaces,
        this.status,
        this.subject,
        this.extension,
        this.groupIdentifier,
        this.meta,
        this.reasonCode,
        this.contained,
        this.category,
        this.recipient,
        this.resourceType,
        this.medium,
        this.modifierExtension,
        this.statusReason,
        this.doNotPerform,
        this.authoredOn,
        this.language,
        this.sender,
        newValue,
        this.text,
        this.requester,
        this.implicitRules,
        this.encounter,
        this.note,
        this.basedOn,
        this.id,
        this.payload,
        this.about,
        this.occurrenceDateTime);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CommunicationRequest#occurrencePeriod() occurrencePeriod} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for occurrencePeriod
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCommunicationRequest withOccurrencePeriod(java.util.Optional<? extends com.fhir.Period> optional) {
    @javax.annotation.Nullable com.fhir.Period value = optional.orElse(null);
    if (this.occurrencePeriod == value) return this;
    return new ImmutableCommunicationRequest(
        this.reasonReference,
        this.identifier,
        this.priority,
        this.replaces,
        this.status,
        this.subject,
        this.extension,
        this.groupIdentifier,
        this.meta,
        this.reasonCode,
        this.contained,
        this.category,
        this.recipient,
        this.resourceType,
        this.medium,
        this.modifierExtension,
        this.statusReason,
        this.doNotPerform,
        this.authoredOn,
        this.language,
        this.sender,
        value,
        this.text,
        this.requester,
        this.implicitRules,
        this.encounter,
        this.note,
        this.basedOn,
        this.id,
        this.payload,
        this.about,
        this.occurrenceDateTime);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CommunicationRequest#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCommunicationRequest withText(com.fhir.Narrative value) {
    @javax.annotation.Nullable com.fhir.Narrative newValue = java.util.Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableCommunicationRequest(
        this.reasonReference,
        this.identifier,
        this.priority,
        this.replaces,
        this.status,
        this.subject,
        this.extension,
        this.groupIdentifier,
        this.meta,
        this.reasonCode,
        this.contained,
        this.category,
        this.recipient,
        this.resourceType,
        this.medium,
        this.modifierExtension,
        this.statusReason,
        this.doNotPerform,
        this.authoredOn,
        this.language,
        this.sender,
        this.occurrencePeriod,
        newValue,
        this.requester,
        this.implicitRules,
        this.encounter,
        this.note,
        this.basedOn,
        this.id,
        this.payload,
        this.about,
        this.occurrenceDateTime);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CommunicationRequest#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCommunicationRequest withText(java.util.Optional<? extends com.fhir.Narrative> optional) {
    @javax.annotation.Nullable com.fhir.Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableCommunicationRequest(
        this.reasonReference,
        this.identifier,
        this.priority,
        this.replaces,
        this.status,
        this.subject,
        this.extension,
        this.groupIdentifier,
        this.meta,
        this.reasonCode,
        this.contained,
        this.category,
        this.recipient,
        this.resourceType,
        this.medium,
        this.modifierExtension,
        this.statusReason,
        this.doNotPerform,
        this.authoredOn,
        this.language,
        this.sender,
        this.occurrencePeriod,
        value,
        this.requester,
        this.implicitRules,
        this.encounter,
        this.note,
        this.basedOn,
        this.id,
        this.payload,
        this.about,
        this.occurrenceDateTime);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CommunicationRequest#requester() requester} attribute.
   * @param value The value for requester
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCommunicationRequest withRequester(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "requester");
    if (this.requester == newValue) return this;
    return new ImmutableCommunicationRequest(
        this.reasonReference,
        this.identifier,
        this.priority,
        this.replaces,
        this.status,
        this.subject,
        this.extension,
        this.groupIdentifier,
        this.meta,
        this.reasonCode,
        this.contained,
        this.category,
        this.recipient,
        this.resourceType,
        this.medium,
        this.modifierExtension,
        this.statusReason,
        this.doNotPerform,
        this.authoredOn,
        this.language,
        this.sender,
        this.occurrencePeriod,
        this.text,
        newValue,
        this.implicitRules,
        this.encounter,
        this.note,
        this.basedOn,
        this.id,
        this.payload,
        this.about,
        this.occurrenceDateTime);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CommunicationRequest#requester() requester} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for requester
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCommunicationRequest withRequester(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.requester == value) return this;
    return new ImmutableCommunicationRequest(
        this.reasonReference,
        this.identifier,
        this.priority,
        this.replaces,
        this.status,
        this.subject,
        this.extension,
        this.groupIdentifier,
        this.meta,
        this.reasonCode,
        this.contained,
        this.category,
        this.recipient,
        this.resourceType,
        this.medium,
        this.modifierExtension,
        this.statusReason,
        this.doNotPerform,
        this.authoredOn,
        this.language,
        this.sender,
        this.occurrencePeriod,
        this.text,
        value,
        this.implicitRules,
        this.encounter,
        this.note,
        this.basedOn,
        this.id,
        this.payload,
        this.about,
        this.occurrenceDateTime);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CommunicationRequest#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCommunicationRequest withImplicitRules(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableCommunicationRequest(
        this.reasonReference,
        this.identifier,
        this.priority,
        this.replaces,
        this.status,
        this.subject,
        this.extension,
        this.groupIdentifier,
        this.meta,
        this.reasonCode,
        this.contained,
        this.category,
        this.recipient,
        this.resourceType,
        this.medium,
        this.modifierExtension,
        this.statusReason,
        this.doNotPerform,
        this.authoredOn,
        this.language,
        this.sender,
        this.occurrencePeriod,
        this.text,
        this.requester,
        newValue,
        this.encounter,
        this.note,
        this.basedOn,
        this.id,
        this.payload,
        this.about,
        this.occurrenceDateTime);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CommunicationRequest#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCommunicationRequest withImplicitRules(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableCommunicationRequest(
        this.reasonReference,
        this.identifier,
        this.priority,
        this.replaces,
        this.status,
        this.subject,
        this.extension,
        this.groupIdentifier,
        this.meta,
        this.reasonCode,
        this.contained,
        this.category,
        this.recipient,
        this.resourceType,
        this.medium,
        this.modifierExtension,
        this.statusReason,
        this.doNotPerform,
        this.authoredOn,
        this.language,
        this.sender,
        this.occurrencePeriod,
        this.text,
        this.requester,
        value,
        this.encounter,
        this.note,
        this.basedOn,
        this.id,
        this.payload,
        this.about,
        this.occurrenceDateTime);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CommunicationRequest#encounter() encounter} attribute.
   * @param value The value for encounter
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCommunicationRequest withEncounter(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "encounter");
    if (this.encounter == newValue) return this;
    return new ImmutableCommunicationRequest(
        this.reasonReference,
        this.identifier,
        this.priority,
        this.replaces,
        this.status,
        this.subject,
        this.extension,
        this.groupIdentifier,
        this.meta,
        this.reasonCode,
        this.contained,
        this.category,
        this.recipient,
        this.resourceType,
        this.medium,
        this.modifierExtension,
        this.statusReason,
        this.doNotPerform,
        this.authoredOn,
        this.language,
        this.sender,
        this.occurrencePeriod,
        this.text,
        this.requester,
        this.implicitRules,
        newValue,
        this.note,
        this.basedOn,
        this.id,
        this.payload,
        this.about,
        this.occurrenceDateTime);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CommunicationRequest#encounter() encounter} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for encounter
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCommunicationRequest withEncounter(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.encounter == value) return this;
    return new ImmutableCommunicationRequest(
        this.reasonReference,
        this.identifier,
        this.priority,
        this.replaces,
        this.status,
        this.subject,
        this.extension,
        this.groupIdentifier,
        this.meta,
        this.reasonCode,
        this.contained,
        this.category,
        this.recipient,
        this.resourceType,
        this.medium,
        this.modifierExtension,
        this.statusReason,
        this.doNotPerform,
        this.authoredOn,
        this.language,
        this.sender,
        this.occurrencePeriod,
        this.text,
        this.requester,
        this.implicitRules,
        value,
        this.note,
        this.basedOn,
        this.id,
        this.payload,
        this.about,
        this.occurrenceDateTime);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CommunicationRequest#note() note} attribute.
   * @param value The value for note
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCommunicationRequest withNote(java.util.List<com.fhir.Annotation> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Annotation> newValue = java.util.Objects.requireNonNull(value, "note");
    if (this.note == newValue) return this;
    return new ImmutableCommunicationRequest(
        this.reasonReference,
        this.identifier,
        this.priority,
        this.replaces,
        this.status,
        this.subject,
        this.extension,
        this.groupIdentifier,
        this.meta,
        this.reasonCode,
        this.contained,
        this.category,
        this.recipient,
        this.resourceType,
        this.medium,
        this.modifierExtension,
        this.statusReason,
        this.doNotPerform,
        this.authoredOn,
        this.language,
        this.sender,
        this.occurrencePeriod,
        this.text,
        this.requester,
        this.implicitRules,
        this.encounter,
        newValue,
        this.basedOn,
        this.id,
        this.payload,
        this.about,
        this.occurrenceDateTime);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CommunicationRequest#note() note} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for note
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCommunicationRequest withNote(java.util.Optional<? extends java.util.List<com.fhir.Annotation>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Annotation> value = optional.orElse(null);
    if (this.note == value) return this;
    return new ImmutableCommunicationRequest(
        this.reasonReference,
        this.identifier,
        this.priority,
        this.replaces,
        this.status,
        this.subject,
        this.extension,
        this.groupIdentifier,
        this.meta,
        this.reasonCode,
        this.contained,
        this.category,
        this.recipient,
        this.resourceType,
        this.medium,
        this.modifierExtension,
        this.statusReason,
        this.doNotPerform,
        this.authoredOn,
        this.language,
        this.sender,
        this.occurrencePeriod,
        this.text,
        this.requester,
        this.implicitRules,
        this.encounter,
        value,
        this.basedOn,
        this.id,
        this.payload,
        this.about,
        this.occurrenceDateTime);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CommunicationRequest#basedOn() basedOn} attribute.
   * @param value The value for basedOn
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCommunicationRequest withBasedOn(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "basedOn");
    if (this.basedOn == newValue) return this;
    return new ImmutableCommunicationRequest(
        this.reasonReference,
        this.identifier,
        this.priority,
        this.replaces,
        this.status,
        this.subject,
        this.extension,
        this.groupIdentifier,
        this.meta,
        this.reasonCode,
        this.contained,
        this.category,
        this.recipient,
        this.resourceType,
        this.medium,
        this.modifierExtension,
        this.statusReason,
        this.doNotPerform,
        this.authoredOn,
        this.language,
        this.sender,
        this.occurrencePeriod,
        this.text,
        this.requester,
        this.implicitRules,
        this.encounter,
        this.note,
        newValue,
        this.id,
        this.payload,
        this.about,
        this.occurrenceDateTime);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CommunicationRequest#basedOn() basedOn} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for basedOn
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCommunicationRequest withBasedOn(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.basedOn == value) return this;
    return new ImmutableCommunicationRequest(
        this.reasonReference,
        this.identifier,
        this.priority,
        this.replaces,
        this.status,
        this.subject,
        this.extension,
        this.groupIdentifier,
        this.meta,
        this.reasonCode,
        this.contained,
        this.category,
        this.recipient,
        this.resourceType,
        this.medium,
        this.modifierExtension,
        this.statusReason,
        this.doNotPerform,
        this.authoredOn,
        this.language,
        this.sender,
        this.occurrencePeriod,
        this.text,
        this.requester,
        this.implicitRules,
        this.encounter,
        this.note,
        value,
        this.id,
        this.payload,
        this.about,
        this.occurrenceDateTime);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CommunicationRequest#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCommunicationRequest withId(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableCommunicationRequest(
        this.reasonReference,
        this.identifier,
        this.priority,
        this.replaces,
        this.status,
        this.subject,
        this.extension,
        this.groupIdentifier,
        this.meta,
        this.reasonCode,
        this.contained,
        this.category,
        this.recipient,
        this.resourceType,
        this.medium,
        this.modifierExtension,
        this.statusReason,
        this.doNotPerform,
        this.authoredOn,
        this.language,
        this.sender,
        this.occurrencePeriod,
        this.text,
        this.requester,
        this.implicitRules,
        this.encounter,
        this.note,
        this.basedOn,
        newValue,
        this.payload,
        this.about,
        this.occurrenceDateTime);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CommunicationRequest#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCommunicationRequest withId(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableCommunicationRequest(
        this.reasonReference,
        this.identifier,
        this.priority,
        this.replaces,
        this.status,
        this.subject,
        this.extension,
        this.groupIdentifier,
        this.meta,
        this.reasonCode,
        this.contained,
        this.category,
        this.recipient,
        this.resourceType,
        this.medium,
        this.modifierExtension,
        this.statusReason,
        this.doNotPerform,
        this.authoredOn,
        this.language,
        this.sender,
        this.occurrencePeriod,
        this.text,
        this.requester,
        this.implicitRules,
        this.encounter,
        this.note,
        this.basedOn,
        value,
        this.payload,
        this.about,
        this.occurrenceDateTime);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CommunicationRequest#payload() payload} attribute.
   * @param value The value for payload
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCommunicationRequest withPayload(java.util.List<com.fhir.CommunicationRequest_Payload> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CommunicationRequest_Payload> newValue = java.util.Objects.requireNonNull(value, "payload");
    if (this.payload == newValue) return this;
    return new ImmutableCommunicationRequest(
        this.reasonReference,
        this.identifier,
        this.priority,
        this.replaces,
        this.status,
        this.subject,
        this.extension,
        this.groupIdentifier,
        this.meta,
        this.reasonCode,
        this.contained,
        this.category,
        this.recipient,
        this.resourceType,
        this.medium,
        this.modifierExtension,
        this.statusReason,
        this.doNotPerform,
        this.authoredOn,
        this.language,
        this.sender,
        this.occurrencePeriod,
        this.text,
        this.requester,
        this.implicitRules,
        this.encounter,
        this.note,
        this.basedOn,
        this.id,
        newValue,
        this.about,
        this.occurrenceDateTime);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CommunicationRequest#payload() payload} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for payload
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCommunicationRequest withPayload(java.util.Optional<? extends java.util.List<com.fhir.CommunicationRequest_Payload>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CommunicationRequest_Payload> value = optional.orElse(null);
    if (this.payload == value) return this;
    return new ImmutableCommunicationRequest(
        this.reasonReference,
        this.identifier,
        this.priority,
        this.replaces,
        this.status,
        this.subject,
        this.extension,
        this.groupIdentifier,
        this.meta,
        this.reasonCode,
        this.contained,
        this.category,
        this.recipient,
        this.resourceType,
        this.medium,
        this.modifierExtension,
        this.statusReason,
        this.doNotPerform,
        this.authoredOn,
        this.language,
        this.sender,
        this.occurrencePeriod,
        this.text,
        this.requester,
        this.implicitRules,
        this.encounter,
        this.note,
        this.basedOn,
        this.id,
        value,
        this.about,
        this.occurrenceDateTime);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CommunicationRequest#about() about} attribute.
   * @param value The value for about
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCommunicationRequest withAbout(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "about");
    if (this.about == newValue) return this;
    return new ImmutableCommunicationRequest(
        this.reasonReference,
        this.identifier,
        this.priority,
        this.replaces,
        this.status,
        this.subject,
        this.extension,
        this.groupIdentifier,
        this.meta,
        this.reasonCode,
        this.contained,
        this.category,
        this.recipient,
        this.resourceType,
        this.medium,
        this.modifierExtension,
        this.statusReason,
        this.doNotPerform,
        this.authoredOn,
        this.language,
        this.sender,
        this.occurrencePeriod,
        this.text,
        this.requester,
        this.implicitRules,
        this.encounter,
        this.note,
        this.basedOn,
        this.id,
        this.payload,
        newValue,
        this.occurrenceDateTime);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CommunicationRequest#about() about} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for about
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCommunicationRequest withAbout(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.about == value) return this;
    return new ImmutableCommunicationRequest(
        this.reasonReference,
        this.identifier,
        this.priority,
        this.replaces,
        this.status,
        this.subject,
        this.extension,
        this.groupIdentifier,
        this.meta,
        this.reasonCode,
        this.contained,
        this.category,
        this.recipient,
        this.resourceType,
        this.medium,
        this.modifierExtension,
        this.statusReason,
        this.doNotPerform,
        this.authoredOn,
        this.language,
        this.sender,
        this.occurrencePeriod,
        this.text,
        this.requester,
        this.implicitRules,
        this.encounter,
        this.note,
        this.basedOn,
        this.id,
        this.payload,
        value,
        this.occurrenceDateTime);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CommunicationRequest#occurrenceDateTime() occurrenceDateTime} attribute.
   * @param value The value for occurrenceDateTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCommunicationRequest withOccurrenceDateTime(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "occurrenceDateTime");
    if (java.util.Objects.equals(this.occurrenceDateTime, newValue)) return this;
    return new ImmutableCommunicationRequest(
        this.reasonReference,
        this.identifier,
        this.priority,
        this.replaces,
        this.status,
        this.subject,
        this.extension,
        this.groupIdentifier,
        this.meta,
        this.reasonCode,
        this.contained,
        this.category,
        this.recipient,
        this.resourceType,
        this.medium,
        this.modifierExtension,
        this.statusReason,
        this.doNotPerform,
        this.authoredOn,
        this.language,
        this.sender,
        this.occurrencePeriod,
        this.text,
        this.requester,
        this.implicitRules,
        this.encounter,
        this.note,
        this.basedOn,
        this.id,
        this.payload,
        this.about,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CommunicationRequest#occurrenceDateTime() occurrenceDateTime} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for occurrenceDateTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCommunicationRequest withOccurrenceDateTime(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.occurrenceDateTime, value)) return this;
    return new ImmutableCommunicationRequest(
        this.reasonReference,
        this.identifier,
        this.priority,
        this.replaces,
        this.status,
        this.subject,
        this.extension,
        this.groupIdentifier,
        this.meta,
        this.reasonCode,
        this.contained,
        this.category,
        this.recipient,
        this.resourceType,
        this.medium,
        this.modifierExtension,
        this.statusReason,
        this.doNotPerform,
        this.authoredOn,
        this.language,
        this.sender,
        this.occurrencePeriod,
        this.text,
        this.requester,
        this.implicitRules,
        this.encounter,
        this.note,
        this.basedOn,
        this.id,
        this.payload,
        this.about,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableCommunicationRequest} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableCommunicationRequest
        && equalTo((ImmutableCommunicationRequest) another);
  }

  private boolean equalTo(ImmutableCommunicationRequest another) {
    return java.util.Objects.equals(reasonReference, another.reasonReference)
        && java.util.Objects.equals(identifier, another.identifier)
        && java.util.Objects.equals(priority, another.priority)
        && java.util.Objects.equals(replaces, another.replaces)
        && java.util.Objects.equals(status, another.status)
        && java.util.Objects.equals(subject, another.subject)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(groupIdentifier, another.groupIdentifier)
        && java.util.Objects.equals(meta, another.meta)
        && java.util.Objects.equals(reasonCode, another.reasonCode)
        && java.util.Objects.equals(contained, another.contained)
        && java.util.Objects.equals(category, another.category)
        && java.util.Objects.equals(recipient, another.recipient)
        && resourceType.equals(another.resourceType)
        && java.util.Objects.equals(medium, another.medium)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(statusReason, another.statusReason)
        && java.util.Objects.equals(doNotPerform, another.doNotPerform)
        && java.util.Objects.equals(authoredOn, another.authoredOn)
        && java.util.Objects.equals(language, another.language)
        && java.util.Objects.equals(sender, another.sender)
        && java.util.Objects.equals(occurrencePeriod, another.occurrencePeriod)
        && java.util.Objects.equals(text, another.text)
        && java.util.Objects.equals(requester, another.requester)
        && java.util.Objects.equals(implicitRules, another.implicitRules)
        && java.util.Objects.equals(encounter, another.encounter)
        && java.util.Objects.equals(note, another.note)
        && java.util.Objects.equals(basedOn, another.basedOn)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(payload, another.payload)
        && java.util.Objects.equals(about, another.about)
        && java.util.Objects.equals(occurrenceDateTime, another.occurrenceDateTime);
  }

  /**
   * Computes a hash code from attributes: {@code reasonReference}, {@code identifier}, {@code priority}, {@code replaces}, {@code status}, {@code subject}, {@code extension}, {@code groupIdentifier}, {@code meta}, {@code reasonCode}, {@code contained}, {@code category}, {@code recipient}, {@code resourceType}, {@code medium}, {@code modifierExtension}, {@code statusReason}, {@code doNotPerform}, {@code authoredOn}, {@code language}, {@code sender}, {@code occurrencePeriod}, {@code text}, {@code requester}, {@code implicitRules}, {@code encounter}, {@code note}, {@code basedOn}, {@code id}, {@code payload}, {@code about}, {@code occurrenceDateTime}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(reasonReference);
    h += (h << 5) + java.util.Objects.hashCode(identifier);
    h += (h << 5) + java.util.Objects.hashCode(priority);
    h += (h << 5) + java.util.Objects.hashCode(replaces);
    h += (h << 5) + java.util.Objects.hashCode(status);
    h += (h << 5) + java.util.Objects.hashCode(subject);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(groupIdentifier);
    h += (h << 5) + java.util.Objects.hashCode(meta);
    h += (h << 5) + java.util.Objects.hashCode(reasonCode);
    h += (h << 5) + java.util.Objects.hashCode(contained);
    h += (h << 5) + java.util.Objects.hashCode(category);
    h += (h << 5) + java.util.Objects.hashCode(recipient);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(medium);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(statusReason);
    h += (h << 5) + java.util.Objects.hashCode(doNotPerform);
    h += (h << 5) + java.util.Objects.hashCode(authoredOn);
    h += (h << 5) + java.util.Objects.hashCode(language);
    h += (h << 5) + java.util.Objects.hashCode(sender);
    h += (h << 5) + java.util.Objects.hashCode(occurrencePeriod);
    h += (h << 5) + java.util.Objects.hashCode(text);
    h += (h << 5) + java.util.Objects.hashCode(requester);
    h += (h << 5) + java.util.Objects.hashCode(implicitRules);
    h += (h << 5) + java.util.Objects.hashCode(encounter);
    h += (h << 5) + java.util.Objects.hashCode(note);
    h += (h << 5) + java.util.Objects.hashCode(basedOn);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(payload);
    h += (h << 5) + java.util.Objects.hashCode(about);
    h += (h << 5) + java.util.Objects.hashCode(occurrenceDateTime);
    return h;
  }

  /**
   * Prints the immutable value {@code CommunicationRequest} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("CommunicationRequest{");
    if (reasonReference != null) {
      builder.append("reasonReference=").append(reasonReference);
    }
    if (identifier != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (priority != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("priority=").append(priority);
    }
    if (replaces != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("replaces=").append(replaces);
    }
    if (status != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("status=").append(status);
    }
    if (subject != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("subject=").append(subject);
    }
    if (extension != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (groupIdentifier != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("groupIdentifier=").append(groupIdentifier);
    }
    if (meta != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (reasonCode != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("reasonCode=").append(reasonCode);
    }
    if (contained != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (category != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("category=").append(category);
    }
    if (recipient != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("recipient=").append(recipient);
    }
    if (builder.length() > 21) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (medium != null) {
      builder.append(", ");
      builder.append("medium=").append(medium);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (statusReason != null) {
      builder.append(", ");
      builder.append("statusReason=").append(statusReason);
    }
    if (doNotPerform != null) {
      builder.append(", ");
      builder.append("doNotPerform=").append(doNotPerform);
    }
    if (authoredOn != null) {
      builder.append(", ");
      builder.append("authoredOn=").append(authoredOn);
    }
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (sender != null) {
      builder.append(", ");
      builder.append("sender=").append(sender);
    }
    if (occurrencePeriod != null) {
      builder.append(", ");
      builder.append("occurrencePeriod=").append(occurrencePeriod);
    }
    if (text != null) {
      builder.append(", ");
      builder.append("text=").append(text);
    }
    if (requester != null) {
      builder.append(", ");
      builder.append("requester=").append(requester);
    }
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (encounter != null) {
      builder.append(", ");
      builder.append("encounter=").append(encounter);
    }
    if (note != null) {
      builder.append(", ");
      builder.append("note=").append(note);
    }
    if (basedOn != null) {
      builder.append(", ");
      builder.append("basedOn=").append(basedOn);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (payload != null) {
      builder.append(", ");
      builder.append("payload=").append(payload);
    }
    if (about != null) {
      builder.append(", ");
      builder.append("about=").append(about);
    }
    if (occurrenceDateTime != null) {
      builder.append(", ");
      builder.append("occurrenceDateTime=").append(occurrenceDateTime);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "CommunicationRequest", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.CommunicationRequest {
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> reasonReference = java.util.Optional.empty();
    boolean reasonReferenceIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Identifier>> identifier = java.util.Optional.empty();
    boolean identifierIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> priority = java.util.Optional.empty();
    boolean priorityIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> replaces = java.util.Optional.empty();
    boolean replacesIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> status = java.util.Optional.empty();
    boolean statusIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> subject = java.util.Optional.empty();
    boolean subjectIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Identifier> groupIdentifier = java.util.Optional.empty();
    boolean groupIdentifierIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Meta> meta = java.util.Optional.empty();
    boolean metaIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> reasonCode = java.util.Optional.empty();
    boolean reasonCodeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ResourceList>> contained = java.util.Optional.empty();
    boolean containedIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> category = java.util.Optional.empty();
    boolean categoryIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> recipient = java.util.Optional.empty();
    boolean recipientIsSet;
    @javax.annotation.Nullable java.lang.String resourceType;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> medium = java.util.Optional.empty();
    boolean mediumIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> statusReason = java.util.Optional.empty();
    boolean statusReasonIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.Boolean> doNotPerform = java.util.Optional.empty();
    boolean doNotPerformIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.dateTime> authoredOn = java.util.Optional.empty();
    boolean authoredOnIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> language = java.util.Optional.empty();
    boolean languageIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> sender = java.util.Optional.empty();
    boolean senderIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Period> occurrencePeriod = java.util.Optional.empty();
    boolean occurrencePeriodIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Narrative> text = java.util.Optional.empty();
    boolean textIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> requester = java.util.Optional.empty();
    boolean requesterIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> implicitRules = java.util.Optional.empty();
    boolean implicitRulesIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> encounter = java.util.Optional.empty();
    boolean encounterIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Annotation>> note = java.util.Optional.empty();
    boolean noteIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> basedOn = java.util.Optional.empty();
    boolean basedOnIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CommunicationRequest_Payload>> payload = java.util.Optional.empty();
    boolean payloadIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> about = java.util.Optional.empty();
    boolean aboutIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> occurrenceDateTime = java.util.Optional.empty();
    boolean occurrenceDateTimeIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("reasonReference")
    public void setReasonReference(java.util.Optional<java.util.List<com.fhir.Reference>> reasonReference) {
      this.reasonReference = reasonReference;
      this.reasonReferenceIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    public void setIdentifier(java.util.Optional<java.util.List<com.fhir.Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("priority")
    public void setPriority(java.util.Optional<com.fhir.code> priority) {
      this.priority = priority;
      this.priorityIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("replaces")
    public void setReplaces(java.util.Optional<java.util.List<com.fhir.Reference>> replaces) {
      this.replaces = replaces;
      this.replacesIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public void setStatus(java.util.Optional<com.fhir.code> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("subject")
    public void setSubject(java.util.Optional<com.fhir.Reference> subject) {
      this.subject = subject;
      this.subjectIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("groupIdentifier")
    public void setGroupIdentifier(java.util.Optional<com.fhir.Identifier> groupIdentifier) {
      this.groupIdentifier = groupIdentifier;
      this.groupIdentifierIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("meta")
    public void setMeta(java.util.Optional<com.fhir.Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("reasonCode")
    public void setReasonCode(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> reasonCode) {
      this.reasonCode = reasonCode;
      this.reasonCodeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("contained")
    public void setContained(java.util.Optional<java.util.List<com.fhir.ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("category")
    public void setCategory(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> category) {
      this.category = category;
      this.categoryIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("recipient")
    public void setRecipient(java.util.Optional<java.util.List<com.fhir.Reference>> recipient) {
      this.recipient = recipient;
      this.recipientIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public void setResourceType(java.lang.String resourceType) {
      this.resourceType = resourceType;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("medium")
    public void setMedium(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> medium) {
      this.medium = medium;
      this.mediumIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("statusReason")
    public void setStatusReason(java.util.Optional<com.fhir.CodeableConcept> statusReason) {
      this.statusReason = statusReason;
      this.statusReasonIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("doNotPerform")
    public void setDoNotPerform(java.util.Optional<java.lang.Boolean> doNotPerform) {
      this.doNotPerform = doNotPerform;
      this.doNotPerformIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("authoredOn")
    public void setAuthoredOn(java.util.Optional<com.fhir.dateTime> authoredOn) {
      this.authoredOn = authoredOn;
      this.authoredOnIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    public void setLanguage(java.util.Optional<com.fhir.code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("sender")
    public void setSender(java.util.Optional<com.fhir.Reference> sender) {
      this.sender = sender;
      this.senderIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("occurrencePeriod")
    public void setOccurrencePeriod(java.util.Optional<com.fhir.Period> occurrencePeriod) {
      this.occurrencePeriod = occurrencePeriod;
      this.occurrencePeriodIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    public void setText(java.util.Optional<com.fhir.Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("requester")
    public void setRequester(java.util.Optional<com.fhir.Reference> requester) {
      this.requester = requester;
      this.requesterIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
    public void setImplicitRules(java.util.Optional<com.fhir.uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("encounter")
    public void setEncounter(java.util.Optional<com.fhir.Reference> encounter) {
      this.encounter = encounter;
      this.encounterIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("note")
    public void setNote(java.util.Optional<java.util.List<com.fhir.Annotation>> note) {
      this.note = note;
      this.noteIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("basedOn")
    public void setBasedOn(java.util.Optional<java.util.List<com.fhir.Reference>> basedOn) {
      this.basedOn = basedOn;
      this.basedOnIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<com.fhir.id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("payload")
    public void setPayload(java.util.Optional<java.util.List<com.fhir.CommunicationRequest_Payload>> payload) {
      this.payload = payload;
      this.payloadIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("about")
    public void setAbout(java.util.Optional<java.util.List<com.fhir.Reference>> about) {
      this.about = about;
      this.aboutIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("occurrenceDateTime")
    public void setOccurrenceDateTime(java.util.Optional<java.lang.String> occurrenceDateTime) {
      this.occurrenceDateTime = occurrenceDateTime;
      this.occurrenceDateTimeIsSet = true;
    }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> reasonReference() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> priority() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> replaces() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> status() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> subject() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Identifier> groupIdentifier() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> reasonCode() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> category() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> recipient() { throw new UnsupportedOperationException(); }
    @Override
    public java.lang.String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> medium() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> statusReason() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.Boolean> doNotPerform() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.dateTime> authoredOn() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> language() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> sender() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Period> occurrencePeriod() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> requester() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> encounter() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Annotation>> note() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> basedOn() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.id> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CommunicationRequest_Payload>> payload() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> about() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> occurrenceDateTime() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableCommunicationRequest fromJson(Json json) {
    ImmutableCommunicationRequest.Builder builder = ((ImmutableCommunicationRequest.Builder) ImmutableCommunicationRequest.builder());
    if (json.reasonReferenceIsSet) {
      builder.reasonReference(json.reasonReference);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.priorityIsSet) {
      builder.priority(json.priority);
    }
    if (json.replacesIsSet) {
      builder.replaces(json.replaces);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.subjectIsSet) {
      builder.subject(json.subject);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.groupIdentifierIsSet) {
      builder.groupIdentifier(json.groupIdentifier);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.reasonCodeIsSet) {
      builder.reasonCode(json.reasonCode);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.categoryIsSet) {
      builder.category(json.category);
    }
    if (json.recipientIsSet) {
      builder.recipient(json.recipient);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.mediumIsSet) {
      builder.medium(json.medium);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.statusReasonIsSet) {
      builder.statusReason(json.statusReason);
    }
    if (json.doNotPerformIsSet) {
      builder.doNotPerform(json.doNotPerform);
    }
    if (json.authoredOnIsSet) {
      builder.authoredOn(json.authoredOn);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.senderIsSet) {
      builder.sender(json.sender);
    }
    if (json.occurrencePeriodIsSet) {
      builder.occurrencePeriod(json.occurrencePeriod);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.requesterIsSet) {
      builder.requester(json.requester);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.encounterIsSet) {
      builder.encounter(json.encounter);
    }
    if (json.noteIsSet) {
      builder.note(json.note);
    }
    if (json.basedOnIsSet) {
      builder.basedOn(json.basedOn);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.payloadIsSet) {
      builder.payload(json.payload);
    }
    if (json.aboutIsSet) {
      builder.about(json.about);
    }
    if (json.occurrenceDateTimeIsSet) {
      builder.occurrenceDateTime(json.occurrenceDateTime);
    }
    return (ImmutableCommunicationRequest) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link CommunicationRequest} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable CommunicationRequest instance
   */
  public static CommunicationRequest copyOf(CommunicationRequest instance) {
    if (instance instanceof ImmutableCommunicationRequest) {
      return (ImmutableCommunicationRequest) instance;
    }
    return ((ImmutableCommunicationRequest.Builder) ImmutableCommunicationRequest.builder())
        .reasonReference(instance.reasonReference())
        .identifier(instance.identifier())
        .priority(instance.priority())
        .replaces(instance.replaces())
        .status(instance.status())
        .subject(instance.subject())
        .extension(instance.extension())
        .groupIdentifier(instance.groupIdentifier())
        .meta(instance.meta())
        .reasonCode(instance.reasonCode())
        .contained(instance.contained())
        .category(instance.category())
        .recipient(instance.recipient())
        .resourceType(instance.resourceType())
        .medium(instance.medium())
        .modifierExtension(instance.modifierExtension())
        .statusReason(instance.statusReason())
        .doNotPerform(instance.doNotPerform())
        .authoredOn(instance.authoredOn())
        .language(instance.language())
        .sender(instance.sender())
        .occurrencePeriod(instance.occurrencePeriod())
        .text(instance.text())
        .requester(instance.requester())
        .implicitRules(instance.implicitRules())
        .encounter(instance.encounter())
        .note(instance.note())
        .basedOn(instance.basedOn())
        .id(instance.id())
        .payload(instance.payload())
        .about(instance.about())
        .occurrenceDateTime(instance.occurrenceDateTime())
        .build();
  }

  /**
   * Creates a builder for {@link CommunicationRequest CommunicationRequest}.
   * <pre>
   * ImmutableCommunicationRequest.builder()
   *    .reasonReference(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link CommunicationRequest#reasonReference() reasonReference}
   *    .identifier(List&amp;lt;com.fhir.Identifier&amp;gt;) // optional {@link CommunicationRequest#identifier() identifier}
   *    .priority(com.fhir.code) // optional {@link CommunicationRequest#priority() priority}
   *    .replaces(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link CommunicationRequest#replaces() replaces}
   *    .status(com.fhir.code) // optional {@link CommunicationRequest#status() status}
   *    .subject(com.fhir.Reference) // optional {@link CommunicationRequest#subject() subject}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link CommunicationRequest#extension() extension}
   *    .groupIdentifier(com.fhir.Identifier) // optional {@link CommunicationRequest#groupIdentifier() groupIdentifier}
   *    .meta(com.fhir.Meta) // optional {@link CommunicationRequest#meta() meta}
   *    .reasonCode(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link CommunicationRequest#reasonCode() reasonCode}
   *    .contained(List&amp;lt;com.fhir.ResourceList&amp;gt;) // optional {@link CommunicationRequest#contained() contained}
   *    .category(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link CommunicationRequest#category() category}
   *    .recipient(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link CommunicationRequest#recipient() recipient}
   *    .resourceType(String) // required {@link CommunicationRequest#resourceType() resourceType}
   *    .medium(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link CommunicationRequest#medium() medium}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link CommunicationRequest#modifierExtension() modifierExtension}
   *    .statusReason(com.fhir.CodeableConcept) // optional {@link CommunicationRequest#statusReason() statusReason}
   *    .doNotPerform(Boolean) // optional {@link CommunicationRequest#doNotPerform() doNotPerform}
   *    .authoredOn(com.fhir.dateTime) // optional {@link CommunicationRequest#authoredOn() authoredOn}
   *    .language(com.fhir.code) // optional {@link CommunicationRequest#language() language}
   *    .sender(com.fhir.Reference) // optional {@link CommunicationRequest#sender() sender}
   *    .occurrencePeriod(com.fhir.Period) // optional {@link CommunicationRequest#occurrencePeriod() occurrencePeriod}
   *    .text(com.fhir.Narrative) // optional {@link CommunicationRequest#text() text}
   *    .requester(com.fhir.Reference) // optional {@link CommunicationRequest#requester() requester}
   *    .implicitRules(com.fhir.uri) // optional {@link CommunicationRequest#implicitRules() implicitRules}
   *    .encounter(com.fhir.Reference) // optional {@link CommunicationRequest#encounter() encounter}
   *    .note(List&amp;lt;com.fhir.Annotation&amp;gt;) // optional {@link CommunicationRequest#note() note}
   *    .basedOn(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link CommunicationRequest#basedOn() basedOn}
   *    .id(com.fhir.id) // optional {@link CommunicationRequest#id() id}
   *    .payload(List&amp;lt;com.fhir.CommunicationRequest_Payload&amp;gt;) // optional {@link CommunicationRequest#payload() payload}
   *    .about(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link CommunicationRequest#about() about}
   *    .occurrenceDateTime(String) // optional {@link CommunicationRequest#occurrenceDateTime() occurrenceDateTime}
   *    .build();
   * </pre>
   * @return A new CommunicationRequest builder
   */
  public static ResourceTypeBuildStage builder() {
    return new ImmutableCommunicationRequest.Builder();
  }

  /**
   * Builds instances of type {@link CommunicationRequest CommunicationRequest}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "CommunicationRequest", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long OPT_BIT_REASON_REFERENCE = 0x1L;
    private static final long OPT_BIT_IDENTIFIER = 0x2L;
    private static final long OPT_BIT_PRIORITY = 0x4L;
    private static final long OPT_BIT_REPLACES = 0x8L;
    private static final long OPT_BIT_STATUS = 0x10L;
    private static final long OPT_BIT_SUBJECT = 0x20L;
    private static final long OPT_BIT_EXTENSION = 0x40L;
    private static final long OPT_BIT_GROUP_IDENTIFIER = 0x80L;
    private static final long OPT_BIT_META = 0x100L;
    private static final long OPT_BIT_REASON_CODE = 0x200L;
    private static final long OPT_BIT_CONTAINED = 0x400L;
    private static final long OPT_BIT_CATEGORY = 0x800L;
    private static final long OPT_BIT_RECIPIENT = 0x1000L;
    private static final long OPT_BIT_MEDIUM = 0x2000L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x4000L;
    private static final long OPT_BIT_STATUS_REASON = 0x8000L;
    private static final long OPT_BIT_DO_NOT_PERFORM = 0x10000L;
    private static final long OPT_BIT_AUTHORED_ON = 0x20000L;
    private static final long OPT_BIT_LANGUAGE = 0x40000L;
    private static final long OPT_BIT_SENDER = 0x80000L;
    private static final long OPT_BIT_OCCURRENCE_PERIOD = 0x100000L;
    private static final long OPT_BIT_TEXT = 0x200000L;
    private static final long OPT_BIT_REQUESTER = 0x400000L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x800000L;
    private static final long OPT_BIT_ENCOUNTER = 0x1000000L;
    private static final long OPT_BIT_NOTE = 0x2000000L;
    private static final long OPT_BIT_BASED_ON = 0x4000000L;
    private static final long OPT_BIT_ID = 0x8000000L;
    private static final long OPT_BIT_PAYLOAD = 0x10000000L;
    private static final long OPT_BIT_ABOUT = 0x20000000L;
    private static final long OPT_BIT_OCCURRENCE_DATE_TIME = 0x40000000L;
    private long initBits = 0x1L;
    private long optBits;

    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> reasonReference;
    private @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
    private @javax.annotation.Nullable com.fhir.code priority;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> replaces;
    private @javax.annotation.Nullable com.fhir.code status;
    private @javax.annotation.Nullable com.fhir.Reference subject;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable com.fhir.Identifier groupIdentifier;
    private @javax.annotation.Nullable com.fhir.Meta meta;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> reasonCode;
    private @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> category;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> recipient;
    private @javax.annotation.Nullable java.lang.String resourceType;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> medium;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable com.fhir.CodeableConcept statusReason;
    private @javax.annotation.Nullable java.lang.Boolean doNotPerform;
    private @javax.annotation.Nullable com.fhir.dateTime authoredOn;
    private @javax.annotation.Nullable com.fhir.code language;
    private @javax.annotation.Nullable com.fhir.Reference sender;
    private @javax.annotation.Nullable com.fhir.Period occurrencePeriod;
    private @javax.annotation.Nullable com.fhir.Narrative text;
    private @javax.annotation.Nullable com.fhir.Reference requester;
    private @javax.annotation.Nullable com.fhir.uri implicitRules;
    private @javax.annotation.Nullable com.fhir.Reference encounter;
    private @javax.annotation.Nullable java.util.List<com.fhir.Annotation> note;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> basedOn;
    private @javax.annotation.Nullable com.fhir.id id;
    private @javax.annotation.Nullable java.util.List<com.fhir.CommunicationRequest_Payload> payload;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> about;
    private @javax.annotation.Nullable java.lang.String occurrenceDateTime;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link CommunicationRequest#reasonReference() reasonReference} to reasonReference.
     * @param reasonReference The value for reasonReference
     * @return {@code this} builder for chained invocation
     */
    public final Builder reasonReference(java.util.List<com.fhir.Reference> reasonReference) {
      checkNotIsSet(reasonReferenceIsSet(), "reasonReference");
      this.reasonReference = java.util.Objects.requireNonNull(reasonReference, "reasonReference");
      optBits |= OPT_BIT_REASON_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link CommunicationRequest#reasonReference() reasonReference} to reasonReference.
     * @param reasonReference The value for reasonReference
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("reasonReference")
    public final Builder reasonReference(java.util.Optional<? extends java.util.List<com.fhir.Reference>> reasonReference) {
      checkNotIsSet(reasonReferenceIsSet(), "reasonReference");
      this.reasonReference = reasonReference.orElse(null);
      optBits |= OPT_BIT_REASON_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link CommunicationRequest#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link CommunicationRequest#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link CommunicationRequest#priority() priority} to priority.
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
     * Initializes the optional value {@link CommunicationRequest#priority() priority} to priority.
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
     * Initializes the optional value {@link CommunicationRequest#replaces() replaces} to replaces.
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
     * Initializes the optional value {@link CommunicationRequest#replaces() replaces} to replaces.
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
     * Initializes the optional value {@link CommunicationRequest#status() status} to status.
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
     * Initializes the optional value {@link CommunicationRequest#status() status} to status.
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
     * Initializes the optional value {@link CommunicationRequest#subject() subject} to subject.
     * @param subject The value for subject
     * @return {@code this} builder for chained invocation
     */
    public final Builder subject(com.fhir.Reference subject) {
      checkNotIsSet(subjectIsSet(), "subject");
      this.subject = java.util.Objects.requireNonNull(subject, "subject");
      optBits |= OPT_BIT_SUBJECT;
      return this;
    }

    /**
     * Initializes the optional value {@link CommunicationRequest#subject() subject} to subject.
     * @param subject The value for subject
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("subject")
    public final Builder subject(java.util.Optional<? extends com.fhir.Reference> subject) {
      checkNotIsSet(subjectIsSet(), "subject");
      this.subject = subject.orElse(null);
      optBits |= OPT_BIT_SUBJECT;
      return this;
    }

    /**
     * Initializes the optional value {@link CommunicationRequest#extension() extension} to extension.
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
     * Initializes the optional value {@link CommunicationRequest#extension() extension} to extension.
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
     * Initializes the optional value {@link CommunicationRequest#groupIdentifier() groupIdentifier} to groupIdentifier.
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
     * Initializes the optional value {@link CommunicationRequest#groupIdentifier() groupIdentifier} to groupIdentifier.
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
     * Initializes the optional value {@link CommunicationRequest#meta() meta} to meta.
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
     * Initializes the optional value {@link CommunicationRequest#meta() meta} to meta.
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
     * Initializes the optional value {@link CommunicationRequest#reasonCode() reasonCode} to reasonCode.
     * @param reasonCode The value for reasonCode
     * @return {@code this} builder for chained invocation
     */
    public final Builder reasonCode(java.util.List<com.fhir.CodeableConcept> reasonCode) {
      checkNotIsSet(reasonCodeIsSet(), "reasonCode");
      this.reasonCode = java.util.Objects.requireNonNull(reasonCode, "reasonCode");
      optBits |= OPT_BIT_REASON_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link CommunicationRequest#reasonCode() reasonCode} to reasonCode.
     * @param reasonCode The value for reasonCode
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("reasonCode")
    public final Builder reasonCode(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> reasonCode) {
      checkNotIsSet(reasonCodeIsSet(), "reasonCode");
      this.reasonCode = reasonCode.orElse(null);
      optBits |= OPT_BIT_REASON_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link CommunicationRequest#contained() contained} to contained.
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
     * Initializes the optional value {@link CommunicationRequest#contained() contained} to contained.
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
     * Initializes the optional value {@link CommunicationRequest#category() category} to category.
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
     * Initializes the optional value {@link CommunicationRequest#category() category} to category.
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
     * Initializes the optional value {@link CommunicationRequest#recipient() recipient} to recipient.
     * @param recipient The value for recipient
     * @return {@code this} builder for chained invocation
     */
    public final Builder recipient(java.util.List<com.fhir.Reference> recipient) {
      checkNotIsSet(recipientIsSet(), "recipient");
      this.recipient = java.util.Objects.requireNonNull(recipient, "recipient");
      optBits |= OPT_BIT_RECIPIENT;
      return this;
    }

    /**
     * Initializes the optional value {@link CommunicationRequest#recipient() recipient} to recipient.
     * @param recipient The value for recipient
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("recipient")
    public final Builder recipient(java.util.Optional<? extends java.util.List<com.fhir.Reference>> recipient) {
      checkNotIsSet(recipientIsSet(), "recipient");
      this.recipient = recipient.orElse(null);
      optBits |= OPT_BIT_RECIPIENT;
      return this;
    }

    /**
     * Initializes the value for the {@link CommunicationRequest#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link CommunicationRequest#medium() medium} to medium.
     * @param medium The value for medium
     * @return {@code this} builder for chained invocation
     */
    public final Builder medium(java.util.List<com.fhir.CodeableConcept> medium) {
      checkNotIsSet(mediumIsSet(), "medium");
      this.medium = java.util.Objects.requireNonNull(medium, "medium");
      optBits |= OPT_BIT_MEDIUM;
      return this;
    }

    /**
     * Initializes the optional value {@link CommunicationRequest#medium() medium} to medium.
     * @param medium The value for medium
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("medium")
    public final Builder medium(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> medium) {
      checkNotIsSet(mediumIsSet(), "medium");
      this.medium = medium.orElse(null);
      optBits |= OPT_BIT_MEDIUM;
      return this;
    }

    /**
     * Initializes the optional value {@link CommunicationRequest#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link CommunicationRequest#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link CommunicationRequest#statusReason() statusReason} to statusReason.
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
     * Initializes the optional value {@link CommunicationRequest#statusReason() statusReason} to statusReason.
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
     * Initializes the optional value {@link CommunicationRequest#doNotPerform() doNotPerform} to doNotPerform.
     * @param doNotPerform The value for doNotPerform
     * @return {@code this} builder for chained invocation
     */
    public final Builder doNotPerform(boolean doNotPerform) {
      checkNotIsSet(doNotPerformIsSet(), "doNotPerform");
      this.doNotPerform = doNotPerform;
      optBits |= OPT_BIT_DO_NOT_PERFORM;
      return this;
    }

    /**
     * Initializes the optional value {@link CommunicationRequest#doNotPerform() doNotPerform} to doNotPerform.
     * @param doNotPerform The value for doNotPerform
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("doNotPerform")
    public final Builder doNotPerform(java.util.Optional<java.lang.Boolean> doNotPerform) {
      checkNotIsSet(doNotPerformIsSet(), "doNotPerform");
      this.doNotPerform = doNotPerform.orElse(null);
      optBits |= OPT_BIT_DO_NOT_PERFORM;
      return this;
    }

    /**
     * Initializes the optional value {@link CommunicationRequest#authoredOn() authoredOn} to authoredOn.
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
     * Initializes the optional value {@link CommunicationRequest#authoredOn() authoredOn} to authoredOn.
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
     * Initializes the optional value {@link CommunicationRequest#language() language} to language.
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
     * Initializes the optional value {@link CommunicationRequest#language() language} to language.
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
     * Initializes the optional value {@link CommunicationRequest#sender() sender} to sender.
     * @param sender The value for sender
     * @return {@code this} builder for chained invocation
     */
    public final Builder sender(com.fhir.Reference sender) {
      checkNotIsSet(senderIsSet(), "sender");
      this.sender = java.util.Objects.requireNonNull(sender, "sender");
      optBits |= OPT_BIT_SENDER;
      return this;
    }

    /**
     * Initializes the optional value {@link CommunicationRequest#sender() sender} to sender.
     * @param sender The value for sender
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sender")
    public final Builder sender(java.util.Optional<? extends com.fhir.Reference> sender) {
      checkNotIsSet(senderIsSet(), "sender");
      this.sender = sender.orElse(null);
      optBits |= OPT_BIT_SENDER;
      return this;
    }

    /**
     * Initializes the optional value {@link CommunicationRequest#occurrencePeriod() occurrencePeriod} to occurrencePeriod.
     * @param occurrencePeriod The value for occurrencePeriod
     * @return {@code this} builder for chained invocation
     */
    public final Builder occurrencePeriod(com.fhir.Period occurrencePeriod) {
      checkNotIsSet(occurrencePeriodIsSet(), "occurrencePeriod");
      this.occurrencePeriod = java.util.Objects.requireNonNull(occurrencePeriod, "occurrencePeriod");
      optBits |= OPT_BIT_OCCURRENCE_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link CommunicationRequest#occurrencePeriod() occurrencePeriod} to occurrencePeriod.
     * @param occurrencePeriod The value for occurrencePeriod
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("occurrencePeriod")
    public final Builder occurrencePeriod(java.util.Optional<? extends com.fhir.Period> occurrencePeriod) {
      checkNotIsSet(occurrencePeriodIsSet(), "occurrencePeriod");
      this.occurrencePeriod = occurrencePeriod.orElse(null);
      optBits |= OPT_BIT_OCCURRENCE_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link CommunicationRequest#text() text} to text.
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
     * Initializes the optional value {@link CommunicationRequest#text() text} to text.
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
     * Initializes the optional value {@link CommunicationRequest#requester() requester} to requester.
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
     * Initializes the optional value {@link CommunicationRequest#requester() requester} to requester.
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
     * Initializes the optional value {@link CommunicationRequest#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link CommunicationRequest#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link CommunicationRequest#encounter() encounter} to encounter.
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
     * Initializes the optional value {@link CommunicationRequest#encounter() encounter} to encounter.
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
     * Initializes the optional value {@link CommunicationRequest#note() note} to note.
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
     * Initializes the optional value {@link CommunicationRequest#note() note} to note.
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
     * Initializes the optional value {@link CommunicationRequest#basedOn() basedOn} to basedOn.
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
     * Initializes the optional value {@link CommunicationRequest#basedOn() basedOn} to basedOn.
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
     * Initializes the optional value {@link CommunicationRequest#id() id} to id.
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
     * Initializes the optional value {@link CommunicationRequest#id() id} to id.
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
     * Initializes the optional value {@link CommunicationRequest#payload() payload} to payload.
     * @param payload The value for payload
     * @return {@code this} builder for chained invocation
     */
    public final Builder payload(java.util.List<com.fhir.CommunicationRequest_Payload> payload) {
      checkNotIsSet(payloadIsSet(), "payload");
      this.payload = java.util.Objects.requireNonNull(payload, "payload");
      optBits |= OPT_BIT_PAYLOAD;
      return this;
    }

    /**
     * Initializes the optional value {@link CommunicationRequest#payload() payload} to payload.
     * @param payload The value for payload
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("payload")
    public final Builder payload(java.util.Optional<? extends java.util.List<com.fhir.CommunicationRequest_Payload>> payload) {
      checkNotIsSet(payloadIsSet(), "payload");
      this.payload = payload.orElse(null);
      optBits |= OPT_BIT_PAYLOAD;
      return this;
    }

    /**
     * Initializes the optional value {@link CommunicationRequest#about() about} to about.
     * @param about The value for about
     * @return {@code this} builder for chained invocation
     */
    public final Builder about(java.util.List<com.fhir.Reference> about) {
      checkNotIsSet(aboutIsSet(), "about");
      this.about = java.util.Objects.requireNonNull(about, "about");
      optBits |= OPT_BIT_ABOUT;
      return this;
    }

    /**
     * Initializes the optional value {@link CommunicationRequest#about() about} to about.
     * @param about The value for about
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("about")
    public final Builder about(java.util.Optional<? extends java.util.List<com.fhir.Reference>> about) {
      checkNotIsSet(aboutIsSet(), "about");
      this.about = about.orElse(null);
      optBits |= OPT_BIT_ABOUT;
      return this;
    }

    /**
     * Initializes the optional value {@link CommunicationRequest#occurrenceDateTime() occurrenceDateTime} to occurrenceDateTime.
     * @param occurrenceDateTime The value for occurrenceDateTime
     * @return {@code this} builder for chained invocation
     */
    public final Builder occurrenceDateTime(java.lang.String occurrenceDateTime) {
      checkNotIsSet(occurrenceDateTimeIsSet(), "occurrenceDateTime");
      this.occurrenceDateTime = java.util.Objects.requireNonNull(occurrenceDateTime, "occurrenceDateTime");
      optBits |= OPT_BIT_OCCURRENCE_DATE_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link CommunicationRequest#occurrenceDateTime() occurrenceDateTime} to occurrenceDateTime.
     * @param occurrenceDateTime The value for occurrenceDateTime
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("occurrenceDateTime")
    public final Builder occurrenceDateTime(java.util.Optional<java.lang.String> occurrenceDateTime) {
      checkNotIsSet(occurrenceDateTimeIsSet(), "occurrenceDateTime");
      this.occurrenceDateTime = occurrenceDateTime.orElse(null);
      optBits |= OPT_BIT_OCCURRENCE_DATE_TIME;
      return this;
    }

    /**
     * Builds a new {@link CommunicationRequest CommunicationRequest}.
     * @return An immutable instance of CommunicationRequest
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.CommunicationRequest build() {
      checkRequiredAttributes();
      return new ImmutableCommunicationRequest(
          reasonReference,
          identifier,
          priority,
          replaces,
          status,
          subject,
          extension,
          groupIdentifier,
          meta,
          reasonCode,
          contained,
          category,
          recipient,
          resourceType,
          medium,
          modifierExtension,
          statusReason,
          doNotPerform,
          authoredOn,
          language,
          sender,
          occurrencePeriod,
          text,
          requester,
          implicitRules,
          encounter,
          note,
          basedOn,
          id,
          payload,
          about,
          occurrenceDateTime);
    }

    private boolean reasonReferenceIsSet() {
      return (optBits & OPT_BIT_REASON_REFERENCE) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean priorityIsSet() {
      return (optBits & OPT_BIT_PRIORITY) != 0;
    }

    private boolean replacesIsSet() {
      return (optBits & OPT_BIT_REPLACES) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean subjectIsSet() {
      return (optBits & OPT_BIT_SUBJECT) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean groupIdentifierIsSet() {
      return (optBits & OPT_BIT_GROUP_IDENTIFIER) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean reasonCodeIsSet() {
      return (optBits & OPT_BIT_REASON_CODE) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean categoryIsSet() {
      return (optBits & OPT_BIT_CATEGORY) != 0;
    }

    private boolean recipientIsSet() {
      return (optBits & OPT_BIT_RECIPIENT) != 0;
    }

    private boolean mediumIsSet() {
      return (optBits & OPT_BIT_MEDIUM) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean statusReasonIsSet() {
      return (optBits & OPT_BIT_STATUS_REASON) != 0;
    }

    private boolean doNotPerformIsSet() {
      return (optBits & OPT_BIT_DO_NOT_PERFORM) != 0;
    }

    private boolean authoredOnIsSet() {
      return (optBits & OPT_BIT_AUTHORED_ON) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean senderIsSet() {
      return (optBits & OPT_BIT_SENDER) != 0;
    }

    private boolean occurrencePeriodIsSet() {
      return (optBits & OPT_BIT_OCCURRENCE_PERIOD) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean requesterIsSet() {
      return (optBits & OPT_BIT_REQUESTER) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean encounterIsSet() {
      return (optBits & OPT_BIT_ENCOUNTER) != 0;
    }

    private boolean noteIsSet() {
      return (optBits & OPT_BIT_NOTE) != 0;
    }

    private boolean basedOnIsSet() {
      return (optBits & OPT_BIT_BASED_ON) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean payloadIsSet() {
      return (optBits & OPT_BIT_PAYLOAD) != 0;
    }

    private boolean aboutIsSet() {
      return (optBits & OPT_BIT_ABOUT) != 0;
    }

    private boolean occurrenceDateTimeIsSet() {
      return (optBits & OPT_BIT_OCCURRENCE_DATE_TIME) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of CommunicationRequest is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build CommunicationRequest, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "CommunicationRequest", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link CommunicationRequest#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(java.lang.String resourceType);
  }

  @org.immutables.value.Generated(from = "CommunicationRequest", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link CommunicationRequest#reasonReference() reasonReference} to reasonReference.
     * @param reasonReference The value for reasonReference
     * @return {@code this} builder for chained invocation
     */
    BuildFinal reasonReference(java.util.List<com.fhir.Reference> reasonReference);

    /**
     * Initializes the optional value {@link CommunicationRequest#reasonReference() reasonReference} to reasonReference.
     * @param reasonReference The value for reasonReference
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal reasonReference(java.util.Optional<? extends java.util.List<com.fhir.Reference>> reasonReference);

    /**
     * Initializes the optional value {@link CommunicationRequest#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(java.util.List<com.fhir.Identifier> identifier);

    /**
     * Initializes the optional value {@link CommunicationRequest#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> identifier);

    /**
     * Initializes the optional value {@link CommunicationRequest#priority() priority} to priority.
     * @param priority The value for priority
     * @return {@code this} builder for chained invocation
     */
    BuildFinal priority(com.fhir.code priority);

    /**
     * Initializes the optional value {@link CommunicationRequest#priority() priority} to priority.
     * @param priority The value for priority
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal priority(java.util.Optional<? extends com.fhir.code> priority);

    /**
     * Initializes the optional value {@link CommunicationRequest#replaces() replaces} to replaces.
     * @param replaces The value for replaces
     * @return {@code this} builder for chained invocation
     */
    BuildFinal replaces(java.util.List<com.fhir.Reference> replaces);

    /**
     * Initializes the optional value {@link CommunicationRequest#replaces() replaces} to replaces.
     * @param replaces The value for replaces
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal replaces(java.util.Optional<? extends java.util.List<com.fhir.Reference>> replaces);

    /**
     * Initializes the optional value {@link CommunicationRequest#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(com.fhir.code status);

    /**
     * Initializes the optional value {@link CommunicationRequest#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(java.util.Optional<? extends com.fhir.code> status);

    /**
     * Initializes the optional value {@link CommunicationRequest#subject() subject} to subject.
     * @param subject The value for subject
     * @return {@code this} builder for chained invocation
     */
    BuildFinal subject(com.fhir.Reference subject);

    /**
     * Initializes the optional value {@link CommunicationRequest#subject() subject} to subject.
     * @param subject The value for subject
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal subject(java.util.Optional<? extends com.fhir.Reference> subject);

    /**
     * Initializes the optional value {@link CommunicationRequest#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link CommunicationRequest#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Initializes the optional value {@link CommunicationRequest#groupIdentifier() groupIdentifier} to groupIdentifier.
     * @param groupIdentifier The value for groupIdentifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal groupIdentifier(com.fhir.Identifier groupIdentifier);

    /**
     * Initializes the optional value {@link CommunicationRequest#groupIdentifier() groupIdentifier} to groupIdentifier.
     * @param groupIdentifier The value for groupIdentifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal groupIdentifier(java.util.Optional<? extends com.fhir.Identifier> groupIdentifier);

    /**
     * Initializes the optional value {@link CommunicationRequest#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(com.fhir.Meta meta);

    /**
     * Initializes the optional value {@link CommunicationRequest#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(java.util.Optional<? extends com.fhir.Meta> meta);

    /**
     * Initializes the optional value {@link CommunicationRequest#reasonCode() reasonCode} to reasonCode.
     * @param reasonCode The value for reasonCode
     * @return {@code this} builder for chained invocation
     */
    BuildFinal reasonCode(java.util.List<com.fhir.CodeableConcept> reasonCode);

    /**
     * Initializes the optional value {@link CommunicationRequest#reasonCode() reasonCode} to reasonCode.
     * @param reasonCode The value for reasonCode
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal reasonCode(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> reasonCode);

    /**
     * Initializes the optional value {@link CommunicationRequest#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(java.util.List<com.fhir.ResourceList> contained);

    /**
     * Initializes the optional value {@link CommunicationRequest#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> contained);

    /**
     * Initializes the optional value {@link CommunicationRequest#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for chained invocation
     */
    BuildFinal category(java.util.List<com.fhir.CodeableConcept> category);

    /**
     * Initializes the optional value {@link CommunicationRequest#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal category(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> category);

    /**
     * Initializes the optional value {@link CommunicationRequest#recipient() recipient} to recipient.
     * @param recipient The value for recipient
     * @return {@code this} builder for chained invocation
     */
    BuildFinal recipient(java.util.List<com.fhir.Reference> recipient);

    /**
     * Initializes the optional value {@link CommunicationRequest#recipient() recipient} to recipient.
     * @param recipient The value for recipient
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal recipient(java.util.Optional<? extends java.util.List<com.fhir.Reference>> recipient);

    /**
     * Initializes the optional value {@link CommunicationRequest#medium() medium} to medium.
     * @param medium The value for medium
     * @return {@code this} builder for chained invocation
     */
    BuildFinal medium(java.util.List<com.fhir.CodeableConcept> medium);

    /**
     * Initializes the optional value {@link CommunicationRequest#medium() medium} to medium.
     * @param medium The value for medium
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal medium(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> medium);

    /**
     * Initializes the optional value {@link CommunicationRequest#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(java.util.List<com.fhir.Extension> modifierExtension);

    /**
     * Initializes the optional value {@link CommunicationRequest#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link CommunicationRequest#statusReason() statusReason} to statusReason.
     * @param statusReason The value for statusReason
     * @return {@code this} builder for chained invocation
     */
    BuildFinal statusReason(com.fhir.CodeableConcept statusReason);

    /**
     * Initializes the optional value {@link CommunicationRequest#statusReason() statusReason} to statusReason.
     * @param statusReason The value for statusReason
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal statusReason(java.util.Optional<? extends com.fhir.CodeableConcept> statusReason);

    /**
     * Initializes the optional value {@link CommunicationRequest#doNotPerform() doNotPerform} to doNotPerform.
     * @param doNotPerform The value for doNotPerform
     * @return {@code this} builder for chained invocation
     */
    BuildFinal doNotPerform(boolean doNotPerform);

    /**
     * Initializes the optional value {@link CommunicationRequest#doNotPerform() doNotPerform} to doNotPerform.
     * @param doNotPerform The value for doNotPerform
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal doNotPerform(java.util.Optional<java.lang.Boolean> doNotPerform);

    /**
     * Initializes the optional value {@link CommunicationRequest#authoredOn() authoredOn} to authoredOn.
     * @param authoredOn The value for authoredOn
     * @return {@code this} builder for chained invocation
     */
    BuildFinal authoredOn(com.fhir.dateTime authoredOn);

    /**
     * Initializes the optional value {@link CommunicationRequest#authoredOn() authoredOn} to authoredOn.
     * @param authoredOn The value for authoredOn
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal authoredOn(java.util.Optional<? extends com.fhir.dateTime> authoredOn);

    /**
     * Initializes the optional value {@link CommunicationRequest#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(com.fhir.code language);

    /**
     * Initializes the optional value {@link CommunicationRequest#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(java.util.Optional<? extends com.fhir.code> language);

    /**
     * Initializes the optional value {@link CommunicationRequest#sender() sender} to sender.
     * @param sender The value for sender
     * @return {@code this} builder for chained invocation
     */
    BuildFinal sender(com.fhir.Reference sender);

    /**
     * Initializes the optional value {@link CommunicationRequest#sender() sender} to sender.
     * @param sender The value for sender
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal sender(java.util.Optional<? extends com.fhir.Reference> sender);

    /**
     * Initializes the optional value {@link CommunicationRequest#occurrencePeriod() occurrencePeriod} to occurrencePeriod.
     * @param occurrencePeriod The value for occurrencePeriod
     * @return {@code this} builder for chained invocation
     */
    BuildFinal occurrencePeriod(com.fhir.Period occurrencePeriod);

    /**
     * Initializes the optional value {@link CommunicationRequest#occurrencePeriod() occurrencePeriod} to occurrencePeriod.
     * @param occurrencePeriod The value for occurrencePeriod
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal occurrencePeriod(java.util.Optional<? extends com.fhir.Period> occurrencePeriod);

    /**
     * Initializes the optional value {@link CommunicationRequest#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(com.fhir.Narrative text);

    /**
     * Initializes the optional value {@link CommunicationRequest#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(java.util.Optional<? extends com.fhir.Narrative> text);

    /**
     * Initializes the optional value {@link CommunicationRequest#requester() requester} to requester.
     * @param requester The value for requester
     * @return {@code this} builder for chained invocation
     */
    BuildFinal requester(com.fhir.Reference requester);

    /**
     * Initializes the optional value {@link CommunicationRequest#requester() requester} to requester.
     * @param requester The value for requester
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal requester(java.util.Optional<? extends com.fhir.Reference> requester);

    /**
     * Initializes the optional value {@link CommunicationRequest#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(com.fhir.uri implicitRules);

    /**
     * Initializes the optional value {@link CommunicationRequest#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(java.util.Optional<? extends com.fhir.uri> implicitRules);

    /**
     * Initializes the optional value {@link CommunicationRequest#encounter() encounter} to encounter.
     * @param encounter The value for encounter
     * @return {@code this} builder for chained invocation
     */
    BuildFinal encounter(com.fhir.Reference encounter);

    /**
     * Initializes the optional value {@link CommunicationRequest#encounter() encounter} to encounter.
     * @param encounter The value for encounter
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal encounter(java.util.Optional<? extends com.fhir.Reference> encounter);

    /**
     * Initializes the optional value {@link CommunicationRequest#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for chained invocation
     */
    BuildFinal note(java.util.List<com.fhir.Annotation> note);

    /**
     * Initializes the optional value {@link CommunicationRequest#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal note(java.util.Optional<? extends java.util.List<com.fhir.Annotation>> note);

    /**
     * Initializes the optional value {@link CommunicationRequest#basedOn() basedOn} to basedOn.
     * @param basedOn The value for basedOn
     * @return {@code this} builder for chained invocation
     */
    BuildFinal basedOn(java.util.List<com.fhir.Reference> basedOn);

    /**
     * Initializes the optional value {@link CommunicationRequest#basedOn() basedOn} to basedOn.
     * @param basedOn The value for basedOn
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal basedOn(java.util.Optional<? extends java.util.List<com.fhir.Reference>> basedOn);

    /**
     * Initializes the optional value {@link CommunicationRequest#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(com.fhir.id id);

    /**
     * Initializes the optional value {@link CommunicationRequest#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<? extends com.fhir.id> id);

    /**
     * Initializes the optional value {@link CommunicationRequest#payload() payload} to payload.
     * @param payload The value for payload
     * @return {@code this} builder for chained invocation
     */
    BuildFinal payload(java.util.List<com.fhir.CommunicationRequest_Payload> payload);

    /**
     * Initializes the optional value {@link CommunicationRequest#payload() payload} to payload.
     * @param payload The value for payload
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal payload(java.util.Optional<? extends java.util.List<com.fhir.CommunicationRequest_Payload>> payload);

    /**
     * Initializes the optional value {@link CommunicationRequest#about() about} to about.
     * @param about The value for about
     * @return {@code this} builder for chained invocation
     */
    BuildFinal about(java.util.List<com.fhir.Reference> about);

    /**
     * Initializes the optional value {@link CommunicationRequest#about() about} to about.
     * @param about The value for about
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal about(java.util.Optional<? extends java.util.List<com.fhir.Reference>> about);

    /**
     * Initializes the optional value {@link CommunicationRequest#occurrenceDateTime() occurrenceDateTime} to occurrenceDateTime.
     * @param occurrenceDateTime The value for occurrenceDateTime
     * @return {@code this} builder for chained invocation
     */
    BuildFinal occurrenceDateTime(java.lang.String occurrenceDateTime);

    /**
     * Initializes the optional value {@link CommunicationRequest#occurrenceDateTime() occurrenceDateTime} to occurrenceDateTime.
     * @param occurrenceDateTime The value for occurrenceDateTime
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal occurrenceDateTime(java.util.Optional<java.lang.String> occurrenceDateTime);

    /**
     * Builds a new {@link CommunicationRequest CommunicationRequest}.
     * @return An immutable instance of CommunicationRequest
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    CommunicationRequest build();
  }
}
